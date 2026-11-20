package xu;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wu.r0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lxu/j;", "Lwu/p;", "Lwu/r0;", "delegate", "", "size", "", "truncate", "<init>", "(Lwu/r0;JZ)V", "Lwu/e;", "sink", "byteCount", "read", "(Lwu/e;J)J", "newSize", "", ve.a.f33391e, "(Lwu/e;J)V", "J", j6.b.f21518e, "Z", "c", "bytesReceived", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j extends wu.p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean truncate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long bytesReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull r0 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.size = j10;
        this.truncate = z10;
    }

    public final void a(wu.e eVar, long j10) {
        wu.e eVar2 = new wu.e();
        eVar2.d3(eVar);
        eVar.write(eVar2, j10);
        eVar2.a();
    }

    @Override // wu.p, wu.r0
    public long read(@NotNull wu.e sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.bytesReceived;
        long j11 = this.size;
        if (j10 > j11) {
            byteCount = 0;
        } else if (this.truncate) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j12);
        }
        long read = super.read(sink, byteCount);
        if (read != -1) {
            this.bytesReceived += read;
        }
        long j13 = this.bytesReceived;
        long j14 = this.size;
        if ((j13 >= j14 || read != -1) && j13 <= j14) {
            return read;
        }
        if (read > 0 && j13 > j14) {
            a(sink, sink.getSize() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
