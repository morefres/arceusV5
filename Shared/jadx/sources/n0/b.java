package n0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import n0.a3;

/* loaded from: classes.dex */
public abstract class b implements a3<List<g0.s>> {

    /* renamed from: c, reason: collision with root package name */
    public List<g0.s> f25299c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f25298a = new Object();
    public final List<a> b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Throwable f25300d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25301e = false;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f25302a;
        public final a3.a<? super List<g0.s>> b;

        public a(Executor executor, a3.a<? super List<g0.s>> aVar) {
            this.f25302a = executor;
            this.b = aVar;
        }
    }

    public b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g0.s.a(it.next()));
        }
        this.f25299c = arrayList;
    }

    public static /* synthetic */ void a(Throwable th2, a aVar, List list) {
        if (th2 != null) {
            aVar.b.onError(th2);
        } else {
            aVar.b.a(list);
        }
    }

    @Override // n0.a3
    public void c(Executor executor, a3.a<? super List<g0.s>> aVar) {
        List<g0.s> unmodifiableList;
        Throwable th2;
        x2.g.g(executor);
        x2.g.g(aVar);
        this.b.add(new a(executor, aVar));
        synchronized (this.f25298a) {
            try {
                if (!this.f25301e && !this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f25301e = true;
                    g();
                }
                unmodifiableList = Collections.unmodifiableList(this.f25299c);
                th2 = this.f25300d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        f(new a(executor, aVar), unmodifiableList, th2);
    }

    @Override // n0.a3
    public void d(a3.a<? super List<g0.s>> aVar) {
        a aVar2;
        x2.g.g(aVar);
        Iterator<a> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            } else {
                aVar2 = it.next();
                if (aVar2.b.equals(aVar)) {
                    break;
                }
            }
        }
        if (aVar2 != null) {
            this.b.remove(aVar2);
        }
        synchronized (this.f25298a) {
            try {
                if (this.f25301e && this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f25301e = false;
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(final a aVar, final List<g0.s> list, final Throwable th2) {
        aVar.f25302a.execute(new Runnable() { // from class: n0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(th2, aVar, list);
            }
        });
    }

    public abstract void g();

    public abstract void h();

    public void i(List<g0.s> list) {
        k(list, null);
    }

    public void j(Throwable th2) {
        k(null, th2);
    }

    public final void k(List<g0.s> list, Throwable th2) {
        boolean z10;
        boolean z11;
        List<g0.s> unmodifiableList;
        Throwable th3;
        synchronized (this.f25298a) {
            try {
                if (th2 != null) {
                    if (this.f25300d != null && this.f25299c.isEmpty()) {
                        z11 = false;
                        this.f25300d = th2;
                        this.f25299c = Collections.EMPTY_LIST;
                    }
                    z11 = true;
                    this.f25300d = th2;
                    this.f25299c = Collections.EMPTY_LIST;
                } else {
                    x2.g.g(list);
                    if (this.f25300d == null && this.f25299c.equals(list)) {
                        z10 = false;
                        this.f25300d = null;
                        this.f25299c = list;
                        z11 = z10;
                    }
                    z10 = true;
                    this.f25300d = null;
                    this.f25299c = list;
                    z11 = z10;
                }
                unmodifiableList = Collections.unmodifiableList(this.f25299c);
                th3 = this.f25300d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Data changed. Notifying ");
            sb2.append(this.b.size());
            sb2.append(" observers. Error: ");
            sb2.append(th3 != null);
            Log.d("CameraPresenceSrc", sb2.toString());
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                f(it.next(), unmodifiableList, th3);
            }
        }
    }
}
