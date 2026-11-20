package com.roblox.client;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import bk.e;
import com.roblox.client.analytics.TelemetryFlushWorker;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.d;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.memstorage.MemStorage;
import e.x;
import ek.a0;
import ek.q;
import ek.t;
import hj.r;
import oi.h;
import rg.a1;
import rg.e2;
import rg.j0;
import rg.q0;
import rg.t0;
import rg.y;
import ti.b;
import ug.j;
import ug.m;
import yj.k0;

/* loaded from: classes2.dex */
public abstract class a extends com.roblox.client.b implements e.b {
    public static int R;
    public androidx.appcompat.app.a I;
    public androidx.appcompat.app.a J;
    public androidx.appcompat.app.a K;
    public ProgressDialog L;
    public boolean M = false;
    public ki.c N = Q1();
    public ah.a O = new ah.a();
    public Toolbar P;
    public bk.e Q;

    /* renamed from: com.roblox.client.a$a, reason: collision with other inner class name */
    public class C0136a implements h.d {
        public C0136a() {
        }

        @Override // oi.h.d
        public void a(boolean z10) {
            if (!z10) {
                q.h("rbx.locale", "Retrieved locale same as current locale");
            } else {
                q.h("rbx.locale", "(OnAppResume) Recreating activity due to Locale change.");
                a.this.recreate();
            }
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a.this.I = null;
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d.e f8962a;
        public final /* synthetic */ Activity b;

        public c(d.e eVar, Activity activity, g gVar) {
            this.f8962a = eVar;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            a0.d(this.b);
            a.this.g2(true, null);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d(g gVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    public class e implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d.e f8965a;
        public final /* synthetic */ Activity b;

        public e(d.e eVar, Activity activity, g gVar) {
            this.f8965a = eVar;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            a0.d(this.b);
        }
    }

    public static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8967a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f8967a = iArr;
            try {
                iArr[ml.a.f24590c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8967a[ml.a.f24592e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8967a[ml.a.f24591d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface g {
    }

    public boolean N1() {
        boolean j10 = e2.j(this);
        boolean z10 = !j10;
        if (!j10) {
            e2();
        }
        return z10;
    }

    public void O1() {
        U1();
        if (this.J == null) {
            this.J = new a.C0009a(this).p(q0.V).g(q0.R).d(false).a();
        }
        if (this.J.isShowing()) {
            return;
        }
        this.J.show();
    }

    public boolean P1() {
        return false;
    }

    public ki.c Q1() {
        return new ki.c();
    }

    public boolean R1() {
        return a1.U(this).getBoolean("ROBLOXCrash", false);
    }

    public final void S1(androidx.appcompat.app.a aVar) {
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        aVar.dismiss();
    }

    public void T1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.L.dismiss();
        this.L = null;
    }

    public final void U1() {
        S1(this.I);
        this.I = null;
    }

    public final String V1() {
        return getString(q0.E);
    }

    public ki.c W1() {
        return this.N;
    }

    public void X1(b.d dVar) {
        q.h("RobloxActivity", "navigateToPostLogoutUI: logoutType = " + dVar + ", foreground = " + J1());
        q.h("RobloxActivity", "navigateToPostLogoutUI: [New Startup] Launch Main activity...");
        startActivity(y.h().i(this));
        if (dVar != b.d.LOGOUT_BY_USER_IN_LUA) {
            q.h("RobloxActivity", "navigateToPostLogoutUI: notify Lua about this 401 logout condition");
            MemStorage.fire("NativeShellEvent", "NETWORK_ERROR_401");
        }
    }

    public final void Y1() {
        super.setContentView(this.N.j(LayoutInflater.from(this), this));
    }

    public final void Z1(int i10) {
        Y1();
        LayoutInflater.from(this).inflate(i10, this.N.g());
    }

    public void a0(ml.a aVar) {
        q.b("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + aVar);
        Toolbar toolbar = this.P;
        if (toolbar instanceof RobloxToolbar) {
            ((RobloxToolbar) toolbar).a0(aVar);
        }
        if (this.N != null) {
            int i10 = f.f8967a[aVar.ordinal()];
            this.N.l(i10 != 1 ? i10 != 2 ? getResources().getColor(j0.f30309g) : getResources().getColor(j0.f30304a) : getResources().getColor(j0.f30315m));
        }
        b2(aVar);
    }

    public final void a2(View view, ViewGroup.LayoutParams layoutParams) {
        Y1();
        this.N.g().addView(view, layoutParams);
    }

    public final void b2(ml.a aVar) {
        boolean z10 = aVar != ml.a.f24590c;
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        getWindow().getDecorView().setSystemUiVisibility(z10 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        if (a1.k0()) {
            getWindow().setStatusBarColor(f.f8967a[aVar.ordinal()] != 1 ? getResources().getColor(j0.f30309g) : getResources().getColor(j0.f30315m));
        }
        getWindow().setNavigationBarColor(getResources().getColor(j0.f30307e));
    }

    public void c2() {
        View decorView = getWindow().getDecorView();
        if (rh.h.a().G()) {
            x.a(this);
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        this.E.e(decorView);
    }

    public void d2(Context context) {
        String string = getString(q0.f30488p);
        String string2 = getString(q0.f30491q);
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(string);
        progressDialog.setMessage(string2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        this.L = progressDialog;
        progressDialog.show();
    }

    public final void e2() {
        androidx.appcompat.app.a aVar = this.I;
        if (aVar == null) {
            androidx.appcompat.app.a d10 = e2.d(this, getResources().getString(q0.S));
            this.I = d10;
            d10.setOnDismissListener(new b());
        } else if (aVar.isShowing()) {
            q.b("RobloxActivity", "A network-disconnected alert already exists. Do nothing.");
        } else {
            this.I.show();
        }
    }

    public void f2(boolean z10) {
        g2(z10, null);
    }

    public void g2(boolean z10, g gVar) {
        if (a1.q0()) {
            ek.x.a(this, q0.X);
            if (z10) {
                finish();
                return;
            }
            return;
        }
        S1(this.I);
        S1(this.K);
        getPackageName();
        d.e d10 = com.roblox.client.d.e().d();
        String string = t.j() ? getString(q0.f30476l) : getString(q0.f30482n, V1());
        if (z10) {
            S1(this.J);
            if (ah.a.a(getIntent())) {
                this.O.b(this, true, d10);
                return;
            }
            this.K = new a.C0009a(this).p(q0.f30479m).h(string).m(q0.f30470j, new c(d10, this, gVar)).a();
        } else {
            this.K = new a.C0009a(this).p(q0.f30479m).h(string).m(q0.f30470j, new e(d10, this, gVar)).i(q0.f30467i, new d(gVar)).a();
        }
        this.K.setCancelable(false);
        androidx.appcompat.app.a aVar = this.K;
    }

    public final void h2() {
        q.h("rbx.locale", "using new api on app resume. mIsAppResumedFromColdStart: " + this.M);
        new h().c(this, new C0136a());
    }

    @Override // e4.q, e.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        q.b("RobloxActivity", "onActivityResult: requestCode = " + i10);
        if (i10 != 20103) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i11 != -1) {
            q.h("RobloxActivity", "Sharing dialog dismissed.");
            ti.g.b().q("Android-AppMain-GameShare-ChooserDismissed");
            return;
        }
        String packageName = intent.getComponent().getPackageName();
        q.h("RobloxActivity", "Sharing with=" + packageName + ".");
        startActivity(intent);
        t0.y(packageName);
        ti.g.b().q("Android-AppMain-GameShare-AppSelected");
    }

    @Override // com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (k0.B()) {
            q.h("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
            return;
        }
        if (rh.h.a().M1()) {
            q.h("RobloxActivity", "GameActivity = ON. Return!");
            super.onCreate(bundle);
            return;
        }
        ti.b.f().k(this);
        boolean z10 = this instanceof ActivitySplash;
        boolean m10 = com.roblox.client.startup.a.m();
        if (!m10 && !z10) {
            q.h("RobloxActivity", "onCreate ... settingsLoaded = false. Load from preferences!!!");
            com.roblox.client.startup.a.s(this);
        }
        oi.b.f().u(this);
        ti.e.c().d(this);
        super.onCreate(bundle);
        q.b("RobloxActivity", "activity onCreate, name = " + getClass().getSimpleName());
        E1();
        c2();
        if (!m10 && !P1()) {
            q.h("RobloxActivity", "onCreate: no AppSettings in activity:" + getClass().getSimpleName() + ". Finish self!");
            finish();
        }
        this.M = true;
        bk.e eVar = new bk.e(this);
        this.Q = eVar;
        eVar.b(this);
    }

    @Override // com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onDestroy() {
        if (k0.B()) {
            q.h("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onDestroy();
        } else {
            super.onDestroy();
            U1();
            S1(this.J);
        }
    }

    @Override // com.roblox.client.b, e4.q, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.roblox.client.b, e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        r.k().s(this);
    }

    @Override // com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        if (mh.b.a() && a1.x0()) {
            q.k("RobloxActivity", "Alert: needs restart");
            O1();
        }
        int i10 = R;
        R = i10 + 1;
        if (i10 == 0) {
            ti.b.f().q(true);
            a1.U(this).edit().putBoolean("ROBLOXCrash", true).apply();
            if (!this.M) {
                h2();
            }
        }
        ti.g.b().i0();
        this.M = false;
    }

    @Override // com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        int i10 = R - 1;
        R = i10;
        if (i10 == 0) {
            ti.b.f().q(false);
            NativeReportingInterface.stopPushNotificationSession();
            a1.U(this).edit().remove("ROBLOXCrash").apply();
            q.h("RobloxActivity", "The Shell is in background.");
            j.q().s();
            j.q().r();
            m.i(false);
            if (rh.h.a().B1()) {
                boolean O2 = rh.h.a().O2();
                boolean f10 = rh.h.a().f();
                if (O2 || f10) {
                    TelemetryFlushWorker.d(this);
                }
            }
        }
        super.onStop();
    }

    @Override // j.b, e.p, android.app.Activity
    public void setContentView(int i10) {
        Z1(i10);
    }

    @Override // j.b, e.p, android.app.Activity
    public void setContentView(View view) {
        a2(view, null);
    }

    @Override // j.b, e.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a2(view, layoutParams);
    }
}
