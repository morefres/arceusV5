package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.BackEventCompat;
import e4.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zl.t;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0013\b \u0018\u0000 42\u00020\u0001:\u0004=A %B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0019J\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0019J%\u0010%\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0010¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\r¢\u0006\u0004\b-\u0010\u0019J\u0019\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u0004\u0018\u00010\u001e2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00101J'\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e06H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e06H\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010\u0019J\u001d\u0010<\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0002¢\u0006\u0004\b<\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010BR\u0016\u0010F\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010ER\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER\u0016\u0010H\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010E¨\u0006I"}, d2 = {"Landroidx/fragment/app/i;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/g;", "fragmentStateManager", "Landroidx/fragment/app/i$d$a;", "s", "(Landroidx/fragment/app/g;)Landroidx/fragment/app/i$d$a;", "Landroidx/fragment/app/i$d$b;", "finalState", "", "j", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/g;)V", "m", "(Landroidx/fragment/app/g;)V", "k", "l", "", "isPop", "D", "(Z)V", "z", "()V", "y", "()Z", "r", "n", "Landroidx/fragment/app/i$d;", "operation", "c", "(Landroidx/fragment/app/i$d;)V", "q", "", "operations", rl.d.f30696a, "(Ljava/util/List;Z)V", "e", "(Ljava/util/List;)V", "Le/b;", "backEvent", "A", "(Le/b;)V", "f", "Landroidx/fragment/app/c;", "fragment", "o", "(Landroidx/fragment/app/c;)Landroidx/fragment/app/i$d;", "p", "lifecycleImpact", "g", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/g;)V", "", "newPendingOperations", "x", "(Ljava/util/List;)Z", "w", "C", "B", ve.a.f33391e, "Landroid/view/ViewGroup;", t.f38095d, "()Landroid/view/ViewGroup;", j6.b.f21518e, "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup container;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> pendingOperations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<d> runningOperations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean runningNonSeekableTransition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean operationDirectionIsPop;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isContainerPostponed;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/i$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/i;", ve.a.f33391e, "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/i;", "Le4/p0;", "factory", j6.b.f21518e, "(Landroid/view/ViewGroup;Le4/p0;)Landroidx/fragment/app/i;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            p0 F0 = fragmentManager.F0();
            Intrinsics.checkNotNullExpressionValue(F0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, F0);
        }

        @NotNull
        public final i b(@NotNull ViewGroup container, @NotNull p0 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(d4.b.b);
            if (tag instanceof i) {
                return (i) tag;
            }
            i a10 = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(a10, "factory.createController(container)");
            container.setTag(d4.b.b, a10);
            return a10;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/fragment/app/i$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "", "g", "(Landroid/view/ViewGroup;)V", "f", "Le/b;", "backEvent", "e", "(Le/b;Landroid/view/ViewGroup;)V", rl.d.f30696a, ve.a.f33391e, "c", "", "Z", j6.b.f21518e, "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean isSeekingSupported;

        /* renamed from: b, reason: from kotlin metadata */
        public boolean isStarted;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean isCancelled;

        public final void a(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isCancelled) {
                c(container);
            }
            this.isCancelled = true;
        }

        /* renamed from: b, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void e(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public final void g(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isStarted) {
                f(container);
            }
            this.isStarted = true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/i$c;", "Landroidx/fragment/app/i$d;", "Landroidx/fragment/app/i$d$b;", "finalState", "Landroidx/fragment/app/i$d$a;", "lifecycleImpact", "Landroidx/fragment/app/g;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/g;)V", "", "p", "()V", rl.d.f30696a, "l", "Landroidx/fragment/app/g;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends d {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@org.jetbrains.annotations.NotNull androidx.fragment.app.i.d.b r3, @org.jetbrains.annotations.NotNull androidx.fragment.app.i.d.a r4, @org.jetbrains.annotations.NotNull androidx.fragment.app.g r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.fragment.app.c r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.fragmentStateManager = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.c.<init>(androidx.fragment.app.i$d$b, androidx.fragment.app.i$d$a, androidx.fragment.app.g):void");
        }

        @Override // androidx.fragment.app.i.d
        public void d() {
            super.d();
            getFragment().f2423n = false;
            this.fragmentStateManager.m();
        }

        @Override // androidx.fragment.app.i.d
        public void p() {
            if (getIsStarted()) {
                return;
            }
            super.p();
            if (getLifecycleImpact() != d.a.ADDING) {
                if (getLifecycleImpact() == d.a.REMOVING) {
                    androidx.fragment.app.c k10 = this.fragmentStateManager.k();
                    Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
                    View J1 = k10.J1();
                    Intrinsics.checkNotNullExpressionValue(J1, "fragment.requireView()");
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + J1.findFocus() + " on view " + J1 + " for Fragment " + k10);
                    }
                    J1.clearFocus();
                    return;
                }
                return;
            }
            androidx.fragment.app.c k11 = this.fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
            View findFocus = k11.K.findFocus();
            if (findFocus != null) {
                k11.R1(findFocus);
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k11);
                }
            }
            View J12 = getFragment().J1();
            Intrinsics.checkNotNullExpressionValue(J12, "this.fragment.requireView()");
            if (J12.getParent() == null) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Adding fragment " + k11 + " view " + J12 + " to container in onStart");
                }
                this.fragmentStateManager.b();
                J12.setAlpha(0.0f);
            }
            if (J12.getAlpha() == 0.0f && J12.getVisibility() == 0) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Making view " + J12 + " INVISIBLE in onStart");
                }
                J12.setVisibility(4);
            }
            J12.setAlpha(k11.Q());
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + k11.Q() + " in onStart");
            }
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, d2 = {"Landroidx/fragment/app/i$d;", "", "Landroidx/fragment/app/i$d$b;", "finalState", "Landroidx/fragment/app/i$d$a;", "lifecycleImpact", "Landroidx/fragment/app/c;", "fragment", "<init>", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/c;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;)V", "Ljava/lang/Runnable;", "listener", ve.a.f33391e, "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/i$b;", "effect", j6.b.f21518e, "(Landroidx/fragment/app/i$b;)V", "e", "p", "()V", rl.d.f30696a, "Landroidx/fragment/app/i$d$b;", "g", "()Landroidx/fragment/app/i$d$b;", "setFinalState", "(Landroidx/fragment/app/i$d$b;)V", "Landroidx/fragment/app/i$d$a;", "i", "()Landroidx/fragment/app/i$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/i$d$a;)V", "Landroidx/fragment/app/c;", "h", "()Landroidx/fragment/app/c;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public b finalState;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public a lifecycleImpact;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final androidx.fragment.app.c fragment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Runnable> completionListeners;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean isCanceled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean isComplete;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean isSeeking;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public boolean isStarted;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        public boolean isAwaitingContainerChanges;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b> _effects;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b> effects;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/i$d$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/i$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "", j6.b.f21518e, "(Landroid/view/View;Landroid/view/ViewGroup;)V", ve.a.f33391e, "c", rl.d.f30696a, "e", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/i$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/i$d$b;", ve.a.f33391e, "(Landroid/view/View;)Landroidx/fragment/app/i$d$b;", "", "visibility", j6.b.f21518e, "(I)Landroidx/fragment/app/i$d$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.fragment.app.i$d$b$a, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final b a(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                @NotNull
                public final b b(int visibility) {
                    if (visibility == 0) {
                        return b.VISIBLE;
                    }
                    if (visibility == 4) {
                        return b.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                }

                public Companion() {
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.fragment.app.i$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0039b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f2537a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f2537a = iArr;
                }
            }

            @NotNull
            public static final b c(int i10) {
                return INSTANCE.b(i10);
            }

            public final void b(@NotNull View view, @NotNull ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i10 = C0039b.f2537a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2538a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2538a = iArr;
            }
        }

        public d(@NotNull b finalState, @NotNull a lifecycleImpact, @NotNull androidx.fragment.app.c fragment) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void a(@NotNull Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void b(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this._effects.add(effect);
        }

        public final void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                d();
                return;
            }
            Iterator it = CollectionsKt.M0(this.effects).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                d();
            }
        }

        @NotNull
        public final List<b> f() {
            return this.effects;
        }

        @NotNull
        /* renamed from: g, reason: from getter */
        public final b getFinalState() {
            return this.finalState;
        }

        @NotNull
        /* renamed from: h, reason: from getter */
        public final androidx.fragment.app.c getFragment() {
            return this.fragment;
        }

        @NotNull
        /* renamed from: i, reason: from getter */
        public final a getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getIsAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getIsStarted() {
            return this.isStarted;
        }

        public final void o(@NotNull b finalState, @NotNull a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f2538a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.finalState == b.REMOVED) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = b.VISIBLE;
                    this.lifecycleImpact = a.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = b.REMOVED;
                this.lifecycleImpact = a.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i10 == 3 && this.finalState != b.REMOVED) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        public void p() {
            this.isStarted = true;
        }

        public final void q(boolean z10) {
            this.isAwaitingContainerChanges = z10;
        }

        public final void r(boolean z10) {
            this.isSeeking = z10;
        }

        @NotNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2539a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2539a = iArr;
        }
    }

    public i(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    public static final void h(i this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            d.b finalState = operation.getFinalState();
            View view = operation.getFragment().K;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            finalState.b(view, this$0.container);
        }
    }

    public static final void i(i this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    @NotNull
    public static final i u(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return INSTANCE.a(viewGroup, fragmentManager);
    }

    @NotNull
    public static final i v(@NotNull ViewGroup viewGroup, @NotNull p0 p0Var) {
        return INSTANCE.b(viewGroup, p0Var);
    }

    public final void A(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List<d> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            u.z(arrayList, ((d) it.next()).f());
        }
        List M0 = CollectionsKt.M0(CollectionsKt.Q0(arrayList));
        int size = M0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) M0.get(i10)).e(backEvent, this.container);
        }
    }

    public final void B(List<d> operations) {
        int size = operations.size();
        for (int i10 = 0; i10 < size; i10++) {
            operations.get(i10).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            u.z(arrayList, ((d) it.next()).f());
        }
        List M0 = CollectionsKt.M0(CollectionsKt.Q0(arrayList));
        int size2 = M0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) M0.get(i11)).g(this.container);
        }
    }

    public final void C() {
        for (d dVar : this.pendingOperations) {
            if (dVar.getLifecycleImpact() == d.a.ADDING) {
                View J1 = dVar.getFragment().J1();
                Intrinsics.checkNotNullExpressionValue(J1, "fragment.requireView()");
                dVar.o(d.b.INSTANCE.b(J1.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void D(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    public final void c(@NotNull d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.getIsAwaitingContainerChanges()) {
            d.b finalState = operation.getFinalState();
            View J1 = operation.getFragment().J1();
            Intrinsics.checkNotNullExpressionValue(J1, "operation.fragment.requireView()");
            finalState.b(J1, this.container);
            operation.q(false);
        }
    }

    public abstract void d(@NotNull List<d> operations, boolean isPop);

    public void e(@NotNull List<d> operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            u.z(arrayList, ((d) it.next()).f());
        }
        List M0 = CollectionsKt.M0(CollectionsKt.Q0(arrayList));
        int size = M0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) M0.get(i10)).d(this.container);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c(operations.get(i11));
        }
        List M02 = CollectionsKt.M0(operations);
        int size3 = M02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) M02.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.runningOperations);
        e(this.runningOperations);
    }

    public final void g(d.b finalState, d.a lifecycleImpact, g fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                androidx.fragment.app.c k10 = fragmentStateManager.k();
                Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
                d o8 = o(k10);
                if (o8 == null) {
                    if (!fragmentStateManager.k().f2423n && !fragmentStateManager.k().f2422m) {
                        o8 = null;
                    }
                    androidx.fragment.app.c k11 = fragmentStateManager.k();
                    Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
                    o8 = p(k11);
                }
                if (o8 != null) {
                    o8.o(finalState, lifecycleImpact);
                    return;
                }
                final c cVar = new c(finalState, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(cVar);
                cVar.a(new Runnable() { // from class: e4.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.i.h(androidx.fragment.app.i.this, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: e4.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.i.i(androidx.fragment.app.i.this, cVar);
                    }
                });
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(@NotNull d.b finalState, @NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z10;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            q();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<d> O0 = CollectionsKt.O0(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = O0.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.pendingOperations.isEmpty() || !dVar.getFragment().f2423n) {
                        z10 = false;
                    }
                    dVar.r(z10);
                }
                for (d dVar2 : O0) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!dVar2.getIsComplete()) {
                        this.runningOperations.add(dVar2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    C();
                    List<d> O02 = CollectionsKt.O0(this.pendingOperations);
                    if (O02.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(O02);
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(O02, this.operationDirectionIsPop);
                    boolean w5 = w(O02);
                    boolean x10 = x(O02);
                    if (!x10 || w5) {
                        z10 = false;
                    }
                    this.runningNonSeekableTransition = z10;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + w5 + " \ntransition = " + x10);
                    }
                    if (!x10) {
                        B(O02);
                        e(O02);
                    } else if (w5) {
                        B(O02);
                        int size = O02.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c(O02.get(i10));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d o(androidx.fragment.app.c fragment) {
        Object obj;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (Intrinsics.c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                break;
            }
        }
        return (d) obj;
    }

    public final d p(androidx.fragment.app.c fragment) {
        Object obj;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (Intrinsics.c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void q() {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                C();
                B(this.pendingOperations);
                List<d> O0 = CollectionsKt.O0(this.runningOperations);
                Iterator it = O0.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : O0) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.container);
                }
                List<d> O02 = CollectionsKt.O0(this.pendingOperations);
                Iterator it2 = O02.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : O02) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.container);
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.isContainerPostponed) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            n();
        }
    }

    @Nullable
    public final d.a s(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        androidx.fragment.app.c k10 = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
        d o8 = o(k10);
        d.a lifecycleImpact = o8 != null ? o8.getLifecycleImpact() : null;
        d p8 = p(k10);
        d.a lifecycleImpact2 = p8 != null ? p8.getLifecycleImpact() : null;
        int i10 = lifecycleImpact == null ? -1 : e.f2539a[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    @NotNull
    /* renamed from: t, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean w(List<d> newPendingOperations) {
        boolean z10;
        List<d> list = newPendingOperations;
        loop0: while (true) {
            z10 = true;
            for (d dVar : list) {
                if (!dVar.f().isEmpty()) {
                    List<b> f10 = dVar.f();
                    if (!(f10 instanceof Collection) || !f10.isEmpty()) {
                        Iterator<T> it = f10.iterator();
                        while (it.hasNext()) {
                            if (!((b) it.next()).getIsSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                u.z(arrayList, ((d) it2.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(List<d> newPendingOperations) {
        Iterator<T> it = newPendingOperations.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).getFragment().f2423n) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean y() {
        return !this.pendingOperations.isEmpty();
    }

    public final void z() {
        d dVar;
        synchronized (this.pendingOperations) {
            try {
                C();
                List<d> list = this.pendingOperations;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVar = null;
                        break;
                    }
                    dVar = listIterator.previous();
                    d dVar2 = dVar;
                    d.b.Companion companion = d.b.INSTANCE;
                    View view = dVar2.getFragment().K;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    d.b a10 = companion.a(view);
                    d.b finalState = dVar2.getFinalState();
                    d.b bVar = d.b.VISIBLE;
                    if (finalState == bVar && a10 != bVar) {
                        break;
                    }
                }
                d dVar3 = dVar;
                androidx.fragment.app.c fragment = dVar3 != null ? dVar3.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.u0() : false;
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
