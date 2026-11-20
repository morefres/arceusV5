package dn;

import android.media.Image;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldn/f;", "", "<init>", "()V", "", "Landroid/media/Image$Plane;", "yuv420888planes", "", "width", "height", "Ljava/nio/ByteBuffer;", "c", "([Landroid/media/Image$Plane;II)Ljava/nio/ByteBuffer;", "planes", "", ve.a.f33391e, "([Landroid/media/Image$Plane;II)Z", "plane", "", "out", "offset", "pixelStride", "", j6.b.f21518e, "(Landroid/media/Image$Plane;II[BII)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f15056a = new f();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r7.compareTo(r0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.media.Image.Plane[] r7, int r8, int r9) {
        /*
            r6 = this;
            int r8 = r8 * r9
            r9 = 1
            r0 = r7[r9]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            r1 = 2
            r7 = r7[r1]
            java.nio.ByteBuffer r7 = r7.getBuffer()
            int r2 = r7.position()
            int r3 = r0.limit()
            int r4 = r2 + 1
            r5 = 0
            r7.position(r4)     // Catch: java.lang.IllegalArgumentException -> L35
            int r4 = r3 + (-1)
            r0.limit(r4)     // Catch: java.lang.IllegalArgumentException -> L35
            int r4 = r7.remaining()     // Catch: java.lang.IllegalArgumentException -> L35
            int r8 = r8 * r1
            int r8 = r8 / 4
            int r8 = r8 - r1
            if (r4 != r8) goto L33
            int r8 = r7.compareTo(r0)     // Catch: java.lang.IllegalArgumentException -> L35
            if (r8 != 0) goto L33
            goto L34
        L33:
            r9 = r5
        L34:
            r5 = r9
        L35:
            r7.position(r2)     // Catch: java.lang.IllegalArgumentException -> L3b
            r0.limit(r3)     // Catch: java.lang.IllegalArgumentException -> L3b
        L3b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.f.a(android.media.Image$Plane[], int, int):boolean");
    }

    public final void b(Image.Plane plane, int width, int height, byte[] out, int offset, int pixelStride) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i10 = width / (height / limit);
        int i11 = 0;
        for (int i12 = 0; i12 < limit; i12++) {
            int i13 = i11;
            for (int i14 = 0; i14 < i10; i14++) {
                out[offset] = buffer.get(i13);
                offset += pixelStride;
                i13 += plane.getPixelStride();
            }
            i11 += plane.getRowStride();
        }
    }

    @NotNull
    public final ByteBuffer c(@NotNull Image.Plane[] yuv420888planes, int width, int height) {
        Intrinsics.checkNotNullParameter(yuv420888planes, "yuv420888planes");
        int i10 = width * height;
        byte[] bArr = new byte[((i10 / 4) * 2) + i10];
        if (a(yuv420888planes, width, height)) {
            yuv420888planes[0].getBuffer().rewind();
            yuv420888planes[0].getBuffer().get(bArr, 0, i10);
            ByteBuffer buffer = yuv420888planes[1].getBuffer();
            yuv420888planes[2].getBuffer().get(bArr, i10, 1);
            buffer.get(bArr, i10 + 1, ((i10 * 2) / 4) - 1);
        } else {
            b(yuv420888planes[0], width, height, bArr, 0, 1);
            b(yuv420888planes[1], width, height, bArr, i10 + 1, 2);
            b(yuv420888planes[2], width, height, bArr, i10, 2);
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
        return wrap;
    }
}
