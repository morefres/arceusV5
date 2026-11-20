package com.squareup.workflow1.ui.backstack;

import an.c;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.squareup.workflow1.ui.backstack.ViewStateCache;
import d5.i;
import gt.l;
import gt.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k;
import o5.b0;
import o5.n;
import o5.p;
import o5.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.a;
import ym.ViewEnvironment;
import ym.a0;
import ym.c0;
import ym.e0;
import ym.f;
import ym.f0;
import ym.g;
import ym.g0;
import ym.h;
import ym.h0;
import ym.m;
import yt.o;
import zm.d;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002#,B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010(\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lan/c;", "newRendering", "Lym/y;", "newViewEnvironment", "", "c", "(Lan/c;Lym/y;)V", "Landroid/view/View;", "oldViewMaybe", "newView", "", "popped", j6.b.f21518e, "(Landroid/view/View;Landroid/view/View;Z)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", a.f33391e, "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "viewStateCache", "Lym/m;", "Lan/c;", "currentRendering", "getCurrentView", "()Landroid/view/View;", "currentView", "SavedState", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BackStackContainer extends FrameLayout {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewStateCache viewStateCache;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public c<m<?>> currentRendering;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$a;", "Lym/a0;", "Lan/c;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", j6.b.f21518e, "(Lan/c;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a, reason: from kotlin metadata */
    public static final class Companion implements a0<c<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<c<?>> f9929a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lan/c;", "initialRendering", "Lym/y;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", a.f33391e, "(Lan/c;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a, reason: collision with other inner class name */
        public static final class C0163a extends kotlin.jvm.internal.m implements o<c<?>, ViewEnvironment, Context, ViewGroup, View> {

            /* renamed from: i, reason: collision with root package name */
            public static final C0163a f9930i = new C0163a();

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0164a extends k implements Function2<c<?>, ViewEnvironment, Unit> {
                public C0164a(Object obj) {
                    super(2, obj, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void d(@NotNull c<?> p02, @NotNull ViewEnvironment p12) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    Intrinsics.checkNotNullParameter(p12, "p1");
                    ((BackStackContainer) this.receiver).c(p02, p12);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c<?> cVar, ViewEnvironment viewEnvironment) {
                    d(cVar, viewEnvironment);
                    return Unit.f22894a;
                }
            }

            public C0163a() {
                super(4);
            }

            @Override // yt.o
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View e(@NotNull c<?> initialRendering, @NotNull ViewEnvironment initialEnv, @NotNull Context context, @Nullable ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
                Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                BackStackContainer backStackContainer = new BackStackContainer(context, null, 0, 0, 14, null);
                backStackContainer.setId(bn.a.f4319c);
                backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                e0.a(backStackContainer, initialRendering, initialEnv, new C0164a(backStackContainer));
                return backStackContainer;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull c<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f9929a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super c<?>> getType() {
            return this.f9929a.getType();
        }

        public Companion() {
            this.f9929a = new f<>(d0.b(c.class), C0163a.f9930i);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lym/m;", a.f33391e, "(Ljava/lang/Object;)Lym/m;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function1<Object, m<?>> {

        /* renamed from: i, reason: collision with root package name */
        public static final b f9931i = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m<?> invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new m<>(it, "backstack");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void d(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        d.Companion.e(d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public void b(@Nullable View oldViewMaybe, @NotNull View newView, boolean popped) {
        Pair a10;
        Integer valueOf = Integer.valueOf(GravityCompat.END);
        Integer valueOf2 = Integer.valueOf(GravityCompat.START);
        Intrinsics.checkNotNullParameter(newView, "newView");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        View findViewById = oldViewMaybe.findViewById(bn.a.f4318a);
        View findViewById2 = newView.findViewById(bn.a.f4318a);
        if (findViewById == null || findViewById2 == null) {
            findViewById2 = newView;
        } else {
            oldViewMaybe = findViewById;
        }
        if (!popped) {
            a10 = s.a(valueOf2, valueOf);
        } else {
            if (!popped) {
                throw new l();
            }
            a10 = s.a(valueOf, valueOf2);
        }
        b0 v02 = new b0().D0(new p(((Number) a10.a()).intValue()).e(oldViewMaybe)).D0(new p(((Number) a10.b()).intValue()).e(findViewById2)).v0(new AccelerateDecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(v02, "TransitionSet()\n        …DecelerateInterpolator())");
        y.d(this);
        y.f(new n(this, newView), v02);
    }

    public final void c(@NotNull c<?> newRendering, @NotNull ViewEnvironment newViewEnvironment) {
        d c10;
        List<m<?>> a10;
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment c11 = newViewEnvironment.c(s.a(an.a.INSTANCE, newRendering.a().isEmpty() ? an.a.First : an.a.Other));
        c d10 = newRendering.d(b.f9931i);
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = e0.b(currentView, d10.c()) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(d10.b());
                e0.g(view, d10.c(), c11);
                return;
            }
        }
        c0 c0Var = (c0) c11.a(c0.INSTANCE);
        Object c12 = d10.c();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        View c13 = ym.d0.c(c0Var, c12, c11, context, this, new f0() { // from class: an.b
            @Override // ym.f0
            public final void a(View view2, Function0 function0) {
                BackStackContainer.d(view2, function0);
            }
        });
        e0.h(c13);
        this.viewStateCache.h(d10.a(), currentView, c13);
        c<m<?>> cVar = this.currentRendering;
        boolean z10 = false;
        if (cVar != null && (a10 = cVar.a()) != null) {
            List<m<?>> list = a10;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (h.a((m) it.next(), d10.c())) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        b(currentView, c13, z10);
        if (currentView != null && (c10 = d.INSTANCE.c(currentView)) != null) {
            c10.K();
        }
        this.currentRendering = d10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i c10 = zm.c.f38109a.c(this);
        g.Companion companion = g.INSTANCE;
        g0<?> d10 = h0.d(this);
        Object c11 = d10 == null ? null : d10.c();
        if (c11 == null) {
            c11 = null;
        }
        Intrinsics.checkNotNull(c11);
        this.viewStateCache.a(g.Companion.b(companion, c11, null, 2, null), c10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.viewStateCache.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.viewStateCache.f(savedState.getSavedViewState());
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.f22894a;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        return new SavedState(onSaveInstanceState, this.viewStateCache.g());
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", a.f33391e, "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ViewStateCache.Saved savedViewState;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, a.f33391e, "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "", "size", "", j6.b.f21518e, "(I)[Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$SavedState$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }

            public Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcelable superState, @NotNull ViewStateCache.Saved savedViewState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
            Intrinsics.checkNotNullParameter(savedViewState, "savedViewState");
            this.savedViewState = savedViewState;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final ViewStateCache.Saved getSavedViewState() {
            return this.savedViewState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.savedViewState, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            Parcelable readParcelable = source.readParcelable(ViewStateCache.Saved.class.getClassLoader());
            Intrinsics.checkNotNull(readParcelable);
            Intrinsics.checkNotNullExpressionValue(readParcelable, "source.readParcelable(Vi…class.java.classLoader)!!");
            this.savedViewState = (ViewStateCache.Saved) readParcelable;
        }
    }

    public /* synthetic */ BackStackContainer(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewStateCache = new ViewStateCache();
    }
}
