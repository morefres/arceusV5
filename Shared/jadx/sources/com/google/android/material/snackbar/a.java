package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static a f8252e;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f8253a = new Object();

    @NonNull
    public final Handler b = new Handler(Looper.getMainLooper(), new C0129a());

    /* renamed from: c, reason: collision with root package name */
    public c f8254c;

    /* renamed from: d, reason: collision with root package name */
    public c f8255d;

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0129a implements Handler.Callback {
        public C0129a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a(int i10);

        void show();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<b> f8257a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8258c;

        public c(int i10, b bVar) {
            this.f8257a = new WeakReference<>(bVar);
            this.b = i10;
        }

        public boolean a(b bVar) {
            return bVar != null && this.f8257a.get() == bVar;
        }
    }

    public static a c() {
        if (f8252e == null) {
            f8252e = new a();
        }
        return f8252e;
    }

    public final boolean a(@NonNull c cVar, int i10) {
        b bVar = cVar.f8257a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    public void b(b bVar, int i10) {
        synchronized (this.f8253a) {
            try {
                if (f(bVar)) {
                    a(this.f8254c, i10);
                } else if (g(bVar)) {
                    a(this.f8255d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(@NonNull c cVar) {
        synchronized (this.f8253a) {
            try {
                if (this.f8254c != cVar) {
                    if (this.f8255d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f8253a) {
            try {
                z10 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z10;
    }

    public final boolean f(b bVar) {
        c cVar = this.f8254c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean g(b bVar) {
        c cVar = this.f8255d;
        return cVar != null && cVar.a(bVar);
    }

    public void h(b bVar) {
        synchronized (this.f8253a) {
            try {
                if (f(bVar)) {
                    this.f8254c = null;
                    if (this.f8255d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f8253a) {
            try {
                if (f(bVar)) {
                    l(this.f8254c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f8253a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8254c;
                    if (!cVar.f8258c) {
                        cVar.f8258c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f8253a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8254c;
                    if (cVar.f8258c) {
                        cVar.f8258c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(@NonNull c cVar) {
        int i10 = cVar.b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    public void m(int i10, b bVar) {
        synchronized (this.f8253a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8254c;
                    cVar.b = i10;
                    this.b.removeCallbacksAndMessages(cVar);
                    l(this.f8254c);
                    return;
                }
                if (g(bVar)) {
                    this.f8255d.b = i10;
                } else {
                    this.f8255d = new c(i10, bVar);
                }
                c cVar2 = this.f8254c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f8254c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n() {
        c cVar = this.f8255d;
        if (cVar != null) {
            this.f8254c = cVar;
            this.f8255d = null;
            b bVar = cVar.f8257a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f8254c = null;
            }
        }
    }
}
