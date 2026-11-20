package i1;

import i1.p;

/* loaded from: classes.dex */
public final class v extends p.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f20153a;
    public final long b;

    public v(int i10, long j10) {
        this.f20153a = i10;
        this.b = j10;
    }

    @Override // i1.p.c
    public int a() {
        return this.f20153a;
    }

    @Override // i1.p.c
    public long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p.c) {
            p.c cVar = (p.c) obj;
            if (this.f20153a == cVar.a() && this.b == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f20153a ^ 1000003) * 1000003;
        long j10 = this.b;
        return i10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f20153a + ", timestampNs=" + this.b + "}";
    }
}
