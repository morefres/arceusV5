package q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class y extends t {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f29470d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f29471e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f29472f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f29473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29474h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29475i;

    public y(SeekBar seekBar) {
        super(seekBar);
        this.f29472f = null;
        this.f29473g = null;
        this.f29474h = false;
        this.f29475i = false;
        this.f29470d = seekBar;
    }

    @Override // q.t
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        a1 v5 = a1.v(this.f29470d.getContext(), attributeSet, i.j.V, i10, 0);
        SeekBar seekBar = this.f29470d;
        androidx.core.view.o0.k0(seekBar, seekBar.getContext(), i.j.V, attributeSet, v5.r(), i10, 0);
        Drawable h10 = v5.h(i.j.W);
        if (h10 != null) {
            this.f29470d.setThumb(h10);
        }
        j(v5.g(i.j.X));
        if (v5.s(i.j.Z)) {
            this.f29473g = k0.e(v5.k(i.j.Z, -1), this.f29473g);
            this.f29475i = true;
        }
        if (v5.s(i.j.Y)) {
            this.f29472f = v5.c(i.j.Y);
            this.f29474h = true;
        }
        v5.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.f29471e;
        if (drawable != null) {
            if (this.f29474h || this.f29475i) {
                Drawable r8 = q2.a.r(drawable.mutate());
                this.f29471e = r8;
                if (this.f29474h) {
                    q2.a.o(r8, this.f29472f);
                }
                if (this.f29475i) {
                    q2.a.p(this.f29471e, this.f29473g);
                }
                if (this.f29471e.isStateful()) {
                    this.f29471e.setState(this.f29470d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f29471e != null) {
            int max = this.f29470d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f29471e.getIntrinsicWidth();
                int intrinsicHeight = this.f29471e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f29471e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f29470d.getWidth() - this.f29470d.getPaddingLeft()) - this.f29470d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f29470d.getPaddingLeft(), this.f29470d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f29471e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f29471e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f29470d.getDrawableState())) {
            this.f29470d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f29471e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f29471e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29471e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f29470d);
            q2.a.m(drawable, this.f29470d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f29470d.getDrawableState());
            }
            f();
        }
        this.f29470d.invalidate();
    }
}
