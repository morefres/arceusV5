package nb;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26296a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26297c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f26299e;

    public /* synthetic */ i6(k6 k6Var, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(k6Var);
        this.f26299e = k6Var;
        n9.m.f("health_monitor");
        n9.m.a(j10 > 0);
        this.f26296a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.f26297c = "health_monitor:value";
        this.f26298d = j10;
    }

    public final void a(String str, long j10) {
        k6 k6Var = this.f26299e;
        k6Var.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences p8 = k6Var.p();
        String str2 = this.b;
        long j11 = p8.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = k6Var.p().edit();
            edit.putString(this.f26297c, str);
            edit.putLong(str2, 1L);
            edit.apply();
            return;
        }
        long nextLong = k6Var.f26328a.C().q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = k6Var.p().edit();
        if (nextLong < j13) {
            edit2.putString(this.f26297c, str);
        }
        edit2.putLong(str2, j12);
        edit2.apply();
    }

    public final Pair b() {
        long abs;
        k6 k6Var = this.f26299e;
        k6Var.h();
        k6Var.h();
        long d10 = d();
        if (d10 == 0) {
            c();
            abs = 0;
        } else {
            abs = Math.abs(d10 - k6Var.f26328a.e().a());
        }
        long j10 = this.f26298d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            c();
            return null;
        }
        String string = k6Var.p().getString(this.f26297c, null);
        long j11 = k6Var.p().getLong(this.b, 0L);
        c();
        return (string == null || j11 <= 0) ? k6.A : new Pair(string, Long.valueOf(j11));
    }

    public final void c() {
        k6 k6Var = this.f26299e;
        k6Var.h();
        long a10 = k6Var.f26328a.e().a();
        SharedPreferences.Editor edit = k6Var.p().edit();
        edit.remove(this.b);
        edit.remove(this.f26297c);
        edit.putLong(this.f26296a, a10);
        edit.apply();
    }

    public final long d() {
        return this.f26299e.p().getLong(this.f26296a, 0L);
    }
}
