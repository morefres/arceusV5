package i1;

import android.content.Context;
import g0.r1;
import h1.c;
import i1.n;
import i1.p;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m1.h1;
import n0.a3;
import y1.c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20103a;
    public final AtomicReference<Boolean> b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f20104c;

    /* renamed from: d, reason: collision with root package name */
    public final p f20105d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f20106e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20107f;

    /* renamed from: g, reason: collision with root package name */
    public e f20108g;

    /* renamed from: h, reason: collision with root package name */
    public c.a f20109h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20110i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f20111j;

    /* renamed from: k, reason: collision with root package name */
    public c f20112k;

    /* renamed from: l, reason: collision with root package name */
    public h1.c<? extends h1> f20113l;

    /* renamed from: m, reason: collision with root package name */
    public r0.c<h1> f20114m;

    /* renamed from: n, reason: collision with root package name */
    public a3.a<c.a> f20115n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20116o;

    /* renamed from: p, reason: collision with root package name */
    public long f20117p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20118q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20119r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f20120s;

    /* renamed from: t, reason: collision with root package name */
    public double f20121t;

    /* renamed from: u, reason: collision with root package name */
    public long f20122u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20123v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20124w;

    public class a implements a3.a<c.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.c f20125a;

        public a(h1.c cVar) {
            this.f20125a = cVar;
        }

        @Override // n0.a3.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c.a aVar) {
            Objects.requireNonNull(aVar);
            if (n.this.f20113l == this.f20125a) {
                r1.a("AudioSource", "Receive BufferProvider state change: " + n.this.f20109h + " to " + aVar);
                n nVar = n.this;
                if (nVar.f20109h != aVar) {
                    nVar.f20109h = aVar;
                    nVar.H();
                }
            }
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            n nVar = n.this;
            if (nVar.f20113l == this.f20125a) {
                nVar.r(th2);
            }
        }
    }

    public class b implements r0.c<h1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.c f20126a;

        public b(h1.c cVar) {
            this.f20126a = cVar;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h1 h1Var) {
            n nVar = n.this;
            if (!nVar.f20110i || nVar.f20113l != this.f20126a) {
                h1Var.cancel();
                return;
            }
            if (nVar.f20116o && nVar.p()) {
                n.this.y();
            }
            p m10 = n.this.m();
            ByteBuffer t8 = h1Var.t();
            p.c read = m10.read(t8);
            if (read.a() > 0) {
                n nVar2 = n.this;
                if (nVar2.f20119r) {
                    nVar2.u(t8, read.a());
                }
                if (n.this.f20111j != null) {
                    long b = read.b();
                    n nVar3 = n.this;
                    if (b - nVar3.f20122u >= 200) {
                        nVar3.f20122u = read.b();
                        n.this.v(t8);
                    }
                }
                t8.limit(t8.position() + read.a());
                h1Var.c(TimeUnit.NANOSECONDS.toMicros(read.b()));
                h1Var.b();
            } else {
                r1.l("AudioSource", "Unable to read data from AudioStream.");
                h1Var.cancel();
            }
            n.this.z();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (n.this.f20113l != this.f20126a) {
                return;
            }
            r1.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th2 instanceof IllegalStateException) {
                return;
            }
            n.this.r(th2);
        }
    }

    public interface c {
        void a(boolean z10);

        void b(double d10);

        default void c(boolean z10) {
        }

        void onError(Throwable th2);
    }

    public class d implements p.a {
        public d() {
        }

        @Override // i1.p.a
        public void a(boolean z10) {
            n nVar = n.this;
            nVar.f20118q = z10;
            if (nVar.f20108g == e.STARTED) {
                nVar.s();
            }
        }
    }

    public enum e {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public n(i1.a aVar, Executor executor, Context context) {
        this(aVar, executor, context, new q() { // from class: i1.h
            @Override // i1.q
            public final p a(a aVar2, Context context2) {
                return new s(aVar2, context2);
            }
        }, 3000L);
    }

    public static /* synthetic */ Object a(final n nVar, final c.a aVar) {
        nVar.f20103a.execute(new Runnable() { // from class: i1.k
            @Override // java.lang.Runnable
            public final void run() {
                n.f(n.this, aVar);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(n nVar, Executor executor, c cVar) {
        int ordinal = nVar.f20108g.ordinal();
        if (ordinal == 0) {
            nVar.f20111j = executor;
            nVar.f20112k = cVar;
        } else if (ordinal == 1 || ordinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    public static /* synthetic */ void d(n nVar, h1.c cVar) {
        int ordinal = nVar.f20108g.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (nVar.f20113l != cVar) {
            nVar.x(cVar);
        }
    }

    public static /* synthetic */ void e(n nVar, boolean z10) {
        int ordinal = nVar.f20108g.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (nVar.f20119r == z10) {
                return;
            }
            nVar.f20119r = z10;
            if (nVar.f20108g == e.STARTED) {
                nVar.s();
            }
        }
    }

    public static /* synthetic */ void f(n nVar, c.a aVar) {
        nVar.getClass();
        try {
            int ordinal = nVar.f20108g.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                nVar.x(null);
                nVar.f20106e.a();
                nVar.f20105d.a();
                nVar.G();
                nVar.C(e.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    public static /* synthetic */ void g(n nVar) {
        int ordinal = nVar.f20108g.ordinal();
        if (ordinal == 1) {
            nVar.C(e.CONFIGURED);
            nVar.H();
        } else {
            if (ordinal != 2) {
                return;
            }
            r1.l("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    public static /* synthetic */ void k(n nVar, boolean z10) {
        int ordinal = nVar.f20108g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        nVar.b.set(null);
        nVar.f20104c.set(false);
        nVar.C(e.STARTED);
        nVar.q(z10);
        nVar.H();
    }

    public static c.a l(h1.c<? extends h1> cVar) {
        try {
            ne.x<? extends h1> b10 = cVar.b();
            if (b10.isDone()) {
                return (c.a) b10.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public static long n() {
        return System.nanoTime();
    }

    public static boolean o(int i10, int i11, int i12) {
        return s.n(i10, i11, i12);
    }

    public void A(final Executor executor, final c cVar) {
        this.f20103a.execute(new Runnable() { // from class: i1.l
            @Override // java.lang.Runnable
            public final void run() {
                n.b(n.this, executor, cVar);
            }
        });
    }

    public void B(final h1.c<? extends h1> cVar) {
        this.f20103a.execute(new Runnable() { // from class: i1.g
            @Override // java.lang.Runnable
            public final void run() {
                n.d(n.this, cVar);
            }
        });
    }

    public void C(e eVar) {
        r1.a("AudioSource", "Transitioning internal state: " + this.f20108g + " --> " + eVar);
        this.f20108g = eVar;
    }

    public void D(final boolean z10) {
        this.f20103a.execute(new Runnable() { // from class: i1.f
            @Override // java.lang.Runnable
            public final void run() {
                n.k(n.this, z10);
            }
        });
    }

    public final void E() {
        if (this.f20110i) {
            return;
        }
        try {
            r1.a("AudioSource", "startSendingAudio");
            this.f20105d.start();
            this.f20116o = false;
        } catch (p.b e10) {
            r1.m("AudioSource", "Failed to start AudioStream", e10);
            this.f20116o = true;
            this.f20106e.start();
            this.f20117p = n();
            s();
        }
        this.f20110i = true;
        z();
    }

    public void F() {
        this.f20103a.execute(new Runnable() { // from class: i1.b
            @Override // java.lang.Runnable
            public final void run() {
                n.g(n.this);
            }
        });
    }

    public final void G() {
        if (this.f20110i) {
            this.f20110i = false;
            r1.a("AudioSource", "stopSendingAudio");
            this.f20105d.stop();
        }
    }

    public void H() {
        if (this.f20108g != e.STARTED) {
            G();
            return;
        }
        boolean z10 = this.f20109h == c.a.ACTIVE;
        t(!z10);
        if (z10) {
            E();
        } else {
            G();
        }
    }

    public p m() {
        return this.f20116o ? this.f20106e : this.f20105d;
    }

    public boolean p() {
        x2.g.i(this.f20117p > 0);
        return n() - this.f20117p >= this.f20107f;
    }

    public void q(final boolean z10) {
        this.f20103a.execute(new Runnable() { // from class: i1.i
            @Override // java.lang.Runnable
            public final void run() {
                n.e(n.this, z10);
            }
        });
    }

    public void r(final Throwable th2) {
        Executor executor = this.f20111j;
        final c cVar = this.f20112k;
        if (executor == null || cVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.d
            @Override // java.lang.Runnable
            public final void run() {
                n.c.this.onError(th2);
            }
        });
    }

    public void s() {
        Executor executor = this.f20111j;
        final c cVar = this.f20112k;
        if (executor == null || cVar == null) {
            return;
        }
        final boolean z10 = this.f20119r || this.f20116o || this.f20118q;
        if (Objects.equals(this.b.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.j
            @Override // java.lang.Runnable
            public final void run() {
                n.c.this.a(z10);
            }
        });
    }

    public void t(final boolean z10) {
        Executor executor = this.f20111j;
        final c cVar = this.f20112k;
        if (executor == null || cVar == null || this.f20104c.getAndSet(z10) == z10) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.c
            @Override // java.lang.Runnable
            public final void run() {
                n.c.this.c(z10);
            }
        });
    }

    public void u(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = this.f20120s;
        if (bArr == null || bArr.length < i10) {
            this.f20120s = new byte[i10];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f20120s, 0, i10);
        byteBuffer.limit(byteBuffer.position()).position(position);
    }

    public void v(ByteBuffer byteBuffer) {
        Executor executor = this.f20111j;
        final c cVar = this.f20112k;
        if (this.f20123v == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            double d10 = 0.0d;
            while (asShortBuffer.hasRemaining()) {
                d10 = Math.max(d10, Math.abs((int) asShortBuffer.get()));
            }
            this.f20121t = d10 / 32767.0d;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: i1.m
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.b(n.this.f20121t);
                }
            });
        }
    }

    public ne.x<Void> w() {
        return y1.c.a(new c.InterfaceC0669c() { // from class: i1.e
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return n.a(n.this, aVar);
            }
        });
    }

    public final void x(h1.c<? extends h1> cVar) {
        h1.c<? extends h1> cVar2 = this.f20113l;
        if (cVar2 != null) {
            a3.a<c.a> aVar = this.f20115n;
            Objects.requireNonNull(aVar);
            cVar2.d(aVar);
            this.f20113l = null;
            this.f20115n = null;
            this.f20114m = null;
            this.f20109h = c.a.INACTIVE;
            H();
        }
        if (cVar != null) {
            this.f20113l = cVar;
            this.f20115n = new a(cVar);
            this.f20114m = new b(cVar);
            c.a l10 = l(cVar);
            if (l10 != null) {
                this.f20109h = l10;
                H();
            }
            this.f20113l.c(this.f20103a, this.f20115n);
        }
    }

    public void y() {
        x2.g.i(this.f20116o);
        try {
            this.f20105d.start();
            r1.a("AudioSource", "Retry start AudioStream succeed");
            this.f20106e.stop();
            this.f20116o = false;
        } catch (p.b e10) {
            r1.m("AudioSource", "Retry start AudioStream failed", e10);
            this.f20117p = n();
        }
    }

    public void z() {
        h1.c<? extends h1> cVar = this.f20113l;
        Objects.requireNonNull(cVar);
        ne.x<? extends h1> e10 = cVar.e();
        r0.c<h1> cVar2 = this.f20114m;
        Objects.requireNonNull(cVar2);
        r0.n.j(e10, cVar2, this.f20103a);
    }

    public n(i1.a aVar, Executor executor, Context context, q qVar, long j10) {
        this.b = new AtomicReference<>(null);
        this.f20104c = new AtomicBoolean(false);
        this.f20108g = e.CONFIGURED;
        this.f20109h = c.a.INACTIVE;
        this.f20122u = 0L;
        Executor g10 = q0.c.g(executor);
        this.f20103a = g10;
        this.f20107f = TimeUnit.MILLISECONDS.toNanos(j10);
        try {
            c0 c0Var = new c0(qVar.a(aVar, context), aVar);
            this.f20105d = c0Var;
            c0Var.b(new d(), g10);
            this.f20106e = new e0(aVar);
            this.f20123v = aVar.b();
            this.f20124w = aVar.c();
        } catch (p.b | IllegalArgumentException e10) {
            throw new o("Unable to create AudioStream", e10);
        }
    }
}
