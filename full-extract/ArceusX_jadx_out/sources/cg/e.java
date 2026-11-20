package cg;

import java.util.concurrent.TimeUnit;
import zf.p;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f4926d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f4927e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final p f4928a = p.c();
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public int f4929c;

    public static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    public static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    public final synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f4929c) + this.f4928a.e(), f4927e);
        }
        return f4926d;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f4929c != 0) {
            z10 = this.f4928a.a() > this.b;
        }
        return z10;
    }

    public final synchronized void e() {
        this.f4929c = 0;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f4929c++;
        this.b = this.f4928a.a() + a(i10);
    }
}
