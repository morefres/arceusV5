package kc;

import android.view.View;
import androidx.core.view.o0;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f22498a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f22499c;

    /* renamed from: d, reason: collision with root package name */
    public int f22500d;

    /* renamed from: e, reason: collision with root package name */
    public int f22501e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22502f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22503g = true;

    public d(View view) {
        this.f22498a = view;
    }

    public void a() {
        View view = this.f22498a;
        o0.X(view, this.f22500d - (view.getTop() - this.b));
        View view2 = this.f22498a;
        o0.W(view2, this.f22501e - (view2.getLeft() - this.f22499c));
    }

    public int b() {
        return this.f22500d;
    }

    public void c() {
        this.b = this.f22498a.getTop();
        this.f22499c = this.f22498a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f22503g || this.f22501e == i10) {
            return false;
        }
        this.f22501e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f22502f || this.f22500d == i10) {
            return false;
        }
        this.f22500d = i10;
        a();
        return true;
    }
}
