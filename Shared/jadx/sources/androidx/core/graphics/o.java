package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import n2.e;
import v2.g;

/* loaded from: classes.dex */
public class o extends q {
    public static int m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.q
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(h(build2, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        try {
            FontFamily j10 = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (j10 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(j10).setStyle(h(j10, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface c(Context context, CancellationSignal cancellationSignal, List<g.b[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily j10 = j(cancellationSignal, list.get(0), contentResolver);
            if (j10 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(j10);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily j11 = j(cancellationSignal, list.get(i11), contentResolver);
                if (j11 != null) {
                    customFallbackBuilder.addCustomFallback(j11);
                }
            }
            return customFallbackBuilder.setStyle(h(j10, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public g.b g(g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font h(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m10 = m(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int m11 = m(fontStyle, font2.getStyle());
            if (m11 < m10) {
                font = font2;
                m10 = m11;
            }
        }
        return font;
    }

    public final Font i(CancellationSignal cancellationSignal, g.b bVar, ContentResolver contentResolver) {
        return bVar.i() ? l(bVar) : k(cancellationSignal, bVar, contentResolver);
    }

    public FontFamily j(CancellationSignal cancellationSignal, g.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (g.b bVar : bVarArr) {
            Font i10 = i(cancellationSignal, bVar, contentResolver);
            if (i10 != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(i10);
                } else {
                    builder.addFont(i10);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public final Font k(CancellationSignal cancellationSignal, g.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(bVar.e(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                    return null;
                }
                openFileDescriptor.close();
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(bVar.g()).setSlant(bVar.h() ? 1 : 0).setTtcIndex(bVar.d());
                if (!TextUtils.isEmpty(bVar.f())) {
                    ttcIndex.setFontVariationSettings(bVar.f());
                }
                Font build = ttcIndex.build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    public Font l(g.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
