package b8;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class t implements s {

    /* renamed from: e, reason: collision with root package name */
    public static volatile u f3912e;

    /* renamed from: a, reason: collision with root package name */
    public final l8.a f3913a;
    public final l8.a b;

    /* renamed from: c, reason: collision with root package name */
    public final h8.e f3914c;

    /* renamed from: d, reason: collision with root package name */
    public final i8.r f3915d;

    public t(l8.a aVar, l8.a aVar2, h8.e eVar, i8.r rVar, i8.v vVar) {
        this.f3913a = aVar;
        this.b = aVar2;
        this.f3914c = eVar;
        this.f3915d = rVar;
        vVar.c();
    }

    public static t c() {
        u uVar = f3912e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<y7.c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(y7.c.b("proto"));
    }

    public static void f(Context context) {
        if (f3912e == null) {
            synchronized (t.class) {
                try {
                    if (f3912e == null) {
                        f3912e = e.c().setApplicationContext(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // b8.s
    public void a(n nVar, y7.j jVar) {
        this.f3914c.a(nVar.f().f(nVar.c().c()), b(nVar), jVar);
    }

    public final i b(n nVar) {
        return i.a().i(this.f3913a.a()).k(this.b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public i8.r e() {
        return this.f3915d;
    }

    public y7.i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
