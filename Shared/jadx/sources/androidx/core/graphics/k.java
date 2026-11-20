package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import n2.e;
import n2.h;
import v2.g;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final q f1633a;
    public static final w1.i<String, Typeface> b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f1634c;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        public h.f f1635a;

        public a(h.f fVar) {
            this.f1635a = fVar;
        }

        @Override // v2.g.c
        public void a(int i10) {
            h.f fVar = this.f1635a;
            if (fVar != null) {
                fVar.f(i10);
            }
        }

        @Override // v2.g.c
        public void b(Typeface typeface) {
            h.f fVar = this.f1635a;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        n5.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f1633a = new p();
        } else if (i10 >= 29) {
            f1633a = new o();
        } else if (i10 >= 28) {
            f1633a = new n();
        } else {
            f1633a = new m();
        }
        b = new w1.i<>(16);
        f1634c = null;
        n5.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        n5.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f1633a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            n5.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<g.b[]> list, int i10) {
        n5.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f1633a.c(context, cancellationSignal, list, i10);
        } finally {
            n5.a.f();
        }
    }

    public static Typeface d(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.f fVar, Handler handler, boolean z10) {
        Typeface a10;
        if (bVar instanceof e.C0451e) {
            e.C0451e c0451e = (e.C0451e) bVar;
            Typeface i13 = i(c0451e);
            if (i13 != null) {
                if (fVar != null) {
                    fVar.d(i13, handler);
                }
                b.e(f(resources, i10, str, i11, i12), i13);
                return i13;
            }
            a10 = v2.g.c(context, c0451e.b(), i12, !z10 ? fVar != null : c0451e.a() != 0, z10 ? c0451e.d() : -1, h.f.e(handler), new a(fVar));
        } else {
            a10 = f1633a.a(context, (e.c) bVar, resources, i12);
            if (fVar != null) {
                if (a10 != null) {
                    fVar.d(a10, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (a10 != null) {
            b.e(f(resources, i10, str, i11, i12), a10);
        }
        return a10;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f1633a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            b.e(f(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    public static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return b.d(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Typeface i(e.C0451e c0451e) {
        FontFamily build;
        Typeface h10;
        String c10 = c0451e.c();
        if (!TextUtils.isEmpty(c10) && (h10 = h(c10)) != null) {
            return h10;
        }
        List<v2.e> b10 = c0451e.b();
        int i10 = 0;
        if (b10.size() == 1) {
            return h(b10.get(0).h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i11 = 0; i11 < b10.size(); i11++) {
            if (h(b10.get(i11).h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
        while (true) {
            if (i10 >= b10.size()) {
                break;
            }
            v2.e eVar = b10.get(i10);
            if (i10 == b10.size() - 1 && TextUtils.isEmpty(eVar.i())) {
                customFallbackBuilder.setSystemFallback(eVar.h());
                break;
            }
            Font j10 = j(h(eVar.h()));
            if (j10 == null) {
                Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar.h() + ". Falling back to provider font.");
                return null;
            }
            if (TextUtils.isEmpty(eVar.i())) {
                try {
                    i.a();
                    j.a();
                    build = g.a(f.a(j10).setFontVariationSettings(eVar.i()).build()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            } else {
                build = g.a(j10).build();
            }
            if (customFallbackBuilder == null) {
                customFallbackBuilder = h.a(build);
            } else {
                customFallbackBuilder.addCustomFallback(build);
            }
            i10++;
        }
        return customFallbackBuilder.build();
    }

    public static Font j(Typeface typeface) {
        if (f1634c == null) {
            f1634c = new Paint();
        }
        f1634c.setTextSize(10.0f);
        f1634c.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f1634c);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }
}
