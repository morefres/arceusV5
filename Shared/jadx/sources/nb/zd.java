package nb;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zd extends td {
    public zd(me meVar) {
        super(meVar);
    }

    private final String k(String str) {
        String x10 = this.b.D0().x(str);
        if (TextUtils.isEmpty(x10)) {
            return (String) z4.f26897r.b(null);
        }
        Uri parse = Uri.parse((String) z4.f26897r.b(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(x10).length() + 1 + String.valueOf(authority).length());
        sb2.append(x10);
        sb2.append(".");
        sb2.append(authority);
        buildUpon.authority(sb2.toString());
        return buildUpon.build().toString();
    }

    public static final boolean l(String str) {
        String str2 = (String) z4.f26901t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final yd i(String str) {
        c6 J0;
        me meVar = this.b;
        c6 J02 = meVar.F0().J0(str);
        yd ydVar = null;
        if (J02 == null || !J02.V()) {
            return new yd(k(str), Collections.EMPTY_MAP, za.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.i7 G = com.google.android.gms.internal.measurement.p7.G();
        G.z(2);
        G.x((com.google.android.gms.internal.measurement.k7) n9.m.l(com.google.android.gms.internal.measurement.k7.a(J02.M())));
        String p02 = J02.p0();
        com.google.android.gms.internal.measurement.g5 w5 = meVar.D0().w(str);
        if (w5 == null || (J0 = meVar.F0().J0(str)) == null || ((!w5.V() || w5.W().H() != 100) && !this.f26328a.C().P(str, J0.l0()) && (TextUtils.isEmpty(p02) || Math.abs(p02.hashCode() % 100) >= w5.W().H()))) {
            G.A(3);
            return new yd(k(str), Collections.EMPTY_MAP, za.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.p7) G.t());
        }
        String o02 = J02.o0();
        G.z(2);
        com.google.android.gms.internal.measurement.g5 w10 = meVar.D0().w(J02.o0());
        if (w10 == null || !w10.V()) {
            this.f26328a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", o02);
            G.A(4);
        } else {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(J02.l0())) {
                hashMap.put("x-gtm-server-preview", J02.l0());
            }
            String J = w10.W().J();
            com.google.android.gms.internal.measurement.k7 a10 = com.google.android.gms.internal.measurement.k7.a(J02.M());
            if (a10 != null && a10 != com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE) {
                G.x(a10);
            } else if (l(J02.o0())) {
                G.x(com.google.android.gms.internal.measurement.k7.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(J)) {
                G.x(com.google.android.gms.internal.measurement.k7.MISSING_SGTM_SERVER_URL);
            } else {
                this.f26328a.a().w().b("[sgtm] Eligible for client side upload. appId", o02);
                G.z(3);
                G.x(com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE);
                ydVar = new yd(J, hashMap, za.SGTM_CLIENT, (com.google.android.gms.internal.measurement.p7) G.t());
            }
            w10.W().F();
            w10.W().G();
            g7 g7Var = this.f26328a;
            g7Var.c();
            if (TextUtils.isEmpty(J)) {
                G.A(6);
                g7Var.a().w().b("[sgtm] Local service, missing sgtm_server_url", J02.o0());
            } else {
                g7Var.a().w().b("[sgtm] Eligible for local service direct upload. appId", o02);
                G.z(5);
                G.A(2);
                ydVar = new yd(J, hashMap, za.SGTM, (com.google.android.gms.internal.measurement.p7) G.t());
            }
        }
        return ydVar != null ? ydVar : new yd(k(str), Collections.EMPTY_MAP, za.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.p7) G.t());
    }

    public final boolean j(String str, com.google.android.gms.internal.measurement.k7 k7Var) {
        com.google.android.gms.internal.measurement.g5 w5;
        h();
        return (k7Var != com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE || l(str) || (w5 = this.b.D0().w(str)) == null || !w5.V() || w5.W().J().isEmpty()) ? false : true;
    }
}
