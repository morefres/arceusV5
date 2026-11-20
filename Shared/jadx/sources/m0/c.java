package m0;

import g0.f1;
import m0.y;

/* loaded from: classes.dex */
public final class c extends y.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.d f23933a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.h f23934c;

    public c(androidx.camera.core.d dVar, int i10, f1.h hVar) {
        if (dVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f23933a = dVar;
        this.b = i10;
        if (hVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f23934c = hVar;
    }

    @Override // m0.y.a
    public androidx.camera.core.d a() {
        return this.f23933a;
    }

    @Override // m0.y.a
    public f1.h b() {
        return this.f23934c;
    }

    @Override // m0.y.a
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y.a) {
            y.a aVar = (y.a) obj;
            if (this.f23933a.equals(aVar.a()) && this.b == aVar.c() && this.f23934c.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23933a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f23934c.hashCode();
    }

    public String toString() {
        return "In{imageProxy=" + this.f23933a + ", rotationDegrees=" + this.b + ", outputFileOptions=" + this.f23934c + "}";
    }
}
