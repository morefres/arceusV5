package td;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import td.c;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ee.t0 f32133a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final sb.k f32134c;

    /* renamed from: d, reason: collision with root package name */
    public final t f32135d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f32136e;

    /* renamed from: f, reason: collision with root package name */
    public final ee.f f32137f;

    public n0(Context context, ee.t0 t0Var, t tVar, d1 d1Var) {
        sb.k kVar = new sb.k();
        this.f32134c = kVar;
        this.b = context.getPackageName();
        this.f32133a = t0Var;
        this.f32135d = tVar;
        this.f32136e = d1Var;
        ee.f fVar = new ee.f(context, t0Var, "ExpressIntegrityService", o0.f32141a, new ee.a1() { // from class: td.e0
            @Override // ee.a1
            public final Object a(IBinder iBinder) {
                return ee.k0.s2(iBinder);
            }
        }, null);
        this.f32137f = fVar;
        fVar.c().post(new f0(this, kVar, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(n0 n0Var, c.d dVar, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", n0Var.b);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", dVar.b());
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(dVar.c()));
        ArrayList arrayList = new ArrayList();
        ee.g0.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(ee.g0.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(n0 n0Var, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", n0Var.b);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        ee.g0.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(ee.g0.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean i(n0 n0Var, int i10) {
        return n0Var.f32134c.a().isSuccessful() && ((Integer) n0Var.f32134c.a().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean j(n0 n0Var) {
        return n0Var.f32134c.a().isSuccessful() && ((Integer) n0Var.f32134c.a().getResult()).intValue() == 0;
    }

    public final Task c(c.d dVar, long j10, long j11, int i10) {
        this.f32133a.c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        sb.k kVar = new sb.k();
        this.f32137f.t(new h0(this, kVar, 0, dVar, j10, j11, kVar), kVar);
        return kVar.a();
    }

    public final Task d(long j10, int i10) {
        this.f32133a.c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        sb.k kVar = new sb.k();
        this.f32137f.t(new g0(this, kVar, 0, j10, kVar), kVar);
        return kVar.a();
    }
}
