package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import n2.e;
import v2.g;

/* loaded from: classes.dex */
public class m extends l {

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f1640g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor<?> f1641h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f1642i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f1643j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f1644k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f1645l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f1646m;

    public m() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = u();
            constructor = v(cls);
            method = r(cls);
            method2 = s(cls);
            method3 = w(cls);
            method4 = q(cls);
            method5 = t(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1640g = cls;
        this.f1641h = constructor;
        this.f1642i = method;
        this.f1643j = method2;
        this.f1644k = method3;
        this.f1645l = method4;
        this.f1646m = method5;
    }

    @Override // androidx.core.graphics.l, androidx.core.graphics.q
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        if (!p()) {
            return super.a(context, cVar, resources, i10);
        }
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        e.d[] a10 = cVar.a();
        int length = a10.length;
        int i11 = 0;
        while (i11 < length) {
            e.d dVar = a10[i11];
            Context context2 = context;
            if (!m(context2, k10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(k10);
                return null;
            }
            i11++;
            context = context2;
        }
        if (o(k10)) {
            return i(k10);
        }
        return null;
    }

    @Override // androidx.core.graphics.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Typeface i11;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (p()) {
            Map<Uri, ByteBuffer> f10 = r.f(context, bVarArr, cancellationSignal);
            Object k10 = k();
            if (k10 == null) {
                return null;
            }
            int length = bVarArr.length;
            int i12 = 0;
            boolean z10 = false;
            while (i12 < length) {
                g.b bVar = bVarArr[i12];
                ByteBuffer byteBuffer = f10.get(bVar.e());
                if (byteBuffer == null) {
                    obj = k10;
                } else {
                    boolean n10 = n(k10, byteBuffer, bVar.d(), bVar.g(), bVar.h() ? 1 : 0);
                    obj = k10;
                    if (!n10) {
                        l(obj);
                        return null;
                    }
                    z10 = true;
                }
                i12++;
                k10 = obj;
                z10 = z10;
            }
            Object obj2 = k10;
            if (!z10) {
                l(obj2);
                return null;
            }
            if (o(obj2) && (i11 = i(obj2)) != null) {
                return Typeface.create(i11, i10);
            }
            return null;
        }
        g.b g10 = g(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g10.e(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g10.g()).setItalic(g10.h()).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.c(context, cancellationSignal, list, i10);
    }

    @Override // androidx.core.graphics.q
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!p()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        if (!m(context, k10, str, 0, -1, -1, null)) {
            l(k10);
            return null;
        }
        if (o(k10)) {
            return i(k10);
        }
        return null;
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1640g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1646m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object k() {
        try {
            return this.f1641h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void l(Object obj) {
        try {
            this.f1645l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1642i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f1643j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o(Object obj) {
        try {
            return ((Boolean) this.f1644k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p() {
        if (this.f1642i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1642i != null;
    }

    public Method q(Class<?> cls) {
        return cls.getMethod("abortCreation", null);
    }

    public Method r(Class<?> cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method s(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method t(Class<?> cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> u() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> v(Class<?> cls) {
        return cls.getConstructor(null);
    }

    public Method w(Class<?> cls) {
        return cls.getMethod("freeze", null);
    }
}
