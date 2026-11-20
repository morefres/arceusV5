package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.b0;
import androidx.core.view.o0;
import androidx.core.view.t0;
import androidx.fragment.app.b;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import e.BackEventCompat;
import e4.h0;
import e4.j0;
import gt.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zl.t;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\b%&'\f()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ9\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001e\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\u000b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$¨\u0006,"}, d2 = {"Landroidx/fragment/app/b;", "Landroidx/fragment/app/i;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/i$d;", "operations", "", "isPop", "", rl.d.f30696a, "(Ljava/util/List;Z)V", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/b$b;", "animationInfos", "F", "Landroidx/fragment/app/b$h;", "transitionInfos", "firstOut", "lastIn", "H", "(Ljava/util/List;ZLandroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;)V", "Lw1/a;", "", "Landroid/view/View;", "", "names", "J", "(Lw1/a;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", ve.a.f33391e, j6.b.f21518e, "c", "e", "f", "g", "h", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends androidx.fragment.app.i {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/b$a;", "Landroidx/fragment/app/i$b;", "Landroidx/fragment/app/b$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/b$b;)V", "Landroid/view/ViewGroup;", "container", "", rl.d.f30696a, "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/b$b;", "h", "()Landroidx/fragment/app/b$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends i.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final C0036b animationInfo;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/b$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.b$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0035a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i.d f2363a;
            public final /* synthetic */ ViewGroup b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f2364c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f2365d;

            public AnimationAnimationListenerC0035a(i.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f2363a = dVar;
                this.b = viewGroup;
                this.f2364c = view;
                this.f2365d = aVar;
            }

            public static final void b(ViewGroup container, View view, a this$0) {
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition(view);
                this$0.getAnimationInfo().getOperation().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                final ViewGroup viewGroup = this.b;
                final View view = this.f2364c;
                final a aVar = this.f2365d;
                viewGroup.post(new Runnable() { // from class: e4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a.AnimationAnimationListenerC0035a.b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f2363a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f2363a + " has reached onAnimationStart.");
                }
            }
        }

        public a(@NotNull C0036b animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @Override // androidx.fragment.app.i.b
        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            i.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().K;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().e(this);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.i.b
        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animationInfo.b()) {
                this.animationInfo.getOperation().e(this);
                return;
            }
            Context context = container.getContext();
            i.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().K;
            C0036b c0036b = this.animationInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            d.a c10 = c0036b.c(context);
            if (c10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = c10.f2470a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != i.d.b.REMOVED) {
                view.startAnimation(animation);
                this.animationInfo.getOperation().e(this);
                return;
            }
            container.startViewTransition(view);
            d.b bVar = new d.b(animation, container, view);
            bVar.setAnimationListener(new AnimationAnimationListenerC0035a(operation, container, view, this));
            view.startAnimation(bVar);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }

        @NotNull
        /* renamed from: h, reason: from getter */
        public final C0036b getAnimationInfo() {
            return this.animationInfo;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/b$b;", "Landroidx/fragment/app/b$f;", "Landroidx/fragment/app/i$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/i$d;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/d$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/d$a;", j6.b.f21518e, "Z", "isAnimLoaded", rl.d.f30696a, "Landroidx/fragment/app/d$a;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public static final class C0036b extends f {

        /* renamed from: b, reason: from kotlin metadata */
        public final boolean isPop;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean isAnimLoaded;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public d.a animation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0036b(@NotNull i.d operation, boolean z10) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.isPop = z10;
        }

        @Nullable
        public final d.a c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            d.a b = androidx.fragment.app.d.b(context, getOperation().getFragment(), getOperation().getFinalState() == i.d.b.VISIBLE, this.isPop);
            this.animation = b;
            this.isAnimLoaded = true;
            return b;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/b$c;", "Landroidx/fragment/app/i$b;", "Landroidx/fragment/app/b$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/b$b;)V", "Landroid/view/ViewGroup;", "container", "", "f", "(Landroid/view/ViewGroup;)V", "Le/b;", "backEvent", "e", "(Le/b;Landroid/view/ViewGroup;)V", rl.d.f30696a, "c", "Landroidx/fragment/app/b$b;", "h", "()Landroidx/fragment/app/b$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", j6.b.f21518e, "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends i.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final C0036b animatorInfo;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public AnimatorSet animator;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/b$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f2370a;
            public final /* synthetic */ View b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f2371c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i.d f2372d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f2373e;

            public a(ViewGroup viewGroup, View view, boolean z10, i.d dVar, c cVar) {
                this.f2370a = viewGroup;
                this.b = view;
                this.f2371c = z10;
                this.f2372d = dVar;
                this.f2373e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                this.f2370a.endViewTransition(this.b);
                if (this.f2371c || this.f2372d.getFinalState() == i.d.b.GONE) {
                    i.d.b finalState = this.f2372d.getFinalState();
                    View viewToAnimate = this.b;
                    Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                    finalState.b(viewToAnimate, this.f2370a);
                }
                this.f2373e.getAnimatorInfo().getOperation().e(this.f2373e);
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f2372d + " has ended.");
                }
            }
        }

        public c(@NotNull C0036b animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Override // androidx.fragment.app.i.b
        /* renamed from: b */
        public boolean getIsSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.i.b
        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            i.d operation = this.animatorInfo.getOperation();
            if (operation.getIsSeeking()) {
                e.f2375a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.N0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.getIsSeeking() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.i.b
        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            i.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.i.b
        public void e(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            i.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().f2423n) {
                return;
            }
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long a10 = d.f2374a.a(animatorSet);
            long progress = (long) (backEvent.getProgress() * a10);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == a10) {
                progress = a10 - 1;
            }
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            e.f2375a.b(animatorSet, progress);
        }

        @Override // androidx.fragment.app.i.b
        public void f(@NotNull ViewGroup container) {
            c cVar;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animatorInfo.b()) {
                return;
            }
            Context context = container.getContext();
            C0036b c0036b = this.animatorInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            d.a c10 = c0036b.c(context);
            this.animator = c10 != null ? c10.b : null;
            i.d operation = this.animatorInfo.getOperation();
            androidx.fragment.app.c fragment = operation.getFragment();
            boolean z10 = operation.getFinalState() == i.d.b.GONE;
            View view = fragment.K;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z10, operation, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        @NotNull
        /* renamed from: h, reason: from getter */
        public final C0036b getAnimatorInfo() {
            return this.animatorInfo;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/b$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", ve.a.f33391e, "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f2374a = new d();

        public final long a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/b$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", ve.a.f33391e, "(Landroid/animation/AnimatorSet;)V", "", "time", j6.b.f21518e, "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f2375a = new e();

        public final void a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(@NotNull AnimatorSet animatorSet, long time) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/b$f;", "", "Landroidx/fragment/app/i$d;", "operation", "<init>", "(Landroidx/fragment/app/i$d;)V", ve.a.f33391e, "Landroidx/fragment/app/i$d;", "()Landroidx/fragment/app/i$d;", "", j6.b.f21518e, "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final i.d operation;

        public f(@NotNull i.d operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final i.d getOperation() {
            return this.operation;
        }

        public final boolean b() {
            View view = this.operation.getFragment().K;
            i.d.b a10 = view != null ? i.d.b.INSTANCE.a(view) : null;
            i.d.b finalState = this.operation.getFinalState();
            if (a10 == finalState) {
                return true;
            }
            i.d.b bVar = i.d.b.VISIBLE;
            return (a10 == bVar || finalState == bVar) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\bb\u0010T\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010TR\u0011\u0010i\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bh\u0010T¨\u0006j"}, d2 = {"Landroidx/fragment/app/b$g;", "Landroidx/fragment/app/i$b;", "", "Landroidx/fragment/app/b$h;", "transitionInfos", "Landroidx/fragment/app/i$d;", "firstOut", "lastIn", "Le4/j0;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Lw1/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;Le4/j0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw1/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw1/a;Lw1/a;Z)V", "Landroid/view/ViewGroup;", "container", "Lkotlin/Pair;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "Le/b;", "backEvent", "e", "(Le/b;Landroid/view/ViewGroup;)V", rl.d.f30696a, "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/i$d;", t.f38095d, "()Landroidx/fragment/app/i$d;", "u", "g", "Le4/j0;", "v", "()Le4/j0;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "i", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "Lw1/a;", "getSharedElementNameMapping", "()Lw1/a;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "Lu2/e;", "q", "Lu2/e;", "getTransitionSignal", "()Lu2/e;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "getNoControllerReturned", "D", "(Z)V", "noControllerReturned", j6.b.f21518e, "isSeekingSupported", "x", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends i.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<h> transitionInfos;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final i.d firstOut;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final i.d lastIn;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j0 transitionImpl;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object sharedElementTransition;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<View> sharedElementFirstOutViews;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<View> sharedElementLastInViews;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final w1.a<String, String> sharedElementNameMapping;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<String> enteringNames;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<String> exitingNames;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final w1.a<String, View> firstOutViews;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final w1.a<String, View> lastInViews;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final boolean isPop;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final u2.e transitionSignal;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object controller;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        public boolean noControllerReturned;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", j6.b.f21518e, "()V"}, k = 3, mv = {1, 8, 0})
        public static final class a extends m implements Function0<Unit> {

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f2394j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Object f2395k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f2394j = viewGroup;
                this.f2395k = obj;
            }

            public final void b() {
                g.this.getTransitionImpl().e(this.f2394j, this.f2395k);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                b();
                return Unit.f22894a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", j6.b.f21518e, "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.fragment.app.b$g$b, reason: collision with other inner class name */
        public static final class C0037b extends m implements Function0<Unit> {

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f2397j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Object f2398k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ c0<Function0<Unit>> f2399l;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", rl.d.f30696a, "()V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.fragment.app.b$g$b$a */
            public static final class a extends m implements Function0<Unit> {

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ g f2400i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Object f2401j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ ViewGroup f2402k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f2400i = gVar;
                    this.f2401j = obj;
                    this.f2402k = viewGroup;
                }

                public static final void f(g this$0, ViewGroup container) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(container, "$container");
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        i.d operation = ((h) it.next()).getOperation();
                        View j02 = operation.getFragment().j0();
                        if (j02 != null) {
                            operation.getFinalState().b(j02, container);
                        }
                    }
                }

                public static final void g(g this$0) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).getOperation().e(this$0);
                    }
                }

                public final void d() {
                    List<h> w5 = this.f2400i.w();
                    if (!(w5 instanceof Collection) || !w5.isEmpty()) {
                        Iterator<T> it = w5.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).getOperation().getIsSeeking()) {
                                if (FragmentManager.N0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                u2.e eVar = new u2.e();
                                j0 transitionImpl = this.f2400i.getTransitionImpl();
                                androidx.fragment.app.c fragment = this.f2400i.w().get(0).getOperation().getFragment();
                                Object obj = this.f2401j;
                                final g gVar = this.f2400i;
                                transitionImpl.w(fragment, obj, eVar, new Runnable() { // from class: e4.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        b.g.C0037b.a.g(b.g.this);
                                    }
                                });
                                eVar.a();
                                return;
                            }
                        }
                    }
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    j0 transitionImpl2 = this.f2400i.getTransitionImpl();
                    Object controller = this.f2400i.getController();
                    Intrinsics.checkNotNull(controller);
                    final g gVar2 = this.f2400i;
                    final ViewGroup viewGroup = this.f2402k;
                    transitionImpl2.d(controller, new Runnable() { // from class: e4.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.C0037b.a.f(b.g.this, viewGroup);
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    d();
                    return Unit.f22894a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0037b(ViewGroup viewGroup, Object obj, c0<Function0<Unit>> c0Var) {
                super(0);
                this.f2397j = viewGroup;
                this.f2398k = obj;
                this.f2399l = c0Var;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.b$g$b$a] */
            public final void b() {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                gVar.C(gVar.getTransitionImpl().j(this.f2397j, this.f2398k));
                if (g.this.getController() == null) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    g.this.D(true);
                    return;
                }
                this.f2399l.f22963a = new a(g.this, this.f2398k, this.f2397j);
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.getFirstOut() + " to " + g.this.getLastIn());
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                b();
                return Unit.f22894a;
            }
        }

        public g(@NotNull List<h> transitionInfos, @Nullable i.d dVar, @Nullable i.d dVar2, @NotNull j0 transitionImpl, @Nullable Object obj, @NotNull ArrayList<View> sharedElementFirstOutViews, @NotNull ArrayList<View> sharedElementLastInViews, @NotNull w1.a<String, String> sharedElementNameMapping, @NotNull ArrayList<String> enteringNames, @NotNull ArrayList<String> exitingNames, @NotNull w1.a<String, View> firstOutViews, @NotNull w1.a<String, View> lastInViews, boolean z10) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = dVar;
            this.lastIn = dVar2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z10;
            this.transitionSignal = new u2.e();
        }

        public static final void A(i.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        public static final void p(i.d dVar, i.d dVar2, g this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            h0.a(dVar.getFragment(), dVar2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        public static final void q(j0 impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        public static final void r(ArrayList transitioningViews) {
            Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
            h0.e(transitioningViews, 4);
        }

        public static final void y(i.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        public static final void z(c0 seekCancelLambda) {
            Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.f22963a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void B(ArrayList<View> enteringViews, ViewGroup container, Function0<Unit> executeTransition) {
            h0.e(enteringViews, 4);
            ArrayList<String> q10 = this.transitionImpl.q(this.sharedElementLastInViews);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                ArrayList<View> arrayList = this.sharedElementFirstOutViews;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    View sharedElementFirstOutViews = arrayList.get(i10);
                    i10++;
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + o0.H(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                ArrayList<View> arrayList2 = this.sharedElementLastInViews;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    View sharedElementLastInViews = arrayList2.get(i11);
                    i11++;
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + o0.H(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.y(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, q10, this.sharedElementNameMapping);
            h0.e(enteringViews, 0);
            this.transitionImpl.A(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        public final void C(@Nullable Object obj) {
            this.controller = obj;
        }

        public final void D(boolean z10) {
            this.noControllerReturned = z10;
        }

        @Override // androidx.fragment.app.i.b
        /* renamed from: b */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.m()) {
                return false;
            }
            List<h> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.getTransition() == null || !this.transitionImpl.n(hVar.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.n(obj);
        }

        @Override // androidx.fragment.app.i.b
        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.transitionSignal.a();
        }

        @Override // androidx.fragment.app.i.b
        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            int i10 = 0;
            if (!container.isLaidOut() || this.noControllerReturned) {
                for (h hVar : this.transitionInfos) {
                    i.d operation = hVar.getOperation();
                    if (FragmentManager.N0(2)) {
                        if (this.noControllerReturned) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                        }
                    }
                    hVar.getOperation().e(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                j0 j0Var = this.transitionImpl;
                Intrinsics.checkNotNull(obj);
                j0Var.c(obj);
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> o8 = o(container, this.lastIn, this.firstOut);
            ArrayList<View> a10 = o8.a();
            Object b = o8.b();
            List<h> list = this.transitionInfos;
            ArrayList arrayList = new ArrayList(q.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).getOperation());
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                final i.d dVar = (i.d) obj2;
                this.transitionImpl.w(dVar.getFragment(), b, this.transitionSignal, new Runnable() { // from class: e4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.g.y(i.d.this, this);
                    }
                });
            }
            B(a10, container, new a(container, b));
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.i.b
        public void e(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.t(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.i.b
        public void f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    i.d operation = ((h) it.next()).getOperation();
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (x() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && x()) {
                final c0 c0Var = new c0();
                Pair<ArrayList<View>, Object> o8 = o(container, this.lastIn, this.firstOut);
                ArrayList<View> a10 = o8.a();
                Object b = o8.b();
                List<h> list = this.transitionInfos;
                ArrayList arrayList = new ArrayList(q.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).getOperation());
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    final i.d dVar = (i.d) arrayList.get(i10);
                    this.transitionImpl.x(dVar.getFragment(), b, this.transitionSignal, new Runnable() { // from class: e4.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.z(kotlin.jvm.internal.c0.this);
                        }
                    }, new Runnable() { // from class: e4.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.A(i.d.this, this);
                        }
                    });
                }
                B(a10, container, new C0037b(container, b, c0Var));
            }
        }

        public final void n(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (t0.c(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    n(transitioningViews, child);
                }
            }
        }

        public final Pair<ArrayList<View>, Object> o(ViewGroup container, i.d lastIn, i.d firstOut) {
            final i.d dVar = lastIn;
            final i.d dVar2 = firstOut;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.transitionInfos.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && dVar2 != null && dVar != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    h0.a(dVar.getFragment(), dVar2.getFragment(), this.isPop, this.firstOutViews, true);
                    b0.a(container, new Runnable() { // from class: e4.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.p(i.d.this, dVar2, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.v(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final j0 j0Var = this.transitionImpl;
                            b0.a(container, new Runnable() { // from class: e4.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.g.q(j0.this, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.transitionImpl.z(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    j0 j0Var2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    j0Var2.s(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.transitionInfos.iterator();
            Object obj2 = null;
            Object obj3 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                i.d operation = next.getOperation();
                boolean z11 = z10;
                Object h10 = this.transitionImpl.h(next.getTransition());
                if (h10 != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<h> it3 = it2;
                    View view4 = operation.getFragment().K;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation == dVar2 || operation == dVar)) {
                        if (operation == dVar2) {
                            arrayList2.removeAll(CollectionsKt.Q0(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(CollectionsKt.Q0(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.a(h10, view);
                    } else {
                        this.transitionImpl.b(h10, arrayList2);
                        this.transitionImpl.s(h10, h10, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == i.d.b.GONE) {
                            operation.q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().K);
                            this.transitionImpl.r(h10, operation.getFragment().K, arrayList3);
                            b0.a(container, new Runnable() { // from class: e4.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == i.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.transitionImpl.u(h10, rect);
                        }
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h10);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            int size = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                int i11 = size;
                                View transitioningViews = arrayList2.get(i10);
                                i10++;
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews);
                                size = i11;
                            }
                        }
                    } else {
                        this.transitionImpl.v(h10, view2);
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h10);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            int i12 = 0;
                            for (int size2 = arrayList2.size(); i12 < size2; size2 = size2) {
                                View transitioningViews2 = arrayList2.get(i12);
                                i12++;
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        obj2 = this.transitionImpl.p(obj2, h10, null);
                    } else {
                        obj3 = this.transitionImpl.p(obj3, h10, null);
                    }
                    dVar = lastIn;
                    dVar2 = firstOut;
                    z10 = z11;
                    it2 = it3;
                } else {
                    dVar = lastIn;
                    dVar2 = firstOut;
                    z10 = z11;
                }
            }
            Object o8 = this.transitionImpl.o(obj2, obj3, this.sharedElementTransition);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + o8 + " for container " + container);
            }
            return new Pair<>(arrayList, o8);
        }

        @Nullable
        /* renamed from: s, reason: from getter */
        public final Object getController() {
            return this.controller;
        }

        @Nullable
        /* renamed from: t, reason: from getter */
        public final i.d getFirstOut() {
            return this.firstOut;
        }

        @Nullable
        /* renamed from: u, reason: from getter */
        public final i.d getLastIn() {
            return this.lastIn;
        }

        @NotNull
        /* renamed from: v, reason: from getter */
        public final j0 getTransitionImpl() {
            return this.transitionImpl;
        }

        @NotNull
        public final List<h> w() {
            return this.transitionInfos;
        }

        public final boolean x() {
            List<h> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).getOperation().getFragment().f2423n) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/b$h;", "Landroidx/fragment/app/b$f;", "Landroidx/fragment/app/i$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/i$d;ZZ)V", "g", "()Z", "", "transition", "Le4/j0;", rl.d.f30696a, "(Ljava/lang/Object;)Le4/j0;", j6.b.f21518e, "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Le4/j0;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends f {

        /* renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object transition;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean isOverlapAllowed;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object sharedElementTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull i.d operation, boolean z10, boolean z11) {
            super(operation);
            Object X;
            Intrinsics.checkNotNullParameter(operation, "operation");
            i.d.b finalState = operation.getFinalState();
            i.d.b bVar = i.d.b.VISIBLE;
            if (finalState == bVar) {
                androidx.fragment.app.c fragment = operation.getFragment();
                X = z10 ? fragment.R() : fragment.y();
            } else {
                androidx.fragment.app.c fragment2 = operation.getFragment();
                X = z10 ? fragment2.X() : fragment2.C();
            }
            this.transition = X;
            this.isOverlapAllowed = operation.getFinalState() == bVar ? z10 ? operation.getFragment().r() : operation.getFragment().q() : true;
            this.sharedElementTransition = z11 ? z10 ? operation.getFragment().b0() : operation.getFragment().Z() : null;
        }

        @Nullable
        public final j0 c() {
            j0 d10 = d(this.transition);
            j0 d11 = d(this.sharedElementTransition);
            if (d10 == null || d11 == null || d10 == d11) {
                return d10 == null ? d11 : d10;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        public final j0 d(Object transition) {
            if (transition == null) {
                return null;
            }
            j0 j0Var = h0.PLATFORM_IMPL;
            if (j0Var != null && j0Var.g(transition)) {
                return j0Var;
            }
            j0 j0Var2 = h0.SUPPORT_IMPL;
            if (j0Var2 != null && j0Var2.g(transition)) {
                return j0Var2;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        @Nullable
        /* renamed from: e, reason: from getter */
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @Nullable
        /* renamed from: f, reason: from getter */
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean g() {
            return this.sharedElementTransition != null;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "entry", "", j6.b.f21518e, "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    public static final class i extends m implements Function1<Map.Entry<String, View>, Boolean> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Collection<String> f2405i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection<String> collection) {
            super(1);
            this.f2405i = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull Map.Entry<String, View> entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt.W(this.f2405i, o0.H(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public static final void G(b this$0, i.d operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.c(operation);
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    public final void F(List<C0036b> animationInfos) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            u.z(arrayList2, ((C0036b) it.next()).getOperation().f());
        }
        boolean isEmpty = arrayList2.isEmpty();
        int i10 = 0;
        boolean z10 = false;
        for (C0036b c0036b : animationInfos) {
            Context context = getContainer().getContext();
            i.d operation = c0036b.getOperation();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            d.a c10 = c0036b.c(context);
            if (c10 != null) {
                if (c10.b == null) {
                    arrayList.add(c0036b);
                } else {
                    androidx.fragment.app.c fragment = operation.getFragment();
                    if (operation.f().isEmpty()) {
                        if (operation.getFinalState() == i.d.b.GONE) {
                            operation.q(false);
                        }
                        operation.b(new c(c0036b));
                        z10 = true;
                    } else if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C0036b c0036b2 = (C0036b) obj;
            i.d operation2 = c0036b2.getOperation();
            androidx.fragment.app.c fragment2 = operation2.getFragment();
            if (isEmpty) {
                if (!z10) {
                    operation2.b(new a(c0036b2));
                } else if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void H(List<h> transitionInfos, boolean isPop, i.d firstOut, i.d lastIn) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        j0 j0Var;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i11;
        Object obj;
        String b;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : transitionInfos) {
            if (!((h) obj2).b()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList5.get(i12);
            i12++;
            if (((h) obj3).c() != null) {
                arrayList6.add(obj3);
            }
        }
        int size2 = arrayList6.size();
        j0 j0Var2 = null;
        int i13 = 0;
        while (i13 < size2) {
            Object obj4 = arrayList6.get(i13);
            i13++;
            h hVar = (h) obj4;
            j0 c10 = hVar.c();
            if (j0Var2 != null && c10 != j0Var2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.getOperation().getFragment() + " returned Transition " + hVar.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            j0Var2 = c10;
        }
        if (j0Var2 == null) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        w1.a aVar = new w1.a();
        ArrayList<String> arrayList9 = new ArrayList<>();
        ArrayList<String> arrayList10 = new ArrayList<>();
        w1.a<String, View> aVar2 = new w1.a<>();
        w1.a<String, View> aVar3 = new w1.a<>();
        int size3 = arrayList6.size();
        ArrayList<String> arrayList11 = arrayList9;
        ArrayList<String> arrayList12 = arrayList10;
        Object obj5 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj6 = arrayList6.get(i14);
            int i15 = i14 + 1;
            h hVar2 = (h) obj6;
            if (!hVar2.g() || firstOut == null || lastIn == null) {
                arrayList2 = arrayList6;
                i10 = i15;
                j0Var = j0Var2;
                arrayList3 = arrayList7;
                arrayList4 = arrayList8;
                i11 = size3;
            } else {
                Object B = j0Var2.B(j0Var2.h(hVar2.getSharedElementTransition()));
                arrayList12 = lastIn.getFragment().c0();
                Intrinsics.checkNotNullExpressionValue(arrayList12, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> c02 = firstOut.getFragment().c0();
                Intrinsics.checkNotNullExpressionValue(c02, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> d02 = firstOut.getFragment().d0();
                i10 = i15;
                Intrinsics.checkNotNullExpressionValue(d02, "firstOut.fragment.sharedElementTargetNames");
                int size4 = d02.size();
                j0Var = j0Var2;
                arrayList3 = arrayList7;
                int i16 = 0;
                while (i16 < size4) {
                    int i17 = size4;
                    int indexOf = arrayList12.indexOf(d02.get(i16));
                    if (indexOf != -1) {
                        arrayList12.set(indexOf, c02.get(i16));
                    }
                    i16++;
                    size4 = i17;
                }
                arrayList11 = lastIn.getFragment().d0();
                Intrinsics.checkNotNullExpressionValue(arrayList11, "lastIn.fragment.sharedElementTargetNames");
                Pair a10 = !isPop ? s.a(firstOut.getFragment().D(), lastIn.getFragment().A()) : s.a(firstOut.getFragment().A(), lastIn.getFragment().D());
                k2.u uVar = (k2.u) a10.a();
                k2.u uVar2 = (k2.u) a10.b();
                int size5 = arrayList12.size();
                arrayList4 = arrayList8;
                int i18 = 0;
                while (true) {
                    i11 = size3;
                    if (i18 >= size5) {
                        break;
                    }
                    int i19 = size5;
                    String str = arrayList12.get(i18);
                    Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                    String str2 = arrayList11.get(i18);
                    Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                    aVar.put(str, str2);
                    i18++;
                    size3 = i11;
                    size5 = i19;
                }
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    int size6 = arrayList11.size();
                    arrayList2 = arrayList6;
                    obj = B;
                    int i20 = 0;
                    while (i20 < size6) {
                        String str3 = arrayList11.get(i20);
                        int i21 = i20 + 1;
                        String str4 = str3;
                        Log.v("FragmentManager", "Name: " + str4);
                        size6 = size6;
                        i20 = i21;
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    int i22 = 0;
                    for (int size7 = arrayList12.size(); i22 < size7; size7 = size7) {
                        String str5 = arrayList12.get(i22);
                        Log.v("FragmentManager", "Name: " + str5);
                        i22++;
                    }
                } else {
                    arrayList2 = arrayList6;
                    obj = B;
                }
                View view = firstOut.getFragment().K;
                Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                I(aVar2, view);
                aVar2.o(arrayList12);
                if (uVar != null) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + firstOut);
                    }
                    uVar.a(arrayList12, aVar2);
                    int size8 = arrayList12.size() - 1;
                    if (size8 >= 0) {
                        while (true) {
                            int i23 = size8 - 1;
                            String str6 = arrayList12.get(size8);
                            Intrinsics.checkNotNullExpressionValue(str6, "exitingNames[i]");
                            String str7 = str6;
                            View view2 = aVar2.get(str7);
                            if (view2 == null) {
                                aVar.remove(str7);
                            } else if (!Intrinsics.c(str7, o0.H(view2))) {
                                aVar.put(o0.H(view2), (String) aVar.remove(str7));
                            }
                            if (i23 < 0) {
                                break;
                            } else {
                                size8 = i23;
                            }
                        }
                    }
                } else {
                    aVar.o(aVar2.keySet());
                }
                View view3 = lastIn.getFragment().K;
                Intrinsics.checkNotNullExpressionValue(view3, "lastIn.fragment.mView");
                I(aVar3, view3);
                aVar3.o(arrayList11);
                aVar3.o(aVar.values());
                if (uVar2 != null) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + lastIn);
                    }
                    uVar2.a(arrayList11, aVar3);
                    int size9 = arrayList11.size() - 1;
                    if (size9 >= 0) {
                        while (true) {
                            int i24 = size9 - 1;
                            String str8 = arrayList11.get(size9);
                            Intrinsics.checkNotNullExpressionValue(str8, "enteringNames[i]");
                            String str9 = str8;
                            View view4 = aVar3.get(str9);
                            if (view4 == null) {
                                String b10 = h0.b(aVar, str9);
                                if (b10 != null) {
                                    aVar.remove(b10);
                                }
                            } else if (!Intrinsics.c(str9, o0.H(view4)) && (b = h0.b(aVar, str9)) != null) {
                                aVar.put(b, o0.H(view4));
                            }
                            if (i24 < 0) {
                                break;
                            } else {
                                size9 = i24;
                            }
                        }
                    }
                } else {
                    h0.d(aVar, aVar3);
                }
                Collection<String> keySet = aVar.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                J(aVar2, keySet);
                Collection<String> values = aVar.values();
                Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                J(aVar3, values);
                if (aVar.isEmpty()) {
                    Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList3.clear();
                    arrayList4.clear();
                    i14 = i10;
                    j0Var2 = j0Var;
                    arrayList7 = arrayList3;
                    arrayList8 = arrayList4;
                    size3 = i11;
                    arrayList6 = arrayList2;
                    obj5 = null;
                } else {
                    obj5 = obj;
                }
            }
            i14 = i10;
            j0Var2 = j0Var;
            arrayList7 = arrayList3;
            arrayList8 = arrayList4;
            size3 = i11;
            arrayList6 = arrayList2;
        }
        ArrayList arrayList13 = arrayList6;
        j0 j0Var3 = j0Var2;
        ArrayList arrayList14 = arrayList7;
        ArrayList arrayList15 = arrayList8;
        if (obj5 == null) {
            if (arrayList13.isEmpty()) {
                return;
            }
            int size10 = arrayList13.size();
            int i25 = 0;
            while (i25 < size10) {
                arrayList = arrayList13;
                Object obj7 = arrayList.get(i25);
                i25++;
                if (((h) obj7).getTransition() == null) {
                    arrayList13 = arrayList;
                }
            }
            return;
        }
        arrayList = arrayList13;
        ArrayList arrayList16 = arrayList;
        g gVar = new g(arrayList16, firstOut, lastIn, j0Var3, obj5, arrayList14, arrayList15, aVar, arrayList11, arrayList12, aVar2, aVar3, isPop);
        int size11 = arrayList16.size();
        int i26 = 0;
        while (i26 < size11) {
            Object obj8 = arrayList16.get(i26);
            i26++;
            ((h) obj8).getOperation().b(gVar);
        }
    }

    public final void I(Map<String, View> namedViews, View view) {
        String H = o0.H(view);
        if (H != null) {
            namedViews.put(H, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    I(namedViews, child);
                }
            }
        }
    }

    public final void J(w1.a<String, View> aVar, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = aVar.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        u.J(entries, new i(collection));
    }

    public final void K(List<? extends i.d> operations) {
        androidx.fragment.app.c fragment = ((i.d) CollectionsKt.o0(operations)).getFragment();
        for (i.d dVar : operations) {
            dVar.getFragment().N.f2450c = fragment.N.f2450c;
            dVar.getFragment().N.f2451d = fragment.N.f2451d;
            dVar.getFragment().N.f2452e = fragment.N.f2452e;
            dVar.getFragment().N.f2453f = fragment.N.f2453f;
        }
    }

    @Override // androidx.fragment.app.i
    public void d(@NotNull List<? extends i.d> operations, boolean isPop) {
        i.d dVar;
        Object obj;
        Intrinsics.checkNotNullParameter(operations, "operations");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator<T> it = operations.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            i.d dVar2 = (i.d) obj;
            i.d.b.Companion companion = i.d.b.INSTANCE;
            View view = dVar2.getFragment().K;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            i.d.b a10 = companion.a(view);
            i.d.b bVar = i.d.b.VISIBLE;
            if (a10 == bVar && dVar2.getFinalState() != bVar) {
                break;
            }
        }
        i.d dVar3 = (i.d) obj;
        ListIterator<? extends i.d> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            i.d previous = listIterator.previous();
            i.d dVar4 = previous;
            i.d.b.Companion companion2 = i.d.b.INSTANCE;
            View view2 = dVar4.getFragment().K;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            i.d.b a11 = companion2.a(view2);
            i.d.b bVar2 = i.d.b.VISIBLE;
            if (a11 != bVar2 && dVar4.getFinalState() == bVar2) {
                dVar = previous;
                break;
            }
        }
        i.d dVar5 = dVar;
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar3 + " to " + dVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        K(operations);
        for (final i.d dVar6 : operations) {
            arrayList.add(new C0036b(dVar6, isPop));
            boolean z10 = false;
            if (isPop) {
                if (dVar6 != dVar3) {
                    arrayList2.add(new h(dVar6, isPop, z10));
                    dVar6.a(new Runnable() { // from class: e4.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.fragment.app.b.G(androidx.fragment.app.b.this, dVar6);
                        }
                    });
                }
                z10 = true;
                arrayList2.add(new h(dVar6, isPop, z10));
                dVar6.a(new Runnable() { // from class: e4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.b.G(androidx.fragment.app.b.this, dVar6);
                    }
                });
            } else {
                if (dVar6 != dVar5) {
                    arrayList2.add(new h(dVar6, isPop, z10));
                    dVar6.a(new Runnable() { // from class: e4.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.fragment.app.b.G(androidx.fragment.app.b.this, dVar6);
                        }
                    });
                }
                z10 = true;
                arrayList2.add(new h(dVar6, isPop, z10));
                dVar6.a(new Runnable() { // from class: e4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.b.G(androidx.fragment.app.b.this, dVar6);
                    }
                });
            }
        }
        H(arrayList2, isPop, dVar3, dVar5);
        F(arrayList);
    }
}
