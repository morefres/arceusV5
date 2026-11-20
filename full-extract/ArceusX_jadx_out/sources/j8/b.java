package j8;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    public final long f21535a;
    public final b8.o b;

    /* renamed from: c, reason: collision with root package name */
    public final b8.i f21536c;

    public b(long j10, b8.o oVar, b8.i iVar) {
        this.f21535a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f21536c = iVar;
    }

    @Override // j8.k
    public b8.i b() {
        return this.f21536c;
    }

    @Override // j8.k
    public long c() {
        return this.f21535a;
    }

    @Override // j8.k
    public b8.o d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f21535a == kVar.c() && this.b.equals(kVar.d()) && this.f21536c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21535a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f21536c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f21535a + ", transportContext=" + this.b + ", event=" + this.f21536c + "}";
    }
}
