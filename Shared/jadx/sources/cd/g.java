package cd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.k;
import androidx.core.view.o0;
import e.BackEventCompat;

/* loaded from: classes2.dex */
public class g extends cd.a<View> {

    /* renamed from: g, reason: collision with root package name */
    public final float f4836g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4837h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4838i;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4839a;
        public final /* synthetic */ int b;

        public a(boolean z10, int i10) {
            this.f4839a = z10;
            this.b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.b.setTranslationX(0.0f);
            g.this.k(0.0f, this.f4839a, this.b);
        }
    }

    public g(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f4836g = resources.getDimension(ic.d.f20448k);
        this.f4837h = resources.getDimension(ic.d.f20446j);
        this.f4838i = resources.getDimension(ic.d.f20450l);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v5 = this.b;
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f4826e);
        animatorSet.start();
    }

    public final boolean g(int i10, int i11) {
        return (k.b(i10, o0.z(this.b)) & i11) == i11;
    }

    public void h(@NonNull BackEventCompat backEventCompat, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = backEventCompat.getSwipeEdge() == 0;
        boolean g10 = g(i10, 3);
        float width = (this.b.getWidth() * this.b.getScaleX()) + i(g10);
        V v5 = this.b;
        Property property = View.TRANSLATION_X;
        if (g10) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v5, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new g4.b());
        ofFloat.setDuration(jc.a.c(this.f4824c, this.f4825d, backEventCompat.getProgress()));
        ofFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public final int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void j(@NonNull BackEventCompat backEventCompat) {
        super.d(backEventCompat);
    }

    public void k(float f10, boolean z10, int i10) {
        float a10 = a(f10);
        boolean g10 = g(i10, 3);
        boolean z11 = z10 == g10;
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f4836g / f11;
            float f14 = this.f4837h / f11;
            float f15 = this.f4838i / f12;
            V v5 = this.b;
            if (g10) {
                f11 = 0.0f;
            }
            v5.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float a11 = jc.a.a(0.0f, f14, a10);
            float f16 = a11 + 1.0f;
            this.b.setScaleX(f16);
            float a12 = 1.0f - jc.a.a(0.0f, f15, a10);
            this.b.setScaleY(a12);
            V v10 = this.b;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(g10 ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - a11 : 1.0f;
                    float f18 = a12 != 0.0f ? (f16 / a12) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }

    public void l(@NonNull BackEventCompat backEventCompat, int i10) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        k(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i10);
    }
}
