package com.withpersona.sdk2.inquiry.ui.uiStep;

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
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.b;
import e4.l0;
import gt.l;
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
import pr.g1;
import ym.ViewEnvironment;
import yt.n;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0005\u001a\u0004\b*\u0010+R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u00107R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "Lmq/c;", "Lnr/a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "r2", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "handler", "q2", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "j0", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "p2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;)V", "viewModelFactory", "Ltq/a;", "k0", "Ltq/a;", "m2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Lym/y;", "l0", "Lgt/h;", "n2", "()Lym/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "m0", "Liq/c;", "l2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "n0", "o2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "viewModel", "o0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "Lcom/withpersona/sdk2/inquiry/ui/g;", "p0", "Lcom/withpersona/sdk2/inquiry/ui/g;", "runner", "q0", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "pendingRendering", "r0", j6.b.f21518e, "UiStepFragmentArgs", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiStepFragment extends mq.c<nr.a, UiWorkflow.c> {

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public b.a viewModelFactory;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewEnvironment;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super UiWorkflow.b, Unit> currentOutputHandler;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public com.withpersona.sdk2.inquiry.ui.g runner;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UiWorkflow.c pendingRendering;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UiStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepFragmentArgs> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final UiWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UiStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepFragmentArgs(UiWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepFragmentArgs[] newArray(int i10) {
                return new UiStepFragmentArgs[i10];
            }
        }

        public UiStepFragmentArgs(@NotNull UiWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final UiWorkflow.Input getProps() {
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
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, nr.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14067a = new a();

        public a() {
            super(3, nr.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;", 0);
        }

        public final nr.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return nr.a.d(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ nr.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UiStepFragment a(@NotNull UiWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (UiStepFragment) iq.b.a(new UiStepFragment(), new UiStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$onViewCreated$1", f = "UiStepFragment.kt", l = {72}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f14068t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ g1 f14069u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiStepFragment f14070v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UiStepFragment f14071a;
            public final /* synthetic */ g1 b;

            public a(UiStepFragment uiStepFragment, g1 g1Var) {
                this.f14071a = uiStepFragment;
                this.b = g1Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(UiWorkflow.b bVar, mt.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f22894a;
                }
                if (this.f14071a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f14071a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g1 g1Var, UiStepFragment uiStepFragment, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f14069u = g1Var;
            this.f14070v = uiStepFragment;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f14069u, this.f14070v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f14068t;
            if (i10 == 0) {
                o.b(obj);
                c0<UiWorkflow.b> a10 = this.f14069u.a();
                a aVar = new a(this.f14070v, this.f14069u);
                this.f14068t = 1;
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
        public final /* synthetic */ androidx.fragment.app.c f14072a;

        public d(androidx.fragment.app.c cVar) {
            this.f14072a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle t8 = this.f14072a.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalStateException("Fragment " + this.f14072a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function0<a1.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f14073a;
        public final /* synthetic */ Function1 b;

        public e(androidx.fragment.app.c cVar, Function1 function1) {
            this.f14073a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f14073a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", j6.b.f21518e, "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f14074i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.c cVar) {
            super(0);
            this.f14074i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f14074i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", j6.b.f21518e, "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends kotlin.jvm.internal.m implements Function0<c1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f14075i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0) {
            super(0);
            this.f14075i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f14075i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f14076i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(gt.h hVar) {
            super(0);
            this.f14076i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            c1 c10;
            c10 = l0.c(this.f14076i);
            return c10.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f14077i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f14078j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, gt.h hVar) {
            super(0);
            this.f14077i = function0;
            this.f14078j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            c1 c10;
            CreationExtras creationExtras;
            Function0 function0 = this.f14077i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c10 = l0.c(this.f14078j);
            j jVar = c10 instanceof j ? (j) c10 : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22349c;
        }
    }

    public UiStepFragment() {
        super(a.f14067a);
        this.viewEnvironment = gt.i.b(new Function0() { // from class: qr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewEnvironment s22;
                s22 = UiStepFragment.s2(UiStepFragment.this);
                return s22;
            }
        });
        this.args = new iq.c(d0.b(UiStepFragmentArgs.class), new d(this));
        e eVar = new e(this, new Function1() { // from class: qr.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.withpersona.sdk2.inquiry.ui.uiStep.b t22;
                t22 = UiStepFragment.t2(UiStepFragment.this, (android.view.l0) obj);
                return t22;
            }
        });
        gt.h a10 = gt.i.a(gt.k.f18836c, new g(new f(this)));
        this.viewModel = l0.b(this, d0.b(b.class), new h(a10), new i(null, a10), eVar);
    }

    private final ViewEnvironment n2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment s2(UiStepFragment uiStepFragment) {
        return new ViewEnvironment(j0.g(s.a(tq.b.b, uiStepFragment.m2())));
    }

    public static final b t2(UiStepFragment uiStepFragment, android.view.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return uiStepFragment.p2().a(it, uiStepFragment.l2().getProps());
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        g1 uiStepStateManager = o2().getUiStepStateManager();
        g2(uiStepStateManager.c());
        android.view.s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        ju.k.d(t.a(k02), null, null, new c(uiStepStateManager, this, null), 3, null);
        UiWorkflow.c cVar = this.pendingRendering;
        if (cVar != null) {
            h2(cVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UiStepFragmentArgs l2() {
        return (UiStepFragmentArgs) this.args.getValue();
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

    public final b o2() {
        return (b) this.viewModel.getValue();
    }

    @NotNull
    public final b.a p2() {
        b.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    public final void q2(@NotNull UiWorkflow.Input input, @NotNull Function1<? super UiWorkflow.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        o2().f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.c
    /* renamed from: r2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull UiWorkflow.c rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (!(rendering instanceof UiWorkflow.c.a)) {
            throw new l();
        }
        com.withpersona.sdk2.inquiry.ui.g gVar = this.runner;
        if (gVar == null) {
            gVar = new com.withpersona.sdk2.inquiry.ui.g((nr.a) b2(), (UiWorkflow.c.a) rendering);
            this.runner = gVar;
        }
        gVar.b((UiWorkflow.c.a) rendering, n2());
    }
}
