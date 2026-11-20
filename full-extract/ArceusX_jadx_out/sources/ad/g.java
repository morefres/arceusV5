package ad;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.MotionEventCompat;

/* loaded from: classes2.dex */
public class g extends androidx.appcompat.widget.b {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f364p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f365q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f366r;

    /* renamed from: s, reason: collision with root package name */
    public int f367s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f368t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f369u;

    public g(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f364p;
        if (drawable != null) {
            if (this.f369u) {
                this.f369u = false;
                Rect rect = this.f365q;
                Rect rect2 = this.f366r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f368t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f367s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f364p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f364p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f364p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f364p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f367s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f364p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f369u = z10 | this.f369u;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f369u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f364p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f364p);
            }
            this.f364p = drawable;
            this.f369u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f367s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f367s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f367s = i10;
            if (i10 == 119 && this.f364p != null) {
                this.f364p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f364p;
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f365q = new Rect();
        this.f366r = new Rect();
        this.f367s = 119;
        this.f368t = true;
        this.f369u = false;
        TypedArray i11 = o.i(context, attributeSet, ic.k.f20586b2, i10, 0, new int[0]);
        this.f367s = i11.getInt(ic.k.f20606d2, this.f367s);
        Drawable drawable = i11.getDrawable(ic.k.f20596c2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f368t = i11.getBoolean(ic.k.f20615e2, true);
        i11.recycle();
    }
}
