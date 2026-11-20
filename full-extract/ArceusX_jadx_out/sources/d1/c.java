package d1;

import android.annotation.SuppressLint;
import android.view.InterfaceC0703r;
import android.view.f0;
import android.view.l;
import android.view.s;
import g0.g2;
import g0.l;
import g0.m;
import g0.q1;
import g0.t;
import g0.w2;
import j0.ResolvedFeatureGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n0.o0;

@SuppressLint({"UsesNonDefaultVisibleForTesting"})
/* loaded from: classes.dex */
public final class c implements InterfaceC0703r, l {
    public final s b;

    /* renamed from: c, reason: collision with root package name */
    public final s0.f f14225c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14224a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f14226d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14227e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14228f = false;

    /* renamed from: g, reason: collision with root package name */
    public g2 f14229g = null;

    public c(s sVar, s0.f fVar) {
        this.b = sVar;
        this.f14225c = fVar;
        if (sVar.a().getState().b(l.b.f2629d)) {
            fVar.w();
        } else {
            fVar.H();
        }
        sVar.a().a(this);
    }

    public static /* synthetic */ void m(ResolvedFeatureGroup resolvedFeatureGroup, g2 g2Var) {
        HashSet hashSet = new HashSet();
        if (resolvedFeatureGroup != null) {
            hashSet.addAll(resolvedFeatureGroup.a());
        }
        g2Var.d().accept(hashSet);
    }

    public void A() {
        synchronized (this.f14224a) {
            try {
                if (this.f14227e) {
                    this.f14227e = false;
                    if (this.b.a().getState().b(l.b.f2629d)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.l
    public m c() {
        return this.f14225c.c();
    }

    @Override // g0.l
    public t d() {
        return this.f14225c.d();
    }

    public void n(final g2 g2Var) {
        synchronized (this.f14224a) {
            try {
                if (this.f14229g == null) {
                    this.f14229g = g2Var;
                } else if (g2Var.getIsLegacy()) {
                    if (!this.f14229g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f14229g.k());
                    arrayList.addAll(g2Var.k());
                    this.f14229g = new q1(arrayList, g2Var.getViewPort(), g2Var.c());
                } else {
                    if (this.f14229g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f14229g = g2Var;
                    s0.f fVar = this.f14225c;
                    fVar.f0(fVar.O());
                }
                this.f14225c.m0(g2Var.getViewPort());
                this.f14225c.i0(g2Var.c());
                this.f14225c.l0(g2Var.getSessionType());
                this.f14225c.k0(g2Var.f());
                final ResolvedFeatureGroup b = ResolvedFeatureGroup.b(g2Var, (o0) d());
                g2Var.getFeatureSelectionListenerExecutor().execute(new Runnable() { // from class: d1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.m(ResolvedFeatureGroup.this, g2Var);
                    }
                });
                this.f14225c.n(g2Var.k(), b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @f0(l.a.ON_DESTROY)
    public void onDestroy(s sVar) {
        synchronized (this.f14224a) {
            s0.f fVar = this.f14225c;
            fVar.f0(fVar.O());
        }
    }

    @f0(l.a.ON_PAUSE)
    public void onPause(s sVar) {
        this.f14225c.h(false);
    }

    @f0(l.a.ON_RESUME)
    public void onResume(s sVar) {
        this.f14225c.h(true);
    }

    @f0(l.a.ON_START)
    public void onStart(s sVar) {
        synchronized (this.f14224a) {
            try {
                if (!this.f14227e && !this.f14228f) {
                    this.f14225c.w();
                    this.f14226d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @f0(l.a.ON_STOP)
    public void onStop(s sVar) {
        synchronized (this.f14224a) {
            try {
                if (!this.f14227e && !this.f14228f) {
                    this.f14225c.H();
                    this.f14226d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s0.f s() {
        return this.f14225c;
    }

    public s t() {
        s sVar;
        synchronized (this.f14224a) {
            sVar = this.b;
        }
        return sVar;
    }

    public List<w2> u() {
        List<w2> unmodifiableList;
        synchronized (this.f14224a) {
            unmodifiableList = Collections.unmodifiableList(this.f14225c.O());
        }
        return unmodifiableList;
    }

    public boolean v(w2 w2Var) {
        boolean contains;
        synchronized (this.f14224a) {
            contains = this.f14225c.O().contains(w2Var);
        }
        return contains;
    }

    public boolean w() {
        boolean isLegacy;
        synchronized (this.f14224a) {
            g2 g2Var = this.f14229g;
            isLegacy = g2Var == null ? false : g2Var.getIsLegacy();
        }
        return isLegacy;
    }

    public void x() {
        synchronized (this.f14224a) {
            try {
                if (this.f14227e) {
                    return;
                }
                onStop(this.b);
                this.f14227e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(g2 g2Var) {
        synchronized (this.f14224a) {
            try {
                g2 g2Var2 = this.f14229g;
                if (g2Var2 != null && g2Var2.getIsLegacy() == g2Var.getIsLegacy()) {
                    q1 q1Var = null;
                    if (this.f14229g.getIsLegacy() || g2Var.getIsLegacy()) {
                        if (this.f14229g.getIsLegacy() && g2Var.getIsLegacy()) {
                            ArrayList arrayList = new ArrayList(this.f14229g.k());
                            arrayList.removeAll(g2Var.k());
                            if (!arrayList.isEmpty()) {
                                q1Var = new q1(arrayList, this.f14229g.getViewPort(), this.f14229g.c());
                            }
                            this.f14229g = q1Var;
                        }
                    } else if (this.f14229g != g2Var) {
                        return;
                    } else {
                        this.f14229g = null;
                    }
                    ArrayList arrayList2 = new ArrayList(g2Var.k());
                    arrayList2.retainAll(this.f14225c.O());
                    this.f14225c.f0(arrayList2);
                }
            } finally {
            }
        }
    }

    public void z() {
        synchronized (this.f14224a) {
            s0.f fVar = this.f14225c;
            fVar.f0(fVar.O());
            this.f14229g = null;
        }
    }
}
