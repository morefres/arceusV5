package b0;

import b0.i;
import java.util.Objects;

/* loaded from: classes.dex */
public class n implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3633a;

    public n(Object obj) {
        this.f3633a = obj;
    }

    @Override // b0.i.a
    public void a(long j10) {
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return Objects.equals(this.f3633a, ((n) obj).f3633a);
        }
        return false;
    }

    @Override // b0.i.a
    public void g(int i10) {
    }

    public int hashCode() {
        return this.f3633a.hashCode();
    }
}
