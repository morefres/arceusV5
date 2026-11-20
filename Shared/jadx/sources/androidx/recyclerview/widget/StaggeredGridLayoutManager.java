package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import y2.p;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.a0.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public SavedState I;
    public int J;
    public int[] O;

    /* renamed from: t, reason: collision with root package name */
    public d[] f2899t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public n f2900u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public n f2901v;

    /* renamed from: w, reason: collision with root package name */
    public int f2902w;

    /* renamed from: x, reason: collision with root package name */
    public int f2903x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final k f2904y;

    /* renamed from: s, reason: collision with root package name */
    public int f2898s = -1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2905z = false;
    public boolean A = false;
    public int C = -1;
    public int D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public LazySpanLookup E = new LazySpanLookup();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f2910a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f2911c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f2912d;

        /* renamed from: e, reason: collision with root package name */
        public int f2913e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f2914f;

        /* renamed from: g, reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f2915g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2916h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2917i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2918j;

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

        public void a() {
            this.f2912d = null;
            this.f2911c = 0;
            this.f2910a = -1;
            this.b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void f() {
            this.f2912d = null;
            this.f2911c = 0;
            this.f2913e = 0;
            this.f2914f = null;
            this.f2915g = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2910a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f2911c);
            if (this.f2911c > 0) {
                parcel.writeIntArray(this.f2912d);
            }
            parcel.writeInt(this.f2913e);
            if (this.f2913e > 0) {
                parcel.writeIntArray(this.f2914f);
            }
            parcel.writeInt(this.f2916h ? 1 : 0);
            parcel.writeInt(this.f2917i ? 1 : 0);
            parcel.writeInt(this.f2918j ? 1 : 0);
            parcel.writeList(this.f2915g);
        }

        public SavedState(Parcel parcel) {
            this.f2910a = parcel.readInt();
            this.b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2911c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2912d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2913e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2914f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2916h = parcel.readInt() == 1;
            this.f2917i = parcel.readInt() == 1;
            this.f2918j = parcel.readInt() == 1;
            this.f2915g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2911c = savedState.f2911c;
            this.f2910a = savedState.f2910a;
            this.b = savedState.b;
            this.f2912d = savedState.f2912d;
            this.f2913e = savedState.f2913e;
            this.f2914f = savedState.f2914f;
            this.f2916h = savedState.f2916h;
            this.f2917i = savedState.f2917i;
            this.f2918j = savedState.f2918j;
            this.f2915g = savedState.f2915g;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.X1();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2920a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2921c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2922d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2923e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f2924f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.f2921c ? StaggeredGridLayoutManager.this.f2900u.i() : StaggeredGridLayoutManager.this.f2900u.m();
        }

        public void b(int i10) {
            if (this.f2921c) {
                this.b = StaggeredGridLayoutManager.this.f2900u.i() - i10;
            } else {
                this.b = StaggeredGridLayoutManager.this.f2900u.m() + i10;
            }
        }

        public void c() {
            this.f2920a = -1;
            this.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2921c = false;
            this.f2922d = false;
            this.f2923e = false;
            int[] iArr = this.f2924f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f2924f;
            if (iArr == null || iArr.length < length) {
                this.f2924f = new int[StaggeredGridLayoutManager.this.f2899t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f2924f[i10] = dVarArr[i10].p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e, reason: collision with root package name */
        public d f2926e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2927f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int f() {
            d dVar = this.f2926e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f2931e;
        }

        public boolean g() {
            return this.f2927f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList<View> f2928a = new ArrayList<>();
        public int b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* renamed from: c, reason: collision with root package name */
        public int f2929c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* renamed from: d, reason: collision with root package name */
        public int f2930d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f2931e;

        public d(int i10) {
            this.f2931e = i10;
        }

        public void a(View view) {
            c n10 = n(view);
            n10.f2926e = this;
            this.f2928a.add(view);
            this.f2929c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            if (this.f2928a.size() == 1) {
                this.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            if (n10.d() || n10.c()) {
                this.f2930d += StaggeredGridLayoutManager.this.f2900u.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int l10 = z10 ? l(EditorInfoCompat.IME_FLAG_FORCE_ASCII) : p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            e();
            if (l10 == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || l10 >= StaggeredGridLayoutManager.this.f2900u.i()) {
                if (z10 || l10 <= StaggeredGridLayoutManager.this.f2900u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        l10 += i10;
                    }
                    this.f2929c = l10;
                    this.b = l10;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem f10;
            ArrayList<View> arrayList = this.f2928a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f2929c = StaggeredGridLayoutManager.this.f2900u.d(view);
            if (n10.f2927f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.b())) != null && f10.b == 1) {
                this.f2929c += f10.a(this.f2931e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem f10;
            View view = this.f2928a.get(0);
            c n10 = n(view);
            this.b = StaggeredGridLayoutManager.this.f2900u.g(view);
            if (n10.f2927f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.b())) != null && f10.b == -1) {
                this.b -= f10.a(this.f2931e);
            }
        }

        public void e() {
            this.f2928a.clear();
            q();
            this.f2930d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f2905z ? i(this.f2928a.size() - 1, -1, true) : i(0, this.f2928a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f2905z ? i(0, this.f2928a.size(), true) : i(this.f2928a.size() - 1, -1, true);
        }

        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.f2900u.m();
            int i12 = StaggeredGridLayoutManager.this.f2900u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f2928a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f2900u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f2900u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 >= i12 : g10 > i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (g10 >= m10 && d10 <= i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (g10 < m10 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f2930d;
        }

        public int k() {
            int i10 = this.f2929c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f2929c;
        }

        public int l(int i10) {
            int i11 = this.f2929c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2928a.size() == 0) {
                return i10;
            }
            c();
            return this.f2929c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f2928a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2928a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2905z && staggeredGridLayoutManager.l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2905z && staggeredGridLayoutManager2.l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f2928a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = this.f2928a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f2905z && staggeredGridLayoutManager3.l0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f2905z && staggeredGridLayoutManager4.l0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i10 = this.b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.b;
        }

        public int p(int i10) {
            int i11 = this.b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2928a.size() == 0) {
                return i10;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2929c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }

        public void r(int i10) {
            int i11 = this.b;
            if (i11 != Integer.MIN_VALUE) {
                this.b = i11 + i10;
            }
            int i12 = this.f2929c;
            if (i12 != Integer.MIN_VALUE) {
                this.f2929c = i12 + i10;
            }
        }

        public void s() {
            int size = this.f2928a.size();
            View remove = this.f2928a.remove(size - 1);
            c n10 = n(remove);
            n10.f2926e = null;
            if (n10.d() || n10.c()) {
                this.f2930d -= StaggeredGridLayoutManager.this.f2900u.e(remove);
            }
            if (size == 1) {
                this.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            this.f2929c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }

        public void t() {
            View remove = this.f2928a.remove(0);
            c n10 = n(remove);
            n10.f2926e = null;
            if (this.f2928a.size() == 0) {
                this.f2929c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            if (n10.d() || n10.c()) {
                this.f2930d -= StaggeredGridLayoutManager.this.f2900u.e(remove);
            }
            this.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }

        public void u(View view) {
            c n10 = n(view);
            n10.f2926e = this;
            this.f2928a.add(0, view);
            this.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            if (this.f2928a.size() == 1) {
                this.f2929c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            if (n10.d() || n10.c()) {
                this.f2930d += StaggeredGridLayoutManager.this.f2900u.e(view);
            }
        }

        public void v(int i10) {
            this.b = i10;
            this.f2929c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d m02 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        M2(m02.f2879a);
        O2(m02.b);
        N2(m02.f2880c);
        this.f2904y = new k();
        f2();
    }

    private void J2() {
        if (this.f2902w == 1 || !y2()) {
            this.A = this.f2905z;
        } else {
            this.A = !this.f2905z;
        }
    }

    private int Z1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.a(b0Var, this.f2900u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int a2(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.b(b0Var, this.f2900u, j2(!this.N), i2(!this.N), this, this.N, this.A);
    }

    private int b2(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.c(b0Var, this.f2900u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int c2(int i10) {
        if (i10 == 1) {
            return (this.f2902w != 1 && y2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f2902w != 1 && y2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f2902w == 0) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 33) {
            if (this.f2902w == 1) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 66) {
            if (this.f2902w == 0) {
                return 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 130 && this.f2902w == 1) {
            return 1;
        }
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    private void z2(View view, int i10, int i11, boolean z10) {
        o(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int W2 = W2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int W22 = W2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? M1(view, W2, W22, cVar) : K1(view, W2, W22, cVar)) {
            view.measure(W2, W22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.b0 b0Var) {
        return b2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f2905z;
    }

    public final void A2(View view, c cVar, boolean z10) {
        if (cVar.f2927f) {
            if (this.f2902w == 1) {
                z2(view, this.J, RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
        }
        if (this.f2902w == 1) {
            z2(view, RecyclerView.q.P(this.f2903x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.P(this.f2903x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        return K2(i10, xVar, b0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (X1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B2(androidx.recyclerview.widget.RecyclerView.x r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2(androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.f2910a != i10) {
            savedState.a();
        }
        this.C = i10;
        this.D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        y1();
    }

    public final boolean C2(int i10) {
        if (this.f2902w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        return K2(i10, xVar, b0Var);
    }

    public void D2(int i10, RecyclerView.b0 b0Var) {
        int o22;
        int i11;
        if (i10 > 0) {
            o22 = p2();
            i11 = 1;
        } else {
            o22 = o2();
            i11 = -1;
        }
        this.f2904y.f3073a = true;
        T2(o22, b0Var);
        L2(i11);
        k kVar = this.f2904y;
        kVar.f3074c = o22 + kVar.f3075d;
        kVar.b = Math.abs(i10);
    }

    public final void E2(View view) {
        for (int i10 = this.f2898s - 1; i10 >= 0; i10--) {
            this.f2899t[i10].u(view);
        }
    }

    public final void F2(RecyclerView.x xVar, k kVar) {
        if (!kVar.f3073a || kVar.f3080i) {
            return;
        }
        if (kVar.b == 0) {
            if (kVar.f3076e == -1) {
                G2(xVar, kVar.f3078g);
                return;
            } else {
                H2(xVar, kVar.f3077f);
                return;
            }
        }
        if (kVar.f3076e != -1) {
            int s22 = s2(kVar.f3078g) - kVar.f3078g;
            H2(xVar, s22 < 0 ? kVar.f3077f : Math.min(s22, kVar.b) + kVar.f3077f);
        } else {
            int i10 = kVar.f3077f;
            int r22 = i10 - r2(i10);
            G2(xVar, r22 < 0 ? kVar.f3078g : kVar.f3078g - Math.min(r22, kVar.b));
        }
    }

    public final void G2(RecyclerView.x xVar, int i10) {
        for (int O = O() - 1; O >= 0; O--) {
            View N = N(O);
            if (this.f2900u.g(N) < i10 || this.f2900u.q(N) < i10) {
                return;
            }
            c cVar = (c) N.getLayoutParams();
            if (cVar.f2927f) {
                for (int i11 = 0; i11 < this.f2898s; i11++) {
                    if (this.f2899t[i11].f2928a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f2898s; i12++) {
                    this.f2899t[i12].s();
                }
            } else if (cVar.f2926e.f2928a.size() == 1) {
                return;
            } else {
                cVar.f2926e.s();
            }
            r1(N, xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H0(int i10) {
        super.H0(i10);
        for (int i11 = 0; i11 < this.f2898s; i11++) {
            this.f2899t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int s8;
        int s10;
        int i02 = i0() + j0();
        int k02 = k0() + h0();
        if (this.f2902w == 1) {
            s10 = RecyclerView.q.s(i11, rect.height() + k02, f0());
            s8 = RecyclerView.q.s(i10, (this.f2903x * this.f2898s) + i02, g0());
        } else {
            s8 = RecyclerView.q.s(i10, rect.width() + i02, g0());
            s10 = RecyclerView.q.s(i11, (this.f2903x * this.f2898s) + k02, f0());
        }
        G1(s8, s10);
    }

    public final void H2(RecyclerView.x xVar, int i10) {
        while (O() > 0) {
            View N = N(0);
            if (this.f2900u.d(N) > i10 || this.f2900u.p(N) > i10) {
                return;
            }
            c cVar = (c) N.getLayoutParams();
            if (cVar.f2927f) {
                for (int i11 = 0; i11 < this.f2898s; i11++) {
                    if (this.f2899t[i11].f2928a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f2898s; i12++) {
                    this.f2899t[i12].t();
                }
            } else if (cVar.f2926e.f2928a.size() == 1) {
                return;
            } else {
                cVar.f2926e.t();
            }
            r1(N, xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f2902w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I0(int i10) {
        super.I0(i10);
        for (int i11 = 0; i11 < this.f2898s; i11++) {
            this.f2899t[i11].r(i10);
        }
    }

    public final void I2() {
        if (this.f2901v.k() == 1073741824) {
            return;
        }
        int O = O();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < O; i10++) {
            View N = N(i10);
            float e10 = this.f2901v.e(N);
            if (e10 >= f10) {
                if (((c) N.getLayoutParams()).g()) {
                    e10 = (e10 * 1.0f) / this.f2898s;
                }
                f10 = Math.max(f10, e10);
            }
        }
        int i11 = this.f2903x;
        int round = Math.round(f10 * this.f2898s);
        if (this.f2901v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f2901v.n());
        }
        U2(round);
        if (this.f2903x == i11) {
            return;
        }
        for (int i12 = 0; i12 < O; i12++) {
            View N2 = N(i12);
            c cVar = (c) N2.getLayoutParams();
            if (!cVar.f2927f) {
                if (y2() && this.f2902w == 1) {
                    int i13 = this.f2898s;
                    int i14 = cVar.f2926e.f2931e;
                    N2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f2903x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f2926e.f2931e;
                    int i16 = this.f2903x * i15;
                    int i17 = i15 * i11;
                    if (this.f2902w == 1) {
                        N2.offsetLeftAndRight(i16 - i17);
                    } else {
                        N2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void J0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f2898s; i10++) {
            this.f2899t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int K2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        D2(i10, b0Var);
        int g22 = g2(xVar, this.f2904y, b0Var);
        if (this.f2904y.b >= g22) {
            i10 = i10 < 0 ? -g22 : g22;
        }
        this.f2900u.r(-i10);
        this.G = this.A;
        k kVar = this.f2904y;
        kVar.b = 0;
        F2(xVar, kVar);
        return i10;
    }

    public final void L2(int i10) {
        k kVar = this.f2904y;
        kVar.f3076e = i10;
        kVar.f3075d = this.A != (i10 == -1) ? -1 : 1;
    }

    public void M2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i10 == this.f2902w) {
            return;
        }
        this.f2902w = i10;
        n nVar = this.f2900u;
        this.f2900u = this.f2901v;
        this.f2901v = nVar;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        t1(this.P);
        for (int i10 = 0; i10 < this.f2898s; i10++) {
            this.f2899t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i10);
        O1(lVar);
    }

    public void N2(boolean z10) {
        l(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.f2916h != z10) {
            savedState.f2916h = z10;
        }
        this.f2905z = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        View G;
        View m10;
        if (O() == 0 || (G = G(view)) == null) {
            return null;
        }
        J2();
        int c22 = c2(i10);
        if (c22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) G.getLayoutParams();
        boolean z10 = cVar.f2927f;
        d dVar = cVar.f2926e;
        int p22 = c22 == 1 ? p2() : o2();
        T2(p22, b0Var);
        L2(c22);
        k kVar = this.f2904y;
        kVar.f3074c = kVar.f3075d + p22;
        kVar.b = (int) (this.f2900u.n() * 0.33333334f);
        k kVar2 = this.f2904y;
        kVar2.f3079h = true;
        kVar2.f3073a = false;
        g2(xVar, kVar2, b0Var);
        this.G = this.A;
        if (!z10 && (m10 = dVar.m(p22, c22)) != null && m10 != G) {
            return m10;
        }
        if (C2(c22)) {
            for (int i11 = this.f2898s - 1; i11 >= 0; i11--) {
                View m11 = this.f2899t[i11].m(p22, c22);
                if (m11 != null && m11 != G) {
                    return m11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f2898s; i12++) {
                View m12 = this.f2899t[i12].m(p22, c22);
                if (m12 != null && m12 != G) {
                    return m12;
                }
            }
        }
        boolean z11 = (this.f2905z ^ true) == (c22 == -1);
        if (!z10) {
            View H = H(z11 ? dVar.f() : dVar.g());
            if (H != null && H != G) {
                return H;
            }
        }
        if (C2(c22)) {
            for (int i13 = this.f2898s - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f2931e) {
                    View H2 = H(z11 ? this.f2899t[i13].f() : this.f2899t[i13].g());
                    if (H2 != null && H2 != G) {
                        return H2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f2898s; i14++) {
                View H3 = H(z11 ? this.f2899t[i14].f() : this.f2899t[i14].g());
                if (H3 != null && H3 != G) {
                    return H3;
                }
            }
        }
        return null;
    }

    public void O2(int i10) {
        l(null);
        if (i10 != this.f2898s) {
            x2();
            this.f2898s = i10;
            this.B = new BitSet(this.f2898s);
            this.f2899t = new d[this.f2898s];
            for (int i11 = 0; i11 < this.f2898s; i11++) {
                this.f2899t[i11] = new d(i11);
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            View j22 = j2(false);
            View i22 = i2(false);
            if (j22 == null || i22 == null) {
                return;
            }
            int l02 = l0(j22);
            int l03 = l0(i22);
            if (l02 < l03) {
                accessibilityEvent.setFromIndex(l02);
                accessibilityEvent.setToIndex(l03);
            } else {
                accessibilityEvent.setFromIndex(l03);
                accessibilityEvent.setToIndex(l02);
            }
        }
    }

    public final void P2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2898s; i12++) {
            if (!this.f2899t[i12].f2928a.isEmpty()) {
                V2(this.f2899t[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.I == null;
    }

    public final boolean Q2(RecyclerView.b0 b0Var, b bVar) {
        bVar.f2920a = this.G ? l2(b0Var.b()) : h2(b0Var.b());
        bVar.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull y2.p pVar) {
        super.R0(xVar, b0Var, pVar);
        pVar.l0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void R1(View view) {
        for (int i10 = this.f2898s - 1; i10 >= 0; i10--) {
            this.f2899t[i10].a(view);
        }
    }

    public boolean R2(RecyclerView.b0 b0Var, b bVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                SavedState savedState = this.I;
                if (savedState == null || savedState.f2910a == -1 || savedState.f2911c < 1) {
                    View H = H(this.C);
                    if (H != null) {
                        bVar.f2920a = this.A ? p2() : o2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f2921c) {
                                bVar.b = (this.f2900u.i() - this.D) - this.f2900u.d(H);
                            } else {
                                bVar.b = (this.f2900u.m() + this.D) - this.f2900u.g(H);
                            }
                            return true;
                        }
                        if (this.f2900u.e(H) > this.f2900u.n()) {
                            bVar.b = bVar.f2921c ? this.f2900u.i() : this.f2900u.m();
                            return true;
                        }
                        int g10 = this.f2900u.g(H) - this.f2900u.m();
                        if (g10 < 0) {
                            bVar.b = -g10;
                            return true;
                        }
                        int i11 = this.f2900u.i() - this.f2900u.d(H);
                        if (i11 < 0) {
                            bVar.b = i11;
                            return true;
                        }
                        bVar.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        int i12 = this.C;
                        bVar.f2920a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f2921c = W1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f2922d = true;
                    }
                } else {
                    bVar.b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    bVar.f2920a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var) {
        if (this.f2902w == 1) {
            return Math.min(this.f2898s, b0Var.b());
        }
        return -1;
    }

    public final void S1(b bVar) {
        SavedState savedState = this.I;
        int i10 = savedState.f2911c;
        if (i10 > 0) {
            if (i10 == this.f2898s) {
                for (int i11 = 0; i11 < this.f2898s; i11++) {
                    this.f2899t[i11].e();
                    SavedState savedState2 = this.I;
                    int i12 = savedState2.f2912d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.f2917i ? this.f2900u.i() : this.f2900u.m();
                    }
                    this.f2899t[i11].v(i12);
                }
            } else {
                savedState.f();
                SavedState savedState3 = this.I;
                savedState3.f2910a = savedState3.b;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.f2918j;
        N2(savedState4.f2916h);
        J2();
        SavedState savedState5 = this.I;
        int i13 = savedState5.f2910a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f2921c = savedState5.f2917i;
        } else {
            bVar.f2921c = this.A;
        }
        if (savedState5.f2913e > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f2906a = savedState5.f2914f;
            lazySpanLookup.b = savedState5.f2915g;
        }
    }

    public void S2(RecyclerView.b0 b0Var, b bVar) {
        if (R2(b0Var, bVar) || Q2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f2920a = 0;
    }

    public boolean T1() {
        int l10 = this.f2899t[0].l(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        for (int i10 = 1; i10 < this.f2898s; i10++) {
            if (this.f2899t[i10].l(EditorInfoCompat.IME_FLAG_FORCE_ASCII) != l10) {
                return false;
            }
        }
        return true;
    }

    public final void T2(int i10, RecyclerView.b0 b0Var) {
        int i11;
        int i12;
        int c10;
        k kVar = this.f2904y;
        boolean z10 = false;
        kVar.b = 0;
        kVar.f3074c = i10;
        if (!C0() || (c10 = b0Var.c()) == -1) {
            i11 = 0;
            i12 = 0;
        } else {
            if (this.A == (c10 < i10)) {
                i11 = this.f2900u.n();
                i12 = 0;
            } else {
                i12 = this.f2900u.n();
                i11 = 0;
            }
        }
        if (R()) {
            this.f2904y.f3077f = this.f2900u.m() - i12;
            this.f2904y.f3078g = this.f2900u.i() + i11;
        } else {
            this.f2904y.f3078g = this.f2900u.h() + i11;
            this.f2904y.f3077f = -i12;
        }
        k kVar2 = this.f2904y;
        kVar2.f3079h = false;
        kVar2.f3073a = true;
        if (this.f2900u.k() == 0 && this.f2900u.h() == 0) {
            z10 = true;
        }
        kVar2.f3080i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull View view, @NonNull y2.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, pVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f2902w == 0) {
            pVar.o0(p.g.b(cVar.f(), cVar.f2927f ? this.f2898s : 1, -1, -1, false, false));
        } else {
            pVar.o0(p.g.b(-1, -1, cVar.f(), cVar.f2927f ? this.f2898s : 1, false, false));
        }
    }

    public boolean U1() {
        int p8 = this.f2899t[0].p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        for (int i10 = 1; i10 < this.f2898s; i10++) {
            if (this.f2899t[i10].p(EditorInfoCompat.IME_FLAG_FORCE_ASCII) != p8) {
                return false;
            }
        }
        return true;
    }

    public void U2(int i10) {
        this.f2903x = i10 / this.f2898s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f2901v.k());
    }

    public final void V1(View view, c cVar, k kVar) {
        if (kVar.f3076e == 1) {
            if (cVar.f2927f) {
                R1(view);
                return;
            } else {
                cVar.f2926e.a(view);
                return;
            }
        }
        if (cVar.f2927f) {
            E2(view);
        } else {
            cVar.f2926e.u(view);
        }
    }

    public final void V2(d dVar, int i10, int i11) {
        int j10 = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + j10 <= i11) {
                this.B.set(dVar.f2931e, false);
            }
        } else if (dVar.k() - j10 >= i11) {
            this.B.set(dVar.f2931e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 1);
    }

    public final int W1(int i10) {
        if (O() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < o2()) != this.A ? -1 : 1;
    }

    public final int W2(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.E.b();
        y1();
    }

    public boolean X1() {
        int o22;
        int p22;
        if (O() == 0 || this.F == 0 || !v0()) {
            return false;
        }
        if (this.A) {
            o22 = p2();
            p22 = o2();
        } else {
            o22 = o2();
            p22 = p2();
        }
        if (o22 == 0 && w2() != null) {
            this.E.b();
            z1();
            y1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i10 = this.A ? -1 : 1;
        int i11 = p22 + 1;
        LazySpanLookup.FullSpanItem e10 = this.E.e(o22, i11, i10, true);
        if (e10 == null) {
            this.M = false;
            this.E.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem e11 = this.E.e(o22, e10.f2907a, i10 * (-1), true);
        if (e11 == null) {
            this.E.d(e10.f2907a);
        } else {
            this.E.d(e11.f2907a + 1);
        }
        z1();
        y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        v2(i10, i11, 8);
    }

    public final boolean Y1(d dVar) {
        boolean z10;
        if (!this.A) {
            if (dVar.o() > this.f2900u.m()) {
                z10 = dVar.n(dVar.f2928a.get(0)).f2927f;
                return !z10;
            }
            return false;
        }
        if (dVar.k() < this.f2900u.i()) {
            z10 = dVar.n(dVar.f2928a.get(r0.size() - 1)).f2927f;
            return !z10;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        v2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF c(int i10) {
        int W1 = W1(i10);
        PointF pointF = new PointF();
        if (W1 == 0) {
            return null;
        }
        if (this.f2902w == 0) {
            pointF.x = W1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = W1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        B2(xVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        this.C = -1;
        this.D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.I = null;
        this.L.c();
    }

    public final LazySpanLookup.FullSpanItem d2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2908c = new int[this.f2898s];
        for (int i11 = 0; i11 < this.f2898s; i11++) {
            fullSpanItem.f2908c[i11] = i10 - this.f2899t[i11].l(i10);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem e2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2908c = new int[this.f2898s];
        for (int i11 = 0; i11 < this.f2898s; i11++) {
            fullSpanItem.f2908c[i11] = this.f2899t[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    public final void f2() {
        this.f2900u = n.b(this, this.f2902w);
        this.f2901v = n.b(this, 1 - this.f2902w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int g2(RecyclerView.x xVar, k kVar, RecyclerView.b0 b0Var) {
        d dVar;
        int t22;
        int e10;
        int m10;
        int e11;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r8 = 0;
        staggeredGridLayoutManager2.B.set(0, staggeredGridLayoutManager2.f2898s, true);
        int i10 = staggeredGridLayoutManager2.f2904y.f3080i ? kVar.f3076e == 1 ? Integer.MAX_VALUE : EditorInfoCompat.IME_FLAG_FORCE_ASCII : kVar.f3076e == 1 ? kVar.f3078g + kVar.b : kVar.f3077f - kVar.b;
        staggeredGridLayoutManager2.P2(kVar.f3076e, i10);
        int i11 = staggeredGridLayoutManager2.A ? staggeredGridLayoutManager2.f2900u.i() : staggeredGridLayoutManager2.f2900u.m();
        boolean z10 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (kVar.a(b0Var) && (staggeredGridLayoutManager3.f2904y.f3080i || !staggeredGridLayoutManager3.B.isEmpty())) {
            View b10 = kVar.b(xVar);
            c cVar = (c) b10.getLayoutParams();
            int b11 = cVar.b();
            int g10 = staggeredGridLayoutManager3.E.g(b11);
            boolean z11 = g10 == -1 ? true : r8;
            if (z11) {
                dVar = cVar.f2927f ? staggeredGridLayoutManager3.f2899t[r8] : staggeredGridLayoutManager3.u2(kVar);
                staggeredGridLayoutManager3.E.n(b11, dVar);
            } else {
                dVar = staggeredGridLayoutManager3.f2899t[g10];
            }
            d dVar2 = dVar;
            cVar.f2926e = dVar2;
            if (kVar.f3076e == 1) {
                staggeredGridLayoutManager3.i(b10);
            } else {
                staggeredGridLayoutManager3.j(b10, r8);
            }
            staggeredGridLayoutManager3.A2(b10, cVar, r8);
            if (kVar.f3076e == 1) {
                e10 = cVar.f2927f ? staggeredGridLayoutManager3.q2(i11) : dVar2.l(i11);
                t22 = staggeredGridLayoutManager3.f2900u.e(b10) + e10;
                if (z11 && cVar.f2927f) {
                    LazySpanLookup.FullSpanItem d22 = staggeredGridLayoutManager3.d2(e10);
                    d22.b = -1;
                    d22.f2907a = b11;
                    staggeredGridLayoutManager3.E.a(d22);
                }
            } else {
                t22 = cVar.f2927f ? staggeredGridLayoutManager3.t2(i11) : dVar2.p(i11);
                e10 = t22 - staggeredGridLayoutManager3.f2900u.e(b10);
                if (z11 && cVar.f2927f) {
                    LazySpanLookup.FullSpanItem e22 = staggeredGridLayoutManager3.e2(t22);
                    e22.b = 1;
                    e22.f2907a = b11;
                    staggeredGridLayoutManager3.E.a(e22);
                }
            }
            if (cVar.f2927f && kVar.f3075d == -1) {
                if (z11) {
                    staggeredGridLayoutManager3.M = true;
                } else {
                    if (!(kVar.f3076e == 1 ? staggeredGridLayoutManager3.T1() : staggeredGridLayoutManager3.U1())) {
                        LazySpanLookup.FullSpanItem f10 = staggeredGridLayoutManager3.E.f(b11);
                        if (f10 != null) {
                            f10.f2909d = true;
                        }
                        staggeredGridLayoutManager3.M = true;
                    }
                }
            }
            staggeredGridLayoutManager3.V1(b10, cVar, kVar);
            if (staggeredGridLayoutManager3.y2() && staggeredGridLayoutManager3.f2902w == 1) {
                e11 = cVar.f2927f ? staggeredGridLayoutManager3.f2901v.i() : staggeredGridLayoutManager3.f2901v.i() - (((staggeredGridLayoutManager3.f2898s - 1) - dVar2.f2931e) * staggeredGridLayoutManager3.f2903x);
                m10 = e11 - staggeredGridLayoutManager3.f2901v.e(b10);
            } else {
                m10 = cVar.f2927f ? staggeredGridLayoutManager3.f2901v.m() : (dVar2.f2931e * staggeredGridLayoutManager3.f2903x) + staggeredGridLayoutManager3.f2901v.m();
                e11 = staggeredGridLayoutManager3.f2901v.e(b10) + m10;
            }
            int i12 = e11;
            int i13 = m10;
            if (staggeredGridLayoutManager3.f2902w == 1) {
                staggeredGridLayoutManager3.E0(b10, i13, e10, i12, t22);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.E0(b10, e10, i13, t22, i12);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f2927f) {
                staggeredGridLayoutManager.P2(staggeredGridLayoutManager.f2904y.f3076e, i10);
            } else {
                staggeredGridLayoutManager.V2(dVar2, staggeredGridLayoutManager.f2904y.f3076e, i10);
            }
            staggeredGridLayoutManager.F2(xVar, staggeredGridLayoutManager.f2904y);
            if (staggeredGridLayoutManager.f2904y.f3079h && b10.hasFocusable()) {
                if (cVar.f2927f) {
                    staggeredGridLayoutManager.B.clear();
                } else {
                    staggeredGridLayoutManager.B.set(dVar2.f2931e, false);
                }
            }
            z10 = true;
            r8 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z10) {
            staggeredGridLayoutManager3.F2(xVar, staggeredGridLayoutManager3.f2904y);
        }
        int m11 = staggeredGridLayoutManager3.f2904y.f3076e == -1 ? staggeredGridLayoutManager3.f2900u.m() - staggeredGridLayoutManager3.t2(staggeredGridLayoutManager3.f2900u.m()) : staggeredGridLayoutManager3.q2(staggeredGridLayoutManager3.f2900u.i()) - staggeredGridLayoutManager3.f2900u.i();
        if (m11 > 0) {
            return Math.min(kVar.b, m11);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.f();
            }
            y1();
        }
    }

    public final int h2(int i10) {
        int O = O();
        for (int i11 = 0; i11 < O; i11++) {
            int l02 = l0(N(i11));
            if (l02 >= 0 && l02 < i10) {
                return l02;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable i1() {
        int p8;
        int m10;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.f2916h = this.f2905z;
        savedState.f2917i = this.G;
        savedState.f2918j = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f2906a) == null) {
            savedState.f2913e = 0;
        } else {
            savedState.f2914f = iArr;
            savedState.f2913e = iArr.length;
            savedState.f2915g = lazySpanLookup.b;
        }
        if (O() <= 0) {
            savedState.f2910a = -1;
            savedState.b = -1;
            savedState.f2911c = 0;
            return savedState;
        }
        savedState.f2910a = this.G ? p2() : o2();
        savedState.b = k2();
        int i10 = this.f2898s;
        savedState.f2911c = i10;
        savedState.f2912d = new int[i10];
        for (int i11 = 0; i11 < this.f2898s; i11++) {
            if (this.G) {
                p8 = this.f2899t[i11].l(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                if (p8 != Integer.MIN_VALUE) {
                    m10 = this.f2900u.i();
                    p8 -= m10;
                    savedState.f2912d[i11] = p8;
                } else {
                    savedState.f2912d[i11] = p8;
                }
            } else {
                p8 = this.f2899t[i11].p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                if (p8 != Integer.MIN_VALUE) {
                    m10 = this.f2900u.m();
                    p8 -= m10;
                    savedState.f2912d[i11] = p8;
                } else {
                    savedState.f2912d[i11] = p8;
                }
            }
        }
        return savedState;
    }

    public View i2(boolean z10) {
        int m10 = this.f2900u.m();
        int i10 = this.f2900u.i();
        View view = null;
        for (int O = O() - 1; O >= 0; O--) {
            View N = N(O);
            int g10 = this.f2900u.g(N);
            int d10 = this.f2900u.d(N);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return N;
                }
                if (view == null) {
                    view = N;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void j1(int i10) {
        if (i10 == 0) {
            X1();
        }
    }

    public View j2(boolean z10) {
        int m10 = this.f2900u.m();
        int i10 = this.f2900u.i();
        int O = O();
        View view = null;
        for (int i11 = 0; i11 < O; i11++) {
            View N = N(i11);
            int g10 = this.f2900u.g(N);
            if (this.f2900u.d(N) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return N;
                }
                if (view == null) {
                    view = N;
                }
            }
        }
        return view;
    }

    public int k2() {
        View i22 = this.A ? i2(true) : j2(true);
        if (i22 == null) {
            return -1;
        }
        return l0(i22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l(String str) {
        if (this.I == null) {
            super.l(str);
        }
    }

    public final int l2(int i10) {
        for (int O = O() - 1; O >= 0; O--) {
            int l02 = l0(N(O));
            if (l02 >= 0 && l02 < i10) {
                return l02;
            }
        }
        return 0;
    }

    public final void m2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10;
        int q22 = q2(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        if (q22 != Integer.MIN_VALUE && (i10 = this.f2900u.i() - q22) > 0) {
            int i11 = i10 - (-K2(-i10, xVar, b0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f2900u.r(i11);
        }
    }

    public final void n2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int m10;
        int t22 = t2(Integer.MAX_VALUE);
        if (t22 != Integer.MAX_VALUE && (m10 = t22 - this.f2900u.m()) > 0) {
            int K2 = m10 - K2(m10, xVar, b0Var);
            if (!z10 || K2 <= 0) {
                return;
            }
            this.f2900u.r(-K2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var) {
        if (this.f2902w == 0) {
            return Math.min(this.f2898s, b0Var.b());
        }
        return -1;
    }

    public int o2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f2902w == 0;
    }

    public int p2() {
        int O = O();
        if (O == 0) {
            return 0;
        }
        return l0(N(O - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f2902w == 1;
    }

    public final int q2(int i10) {
        int l10 = this.f2899t[0].l(i10);
        for (int i11 = 1; i11 < this.f2898s; i11++) {
            int l11 = this.f2899t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public final int r2(int i10) {
        int p8 = this.f2899t[0].p(i10);
        for (int i11 = 1; i11 < this.f2898s; i11++) {
            int p10 = this.f2899t[i11].p(i10);
            if (p10 > p8) {
                p8 = p10;
            }
        }
        return p8;
    }

    public final int s2(int i10) {
        int l10 = this.f2899t[0].l(i10);
        for (int i11 = 1; i11 < this.f2898s; i11++) {
            int l11 = this.f2899t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void t(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.q.c cVar) {
        int l10;
        int i12;
        if (this.f2902w != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        D2(i10, b0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f2898s) {
            this.O = new int[this.f2898s];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f2898s; i14++) {
            k kVar = this.f2904y;
            if (kVar.f3075d == -1) {
                l10 = kVar.f3077f;
                i12 = this.f2899t[i14].p(l10);
            } else {
                l10 = this.f2899t[i14].l(kVar.f3078g);
                i12 = this.f2904y.f3078g;
            }
            int i15 = l10 - i12;
            if (i15 >= 0) {
                this.O[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.O, 0, i13);
        for (int i16 = 0; i16 < i13 && this.f2904y.a(b0Var); i16++) {
            cVar.a(this.f2904y.f3074c, this.O[i16]);
            k kVar2 = this.f2904y;
            kVar2.f3074c += kVar2.f3075d;
        }
    }

    public final int t2(int i10) {
        int p8 = this.f2899t[0].p(i10);
        for (int i11 = 1; i11 < this.f2898s; i11++) {
            int p10 = this.f2899t[i11].p(i10);
            if (p10 < p8) {
                p8 = p10;
            }
        }
        return p8;
    }

    public final d u2(k kVar) {
        int i10;
        int i11;
        int i12;
        if (C2(kVar.f3076e)) {
            i11 = this.f2898s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f2898s;
            i11 = 0;
            i12 = 1;
        }
        d dVar = null;
        if (kVar.f3076e == 1) {
            int m10 = this.f2900u.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                d dVar2 = this.f2899t[i11];
                int l10 = dVar2.l(m10);
                if (l10 < i13) {
                    dVar = dVar2;
                    i13 = l10;
                }
                i11 += i12;
            }
            return dVar;
        }
        int i14 = this.f2900u.i();
        int i15 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        while (i11 != i10) {
            d dVar3 = this.f2899t[i11];
            int p8 = dVar3.p(i14);
            if (p8 > i15) {
                dVar = dVar3;
                i15 = p8;
            }
            i11 += i12;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.p2()
            goto Ld
        L9:
            int r0 = r6.o2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.A
            if (r7 == 0) goto L4e
            int r7 = r6.o2()
            goto L52
        L4e:
            int r7 = r6.p2()
        L52:
            if (r3 > r7) goto L57
            r6.y1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return this.F != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View w2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2898s
            r2.<init>(r3)
            int r3 = r12.f2898s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f2902w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.y2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2926e
            int r9 = r9.f2931e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2926e
            boolean r9 = r12.Y1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2926e
            int r9 = r9.f2931e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f2927f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.n r10 = r12.f2900u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.n r11 = r12.f2900u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.n r10 = r12.f2900u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.n r11 = r12.f2900u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f2926e
            int r8 = r8.f2931e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f2926e
            int r9 = r9.f2931e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.b0 b0Var) {
        return b2(b0Var);
    }

    public void x2() {
        this.E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    public boolean y2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public int[] f2906a;
        public List<FullSpanItem> b;

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.b.get(i10);
                if (fullSpanItem2.f2907a == fullSpanItem.f2907a) {
                    this.b.remove(i10);
                }
                if (fullSpanItem2.f2907a >= fullSpanItem.f2907a) {
                    this.b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.f2906a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f2906a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f2906a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f2906a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2906a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).f2907a >= i10) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.b.get(i13);
                int i14 = fullSpanItem.f2907a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.b == i12 || (z10 && fullSpanItem.f2909d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.f2907a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f2906a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f2906a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f2906a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f2906a.length;
            }
            int min = Math.min(i11 + 1, this.f2906a.length);
            Arrays.fill(this.f2906a, i10, min, -1);
            return min;
        }

        public final int i(int i10) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem f10 = f(i10);
            if (f10 != null) {
                this.b.remove(f10);
            }
            int size = this.b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.b.get(i11).f2907a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.b.get(i11);
            this.b.remove(i11);
            return fullSpanItem.f2907a;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f2906a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f2906a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f2906a, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f2906a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f2906a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f2906a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i12 = fullSpanItem.f2907a;
                if (i12 >= i10) {
                    fullSpanItem.f2907a = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i13 = fullSpanItem.f2907a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.f2907a = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, d dVar) {
            c(i10);
            this.f2906a[i10] = dVar.f2931e;
        }

        public int o(int i10) {
            int length = this.f2906a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public int f2907a;
            public int b;

            /* renamed from: c, reason: collision with root package name */
            public int[] f2908c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f2909d;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f2907a = parcel.readInt();
                this.b = parcel.readInt();
                this.f2909d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2908c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i10) {
                int[] iArr = this.f2908c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2907a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.f2909d + ", mGapPerSpan=" + Arrays.toString(this.f2908c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2907a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.f2909d ? 1 : 0);
                int[] iArr = this.f2908c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2908c);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
