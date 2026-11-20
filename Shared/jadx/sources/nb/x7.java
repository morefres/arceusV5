package nb;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.ig;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class x7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f26805a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26806c;

    public x7(i8 i8Var, zzbg zzbgVar, String str) {
        this.f26805a = zzbgVar;
        this.b = str;
        Objects.requireNonNull(i8Var);
        this.f26806c = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        wa waVar;
        byte[] bArr;
        me meVar;
        te teVar;
        me meVar2;
        c6 c6Var;
        g7 g7Var;
        com.google.android.gms.internal.measurement.z6 z6Var;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        com.google.android.gms.internal.measurement.v6 v6Var;
        b0 a10;
        long j10;
        byte[] bArr2;
        i8 i8Var = this.f26806c;
        i8Var.z2().E();
        wa J0 = i8Var.z2().J0();
        J0.h();
        g7 g7Var2 = J0.f26328a;
        g7.q();
        zzbg zzbgVar = this.f26805a;
        n9.m.l(zzbgVar);
        String str2 = this.b;
        n9.m.f(str2);
        String str3 = zzbgVar.f7471f;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            J0.f26328a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        me meVar3 = J0.b;
        com.google.android.gms.internal.measurement.v6 O = com.google.android.gms.internal.measurement.y6.O();
        meVar3.F0().r0();
        try {
            c6 J02 = meVar3.F0().J0(str2);
            if (J02 == null) {
                J0.f26328a.a().v().b("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (J02.d()) {
                    com.google.android.gms.internal.measurement.z6 m02 = com.google.android.gms.internal.measurement.a7.m0();
                    m02.e0(1);
                    m02.A("android");
                    if (!TextUtils.isEmpty(J02.o0())) {
                        m02.P(J02.o0());
                    }
                    if (!TextUtils.isEmpty(J02.H0())) {
                        m02.N((String) n9.m.l(J02.H0()));
                    }
                    if (!TextUtils.isEmpty(J02.D0())) {
                        m02.Q((String) n9.m.l(J02.D0()));
                    }
                    if (J02.F0() != -2147483648L) {
                        m02.F0((int) J02.F0());
                    }
                    m02.R(J02.J0());
                    m02.N0(J02.b());
                    String r02 = J02.r0();
                    if (!TextUtils.isEmpty(r02)) {
                        m02.z0(r02);
                    }
                    m02.U0(J02.X());
                    q8 g10 = J0.b.g(str2);
                    m02.c0(J02.L0());
                    if (g7Var2.g() && J0.f26328a.w().k(m02.O()) && g10.o(p8.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        m02.I0(null);
                    }
                    m02.P0(g10.k());
                    if (g10.o(p8.AD_STORAGE) && J02.P()) {
                        Pair m10 = meVar3.L0().m(J02.o0(), g10);
                        if (J02.P() && !TextUtils.isEmpty((CharSequence) m10.first)) {
                            try {
                                m02.U(wa.m((String) m10.first, Long.toString(zzbgVar.f7474i)));
                                Object obj2 = m10.second;
                                if (obj2 != null) {
                                    m02.X(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                J0.f26328a.a().v().b("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                meVar = J0.b;
                                meVar.F0().t0();
                                return bArr;
                            }
                        }
                    }
                    g7 g7Var3 = J0.f26328a;
                    g7Var3.K().l();
                    m02.E(Build.MODEL);
                    g7Var3.K().l();
                    m02.D(Build.VERSION.RELEASE);
                    m02.K((int) g7Var3.K().o());
                    m02.J(g7Var3.K().p());
                    try {
                        if (g10.o(p8.ANALYTICS_STORAGE) && J02.p0() != null) {
                            m02.a0(wa.m((String) n9.m.l(J02.p0()), Long.toString(zzbgVar.f7474i)));
                        }
                        if (!TextUtils.isEmpty(J02.x0())) {
                            m02.D0((String) n9.m.l(J02.x0()));
                        }
                        String o02 = J02.o0();
                        me meVar4 = J0.b;
                        List C0 = meVar4.F0().C0(o02);
                        Iterator it = C0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                teVar = null;
                                break;
                            }
                            teVar = (te) it.next();
                            if ("_lte".equals(teVar.f26699c)) {
                                break;
                            }
                        }
                        if (teVar == null || teVar.f26701e == null) {
                            te teVar2 = new te(o02, "auto", "_lte", J0.f26328a.e().a(), 0L);
                            C0.add(teVar2);
                            meVar4.F0().A0(teVar2);
                        }
                        com.google.android.gms.internal.measurement.r7[] r7VarArr = new com.google.android.gms.internal.measurement.r7[C0.size()];
                        for (int i10 = 0; i10 < C0.size(); i10++) {
                            com.google.android.gms.internal.measurement.q7 S = com.google.android.gms.internal.measurement.r7.S();
                            S.z(((te) C0.get(i10)).f26699c);
                            S.x(((te) C0.get(i10)).f26700d);
                            meVar4.K0().G(S, ((te) C0.get(i10)).f26701e);
                            r7VarArr[i10] = (com.google.android.gms.internal.measurement.r7) S.t();
                        }
                        m02.l1(Arrays.asList(r7VarArr));
                        me meVar5 = J0.b;
                        meVar5.n(J02, m02);
                        meVar5.o(J02, m02);
                        x5 a11 = x5.a(zzbgVar);
                        g7 g7Var4 = J0.f26328a;
                        ve C = g7Var4.C();
                        Bundle bundle2 = a11.f26793d;
                        C.w(bundle2, meVar4.F0().G(str2));
                        g7Var4.C().u(a11, g7Var4.w().w(str2));
                        bundle2.putLong("_c", 1L);
                        g7Var4.a().v().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = zzbgVar.f7473h;
                        bundle2.putString("_o", str4);
                        if (g7Var4.C().P(m02.O(), J02.l0())) {
                            g7Var4.C().A(bundle2, "_dbg", 1L);
                            g7Var4.C().A(bundle2, "_r", 1L);
                        }
                        t F0 = meVar4.F0();
                        String str5 = zzbgVar.f7471f;
                        b0 v02 = F0.v0(str2, str5);
                        if (v02 == null) {
                            c6Var = J02;
                            g7Var = g7Var4;
                            z6Var = m02;
                            meVar2 = meVar5;
                            obj = null;
                            bundle = bundle2;
                            str = str4;
                            a10 = new b0(str2, str5, 0L, 0L, 0L, zzbgVar.f7474i, 0L, null, null, null, null);
                            z10 = true;
                            j10 = 0;
                            v6Var = O;
                        } else {
                            meVar2 = meVar5;
                            c6Var = J02;
                            g7Var = g7Var4;
                            z6Var = m02;
                            bundle = bundle2;
                            str = str4;
                            z10 = true;
                            obj = null;
                            v6Var = O;
                            long j11 = v02.f26053f;
                            a10 = v02.a(zzbgVar.f7474i);
                            j10 = j11;
                        }
                        b0 b0Var = a10;
                        meVar4.F0().w0(b0Var);
                        g7 g7Var5 = J0.f26328a;
                        long j12 = zzbgVar.f7474i;
                        boolean z11 = z10;
                        c6 c6Var2 = c6Var;
                        com.google.android.gms.internal.measurement.z6 z6Var2 = z6Var;
                        me meVar6 = meVar2;
                        try {
                            a0 a0Var = new a0(g7Var5, str, str2, str5, j12, j10, bundle);
                            com.google.android.gms.internal.measurement.n6 R = com.google.android.gms.internal.measurement.o6.R();
                            R.S(a0Var.f26019d);
                            R.P(a0Var.b);
                            R.U(a0Var.f26020e);
                            zzbe zzbeVar = a0Var.f26021f;
                            c0 c0Var = new c0(zzbeVar);
                            while (c0Var.hasNext()) {
                                String next = c0Var.next();
                                com.google.android.gms.internal.measurement.r6 T = com.google.android.gms.internal.measurement.s6.T();
                                T.z(next);
                                Object a12 = zzbeVar.a(next);
                                if (a12 != null) {
                                    meVar4.K0().H(T, a12);
                                    R.G(T);
                                }
                            }
                            z6Var2.b1(R);
                            com.google.android.gms.internal.measurement.b7 F = com.google.android.gms.internal.measurement.d7.F();
                            com.google.android.gms.internal.measurement.p6 F2 = com.google.android.gms.internal.measurement.q6.F();
                            F2.z(b0Var.f26050c);
                            F2.x(str5);
                            F.x(F2);
                            z6Var2.L0(F);
                            z6Var2.B0(meVar4.I0().m(c6Var2.o0(), Collections.EMPTY_LIST, z6Var2.f1(), Long.valueOf(R.R()), Long.valueOf(R.R()), false));
                            if (R.Q()) {
                                z6Var2.q1(R.R());
                                z6Var2.s1(R.R());
                            }
                            long B0 = c6Var2.B0();
                            if (B0 != 0) {
                                z6Var2.x(B0);
                            }
                            long z02 = c6Var2.z0();
                            if (z02 != 0) {
                                z6Var2.t1(z02);
                            } else if (B0 != 0) {
                                z6Var2.t1(B0);
                            }
                            String t02 = c6Var2.t0();
                            ig.a();
                            if (g7Var.w().H(str2, z4.N0) && t02 != null) {
                                z6Var2.Q0(t02);
                            }
                            c6Var2.l();
                            z6Var2.d0((int) c6Var2.g());
                            g7Var.w().A();
                            z6Var2.S(133005L);
                            z6Var2.n1(g7Var.e().a());
                            z6Var2.A0(z11);
                            meVar6.x(z6Var2.O(), z6Var2);
                            v6Var.D(z6Var2);
                            c6Var2.A0(z6Var2.p1());
                            c6Var2.C0(z6Var2.r1());
                            meVar4.F0().K0(c6Var2, false, false);
                            meVar4.F0().s0();
                            meVar4.F0().t0();
                            try {
                                return meVar4.K0().V(((com.google.android.gms.internal.measurement.y6) v6Var.t()).d());
                            } catch (IOException e11) {
                                J0.f26328a.a().o().c("Data loss. Failed to bundle and serialize. appId", w5.x(str2), e11);
                                return obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            waVar = J0;
                            waVar.b.F0().t0();
                            throw th;
                        }
                    } catch (SecurityException e12) {
                        waVar = J0;
                        try {
                            waVar.f26328a.a().v().b("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            meVar = waVar.b;
                            meVar.F0().t0();
                            return bArr;
                        } catch (Throwable th3) {
                            th = th3;
                            waVar.b.F0().t0();
                            throw th;
                        }
                    }
                }
                J0.f26328a.a().v().b("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            meVar3.F0().t0();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            waVar = J0;
            waVar.b.F0().t0();
            throw th;
        }
    }
}
