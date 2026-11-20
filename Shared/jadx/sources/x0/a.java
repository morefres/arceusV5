package x0;

import x0.t;
import y1.c;

/* loaded from: classes.dex */
public final class a extends t.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f34888a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a<Void> f34889c;

    public a(int i10, int i11, c.a<Void> aVar) {
        this.f34888a = i10;
        this.b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f34889c = aVar;
    }

    @Override // x0.t.b
    public c.a<Void> a() {
        return this.f34889c;
    }

    @Override // x0.t.b
    public int b() {
        return this.f34888a;
    }

    @Override // x0.t.b
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t.b) {
            t.b bVar = (t.b) obj;
            if (this.f34888a == bVar.b() && this.b == bVar.c() && this.f34889c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f34888a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f34889c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f34888a + ", rotationDegrees=" + this.b + ", completer=" + this.f34889c + "}";
    }
}
