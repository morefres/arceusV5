package nb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class jb extends b5 {

    /* renamed from: c, reason: collision with root package name */
    public volatile bb f26334c;

    /* renamed from: d, reason: collision with root package name */
    public volatile bb f26335d;

    /* renamed from: e, reason: collision with root package name */
    public bb f26336e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f26337f;

    /* renamed from: g, reason: collision with root package name */
    public zzdf f26338g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f26339h;

    /* renamed from: i, reason: collision with root package name */
    public volatile bb f26340i;

    /* renamed from: j, reason: collision with root package name */
    public bb f26341j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f26342k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f26343l;

    public jb(g7 g7Var) {
        super(g7Var);
        this.f26343l = new Object();
        this.f26337f = new ConcurrentHashMap();
    }

    public final /* synthetic */ void A(Bundle bundle, bb bbVar, bb bbVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(bbVar, bbVar2, j10, true, this.f26328a.C().t(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void B(bb bbVar, bb bbVar2, long j10, boolean z10, Bundle bundle) {
        G(bbVar, bbVar2, j10, z10, null);
    }

    public final /* synthetic */ void C(bb bbVar, boolean z10, long j10) {
        o(bbVar, false, j10);
    }

    public final /* synthetic */ bb D() {
        return this.f26341j;
    }

    public final /* synthetic */ void E(bb bbVar) {
        this.f26341j = null;
    }

    public final void F(String str, bb bbVar, boolean z10) {
        bb bbVar2;
        bb bbVar3 = this.f26334c == null ? this.f26335d : this.f26334c;
        if (bbVar.b == null) {
            bbVar2 = new bb(bbVar.f26068a, str != null ? r(str, "Activity") : null, bbVar.f26069c, bbVar.f26071e, bbVar.f26072f);
        } else {
            bbVar2 = bbVar;
        }
        this.f26335d = this.f26334c;
        this.f26334c = bbVar2;
        g7 g7Var = this.f26328a;
        g7Var.b().t(new db(this, bbVar2, bbVar3, g7Var.e().b(), z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(nb.bb r15, nb.bb r16, long r17, boolean r19, android.os.Bundle r20) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r20
            r14.h()
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2a
            long r7 = r0.f26069c
            long r9 = r1.f26069c
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L2a
            java.lang.String r7 = r1.b
            java.lang.String r8 = r0.b
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto L2a
            java.lang.String r7 = r1.f26068a
            java.lang.String r8 = r0.f26068a
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 != 0) goto L2c
        L2a:
            r7 = r6
            goto L2d
        L2c:
            r7 = r5
        L2d:
            if (r19 == 0) goto L34
            nb.bb r8 = r14.f26336e
            if (r8 == 0) goto L34
            r5 = r6
        L34:
            if (r7 == 0) goto Lbf
            if (r4 == 0) goto L3f
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r4)
        L3d:
            r13 = r7
            goto L45
        L3f:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            goto L3d
        L45:
            nb.ve.k0(r15, r13, r6)
            if (r1 == 0) goto L63
            java.lang.String r4 = r1.f26068a
            if (r4 == 0) goto L53
            java.lang.String r7 = "_pn"
            r13.putString(r7, r4)
        L53:
            java.lang.String r4 = r1.b
            if (r4 == 0) goto L5c
            java.lang.String r7 = "_pc"
            r13.putString(r7, r4)
        L5c:
            long r7 = r1.f26069c
            java.lang.String r1 = "_pi"
            r13.putLong(r1, r7)
        L63:
            r7 = 0
            if (r5 == 0) goto L82
            nb.g7 r1 = r14.f26328a
            nb.ld r1 = r1.z()
            nb.jd r1 = r1.f26438f
            long r9 = r1.b
            long r9 = r2 - r9
            r1.b = r2
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L82
            nb.g7 r1 = r14.f26328a
            nb.ve r1 = r1.C()
            r1.Z(r13, r9)
        L82:
            nb.g7 r1 = r14.f26328a
            nb.k r4 = r1.w()
            boolean r4 = r4.N()
            if (r4 != 0) goto L95
            java.lang.String r4 = "_mst"
            r9 = 1
            r13.putLong(r4, r9)
        L95:
            boolean r4 = r0.f26071e
            if (r6 == r4) goto L9c
            java.lang.String r9 = "auto"
            goto L9e
        L9c:
            java.lang.String r9 = "app"
        L9e:
            u9.e r1 = r1.e()
            long r10 = r1.a()
            if (r4 == 0) goto Lb3
            r19 = r7
            long r7 = r0.f26072f
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 != 0) goto Lb1
            goto Lb3
        Lb1:
            r11 = r7
            goto Lb4
        Lb3:
            r11 = r10
        Lb4:
            nb.g7 r1 = r14.f26328a
            java.lang.String r10 = "_vs"
            nb.qa r8 = r1.B()
            r8.u(r9, r10, r11, r13)
        Lbf:
            if (r5 == 0) goto Lc6
            nb.bb r1 = r14.f26336e
            r14.o(r1, r6, r2)
        Lc6:
            r14.f26336e = r0
            boolean r1 = r0.f26071e
            if (r1 == 0) goto Lce
            r14.f26341j = r0
        Lce:
            nb.g7 r1 = r14.f26328a
            nb.tc r1 = r1.J()
            r1.u(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.jb.G(nb.bb, nb.bb, long, boolean, android.os.Bundle):void");
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o(bb bbVar, boolean z10, long j10) {
        g7 g7Var = this.f26328a;
        g7Var.M().k(g7Var.e().b());
        if (!g7Var.z().f26438f.d(bbVar != null && bbVar.f26070d, z10, j10) || bbVar == null) {
            return;
        }
        bbVar.f26070d = false;
    }

    public final bb p(@NonNull zzdf zzdfVar) {
        n9.m.l(zzdfVar);
        Integer valueOf = Integer.valueOf(zzdfVar.f7025f);
        Map map = this.f26337f;
        bb bbVar = (bb) map.get(valueOf);
        if (bbVar == null) {
            bb bbVar2 = new bb(null, r(zzdfVar.f7026g, "Activity"), this.f26328a.C().p0());
            map.put(valueOf, bbVar2);
            bbVar = bbVar2;
        }
        return this.f26340i != null ? this.f26340i : bbVar;
    }

    public final bb q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f26336e;
        }
        bb bbVar = this.f26336e;
        return bbVar != null ? bbVar : this.f26341j;
    }

    public final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = length > 0 ? split[length - 1] : "";
        g7 g7Var = this.f26328a;
        return str3.length() > g7Var.w().x(null, false) ? str3.substring(0, g7Var.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f26343l) {
            try {
                if (!this.f26342k) {
                    this.f26328a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f26328a.w().x(null, false))) {
                    this.f26328a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f26328a.w().x(null, false))) {
                    this.f26328a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = this.f26338g;
                    string2 = zzdfVar != null ? r(zzdfVar.f7026g, "Activity") : "Activity";
                }
                bb bbVar = this.f26334c;
                if (this.f26339h && bbVar != null) {
                    this.f26339h = false;
                    boolean equals = Objects.equals(bbVar.b, string2);
                    boolean equals2 = Objects.equals(bbVar.f26068a, string);
                    if (equals && equals2) {
                        this.f26328a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                g7 g7Var = this.f26328a;
                g7Var.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                bb bbVar2 = this.f26334c == null ? this.f26335d : this.f26334c;
                bb bbVar3 = new bb(string, string2, g7Var.C().p0(), true, j10);
                this.f26334c = bbVar3;
                this.f26335d = bbVar2;
                this.f26340i = bbVar3;
                g7Var.b().t(new cb(this, bundle, bbVar3, bbVar2, g7Var.e().b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void t(@NonNull zzdf zzdfVar, String str, String str2) {
        g7 g7Var = this.f26328a;
        if (!g7Var.w().N()) {
            g7Var.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        bb bbVar = this.f26334c;
        if (bbVar == null) {
            g7Var.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f26337f;
        Integer valueOf = Integer.valueOf(zzdfVar.f7025f);
        if (map.get(valueOf) == null) {
            g7Var.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(zzdfVar.f7026g, "Activity");
        }
        String str3 = bbVar.b;
        String str4 = bbVar.f26068a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            g7Var.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > g7Var.w().x(null, false))) {
            g7Var.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > g7Var.w().x(null, false))) {
            g7Var.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        g7Var.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        bb bbVar2 = new bb(str, str2, g7Var.C().p0());
        map.put(valueOf, bbVar2);
        F(zzdfVar.f7026g, bbVar2, true);
    }

    public final bb u() {
        return this.f26334c;
    }

    public final void v(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.f26328a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f26337f.put(Integer.valueOf(zzdfVar.f7025f), new bb(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(zzdf zzdfVar) {
        Object obj = this.f26343l;
        synchronized (obj) {
            this.f26342k = true;
            if (!Objects.equals(zzdfVar, this.f26338g)) {
                synchronized (obj) {
                    this.f26338g = zzdfVar;
                    this.f26339h = false;
                    g7 g7Var = this.f26328a;
                    if (g7Var.w().N()) {
                        this.f26340i = null;
                        g7Var.b().t(new ib(this));
                    }
                }
            }
        }
        g7 g7Var2 = this.f26328a;
        if (!g7Var2.w().N()) {
            this.f26334c = this.f26340i;
            g7Var2.b().t(new eb(this));
            return;
        }
        F(zzdfVar.f7026g, p(zzdfVar), false);
        y1 M = this.f26328a.M();
        g7 g7Var3 = M.f26328a;
        g7Var3.b().t(new x0(M, g7Var3.e().b()));
    }

    public final void x(zzdf zzdfVar) {
        synchronized (this.f26343l) {
            this.f26342k = false;
            this.f26339h = true;
        }
        g7 g7Var = this.f26328a;
        long b = g7Var.e().b();
        if (!g7Var.w().N()) {
            this.f26334c = null;
            g7Var.b().t(new fb(this, b));
        } else {
            bb p8 = p(zzdfVar);
            this.f26335d = this.f26334c;
            this.f26334c = null;
            g7Var.b().t(new gb(this, p8, b));
        }
    }

    public final void y(zzdf zzdfVar, Bundle bundle) {
        bb bbVar;
        if (!this.f26328a.w().N() || bundle == null || (bbVar = (bb) this.f26337f.get(Integer.valueOf(zzdfVar.f7025f))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", bbVar.f26069c);
        bundle2.putString("name", bbVar.f26068a);
        bundle2.putString("referrer_name", bbVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(zzdf zzdfVar) {
        synchronized (this.f26343l) {
            try {
                if (Objects.equals(this.f26338g, zzdfVar)) {
                    this.f26338g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f26328a.w().N()) {
            this.f26337f.remove(Integer.valueOf(zzdfVar.f7025f));
        }
    }
}
