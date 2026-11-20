package f1;

import f1.r0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k extends r0.j {

    /* renamed from: h, reason: collision with root package name */
    public final u f16432h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f16433i;

    /* renamed from: j, reason: collision with root package name */
    public final x2.a<b2> f16434j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16435k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16436l;

    /* renamed from: m, reason: collision with root package name */
    public final long f16437m;

    public k(u uVar, Executor executor, x2.a<b2> aVar, boolean z10, boolean z11, long j10) {
        if (uVar == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f16432h = uVar;
        this.f16433i = executor;
        this.f16434j = aVar;
        this.f16435k = z10;
        this.f16436l = z11;
        this.f16437m = j10;
    }

    public boolean equals(Object obj) {
        Executor executor;
        x2.a<b2> aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0.j) {
            r0.j jVar = (r0.j) obj;
            if (this.f16432h.equals(jVar.o()) && ((executor = this.f16433i) != null ? executor.equals(jVar.m()) : jVar.m() == null) && ((aVar = this.f16434j) != null ? aVar.equals(jVar.n()) : jVar.n() == null) && this.f16435k == jVar.s() && this.f16436l == jVar.x() && this.f16437m == jVar.q()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f16432h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f16433i;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        x2.a<b2> aVar = this.f16434j;
        int hashCode3 = (((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ (this.f16435k ? 1231 : 1237)) * 1000003;
        int i10 = this.f16436l ? 1231 : 1237;
        long j10 = this.f16437m;
        return ((hashCode3 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // f1.r0.j
    public Executor m() {
        return this.f16433i;
    }

    @Override // f1.r0.j
    public x2.a<b2> n() {
        return this.f16434j;
    }

    @Override // f1.r0.j
    public u o() {
        return this.f16432h;
    }

    @Override // f1.r0.j
    public long q() {
        return this.f16437m;
    }

    @Override // f1.r0.j
    public boolean s() {
        return this.f16435k;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f16432h + ", getCallbackExecutor=" + this.f16433i + ", getEventListener=" + this.f16434j + ", hasAudioEnabled=" + this.f16435k + ", isPersistent=" + this.f16436l + ", getRecordingId=" + this.f16437m + "}";
    }

    @Override // f1.r0.j
    public boolean x() {
        return this.f16436l;
    }
}
