package nb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class tc extends b5 {

    /* renamed from: c, reason: collision with root package name */
    public final nc f26690c;

    /* renamed from: d, reason: collision with root package name */
    public d5 f26691d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f26692e;

    /* renamed from: f, reason: collision with root package name */
    public final w f26693f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f26694g;

    /* renamed from: h, reason: collision with root package name */
    public final pd f26695h;

    /* renamed from: i, reason: collision with root package name */
    public final List f26696i;

    /* renamed from: j, reason: collision with root package name */
    public final w f26697j;

    public tc(g7 g7Var) {
        super(g7Var);
        this.f26696i = new ArrayList();
        this.f26695h = new pd(g7Var.e());
        this.f26690c = new nc(this);
        this.f26693f = new tb(this, g7Var);
        this.f26697j = new xb(this, g7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f26695h.a();
        this.f26328a.w();
        this.f26693f.b(((Long) z4.Z.b(null)).longValue());
    }

    public final void A() {
        h();
        j();
        nc ncVar = this.f26690c;
        ncVar.b();
        try {
            t9.a.b().c(this.f26328a.d(), ncVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f26691d = null;
    }

    public final void B(com.google.android.gms.internal.measurement.x1 x1Var, zzbg zzbgVar, String str) {
        h();
        j();
        g7 g7Var = this.f26328a;
        if (g7Var.C().X(j9.h.f21609a) == 0) {
            T(new wb(this, zzbgVar, str, x1Var));
        } else {
            g7Var.a().r().a("Not bundling data. Service unavailable or out of date");
            g7Var.C().d0(x1Var, new byte[0]);
        }
    }

    public final boolean C() {
        h();
        j();
        return !y() || this.f26328a.C().W() >= ((Integer) z4.K0.b(null)).intValue();
    }

    public final boolean D() {
        h();
        j();
        return !y() || this.f26328a.C().W() >= 241200;
    }

    public final /* synthetic */ void E() {
        d5 d5Var = this.f26691d;
        if (d5Var == null) {
            this.f26328a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr V = V(false);
            n9.m.l(V);
            d5Var.P(V);
            J();
        } catch (RemoteException e10) {
            this.f26328a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void F() {
        d5 d5Var = this.f26691d;
        if (d5Var == null) {
            this.f26328a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr V = V(false);
            n9.m.l(V);
            d5Var.c0(V);
            J();
        } catch (RemoteException e10) {
            this.f26328a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void G(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        d5 d5Var;
        synchronized (atomicReference) {
            try {
                d5Var = this.f26691d;
            } catch (RemoteException e10) {
                this.f26328a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (d5Var == null) {
                this.f26328a.a().o().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            n9.m.l(zzrVar);
            d5Var.g1(zzrVar, bundle, new lb(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void H(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        d5 d5Var;
        synchronized (atomicReference) {
            try {
                d5Var = this.f26691d;
            } catch (RemoteException e10) {
                this.f26328a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (d5Var == null) {
                this.f26328a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            n9.m.l(zzrVar);
            d5Var.H(zzrVar, zzooVar, new mb(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void I(zzr zzrVar, zzaf zzafVar) {
        d5 d5Var = this.f26691d;
        if (d5Var == null) {
            this.f26328a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            d5Var.u1(zzrVar, zzafVar);
            J();
        } catch (RemoteException e10) {
            this.f26328a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.f7455f), e10);
        }
    }

    public final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f26691d != null) {
            this.f26691d = null;
            this.f26328a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    public final /* synthetic */ nc M() {
        return this.f26690c;
    }

    public final /* synthetic */ d5 N() {
        return this.f26691d;
    }

    public final /* synthetic */ void O(d5 d5Var) {
        this.f26691d = null;
    }

    public final /* synthetic */ ScheduledExecutorService P() {
        return this.f26694g;
    }

    public final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f26694g = scheduledExecutorService;
    }

    public final boolean R() {
        this.f26328a.c();
        return true;
    }

    public final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f26696i;
        long size = list.size();
        g7 g7Var = this.f26328a;
        g7Var.w();
        if (size >= 1000) {
            g7Var.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f26697j.b(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        w();
    }

    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        u5 w5 = this.f26328a.a().w();
        List list = this.f26696i;
        w5.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f26328a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f26696i.clear();
        this.f26697j.d();
    }

    public final zzr V(boolean z10) {
        Pair b;
        g7 g7Var = this.f26328a;
        g7Var.c();
        k5 L = this.f26328a.L();
        String str = null;
        if (z10) {
            g7 g7Var2 = g7Var.a().f26328a;
            if (g7Var2.x().f26373e != null && (b = g7Var2.x().f26373e.b()) != null && b != k6.A) {
                String valueOf = String.valueOf(b.second);
                String str2 = (String) b.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return L.o(str);
    }

    public final boolean W() {
        h();
        j();
        return this.f26691d != null;
    }

    public final void X() {
        h();
        j();
        T(new yb(this, V(true)));
    }

    public final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new zb(this, V(false)));
        }
    }

    public final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: nb.sc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                tc.this.E();
            }
        });
    }

    public final void a0() {
        h();
        j();
        T(new Runnable() { // from class: nb.oc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                tc.this.F();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(nb.d5 r59, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r60, com.google.android.gms.measurement.internal.zzr r61) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.tc.b0(nb.d5, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void c0(zzbg zzbgVar, String str) {
        n9.m.l(zzbgVar);
        h();
        j();
        R();
        T(new ac(this, true, V(true), this.f26328a.E().p(zzbgVar), zzbgVar, str));
    }

    public final void d0(zzah zzahVar) {
        n9.m.l(zzahVar);
        h();
        j();
        this.f26328a.c();
        T(new bc(this, true, V(true), this.f26328a.E().r(zzahVar), new zzah(zzahVar), zzahVar));
    }

    public final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new cc(this, atomicReference, null, str2, str3, V(false)));
    }

    public final void f0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2) {
        h();
        j();
        T(new dc(this, str, str2, V(false), x1Var));
    }

    public final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new ec(this, atomicReference, null, str2, str3, V(false), z10));
    }

    public final void h0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2, boolean z10) {
        h();
        j();
        T(new kb(this, str, str2, V(false), z10, x1Var));
    }

    public final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final zzr V = V(false);
        T(new Runnable() { // from class: nb.pc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                tc.this.G(atomicReference, V, bundle);
            }
        });
    }

    public final void j0(final AtomicReference atomicReference, final zzoo zzooVar) {
        h();
        j();
        final zzr V = V(false);
        T(new Runnable() { // from class: nb.qc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                tc.this.H(atomicReference, V, zzooVar);
            }
        });
    }

    public final void k0(final zzaf zzafVar) {
        h();
        j();
        final zzr V = V(true);
        n9.m.l(V);
        T(new Runnable() { // from class: nb.rc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                tc.this.I(V, zzafVar);
            }
        });
    }

    public final zzao l0() {
        h();
        j();
        d5 d5Var = this.f26691d;
        if (d5Var == null) {
            w();
            this.f26328a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr V = V(false);
        n9.m.l(V);
        try {
            zzao C1 = d5Var.C1(V);
            J();
            return C1;
        } catch (RemoteException e10) {
            this.f26328a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o(zzpl zzplVar) {
        h();
        j();
        R();
        T(new nb(this, V(true), this.f26328a.E().q(zzplVar), zzplVar));
    }

    public final void p() {
        h();
        j();
        zzr V = V(false);
        R();
        this.f26328a.E().o();
        T(new ob(this, V));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new pb(this, atomicReference, V(false)));
    }

    public final void r(com.google.android.gms.internal.measurement.x1 x1Var) {
        h();
        j();
        T(new qb(this, V(false), x1Var));
    }

    public final void s() {
        h();
        j();
        zzr V = V(true);
        R();
        this.f26328a.w().H(null, z4.f26859c1);
        this.f26328a.E().u();
        T(new rb(this, V, true));
    }

    public final void t() {
        h();
        j();
        T(new sb(this, V(true)));
    }

    public final void u(bb bbVar) {
        h();
        j();
        T(new ub(this, bbVar));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        zzbe zzbeVar = new zzbe(bundle);
        R();
        T(new vb(this, true, V(false), this.f26328a.w().H(null, z4.f26859c1) && this.f26328a.E().s(zzbeVar), zzbeVar, bundle));
    }

    public final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f26690c.c();
            return;
        }
        g7 g7Var = this.f26328a;
        if (g7Var.w().m()) {
            return;
        }
        g7Var.c();
        List<ResolveInfo> queryIntentServices = g7Var.d().getPackageManager().queryIntentServices(new Intent().setClassName(g7Var.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            g7Var.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context d10 = g7Var.d();
        g7Var.c();
        intent.setComponent(new ComponentName(d10, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f26690c.a(intent);
    }

    public final Boolean x() {
        return this.f26692e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.tc.y():boolean");
    }

    public final void z(d5 d5Var) {
        h();
        n9.m.l(d5Var);
        this.f26691d = d5Var;
        J();
        L();
    }
}
