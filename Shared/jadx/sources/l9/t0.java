package l9;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class t0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final f f23373a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final b f23374c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23375d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23376e;

    public t0(f fVar, int i10, b bVar, long j10, long j11, String str, String str2) {
        this.f23373a = fVar;
        this.b = i10;
        this.f23374c = bVar;
        this.f23375d = j10;
        this.f23376e = j11;
    }

    public static t0 a(f fVar, int i10, b bVar) {
        boolean z10;
        if (!fVar.e()) {
            return null;
        }
        RootTelemetryConfiguration a10 = n9.n.b().a();
        if (a10 == null) {
            z10 = true;
        } else {
            if (!a10.x3()) {
                return null;
            }
            z10 = a10.y3();
            j0 t8 = fVar.t(bVar);
            if (t8 != null) {
                if (!(t8.t() instanceof n9.c)) {
                    return null;
                }
                n9.c cVar = (n9.c) t8.t();
                if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                    ConnectionTelemetryConfiguration b = b(t8, cVar, i10);
                    if (b == null) {
                        return null;
                    }
                    t8.E();
                    z10 = b.z3();
                }
            }
        }
        return new t0(fVar, i10, bVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static ConnectionTelemetryConfiguration b(j0 j0Var, n9.c cVar, int i10) {
        int[] w32;
        int[] x32;
        ConnectionTelemetryConfiguration telemetryConfiguration = cVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.y3() || ((w32 = telemetryConfiguration.w3()) != null ? !u9.b.a(w32, i10) : !((x32 = telemetryConfiguration.x3()) == null || !u9.b.a(x32, i10))) || j0Var.q() >= telemetryConfiguration.v3()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        j0 t8;
        int i10;
        int i11;
        int i12;
        int w32;
        long j10;
        long j11;
        if (this.f23373a.e()) {
            RootTelemetryConfiguration a10 = n9.n.b().a();
            if ((a10 == null || a10.x3()) && (t8 = this.f23373a.t(this.f23374c)) != null && (t8.t() instanceof n9.c)) {
                n9.c cVar = (n9.c) t8.t();
                int i13 = 0;
                boolean z10 = this.f23375d > 0;
                int gCoreServiceId = cVar.getGCoreServiceId();
                int i14 = 100;
                if (a10 != null) {
                    z10 &= a10.y3();
                    int v32 = a10.v3();
                    int w33 = a10.w3();
                    i10 = a10.z3();
                    if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                        ConnectionTelemetryConfiguration b = b(t8, cVar, this.b);
                        if (b == null) {
                            return;
                        }
                        boolean z11 = b.z3() && this.f23375d > 0;
                        w33 = b.v3();
                        z10 = z11;
                    }
                    i12 = v32;
                    i11 = w33;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                f fVar = this.f23373a;
                int i15 = -1;
                if (task.isSuccessful()) {
                    w32 = 0;
                } else {
                    if (!task.l()) {
                        Exception exception = task.getException();
                        if (exception instanceof k9.b) {
                            Status a11 = ((k9.b) exception).a();
                            i14 = a11.x3();
                            ConnectionResult v33 = a11.v3();
                            if (v33 != null) {
                                w32 = v33.w3();
                                i13 = i14;
                            }
                        } else {
                            i13 = 101;
                            w32 = -1;
                        }
                    }
                    i13 = i14;
                    w32 = -1;
                }
                if (z10) {
                    long j12 = this.f23375d;
                    long j13 = this.f23376e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i15 = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = currentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                fVar.G(new MethodInvocation(this.b, i13, w32, j10, j11, null, null, gCoreServiceId, i15), i10, i12, i11);
            }
        }
    }
}
