package m0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e0 implements x0.a0<x0.b0<byte[]>, x0.b0<Bitmap>> {
    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<Bitmap> apply(x0.b0<byte[]> b0Var) {
        Rect b = b0Var.b();
        Bitmap b10 = b(b0Var.c(), b);
        p0.g d10 = b0Var.d();
        Objects.requireNonNull(d10);
        return x0.b0.j(b10, d10, new Rect(0, 0, b10.getWidth(), b10.getHeight()), b0Var.f(), p0.a0.v(b0Var.g(), b), b0Var.a());
    }

    public final Bitmap b(byte[] bArr, Rect rect) {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new g0.h1(1, "Failed to decode JPEG.", e10);
        }
    }
}
