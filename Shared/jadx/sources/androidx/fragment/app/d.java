package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.view.b0;

/* loaded from: classes.dex */
public class d {
    public static int a(c cVar, boolean z10, boolean z11) {
        return z11 ? z10 ? cVar.N() : cVar.O() : z10 ? cVar.x() : cVar.B();
    }

    @SuppressLint({"ResourceType"})
    public static a b(@NonNull Context context, @NonNull c cVar, boolean z10, boolean z11) {
        int I = cVar.I();
        int a10 = a(cVar, z10, z11);
        cVar.N1(0, 0, 0, 0);
        ViewGroup viewGroup = cVar.J;
        if (viewGroup != null && viewGroup.getTag(d4.b.f14379c) != null) {
            cVar.J.setTag(d4.b.f14379c, null);
        }
        ViewGroup viewGroup2 = cVar.J;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation G0 = cVar.G0(I, z10, a10);
        if (G0 != null) {
            return new a(G0);
        }
        Animator H0 = cVar.H0(I, z10, a10);
        if (H0 != null) {
            return new a(H0);
        }
        if (a10 == 0 && I != 0) {
            a10 = d(context, I, z10);
        }
        if (a10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a10);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a10);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e11) {
                if (equals) {
                    throw e11;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a10);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static int c(@NonNull Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(@NonNull Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? d4.a.f14376e : d4.a.f14377f;
        }
        if (i10 == 8194) {
            return z10 ? d4.a.f14373a : d4.a.b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? d4.a.f14374c : d4.a.f14375d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f2470a;
        public final AnimatorSet b;

        public a(Animation animation) {
            this.f2470a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f2470a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f2471a;
        public final View b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2472c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2473d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2474e;

        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f2474e = true;
            this.f2471a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation) {
            this.f2474e = true;
            if (this.f2472c) {
                return !this.f2473d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2472c = true;
                b0.a(this.f2471a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2472c || !this.f2474e) {
                this.f2471a.endViewTransition(this.b);
                this.f2473d = true;
            } else {
                this.f2474e = false;
                this.f2471a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation, float f10) {
            this.f2474e = true;
            if (this.f2472c) {
                return !this.f2473d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2472c = true;
                b0.a(this.f2471a, this);
            }
            return true;
        }
    }
}
