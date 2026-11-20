package i8;

import java.util.Iterator;
import java.util.concurrent.Executor;
import k8.b;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20306a;
    public final j8.d b;

    /* renamed from: c, reason: collision with root package name */
    public final x f20307c;

    /* renamed from: d, reason: collision with root package name */
    public final k8.b f20308d;

    public v(Executor executor, j8.d dVar, x xVar, k8.b bVar) {
        this.f20306a = executor;
        this.b = dVar;
        this.f20307c = xVar;
        this.f20308d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator<b8.o> it = vVar.b.f0().iterator();
        while (it.hasNext()) {
            vVar.f20307c.b(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f20306a.execute(new Runnable() { // from class: i8.t
            @Override // java.lang.Runnable
            public final void run() {
                r0.f20308d.b(new b.a() { // from class: i8.u
                    @Override // k8.b.a
                    public final Object execute() {
                        return v.a(v.this);
                    }
                });
            }
        });
    }
}
