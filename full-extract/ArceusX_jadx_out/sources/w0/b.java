package w0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.d;
import g0.r1;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import p0.i;
import p0.j;
import x2.g;

/* loaded from: classes.dex */
public final class b {

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC0626a f33608a;

        /* renamed from: w0.b$a$a, reason: collision with other inner class name */
        public enum EnumC0626a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public a(String str, EnumC0626a enumC0626a) {
            super(str);
            this.f33608a = enumC0626a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i10;
        if (!i(rational)) {
            r1.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f12) {
            int round = Math.round((f10 / numerator) * denominator);
            i10 = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f11 / denominator) * numerator);
            int i12 = (width - round2) / 2;
            width = round2;
            i10 = 0;
            i11 = i12;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    public static Bitmap b(androidx.camera.core.d dVar) {
        int format = dVar.getFormat();
        if (format == 1) {
            return e(dVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(dVar);
        }
        if (format == 256 || format == 4101) {
            return c(dVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    public static Bitmap c(androidx.camera.core.d dVar) {
        byte[] l10 = l(dVar);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(l10, 0, l10.length, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap d(d.a[] aVarArr, int i10, int i11) {
        g.b(aVarArr.length == 1, "Expect a single plane");
        g.b(aVarArr[0].m() == 4, "Expect pixelStride=4");
        g.b(aVarArr[0].l() == i10 * 4, "Expect rowStride=width*4");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVarArr[0].k().rewind();
        ImageProcessingUtil.j(createBitmap, aVarArr[0].k(), aVarArr[0].l());
        return createBitmap;
    }

    public static Bitmap e(androidx.camera.core.d dVar) {
        Bitmap createBitmap = Bitmap.createBitmap(dVar.getWidth(), dVar.getHeight(), Bitmap.Config.ARGB_8888);
        dVar.F1()[0].k().rewind();
        ImageProcessingUtil.j(createBitmap, dVar.F1()[0].k(), dVar.F1()[0].l());
        return createBitmap;
    }

    public static ByteBuffer f(Bitmap bitmap) {
        g.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static Rational g(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? h(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Rational h(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean i(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean j(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    public static boolean k(int i10) {
        return i10 == 32;
    }

    public static byte[] l(androidx.camera.core.d dVar) {
        if (!j(dVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        ByteBuffer k10 = dVar.F1()[0].k();
        byte[] bArr = new byte[k10.capacity()];
        k10.rewind();
        k10.get(bArr);
        return bArr;
    }

    public static Bitmap m(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] n(androidx.camera.core.d dVar, Rect rect, int i10, int i11) {
        if (dVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(o(dVar), 17, dVar.getWidth(), dVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = new j(byteArrayOutputStream, i.c(dVar, i11));
        if (rect == null) {
            rect = new Rect(0, 0, dVar.getWidth(), dVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, jVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0626a.ENCODE_FAILED);
    }

    public static byte[] o(androidx.camera.core.d dVar) {
        d.a aVar = dVar.F1()[0];
        d.a aVar2 = dVar.F1()[1];
        d.a aVar3 = dVar.F1()[2];
        ByteBuffer k10 = aVar.k();
        ByteBuffer k11 = aVar2.k();
        ByteBuffer k12 = aVar3.k();
        k10.rewind();
        k11.rewind();
        k12.rewind();
        int remaining = k10.remaining();
        byte[] bArr = new byte[((dVar.getWidth() * dVar.getHeight()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < dVar.getHeight(); i11++) {
            k10.get(bArr, i10, dVar.getWidth());
            i10 += dVar.getWidth();
            k10.position(Math.min(remaining, (k10.position() - dVar.getWidth()) + aVar.l()));
        }
        int height = dVar.getHeight() / 2;
        int width = dVar.getWidth() / 2;
        int l10 = aVar3.l();
        int l11 = aVar2.l();
        int m10 = aVar3.m();
        int m11 = aVar2.m();
        byte[] bArr2 = new byte[l10];
        byte[] bArr3 = new byte[l11];
        for (int i12 = 0; i12 < height; i12++) {
            k12.get(bArr2, 0, Math.min(l10, k12.remaining()));
            k11.get(bArr3, 0, Math.min(l11, k11.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 += 2;
                bArr[i16] = bArr3[i14];
                i13 += m10;
                i14 += m11;
            }
        }
        return bArr;
    }
}
