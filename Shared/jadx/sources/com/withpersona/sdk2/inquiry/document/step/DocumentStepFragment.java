package com.withpersona.sdk2.inquiry.document.step;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.a1;
import android.view.b1;
import android.view.c1;
import android.view.s;
import android.view.t;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.document.step.d;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import e4.l0;
import gt.o;
import java.util.Map;
import ju.p0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import yq.ComponentView;
import yq.UiStepBottomSheet;
import yt.n;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002MNB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "Lmq/c;", "Lyn/e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "handler", "w2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "rendering", "x2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/document/d;", "r2", "()Lcom/withpersona/sdk2/inquiry/document/d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "initialRendering", "Lao/b;", "s2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;)Lao/b;", "Lcom/withpersona/sdk2/inquiry/document/e;", "v2", "()Lcom/withpersona/sdk2/inquiry/document/e;", "Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "j0", "Liq/c;", "n2", "()Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "k0", "Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "q2", "()Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/document/step/d$a;)V", "viewModelFactory", "Ltq/a;", "l0", "Ltq/a;", "o2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Lcom/withpersona/sdk2/inquiry/document/step/d;", "m0", "Lgt/h;", "p2", "()Lcom/withpersona/sdk2/inquiry/document/step/d;", "viewModel", "n0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "o0", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "pendingRendering", "Lyq/f;", "p0", "Lyq/f;", "currentScreenRenderer", "Lyq/p;", "q0", "Lyq/p;", "currentBottomSheet", "r0", j6.b.f21518e, "DocumentStepFragmentArgs", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DocumentStepFragment extends mq.c<yn.e, DocumentWorkflow.c> {

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public d.a viewModelFactory;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super DocumentWorkflow.b, Unit> currentOutputHandler;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DocumentWorkflow.c pendingRendering;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public yq.f<?> currentScreenRenderer;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UiStepBottomSheet currentBottomSheet;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepFragmentArgs> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DocumentWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DocumentStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepFragmentArgs(DocumentWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DocumentStepFragmentArgs[] newArray(int i10) {
                return new DocumentStepFragmentArgs[i10];
            }
        }

        public DocumentStepFragmentArgs(@NotNull DocumentWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final DocumentWorkflow.Input getProps() {
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
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements n<LayoutInflater, ViewGroup, Boolean, yn.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10432a = new a();

        public a() {
            super(3, yn.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2FragmentDocumentStepBinding;", 0);
        }

        public final yn.e d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return yn.e.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ yn.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DocumentStepFragment a(@NotNull DocumentWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (DocumentStepFragment) iq.b.a(new DocumentStepFragment(), new DocumentStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$c", "Lyq/f;", "rendering", "Ltq/a;", "systemUiController", "", ve.a.f33391e, "(Ljava/lang/Object;Ltq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements yq.f<DocumentWorkflow.c.b> {
        public final /* synthetic */ UiComponentScreen b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lq.b f10433c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f10434d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yq.g f10435e;

        public c(UiComponentScreen uiComponentScreen, lq.b bVar, n nVar, yq.g gVar) {
            this.b = uiComponentScreen;
            this.f10433c = bVar;
            this.f10434d = nVar;
            this.f10435e = gVar;
        }

        @Override // yq.f
        public void a(DocumentWorkflow.c.b rendering, tq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer i10 = this.b.i();
            if (i10 != null) {
                lq.b bVar = this.f10433c;
                int intValue = i10.intValue();
                bVar.getRoot().setBackgroundColor(intValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, intValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f10433c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable a10 = uiComponentScreen.a(context2);
            if (a10 != null) {
                lq.b bVar2 = this.f10433c;
                bVar2.getRoot().setBackground(a10);
                bVar2.f23825d.setBackgroundColor(0);
            }
            this.f10434d.invoke(this.f10433c, rendering, this.f10435e.getViewBindings().a());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$onViewCreated$1", f = "DocumentStepFragment.kt", l = {74}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10436t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f10437u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentStepFragment f10438v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DocumentStepFragment f10439a;
            public final /* synthetic */ b b;

            public a(DocumentStepFragment documentStepFragment, b bVar) {
                this.f10439a = documentStepFragment;
                this.b = bVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(DocumentWorkflow.b bVar, mt.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f22894a;
                }
                if (this.f10439a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f10439a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b bVar, DocumentStepFragment documentStepFragment, mt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f10437u = bVar;
            this.f10438v = documentStepFragment;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f10437u, this.f10438v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f10436t;
            if (i10 == 0) {
                o.b(obj);
                c0<DocumentWorkflow.b> a10 = this.f10437u.a();
                a aVar = new a(this.f10438v, this.f10437u);
                this.f10436t = 1;
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
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$e", "Lyq/f;", "rendering", "Ltq/a;", "systemUiController", "", ve.a.f33391e, "(Ljava/lang/Object;Ltq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements yq.f<com.withpersona.sdk2.inquiry.document.b> {
        public final /* synthetic */ UiComponentScreen b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lq.b f10440c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f10441d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yq.g f10442e;

        public e(UiComponentScreen uiComponentScreen, lq.b bVar, n nVar, yq.g gVar) {
            this.b = uiComponentScreen;
            this.f10440c = bVar;
            this.f10441d = nVar;
            this.f10442e = gVar;
        }

        @Override // yq.f
        public void a(com.withpersona.sdk2.inquiry.document.b rendering, tq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer i10 = this.b.i();
            if (i10 != null) {
                lq.b bVar = this.f10440c;
                int intValue = i10.intValue();
                bVar.getRoot().setBackgroundColor(intValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, intValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f10440c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable a10 = uiComponentScreen.a(context2);
            if (a10 != null) {
                lq.b bVar2 = this.f10440c;
                bVar2.getRoot().setBackground(a10);
                bVar2.f23825d.setBackgroundColor(0);
            }
            this.f10441d.invoke(this.f10440c, rendering, this.f10442e.getViewBindings().a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class f extends kotlin.jvm.internal.k implements n<lq.b, com.withpersona.sdk2.inquiry.document.b, Map<String, ? extends ComponentView>, Unit> {
        public f(Object obj) {
            super(3, obj, com.withpersona.sdk2.inquiry.document.b.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0);
        }

        public final void d(lq.b p02, com.withpersona.sdk2.inquiry.document.b p12, Map<String, ComponentView> p22) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            ((com.withpersona.sdk2.inquiry.document.b) this.receiver).h(p02, p12, p22);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ Unit invoke(lq.b bVar, com.withpersona.sdk2.inquiry.document.b bVar2, Map<String, ? extends ComponentView> map) {
            d(bVar, bVar2, map);
            return Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function0<Bundle> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f10443a;

        public g(androidx.fragment.app.c cVar) {
            this.f10443a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle t8 = this.f10443a.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalStateException("Fragment " + this.f10443a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h implements Function0<a1.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f10444a;
        public final /* synthetic */ Function1 b;

        public h(androidx.fragment.app.c cVar, Function1 function1) {
            this.f10444a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f10444a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", j6.b.f21518e, "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f10445i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.fragment.app.c cVar) {
            super(0);
            this.f10445i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f10445i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", j6.b.f21518e, "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends kotlin.jvm.internal.m implements Function0<c1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f10446i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0) {
            super(0);
            this.f10446i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f10446i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f10447i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(gt.h hVar) {
            super(0);
            this.f10447i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            c1 c10;
            c10 = l0.c(this.f10447i);
            return c10.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f10448i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f10449j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, gt.h hVar) {
            super(0);
            this.f10448i = function0;
            this.f10449j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            c1 c10;
            CreationExtras creationExtras;
            Function0 function0 = this.f10448i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c10 = l0.c(this.f10449j);
            android.view.j jVar = c10 instanceof android.view.j ? (android.view.j) c10 : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22349c;
        }
    }

    public DocumentStepFragment() {
        super(a.f10432a);
        this.args = new iq.c(d0.b(DocumentStepFragmentArgs.class), new g(this));
        h hVar = new h(this, new Function1() { // from class: ao.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.withpersona.sdk2.inquiry.document.step.d z22;
                z22 = DocumentStepFragment.z2(DocumentStepFragment.this, (android.view.l0) obj);
                return z22;
            }
        });
        gt.h a10 = gt.i.a(gt.k.f18836c, new j(new i(this)));
        this.viewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.document.step.d.class), new k(a10), new l(null, a10), hVar);
    }

    public static final Unit t2(lq.b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22894a;
    }

    public static final Unit u2(lq.b pendingBinding, DocumentWorkflow.c.b pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ao.i.d(pendingBinding, pendingRendering);
        return Unit.f22894a;
    }

    public static final Unit y2(lq.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22894a;
    }

    public static final com.withpersona.sdk2.inquiry.document.step.d z2(DocumentStepFragment documentStepFragment, android.view.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return documentStepFragment.q2().a(it, documentStepFragment.n2().getProps());
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        b stateManager = p2().getStateManager();
        g2(stateManager.c());
        s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        ju.k.d(t.a(k02), null, null, new d(stateManager, this, null), 3, null);
        DocumentWorkflow.c cVar = this.pendingRendering;
        if (cVar != null) {
            h2(cVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DocumentStepFragmentArgs n2() {
        return (DocumentStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final tq.a o2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.document.step.d p2() {
        return (com.withpersona.sdk2.inquiry.document.step.d) this.viewModel.getValue();
    }

    @NotNull
    public final d.a q2() {
        d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.document.d r2() {
        yn.a c10 = yn.a.c(LayoutInflater.from(((yn.e) b2()).f36845c.getContext()), ((yn.e) b2()).f36845c, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        ((yn.e) b2()).f36845c.removeAllViews();
        ((yn.e) b2()).f36845c.addView(c10.getRoot());
        return new com.withpersona.sdk2.inquiry.document.d(c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ao.b s2(DocumentWorkflow.c.b initialRendering) {
        yq.s sVar = yq.s.f37035a;
        FrameLayout content = ((yn.e) b2()).f36845c;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: ao.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit t22;
                t22 = DocumentStepFragment.t2((lq.b) obj, (Map) obj2);
                return t22;
            }
        };
        n nVar = new n() { // from class: ao.f
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit u22;
                u22 = DocumentStepFragment.u2((lq.b) obj, (DocumentWorkflow.c.b) obj2, (Map) obj3);
                return u22;
            }
        };
        lq.b c10 = lq.b.c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        content.removeAllViews();
        content.addView(c10.getRoot());
        return new ao.b(new c(uiScreen, c10, nVar, sVar.l(c10, uiScreen, function2, true)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.document.e v2() {
        yn.c c10 = yn.c.c(LayoutInflater.from(((yn.e) b2()).f36845c.getContext()), ((yn.e) b2()).f36845c, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        ((yn.e) b2()).f36845c.removeAllViews();
        ((yn.e) b2()).f36845c.addView(c10.getRoot());
        return new com.withpersona.sdk2.inquiry.document.e(c10);
    }

    public final void w2(@NotNull DocumentWorkflow.Input props, @NotNull Function1<? super DocumentWorkflow.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        p2().f(props);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.c
    /* renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull DocumentWorkflow.c rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (rendering instanceof com.withpersona.sdk2.inquiry.document.b) {
            yq.f<?> fVar = this.currentScreenRenderer;
            ao.a aVar = fVar instanceof ao.a ? (ao.a) fVar : null;
            if (aVar == null) {
                yq.s sVar = yq.s.f37035a;
                FrameLayout content = ((yn.e) b2()).f36845c;
                Intrinsics.checkNotNullExpressionValue(content, "content");
                UiComponentScreen uiScreen = ((com.withpersona.sdk2.inquiry.document.b) rendering).getUiScreen();
                Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: ao.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit y22;
                        y22 = DocumentStepFragment.y2((lq.b) obj, (Map) obj2);
                        return y22;
                    }
                };
                f fVar2 = new f(rendering);
                lq.b c10 = lq.b.c(LayoutInflater.from(content.getContext()), content, false);
                Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
                content.removeAllViews();
                content.addView(c10.getRoot());
                aVar = new ao.a(new e(uiScreen, c10, fVar2, sVar.l(c10, uiScreen, function2, true)));
            }
            aVar.a((com.withpersona.sdk2.inquiry.document.b) rendering, o2());
            this.currentScreenRenderer = aVar;
        } else if (rendering instanceof DocumentWorkflow.c.LoadingAnimation) {
            yq.f<?> fVar3 = this.currentScreenRenderer;
            com.withpersona.sdk2.inquiry.document.d dVar = fVar3 instanceof com.withpersona.sdk2.inquiry.document.d ? (com.withpersona.sdk2.inquiry.document.d) fVar3 : null;
            if (dVar == null) {
                dVar = r2();
            }
            dVar.a((DocumentWorkflow.c.LoadingAnimation) rendering, o2());
            this.currentScreenRenderer = dVar;
        } else if (rendering instanceof DocumentWorkflow.c.ReviewCaptures) {
            yq.f<?> fVar4 = this.currentScreenRenderer;
            com.withpersona.sdk2.inquiry.document.e eVar = fVar4 instanceof com.withpersona.sdk2.inquiry.document.e ? (com.withpersona.sdk2.inquiry.document.e) fVar4 : null;
            if (eVar == null) {
                eVar = v2();
            }
            eVar.a((DocumentWorkflow.c.ReviewCaptures) rendering, o2());
            this.currentScreenRenderer = eVar;
        } else {
            if (!(rendering instanceof DocumentWorkflow.c.b)) {
                throw new gt.l();
            }
            yq.f<?> fVar5 = this.currentScreenRenderer;
            ao.b bVar = fVar5 instanceof ao.b ? (ao.b) fVar5 : null;
            if (bVar == null) {
                bVar = s2((DocumentWorkflow.c.b) rendering);
            }
            bVar.a((DocumentWorkflow.c.b) rendering, o2());
            this.currentScreenRenderer = bVar;
        }
        UiStepBottomSheet bottomSheet = rendering.getBottomSheet();
        if (bottomSheet != null) {
            FrameLayout bottomSheet2 = ((yn.e) b2()).b;
            Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
            bottomSheet.k(bottomSheet2);
            this.currentBottomSheet = bottomSheet;
            return;
        }
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null) {
            uiStepBottomSheet.j();
        }
        this.currentBottomSheet = null;
    }
}
