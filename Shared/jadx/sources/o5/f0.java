package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import o5.q;

/* loaded from: classes.dex */
public class f0 {
    public static Animator a(@NonNull View view, @NonNull d0 d0Var, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, @NonNull q qVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) d0Var.b.getTag(l.f27659f)) != null) {
            f10 = (r2[0] - i10) + translationX;
            f11 = (r2[1] - i11) + translationY;
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f13));
        a aVar = new a(view, d0Var.b, translationX, translationY);
        qVar.c(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public static class a extends AnimatorListenerAdapter implements q.h {

        /* renamed from: a, reason: collision with root package name */
        public final View f27626a;
        public final View b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f27627c;

        /* renamed from: d, reason: collision with root package name */
        public float f27628d;

        /* renamed from: e, reason: collision with root package name */
        public float f27629e;

        /* renamed from: f, reason: collision with root package name */
        public final float f27630f;

        /* renamed from: g, reason: collision with root package name */
        public final float f27631g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f27632h;

        public a(View view, View view2, float f10, float f11) {
            this.b = view;
            this.f27626a = view2;
            this.f27630f = f10;
            this.f27631g = f11;
            int[] iArr = (int[]) view2.getTag(l.f27659f);
            this.f27627c = iArr;
            if (iArr != null) {
                view2.setTag(l.f27659f, null);
            }
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
            this.f27632h = true;
            this.b.setTranslationX(this.f27630f);
            this.b.setTranslationY(this.f27631g);
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            this.b.setTranslationX(this.f27628d);
            this.b.setTranslationY(this.f27629e);
        }

        public final void c() {
            if (this.f27627c == null) {
                this.f27627c = new int[2];
            }
            this.b.getLocationOnScreen(this.f27627c);
            this.f27626a.setTag(l.f27659f, this.f27627c);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            c();
            this.f27628d = this.b.getTranslationX();
            this.f27629e = this.b.getTranslationY();
            this.b.setTranslationX(this.f27630f);
            this.b.setTranslationY(this.f27631g);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            l(qVar, false);
        }

        @Override // o5.q.h
        public void l(@NonNull q qVar, boolean z10) {
            if (this.f27632h) {
                return;
            }
            this.f27626a.setTag(l.f27659f, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27632h = true;
            this.b.setTranslationX(this.f27630f);
            this.b.setTranslationY(this.f27631g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            this.b.setTranslationX(this.f27630f);
            this.b.setTranslationY(this.f27631g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
