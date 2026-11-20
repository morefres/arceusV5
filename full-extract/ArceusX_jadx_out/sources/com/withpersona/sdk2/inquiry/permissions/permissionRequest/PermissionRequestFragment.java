package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

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
import android.view.s;
import android.view.t;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.c;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import e.m0;
import e4.l0;
import e4.u;
import gt.l;
import gt.o;
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
import kotlin.jvm.internal.k;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import pp.CheckRequestPermissionRationaleStateView;
import pp.i0;
import pp.j1;
import pp.n1;
import yt.n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003%&'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;", "Lmq/c;", "Lqp/b;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "o2", "(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;)V", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;", "j0", "Liq/c;", "l2", "()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;", "k0", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;", "n2", "()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;", "l0", "Lgt/h;", "m2", "()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;", "viewModel", "m0", j6.b.f21518e, "PermissionRequestFragmentArgs", "PermissionRequestFragmentResult", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionRequestFragment extends mq.c<qp.b, PermissionRequestStateManager.d> {

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public c.a viewModelFactory;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;", "Landroid/os/Parcelable;", "", "requestId", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Ljava/lang/String;", "f", "()Ljava/lang/String;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PermissionRequestFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PermissionRequestFragmentArgs> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String requestId;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final PermissionRequestWorkflow.Props props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PermissionRequestFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionRequestFragmentArgs(parcel.readString(), PermissionRequestWorkflow.Props.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentArgs[] newArray(int i10) {
                return new PermissionRequestFragmentArgs[i10];
            }
        }

        public PermissionRequestFragmentArgs(@NotNull String requestId, @NotNull PermissionRequestWorkflow.Props props) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(props, "props");
            this.requestId = requestId;
            this.props = props;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final PermissionRequestWorkflow.Props getProps() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* renamed from: f, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestId);
            this.props.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;", "Landroid/os/Parcelable;", "", "requestId", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Ljava/lang/String;", "f", "()Ljava/lang/String;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PermissionRequestFragmentResult implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PermissionRequestFragmentResult> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String requestId;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final PermissionState permissionState;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PermissionRequestFragmentResult> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionRequestFragmentResult(parcel.readString(), PermissionState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentResult[] newArray(int i10) {
                return new PermissionRequestFragmentResult[i10];
            }
        }

        public PermissionRequestFragmentResult(@NotNull String requestId, @NotNull PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.requestId = requestId;
            this.permissionState = permissionState;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* renamed from: f, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestId);
            this.permissionState.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, qp.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12386a = new a();

        public a() {
            super(3, qp.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2FragmentPermissionRequestBinding;", 0);
        }

        public final qp.b d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return qp.b.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ qp.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$b;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "viewId", "", "requestId", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "", ve.a.f33391e, "(Landroidx/fragment/app/FragmentManager;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull FragmentManager fragmentManager, int viewId, @NotNull String requestId, @NotNull PermissionRequestWorkflow.Props props) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(props, "props");
            androidx.fragment.app.h r8 = fragmentManager.r();
            r8.b(viewId, iq.b.a(new PermissionRequestFragment(), new PermissionRequestFragmentArgs(requestId, props)), "Pi2PermissionRequestFragment");
            r8.i();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c", "Le/m0;", "", "handleOnBackPressed", "()V", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends m0 {
        public final /* synthetic */ PermissionRequestStateManager X;
        public final /* synthetic */ PermissionRequestFragment Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestFragment permissionRequestFragment) {
            super(true);
            this.X = permissionRequestStateManager;
            this.Y = permissionRequestFragment;
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            this.X.a().setValue(new PermissionRequestWorkflow.Output(new PermissionState(this.Y.l2().getProps().getPermission(), j1.b)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$onViewCreated$2", f = "PermissionRequestFragment.kt", l = {96}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12387t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestStateManager f12388u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestFragment f12389v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PermissionRequestStateManager f12390a;
            public final /* synthetic */ PermissionRequestFragment b;

            public a(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestFragment permissionRequestFragment) {
                this.f12390a = permissionRequestStateManager;
                this.b = permissionRequestFragment;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(PermissionRequestWorkflow.Output output, mt.b<? super Unit> bVar) {
                if (output == null) {
                    return Unit.f22894a;
                }
                this.f12390a.a().setValue(null);
                PermissionRequestFragment permissionRequestFragment = this.b;
                Bundle bundle = new Bundle();
                bundle.putParcelable("pi2_result", new PermissionRequestFragmentResult(this.b.l2().getRequestId(), output.getPermissionState()));
                Unit unit = Unit.f22894a;
                u.a(permissionRequestFragment, "pi2_permission_request_request", bundle);
                FragmentManager L = this.b.L();
                Intrinsics.checkNotNullExpressionValue(L, "getParentFragmentManager(...)");
                PermissionRequestFragment permissionRequestFragment2 = this.b;
                androidx.fragment.app.h r8 = L.r();
                r8.m(permissionRequestFragment2);
                r8.g();
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestFragment permissionRequestFragment, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f12388u = permissionRequestStateManager;
            this.f12389v = permissionRequestFragment;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f12388u, this.f12389v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f12387t;
            if (i10 == 0) {
                o.b(obj);
                c0<PermissionRequestWorkflow.Output> a10 = this.f12388u.a();
                a aVar = new a(this.f12388u, this.f12389v);
                this.f12387t = 1;
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function0<Bundle> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f12391a;

        public e(androidx.fragment.app.c cVar) {
            this.f12391a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle t8 = this.f12391a.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalStateException("Fragment " + this.f12391a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f implements Function0<a1.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f12392a;
        public final /* synthetic */ Function1 b;

        public f(androidx.fragment.app.c cVar, Function1 function1) {
            this.f12392a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f12392a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", j6.b.f21518e, "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f12393i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.c cVar) {
            super(0);
            this.f12393i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f12393i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", j6.b.f21518e, "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends kotlin.jvm.internal.m implements Function0<c1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f12394i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(0);
            this.f12394i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f12394i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f12395i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(gt.h hVar) {
            super(0);
            this.f12395i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            c1 c10;
            c10 = l0.c(this.f12395i);
            return c10.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f12396i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f12397j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, gt.h hVar) {
            super(0);
            this.f12396i = function0;
            this.f12397j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            c1 c10;
            CreationExtras creationExtras;
            Function0 function0 = this.f12396i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c10 = l0.c(this.f12397j);
            android.view.j jVar = c10 instanceof android.view.j ? (android.view.j) c10 : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22349c;
        }
    }

    public PermissionRequestFragment() {
        super(a.f12386a);
        this.args = new iq.c(d0.b(PermissionRequestFragmentArgs.class), new e(this));
        f fVar = new f(this, new Function1() { // from class: rp.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.c q22;
                q22 = PermissionRequestFragment.q2(PermissionRequestFragment.this, (android.view.l0) obj);
                return q22;
            }
        });
        gt.h a10 = gt.i.a(gt.k.f18836c, new h(new g(this)));
        this.viewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.permissions.permissionRequest.c.class), new i(a10), new j(null, a10), fVar);
    }

    public static final void p2(FrameLayout frameLayout, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView, j.b bVar) {
        if (frameLayout.isAttachedToWindow()) {
            if (checkRequestPermissionRationaleStateView.getPermission() != i0.b || checkRequestPermissionRationaleStateView.getIsPermanentPermissionRejectionCheck()) {
                checkRequestPermissionRationaleStateView.a().invoke(Boolean.valueOf(k2.b.v(bVar, n1.c(checkRequestPermissionRationaleStateView.getPermission()))));
            } else {
                checkRequestPermissionRationaleStateView.a().invoke(Boolean.TRUE);
            }
        }
    }

    public static final com.withpersona.sdk2.inquiry.permissions.permissionRequest.c q2(PermissionRequestFragment permissionRequestFragment, android.view.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return permissionRequestFragment.n2().a(it);
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        PermissionRequestStateManager e10 = m2().e(l2().getProps());
        e.p0 P = H1().P();
        s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        P.d(k02, new c(e10, this));
        g2(e10.c());
        s k03 = k0();
        Intrinsics.checkNotNullExpressionValue(k03, "getViewLifecycleOwner(...)");
        ju.k.d(t.a(k03), null, null, new d(e10, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PermissionRequestFragmentArgs l2() {
        return (PermissionRequestFragmentArgs) this.args.getValue();
    }

    public final com.withpersona.sdk2.inquiry.permissions.permissionRequest.c m2() {
        return (com.withpersona.sdk2.inquiry.permissions.permissionRequest.c) this.viewModel.getValue();
    }

    @NotNull
    public final c.a n2() {
        c.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.c
    /* renamed from: o2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull PermissionRequestStateManager.d rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        final FrameLayout content = ((qp.b) b2()).b;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        content.removeAllViews();
        if (rendering instanceof PermissionRequestStateManager.d.a) {
            PermissionRequestStateManager.d.a aVar = (PermissionRequestStateManager.d.a) rendering;
            aVar.getView();
            qp.c c10 = qp.c.c(LayoutInflater.from(w()), content, true);
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
            aVar.getView().i(c10);
            aVar.getView().n(c10, aVar.getView());
            return;
        }
        if (!(rendering instanceof PermissionRequestStateManager.d.b)) {
            throw new l();
        }
        final CheckRequestPermissionRationaleStateView view = ((PermissionRequestStateManager.d.b) rendering).getView();
        Context context = content.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final j.b h10 = hq.g.h(context);
        if (view.a() != null) {
            content.post(new Runnable() { // from class: rp.b
                @Override // java.lang.Runnable
                public final void run() {
                    PermissionRequestFragment.p2(content, view, h10);
                }
            });
        }
    }
}
