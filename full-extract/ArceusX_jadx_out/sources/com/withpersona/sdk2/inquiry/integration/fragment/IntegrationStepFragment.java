package com.withpersona.sdk2.inquiry.integration.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.a1;
import android.view.b1;
import android.view.c1;
import android.view.j;
import android.view.t;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.d;
import e4.l0;
import gt.o;
import gt.s;
import ju.p0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;
import yt.n;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002@AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0005\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;", "Lmq/c;", "Llq/b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "q2", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "handler", "r2", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;", "j0", "Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;", "p2", "()Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;)V", "viewModelFactory", "Ltq/a;", "k0", "Ltq/a;", "m2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Lym/y;", "l0", "Lgt/h;", "n2", "()Lym/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/integration/fragment/d;", "m0", "o2", "()Lcom/withpersona/sdk2/inquiry/integration/fragment/d;", "viewModel", "Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$IntegrationStepFragmentArgs;", "n0", "Liq/c;", "l2", "()Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$IntegrationStepFragmentArgs;", "args", "o0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "p0", "Landroid/view/View;", "currentView", "q0", j6.b.f21518e, "IntegrationStepFragmentArgs", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntegrationStepFragment extends mq.c<lq.b, IntegrationView> {

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public d.a viewModelFactory;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewEnvironment;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super IntegrationWorkflow.b, Unit> currentOutputHandler;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentView;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$IntegrationStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IntegrationStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IntegrationStepFragmentArgs> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final IntegrationWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IntegrationStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegrationStepFragmentArgs(IntegrationWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepFragmentArgs[] newArray(int i10) {
                return new IntegrationStepFragmentArgs[i10];
            }
        }

        public IntegrationStepFragmentArgs(@NotNull IntegrationWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final IntegrationWorkflow.Input getProps() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.props.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, lq.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11214a = new a();

        public a() {
            super(3, lq.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        public final lq.b d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return lq.b.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ lq.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntegrationStepFragment a(@NotNull IntegrationWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (IntegrationStepFragment) iq.b.a(new IntegrationStepFragment(), new IntegrationStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$onViewCreated$1", f = "IntegrationStepFragment.kt", l = {73}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11215t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f11216u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ IntegrationStepFragment f11217v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ IntegrationStepFragment f11218a;
            public final /* synthetic */ b b;

            public a(IntegrationStepFragment integrationStepFragment, b bVar) {
                this.f11218a = integrationStepFragment;
                this.b = bVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(IntegrationWorkflow.b bVar, mt.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f22894a;
                }
                if (this.f11218a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f11218a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, IntegrationStepFragment integrationStepFragment, mt.b<? super c> bVar2) {
            super(2, bVar2);
            this.f11216u = bVar;
            this.f11217v = integrationStepFragment;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f11216u, this.f11217v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11215t;
            if (i10 == 0) {
                o.b(obj);
                c0<IntegrationWorkflow.b> a10 = this.f11216u.a();
                a aVar = new a(this.f11217v, this.f11216u);
                this.f11215t = 1;
                if (a10.collect(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Function0<Bundle> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11219a;

        public d(androidx.fragment.app.c cVar) {
            this.f11219a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle t8 = this.f11219a.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalStateException("Fragment " + this.f11219a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function0<a1.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11220a;
        public final /* synthetic */ Function1 b;

        public e(androidx.fragment.app.c cVar, Function1 function1) {
            this.f11220a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f11220a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", j6.b.f21518e, "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11221i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.c cVar) {
            super(0);
            this.f11221i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f11221i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", j6.b.f21518e, "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends kotlin.jvm.internal.m implements Function0<c1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11222i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0) {
            super(0);
            this.f11222i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f11222i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f11223i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(gt.h hVar) {
            super(0);
            this.f11223i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            c1 c10;
            c10 = l0.c(this.f11223i);
            return c10.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11224i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f11225j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, gt.h hVar) {
            super(0);
            this.f11224i = function0;
            this.f11225j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            c1 c10;
            CreationExtras creationExtras;
            Function0 function0 = this.f11224i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c10 = l0.c(this.f11225j);
            j jVar = c10 instanceof j ? (j) c10 : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22349c;
        }
    }

    public IntegrationStepFragment() {
        super(a.f11214a);
        this.viewEnvironment = gt.i.b(new Function0() { // from class: wo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewEnvironment s22;
                s22 = IntegrationStepFragment.s2(IntegrationStepFragment.this);
                return s22;
            }
        });
        e eVar = new e(this, new Function1() { // from class: wo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.withpersona.sdk2.inquiry.integration.fragment.d t22;
                t22 = IntegrationStepFragment.t2(IntegrationStepFragment.this, (android.view.l0) obj);
                return t22;
            }
        });
        gt.h a10 = gt.i.a(gt.k.f18836c, new g(new f(this)));
        this.viewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.integration.fragment.d.class), new h(a10), new i(null, a10), eVar);
        this.args = new iq.c(d0.b(IntegrationStepFragmentArgs.class), new d(this));
    }

    private final ViewEnvironment n2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment s2(IntegrationStepFragment integrationStepFragment) {
        return new ViewEnvironment(j0.g(s.a(tq.b.b, integrationStepFragment.m2())));
    }

    public static final com.withpersona.sdk2.inquiry.integration.fragment.d t2(IntegrationStepFragment integrationStepFragment, android.view.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return integrationStepFragment.p2().a(it);
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        b e10 = o2().e(l2().getProps());
        g2(e10.c());
        android.view.s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        ju.k.d(t.a(k02), null, null, new c(e10, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IntegrationStepFragmentArgs l2() {
        return (IntegrationStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final tq.a m2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.integration.fragment.d o2() {
        return (com.withpersona.sdk2.inquiry.integration.fragment.d) this.viewModel.getValue();
    }

    @NotNull
    public final d.a p2() {
        d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.c
    /* renamed from: q2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull IntegrationView rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        View view = this.currentView;
        if (view != null) {
            if (view != null) {
                e0.g(view, rendering, n2());
                return;
            }
            return;
        }
        a0<IntegrationView> a10 = rendering.a();
        ViewEnvironment n22 = n2();
        Context context = ((lq.b) b2()).getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.currentView = a10.a(rendering, n22, context, ((lq.b) b2()).getRoot());
        ((lq.b) b2()).getRoot().addView(this.currentView);
        View view2 = this.currentView;
        if (view2 != null) {
            e0.h(view2);
        }
    }

    public final void r2(@NotNull IntegrationWorkflow.Input input, @NotNull Function1<? super IntegrationWorkflow.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        o2().f(input);
        this.currentOutputHandler = handler;
    }
}
