package nb;

import android.content.Context;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class s5 {

    /* renamed from: d, reason: collision with root package name */
    public static s5 f26644d;

    /* renamed from: a, reason: collision with root package name */
    public final g7 f26645a;
    public final n9.q b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f26646c = new AtomicLong(-1);

    public s5(Context context, g7 g7Var) {
        this.b = n9.p.b(context, n9.r.a().b("measurement:api").a());
        this.f26645a = g7Var;
    }

    public static s5 a(g7 g7Var) {
        if (f26644d == null) {
            f26644d = new s5(g7Var.d(), g7Var);
        }
        return f26644d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long b = this.f26645a.e().b();
        AtomicLong atomicLong = this.f26646c;
        if (atomicLong.get() != -1 && b - atomicLong.get() <= BacktraceMetrics.defaultTimeIntervalMs) {
            return;
        }
        this.b.c(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new sb.f() { // from class: nb.r5
            @Override // sb.f
            public final /* synthetic */ void onFailure(Exception exc) {
                s5.this.c(b, exc);
            }
        });
    }

    public final /* synthetic */ void c(long j10, Exception exc) {
        this.f26646c.set(j10);
    }
}
