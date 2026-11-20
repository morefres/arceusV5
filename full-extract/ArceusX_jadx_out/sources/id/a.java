package id;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f20808a;

    public a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f20808a = sideSheetBehavior;
    }

    @Override // id.d
    public int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // id.d
    public float b(int i10) {
        float e10 = e();
        return (i10 - e10) / (d() - e10);
    }

    @Override // id.d
    public int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // id.d
    public int d() {
        return Math.max(0, this.f20808a.m0() + this.f20808a.k0());
    }

    @Override // id.d
    public int e() {
        return (-this.f20808a.d0()) - this.f20808a.k0();
    }

    @Override // id.d
    public int f() {
        return this.f20808a.k0();
    }

    @Override // id.d
    public int g() {
        return -this.f20808a.d0();
    }

    @Override // id.d
    public <V extends View> int h(@NonNull V v5) {
        return v5.getRight() + this.f20808a.k0();
    }

    @Override // id.d
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // id.d
    public int j() {
        return 1;
    }

    @Override // id.d
    public boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // id.d
    public boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // id.d
    public boolean m(float f10, float f11) {
        return e.a(f10, f11) && Math.abs(f10) > ((float) this.f20808a.o0());
    }

    @Override // id.d
    public boolean n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f20808a.i0())) > this.f20808a.j0();
    }

    @Override // id.d
    public void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // id.d
    public void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f20808a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
