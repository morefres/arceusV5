package y3;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import w1.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f36297g = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    public c f36300d;

    /* renamed from: a, reason: collision with root package name */
    public final j<b, Long> f36298a = new j<>();
    public final ArrayList<b> b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final C0670a f36299c = new C0670a();

    /* renamed from: e, reason: collision with root package name */
    public long f36301e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36302f = false;

    /* renamed from: y3.a$a, reason: collision with other inner class name */
    public class C0670a {
        public C0670a() {
        }

        public void a() {
            a.this.f36301e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f36301e);
            if (a.this.b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    public interface b {
        boolean a(long j10);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final C0670a f36304a;

        public c(C0670a c0670a) {
            this.f36304a = c0670a;
        }

        public abstract void a();
    }

    public static class d extends c {
        public final Choreographer b;

        /* renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f36305c;

        /* renamed from: y3.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0671a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0671a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f36304a.a();
            }
        }

        public d(C0670a c0670a) {
            super(c0670a);
            this.b = Choreographer.getInstance();
            this.f36305c = new ChoreographerFrameCallbackC0671a();
        }

        @Override // y3.a.c
        public void a() {
            this.b.postFrameCallback(this.f36305c);
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f36297g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j10) {
        if (this.b.size() == 0) {
            e().a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j10 > 0) {
            this.f36298a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void b() {
        if (this.f36302f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f36302f = false;
        }
    }

    public void c(long j10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            b bVar = this.b.get(i10);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    public c e() {
        if (this.f36300d == null) {
            this.f36300d = new d(this.f36299c);
        }
        return this.f36300d;
    }

    public final boolean f(b bVar, long j10) {
        Long l10 = this.f36298a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f36298a.remove(bVar);
        return true;
    }

    public void g(b bVar) {
        this.f36298a.remove(bVar);
        int indexOf = this.b.indexOf(bVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, null);
            this.f36302f = true;
        }
    }
}
