package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import o5.q;

/* loaded from: classes.dex */
public class c extends q {
    public static final String[] Q = {"android:clipBounds:clip"};
    public static final Rect R = new Rect();

    public static class a extends AnimatorListenerAdapter implements q.h {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f27609a;
        public final Rect b;

        /* renamed from: c, reason: collision with root package name */
        public final View f27610c;

        public a(View view, Rect rect, Rect rect2) {
            this.f27610c = view;
            this.f27609a = rect;
            this.b = rect2;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            this.f27610c.setClipBounds((Rect) this.f27610c.getTag(l.b));
            this.f27610c.setTag(l.b, null);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            Rect clipBounds = this.f27610c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = c.R;
            }
            this.f27610c.setTag(l.b, clipBounds);
            this.f27610c.setClipBounds(this.b);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                this.f27610c.setClipBounds(this.f27609a);
            } else {
                this.f27610c.setClipBounds(this.b);
            }
        }
    }

    public final void B0(d0 d0Var, boolean z10) {
        View view = d0Var.b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rect = z10 ? (Rect) view.getTag(l.b) : null;
        if (rect == null) {
            rect = view.getClipBounds();
        }
        Rect rect2 = rect != R ? rect : null;
        d0Var.f27618a.put("android:clipBounds:clip", rect2);
        if (rect2 == null) {
            d0Var.f27618a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // o5.q
    @NonNull
    public String[] V() {
        return Q;
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var, false);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        B0(d0Var, true);
    }

    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null || !d0Var.f27618a.containsKey("android:clipBounds:clip") || !d0Var2.f27618a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) d0Var.f27618a.get("android:clipBounds:clip");
        Rect rect2 = (Rect) d0Var2.f27618a.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) d0Var.f27618a.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) d0Var2.f27618a.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        d0Var2.b.setClipBounds(rect);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(d0Var2.b, (Property<View, V>) i0.f27650c, (TypeEvaluator) new m(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        a aVar = new a(d0Var2.b, rect, rect2);
        ofObject.addListener(aVar);
        c(aVar);
        return ofObject;
    }
}
