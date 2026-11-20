package nb;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class k extends j8 {
    public Boolean b;

    /* renamed from: c, reason: collision with root package name */
    public String f26349c;

    /* renamed from: d, reason: collision with root package name */
    public j f26350d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26351e;

    public k(g7 g7Var) {
        super(g7Var);
        this.f26350d = new j() { // from class: nb.i
            @Override // nb.j
            public final /* synthetic */ String f(String str, String str2) {
                return null;
            }
        };
    }

    public static final long n() {
        return ((Long) z4.f26863e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) z4.f26878j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) z4.f26884l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) z4.S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) z4.N.b(null)).longValue();
    }

    public final long A() {
        this.f26328a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f26351e == null) {
            synchronized (this) {
                try {
                    if (this.f26351e == null) {
                        g7 g7Var = this.f26328a;
                        ApplicationInfo applicationInfo = g7Var.d().getApplicationInfo();
                        String a10 = u9.n.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(a10)) {
                                z10 = true;
                            }
                            this.f26351e = Boolean.valueOf(z10);
                        }
                        if (this.f26351e == null) {
                            this.f26351e = Boolean.TRUE;
                            g7Var.a().o().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f26351e.booleanValue();
    }

    public final String C(String str, y4 y4Var) {
        return TextUtils.isEmpty(str) ? (String) y4Var.b(null) : (String) y4Var.b(this.f26350d.f(str, y4Var.a()));
    }

    public final long D(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) y4Var.b(null)).longValue();
        }
        String f10 = this.f26350d.f(str, y4Var.a());
        if (TextUtils.isEmpty(f10)) {
            return ((Long) y4Var.b(null)).longValue();
        }
        try {
            return ((Long) y4Var.b(Long.valueOf(Long.parseLong(f10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) y4Var.b(null)).longValue();
        }
    }

    public final int E(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) y4Var.b(null)).intValue();
        }
        String f10 = this.f26350d.f(str, y4Var.a());
        if (TextUtils.isEmpty(f10)) {
            return ((Integer) y4Var.b(null)).intValue();
        }
        try {
            return ((Integer) y4Var.b(Integer.valueOf(Integer.parseInt(f10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) y4Var.b(null)).intValue();
        }
    }

    public final int F(String str, y4 y4Var, int i10, int i11) {
        return Math.max(Math.min(E(str, y4Var), i11), i10);
    }

    public final double G(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
        String f10 = this.f26350d.f(str, y4Var.a());
        if (TextUtils.isEmpty(f10)) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
        try {
            return ((Double) y4Var.b(Double.valueOf(Double.parseDouble(f10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) y4Var.b(null)).booleanValue();
        }
        String f10 = this.f26350d.f(str, y4Var.a());
        return TextUtils.isEmpty(f10) ? ((Boolean) y4Var.b(null)).booleanValue() : ((Boolean) y4Var.b(Boolean.valueOf("1".equals(f10)))).booleanValue();
    }

    public final Bundle I() {
        try {
            g7 g7Var = this.f26328a;
            if (g7Var.d().getPackageManager() == null) {
                g7Var.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = w9.c.a(g7Var.d()).c(g7Var.d().getPackageName(), 128);
            if (c10 != null) {
                return c10.metaData;
            }
            g7Var.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f26328a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean J(String str) {
        n9.m.f(str);
        Bundle I = I();
        if (I == null) {
            this.f26328a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (I.containsKey(str)) {
            return Boolean.valueOf(I.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List K(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            n9.m.f(r4)
            android.os.Bundle r0 = r3.I()
            r1 = 0
            if (r0 != 0) goto L1d
            nb.g7 r4 = r3.f26328a
            nb.w5 r4 = r4.a()
            nb.u5 r4 = r4.o()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            nb.g7 r0 = r3.f26328a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.d()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            nb.g7 r0 = r3.f26328a
            nb.w5 r0 = r0.a()
            nb.u5 r0 = r0.o()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.k.K(java.lang.String):java.util.List");
    }

    public final boolean L() {
        this.f26328a.c();
        Boolean J = J("firebase_analytics_collection_deactivated");
        return J != null && J.booleanValue();
    }

    public final boolean M() {
        Boolean J = J("google_analytics_adid_collection_enabled");
        return J == null || J.booleanValue();
    }

    public final boolean N() {
        Boolean J = J("google_analytics_automatic_screen_reporting_enabled");
        return J == null || J.booleanValue();
    }

    public final n8 O(String str, boolean z10) {
        Object obj;
        n9.m.f(str);
        g7 g7Var = this.f26328a;
        Bundle I = I();
        if (I == null) {
            g7Var.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = I.get(str);
        }
        if (obj == null) {
            return n8.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return n8.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return n8.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return n8.POLICY;
        }
        g7Var.a().r().b("Invalid manifest metadata for", str);
        return n8.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean J = J("google_analytics_sgtm_upload_enabled");
        if (J == null) {
            return false;
        }
        return J.booleanValue();
    }

    public final void Q(String str) {
        this.f26349c = str;
    }

    public final String R() {
        return this.f26349c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.f26350d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f26350d.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean m() {
        if (this.b == null) {
            Boolean J = J("app_measurement_lite");
            this.b = J;
            if (J == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.f26328a.G();
    }

    public final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            n9.m.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f26328a.a().o().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f26328a.a().o().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f26328a.a().o().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f26328a.a().o().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final void t(j jVar) {
        this.f26350d = jVar;
    }

    public final String u() {
        this.f26328a.c();
        return "FA";
    }

    public final int v() {
        return this.f26328a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, z4.Y, 25, 100);
    }

    public final int x(String str, boolean z10) {
        if (z10) {
            return F(str, z4.f26876i0, 100, 500);
        }
        return 500;
    }

    public final int y(String str, boolean z10) {
        return Math.max(x(str, z10), 256);
    }

    public final int z(String str) {
        return F(str, z4.X, 500, 2000);
    }
}
