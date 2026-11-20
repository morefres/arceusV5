package n0;

import g0.w2;
import java.util.Collection;

/* loaded from: classes.dex */
public interface p0 extends g0.l, w2.c {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* renamed from: a, reason: collision with root package name */
        public final boolean f25504a;

        a(boolean z10) {
            this.f25504a = z10;
        }

        public boolean b() {
            return this.f25504a;
        }
    }

    ne.x<Void> a();

    a3<a> b();

    @Override // g0.l
    default g0.m c() {
        return e();
    }

    @Override // g0.l
    default g0.t d() {
        return k();
    }

    l0 e();

    default h0 g() {
        return k0.a();
    }

    default void h(boolean z10) {
    }

    void i(Collection<g0.w2> collection);

    void j(Collection<g0.w2> collection);

    o0 k();

    default boolean l() {
        return d().i() == 0;
    }

    default void o(h0 h0Var) {
    }

    default void p() {
    }

    default boolean q() {
        return true;
    }

    default void r(boolean z10) {
    }
}
