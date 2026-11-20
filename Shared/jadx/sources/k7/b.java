package k7;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import f7.c;
import f7.k0;
import java.io.IOException;
import java.util.Map;
import s7.e;
import s7.m;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f22444d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f22445a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, k0> f22446c;

    public b(Drawable.Callback callback, String str, c cVar, Map<String, k0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str + '/';
        }
        this.f22446c = map;
        d(cVar);
        if (callback instanceof View) {
            this.f22445a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f22445a = null;
        }
    }

    public Bitmap a(String str) {
        k0 k0Var = this.f22446c.get(str);
        if (k0Var == null) {
            return null;
        }
        Bitmap b = k0Var.b();
        if (b != null) {
            return b;
        }
        Context context = this.f22445a;
        if (context == null) {
            return null;
        }
        String c10 = k0Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c10.startsWith("data:") && c10.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                try {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    if (decodeByteArray != null) {
                        return c(str, m.m(decodeByteArray, k0Var.f(), k0Var.d()));
                    }
                    e.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    e.d("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                e.d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.b + c10), null, options);
                if (decodeStream != null) {
                    return c(str, m.m(decodeStream, k0Var.f(), k0Var.d()));
                }
                e.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                e.d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            e.d("Unable to open asset.", e13);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f22445a == null;
        }
        if (this.f22445a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f22445a;
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (f22444d) {
            this.f22446c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public void d(c cVar) {
    }
}
