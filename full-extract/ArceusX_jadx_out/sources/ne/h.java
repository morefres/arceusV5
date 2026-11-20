package ne;

import ie.t0;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import ne.b;

/* loaded from: classes2.dex */
public abstract class h<OutputT> extends b.j<OutputT> {

    /* renamed from: j, reason: collision with root package name */
    public static final b f27012j;

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f27013k = Logger.getLogger(h.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public volatile Set<Throwable> f27014h = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f27015i;

    public static abstract class b {
        public b() {
        }

        public abstract void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2);

        public abstract int b(h<?> hVar);
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h<?>, Set<Throwable>> f27016a;
        public final AtomicIntegerFieldUpdater<h<?>> b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f27016a = atomicReferenceFieldUpdater;
            this.b = atomicIntegerFieldUpdater;
        }

        @Override // ne.h.b
        public void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            y1.b.a(this.f27016a, hVar, set, set2);
        }

        @Override // ne.h.b
        public int b(h<?> hVar) {
            return this.b.decrementAndGet(hVar);
        }
    }

    public static final class d extends b {
        public d() {
            super();
        }

        @Override // ne.h.b
        public void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (hVar) {
                try {
                    if (hVar.f27014h == set) {
                        hVar.f27014h = set2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.h.b
        public int b(h<?> hVar) {
            int J;
            synchronized (hVar) {
                J = h.J(hVar);
            }
            return J;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(h.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(h.class, "i"));
        } catch (Throwable th3) {
            dVar = new d();
            th2 = th3;
        }
        f27012j = dVar;
        if (th2 != null) {
            f27013k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    public h(int i10) {
        this.f27015i = i10;
    }

    public static /* synthetic */ int J(h hVar) {
        int i10 = hVar.f27015i - 1;
        hVar.f27015i = i10;
        return i10;
    }

    public abstract void K(Set<Throwable> set);

    public final void L() {
        this.f27014h = null;
    }

    public final int M() {
        return f27012j.b(this);
    }

    public final Set<Throwable> N() {
        Set<Throwable> set = this.f27014h;
        if (set != null) {
            return set;
        }
        Set<Throwable> c10 = t0.c();
        K(c10);
        f27012j.a(this, null, c10);
        Set<Throwable> set2 = this.f27014h;
        Objects.requireNonNull(set2);
        return set2;
    }
}
