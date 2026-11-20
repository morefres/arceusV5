package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import y2.p;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set<Integer> U = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public d O;
    public final Rect P;
    public boolean Q;
    public int R;
    public int S;
    public int T;

    public static class a {
        public static boolean a(@NonNull View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f2702a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        public boolean f2703c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2704d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public int b(int i10, int i11) {
            if (!this.f2704d) {
                return d(i10, i11);
            }
            int i12 = this.b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.b.put(i10, d10);
            return d10;
        }

        public int c(int i10, int i11) {
            if (!this.f2703c) {
                return e(i10, i11);
            }
            int i12 = this.f2702a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f2702a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f2704d || (a10 = a(this.b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                i12 = this.b.get(a10);
                i13 = a10 + 1;
                i14 = c(a10, i11) + f(a10);
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                i14 += f11;
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                } else if (i14 > i11) {
                    i12++;
                    i14 = f11;
                }
                i13++;
            }
            return i14 + f10 > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.f2702a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        t3(RecyclerView.q.m0(context, attributeSet, i10, i11).b);
    }

    public static int[] S2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.b0 b0Var) {
        return this.Q ? V2(b0Var) : super.A(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        u3();
        X2();
        return super.B1(i10, xVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        u3();
        X2();
        return super.D1(i10, xVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.G2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int s8;
        int s10;
        if (this.K == null) {
            super.H1(rect, i10, i11);
        }
        int i02 = i0() + j0();
        int k02 = k0() + h0();
        if (this.f2705s == 1) {
            s10 = RecyclerView.q.s(i11, rect.height() + k02, f0());
            int[] iArr = this.K;
            s8 = RecyclerView.q.s(i10, iArr[iArr.length - 1] + i02, g0());
        } else {
            s8 = RecyclerView.q.s(i10, rect.width() + i02, g0());
            int[] iArr2 = this.K;
            s10 = RecyclerView.q.s(i11, iArr2[iArr2.length - 1] + k02, f0());
        }
        G1(s8, s10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f2705s == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View O0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.x r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.O0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    public final void P2(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            c cVar = (c) view.getLayoutParams();
            int o32 = o3(xVar, b0Var, l0(view));
            cVar.f2701f = o32;
            cVar.f2700e = i14;
            i14 += o32;
            i11 += i13;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.D == null && !this.I;
    }

    public final void Q2() {
        int O = O();
        for (int i10 = 0; i10 < O; i10++) {
            c cVar = (c) N(i10).getLayoutParams();
            int b10 = cVar.b();
            this.M.put(b10, cVar.g());
            this.N.put(b10, cVar.f());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull y2.p pVar) {
        super.R0(xVar, b0Var, pVar);
        pVar.l0(GridView.class.getName());
        RecyclerView.h hVar = this.b.f2757m;
        if (hVar == null || hVar.e() <= 1) {
            return;
        }
        pVar.b(p.a.V);
    }

    public final void R2(int i10) {
        this.K = S2(this.K, this.J, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2705s == 1) {
            return Math.min(this.J, e());
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return m3(xVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void S1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && cVar.c(b0Var) && i10 > 0; i11++) {
            int i12 = cVar.f2724d;
            cVar2.a(i12, Math.max(0, cVar.f2727g));
            i10 -= this.O.f(i12);
            cVar.f2724d += cVar.f2725e;
        }
    }

    public final void T2() {
        this.M.clear();
        this.N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(RecyclerView.x xVar, RecyclerView.b0 b0Var, View view, y2.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, pVar);
            return;
        }
        c cVar = (c) layoutParams;
        int m32 = m3(xVar, b0Var, cVar.b());
        if (this.f2705s == 0) {
            pVar.o0(p.g.b(cVar.f(), cVar.g(), m32, 1, false, false));
        } else {
            pVar.o0(p.g.b(m32, 1, cVar.f(), cVar.g(), false, false));
        }
    }

    public final int U2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            Y1();
            boolean s22 = s2();
            View c22 = c2(!s22, true);
            View b22 = b2(!s22, true);
            if (c22 != null && b22 != null) {
                int b10 = this.O.b(l0(c22), this.J);
                int b11 = this.O.b(l0(b22), this.J);
                int max = this.f2710x ? Math.max(0, ((this.O.b(b0Var.b() - 1, this.J) + 1) - Math.max(b10, b11)) - 1) : Math.max(0, Math.min(b10, b11));
                if (s22) {
                    return Math.round((max * (Math.abs(this.f2707u.d(b22) - this.f2707u.g(c22)) / ((this.O.b(l0(b22), this.J) - this.O.b(l0(c22), this.J)) + 1))) + (this.f2707u.m() - this.f2707u.g(c22)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int V2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            Y1();
            View c22 = c2(!s2(), true);
            View b22 = b2(!s2(), true);
            if (c22 != null && b22 != null) {
                if (!s2()) {
                    return this.O.b(b0Var.b() - 1, this.J) + 1;
                }
                int d10 = this.f2707u.d(b22) - this.f2707u.g(c22);
                int b10 = this.O.b(l0(c22), this.J);
                return (int) ((d10 / ((this.O.b(l0(b22), this.J) - b10) + 1)) * (this.O.b(b0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public final void W2(RecyclerView.x xVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int n32 = n3(xVar, b0Var, aVar.b);
        if (z10) {
            while (n32 > 0) {
                int i11 = aVar.b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.b = i12;
                n32 = n3(xVar, b0Var, i12);
            }
            return;
        }
        int b10 = b0Var.b() - 1;
        int i13 = aVar.b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int n33 = n3(xVar, b0Var, i14);
            if (n33 <= n32) {
                break;
            }
            i13 = i14;
            n32 = n33;
        }
        aVar.b = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public final void X2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    public final View Y2() {
        for (int i10 = 0; i10 < O(); i10++) {
            View N = N(i10);
            Objects.requireNonNull(N);
            if (a.a(N)) {
                return N(i10);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public int Z2(int i10) {
        if (i10 < 0 || this.f2705s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < e(); i11++) {
            for (Integer num : i3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int intValue = num2.intValue();
            if (intValue > i10) {
                int intValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = intValue;
                this.T = 0;
                return intValue2;
            }
        }
        return -1;
    }

    public int a3(int i10) {
        if (i10 < 0 || this.f2705s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < e(); i11++) {
            for (Integer num : i3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int intValue = num2.intValue();
            if (intValue < i10) {
                int intValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = intValue;
                this.T = f3(intValue2);
                return intValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    public final int b3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int h32 = h3(i13);
            int f32 = f3(i13);
            if (h32 < 0 || f32 < 0) {
                break;
            }
            if (this.f2705s == 1) {
                if (h32 < i10 && g3(i13).contains(Integer.valueOf(i11))) {
                    this.S = h32;
                    return i13;
                }
            } else if (h32 < i10 && f32 == i11) {
                this.S = ((Integer) Collections.max(i3(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            Q2();
        }
        super.c1(xVar, b0Var);
        T2();
    }

    public final int c3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < e(); i13++) {
            int h32 = h3(i13);
            int f32 = f3(i13);
            if (h32 < 0 || f32 < 0) {
                break;
            }
            if (this.f2705s == 1) {
                if (h32 > i10 && (f32 == i11 || g3(i13).contains(Integer.valueOf(i11)))) {
                    this.S = h32;
                    return i13;
                }
            } else if (h32 > i10 && f32 == i11) {
                this.S = h3(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        View H;
        super.d1(b0Var);
        this.I = false;
        int i10 = this.R;
        if (i10 == -1 || (H = H(i10)) == null) {
            return;
        }
        H.sendAccessibilityEvent(67108864);
        this.R = -1;
    }

    public final int d3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int h32 = h3(i13);
            int f32 = f3(i13);
            if (h32 < 0 || f32 < 0) {
                break;
            }
            if (this.f2705s == 1) {
                if ((h32 == i10 && f32 < i11) || h32 < i10) {
                    this.S = h32;
                    this.T = f32;
                    return i13;
                }
            } else if (i3(i13).contains(Integer.valueOf(i10)) && f32 < i11) {
                this.T = f32;
                return i13;
            }
        }
        return -1;
    }

    public final int e3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < e(); i13++) {
            int h32 = h3(i13);
            int f32 = f3(i13);
            if (h32 < 0 || f32 < 0) {
                break;
            }
            if (this.f2705s == 1) {
                if ((h32 == i10 && f32 > i11) || h32 > i10) {
                    this.S = h32;
                    this.T = f32;
                    return i13;
                }
            } else if (f32 > i11 && i3(i13).contains(Integer.valueOf(i10))) {
                this.T = f32;
                return i13;
            }
        }
        return -1;
    }

    public final int f3(int i10) {
        if (this.f2705s == 0) {
            RecyclerView recyclerView = this.b;
            return m3(recyclerView.f2737c, recyclerView.f2752j0, i10);
        }
        RecyclerView recyclerView2 = this.b;
        return n3(recyclerView2.f2737c, recyclerView2.f2752j0, i10);
    }

    public final Set<Integer> g3(int i10) {
        return j3(f3(i10), i10);
    }

    public final int h3(int i10) {
        if (this.f2705s == 1) {
            RecyclerView recyclerView = this.b;
            return m3(recyclerView.f2737c, recyclerView.f2752j0, i10);
        }
        RecyclerView recyclerView2 = this.b;
        return n3(recyclerView2.f2737c, recyclerView2.f2752j0, i10);
    }

    public final Set<Integer> i3(int i10) {
        return j3(h3(i10), i10);
    }

    public final Set<Integer> j3(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int o32 = o3(recyclerView.f2737c, recyclerView.f2752j0, i11);
        for (int i12 = i10; i12 < i10 + o32; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View k2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int O = O();
        int i12 = 1;
        if (z11) {
            i11 = O() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = O;
            i11 = 0;
        }
        int b10 = b0Var.b();
        Y1();
        int m10 = this.f2707u.m();
        int i13 = this.f2707u.i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View N = N(i11);
            int l02 = l0(N);
            if (l02 >= 0 && l02 < b10 && n3(xVar, b0Var, l02) == 0) {
                if (((RecyclerView.r) N.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = N;
                    }
                } else {
                    if (this.f2707u.g(N) < i13 && this.f2707u.d(N) >= m10) {
                        return N;
                    }
                    if (view == null) {
                        view = N;
                    }
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2;
    }

    public int k3(int i10, int i11) {
        if (this.f2705s != 1 || !r2()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean l1(int i10, Bundle bundle) {
        RecyclerView.f0 m02;
        int d32;
        if (i10 != p.a.V.b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.l1(i10, bundle);
            }
            int i11 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT, -1);
            int i12 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT, -1);
            if (i11 != -1 && i12 != -1) {
                int e10 = this.b.f2757m.e();
                int i13 = 0;
                while (true) {
                    if (i13 >= e10) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int n32 = n3(recyclerView.f2737c, recyclerView.f2752j0, i13);
                    RecyclerView recyclerView2 = this.b;
                    int m32 = m3(recyclerView2.f2737c, recyclerView2.f2752j0, i13);
                    if (this.f2705s == 1) {
                        if (n32 == i12 && m32 == i11) {
                            break;
                        }
                        i13++;
                    } else {
                        if (n32 == i11 && m32 == i12) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    D2(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View Y2 = Y2();
        if (Y2 == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!U.contains(Integer.valueOf(i14)) || (m02 = this.b.m0(Y2)) == null) {
            return false;
        }
        int j10 = m02.j();
        int h32 = h3(j10);
        int f32 = f3(j10);
        if (h32 >= 0 && f32 >= 0) {
            if (q3(j10)) {
                this.S = h32;
                this.T = f32;
            }
            int i15 = this.S;
            if (i15 == -1) {
                i15 = h32;
            }
            int i16 = this.T;
            if (i16 != -1) {
                f32 = i16;
            }
            if (i14 == 17) {
                d32 = d3(i15, f32, j10);
            } else if (i14 == 33) {
                d32 = b3(i15, f32, j10);
            } else if (i14 == 66) {
                d32 = e3(i15, f32, j10);
            } else {
                if (i14 != 130) {
                    return false;
                }
                d32 = c3(i15, f32, j10);
            }
            if (d32 == -1 && this.f2705s == 0) {
                if (i14 == 17) {
                    d32 = a3(h32);
                } else if (i14 == 66) {
                    d32 = Z2(h32);
                }
            }
            if (d32 != -1) {
                C1(d32);
                this.R = d32;
                return true;
            }
        }
        return false;
    }

    public int l3() {
        return this.J;
    }

    public final int m3(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.O.b(f10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int n3(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.O.c(f10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2705s == 0) {
            return Math.min(this.J, e());
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return m3(xVar, b0Var, b0Var.b() - 1) + 1;
    }

    public final int o3(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.O.f(f10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void p3(float f10, int i10) {
        R2(Math.max(Math.round(f10 * this.J), i10));
    }

    public final boolean q3(int i10) {
        return (i3(i10).contains(Integer.valueOf(this.S)) && g3(i10).contains(Integer.valueOf(this.T))) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public final void r3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int k32 = k3(cVar.f2700e, cVar.f2701f);
        if (this.f2705s == 1) {
            i12 = RecyclerView.q.P(k32, i10, i14, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            i11 = RecyclerView.q.P(this.f2707u.n(), c0(), i13, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int P = RecyclerView.q.P(k32, i10, i13, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int P2 = RecyclerView.q.P(this.f2707u.n(), t0(), i14, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i11 = P;
            i12 = P2;
        }
        s3(view, i12, i11, z10);
    }

    public final void s3(View view, int i10, int i11, boolean z10) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z10 ? M1(view, i10, i11, rVar) : K1(view, i10, i11, rVar)) {
            view.measure(i10, i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t2(androidx.recyclerview.widget.RecyclerView.x r18, androidx.recyclerview.widget.RecyclerView.b0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.t2(androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public void t3(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.h();
            y1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public final void u3() {
        int b02;
        int k02;
        if (q2() == 1) {
            b02 = s0() - j0();
            k02 = i0();
        } else {
            b02 = b0() - h0();
            k02 = k0();
        }
        R2(b02 - k02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void v2(RecyclerView.x xVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        super.v2(xVar, b0Var, aVar, i10);
        u3();
        if (b0Var.b() > 0 && !b0Var.e()) {
            W2(xVar, b0Var, aVar, i10);
        }
        X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.b0 b0Var) {
        return this.Q ? U2(b0Var) : super.w(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.b0 b0Var) {
        return this.Q ? V2(b0Var) : super.x(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return this.Q ? U2(b0Var) : super.z(b0Var);
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e, reason: collision with root package name */
        public int f2700e;

        /* renamed from: f, reason: collision with root package name */
        public int f2701f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2700e = -1;
            this.f2701f = 0;
        }

        public int f() {
            return this.f2700e;
        }

        public int g() {
            return this.f2701f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f2700e = -1;
            this.f2701f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2700e = -1;
            this.f2701f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2700e = -1;
            this.f2701f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        t3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        t3(i10);
    }
}
