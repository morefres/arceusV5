package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public final k f8556a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8557a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f8557a = iArr;
            try {
                iArr[s1.b.f8610j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8557a[s1.b.f8609i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8557a[s1.b.f8607g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8557a[s1.b.f8617q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8557a[s1.b.f8619s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8557a[s1.b.f8615o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8557a[s1.b.f8608h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8557a[s1.b.f8605e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8557a[s1.b.f8618r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8557a[s1.b.f8620t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8557a[s1.b.f8606f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8557a[s1.b.f8611k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public l(k kVar) {
        k kVar2 = (k) a0.b(kVar, "output");
        this.f8556a = kVar2;
        kVar2.f8539a = this;
    }

    public static l P(k kVar) {
        l lVar = kVar.f8539a;
        return lVar != null ? lVar : new l(kVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void A(int i10, List<Boolean> list, boolean z10) {
        if (list instanceof f) {
            Q(i10, (f) list, z10);
        } else {
            R(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void B(int i10, float f10) {
        this.f8556a.u0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    @Deprecated
    public void C(int i10) {
        this.f8556a.O0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void D(int i10, List<Integer> list, boolean z10) {
        if (list instanceof z) {
            m0(i10, (z) list, z10);
        } else {
            n0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void E(int i10, int i11) {
        this.f8556a.o0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void F(int i10, List<Long> list, boolean z10) {
        if (list instanceof j0) {
            f0(i10, (j0) list, z10);
        } else {
            g0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void G(int i10, List<Double> list, boolean z10) {
        if (list instanceof m) {
            T(i10, (m) list, z10);
        } else {
            U(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void H(int i10, int i11) {
        this.f8556a.J0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void I(int i10, List<h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f8556a.l0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public <K, V> void J(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        if (this.f8556a.d0()) {
            S(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f8556a.O0(i10, 2);
            this.f8556a.Q0(l0.b(aVar, entry.getKey(), entry.getValue()));
            l0.d(this.f8556a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void K(int i10, Object obj, g1 g1Var) {
        this.f8556a.w0(i10, (s0) obj, g1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void L(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), g1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void M(int i10, h hVar) {
        this.f8556a.l0(i10, hVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void N(int i10, Object obj, g1 g1Var) {
        this.f8556a.C0(i10, (s0) obj, g1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void O(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), g1Var);
        }
    }

    public final void Q(int i10, f fVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < fVar.size()) {
                this.f8556a.j0(i10, fVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < fVar.size(); i13++) {
            i12 += k.e(fVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < fVar.size()) {
            this.f8556a.k0(fVar.h(i11));
            i11++;
        }
    }

    public final void R(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.e(list.get(i13).booleanValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    public final <K, V> void S(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f8557a;
        throw null;
    }

    public final void T(int i10, m mVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < mVar.size()) {
                this.f8556a.m0(i10, mVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < mVar.size(); i13++) {
            i12 += k.j(mVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < mVar.size()) {
            this.f8556a.n0(mVar.h(i11));
            i11++;
        }
    }

    public final void U(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.m0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.j(list.get(i13).doubleValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.n0(list.get(i11).doubleValue());
            i11++;
        }
    }

    public final void V(int i10, z zVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < zVar.size()) {
                this.f8556a.o0(i10, zVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < zVar.size(); i13++) {
            i12 += k.l(zVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < zVar.size()) {
            this.f8556a.p0(zVar.h(i11));
            i11++;
        }
    }

    public final void W(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.l(list.get(i13).intValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.p0(list.get(i11).intValue());
            i11++;
        }
    }

    public final void X(int i10, z zVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < zVar.size()) {
                this.f8556a.q0(i10, zVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < zVar.size(); i13++) {
            i12 += k.n(zVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < zVar.size()) {
            this.f8556a.r0(zVar.h(i11));
            i11++;
        }
    }

    public final void Y(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.n(list.get(i13).intValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.r0(list.get(i11).intValue());
            i11++;
        }
    }

    public final void Z(int i10, j0 j0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < j0Var.size()) {
                this.f8556a.s0(i10, j0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < j0Var.size(); i13++) {
            i12 += k.p(j0Var.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < j0Var.size()) {
            this.f8556a.t0(j0Var.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void a(int i10, List<Float> list, boolean z10) {
        if (list instanceof w) {
            b0(i10, (w) list, z10);
        } else {
            c0(i10, list, z10);
        }
    }

    public final void a0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.s0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.p(list.get(i13).longValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.t0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public final void b(int i10, Object obj) {
        if (obj instanceof h) {
            this.f8556a.E0(i10, (h) obj);
        } else {
            this.f8556a.D0(i10, (s0) obj);
        }
    }

    public final void b0(int i10, w wVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < wVar.size()) {
                this.f8556a.u0(i10, wVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < wVar.size(); i13++) {
            i12 += k.r(wVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < wVar.size()) {
            this.f8556a.v0(wVar.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void c(int i10, int i11) {
        this.f8556a.q0(i10, i11);
    }

    public final void c0(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.u0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.r(list.get(i13).floatValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.v0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof f0)) {
            while (i11 < list.size()) {
                this.f8556a.N0(i10, list.get(i11));
                i11++;
            }
        } else {
            f0 f0Var = (f0) list;
            while (i11 < list.size()) {
                h0(i10, f0Var.q(i11));
                i11++;
            }
        }
    }

    public final void d0(int i10, z zVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < zVar.size()) {
                this.f8556a.y0(i10, zVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < zVar.size(); i13++) {
            i12 += k.w(zVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < zVar.size()) {
            this.f8556a.z0(zVar.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void e(int i10, String str) {
        this.f8556a.N0(i10, str);
    }

    public final void e0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.y0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.w(list.get(i13).intValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.z0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void f(int i10, long j10) {
        this.f8556a.R0(i10, j10);
    }

    public final void f0(int i10, j0 j0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < j0Var.size()) {
                this.f8556a.A0(i10, j0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < j0Var.size(); i13++) {
            i12 += k.y(j0Var.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < j0Var.size()) {
            this.f8556a.B0(j0Var.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void g(int i10, List<Integer> list, boolean z10) {
        if (list instanceof z) {
            d0(i10, (z) list, z10);
        } else {
            e0(i10, list, z10);
        }
    }

    public final void g0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.A0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.y(list.get(i13).longValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.B0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void h(int i10, int i11) {
        this.f8556a.y0(i10, i11);
    }

    public final void h0(int i10, Object obj) {
        if (obj instanceof String) {
            this.f8556a.N0(i10, (String) obj);
        } else {
            this.f8556a.l0(i10, (h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void i(int i10, long j10) {
        this.f8556a.H0(i10, j10);
    }

    public final void i0(int i10, z zVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < zVar.size()) {
                this.f8556a.F0(i10, zVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < zVar.size(); i13++) {
            i12 += k.L(zVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < zVar.size()) {
            this.f8556a.G0(zVar.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void j(int i10, List<Integer> list, boolean z10) {
        if (list instanceof z) {
            X(i10, (z) list, z10);
        } else {
            Y(i10, list, z10);
        }
    }

    public final void j0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.F0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.L(list.get(i13).intValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.G0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void k(int i10, List<Integer> list, boolean z10) {
        if (list instanceof z) {
            q0(i10, (z) list, z10);
        } else {
            r0(i10, list, z10);
        }
    }

    public final void k0(int i10, j0 j0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < j0Var.size()) {
                this.f8556a.H0(i10, j0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < j0Var.size(); i13++) {
            i12 += k.N(j0Var.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < j0Var.size()) {
            this.f8556a.I0(j0Var.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void l(int i10, List<Long> list, boolean z10) {
        if (list instanceof j0) {
            o0(i10, (j0) list, z10);
        } else {
            p0(i10, list, z10);
        }
    }

    public final void l0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.H0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.N(list.get(i13).longValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.I0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void m(int i10, long j10) {
        this.f8556a.L0(i10, j10);
    }

    public final void m0(int i10, z zVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < zVar.size()) {
                this.f8556a.J0(i10, zVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < zVar.size(); i13++) {
            i12 += k.P(zVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < zVar.size()) {
            this.f8556a.K0(zVar.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void n(int i10, List<Integer> list, boolean z10) {
        if (list instanceof z) {
            V(i10, (z) list, z10);
        } else {
            W(i10, list, z10);
        }
    }

    public void n0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.J0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.P(list.get(i13).intValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.K0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void o(int i10, int i11) {
        this.f8556a.P0(i10, i11);
    }

    public final void o0(int i10, j0 j0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < j0Var.size()) {
                this.f8556a.L0(i10, j0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < j0Var.size(); i13++) {
            i12 += k.R(j0Var.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < j0Var.size()) {
            this.f8556a.M0(j0Var.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void p(int i10, double d10) {
        this.f8556a.m0(i10, d10);
    }

    public final void p0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.L0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.R(list.get(i13).longValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.M0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void q(int i10, List<Long> list, boolean z10) {
        if (list instanceof j0) {
            k0(i10, (j0) list, z10);
        } else {
            l0(i10, list, z10);
        }
    }

    public final void q0(int i10, z zVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < zVar.size()) {
                this.f8556a.P0(i10, zVar.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < zVar.size(); i13++) {
            i12 += k.W(zVar.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < zVar.size()) {
            this.f8556a.Q0(zVar.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void r(int i10, List<Long> list, boolean z10) {
        if (list instanceof j0) {
            s0(i10, (j0) list, z10);
        } else {
            t0(i10, list, z10);
        }
    }

    public void r0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.W(list.get(i13).intValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.Q0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void s(int i10, long j10) {
        this.f8556a.s0(i10, j10);
    }

    public final void s0(int i10, j0 j0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < j0Var.size()) {
                this.f8556a.R0(i10, j0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < j0Var.size(); i13++) {
            i12 += k.Y(j0Var.h(i13));
        }
        this.f8556a.Q0(i12);
        while (i11 < j0Var.size()) {
            this.f8556a.S0(j0Var.h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public t1.a t() {
        return t1.a.ASCENDING;
    }

    public final void t0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f8556a.R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f8556a.O0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.Y(list.get(i13).longValue());
        }
        this.f8556a.Q0(i12);
        while (i11 < list.size()) {
            this.f8556a.S0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void u(int i10, long j10) {
        this.f8556a.A0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void v(int i10, boolean z10) {
        this.f8556a.j0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void w(int i10, int i11) {
        this.f8556a.F0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    @Deprecated
    public void x(int i10) {
        this.f8556a.O0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void y(int i10, List<Long> list, boolean z10) {
        if (list instanceof j0) {
            Z(i10, (j0) list, z10);
        } else {
            a0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t1
    public void z(int i10, List<Integer> list, boolean z10) {
        if (list instanceof z) {
            i0(i10, (z) list, z10);
        } else {
            j0(i10, list, z10);
        }
    }
}
