package td;

import com.google.android.gms.tasks.Task;
import td.c;

/* loaded from: classes2.dex */
public final class z implements c {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f32168a;
    public final t0 b;

    public z(n0 n0Var, t0 t0Var) {
        this.f32168a = n0Var;
        this.b = t0Var;
    }

    @Override // td.c
    public final Task<c.InterfaceC0579c> a(final c.a aVar) {
        long b = aVar.b();
        aVar.a();
        return this.f32168a.d(b, 0).o(new sb.j() { // from class: td.y
            @Override // sb.j
            public final Task then(Object obj) {
                return z.this.b(aVar, (Long) obj);
            }
        });
    }

    public final /* synthetic */ Task b(c.a aVar, Long l10) {
        final long b = aVar.b();
        final long longValue = l10.longValue();
        aVar.a();
        final t0 t0Var = this.b;
        final int i10 = 0;
        return sb.m.f(new c.InterfaceC0579c(b, longValue, i10) { // from class: td.s0
            public final /* synthetic */ long b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f32157c;

            @Override // td.c.InterfaceC0579c
            public final Task a(c.d dVar) {
                return t0.this.a(this.b, this.f32157c, 0, dVar);
            }
        });
    }
}
