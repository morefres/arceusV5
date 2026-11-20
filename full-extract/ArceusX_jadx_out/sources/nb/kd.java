package nb;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f26407a;

    public kd(ld ldVar) {
        Objects.requireNonNull(ldVar);
        this.f26407a = ldVar;
    }

    public final void a() {
        ld ldVar = this.f26407a;
        ldVar.h();
        g7 g7Var = ldVar.f26328a;
        if (g7Var.x().A(g7Var.e().a())) {
            g7Var.x().f26381m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                g7Var.a().w().a("Detected application was in foreground");
                c(g7Var.e().a(), false);
            }
        }
    }

    public final void b(long j10, boolean z10) {
        ld ldVar = this.f26407a;
        ldVar.h();
        ldVar.q();
        g7 g7Var = ldVar.f26328a;
        if (g7Var.x().A(j10)) {
            g7Var.x().f26381m.b(true);
            ldVar.f26328a.L().p();
        }
        g7Var.x().f26385q.b(j10);
        if (g7Var.x().f26381m.a()) {
            c(j10, z10);
        }
    }

    public final void c(long j10, boolean z10) {
        ld ldVar = this.f26407a;
        ldVar.h();
        if (ldVar.f26328a.g()) {
            g7 g7Var = ldVar.f26328a;
            g7Var.x().f26385q.b(j10);
            g7Var.a().w().b("Session started, time", Long.valueOf(g7Var.e().b()));
            long j11 = j10 / 1000;
            g7 g7Var2 = ldVar.f26328a;
            g7Var2.B().B("auto", "_sid", Long.valueOf(j11), j10);
            g7Var.x().f26386r.b(j11);
            g7Var.x().f26381m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            g7Var2.B().u("auto", "_s", j10, bundle);
            String a10 = g7Var.x().f26391w.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a10);
            g7Var2.B().u("auto", "_ssr", j10, bundle2);
        }
    }
}
