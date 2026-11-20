package androidx.core.graphics;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import v2.g;

/* loaded from: classes.dex */
public class p extends o {
    public static Typeface n(String str) {
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    @Override // androidx.core.graphics.o
    public Font l(g.b bVar) {
        Typeface n10;
        Font j10;
        String c10 = bVar.c();
        if (c10 == null || (n10 = n(c10)) == null || (j10 = k.j(n10)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.f())) {
            return j10;
        }
        try {
            return new Font.Builder(j10).setFontVariationSettings(bVar.f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
