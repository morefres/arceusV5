package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class o extends s {

    /* renamed from: d, reason: collision with root package name */
    public n f3092d;

    /* renamed from: e, reason: collision with root package name */
    public n f3093e;

    public class a extends l {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView.a0
        public void o(@NonNull View view, @NonNull RecyclerView.b0 b0Var, @NonNull RecyclerView.a0.a aVar) {
            o oVar = o.this;
            int[] c10 = oVar.c(oVar.f3100a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w5 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w5 > 0) {
                aVar.d(i10, i11, w5, this.f3082j);
            }
        }

        @Override // androidx.recyclerview.widget.l
        public float v(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.l
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    @Override // androidx.recyclerview.widget.s
    public int[] c(@NonNull RecyclerView.q qVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (qVar.p()) {
            iArr[0] = k(view, m(qVar));
        } else {
            iArr[0] = 0;
        }
        if (qVar.q()) {
            iArr[1] = k(view, o(qVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.s
    public RecyclerView.a0 d(@NonNull RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.a0.b) {
            return new a(this.f3100a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.q qVar) {
        if (qVar.q()) {
            return l(qVar, o(qVar));
        }
        if (qVar.p()) {
            return l(qVar, m(qVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.q qVar, int i10, int i11) {
        n n10;
        int e10 = qVar.e();
        if (e10 == 0 || (n10 = n(qVar)) == null) {
            return -1;
        }
        int O = qVar.O();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < O; i14++) {
            View N = qVar.N(i14);
            if (N != null) {
                int k10 = k(N, n10);
                if (k10 <= 0 && k10 > i13) {
                    view2 = N;
                    i13 = k10;
                }
                if (k10 >= 0 && k10 < i12) {
                    view = N;
                    i12 = k10;
                }
            }
        }
        boolean p8 = p(qVar, i10, i11);
        if (p8 && view != null) {
            return qVar.l0(view);
        }
        if (!p8 && view2 != null) {
            return qVar.l0(view2);
        }
        if (p8) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int l02 = qVar.l0(view) + (q(qVar) == p8 ? -1 : 1);
        if (l02 < 0 || l02 >= e10) {
            return -1;
        }
        return l02;
    }

    public final int k(@NonNull View view, n nVar) {
        return (nVar.g(view) + (nVar.e(view) / 2)) - (nVar.m() + (nVar.n() / 2));
    }

    public final View l(RecyclerView.q qVar, n nVar) {
        int O = qVar.O();
        View view = null;
        if (O == 0) {
            return null;
        }
        int m10 = nVar.m() + (nVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < O; i11++) {
            View N = qVar.N(i11);
            int abs = Math.abs((nVar.g(N) + (nVar.e(N) / 2)) - m10);
            if (abs < i10) {
                view = N;
                i10 = abs;
            }
        }
        return view;
    }

    @NonNull
    public final n m(@NonNull RecyclerView.q qVar) {
        n nVar = this.f3093e;
        if (nVar == null || nVar.f3090a != qVar) {
            this.f3093e = n.a(qVar);
        }
        return this.f3093e;
    }

    public final n n(RecyclerView.q qVar) {
        if (qVar.q()) {
            return o(qVar);
        }
        if (qVar.p()) {
            return m(qVar);
        }
        return null;
    }

    @NonNull
    public final n o(@NonNull RecyclerView.q qVar) {
        n nVar = this.f3092d;
        if (nVar == null || nVar.f3090a != qVar) {
            this.f3092d = n.c(qVar);
        }
        return this.f3092d;
    }

    public final boolean p(RecyclerView.q qVar, int i10, int i11) {
        return qVar.p() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(RecyclerView.q qVar) {
        PointF c10;
        int e10 = qVar.e();
        if (!(qVar instanceof RecyclerView.a0.b) || (c10 = ((RecyclerView.a0.b) qVar).c(e10 - 1)) == null) {
            return false;
        }
        return c10.x < 0.0f || c10.y < 0.0f;
    }
}
