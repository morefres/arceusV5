package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class k {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f3074c;

    /* renamed from: d, reason: collision with root package name */
    public int f3075d;

    /* renamed from: e, reason: collision with root package name */
    public int f3076e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3079h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3080i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3073a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f3077f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f3078g = 0;

    public boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f3074c;
        return i10 >= 0 && i10 < b0Var.b();
    }

    public View b(RecyclerView.x xVar) {
        View o8 = xVar.o(this.f3074c);
        this.f3074c += this.f3075d;
        return o8;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.f3074c + ", mItemDirection=" + this.f3075d + ", mLayoutDirection=" + this.f3076e + ", mStartLine=" + this.f3077f + ", mEndLine=" + this.f3078g + '}';
    }
}
