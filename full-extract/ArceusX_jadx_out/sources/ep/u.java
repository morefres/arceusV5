package ep;

import java.util.Set;
import ym.a0;
import ym.c0;

/* loaded from: classes3.dex */
public final class u implements dt.d<c0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Set<a0<?>>> f16163a;

    public u(dt.i<Set<a0<?>>> iVar) {
        this.f16163a = iVar;
    }

    public static u a(dt.i<Set<a0<?>>> iVar) {
        return new u(iVar);
    }

    public static c0 c(Set<a0<?>> set) {
        return (c0) dt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.p(set));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f16163a.get());
    }
}
