package androidx.camera.view;

import android.view.d0;
import androidx.camera.view.PreviewView;
import g0.r1;
import g0.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.a3;
import n0.e0;
import n0.o0;
import n0.p0;
import n0.u;
import ne.x;
import r0.n;
import y1.c;

/* loaded from: classes.dex */
public final class a implements a3.a<p0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f1280a;
    public final d0<PreviewView.e> b;

    /* renamed from: c, reason: collision with root package name */
    public PreviewView.e f1281c;

    /* renamed from: d, reason: collision with root package name */
    public final c f1282d;

    /* renamed from: e, reason: collision with root package name */
    public x<Void> f1283e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1284f = false;

    /* renamed from: androidx.camera.view.a$a, reason: collision with other inner class name */
    public class C0016a implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f1285a;
        public final /* synthetic */ t b;

        public C0016a(List list, t tVar) {
            this.f1285a = list;
            this.b = tVar;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            a.this.f1283e = null;
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            a.this.f1283e = null;
            if (this.f1285a.isEmpty()) {
                return;
            }
            Iterator it = this.f1285a.iterator();
            while (it.hasNext()) {
                ((o0) this.b).v((u) it.next());
            }
            this.f1285a.clear();
        }
    }

    public class b extends u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f1287a;
        public final /* synthetic */ t b;

        public b(c.a aVar, t tVar) {
            this.f1287a = aVar;
            this.b = tVar;
        }

        @Override // n0.u
        public void b(int i10, e0 e0Var) {
            this.f1287a.c(null);
            ((o0) this.b).v(this);
        }
    }

    public a(o0 o0Var, d0<PreviewView.e> d0Var, c cVar) {
        this.f1280a = o0Var;
        this.b = d0Var;
        this.f1282d = cVar;
        synchronized (this) {
            this.f1281c = d0Var.f();
        }
    }

    public static /* synthetic */ Object b(a aVar, t tVar, List list, c.a aVar2) {
        aVar.getClass();
        b bVar = aVar.new b(aVar2, tVar);
        list.add(bVar);
        ((o0) tVar).f(q0.c.b(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(a aVar, Void r12) {
        aVar.getClass();
        aVar.i(PreviewView.e.STREAMING);
        return null;
    }

    public final void e() {
        x<Void> xVar = this.f1283e;
        if (xVar != null) {
            xVar.cancel(false);
            this.f1283e = null;
        }
    }

    public void f() {
        e();
    }

    @Override // n0.a3.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(p0.a aVar) {
        if (aVar == p0.a.CLOSING || aVar == p0.a.CLOSED || aVar == p0.a.RELEASING || aVar == p0.a.RELEASED) {
            i(PreviewView.e.IDLE);
            if (this.f1284f) {
                this.f1284f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == p0.a.OPENING || aVar == p0.a.OPEN || aVar == p0.a.PENDING_OPEN) && !this.f1284f) {
            h(this.f1280a);
            this.f1284f = true;
        }
    }

    public final void h(t tVar) {
        i(PreviewView.e.IDLE);
        ArrayList arrayList = new ArrayList();
        r0.d f10 = r0.d.c(j(tVar, arrayList)).g(new r0.a() { // from class: p1.o
            @Override // r0.a
            public final ne.x apply(Object obj) {
                ne.x i10;
                i10 = androidx.camera.view.a.this.f1282d.i();
                return i10;
            }
        }, q0.c.b()).f(new t.a() { // from class: p1.p
            @Override // t.a
            public final Object apply(Object obj) {
                return androidx.camera.view.a.d(androidx.camera.view.a.this, (Void) obj);
            }
        }, q0.c.b());
        this.f1283e = f10;
        n.j(f10, new C0016a(arrayList, tVar), q0.c.b());
    }

    public void i(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (this.f1281c.equals(eVar)) {
                    return;
                }
                this.f1281c = eVar;
                r1.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.b.m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final x<Void> j(final t tVar, final List<u> list) {
        return y1.c.a(new c.InterfaceC0669c() { // from class: p1.q
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return androidx.camera.view.a.b(androidx.camera.view.a.this, tVar, list, aVar);
            }
        });
    }

    @Override // n0.a3.a
    public void onError(Throwable th2) {
        f();
        i(PreviewView.e.IDLE);
    }
}
