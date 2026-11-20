package pe;

import af.j0;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final j0.b f28615a;

    public q(j0.b bVar) {
        this.f28615a = bVar;
    }

    public static q b(p pVar) {
        return new q(pVar.n().a());
    }

    public synchronized p a() {
        return p.i(this.f28615a.build());
    }
}
