package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f7399a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public long f7400c;

    /* renamed from: d, reason: collision with root package name */
    public long f7401d;

    public z(c0 c0Var) {
        x.c(c0Var, "ticker");
        this.f7399a = c0Var;
    }

    public static z b(c0 c0Var) {
        z zVar = new z(c0Var);
        zVar.e();
        return zVar;
    }

    public static z c(c0 c0Var) {
        return new z(c0Var);
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final z d() {
        this.f7400c = 0L;
        this.b = false;
        return this;
    }

    public final z e() {
        x.e(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.f7401d = this.f7399a.a();
        return this;
    }

    public final z f() {
        long a10 = this.f7399a.a();
        x.e(this.b, "This stopwatch is already stopped.");
        this.b = false;
        this.f7400c += a10 - this.f7401d;
        return this;
    }

    public final boolean g() {
        return this.b;
    }

    public final long h() {
        return this.b ? (this.f7399a.a() - this.f7401d) + this.f7400c : this.f7400c;
    }

    public final String toString() {
        String str;
        long h10 = h();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(h10, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(h10, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(h10, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(h10, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(h10, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(h10, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(h10 / timeUnit2.convert(1L, timeUnit)));
        switch (y.f7393a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = rl.d.f30696a;
                break;
            default:
                throw new AssertionError();
        }
        return format + " " + str;
    }
}
