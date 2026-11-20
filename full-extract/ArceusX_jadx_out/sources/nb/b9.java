package nb;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b9 implements ne.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzoh f26067a;
    public final /* synthetic */ qa b;

    public b9(qa qaVar, zzoh zzohVar) {
        this.f26067a = zzohVar;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    public final void a() {
        g7 g7Var = this.b.f26328a;
        SparseArray r8 = g7Var.x().r();
        zzoh zzohVar = this.f26067a;
        r8.put(zzohVar.f7477h, Long.valueOf(zzohVar.f7476g));
        k6 x10 = g7Var.x();
        int[] iArr = new int[r8.size()];
        long[] jArr = new long[r8.size()];
        for (int i10 = 0; i10 < r8.size(); i10++) {
            iArr[i10] = r8.keyAt(i10);
            jArr[i10] = ((Long) r8.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        x10.f26383o.b(bundle);
    }

    @Override // ne.q
    public final void onFailure(Throwable th2) {
        qa qaVar = this.b;
        qaVar.h();
        qaVar.Z(false);
        g7 g7Var = qaVar.f26328a;
        int d02 = (g7Var.w().H(null, z4.U0) ? qaVar.d0(th2) : 2) - 1;
        if (d02 == 0) {
            g7Var.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", w5.x(qaVar.f26328a.L().q()), w5.x(th2.toString()));
            qaVar.b0(1);
            qaVar.w0().add(this.f26067a);
            return;
        }
        if (d02 != 1) {
            g7Var.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", w5.x(qaVar.f26328a.L().q()), th2);
            a();
            qaVar.b0(1);
            qaVar.x0();
            return;
        }
        qaVar.w0().add(this.f26067a);
        if (qaVar.a0() > ((Integer) z4.f26910x0.b(null)).intValue()) {
            qaVar.b0(1);
            g7Var.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", w5.x(qaVar.f26328a.L().q()), w5.x(th2.toString()));
        } else {
            g7Var.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", w5.x(qaVar.f26328a.L().q()), w5.x(String.valueOf(qaVar.a0())), w5.x(th2.toString()));
            qaVar.V(qaVar.a0());
            int a02 = qaVar.a0();
            qaVar.b0(a02 + a02);
        }
    }

    @Override // ne.q
    public final void onSuccess(Object obj) {
        qa qaVar = this.b;
        qaVar.h();
        a();
        qaVar.Z(false);
        qaVar.b0(1);
        qaVar.f26328a.a().v().b("Successfully registered trigger URI", this.f26067a.f7475f);
        qaVar.x0();
    }
}
