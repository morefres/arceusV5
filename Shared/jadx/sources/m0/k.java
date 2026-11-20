package m0;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public class k implements x0.a0<b, x0.b0<byte[]>> {

    public static class a {
        public static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    public static abstract class b {
        public static b c(x0.b0<Bitmap> b0Var, int i10) {
            return new m0.a(b0Var, i10);
        }

        public abstract int a();

        public abstract x0.b0<Bitmap> b();
    }

    public static int b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) ? 256 : 4101;
    }

    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<byte[]> apply(b bVar) {
        x0.b0<Bitmap> b10 = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b10.c().compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p0.g d10 = b10.d();
        Objects.requireNonNull(d10);
        return x0.b0.m(byteArray, d10, b(b10.c()), b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }
}
