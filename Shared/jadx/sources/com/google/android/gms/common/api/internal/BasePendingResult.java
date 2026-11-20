package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import bb.j;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k9.f;
import k9.i;
import k9.k;
import k9.n;
import k9.o;
import l9.j1;
import l9.u1;
import l9.v1;
import l9.w1;
import n9.m;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends n> extends i<R> {

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f5777n = new u1();

    /* renamed from: a, reason: collision with root package name */
    public final Object f5778a;

    @NonNull
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final WeakReference f5779c;

    /* renamed from: d, reason: collision with root package name */
    public final CountDownLatch f5780d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5781e;

    /* renamed from: f, reason: collision with root package name */
    public o f5782f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f5783g;

    /* renamed from: h, reason: collision with root package name */
    public n f5784h;

    /* renamed from: i, reason: collision with root package name */
    public Status f5785i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f5786j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5787k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5788l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5789m;

    @KeepName
    private w1 resultGuardian;

    public static class a<R extends n> extends j {
        public a(@NonNull Looper looper) {
            super(looper);
        }

        public final void a(@NonNull o oVar, @NonNull n nVar) {
            ThreadLocal threadLocal = BasePendingResult.f5777n;
            sendMessage(obtainMessage(1, new Pair((o) m.l(oVar), nVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).f(Status.f5769n);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            o oVar = (o) pair.first;
            n nVar = (n) pair.second;
            try {
                oVar.a(nVar);
            } catch (RuntimeException e10) {
                BasePendingResult.m(nVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f5778a = new Object();
        this.f5780d = new CountDownLatch(1);
        this.f5781e = new ArrayList();
        this.f5783g = new AtomicReference();
        this.f5789m = false;
        this.b = new a(Looper.getMainLooper());
        this.f5779c = new WeakReference(null);
    }

    public static void m(n nVar) {
        if (nVar instanceof k) {
            try {
                ((k) nVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(nVar)), e10);
            }
        }
    }

    @Override // k9.i
    public final void c(@NonNull i.a aVar) {
        m.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f5778a) {
            try {
                if (g()) {
                    aVar.a(this.f5785i);
                } else {
                    this.f5781e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k9.i
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R d(long j10, @NonNull TimeUnit timeUnit) {
        if (j10 > 0) {
            m.k("await must not be called on the UI thread when time is greater than zero.");
        }
        m.q(!this.f5786j, "Result has already been consumed.");
        m.q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f5780d.await(j10, timeUnit)) {
                f(Status.f5769n);
            }
        } catch (InterruptedException unused) {
            f(Status.f5767l);
        }
        m.q(g(), "Result is not ready.");
        return (R) i();
    }

    @NonNull
    public abstract R e(@NonNull Status status);

    @Deprecated
    public final void f(@NonNull Status status) {
        synchronized (this.f5778a) {
            try {
                if (!g()) {
                    h(e(status));
                    this.f5788l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() {
        return this.f5780d.getCount() == 0;
    }

    public final void h(@NonNull R r8) {
        synchronized (this.f5778a) {
            try {
                if (this.f5788l || this.f5787k) {
                    m(r8);
                    return;
                }
                g();
                m.q(!g(), "Results have already been set");
                m.q(!this.f5786j, "Result has already been consumed");
                j(r8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n i() {
        n nVar;
        synchronized (this.f5778a) {
            m.q(!this.f5786j, "Result has already been consumed.");
            m.q(g(), "Result is not ready.");
            nVar = this.f5784h;
            this.f5784h = null;
            this.f5782f = null;
            this.f5786j = true;
        }
        if (((j1) this.f5783g.getAndSet(null)) == null) {
            return (n) m.l(nVar);
        }
        throw null;
    }

    public final void j(n nVar) {
        this.f5784h = nVar;
        this.f5785i = nVar.m();
        this.f5780d.countDown();
        v1 v1Var = null;
        if (this.f5787k) {
            this.f5782f = null;
        } else {
            o oVar = this.f5782f;
            if (oVar != null) {
                this.b.removeMessages(2);
                this.b.a(oVar, i());
            } else if (this.f5784h instanceof k) {
                this.resultGuardian = new w1(this, v1Var);
            }
        }
        ArrayList arrayList = this.f5781e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i.a) arrayList.get(i10)).a(this.f5785i);
        }
        this.f5781e.clear();
    }

    public final void l() {
        boolean z10 = true;
        if (!this.f5789m && !((Boolean) f5777n.get()).booleanValue()) {
            z10 = false;
        }
        this.f5789m = z10;
    }

    public BasePendingResult(f fVar) {
        this.f5778a = new Object();
        this.f5780d = new CountDownLatch(1);
        this.f5781e = new ArrayList();
        this.f5783g = new AtomicReference();
        this.f5789m = false;
        this.b = new a(fVar != null ? fVar.c() : Looper.getMainLooper());
        this.f5779c = new WeakReference(fVar);
    }
}
