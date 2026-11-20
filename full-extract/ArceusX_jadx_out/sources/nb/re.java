package nb;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.ig;
import com.google.android.gms.internal.measurement.vf;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import o9.a;

/* loaded from: classes.dex */
public final class re extends xd {
    public re(me meVar) {
        super(meVar);
    }

    public static final String A(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final Object B(com.google.android.gms.internal.measurement.s6 s6Var) {
        if (s6Var.H()) {
            return s6Var.J();
        }
        if (s6Var.K()) {
            return Long.valueOf(s6Var.L());
        }
        if (s6Var.P()) {
            return Double.valueOf(s6Var.Q());
        }
        if (s6Var.S() > 0) {
            return Y(s6Var.R());
        }
        return null;
    }

    public static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    public static final void D(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.f7 f7Var) {
        if (f7Var == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (f7Var.J() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : f7Var.H()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (f7Var.G() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : f7Var.F()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (f7Var.L() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.m6 m6Var : f7Var.K()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(m6Var.F() ? Integer.valueOf(m6Var.G()) : null);
                sb2.append(":");
                sb2.append(m6Var.H() ? Long.valueOf(m6Var.J()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (f7Var.O() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.h7 h7Var : f7Var.N()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(h7Var.F() ? Integer.valueOf(h7Var.G()) : null);
                sb2.append(": [");
                Iterator it = h7Var.H().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        y(sb2, 3);
        sb2.append("}\n");
    }

    public static final void E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void F(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.f4 f4Var) {
        if (f4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (f4Var.F()) {
            int S = f4Var.S();
            E(sb2, i10, "comparison_type", S != 1 ? S != 2 ? S != 3 ? S != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (f4Var.G()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(f4Var.H()));
        }
        if (f4Var.J()) {
            E(sb2, i10, "comparison_value", f4Var.K());
        }
        if (f4Var.L()) {
            E(sb2, i10, "min_comparison_value", f4Var.N());
        }
        if (f4Var.O()) {
            E(sb2, i10, "max_comparison_value", f4Var.P());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    public static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.nc W(com.google.android.gms.internal.measurement.nc ncVar, byte[] bArr) {
        com.google.android.gms.internal.measurement.ra a10 = com.google.android.gms.internal.measurement.ra.a();
        return a10 != null ? ncVar.I(bArr, a10) : ncVar.m(bArr);
    }

    public static int X(com.google.android.gms.internal.measurement.z6 z6Var, String str) {
        for (int i10 = 0; i10 < z6Var.g1(); i10++) {
            if (str.equals(z6Var.h1(i10).H())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) it.next();
            if (s6Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.s6 s6Var2 : s6Var.R()) {
                    if (s6Var2.H()) {
                        bundle.putString(s6Var2.G(), s6Var2.J());
                    } else if (s6Var2.K()) {
                        bundle.putLong(s6Var2.G(), s6Var2.L());
                    } else if (s6Var2.P()) {
                        bundle.putDouble(s6Var2.G(), s6Var2.Q());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(com.google.android.gms.internal.measurement.n6 n6Var, String str, Object obj) {
        List x10 = n6Var.x();
        int i10 = 0;
        while (true) {
            if (i10 >= x10.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.s6) x10.get(i10)).G())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.r6 T = com.google.android.gms.internal.measurement.s6.T();
        T.z(str);
        T.E(((Long) obj).longValue());
        if (i10 >= 0) {
            n6Var.D(i10, T);
        } else {
            n6Var.G(T);
        }
    }

    public static final boolean p(zzbg zzbgVar, zzr zzrVar) {
        n9.m.l(zzbgVar);
        n9.m.l(zzrVar);
        return !TextUtils.isEmpty(zzrVar.f7495g);
    }

    public static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) it.next();
            String G = s6Var.G();
            if (s6Var.P()) {
                bundle.putDouble(G, s6Var.Q());
            } else if (s6Var.N()) {
                bundle.putFloat(G, s6Var.O());
            } else if (s6Var.H()) {
                bundle.putString(G, s6Var.J());
            } else if (s6Var.K()) {
                bundle.putLong(G, s6Var.L());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.s6 r(com.google.android.gms.internal.measurement.o6 o6Var, String str) {
        for (com.google.android.gms.internal.measurement.s6 s6Var : o6Var.F()) {
            if (s6Var.G().equals(str)) {
                return s6Var;
            }
        }
        return null;
    }

    public static final Map s(com.google.android.gms.internal.measurement.o6 o6Var, String... strArr) {
        Object B;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.internal.measurement.s6 s6Var : o6Var.F()) {
            if (Arrays.asList(strArr).contains(s6Var.G()) && (B = B(s6Var)) != null) {
                hashMap.put(s6Var.G(), B);
            }
        }
        return hashMap;
    }

    public static final Map t(com.google.android.gms.internal.measurement.o6 o6Var, String str) {
        Object B;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.internal.measurement.s6 s6Var : o6Var.F()) {
            if (s6Var.G().startsWith("gad_") && (B = B(s6Var)) != null) {
                hashMap.put(s6Var.G(), B);
            }
        }
        return hashMap;
    }

    public static final Object u(com.google.android.gms.internal.measurement.o6 o6Var, String str) {
        com.google.android.gms.internal.measurement.s6 r8 = r(o6Var, str);
        if (r8 == null) {
            return null;
        }
        return B(r8);
    }

    public static final Object v(com.google.android.gms.internal.measurement.o6 o6Var, String str, Object obj) {
        Object u8 = u(o6Var, str);
        return u8 == null ? obj : u8;
    }

    public static final void y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void G(com.google.android.gms.internal.measurement.q7 q7Var, Object obj) {
        n9.m.l(obj);
        q7Var.C();
        q7Var.E();
        q7Var.J();
        if (obj instanceof String) {
            q7Var.A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            q7Var.D(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            q7Var.G(((Double) obj).doubleValue());
        } else {
            this.f26328a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void H(com.google.android.gms.internal.measurement.r6 r6Var, Object obj) {
        n9.m.l(obj);
        r6Var.D();
        r6Var.G();
        r6Var.K();
        r6Var.Q();
        if (obj instanceof String) {
            r6Var.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            r6Var.E(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            r6Var.J(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f26328a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.r6 T = com.google.android.gms.internal.measurement.s6.T();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.r6 T2 = com.google.android.gms.internal.measurement.s6.T();
                    T2.z(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        T2.E(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        T2.C((String) obj2);
                    } else if (obj2 instanceof Double) {
                        T2.J(((Double) obj2).doubleValue());
                    }
                    T.O(T2);
                }
                if (T.N() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.s6) T.t());
                }
            }
        }
        r6Var.P(arrayList);
    }

    @TargetApi(BacktraceMetrics.defaultTimeIntervalInMin)
    public final zzoh I(String str, com.google.android.gms.internal.measurement.z6 z6Var, com.google.android.gms.internal.measurement.n6 n6Var, String str2) {
        int indexOf;
        vf.a();
        g7 g7Var = this.f26328a;
        if (!g7Var.w().H(str, z4.Q0)) {
            return null;
        }
        long a10 = g7Var.e().a();
        Set a11 = qe.a(g7Var.w().C(str, z4.f26906v0).split(","));
        me meVar = this.b;
        zd C0 = meVar.C0();
        String x10 = C0.b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        g7 g7Var2 = C0.f26328a;
        builder.scheme(g7Var2.w().C(str, z4.f26892o0));
        if (TextUtils.isEmpty(x10)) {
            builder.authority(g7Var2.w().C(str, z4.f26894p0));
        } else {
            String C = g7Var2.w().C(str, z4.f26894p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(x10).length() + 1 + String.valueOf(C).length());
            sb2.append(x10);
            sb2.append(".");
            sb2.append(C);
            builder.authority(sb2.toString());
        }
        builder.path(g7Var2.w().C(str, z4.f26896q0));
        z(builder, "gmp_app_id", z6Var.y0(), a11);
        g7Var.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), a11);
        String Z = z6Var.Z();
        k w5 = g7Var.w();
        y4 y4Var = z4.T0;
        if (w5.H(str, y4Var) && meVar.D0().N(str)) {
            Z = "";
        }
        z(builder, "app_instance_id", Z, a11);
        z(builder, "rdid", z6Var.T(), a11);
        z(builder, "bundle_id", z6Var.O(), a11);
        String O = n6Var.O();
        String a12 = r8.a(O);
        if (true != TextUtils.isEmpty(a12)) {
            O = a12;
        }
        z(builder, "app_event_name", O, a11);
        z(builder, "app_version", String.valueOf(z6Var.E0()), a11);
        String C2 = z6Var.C();
        if (g7Var.w().H(str, y4Var) && meVar.D0().K(str) && !TextUtils.isEmpty(C2) && (indexOf = C2.indexOf(".")) != -1) {
            C2 = C2.substring(0, indexOf);
        }
        z(builder, "os_version", C2, a11);
        z(builder, "timestamp", String.valueOf(n6Var.R()), a11);
        if (z6Var.W()) {
            z(builder, "lat", "1", a11);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(z6Var.l0()), a11);
        z(builder, "trigger_uri_source", "1", a11);
        z(builder, "trigger_uri_timestamp", String.valueOf(a10), a11);
        z(builder, "request_uuid", str2, a11);
        List<com.google.android.gms.internal.measurement.s6> x11 = n6Var.x();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.s6 s6Var : x11) {
            String G = s6Var.G();
            if (s6Var.P()) {
                bundle.putString(G, String.valueOf(s6Var.Q()));
            } else if (s6Var.N()) {
                bundle.putString(G, String.valueOf(s6Var.O()));
            } else if (s6Var.H()) {
                bundle.putString(G, s6Var.J());
            } else if (s6Var.K()) {
                bundle.putString(G, String.valueOf(s6Var.L()));
            }
        }
        C(builder, g7Var.w().C(str, z4.f26904u0).split("\\|"), bundle, a11);
        List<com.google.android.gms.internal.measurement.r7> f12 = z6Var.f1();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.r7 r7Var : f12) {
            String H = r7Var.H();
            if (r7Var.Q()) {
                bundle2.putString(H, String.valueOf(r7Var.R()));
            } else if (r7Var.O()) {
                bundle2.putString(H, String.valueOf(r7Var.P()));
            } else if (r7Var.J()) {
                bundle2.putString(H, r7Var.K());
            } else if (r7Var.L()) {
                bundle2.putString(H, String.valueOf(r7Var.N()));
            }
        }
        C(builder, g7Var.w().C(str, z4.f26902t0).split("\\|"), bundle2, a11);
        z(builder, "dma", true != z6Var.h0() ? "0" : "1", a11);
        if (!z6Var.j0().isEmpty()) {
            z(builder, "dma_cps", z6Var.j0(), a11);
        }
        if (z6Var.p0()) {
            com.google.android.gms.internal.measurement.w5 q02 = z6Var.q0();
            if (!q02.S().isEmpty()) {
                z(builder, "dl_gclid", q02.S(), a11);
            }
            if (!q02.U().isEmpty()) {
                z(builder, "dl_gbraid", q02.U(), a11);
            }
            if (!q02.W().isEmpty()) {
                z(builder, "dl_gs", q02.W(), a11);
            }
            if (q02.Y() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(q02.Y()), a11);
            }
            if (!q02.a0().isEmpty()) {
                z(builder, "mr_gclid", q02.a0(), a11);
            }
            if (!q02.c0().isEmpty()) {
                z(builder, "mr_gbraid", q02.c0(), a11);
            }
            if (!q02.e0().isEmpty()) {
                z(builder, "mr_gs", q02.e0(), a11);
            }
            if (q02.g0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(q02.g0()), a11);
            }
        }
        return new zzoh(builder.build().toString(), a10, 1);
    }

    public final com.google.android.gms.internal.measurement.o6 J(a0 a0Var) {
        com.google.android.gms.internal.measurement.n6 R = com.google.android.gms.internal.measurement.o6.R();
        R.U(a0Var.f26020e);
        zzbe zzbeVar = a0Var.f26021f;
        c0 c0Var = new c0(zzbeVar);
        while (c0Var.hasNext()) {
            String next = c0Var.next();
            com.google.android.gms.internal.measurement.r6 T = com.google.android.gms.internal.measurement.s6.T();
            T.z(next);
            Object a10 = zzbeVar.a(next);
            n9.m.l(a10);
            H(T, a10);
            R.G(T);
        }
        String str = a0Var.f26018c;
        if (!TextUtils.isEmpty(str) && zzbeVar.a("_o") == null) {
            com.google.android.gms.internal.measurement.r6 T2 = com.google.android.gms.internal.measurement.s6.T();
            T2.z("_o");
            T2.C(str);
            R.E((com.google.android.gms.internal.measurement.s6) T2.t());
        }
        return (com.google.android.gms.internal.measurement.o6) R.t();
    }

    public final String K(com.google.android.gms.internal.measurement.y6 y6Var) {
        com.google.android.gms.internal.measurement.a6 b12;
        if (y6Var == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (y6Var.L()) {
            E(sb2, 0, "upload_subdomain", y6Var.N());
        }
        if (y6Var.J()) {
            E(sb2, 0, "sgtm_join_id", y6Var.K());
        }
        for (com.google.android.gms.internal.measurement.a7 a7Var : y6Var.F()) {
            if (a7Var != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (a7Var.h0()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(a7Var.i1()));
                }
                ig.a();
                g7 g7Var = this.f26328a;
                if (g7Var.w().H(a7Var.F(), z4.N0) && a7Var.O0()) {
                    E(sb2, 1, "session_stitching_token", a7Var.P0());
                }
                E(sb2, 1, "platform", a7Var.C2());
                if (a7Var.H()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(a7Var.J()));
                }
                if (a7Var.K()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(a7Var.L()));
                }
                if (a7Var.K0()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(a7Var.L0()));
                }
                if (a7Var.d0()) {
                    E(sb2, 1, "config_version", Long.valueOf(a7Var.e0()));
                }
                E(sb2, 1, "gmp_app_id", a7Var.W());
                E(sb2, 1, "app_id", a7Var.F());
                E(sb2, 1, "app_version", a7Var.G());
                if (a7Var.b0()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(a7Var.c0()));
                }
                E(sb2, 1, "firebase_instance_id", a7Var.a0());
                if (a7Var.R()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(a7Var.S()));
                }
                E(sb2, 1, "app_store", a7Var.I2());
                if (a7Var.s2()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(a7Var.t2()));
                }
                if (a7Var.u2()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(a7Var.v2()));
                }
                if (a7Var.w2()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(a7Var.x2()));
                }
                if (a7Var.y2()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(a7Var.z2()));
                }
                if (a7Var.A2()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(a7Var.B2()));
                }
                E(sb2, 1, "app_instance_id", a7Var.Q());
                E(sb2, 1, "resettable_device_id", a7Var.N());
                E(sb2, 1, "ds_id", a7Var.g0());
                if (a7Var.O()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(a7Var.P()));
                }
                E(sb2, 1, "os_version", a7Var.D2());
                E(sb2, 1, Payload.DEVICE_MODEL, a7Var.E2());
                E(sb2, 1, "user_default_language", a7Var.F2());
                if (a7Var.G2()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(a7Var.H2()));
                }
                if (a7Var.T()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(a7Var.U()));
                }
                if (a7Var.c1()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(a7Var.d1()));
                }
                if (a7Var.X()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(a7Var.Y()));
                }
                E(sb2, 1, "health_monitor", a7Var.V());
                if (a7Var.I0()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(a7Var.J0()));
                }
                if (a7Var.M0()) {
                    E(sb2, 1, "consent_signals", a7Var.N0());
                }
                if (a7Var.V0()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(a7Var.W0()));
                }
                if (a7Var.X0()) {
                    E(sb2, 1, "core_platform_services", a7Var.Y0());
                }
                if (a7Var.T0()) {
                    E(sb2, 1, "consent_diagnostics", a7Var.U0());
                }
                if (a7Var.Q0()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(a7Var.R0()));
                }
                vf.a();
                if (g7Var.w().H(a7Var.F(), z4.Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(a7Var.Z0()));
                    if (a7Var.a1() && (b12 = a7Var.b1()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(b12.F()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(b12.G()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(b12.H()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(b12.J()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(b12.K()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(b12.L()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(b12.N()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (a7Var.e1()) {
                    com.google.android.gms.internal.measurement.w5 f12 = a7Var.f1();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (f12.R()) {
                        E(sb2, 2, "deep_link_gclid", f12.S());
                    }
                    if (f12.T()) {
                        E(sb2, 2, "deep_link_gbraid", f12.U());
                    }
                    if (f12.V()) {
                        E(sb2, 2, "deep_link_gad_source", f12.W());
                    }
                    if (f12.X()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(f12.Y()));
                    }
                    if (f12.Z()) {
                        E(sb2, 2, "market_referrer_gclid", f12.a0());
                    }
                    if (f12.b0()) {
                        E(sb2, 2, "market_referrer_gbraid", f12.c0());
                    }
                    if (f12.d0()) {
                        E(sb2, 2, "market_referrer_gad_source", f12.e0());
                    }
                    if (f12.f0()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(f12.g0()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (a7Var.i0()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(a7Var.j0()));
                }
                if (a7Var.g1()) {
                    com.google.android.gms.internal.measurement.p7 h12 = a7Var.h1();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int L = h12.L();
                    E(sb2, 2, "upload_type", L != 1 ? L != 2 ? L != 3 ? L != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    E(sb2, 2, "client_upload_eligibility", h12.F().name());
                    int N = h12.N();
                    E(sb2, 2, "service_upload_eligibility", N != 1 ? N != 2 ? N != 3 ? N != 4 ? N != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (a7Var.k0()) {
                    com.google.android.gms.internal.measurement.k6 l02 = a7Var.l0();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.h6 h6Var : l02.F()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int H = h6Var.H();
                        E(sb2, 3, Payload.TYPE, H != 1 ? H != 2 ? H != 3 ? H != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int J = h6Var.J();
                        E(sb2, 3, "mode", J != 1 ? J != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.r7> p22 = a7Var.p2();
                if (p22 != null) {
                    for (com.google.android.gms.internal.measurement.r7 r7Var : p22) {
                        if (r7Var != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", r7Var.F() ? Long.valueOf(r7Var.G()) : null);
                            E(sb2, 2, "name", g7Var.D().c(r7Var.H()));
                            E(sb2, 2, "string_value", r7Var.K());
                            E(sb2, 2, "int_value", r7Var.L() ? Long.valueOf(r7Var.N()) : null);
                            E(sb2, 2, "double_value", r7Var.Q() ? Double.valueOf(r7Var.R()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.c6> Z = a7Var.Z();
                if (Z != null) {
                    for (com.google.android.gms.internal.measurement.c6 c6Var : Z) {
                        if (c6Var != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c6Var.F()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(c6Var.G()));
                            }
                            if (c6Var.L()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(c6Var.N()));
                            }
                            D(sb2, 2, "current_data", c6Var.H());
                            if (c6Var.J()) {
                                D(sb2, 2, "previous_data", c6Var.K());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.o6> j22 = a7Var.j2();
                if (j22 != null) {
                    for (com.google.android.gms.internal.measurement.o6 o6Var : j22) {
                        if (o6Var != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", g7Var.D().a(o6Var.J()));
                            if (o6Var.K()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(o6Var.L()));
                            }
                            if (o6Var.N()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(o6Var.O()));
                            }
                            if (o6Var.P()) {
                                E(sb2, 2, "count", Integer.valueOf(o6Var.Q()));
                            }
                            if (o6Var.G() != 0) {
                                w(sb2, 2, o6Var.F());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    public final String L(com.google.android.gms.internal.measurement.z3 z3Var) {
        if (z3Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (z3Var.F()) {
            E(sb2, 0, "filter_id", Integer.valueOf(z3Var.G()));
        }
        E(sb2, 0, "event_name", this.f26328a.D().a(z3Var.H()));
        String A = A(z3Var.P(), z3Var.Q(), z3Var.S());
        if (!A.isEmpty()) {
            E(sb2, 0, "filter_type", A);
        }
        if (z3Var.N()) {
            F(sb2, 1, "event_count_filter", z3Var.O());
        }
        if (z3Var.K() > 0) {
            sb2.append("  filters {\n");
            Iterator it = z3Var.J().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (com.google.android.gms.internal.measurement.b4) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    public final String M(com.google.android.gms.internal.measurement.h4 h4Var) {
        if (h4Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (h4Var.F()) {
            E(sb2, 0, "filter_id", Integer.valueOf(h4Var.G()));
        }
        E(sb2, 0, "property_name", this.f26328a.D().c(h4Var.H()));
        String A = A(h4Var.K(), h4Var.L(), h4Var.O());
        if (!A.isEmpty()) {
            E(sb2, 0, "filter_type", A);
        }
        x(sb2, 1, h4Var.J());
        sb2.append("}\n");
        return sb2.toString();
    }

    public final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (a.C0485a unused) {
                this.f26328a.a().o().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f26328a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f26328a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final boolean S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f26328a.e().a() - j10) > j11;
    }

    public final long T(byte[] bArr) {
        n9.m.l(bArr);
        g7 g7Var = this.f26328a;
        g7Var.C().h();
        MessageDigest C = ve.C();
        if (C != null) {
            return ve.D(C.digest(bArr));
        }
        g7Var.a().o().a("Failed to get MD5");
        return 0L;
    }

    public final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    public final byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f26328a.a().o().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(Z((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map Z(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Z(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Z(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.Z(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.re.Z(android.os.Bundle, boolean):java.util.Map");
    }

    @Override // nb.xd
    public final boolean l() {
        return false;
    }

    public final zzbg m(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle n10 = n(bVar.f(), true);
        String obj2 = (!n10.containsKey("_o") || (obj = n10.get("_o")) == null) ? Payload.TYPE_APP : obj.toString();
        String b = r8.b(bVar.b());
        if (b == null) {
            b = bVar.b();
        }
        return new zzbg(b, new zzbe(n10), obj2, bVar.a());
    }

    public final Bundle n(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final void w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) it.next();
            if (s6Var != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", s6Var.F() ? this.f26328a.D().b(s6Var.G()) : null);
                E(sb2, i11, "string_value", s6Var.H() ? s6Var.J() : null);
                E(sb2, i11, "int_value", s6Var.K() ? Long.valueOf(s6Var.L()) : null);
                E(sb2, i11, "double_value", s6Var.P() ? Double.valueOf(s6Var.Q()) : null);
                if (s6Var.S() > 0) {
                    w(sb2, i11, s6Var.R());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void x(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.b4 b4Var) {
        String str;
        if (b4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (b4Var.K()) {
            E(sb2, i10, "complement", Boolean.valueOf(b4Var.L()));
        }
        if (b4Var.N()) {
            E(sb2, i10, "param_name", this.f26328a.D().b(b4Var.O()));
        }
        if (b4Var.F()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.l4 G = b4Var.G();
            if (G != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (G.F()) {
                    switch (G.Q()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb2, i11, "match_type", str);
                }
                if (G.G()) {
                    E(sb2, i11, "expression", G.H());
                }
                if (G.J()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(G.K()));
                }
                if (G.N() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : G.L()) {
                        y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (b4Var.H()) {
            F(sb2, i10 + 1, "number_filter", b4Var.J());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }
}
