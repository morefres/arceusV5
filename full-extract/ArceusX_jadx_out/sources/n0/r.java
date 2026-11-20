package n0;

import n0.s3;

/* loaded from: classes.dex */
public final class r extends s3.a {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f25522a;

    public r(Throwable th2) {
        if (th2 == null) {
            throw new NullPointerException("Null error");
        }
        this.f25522a = th2;
    }

    @Override // n0.s3.a
    public Throwable a() {
        return this.f25522a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s3.a) {
            return this.f25522a.equals(((s3.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f25522a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f25522a + "}";
    }
}
