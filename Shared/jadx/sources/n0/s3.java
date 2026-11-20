package n0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n0.a3;

/* loaded from: classes.dex */
public abstract class s3<T> implements a3<T> {
    public final AtomicReference<Object> b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f25541a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f25542c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25543d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Map<a3.a<? super T>, b<T>> f25544e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<b<T>> f25545f = new CopyOnWriteArraySet<>();

    public static abstract class a {
        public static a b(Throwable th2) {
            return new r(th2);
        }

        public abstract Throwable a();
    }

    public static final class b<T> implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f25546h = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final Executor f25547a;
        public final a3.a<? super T> b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f25549d;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f25548c = new AtomicBoolean(true);

        /* renamed from: e, reason: collision with root package name */
        public Object f25550e = f25546h;

        /* renamed from: f, reason: collision with root package name */
        public int f25551f = -1;

        /* renamed from: g, reason: collision with root package name */
        public boolean f25552g = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, a3.a<? super T> aVar) {
            this.f25549d = atomicReference;
            this.f25547a = executor;
            this.b = aVar;
        }

        public void a() {
            this.f25548c.set(false);
        }

        public void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f25548c.get()) {
                        if (i10 <= this.f25551f) {
                            return;
                        }
                        this.f25551f = i10;
                        if (this.f25552g) {
                            return;
                        }
                        this.f25552g = true;
                        try {
                            this.f25547a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f25552g = false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f25548c.get()) {
                        this.f25552g = false;
                        return;
                    }
                    Object obj = this.f25549d.get();
                    int i10 = this.f25551f;
                    while (true) {
                        if (!Objects.equals(this.f25550e, obj)) {
                            this.f25550e = obj;
                            if (obj instanceof a) {
                                this.b.onError(((a) obj).a());
                            } else {
                                this.b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f25551f || !this.f25548c.get()) {
                                    break;
                                }
                                obj = this.f25549d.get();
                                i10 = this.f25551f;
                            } finally {
                            }
                        }
                    }
                    this.f25552g = false;
                } finally {
                }
            }
        }
    }

    public s3(Object obj, boolean z10) {
        if (!z10) {
            this.b = new AtomicReference<>(obj);
        } else {
            x2.g.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.b = new AtomicReference<>(a.b((Throwable) obj));
        }
    }

    public final void a(a3.a<? super T> aVar) {
        b<T> remove = this.f25544e.remove(aVar);
        if (remove != null) {
            remove.a();
            this.f25545f.remove(remove);
        }
    }

    @Override // n0.a3
    public ne.x<T> b() {
        Object obj = this.b.get();
        return obj instanceof a ? r0.n.n(((a) obj).a()) : r0.n.p(obj);
    }

    @Override // n0.a3
    public void c(Executor executor, a3.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f25541a) {
            a(aVar);
            bVar = new b<>(this.b, executor, aVar);
            this.f25544e.put(aVar, bVar);
            this.f25545f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // n0.a3
    public void d(a3.a<? super T> aVar) {
        synchronized (this.f25541a) {
            a(aVar);
        }
    }

    public void f() {
        synchronized (this.f25541a) {
            try {
                Iterator it = new HashSet(this.f25544e.keySet()).iterator();
                while (it.hasNext()) {
                    a((a3.a) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(T t8) {
        i(t8);
    }

    public void h(Throwable th2) {
        i(a.b(th2));
    }

    public final void i(Object obj) {
        Iterator<b<T>> it;
        int i10;
        synchronized (this.f25541a) {
            try {
                if (Objects.equals(this.b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f25542c + 1;
                this.f25542c = i11;
                if (this.f25543d) {
                    return;
                }
                this.f25543d = true;
                Iterator<b<T>> it2 = this.f25545f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i11);
                    } else {
                        synchronized (this.f25541a) {
                            try {
                                if (this.f25542c == i11) {
                                    this.f25543d = false;
                                    return;
                                } else {
                                    it = this.f25545f.iterator();
                                    i10 = this.f25542c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i11 = i10;
                    }
                }
            } finally {
            }
        }
    }
}
