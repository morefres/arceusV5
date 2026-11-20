package r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ne.x;
import y1.c;

/* loaded from: classes.dex */
public class p<V> implements x<List<V>> {

    /* renamed from: a, reason: collision with root package name */
    public List<? extends x<? extends V>> f30054a;
    public List<V> b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30055c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f30056d;

    /* renamed from: e, reason: collision with root package name */
    public final x<List<V>> f30057e = y1.c.a(new a());

    /* renamed from: f, reason: collision with root package name */
    public c.a<List<V>> f30058f;

    public class a implements c.InterfaceC0669c<List<V>> {
        public a() {
        }

        @Override // y1.c.InterfaceC0669c
        public Object a(c.a<List<V>> aVar) {
            x2.g.j(p.this.f30058f == null, "The result can only set once!");
            p.this.f30058f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.b = null;
            pVar.f30054a = null;
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30061a;
        public final /* synthetic */ x b;

        public c(int i10, x xVar) {
            this.f30061a = i10;
            this.b = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.g(this.f30061a, this.b);
        }
    }

    public p(List<? extends x<? extends V>> list, boolean z10, Executor executor) {
        this.f30054a = (List) x2.g.g(list);
        this.b = new ArrayList(list.size());
        this.f30055c = z10;
        this.f30056d = new AtomicInteger(list.size());
        f(executor);
    }

    @Override // ne.x
    public void a(Runnable runnable, Executor executor) {
        this.f30057e.a(runnable, executor);
    }

    public final void c() {
        List<? extends x<? extends V>> list = this.f30054a;
        if (list == null || isDone()) {
            return;
        }
        for (x<? extends V> xVar : list) {
            while (!xVar.isDone()) {
                try {
                    xVar.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f30055c) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends x<? extends V>> list = this.f30054a;
        if (list != null) {
            Iterator<? extends x<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f30057e.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<V> get() {
        c();
        return this.f30057e.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.f30057e.get(j10, timeUnit);
    }

    public final void f(Executor executor) {
        a(new b(), q0.c.b());
        if (this.f30054a.isEmpty()) {
            this.f30058f.c(new ArrayList(this.b));
            return;
        }
        for (int i10 = 0; i10 < this.f30054a.size(); i10++) {
            this.b.add(null);
        }
        List<? extends x<? extends V>> list = this.f30054a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            x<? extends V> xVar = list.get(i11);
            xVar.a(new c(i11, xVar), executor);
        }
    }

    public void g(int i10, Future<? extends V> future) {
        c.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.b;
        if (isDone() || list == null) {
            x2.g.j(this.f30055c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            x2.g.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, n.m(future));
                            int decrementAndGet = this.f30056d.decrementAndGet();
                            x2.g.j(decrementAndGet >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet == 0) {
                                List<V> list2 = this.b;
                                if (list2 != null) {
                                    this.f30058f.c(new ArrayList(list2));
                                } else {
                                    x2.g.i(isDone());
                                }
                            }
                        } catch (ExecutionException e10) {
                            if (this.f30055c) {
                                this.f30058f.f(e10.getCause());
                            }
                            int decrementAndGet2 = this.f30056d.decrementAndGet();
                            x2.g.j(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet2 == 0) {
                                List<V> list3 = this.b;
                                if (list3 != null) {
                                    aVar = this.f30058f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                x2.g.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f30055c) {
                            cancel(false);
                        }
                        int decrementAndGet3 = this.f30056d.decrementAndGet();
                        x2.g.j(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet3 == 0) {
                            List<V> list4 = this.b;
                            if (list4 != null) {
                                aVar = this.f30058f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            x2.g.i(isDone());
                        }
                    }
                } catch (Error e11) {
                    this.f30058f.f(e11);
                    int decrementAndGet4 = this.f30056d.decrementAndGet();
                    x2.g.j(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet4 == 0) {
                        List<V> list5 = this.b;
                        if (list5 != null) {
                            aVar = this.f30058f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        x2.g.i(isDone());
                    }
                }
            } catch (RuntimeException e12) {
                if (this.f30055c) {
                    this.f30058f.f(e12);
                }
                int decrementAndGet5 = this.f30056d.decrementAndGet();
                x2.g.j(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 == 0) {
                    List<V> list6 = this.b;
                    if (list6 != null) {
                        aVar = this.f30058f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    x2.g.i(isDone());
                }
            }
        } catch (Throwable th2) {
            int decrementAndGet6 = this.f30056d.decrementAndGet();
            x2.g.j(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.b;
                if (list7 != null) {
                    this.f30058f.c(new ArrayList(list7));
                } else {
                    x2.g.i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f30057e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f30057e.isDone();
    }
}
