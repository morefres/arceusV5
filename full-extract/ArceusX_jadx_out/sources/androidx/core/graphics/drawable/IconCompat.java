package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
/* loaded from: classes4.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    private static final String EXTRA_INT1 = "int1";
    private static final String EXTRA_INT2 = "int2";
    private static final String EXTRA_OBJ = "obj";
    private static final String EXTRA_TINT_LIST = "tint_list";
    private static final String EXTRA_TINT_MODE = "tint_mode";
    private static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_UNKNOWN = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] mData;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt2;
    Object mObj1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable mParcelable;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList mTintList = null;
    PorterDuff.Mode mTintMode = DEFAULT_TINT_MODE;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mTintModeStr;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mType;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.TAG, "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.TAG, "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.TAG, "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.TAG, "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.TAG, "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.TAG, "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.TAG, "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.TAG, "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.TAG, "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.TAG, "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.TAG, "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.TAG, "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Icon e(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.a) {
                case -1:
                    return (Icon) iconCompat.b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.h(), iconCompat.e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                    break;
                case 5:
                    createWithBitmap = b.a((Bitmap) iconCompat.b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        createWithBitmap = d.a(iconCompat.j());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.j());
                        }
                        InputStream k10 = iconCompat.k(context);
                        if (k10 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.j());
                        }
                        createWithBitmap = b.a(BitmapFactory.decodeStream(k10));
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public static IconCompat createWithResource(Context context, @DrawableRes int resId) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        return createWithResource(context.getResources(), context.getPackageName(), resId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static IconCompat createWithResource(Resources r8, String pkg, @DrawableRes int resId) {
        if (pkg == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (resId == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat rep = new IconCompat(2);
        rep.mInt1 = resId;
        if (r8 != null) {
            try {
                rep.mObj1 = r8.getResourceName(resId);
            } catch (Resources.NotFoundException e10) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            rep.mObj1 = pkg;
        }
        return rep;
    }

    public static IconCompat createWithBitmap(Bitmap bits) {
        if (bits == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat rep = new IconCompat(1);
        rep.mObj1 = bits;
        return rep;
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bits) {
        if (bits == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat rep = new IconCompat(5);
        rep.mObj1 = bits;
        return rep;
    }

    public static IconCompat createWithData(byte[] data, int offset, int length) {
        if (data == null) {
            throw new IllegalArgumentException("Data must not be null.");
        }
        IconCompat rep = new IconCompat(3);
        rep.mObj1 = data;
        rep.mInt1 = offset;
        rep.mInt2 = length;
        return rep;
    }

    public static IconCompat createWithContentUri(String uri) {
        if (uri == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat rep = new IconCompat(4);
        rep.mObj1 = uri;
        return rep;
    }

    public static IconCompat createWithContentUri(Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        return createWithContentUri(uri.toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
    }

    private IconCompat(int mType) {
        this.mType = mType;
    }

    public int getType() {
        int i10 = this.mType;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return getType((Icon) this.mObj1);
        }
        return i10;
    }

    @NonNull
    public String getResPackage() {
        int i10 = this.mType;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResPackage((Icon) this.mObj1);
        }
        if (i10 != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return ((String) this.mObj1).split(":", -1)[0];
    }

    @IdRes
    public int getResId() {
        int i10 = this.mType;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResId((Icon) this.mObj1);
        }
        if (i10 != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.mInt1;
    }

    @NonNull
    public Uri getUri() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            return getUri((Icon) this.mObj1);
        }
        return Uri.parse((String) this.mObj1);
    }

    public IconCompat setTint(@ColorInt int tint) {
        return setTintList(ColorStateList.valueOf(tint));
    }

    public IconCompat setTintList(ColorStateList tintList) {
        this.mTintList = tintList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    @RequiresApi(MotionEventCompat.AXIS_BRAKE)
    public Icon toIcon() {
        Icon icon;
        switch (this.mType) {
            case -1:
                return (Icon) this.mObj1;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.mObj1);
                break;
            case 2:
                icon = Icon.createWithResource(getResPackage(), this.mInt1);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.mObj1, this.mInt1, this.mInt2);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.mObj1);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.mObj1);
                    break;
                } else {
                    icon = Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
                    break;
                }
        }
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void checkResource(Context context) {
        if (this.mType == 2) {
            String resPackage = (String) this.mObj1;
            if (resPackage.contains(":")) {
                String resName = resPackage.split(":", -1)[1];
                String resType = resName.split("/", -1)[0];
                String resName2 = resName.split("/", -1)[1];
                String resPackage2 = resPackage.split(":", -1)[0];
                Resources res = getResources(context, resPackage2);
                int id2 = res.getIdentifier(resName2, resType, resPackage2);
                if (this.mInt1 != id2) {
                    Log.i(TAG, "Id has changed for " + resPackage2 + "/" + resName2);
                    this.mInt1 = id2;
                }
            }
        }
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return toIcon().loadDrawable(context);
        }
        Drawable result = loadDrawableInner(context);
        if (result != null && (this.mTintList != null || this.mTintMode != DEFAULT_TINT_MODE)) {
            result.mutate();
            DrawableCompat.setTintList(result, this.mTintList);
            DrawableCompat.setTintMode(result, this.mTintMode);
        }
        return result;
    }

    private Drawable loadDrawableInner(Context context) {
        switch (this.mType) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.mObj1);
            case 2:
                String resPackage = getResPackage();
                if (TextUtils.isEmpty(resPackage)) {
                    resPackage = context.getPackageName();
                }
                Resources res = getResources(context, resPackage);
                try {
                    return ResourcesCompat.getDrawable(res, this.mInt1, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e(TAG, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.mInt1), this.mObj1), e10);
                    return null;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.mObj1, this.mInt1, this.mInt2));
            case 4:
                Uri uri = Uri.parse((String) this.mObj1);
                String scheme = uri.getScheme();
                InputStream is2 = null;
                if ("content".equals(scheme) || "file".equals(scheme)) {
                    try {
                        is2 = context.getContentResolver().openInputStream(uri);
                    } catch (Exception e11) {
                        Log.w(TAG, "Unable to load image from URI: " + uri, e11);
                    }
                } else {
                    try {
                        is2 = new FileInputStream(new File((String) this.mObj1));
                    } catch (FileNotFoundException e12) {
                        Log.w(TAG, "Unable to load image from path: " + uri, e12);
                    }
                }
                if (is2 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(is2));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
            default:
                return null;
        }
    }

    private static Resources getResources(Context context, String resPackage) {
        if ("android".equals(resPackage)) {
            return Resources.getSystem();
        }
        PackageManager pm2 = context.getPackageManager();
        try {
            ApplicationInfo ai = pm2.getApplicationInfo(resPackage, 8192);
            if (ai != null) {
                return pm2.getResourcesForApplication(ai);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(TAG, String.format("Unable to find pkg=%s for icon", resPackage), e10);
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void addToShortcutIntent(@NonNull Intent outIntent, @Nullable Drawable badge, @NonNull Context c10) {
        Bitmap icon;
        Bitmap icon2;
        checkResource(c10);
        switch (this.mType) {
            case 1:
                icon2 = (Bitmap) this.mObj1;
                if (badge != null) {
                    icon2 = icon2.copy(icon2.getConfig(), true);
                    break;
                }
                break;
            case 2:
                try {
                    Context context = c10.createPackageContext(getResPackage(), 0);
                    if (badge == null) {
                        outIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, this.mInt1));
                        return;
                    }
                    Drawable dr2 = ContextCompat.getDrawable(context, this.mInt1);
                    if (dr2.getIntrinsicWidth() > 0 && dr2.getIntrinsicHeight() > 0) {
                        icon = Bitmap.createBitmap(dr2.getIntrinsicWidth(), dr2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        dr2.setBounds(0, 0, icon.getWidth(), icon.getHeight());
                        dr2.draw(new Canvas(icon));
                        icon2 = icon;
                        break;
                    }
                    int size = ((ActivityManager) context.getSystemService("activity")).getLauncherLargeIconSize();
                    icon = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
                    dr2.setBounds(0, 0, icon.getWidth(), icon.getHeight());
                    dr2.draw(new Canvas(icon));
                    icon2 = icon;
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException("Can't find package " + this.mObj1, e10);
                }
                break;
            case 3:
            case 4:
            default:
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            case 5:
                icon2 = createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
                break;
        }
        if (badge != null) {
            int w5 = icon2.getWidth();
            int h10 = icon2.getHeight();
            badge.setBounds(w5 / 2, h10 / 2, w5, h10);
            badge.draw(new Canvas(icon2));
        }
        outIntent.putExtra("android.intent.extra.shortcut.ICON", icon2);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable(EXTRA_OBJ, (Parcelable) this.mObj1);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(EXTRA_OBJ, (Bitmap) this.mObj1);
                break;
            case 2:
            case 4:
                bundle.putString(EXTRA_OBJ, (String) this.mObj1);
                break;
            case 3:
                bundle.putByteArray(EXTRA_OBJ, (byte[]) this.mObj1);
                break;
        }
        bundle.putInt("type", this.mType);
        bundle.putInt(EXTRA_INT1, this.mInt1);
        bundle.putInt(EXTRA_INT2, this.mInt2);
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
        }
        PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            bundle.putString(EXTRA_TINT_MODE, mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.mType == -1) {
            return String.valueOf(this.mObj1);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=").append(typeToString(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.mObj1).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.mObj1).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(getResPackage());
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb2.append(" off=");
                    sb2.append(this.mInt2);
                    break;
                }
                break;
            case 4:
                sb2.append(" uri=");
                sb2.append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sb2.append(" tint=");
            sb2.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sb2.append(" mode=");
            sb2.append(this.mTintMode);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean isStream) {
        this.mTintModeStr = this.mTintMode.name();
        switch (this.mType) {
            case -1:
                if (isStream) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (Parcelable) this.mObj1;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (isStream) {
                    Bitmap bitmap = (Bitmap) this.mObj1;
                    ByteArrayOutputStream data = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, data);
                    this.mData = data.toByteArray();
                    return;
                }
                this.mParcelable = (Parcelable) this.mObj1;
                return;
            case 2:
                this.mData = ((String) this.mObj1).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.mObj1;
                return;
            case 4:
                this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                Parcelable parcelable = this.mParcelable;
                if (parcelable != null) {
                    this.mObj1 = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.mObj1 = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.mObj1 = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
                this.mObj1 = new String(this.mData, Charset.forName("UTF-16"));
                return;
            case 3:
                this.mObj1 = this.mData;
                return;
        }
    }

    private static String typeToString(int x10) {
        switch (x10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @Nullable
    public static IconCompat createFromBundle(@NonNull Bundle bundle) {
        int type = bundle.getInt("type");
        IconCompat icon = new IconCompat(type);
        icon.mInt1 = bundle.getInt(EXTRA_INT1);
        icon.mInt2 = bundle.getInt(EXTRA_INT2);
        if (bundle.containsKey(EXTRA_TINT_LIST)) {
            icon.mTintList = (ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
        }
        if (bundle.containsKey(EXTRA_TINT_MODE)) {
            icon.mTintMode = PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
        }
        switch (type) {
            case -1:
            case 1:
            case 5:
                icon.mObj1 = bundle.getParcelable(EXTRA_OBJ);
                return icon;
            case 0:
            default:
                Log.w(TAG, "Unknown type " + type);
                return null;
            case 2:
            case 4:
                icon.mObj1 = bundle.getString(EXTRA_OBJ);
                return icon;
            case 3:
                icon.mObj1 = bundle.getByteArray(EXTRA_OBJ);
                return icon;
        }
    }

    @Nullable
    @RequiresApi(MotionEventCompat.AXIS_BRAKE)
    public static IconCompat createFromIcon(@NonNull Context context, @NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        switch (getType(icon)) {
            case 2:
                String resPackage = getResPackage(icon);
                try {
                    return createWithResource(getResources(context, resPackage), resPackage, getResId(icon));
                } catch (Resources.NotFoundException e10) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            case 3:
            default:
                IconCompat iconCompat = new IconCompat(-1);
                iconCompat.mObj1 = icon;
                return iconCompat;
            case 4:
                return createWithContentUri(getUri(icon));
        }
    }

    @Nullable
    @RequiresApi(MotionEventCompat.AXIS_BRAKE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static IconCompat createFromIcon(@NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        switch (getType(icon)) {
            case 2:
                return createWithResource(null, getResPackage(icon), getResId(icon));
            case 3:
            default:
                IconCompat iconCompat = new IconCompat(-1);
                iconCompat.mObj1 = icon;
                return iconCompat;
            case 4:
                return createWithContentUri(getUri(icon));
        }
    }

    @RequiresApi(MotionEventCompat.AXIS_BRAKE)
    private static int getType(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e(TAG, "Unable to get icon type " + icon, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e(TAG, "Unable to get icon type " + icon, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e(TAG, "Unable to get icon type " + icon, e12);
            return -1;
        }
    }

    @Nullable
    @RequiresApi(MotionEventCompat.AXIS_BRAKE)
    private static String getResPackage(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e(TAG, "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e(TAG, "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e(TAG, "Unable to get icon package", e12);
            return null;
        }
    }

    @DrawableRes
    @IdRes
    @RequiresApi(MotionEventCompat.AXIS_BRAKE)
    private static int getResId(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e(TAG, "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e(TAG, "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e(TAG, "Unable to get icon resource", e12);
            return 0;
        }
    }

    @Nullable
    @RequiresApi(MotionEventCompat.AXIS_BRAKE)
    private static Uri getUri(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e(TAG, "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e(TAG, "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e(TAG, "Unable to get icon uri", e12);
            return null;
        }
    }

    @VisibleForTesting
    static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap adaptiveIconBitmap, boolean addShadow) {
        int size = (int) (Math.min(adaptiveIconBitmap.getWidth(), adaptiveIconBitmap.getHeight()) * DEFAULT_VIEW_PORT_SCALE);
        Bitmap icon = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(icon);
        Paint paint = new Paint(3);
        float center = size * 0.5f;
        float radius = ICON_DIAMETER_FACTOR * center;
        if (addShadow) {
            float blur = size * BLUR_FACTOR;
            paint.setColor(0);
            paint.setShadowLayer(blur, 0.0f, size * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
            canvas.drawCircle(center, center, radius, paint);
            paint.setShadowLayer(blur, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(center, center, radius, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader shader = new BitmapShader(adaptiveIconBitmap, tileMode, tileMode);
        Matrix shift = new Matrix();
        shift.setTranslate((-(adaptiveIconBitmap.getWidth() - size)) / 2, (-(adaptiveIconBitmap.getHeight() - size)) / 2);
        shader.setLocalMatrix(shift);
        paint.setShader(shader);
        canvas.drawCircle(center, center, radius, paint);
        canvas.setBitmap(null);
        return icon;
    }
}
