package m0;

import android.util.Log;
import androidx.camera.core.b;
import g0.r1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m0.b1;
import m0.l1;

/* loaded from: classes.dex */
public class f1 implements b1, b.a, l1.a {
    public final c0 b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f23948c;

    /* renamed from: d, reason: collision with root package name */
    public y0 f23949d;

    /* renamed from: e, reason: collision with root package name */
    public final List<y0> f23950e;

    /* renamed from: a, reason: collision with root package name */
    public final Deque<l1> f23947a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f23951f = false;

    public class a implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f23952a;

        public a(n nVar) {
            this.f23952a = nVar;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            f1.this.b.c();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (this.f23952a.b()) {
                return;
            }
            int f10 = this.f23952a.a().get(0).f();
            if (th2 instanceof g0.h1) {
                f1.this.f23948c.j(b1.a.c(f10, (g0.h1) th2));
            } else {
                f1.this.f23948c.j(b1.a.c(f10, new g0.h1(2, "Failed to submit capture request", th2)));
            }
            f1.this.b.c();
        }
    }

    public f1(c0 c0Var) {
        p0.z.b();
        this.b = c0Var;
        this.f23950e = new ArrayList();
    }

    public static /* synthetic */ void h(f1 f1Var) {
        f1Var.f23949d = null;
        f1Var.j();
    }

    @Override // androidx.camera.core.b.a
    public void a(androidx.camera.core.d dVar) {
        q0.c.e().execute(new Runnable() { // from class: m0.e1
            @Override // java.lang.Runnable
            public final void run() {
                f1.this.j();
            }
        });
    }

    @Override // m0.b1
    public void b(l1 l1Var) {
        p0.z.b();
        this.f23947a.offer(l1Var);
        j();
    }

    @Override // m0.b1
    public void c() {
        p0.z.b();
        g0.h1 h1Var = new g0.h1(3, "Camera is closed.", null);
        Iterator<l1> it = this.f23947a.iterator();
        while (it.hasNext()) {
            it.next().x(h1Var);
        }
        this.f23947a.clear();
        ArrayList arrayList = new ArrayList(this.f23950e);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((y0) obj).m(h1Var);
        }
    }

    @Override // m0.b1
    public void d(d0 d0Var) {
        p0.z.b();
        this.f23948c = d0Var;
        d0Var.k(this);
    }

    @Override // m0.b1
    public void e() {
        p0.z.b();
        this.f23951f = false;
        j();
    }

    @Override // m0.l1.a
    public void f(l1 l1Var) {
        p0.z.b();
        r1.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f23947a.addFirst(l1Var);
        j();
    }

    public boolean i() {
        return this.f23949d != null;
    }

    public void j() {
        p0.z.b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (i()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f23951f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        if (this.f23948c.h() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        l1 poll = this.f23947a.poll();
        if (poll == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        y0 y0Var = new y0(poll, this);
        l(y0Var);
        x2.c<n, v0> e10 = this.f23948c.e(poll, y0Var, y0Var.p());
        n nVar = e10.f35015a;
        Objects.requireNonNull(nVar);
        v0 v0Var = e10.b;
        Objects.requireNonNull(v0Var);
        this.f23948c.m(v0Var);
        y0Var.t(k(nVar));
    }

    public final ne.x<Void> k(n nVar) {
        p0.z.b();
        this.b.b();
        ne.x<Void> a10 = this.b.a(nVar.a());
        r0.n.j(a10, new a(nVar), q0.c.e());
        return a10;
    }

    public final void l(final y0 y0Var) {
        x2.g.i(!i());
        this.f23949d = y0Var;
        y0Var.p().a(new Runnable() { // from class: m0.c1
            @Override // java.lang.Runnable
            public final void run() {
                f1.h(f1.this);
            }
        }, q0.c.b());
        this.f23950e.add(y0Var);
        y0Var.q().a(new Runnable() { // from class: m0.d1
            @Override // java.lang.Runnable
            public final void run() {
                f1.this.f23950e.remove(y0Var);
            }
        }, q0.c.b());
    }

    @Override // m0.b1
    public void pause() {
        p0.z.b();
        this.f23951f = true;
        y0 y0Var = this.f23949d;
        if (y0Var != null) {
            y0Var.n();
        }
    }
}
