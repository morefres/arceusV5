package h8;

import b8.o;
import b8.t;
import c8.m;
import i8.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k8.b;
import y7.j;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f19158f = Logger.getLogger(t.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final x f19159a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.e f19160c;

    /* renamed from: d, reason: collision with root package name */
    public final j8.d f19161d;

    /* renamed from: e, reason: collision with root package name */
    public final k8.b f19162e;

    public c(Executor executor, c8.e eVar, x xVar, j8.d dVar, k8.b bVar) {
        this.b = executor;
        this.f19160c = eVar;
        this.f19159a = xVar;
        this.f19161d = dVar;
        this.f19162e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, o oVar, b8.i iVar) {
        cVar.f19161d.S0(oVar, iVar);
        cVar.f19159a.b(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final o oVar, j jVar, b8.i iVar) {
        cVar.getClass();
        try {
            m a10 = cVar.f19160c.a(oVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f19158f.warning(format);
                jVar.a(new IllegalArgumentException(format));
            } else {
                final b8.i a11 = a10.a(iVar);
                cVar.f19162e.b(new b.a() { // from class: h8.b
                    @Override // k8.b.a
                    public final Object execute() {
                        return c.b(c.this, oVar, a11);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e10) {
            f19158f.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    @Override // h8.e
    public void a(final o oVar, final b8.i iVar, final j jVar) {
        this.b.execute(new Runnable() { // from class: h8.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(c.this, oVar, jVar, iVar);
            }
        });
    }
}
