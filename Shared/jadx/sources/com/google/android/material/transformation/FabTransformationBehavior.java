package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.o0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ic.f;
import java.util.ArrayList;
import java.util.List;
import jc.h;
import jc.i;
import jc.j;
import sc.d;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8406c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f8407d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f8408e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8409f;

    /* renamed from: g, reason: collision with root package name */
    public float f8410g;

    /* renamed from: h, reason: collision with root package name */
    public float f8411h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8412a;
        public final /* synthetic */ View b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f8413c;

        public a(boolean z10, View view, View view2) {
            this.f8412a = z10;
            this.b = view;
            this.f8413c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8412a) {
                return;
            }
            this.b.setVisibility(4);
            this.f8413c.setAlpha(1.0f);
            this.f8413c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f8412a) {
                this.b.setVisibility(0);
                this.f8413c.setAlpha(0.0f);
                this.f8413c.setVisibility(4);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8415a;

        public b(View view) {
            this.f8415a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8415a.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sc.d f8416a;
        public final /* synthetic */ Drawable b;

        public c(sc.d dVar, Drawable drawable) {
            this.f8416a = dVar;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8416a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f8416a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sc.d f8418a;

        public d(sc.d dVar) {
            this.f8418a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f8418a.getRevealInfo();
            revealInfo.f31040c = Float.MAX_VALUE;
            this.f8418a.setRevealInfo(revealInfo);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public h f8419a;
        public j b;
    }

    public FabTransformationBehavior() {
        this.f8406c = new Rect();
        this.f8407d = new RectF();
        this.f8408e = new RectF();
        this.f8409f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet N(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        e i02 = i0(view2.getContext(), z10);
        if (z10) {
            this.f8410g = view.getTranslationX();
            this.f8411h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z10, z11, i02, arrayList, arrayList2);
        RectF rectF = this.f8407d;
        g0(view, view2, z10, z11, i02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        a0(view, view2, z10, i02, arrayList);
        d0(view, view2, z10, z11, i02, arrayList, arrayList2);
        c0(view, view2, z10, z11, i02, width, height, arrayList, arrayList2);
        Z(view, view2, z10, z11, i02, arrayList, arrayList2);
        Y(view, view2, z10, z11, i02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        jc.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    public final ViewGroup O(@NonNull View view) {
        View findViewById = view.findViewById(f.E);
        return findViewById != null ? j0(findViewById) : ((view instanceof nd.b) || (view instanceof nd.a)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    public final void P(@NonNull View view, @NonNull e eVar, @NonNull i iVar, @NonNull i iVar2, float f10, float f11, float f12, float f13, @NonNull RectF rectF) {
        float W = W(eVar, iVar, f10, f12);
        float W2 = W(eVar, iVar2, f11, f13);
        Rect rect = this.f8406c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f8407d;
        rectF2.set(rect);
        RectF rectF3 = this.f8408e;
        X(view, rectF3);
        rectF3.offset(W, W2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void Q(@NonNull View view, @NonNull RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f8410g, this.f8411h);
    }

    @NonNull
    public final Pair<i, i> R(float f10, float f11, boolean z10, @NonNull e eVar) {
        i e10;
        i e11;
        if (f10 == 0.0f || f11 == 0.0f) {
            e10 = eVar.f8419a.e("translationXLinear");
            e11 = eVar.f8419a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            e10 = eVar.f8419a.e("translationXCurveDownwards");
            e11 = eVar.f8419a.e("translationYCurveDownwards");
        } else {
            e10 = eVar.f8419a.e("translationXCurveUpwards");
            e11 = eVar.f8419a.e("translationYCurveUpwards");
        }
        return new Pair<>(e10, e11);
    }

    public final float S(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        RectF rectF = this.f8407d;
        RectF rectF2 = this.f8408e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float T(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        RectF rectF = this.f8407d;
        RectF rectF2 = this.f8408e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    public final float U(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        float centerX;
        float centerX2;
        float f10;
        RectF rectF = this.f8407d;
        RectF rectF2 = this.f8408e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f21674a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + jVar.b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f10 = centerX - centerX2;
        return f10 + jVar.b;
    }

    public final float V(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        float centerY;
        float centerY2;
        float f10;
        RectF rectF = this.f8407d;
        RectF rectF2 = this.f8408e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f21674a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + jVar.f21675c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f10 = centerY - centerY2;
        return f10 + jVar.f21675c;
    }

    public final float W(@NonNull e eVar, @NonNull i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        i e10 = eVar.f8419a.e("expansion");
        return jc.a.a(f10, f11, iVar.e().getInterpolation((((e10.c() + e10.d()) + 17) - c10) / d10));
    }

    public final void X(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f8409f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void Y(View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup O;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof sc.d) && sc.c.f31035a == 0) || (O = O(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    jc.d.f21664a.set(O, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(O, jc.d.f21664a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(O, jc.d.f21664a, 0.0f);
            }
            eVar.f8419a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof sc.d) {
            sc.d dVar = (sc.d) view2;
            int h02 = h0(view);
            int i10 = 16777215 & h02;
            if (z10) {
                if (!z11) {
                    dVar.setCircularRevealScrimColor(h02);
                }
                ofInt = ObjectAnimator.ofInt(dVar, d.C0550d.f31038a, i10);
            } else {
                ofInt = ObjectAnimator.ofInt(dVar, d.C0550d.f31038a, h02);
            }
            ofInt.setEvaluator(jc.c.b());
            eVar.f8419a.e("color").a(ofInt);
            list.add(ofInt);
        }
    }

    public final void a0(@NonNull View view, @NonNull View view2, boolean z10, @NonNull e eVar, @NonNull List<Animator> list) {
        float U = U(view, view2, eVar.b);
        float V = V(view, view2, eVar.b);
        Pair<i, i> R = R(U, V, z10, eVar);
        i iVar = (i) R.first;
        i iVar2 = (i) R.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            U = this.f8410g;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, U);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            V = this.f8411h;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, V);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public final void b0(View view, @NonNull View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float u8 = o0.u(view2) - o0.u(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-u8);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -u8);
        }
        eVar.f8419a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull e eVar, float f10, float f11, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof sc.d) {
            sc.d dVar = (sc.d) view2;
            float S = S(view, view2, eVar.b);
            float T = T(view, view2, eVar.b);
            ((FloatingActionButton) view).i(this.f8406c);
            float width = this.f8406c.width() / 2.0f;
            i e10 = eVar.f8419a.e("expansion");
            if (z10) {
                if (!z11) {
                    dVar.setRevealInfo(new d.e(S, T, width));
                }
                if (z11) {
                    width = dVar.getRevealInfo().f31040c;
                }
                animator = sc.a.a(dVar, S, T, bd.a.b(S, T, 0.0f, 0.0f, f10, f11));
                animator.addListener(new d(dVar));
                f0(view2, e10.c(), (int) S, (int) T, width, list);
            } else {
                float f12 = dVar.getRevealInfo().f31040c;
                Animator a10 = sc.a.a(dVar, S, T, width);
                int i10 = (int) S;
                int i11 = (int) T;
                f0(view2, e10.c(), i10, i11, f12, list);
                e0(view2, e10.c(), e10.d(), eVar.f8419a.f(), i10, i11, width, list);
                animator = a10;
            }
            e10.a(animator);
            list.add(animator);
            list2.add(sc.a.b(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof sc.d) && (view instanceof ImageView)) {
            sc.d dVar = (sc.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, jc.e.b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, jc.e.b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.f8419a.e("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(dVar, drawable));
        }
    }

    public final void e0(View view, long j10, long j11, long j12, int i10, int i11, float f10, @NonNull List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(j13);
            createCircularReveal.setDuration(j12 - j13);
            list.add(createCircularReveal);
        }
    }

    public final void f0(View view, long j10, int i10, int i11, float f10, @NonNull List<Animator> list) {
        if (j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    public final void g0(@NonNull View view, @NonNull View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        i iVar;
        i iVar2;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float U = U(view, view2, eVar.b);
        float V = V(view, view2, eVar.b);
        Pair<i, i> R = R(U, V, z10, eVar);
        i iVar3 = (i) R.first;
        i iVar4 = (i) R.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-U);
                view2.setTranslationY(-V);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            iVar = iVar4;
            iVar2 = iVar3;
            P(view2, eVar, iVar2, iVar, -U, -V, 0.0f, 0.0f, rectF);
        } else {
            iVar = iVar4;
            iVar2 = iVar3;
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -U);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -V);
        }
        iVar2.a(ofFloat);
        iVar.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final int h0(@NonNull View view) {
        ColorStateList r8 = o0.r(view);
        if (r8 != null) {
            return r8.getColorForState(view.getDrawableState(), r8.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    public abstract e i0(Context context, boolean z10);

    public final ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        if (fVar.f1579h == 0) {
            fVar.f1579h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8406c = new Rect();
        this.f8407d = new RectF();
        this.f8408e = new RectF();
        this.f8409f = new int[2];
    }
}
