package xu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wu.buffer;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwu/l0;", "Lwu/h;", "bytes", "", "bytesOffset", "byteCount", "", "fromIndex", "toIndex", ve.a.f33391e, "(Lwu/l0;Lwu/h;IIJJ)J", "Lwu/e;", "", "c", "(Lwu/e;Lwu/h;IIJJ)Z", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    public static final long a(@NotNull buffer bufferVar, @NotNull wu.h hVar, int i10, int i11, long j10, long j11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        wu.h bytes = hVar;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i12 = i10;
        long j12 = i11;
        wu.b.b(bytes.I(), i12, j12);
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long j13 = j10;
        while (true) {
            long b = a.b(bufferVar.bufferField, bytes, j13, j11, i12, i11);
            if (b != -1) {
                return b;
            }
            long size = (bufferVar.bufferField.getSize() - j12) + 1;
            if (size >= j11) {
                return -1L;
            }
            long j14 = j13;
            if (!c(bufferVar.bufferField, hVar, i10, i11, j14, j11) || bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                return -1L;
            }
            j13 = Math.max(j14, size);
            bytes = hVar;
            i12 = i10;
        }
    }

    public static /* synthetic */ long b(buffer bufferVar, wu.h hVar, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = hVar.I();
        }
        return a(bufferVar, hVar, i13, i11, j10, (i12 & 16) != 0 ? Long.MAX_VALUE : j11);
    }

    public static final boolean c(wu.e eVar, wu.h hVar, int i10, int i11, long j10, long j11) {
        if (eVar.getSize() < j11) {
            return true;
        }
        int max = (int) Math.max(1L, (eVar.getSize() - j11) + 1);
        int min = ((int) Math.min(i11, (eVar.getSize() - j10) + 1)) - 1;
        if (max > min) {
            return false;
        }
        int i12 = min;
        while (true) {
            wu.e eVar2 = eVar;
            wu.h hVar2 = hVar;
            int i13 = i10;
            if (eVar2.r(eVar.getSize() - i12, hVar2, i13, i12)) {
                return true;
            }
            if (i12 == max) {
                return false;
            }
            i12--;
            eVar = eVar2;
            hVar = hVar2;
            i10 = i13;
        }
    }
}
