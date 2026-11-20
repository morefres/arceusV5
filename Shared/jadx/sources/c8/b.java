package c8;

import c8.g;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final g.a f4783a;
    public final long b;

    public b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f4783a = aVar;
        this.b = j10;
    }

    @Override // c8.g
    public long b() {
        return this.b;
    }

    @Override // c8.g
    public g.a c() {
        return this.f4783a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f4783a.equals(gVar.c()) && this.b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f4783a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f4783a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
