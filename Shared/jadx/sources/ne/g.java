package ne;

import ie.y0;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class g<InputT, OutputT> extends h<OutputT> {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f27003o = Logger.getLogger(g.class.getName());

    /* renamed from: l, reason: collision with root package name */
    public ie.r<? extends x<? extends InputT>> f27004l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f27005m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f27006n;

    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public g(ie.r<? extends x<? extends InputT>> rVar, boolean z10, boolean z11) {
        super(rVar.size());
        this.f27004l = (ie.r) he.n.l(rVar);
        this.f27005m = z10;
        this.f27006n = z11;
    }

    public static /* synthetic */ void P(g gVar, x xVar, int i10) {
        gVar.getClass();
        try {
            if (xVar.isCancelled()) {
                gVar.f27004l = null;
                gVar.cancel(false);
            } else {
                gVar.S(i10, xVar);
            }
            gVar.T(null);
        } catch (Throwable th2) {
            gVar.T(null);
            throw th2;
        }
    }

    public static boolean Q(Set<Throwable> set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    public static void X(Throwable th2) {
        f27003o.log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
    }

    @Override // ne.b
    public final String A() {
        ie.r<? extends x<? extends InputT>> rVar = this.f27004l;
        if (rVar == null) {
            return super.A();
        }
        String valueOf = String.valueOf(rVar);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
        sb2.append("futures=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // ne.h
    public final void K(Set<Throwable> set) {
        he.n.l(set);
        if (isCancelled()) {
            return;
        }
        Throwable c10 = c();
        Objects.requireNonNull(c10);
        Q(set, c10);
    }

    public abstract void R(int i10, InputT inputt);

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(int i10, Future<? extends InputT> future) {
        try {
            R(i10, s.f(future));
        } catch (ExecutionException e10) {
            V(e10.getCause());
        } catch (Throwable th2) {
            V(th2);
        }
    }

    public final void T(ie.r<? extends Future<? extends InputT>> rVar) {
        int M = M();
        he.n.s(M >= 0, "Less than 0 remaining futures");
        if (M == 0) {
            Y(rVar);
        }
    }

    public abstract void U();

    public final void V(Throwable th2) {
        he.n.l(th2);
        if (this.f27005m && !E(th2) && Q(N(), th2)) {
            X(th2);
        } else if (th2 instanceof Error) {
            X(th2);
        }
    }

    public final void W() {
        Objects.requireNonNull(this.f27004l);
        if (this.f27004l.isEmpty()) {
            U();
            return;
        }
        if (!this.f27005m) {
            final ie.r<? extends x<? extends InputT>> rVar = this.f27006n ? this.f27004l : null;
            Runnable runnable = new Runnable() { // from class: ne.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.T(rVar);
                }
            };
            y0<? extends x<? extends InputT>> it = this.f27004l.iterator();
            while (it.hasNext()) {
                it.next().a(runnable, a0.a());
            }
            return;
        }
        y0<? extends x<? extends InputT>> it2 = this.f27004l.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final x<? extends InputT> next = it2.next();
            next.a(new Runnable() { // from class: ne.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.P(g.this, next, i10);
                }
            }, a0.a());
            i10++;
        }
    }

    public final void Y(ie.r<? extends Future<? extends InputT>> rVar) {
        if (rVar != null) {
            y0<? extends Future<? extends InputT>> it = rVar.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    S(i10, next);
                }
                i10++;
            }
        }
        L();
        U();
        Z(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    public void Z(a aVar) {
        he.n.l(aVar);
        this.f27004l = null;
    }

    @Override // ne.b
    public final void o() {
        super.o();
        ie.r<? extends x<? extends InputT>> rVar = this.f27004l;
        Z(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (rVar != null)) {
            boolean G = G();
            y0<? extends x<? extends InputT>> it = rVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(G);
            }
        }
    }
}
