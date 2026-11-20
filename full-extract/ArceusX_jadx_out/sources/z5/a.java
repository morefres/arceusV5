package z5;

import java.util.HashMap;
import java.util.Map;
import x5.j0;
import x5.w;
import y5.u;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f37895e = w.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    public final u f37896a;
    public final j0 b;

    /* renamed from: c, reason: collision with root package name */
    public final x5.b f37897c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, Runnable> f37898d = new HashMap();

    /* renamed from: z5.a$a, reason: collision with other inner class name */
    public class RunnableC0689a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.j0 f37899a;

        public RunnableC0689a(f6.j0 j0Var) {
            this.f37899a = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.e().a(a.f37895e, "Scheduling work " + this.f37899a.id);
            a.this.f37896a.a(this.f37899a);
        }
    }

    public a(u uVar, j0 j0Var, x5.b bVar) {
        this.f37896a = uVar;
        this.b = j0Var;
        this.f37897c = bVar;
    }

    public void a(f6.j0 j0Var, long j10) {
        Runnable remove = this.f37898d.remove(j0Var.id);
        if (remove != null) {
            this.b.a(remove);
        }
        RunnableC0689a runnableC0689a = new RunnableC0689a(j0Var);
        this.f37898d.put(j0Var.id, runnableC0689a);
        this.b.b(j10 - this.f37897c.a(), runnableC0689a);
    }

    public void b(String str) {
        Runnable remove = this.f37898d.remove(str);
        if (remove != null) {
            this.b.a(remove);
        }
    }
}
