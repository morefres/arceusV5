package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import backtraceio.library.services.BacktraceMetrics;

/* loaded from: classes.dex */
public class l extends RecyclerView.a0 {

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public PointF f3083k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3084l;

    /* renamed from: n, reason: collision with root package name */
    public float f3086n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f3081i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f3082j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f3085m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f3087o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3088p = 0;

    @SuppressLint({"UnknownNullness"})
    public l(Context context) {
        this.f3084l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f3085m) {
            this.f3086n = v(this.f3084l);
            this.f3085m = true;
        }
        return this.f3086n;
    }

    public int B() {
        PointF pointF = this.f3083k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @SuppressLint({"UnknownNullness"})
    public void C(RecyclerView.a0.a aVar) {
        PointF a10 = a(f());
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a10);
        this.f3083k = a10;
        this.f3087o = (int) (a10.x * 10000.0f);
        this.f3088p = (int) (a10.y * 10000.0f);
        aVar.d((int) (this.f3087o * 1.2f), (int) (this.f3088p * 1.2f), (int) (x(BacktraceMetrics.defaultTimeBetweenRetriesMs) * 1.2f), this.f3081i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    public void l(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f3087o = y(this.f3087o, i10);
        int y10 = y(this.f3088p, i11);
        this.f3088p = y10;
        if (this.f3087o == 0 && y10 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void n() {
        this.f3088p = 0;
        this.f3087o = 0;
        this.f3083k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int t8 = t(view, z());
        int u8 = u(view, B());
        int w5 = w((int) Math.sqrt((t8 * t8) + (u8 * u8)));
        if (w5 > 0) {
            aVar.d(-t8, -u8, w5, this.f3082j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i10) {
        RecyclerView.q e10 = e();
        if (e10 == null || !e10.p()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(e10.V(view) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, e10.Y(view) + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, e10.i0(), e10.s0() - e10.j0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i10) {
        RecyclerView.q e10 = e();
        if (e10 == null || !e10.q()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(e10.Z(view) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, e10.T(view) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin, e10.k0(), e10.b0() - e10.h0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    public final int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    public int z() {
        PointF pointF = this.f3083k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }
}
