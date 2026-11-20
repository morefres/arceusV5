package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import y2.p;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.q implements RecyclerView.a0.b {
    public int A;
    public int B;
    public boolean C;
    public SavedState D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;

    /* renamed from: s, reason: collision with root package name */
    public int f2705s;

    /* renamed from: t, reason: collision with root package name */
    public c f2706t;

    /* renamed from: u, reason: collision with root package name */
    public n f2707u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2708v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2709w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2710x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2711y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2712z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f2713a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2714c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public boolean a() {
            return this.f2713a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void f() {
            this.f2713a = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2713a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f2714c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f2713a = parcel.readInt();
            this.b = parcel.readInt();
            this.f2714c = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f2713a = savedState.f2713a;
            this.b = savedState.b;
            this.f2714c = savedState.f2714c;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public n f2715a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f2716c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2717d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2718e;

        public a() {
            e();
        }

        public void a() {
            this.f2716c = this.f2717d ? this.f2715a.i() : this.f2715a.m();
        }

        public void b(View view, int i10) {
            if (this.f2717d) {
                this.f2716c = this.f2715a.d(view) + this.f2715a.o();
            } else {
                this.f2716c = this.f2715a.g(view);
            }
            this.b = i10;
        }

        public void c(View view, int i10) {
            int o8 = this.f2715a.o();
            if (o8 >= 0) {
                b(view, i10);
                return;
            }
            this.b = i10;
            if (this.f2717d) {
                int i11 = (this.f2715a.i() - o8) - this.f2715a.d(view);
                this.f2716c = this.f2715a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f2716c - this.f2715a.e(view);
                    int m10 = this.f2715a.m();
                    int min = e10 - (m10 + Math.min(this.f2715a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f2716c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f2715a.g(view);
            int m11 = g10 - this.f2715a.m();
            this.f2716c = g10;
            if (m11 > 0) {
                int i12 = (this.f2715a.i() - Math.min(0, (this.f2715a.i() - o8) - this.f2715a.d(view))) - (g10 + this.f2715a.e(view));
                if (i12 < 0) {
                    this.f2716c -= Math.min(m11, -i12);
                }
            }
        }

        public boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.d() && rVar.b() >= 0 && rVar.b() < b0Var.b();
        }

        public void e() {
            this.b = -1;
            this.f2716c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2717d = false;
            this.f2718e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.f2716c + ", mLayoutFromEnd=" + this.f2717d + ", mValid=" + this.f2718e + '}';
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2719a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2720c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2721d;

        public void a() {
            this.f2719a = 0;
            this.b = false;
            this.f2720c = false;
            this.f2721d = false;
        }
    }

    public static class c {
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f2723c;

        /* renamed from: d, reason: collision with root package name */
        public int f2724d;

        /* renamed from: e, reason: collision with root package name */
        public int f2725e;

        /* renamed from: f, reason: collision with root package name */
        public int f2726f;

        /* renamed from: g, reason: collision with root package name */
        public int f2727g;

        /* renamed from: k, reason: collision with root package name */
        public int f2731k;

        /* renamed from: m, reason: collision with root package name */
        public boolean f2733m;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2722a = true;

        /* renamed from: h, reason: collision with root package name */
        public int f2728h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f2729i = 0;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2730j = false;

        /* renamed from: l, reason: collision with root package name */
        public List<RecyclerView.f0> f2732l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f2724d = -1;
            } else {
                this.f2724d = ((RecyclerView.r) f10.getLayoutParams()).b();
            }
        }

        public boolean c(RecyclerView.b0 b0Var) {
            int i10 = this.f2724d;
            return i10 >= 0 && i10 < b0Var.b();
        }

        public View d(RecyclerView.x xVar) {
            if (this.f2732l != null) {
                return e();
            }
            View o8 = xVar.o(this.f2724d);
            this.f2724d += this.f2725e;
            return o8;
        }

        public final View e() {
            int size = this.f2732l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f2732l.get(i10).f2827a;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.d() && this.f2724d == rVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int b;
            int size = this.f2732l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2732l.get(i11).f2827a;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.d() && (b = (rVar.b() - this.f2724d) * this.f2725e) >= 0 && b < i10) {
                    if (b == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = b;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private View n2() {
        return N(this.f2710x ? 0 : O() - 1);
    }

    private View o2() {
        return N(this.f2710x ? O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int A(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f2709w;
    }

    public boolean A2() {
        return this.f2707u.k() == 0 && this.f2707u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2705s == 1) {
            return 0;
        }
        return C2(i10, xVar, b0Var);
    }

    public final void B2() {
        if (this.f2705s == 1 || !r2()) {
            this.f2710x = this.f2709w;
        } else {
            this.f2710x = !this.f2709w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.A = i10;
        this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.f();
        }
        y1();
    }

    public int C2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        Y1();
        this.f2706t.f2722a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        K2(i11, abs, true, b0Var);
        c cVar = this.f2706t;
        int Z1 = cVar.f2727g + Z1(xVar, cVar, b0Var, false);
        if (Z1 < 0) {
            return 0;
        }
        if (abs > Z1) {
            i10 = i11 * Z1;
        }
        this.f2707u.r(-i10);
        this.f2706t.f2731k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2705s == 0) {
            return 0;
        }
        return C2(i10, xVar, b0Var);
    }

    public void D2(int i10, int i11) {
        this.A = i10;
        this.B = i11;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.f();
        }
        y1();
    }

    public void E2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        if (i10 != this.f2705s || this.f2707u == null) {
            n b10 = n.b(this, i10);
            this.f2707u = b10;
            this.E.f2715a = b10;
            this.f2705s = i10;
            y1();
        }
    }

    public void F2(boolean z10) {
        l(null);
        if (z10 == this.f2709w) {
            return;
        }
        this.f2709w = z10;
        y1();
    }

    public void G2(boolean z10) {
        l(null);
        if (this.f2711y == z10) {
            return;
        }
        this.f2711y = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View H(int i10) {
        int O = O();
        if (O == 0) {
            return null;
        }
        int l02 = i10 - l0(N(0));
        if (l02 >= 0 && l02 < O) {
            View N = N(l02);
            if (l0(N) == i10) {
                return N;
            }
        }
        return super.H(i10);
    }

    public final boolean H2(RecyclerView.x xVar, RecyclerView.b0 b0Var, a aVar) {
        View k22;
        boolean z10 = false;
        if (O() == 0) {
            return false;
        }
        View a02 = a0();
        if (a02 != null && aVar.d(a02, b0Var)) {
            aVar.c(a02, l0(a02));
            return true;
        }
        boolean z11 = this.f2708v;
        boolean z12 = this.f2711y;
        if (z11 != z12 || (k22 = k2(xVar, b0Var, aVar.f2717d, z12)) == null) {
            return false;
        }
        aVar.b(k22, l0(k22));
        if (!b0Var.e() && Q1()) {
            int g10 = this.f2707u.g(k22);
            int d10 = this.f2707u.d(k22);
            int m10 = this.f2707u.m();
            int i10 = this.f2707u.i();
            boolean z13 = d10 <= m10 && g10 < m10;
            if (g10 >= i10 && d10 > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f2717d) {
                    m10 = i10;
                }
                aVar.f2716c = m10;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    public final boolean I2(RecyclerView.b0 b0Var, a aVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                aVar.b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z10 = this.D.f2714c;
                    aVar.f2717d = z10;
                    if (z10) {
                        aVar.f2716c = this.f2707u.i() - this.D.b;
                    } else {
                        aVar.f2716c = this.f2707u.m() + this.D.b;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z11 = this.f2710x;
                    aVar.f2717d = z11;
                    if (z11) {
                        aVar.f2716c = this.f2707u.i() - this.B;
                    } else {
                        aVar.f2716c = this.f2707u.m() + this.B;
                    }
                    return true;
                }
                View H = H(this.A);
                if (H == null) {
                    if (O() > 0) {
                        aVar.f2717d = (this.A < l0(N(0))) == this.f2710x;
                    }
                    aVar.a();
                } else {
                    if (this.f2707u.e(H) > this.f2707u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f2707u.g(H) - this.f2707u.m() < 0) {
                        aVar.f2716c = this.f2707u.m();
                        aVar.f2717d = false;
                        return true;
                    }
                    if (this.f2707u.i() - this.f2707u.d(H) < 0) {
                        aVar.f2716c = this.f2707u.i();
                        aVar.f2717d = true;
                        return true;
                    }
                    aVar.f2716c = aVar.f2717d ? this.f2707u.d(H) + this.f2707u.o() : this.f2707u.g(H);
                }
                return true;
            }
            this.A = -1;
            this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        return false;
    }

    public final void J2(RecyclerView.x xVar, RecyclerView.b0 b0Var, a aVar) {
        if (I2(b0Var, aVar) || H2(xVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.f2711y ? b0Var.b() - 1 : 0;
    }

    public final void K2(int i10, int i11, boolean z10, RecyclerView.b0 b0Var) {
        int m10;
        this.f2706t.f2733m = A2();
        this.f2706t.f2726f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f2706t;
        int i12 = z11 ? max2 : max;
        cVar.f2728h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f2729i = max;
        if (z11) {
            cVar.f2728h = i12 + this.f2707u.j();
            View n22 = n2();
            c cVar2 = this.f2706t;
            cVar2.f2725e = this.f2710x ? -1 : 1;
            int l02 = l0(n22);
            c cVar3 = this.f2706t;
            cVar2.f2724d = l02 + cVar3.f2725e;
            cVar3.b = this.f2707u.d(n22);
            m10 = this.f2707u.d(n22) - this.f2707u.i();
        } else {
            View o22 = o2();
            this.f2706t.f2728h += this.f2707u.m();
            c cVar4 = this.f2706t;
            cVar4.f2725e = this.f2710x ? 1 : -1;
            int l03 = l0(o22);
            c cVar5 = this.f2706t;
            cVar4.f2724d = l03 + cVar5.f2725e;
            cVar5.b = this.f2707u.g(o22);
            m10 = (-this.f2707u.g(o22)) + this.f2707u.m();
        }
        c cVar6 = this.f2706t;
        cVar6.f2723c = i11;
        if (z10) {
            cVar6.f2723c = i11 - m10;
        }
        cVar6.f2727g = m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean L1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    public final void L2(int i10, int i11) {
        this.f2706t.f2723c = this.f2707u.i() - i11;
        c cVar = this.f2706t;
        cVar.f2725e = this.f2710x ? -1 : 1;
        cVar.f2724d = i10;
        cVar.f2726f = 1;
        cVar.b = i11;
        cVar.f2727g = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public final void M2(a aVar) {
        L2(aVar.b, aVar.f2716c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        if (this.C) {
            p1(xVar);
            xVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i10);
        O1(lVar);
    }

    public final void N2(int i10, int i11) {
        this.f2706t.f2723c = i11 - this.f2707u.m();
        c cVar = this.f2706t;
        cVar.f2724d = i10;
        cVar.f2725e = this.f2710x ? 1 : -1;
        cVar.f2726f = -1;
        cVar.b = i11;
        cVar.f2727g = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        int W1;
        B2();
        if (O() == 0 || (W1 = W1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        Y1();
        K2(W1, (int) (this.f2707u.n() * 0.33333334f), false, b0Var);
        c cVar = this.f2706t;
        cVar.f2727g = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        cVar.f2722a = false;
        Z1(xVar, cVar, b0Var, true);
        View j22 = W1 == -1 ? j2() : i2();
        View o22 = W1 == -1 ? o2() : n2();
        if (!o22.hasFocusable()) {
            return j22;
        }
        if (j22 == null) {
            return null;
        }
        return o22;
    }

    public final void O2(a aVar) {
        N2(aVar.b, aVar.f2716c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(f2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.D == null && this.f2708v == this.f2711y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull y2.p pVar) {
        super.R0(xVar, b0Var, pVar);
        RecyclerView.h hVar = this.b.f2757m;
        if (hVar == null || hVar.e() <= 0) {
            return;
        }
        pVar.b(p.a.B);
    }

    public void R1(@NonNull RecyclerView.b0 b0Var, @NonNull int[] iArr) {
        int i10;
        int p22 = p2(b0Var);
        if (this.f2706t.f2726f == -1) {
            i10 = 0;
        } else {
            i10 = p22;
            p22 = 0;
        }
        iArr[0] = p22;
        iArr[1] = i10;
    }

    public void S1(RecyclerView.b0 b0Var, c cVar, RecyclerView.q.c cVar2) {
        int i10 = cVar.f2724d;
        if (i10 < 0 || i10 >= b0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f2727g));
    }

    public final int T1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return q.a(b0Var, this.f2707u, c2(!this.f2712z, true), b2(!this.f2712z, true), this, this.f2712z);
    }

    public final int U1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return q.b(b0Var, this.f2707u, c2(!this.f2712z, true), b2(!this.f2712z, true), this, this.f2712z, this.f2710x);
    }

    public final int V1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return q.c(b0Var, this.f2707u, c2(!this.f2712z, true), b2(!this.f2712z, true), this, this.f2712z);
    }

    public int W1(int i10) {
        if (i10 == 1) {
            return (this.f2705s != 1 && r2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f2705s != 1 && r2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f2705s == 0) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 33) {
            if (this.f2705s == 1) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 66) {
            if (this.f2705s == 0) {
                return 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 130 && this.f2705s == 1) {
            return 1;
        }
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public c X1() {
        return new c();
    }

    public void Y1() {
        if (this.f2706t == null) {
            this.f2706t = X1();
        }
    }

    public int Z1(RecyclerView.x xVar, c cVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10 = cVar.f2723c;
        int i11 = cVar.f2727g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2727g = i11 + i10;
            }
            w2(xVar, cVar);
        }
        int i12 = cVar.f2723c + cVar.f2728h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f2733m && i12 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            t2(xVar, b0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.f2719a * cVar.f2726f;
                if (!bVar.f2720c || cVar.f2732l != null || !b0Var.e()) {
                    int i13 = cVar.f2723c;
                    int i14 = bVar.f2719a;
                    cVar.f2723c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f2727g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f2719a;
                    cVar.f2727g = i16;
                    int i17 = cVar.f2723c;
                    if (i17 < 0) {
                        cVar.f2727g = i16 + i17;
                    }
                    w2(xVar, cVar);
                }
                if (z10 && bVar.f2721d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2723c;
    }

    public final View a2() {
        return g2(0, O());
    }

    public View b2(boolean z10, boolean z11) {
        return this.f2710x ? h2(0, O(), z10, z11) : h2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    @SuppressLint({"UnknownNullness"})
    public PointF c(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f2710x ? -1 : 1;
        return this.f2705s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int l22;
        int i14;
        View H;
        int g10;
        int i15;
        int i16 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.b() == 0) {
            p1(xVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.f2713a;
        }
        Y1();
        this.f2706t.f2722a = false;
        B2();
        View a02 = a0();
        a aVar = this.E;
        if (!aVar.f2718e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f2717d = this.f2710x ^ this.f2711y;
            J2(xVar, b0Var, aVar2);
            this.E.f2718e = true;
        } else if (a02 != null && (this.f2707u.g(a02) >= this.f2707u.i() || this.f2707u.d(a02) <= this.f2707u.m())) {
            this.E.c(a02, l0(a02));
        }
        c cVar = this.f2706t;
        cVar.f2726f = cVar.f2731k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.f2707u.m();
        int max2 = Math.max(0, this.H[1]) + this.f2707u.j();
        if (b0Var.e() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (H = H(i14)) != null) {
            if (this.f2710x) {
                i15 = this.f2707u.i() - this.f2707u.d(H);
                g10 = this.B;
            } else {
                g10 = this.f2707u.g(H) - this.f2707u.m();
                i15 = this.B;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f2717d ? !this.f2710x : this.f2710x) {
            i16 = 1;
        }
        v2(xVar, b0Var, aVar3, i16);
        B(xVar);
        this.f2706t.f2733m = A2();
        this.f2706t.f2730j = b0Var.e();
        this.f2706t.f2729i = 0;
        a aVar4 = this.E;
        if (aVar4.f2717d) {
            O2(aVar4);
            c cVar2 = this.f2706t;
            cVar2.f2728h = max;
            Z1(xVar, cVar2, b0Var, false);
            c cVar3 = this.f2706t;
            i11 = cVar3.b;
            int i18 = cVar3.f2724d;
            int i19 = cVar3.f2723c;
            if (i19 > 0) {
                max2 += i19;
            }
            M2(this.E);
            c cVar4 = this.f2706t;
            cVar4.f2728h = max2;
            cVar4.f2724d += cVar4.f2725e;
            Z1(xVar, cVar4, b0Var, false);
            c cVar5 = this.f2706t;
            i10 = cVar5.b;
            int i20 = cVar5.f2723c;
            if (i20 > 0) {
                N2(i18, i11);
                c cVar6 = this.f2706t;
                cVar6.f2728h = i20;
                Z1(xVar, cVar6, b0Var, false);
                i11 = this.f2706t.b;
            }
        } else {
            M2(aVar4);
            c cVar7 = this.f2706t;
            cVar7.f2728h = max2;
            Z1(xVar, cVar7, b0Var, false);
            c cVar8 = this.f2706t;
            i10 = cVar8.b;
            int i21 = cVar8.f2724d;
            int i22 = cVar8.f2723c;
            if (i22 > 0) {
                max += i22;
            }
            O2(this.E);
            c cVar9 = this.f2706t;
            cVar9.f2728h = max;
            cVar9.f2724d += cVar9.f2725e;
            Z1(xVar, cVar9, b0Var, false);
            c cVar10 = this.f2706t;
            i11 = cVar10.b;
            int i23 = cVar10.f2723c;
            if (i23 > 0) {
                L2(i21, i10);
                c cVar11 = this.f2706t;
                cVar11.f2728h = i23;
                Z1(xVar, cVar11, b0Var, false);
                i10 = this.f2706t.b;
            }
        }
        if (O() > 0) {
            if (this.f2710x ^ this.f2711y) {
                int l23 = l2(i10, xVar, b0Var, true);
                i12 = i11 + l23;
                i13 = i10 + l23;
                l22 = m2(i12, xVar, b0Var, false);
            } else {
                int m22 = m2(i11, xVar, b0Var, true);
                i12 = i11 + m22;
                i13 = i10 + m22;
                l22 = l2(i13, xVar, b0Var, false);
            }
            i11 = i12 + l22;
            i10 = i13 + l22;
        }
        u2(xVar, b0Var, i11, i10);
        if (b0Var.e()) {
            this.E.e();
        } else {
            this.f2707u.s();
        }
        this.f2708v = this.f2711y;
    }

    public View c2(boolean z10, boolean z11) {
        return this.f2710x ? h2(O() - 1, -1, z10, z11) : h2(0, O(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        this.D = null;
        this.A = -1;
        this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.E.e();
    }

    public int d2() {
        View h22 = h2(0, O(), false, true);
        if (h22 == null) {
            return -1;
        }
        return l0(h22);
    }

    public final View e2() {
        return g2(O() - 1, -1);
    }

    public int f2() {
        View h22 = h2(O() - 1, -1, false, true);
        if (h22 == null) {
            return -1;
        }
        return l0(h22);
    }

    public View g2(int i10, int i11) {
        int i12;
        int i13;
        Y1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f2707u.g(N(i10)) < this.f2707u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f2705s == 0 ? this.f2863e.a(i10, i11, i12, i13) : this.f2864f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.f();
            }
            y1();
        }
    }

    public View h2(int i10, int i11, boolean z10, boolean z11) {
        Y1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f2705s == 0 ? this.f2863e.a(i10, i11, i12, i13) : this.f2864f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public Parcelable i1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (O() <= 0) {
            savedState.f();
            return savedState;
        }
        Y1();
        boolean z10 = this.f2708v ^ this.f2710x;
        savedState.f2714c = z10;
        if (z10) {
            View n22 = n2();
            savedState.b = this.f2707u.i() - this.f2707u.d(n22);
            savedState.f2713a = l0(n22);
            return savedState;
        }
        View o22 = o2();
        savedState.f2713a = l0(o22);
        savedState.b = this.f2707u.g(o22) - this.f2707u.m();
        return savedState;
    }

    public final View i2() {
        return this.f2710x ? a2() : e2();
    }

    public final View j2() {
        return this.f2710x ? e2() : a2();
    }

    public View k2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        Y1();
        int O = O();
        if (z11) {
            i11 = O() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = O;
            i11 = 0;
            i12 = 1;
        }
        int b10 = b0Var.b();
        int m10 = this.f2707u.m();
        int i13 = this.f2707u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View N = N(i11);
            int l02 = l0(N);
            int g10 = this.f2707u.g(N);
            int d10 = this.f2707u.d(N);
            if (l02 >= 0 && l02 < b10) {
                if (!((RecyclerView.r) N.getLayoutParams()).d()) {
                    boolean z12 = d10 <= m10 && g10 < m10;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return N;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = N;
                        }
                        view2 = N;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = N;
                        }
                        view2 = N;
                    }
                } else if (view3 == null) {
                    view3 = N;
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean l1(int i10, Bundle bundle) {
        int min;
        if (super.l1(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f2705s == 1) {
                int i11 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT, -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                min = Math.min(i11, o0(recyclerView.f2737c, recyclerView.f2752j0) - 1);
            } else {
                int i12 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT, -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                min = Math.min(i12, S(recyclerView2.f2737c, recyclerView2.f2752j0) - 1);
            }
            if (min >= 0) {
                D2(min, 0);
                return true;
            }
        }
        return false;
    }

    public final int l2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12 = this.f2707u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -C2(-i12, xVar, b0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f2707u.i() - i14) <= 0) {
            return i13;
        }
        this.f2707u.r(i11);
        return i11 + i13;
    }

    public final int m2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int m10;
        int m11 = i10 - this.f2707u.m();
        if (m11 <= 0) {
            return 0;
        }
        int i11 = -C2(m11, xVar, b0Var);
        int i12 = i10 + i11;
        if (!z10 || (m10 = i12 - this.f2707u.m()) <= 0) {
            return i11;
        }
        this.f2707u.r(-m10);
        return i11 - m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f2705s == 0;
    }

    @Deprecated
    public int p2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.f2707u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f2705s == 1;
    }

    public int q2() {
        return this.f2705s;
    }

    public boolean r2() {
        return d0() == 1;
    }

    public boolean s2() {
        return this.f2712z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void t(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.q.c cVar) {
        if (this.f2705s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        Y1();
        K2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b0Var);
        S1(b0Var, this.f2706t, cVar);
    }

    public void t2(RecyclerView.x xVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i02;
        int f10;
        int i14;
        int i15;
        View d10 = cVar.d(xVar);
        if (d10 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) d10.getLayoutParams();
        if (cVar.f2732l == null) {
            if (this.f2710x == (cVar.f2726f == -1)) {
                i(d10);
            } else {
                j(d10, 0);
            }
        } else {
            if (this.f2710x == (cVar.f2726f == -1)) {
                g(d10);
            } else {
                h(d10, 0);
            }
        }
        F0(d10, 0, 0);
        bVar.f2719a = this.f2707u.e(d10);
        if (this.f2705s == 1) {
            if (r2()) {
                f10 = s0() - j0();
                i02 = f10 - this.f2707u.f(d10);
            } else {
                i02 = i0();
                f10 = this.f2707u.f(d10) + i02;
            }
            if (cVar.f2726f == -1) {
                i15 = cVar.b;
                i14 = i15 - bVar.f2719a;
            } else {
                i14 = cVar.b;
                i15 = bVar.f2719a + i14;
            }
            int i16 = i02;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = f10;
        } else {
            int k02 = k0();
            int f11 = this.f2707u.f(d10) + k02;
            if (cVar.f2726f == -1) {
                int i17 = cVar.b;
                i12 = i17 - bVar.f2719a;
                i10 = i17;
                i11 = f11;
            } else {
                int i18 = cVar.b;
                i10 = bVar.f2719a + i18;
                i11 = f11;
                i12 = i18;
            }
            i13 = k02;
        }
        E0(d10, i12, i13, i10, i11);
        if (rVar.d() || rVar.c()) {
            bVar.f2720c = true;
        }
        bVar.f2721d = d10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void u(int i10, RecyclerView.q.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.D;
        if (savedState == null || !savedState.a()) {
            B2();
            z10 = this.f2710x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z10 = savedState2.f2714c;
            i11 = savedState2.f2713a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public final void u2(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10, int i11) {
        if (!b0Var.g() || O() == 0 || b0Var.e() || !Q1()) {
            return;
        }
        List<RecyclerView.f0> k10 = xVar.k();
        int size = k10.size();
        int l02 = l0(N(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.f0 f0Var = k10.get(i14);
            if (!f0Var.w()) {
                if ((f0Var.n() < l02) != this.f2710x) {
                    i12 += this.f2707u.e(f0Var.f2827a);
                } else {
                    i13 += this.f2707u.e(f0Var.f2827a);
                }
            }
        }
        this.f2706t.f2732l = k10;
        if (i12 > 0) {
            N2(l0(o2()), i10);
            c cVar = this.f2706t;
            cVar.f2728h = i12;
            cVar.f2723c = 0;
            cVar.a();
            Z1(xVar, this.f2706t, b0Var, false);
        }
        if (i13 > 0) {
            L2(l0(n2()), i11);
            c cVar2 = this.f2706t;
            cVar2.f2728h = i13;
            cVar2.f2723c = 0;
            cVar2.a();
            Z1(xVar, this.f2706t, b0Var, false);
        }
        this.f2706t.f2732l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int v(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    public void v2(RecyclerView.x xVar, RecyclerView.b0 b0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int w(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    public final void w2(RecyclerView.x xVar, c cVar) {
        if (!cVar.f2722a || cVar.f2733m) {
            return;
        }
        int i10 = cVar.f2727g;
        int i11 = cVar.f2729i;
        if (cVar.f2726f == -1) {
            y2(xVar, i10, i11);
        } else {
            z2(xVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int x(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    public final void x2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                s1(i10, xVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                s1(i12, xVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int y(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    public final void y2(RecyclerView.x xVar, int i10, int i11) {
        int O = O();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.f2707u.h() - i10) + i11;
        if (this.f2710x) {
            for (int i12 = 0; i12 < O; i12++) {
                View N = N(i12);
                if (this.f2707u.g(N) < h10 || this.f2707u.q(N) < h10) {
                    x2(xVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = O - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View N2 = N(i14);
            if (this.f2707u.g(N2) < h10 || this.f2707u.q(N2) < h10) {
                x2(xVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int z(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    public final void z2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int O = O();
        if (!this.f2710x) {
            for (int i13 = 0; i13 < O; i13++) {
                View N = N(i13);
                if (this.f2707u.d(N) > i12 || this.f2707u.p(N) > i12) {
                    x2(xVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = O - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View N2 = N(i15);
            if (this.f2707u.d(N2) > i12 || this.f2707u.p(N2) > i12) {
                x2(xVar, i14, i15);
                return;
            }
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f2705s = 1;
        this.f2709w = false;
        this.f2710x = false;
        this.f2711y = false;
        this.f2712z = true;
        this.A = -1;
        this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i10);
        F2(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2705s = 1;
        this.f2709w = false;
        this.f2710x = false;
        this.f2711y = false;
        this.f2712z = true;
        this.A = -1;
        this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.q.d m02 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        E2(m02.f2879a);
        F2(m02.f2880c);
        G2(m02.f2881d);
    }
}
