package nb;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g7 implements l8 {
    public static volatile g7 E;
    public int A;
    public int B;
    public final long D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f26234a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final f f26235c;

    /* renamed from: d, reason: collision with root package name */
    public final k f26236d;

    /* renamed from: e, reason: collision with root package name */
    public final k6 f26237e;

    /* renamed from: f, reason: collision with root package name */
    public final w5 f26238f;

    /* renamed from: g, reason: collision with root package name */
    public final c7 f26239g;

    /* renamed from: h, reason: collision with root package name */
    public final ld f26240h;

    /* renamed from: i, reason: collision with root package name */
    public final ve f26241i;

    /* renamed from: j, reason: collision with root package name */
    public final p5 f26242j;

    /* renamed from: k, reason: collision with root package name */
    public final u9.e f26243k;

    /* renamed from: l, reason: collision with root package name */
    public final jb f26244l;

    /* renamed from: m, reason: collision with root package name */
    public final qa f26245m;

    /* renamed from: n, reason: collision with root package name */
    public final y1 f26246n;

    /* renamed from: o, reason: collision with root package name */
    public final va f26247o;

    /* renamed from: p, reason: collision with root package name */
    public final String f26248p;

    /* renamed from: q, reason: collision with root package name */
    public n5 f26249q;

    /* renamed from: r, reason: collision with root package name */
    public tc f26250r;

    /* renamed from: s, reason: collision with root package name */
    public z f26251s;

    /* renamed from: t, reason: collision with root package name */
    public k5 f26252t;

    /* renamed from: u, reason: collision with root package name */
    public xa f26253u;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f26255w;

    /* renamed from: x, reason: collision with root package name */
    public long f26256x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Boolean f26257y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f26258z;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26254v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public g7(x8 x8Var) {
        n9.m.l(x8Var);
        Context context = x8Var.f26807a;
        f fVar = new f(context);
        this.f26235c = fVar;
        s4.f26643a = fVar;
        this.f26234a = context;
        this.b = x8Var.f26810e;
        this.f26257y = x8Var.b;
        this.f26248p = x8Var.f26812g;
        this.f26258z = true;
        com.google.android.gms.internal.measurement.l9.b(context);
        u9.e c10 = u9.h.c();
        this.f26243k = c10;
        Long l10 = x8Var.f26811f;
        this.D = l10 != null ? l10.longValue() : c10.a();
        this.f26236d = new k(this);
        k6 k6Var = new k6(this);
        k6Var.m();
        this.f26237e = k6Var;
        w5 w5Var = new w5(this);
        w5Var.m();
        this.f26238f = w5Var;
        ve veVar = new ve(this);
        veVar.m();
        this.f26241i = veVar;
        this.f26242j = new p5(new w8(x8Var, this));
        this.f26246n = new y1(this);
        jb jbVar = new jb(this);
        jbVar.k();
        this.f26244l = jbVar;
        qa qaVar = new qa(this);
        qaVar.k();
        this.f26245m = qaVar;
        ld ldVar = new ld(this);
        ldVar.k();
        this.f26240h = ldVar;
        va vaVar = new va(this);
        vaVar.m();
        this.f26247o = vaVar;
        c7 c7Var = new c7(this);
        c7Var.m();
        this.f26239g = c7Var;
        zzdd zzddVar = x8Var.f26809d;
        boolean z10 = zzddVar == null || zzddVar.f7021g == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(qaVar);
            if (qaVar.f26328a.f26234a.getApplicationContext() instanceof Application) {
                Application application = (Application) qaVar.f26328a.f26234a.getApplicationContext();
                if (qaVar.f26594c == null) {
                    qaVar.f26594c = new da(qaVar);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(qaVar.f26594c);
                    application.registerActivityLifecycleCallbacks(qaVar.f26594c);
                    w5 w5Var2 = qaVar.f26328a.f26238f;
                    u(w5Var2);
                    w5Var2.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(w5Var);
            w5Var.r().a("Application context is not an Application");
        }
        c7Var.t(new e7(this, x8Var));
    }

    public static g7 O(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.f7023i;
            zzddVar = new zzdd(zzddVar.f7020f, zzddVar.f7021g, zzddVar.f7022h, bundle2, null);
        }
        n9.m.l(context);
        n9.m.l(context.getApplicationContext());
        if (E == null) {
            synchronized (g7.class) {
                try {
                    if (E == null) {
                        E = new g7(new x8(context, zzddVar, l10));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.f7023i) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            n9.m.l(E);
            E.f26257y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        n9.m.l(E);
        return E;
    }

    public static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void r(a4 a4Var) {
        if (a4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void s(j8 j8Var) {
        if (j8Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void t(b5 b5Var) {
        if (b5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!b5Var.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b5Var.getClass())));
        }
    }

    public static final void u(k8 k8Var) {
        if (k8Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!k8Var.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(k8Var.getClass())));
        }
    }

    public final c7 A() {
        return this.f26239g;
    }

    public final qa B() {
        qa qaVar = this.f26245m;
        t(qaVar);
        return qaVar;
    }

    public final ve C() {
        ve veVar = this.f26241i;
        s(veVar);
        return veVar;
    }

    public final p5 D() {
        return this.f26242j;
    }

    public final n5 E() {
        t(this.f26249q);
        return this.f26249q;
    }

    public final va F() {
        va vaVar = this.f26247o;
        u(vaVar);
        return vaVar;
    }

    public final boolean G() {
        return this.b;
    }

    public final String H() {
        return this.f26248p;
    }

    public final jb I() {
        jb jbVar = this.f26244l;
        t(jbVar);
        return jbVar;
    }

    public final tc J() {
        t(this.f26250r);
        return this.f26250r;
    }

    public final z K() {
        u(this.f26251s);
        return this.f26251s;
    }

    public final k5 L() {
        t(this.f26252t);
        return this.f26252t;
    }

    public final y1 M() {
        y1 y1Var = this.f26246n;
        r(y1Var);
        return y1Var;
    }

    public final xa N() {
        r(this.f26253u);
        return this.f26253u;
    }

    public final void P(boolean z10) {
        this.f26257y = Boolean.valueOf(z10);
    }

    @Override // nb.l8
    public final w5 a() {
        w5 w5Var = this.f26238f;
        u(w5Var);
        return w5Var;
    }

    @Override // nb.l8
    public final c7 b() {
        c7 c7Var = this.f26239g;
        u(c7Var);
        return c7Var;
    }

    @Override // nb.l8
    public final f c() {
        return this.f26235c;
    }

    @Override // nb.l8
    public final Context d() {
        return this.f26234a;
    }

    @Override // nb.l8
    public final u9.e e() {
        return this.f26243k;
    }

    public final boolean f() {
        return this.f26257y != null && this.f26257y.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        c7 c7Var = this.f26239g;
        u(c7Var);
        c7Var.h();
        k kVar = this.f26236d;
        if (kVar.L()) {
            return 1;
        }
        u(c7Var);
        c7Var.h();
        if (!this.f26258z) {
            return 8;
        }
        k6 k6Var = this.f26237e;
        s(k6Var);
        Boolean t8 = k6Var.t();
        if (t8 != null) {
            return t8.booleanValue() ? 0 : 3;
        }
        f fVar = kVar.f26328a.f26235c;
        Boolean J = kVar.J("firebase_analytics_collection_enabled");
        return J != null ? J.booleanValue() ? 0 : 4 : (this.f26257y == null || this.f26257y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z10) {
        c7 c7Var = this.f26239g;
        u(c7Var);
        c7Var.h();
        this.f26258z = z10;
    }

    public final boolean j() {
        c7 c7Var = this.f26239g;
        u(c7Var);
        c7Var.h();
        return this.f26258z;
    }

    public final void k() {
        this.A++;
    }

    public final void l() {
        this.C.incrementAndGet();
    }

    public final boolean m() {
        if (!this.f26254v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        c7 c7Var = this.f26239g;
        u(c7Var);
        c7Var.h();
        Boolean bool = this.f26255w;
        if (bool == null || this.f26256x == 0 || (!bool.booleanValue() && Math.abs(this.f26243k.b() - this.f26256x) > 1000)) {
            this.f26256x = this.f26243k.b();
            ve veVar = this.f26241i;
            s(veVar);
            boolean z10 = false;
            if (veVar.M("android.permission.INTERNET")) {
                s(veVar);
                if (veVar.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f26234a;
                    if (w9.c.a(context).f() || this.f26236d.m() || (ve.j0(context) && ve.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z10);
            this.f26255w = valueOf;
            if (valueOf.booleanValue()) {
                s(veVar);
                this.f26255w = Boolean.valueOf(veVar.o(L().r()));
            }
        }
        return this.f26255w.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r3.W() >= 234200) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.g7.n():boolean");
    }

    public final /* synthetic */ void o(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        if (i10 == 200 || i10 == 204) {
            i11 = i10;
        } else {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
                w5 w5Var = this.f26238f;
                u(w5Var);
                w5Var.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
            }
        }
        if (th2 == null) {
            k6 k6Var = this.f26237e;
            s(k6Var);
            k6Var.f26389u.b(true);
            if (bArr == null || bArr.length == 0) {
                w5 w5Var2 = this.f26238f;
                u(w5Var2);
                w5Var2.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    w5 w5Var3 = this.f26238f;
                    u(w5Var3);
                    w5Var3.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                ve veVar = this.f26241i;
                s(veVar);
                g7 g7Var = veVar.f26328a;
                if (!TextUtils.isEmpty(optString)) {
                    Context context = g7Var.f26234a;
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle.putString("gad_source", optString4);
                        }
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f26245m.t("auto", "_cmp", bundle);
                        s(veVar);
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = veVar.f26328a.f26234a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e10) {
                            w5 w5Var4 = veVar.f26328a.f26238f;
                            u(w5Var4);
                            w5Var4.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                w5 w5Var5 = this.f26238f;
                u(w5Var5);
                w5Var5.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (JSONException e11) {
                w5 w5Var6 = this.f26238f;
                u(w5Var6);
                w5Var6.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        w5 w5Var7 = this.f26238f;
        u(w5Var7);
        w5Var7.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public final /* synthetic */ void p(x8 x8Var) {
        c7 c7Var = this.f26239g;
        u(c7Var);
        c7Var.h();
        k kVar = this.f26236d;
        kVar.u();
        z zVar = new z(this);
        zVar.m();
        this.f26251s = zVar;
        zzdd zzddVar = x8Var.f26809d;
        k5 k5Var = new k5(this, x8Var.f26808c, zzddVar == null ? 0L : zzddVar.f7020f);
        k5Var.k();
        this.f26252t = k5Var;
        n5 n5Var = new n5(this);
        n5Var.k();
        this.f26249q = n5Var;
        tc tcVar = new tc(this);
        tcVar.k();
        this.f26250r = tcVar;
        ve veVar = this.f26241i;
        veVar.n();
        this.f26237e.n();
        this.f26252t.l();
        xa xaVar = new xa(this);
        xaVar.k();
        this.f26253u = xaVar;
        xaVar.l();
        w5 w5Var = this.f26238f;
        u(w5Var);
        u5 u8 = w5Var.u();
        kVar.A();
        u8.b("App measurement initialized, version", 133005L);
        u(w5Var);
        w5Var.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q10 = k5Var.q();
        s(veVar);
        if (veVar.P(q10, kVar.R())) {
            u(w5Var);
            w5Var.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(w5Var);
            w5Var.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(q10)));
        }
        u(w5Var);
        w5Var.v().a("Debug-level message logging enabled");
        int i10 = this.A;
        AtomicInteger atomicInteger = this.C;
        if (i10 != atomicInteger.get()) {
            u(w5Var);
            w5Var.o().c("Not all components initialized", Integer.valueOf(this.A), Integer.valueOf(atomicInteger.get()));
        }
        this.f26254v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r1.G() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.google.android.gms.internal.measurement.zzdd r14) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.g7.v(com.google.android.gms.internal.measurement.zzdd):void");
    }

    public final k w() {
        return this.f26236d;
    }

    public final k6 x() {
        k6 k6Var = this.f26237e;
        s(k6Var);
        return k6Var;
    }

    public final w5 y() {
        w5 w5Var = this.f26238f;
        if (w5Var == null || !w5Var.k()) {
            return null;
        }
        return w5Var;
    }

    public final ld z() {
        ld ldVar = this.f26240h;
        t(ldVar);
        return ldVar;
    }
}
