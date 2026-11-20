package ch;

import w1.g;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static b f4936d;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4938c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public g<a> f4937a = new g<>();

    public static b b() {
        if (f4936d == null) {
            synchronized (b.class) {
                try {
                    if (f4936d == null) {
                        f4936d = new b();
                    }
                } finally {
                }
            }
        }
        return f4936d;
    }

    public void a() {
        this.f4937a.a();
        this.b = 0;
    }

    public int c() {
        return this.b;
    }

    public a d(long j10) {
        return this.f4937a.e(j10);
    }

    public void e(a aVar) {
        synchronized (this.f4938c) {
            try {
                a e10 = this.f4937a.e(aVar.b());
                if (e10 != null) {
                    e10.i(aVar);
                } else {
                    this.f4937a.i(aVar.b(), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
