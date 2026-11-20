package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;
import n9.g;
import n9.m;
import y9.a;
import y9.b;

/* loaded from: classes2.dex */
public class ImageUtils {
    private static final g zza = new g("MLKitImageUtils", "");
    private static final ImageUtils zzb = new ImageUtils();

    private ImageUtils() {
    }

    @NonNull
    public static ImageUtils getInstance() {
        return zzb;
    }

    @NonNull
    public a getImageDataWrapper(@NonNull InputImage inputImage) {
        int format = inputImage.getFormat();
        if (format == -1) {
            return b.u2((Bitmap) m.l(inputImage.getBitmapInternal()));
        }
        if (format != 17) {
            if (format == 35) {
                return b.u2(inputImage.getMediaImage());
            }
            if (format != 842094169) {
                throw new MlKitException("Unsupported image format: " + inputImage.getFormat(), 3);
            }
        }
        return b.u2((ByteBuffer) m.l(inputImage.getByteBuffer()));
    }

    public int getMobileVisionImageFormat(@NonNull InputImage inputImage) {
        return inputImage.getFormat();
    }

    public int getMobileVisionImageSize(@NonNull InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) m.l(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
            return ((ByteBuffer) m.l(inputImage.getByteBuffer())).limit();
        }
        if (inputImage.getFormat() != 35) {
            return 0;
        }
        return (((Image.Plane[]) m.l(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix getUprightRotationMatrix(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008f A[PHI: r5
  0x008f: PHI (r5v3 android.graphics.Matrix) = (r5v0 android.graphics.Matrix), (r5v1 android.graphics.Matrix) binds: [B:10:0x008c, B:27:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x0077, B:10:0x008c, B:13:0x00bd, B:15:0x00c6, B:20:0x0091, B:22:0x0095, B:23:0x009c, B:24:0x00a0, B:25:0x00a7, B:26:0x00ab, B:27:0x00b2, B:35:0x0070, B:41:0x005e, B:64:0x00cb, B:65:0x00d2), top: B:2:0x0004 }] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap zza(@androidx.annotation.NonNull android.content.ContentResolver r11, @androidx.annotation.NonNull android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.common.internal.ImageUtils.zza(android.content.ContentResolver, android.net.Uri):android.graphics.Bitmap");
    }
}
