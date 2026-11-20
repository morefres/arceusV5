package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.a1;
import android.view.b1;
import android.view.c1;
import android.view.t;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dn.x;
import e4.l0;
import go.n2;
import gt.s;
import ho.b0;
import ho.c0;
import ho.y;
import hq.i0;
import io.u;
import io.w;
import java.io.File;
import java.util.Map;
import ju.p0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ro.k;
import ro.q;
import un.a;
import ym.ViewEnvironment;
import yq.ComponentView;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0093\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0094\u0001\u0095\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\b\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b0\u00101J)\u00107\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000604¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0005R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010X\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR!\u0010w\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010\u0005\u001a\u0004\bt\u0010uR\u001b\u0010|\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010s\u001a\u0004\bz\u0010{R$\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "Lmq/c;", "Llo/e;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "<init>", "()V", "", "F2", "rendering", "Lkotlin/Function0;", "bind", "G2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "newView", "Luq/l;", "transition", "Q2", "(Landroid/view/View;Luq/l;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;", "Landroid/content/Context;", "context", "C2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "y2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "E2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;", "z2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Lkotlin/Pair;", "Lio/u;", "w2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lro/q;", "D2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Pair;", "view", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "S2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "handler", "R2", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "M0", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "j0", "Liq/c;", "H2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "k0", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "P2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/camera/b;", "l0", "Lcom/withpersona/sdk2/camera/b;", "I2", "()Lcom/withpersona/sdk2/camera/b;", "setCameraPreview", "(Lcom/withpersona/sdk2/camera/b;)V", "cameraPreview", "Lat/a;", "Ldn/x;", "m0", "Lat/a;", "K2", "()Lat/a;", "setGovernmentIdFeed", "(Lat/a;)V", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "n0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "M2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Leo/e;", "o0", "Leo/e;", "J2", "()Leo/e;", "setFeatureFlagManager", "(Leo/e;)V", "featureFlagManager", "Ltq/a;", "p0", "Ltq/a;", "L2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Lym/y;", "q0", "Lgt/h;", "N2", "()Lym/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "r0", "O2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "viewModel", "s0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "", "t0", "Ljava/lang/Object;", "currentRunner", "u0", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "currentScreen", "v0", "pendingRendering", "w0", "Lio/u;", "retainedCameraRunner", "x0", "Landroid/view/View;", "retainedCameraView", "Ldn/g;", "y0", "Ldn/g;", "cameraController", "z0", j6.b.f21518e, "GovernmentIdStepFragmentArgs", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GovernmentIdStepFragment extends mq.c<lo.e, Screen> {

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public d.a viewModelFactory;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.camera.b cameraPreview;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public at.a<x> governmentIdFeed;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public eo.e featureFlagManager;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewEnvironment;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GovernmentIdWorkflow.a, Unit> currentOutputHandler;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object currentRunner;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Screen currentScreen;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Screen pendingRendering;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public u retainedCameraRunner;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View retainedCameraView;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public dn.g cameraController;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GovernmentIdStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepFragmentArgs> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final GovernmentIdWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepFragmentArgs(GovernmentIdWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepFragmentArgs[] newArray(int i10) {
                return new GovernmentIdStepFragmentArgs[i10];
            }
        }

        public GovernmentIdStepFragmentArgs(@NotNull GovernmentIdWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final GovernmentIdWorkflow.Input getProps() {
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
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, lo.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11050a = new a();

        public a() {
            super(3, lo.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidFragmentBinding;", 0);
        }

        public final lo.e d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return lo.e.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ lo.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GovernmentIdStepFragment a(@NotNull GovernmentIdWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (GovernmentIdStepFragment) iq.b.a(new GovernmentIdStepFragment(), new GovernmentIdStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11051a;

        static {
            int[] iArr = new int[go.d.values().length];
            try {
                iArr[go.d.f18578a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[go.d.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11051a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$d", "Lyq/f;", "rendering", "Ltq/a;", "systemUiController", "", ve.a.f33391e, "(Ljava/lang/Object;Ltq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements yq.f<Screen.f> {
        public final /* synthetic */ UiComponentScreen b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lq.b f11052c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ yt.n f11053d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yq.g f11054e;

        public d(UiComponentScreen uiComponentScreen, lq.b bVar, yt.n nVar, yq.g gVar) {
            this.b = uiComponentScreen;
            this.f11052c = bVar;
            this.f11053d = nVar;
            this.f11054e = gVar;
        }

        @Override // yq.f
        public void a(Screen.f rendering, tq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer i10 = this.b.i();
            if (i10 != null) {
                lq.b bVar = this.f11052c;
                int intValue = i10.intValue();
                bVar.getRoot().setBackgroundColor(intValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, intValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f11052c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable a10 = uiComponentScreen.a(context2);
            if (a10 != null) {
                lq.b bVar2 = this.f11052c;
                bVar2.getRoot().setBackground(a10);
                bVar2.f23825d.setBackgroundColor(0);
            }
            this.f11053d.invoke(this.f11052c, rendering, this.f11054e.getViewBindings().a());
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$e", "Lro/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lro/k;", ve.a.f33391e, "(Landroid/content/Context;Landroid/view/ViewGroup;)Lro/k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements k.a {
        @Override // ro.k.a
        public ro.k a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ro.j(context, container);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$finalizeVideoCaptureThenBind$1", f = "GovernmentIdStepFragment.kt", l = {343}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11055t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ dn.g f11056u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11057v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdStepFragment f11058w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Screen f11059x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dn.g gVar, Function0<Unit> function0, GovernmentIdStepFragment governmentIdStepFragment, Screen screen, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f11056u = gVar;
            this.f11057v = function0;
            this.f11058w = governmentIdStepFragment;
            this.f11059x = screen;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f11056u, this.f11057v, this.f11058w, this.f11059x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object k10;
            Object e10 = nt.c.e();
            int i10 = this.f11055t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = this.f11056u;
                if (gVar != null) {
                    this.f11055t = 1;
                    k10 = gVar.k(this);
                    if (k10 == e10) {
                        return e10;
                    }
                }
                this.f11057v.invoke();
                this.f11058w.F2();
                this.f11058w.currentScreen = this.f11059x;
                return Unit.f22894a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            k10 = ((gt.n) obj).getValue();
            GovernmentIdStepFragment governmentIdStepFragment = this.f11058w;
            dn.g gVar2 = this.f11056u;
            if (gt.n.h(k10)) {
                governmentIdStepFragment.O2().getGovernmentIdStepStateManager().f0((File) k10, gVar2.a());
            }
            gt.n.a(k10);
            this.f11057v.invoke();
            this.f11058w.F2();
            this.f11058w.currentScreen = this.f11059x;
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$onViewCreated$1", f = "GovernmentIdStepFragment.kt", l = {144}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11060t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f11061u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdStepFragment f11062v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GovernmentIdStepFragment f11063a;
            public final /* synthetic */ b b;

            public a(GovernmentIdStepFragment governmentIdStepFragment, b bVar) {
                this.f11063a = governmentIdStepFragment;
                this.b = bVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(GovernmentIdWorkflow.a aVar, mt.b<? super Unit> bVar) {
                if (aVar == null) {
                    return Unit.f22894a;
                }
                if (this.f11063a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f11063a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(aVar);
                    }
                }
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, GovernmentIdStepFragment governmentIdStepFragment, mt.b<? super g> bVar2) {
            super(2, bVar2);
            this.f11061u = bVar;
            this.f11062v = governmentIdStepFragment;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new g(this.f11061u, this.f11062v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11060t;
            if (i10 == 0) {
                gt.o.b(obj);
                c0<GovernmentIdWorkflow.a> a10 = this.f11061u.a();
                a aVar = new a(this.f11062v, this.f11061u);
                this.f11060t = 1;
                if (a10.collect(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$16", f = "GovernmentIdStepFragment.kt", l = {313, 314}, m = "invokeSuspend")
    public static final class h extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11064t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen f11066v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f11067w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Screen screen, Context context, mt.b<? super h> bVar) {
            super(2, bVar);
            this.f11066v = screen;
            this.f11067w = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return GovernmentIdStepFragment.this.new h(this.f11066v, this.f11067w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r5.b(r1, r4) != r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r4.f11064t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r5)
                goto L51
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                gt.o.b(r5)
                gt.n r5 = (gt.n) r5
                java.lang.Object r5 = r5.getValue()
                goto L38
            L24:
                gt.o.b(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                dn.g r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.s2(r5)
                if (r5 == 0) goto L3b
                r4.f11064t = r3
                java.lang.Object r5 = r5.k(r4)
                if (r5 != r0) goto L38
                goto L50
            L38:
                gt.n.a(r5)
            L3b:
                dn.j r5 = dn.j.f15081a
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r1 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                android.content.Context r1 = r1.I1()
                java.lang.String r3 = "requireContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                r4.f11064t = r2
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L51
            L50:
                return r0
            L51:
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11066v
                com.withpersona.sdk2.inquiry.governmentid.Screen$g r0 = (com.withpersona.sdk2.inquiry.governmentid.Screen.g) r0
                android.content.Context r1 = r4.f11067w
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.q2(r5, r0, r1)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.r2(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11066v
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.v2(r5, r0)
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$9", f = "GovernmentIdStepFragment.kt", l = {252, 253}, m = "invokeSuspend")
    public static final class i extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11068t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen f11070v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f11071w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Screen screen, Context context, mt.b<? super i> bVar) {
            super(2, bVar);
            this.f11070v = screen;
            this.f11071w = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return GovernmentIdStepFragment.this.new i(this.f11070v, this.f11071w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r5.b(r1, r4) != r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r4.f11068t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r5)
                goto L51
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                gt.o.b(r5)
                gt.n r5 = (gt.n) r5
                java.lang.Object r5 = r5.getValue()
                goto L38
            L24:
                gt.o.b(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                dn.g r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.s2(r5)
                if (r5 == 0) goto L3b
                r4.f11068t = r3
                java.lang.Object r5 = r5.k(r4)
                if (r5 != r0) goto L38
                goto L50
            L38:
                gt.n.a(r5)
            L3b:
                dn.j r5 = dn.j.f15081a
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r1 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                android.content.Context r1 = r1.I1()
                java.lang.String r3 = "requireContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                r4.f11068t = r2
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L51
            L50:
                return r0
            L51:
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11070v
                com.withpersona.sdk2.inquiry.governmentid.Screen$d r0 = (com.withpersona.sdk2.inquiry.governmentid.Screen.d) r0
                android.content.Context r1 = r4.f11071w
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.p2(r5, r0, r1)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.r2(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11070v
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.v2(r5, r0)
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$j", "Lho/c0$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lho/c0;", ve.a.f33391e, "(Landroid/content/Context;Landroid/view/ViewGroup;)Lho/c0;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements c0.a {
        @Override // ho.c0.a
        public ho.c0 a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new y(context, container);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k implements Function0<Bundle> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11072a;

        public k(androidx.fragment.app.c cVar) {
            this.f11072a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle t8 = this.f11072a.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalStateException("Fragment " + this.f11072a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class l implements Function0<a1.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11073a;
        public final /* synthetic */ Function1 b;

        public l(androidx.fragment.app.c cVar, Function1 function1) {
            this.f11073a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f11073a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", j6.b.f21518e, "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class m extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11074i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(androidx.fragment.app.c cVar) {
            super(0);
            this.f11074i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f11074i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", j6.b.f21518e, "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class n extends kotlin.jvm.internal.m implements Function0<c1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11075i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0) {
            super(0);
            this.f11075i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f11075i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class o extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f11076i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(gt.h hVar) {
            super(0);
            this.f11076i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            c1 c10;
            c10 = l0.c(this.f11076i);
            return c10.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class p extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11077i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f11078j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function0 function0, gt.h hVar) {
            super(0);
            this.f11077i = function0;
            this.f11078j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            c1 c10;
            CreationExtras creationExtras;
            Function0 function0 = this.f11077i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c10 = l0.c(this.f11078j);
            android.view.j jVar = c10 instanceof android.view.j ? (android.view.j) c10 : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22349c;
        }
    }

    public GovernmentIdStepFragment() {
        super(a.f11050a);
        this.args = new iq.c(d0.b(GovernmentIdStepFragmentArgs.class), new k(this));
        this.viewEnvironment = gt.i.b(new Function0() { // from class: oo.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewEnvironment V2;
                V2 = GovernmentIdStepFragment.V2(GovernmentIdStepFragment.this);
                return V2;
            }
        });
        l lVar = new l(this, new Function1() { // from class: oo.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d W2;
                W2 = GovernmentIdStepFragment.W2(GovernmentIdStepFragment.this, (android.view.l0) obj);
                return W2;
            }
        });
        gt.h a10 = gt.i.a(gt.k.f18836c, new n(new m(this)));
        this.viewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d.class), new o(a10), new p(null, a10), lVar);
    }

    public static final Unit A2(lq.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22894a;
    }

    public static final Unit B2(lq.b binding, Screen.f pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        oo.o.d(binding, pendingRendering);
        return Unit.f22894a;
    }

    public static final Unit T2(GovernmentIdStepFragment governmentIdStepFragment, Screen screen, Context context) {
        governmentIdStepFragment.E2((Screen.j) screen, context);
        return Unit.f22894a;
    }

    public static final Unit U2(GovernmentIdStepFragment governmentIdStepFragment, Screen screen, Context context) {
        governmentIdStepFragment.z2((Screen.f) screen, context);
        return Unit.f22894a;
    }

    public static final ViewEnvironment V2(GovernmentIdStepFragment governmentIdStepFragment) {
        return new ViewEnvironment(j0.g(s.a(tq.b.b, governmentIdStepFragment.L2())));
    }

    public static final com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d W2(GovernmentIdStepFragment governmentIdStepFragment, android.view.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return governmentIdStepFragment.P2().a(it, governmentIdStepFragment.H2().getProps());
    }

    public static final w x2(x governmentIdFeed, com.withpersona.sdk2.camera.b cameraPreview, eo.e featureFlagManager, Screen.b initialRendering, Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(context, "context");
        return new io.m(governmentIdFeed, cameraPreview, featureFlagManager, initialRendering, context, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C2(Screen.g rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof qo.k)) {
            obj = null;
        }
        Object obj2 = (qo.k) obj;
        if (obj2 == null) {
            lo.h c10 = lo.h.c(LayoutInflater.from(context), ((lo.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
            Pair pair = new Pair(new qo.k(c10), c10.getRoot());
            Object a10 = pair.a();
            view = (View) pair.b();
            obj2 = a10;
        }
        uq.l transition = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((qo.k) obj2).b(rendering, N2());
        this.currentRunner = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<q, View> D2(Screen.h rendering) {
        un.d dVar;
        Context context = ((lo.e) b2()).b.getContext();
        a.C0601a c10 = un.a.f33038a.c(k.a.class, new e());
        int i10 = c.f11051a[rendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = un.d.f33041c;
        } else {
            if (i10 != 2) {
                throw new gt.l();
            }
            dVar = un.d.f33046h;
        }
        k.a aVar = (k.a) c10.a(dVar);
        Intrinsics.checkNotNull(context);
        ro.k a10 = aVar.a(context, ((lo.e) b2()).b);
        return new Pair<>(new q(a10), a10.getRoot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E2(Screen.j rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof com.withpersona.sdk2.inquiry.governmentid.m)) {
            obj = null;
        }
        Object obj2 = (com.withpersona.sdk2.inquiry.governmentid.m) obj;
        if (obj2 == null) {
            lo.m c10 = lo.m.c(LayoutInflater.from(context), ((lo.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
            Pair pair = new Pair(new com.withpersona.sdk2.inquiry.governmentid.m(c10), c10.getRoot());
            Object a10 = pair.a();
            view = (View) pair.b();
            obj2 = a10;
        }
        uq.l transition = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((com.withpersona.sdk2.inquiry.governmentid.m) obj2).b(rendering, N2());
        this.currentRunner = obj2;
    }

    public final void F2() {
        View view = this.retainedCameraView;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.retainedCameraRunner = null;
        this.retainedCameraView = null;
        this.cameraController = null;
    }

    public final void G2(Screen rendering, Function0<Unit> bind) {
        dn.g gVar = this.cameraController;
        android.view.s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        ju.k.d(t.a(k02), null, null, new f(gVar, bind, this, rendering, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GovernmentIdStepFragmentArgs H2() {
        return (GovernmentIdStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.camera.b I2() {
        com.withpersona.sdk2.camera.b bVar = this.cameraPreview;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.u("cameraPreview");
        return null;
    }

    @NotNull
    public final eo.e J2() {
        eo.e eVar = this.featureFlagManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.u("featureFlagManager");
        return null;
    }

    @NotNull
    public final at.a<x> K2() {
        at.a<x> aVar = this.governmentIdFeed;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("governmentIdFeed");
        return null;
    }

    @NotNull
    public final tq.a L2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @Override // iq.a, androidx.fragment.app.c
    public void M0() {
        F2();
        super.M0();
    }

    @NotNull
    public final TrackingEventsLogger M2() {
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        if (trackingEventsLogger != null) {
            return trackingEventsLogger;
        }
        Intrinsics.u("trackingEventsLogger");
        return null;
    }

    public final ViewEnvironment N2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public final com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d O2() {
        return (com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d) this.viewModel.getValue();
    }

    @NotNull
    public final d.a P2() {
        d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q2(View newView, uq.l transition) {
        Object tag = ((lo.e) b2()).b.getTag(n2.f18695l0);
        View view = tag instanceof View ? (View) tag : null;
        if (this.currentScreen == null) {
            transition = uq.l.f33107c;
        }
        if (view != null) {
            FrameLayout content = ((lo.e) b2()).b;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            i0.a(content, view, newView, transition);
        } else {
            ((lo.e) b2()).b.addView(newView);
        }
        ((lo.e) b2()).b.setTag(n2.f18695l0, newView);
    }

    public final void R2(@NotNull GovernmentIdWorkflow.Input input, @NotNull Function1<? super GovernmentIdWorkflow.a, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        O2().f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.c
    /* renamed from: S2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull final Screen rendering) {
        un.d dVar;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        final Context I1 = I1();
        Intrinsics.checkNotNullExpressionValue(I1, "requireContext(...)");
        if (rendering instanceof Screen.e) {
            Object obj = this.currentRunner;
            if (!(obj instanceof com.withpersona.sdk2.inquiry.governmentid.i)) {
                obj = null;
            }
            Object obj2 = (com.withpersona.sdk2.inquiry.governmentid.i) obj;
            if (obj2 == null) {
                lo.g c10 = lo.g.c(LayoutInflater.from(I1), ((lo.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
                Pair pair = new Pair(new com.withpersona.sdk2.inquiry.governmentid.i(c10), c10.getRoot());
                Object a10 = pair.a();
                r4 = (View) pair.b();
                obj2 = a10;
            }
            uq.l transition = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
            if (r4 != null) {
                Q2(r4, transition);
            }
            ((com.withpersona.sdk2.inquiry.governmentid.i) obj2).b((Screen.e) rendering, N2());
            this.currentRunner = obj2;
        } else if (rendering instanceof Screen.a) {
            a.C0601a c11 = un.a.f33038a.c(c0.a.class, new j());
            Screen.a aVar = (Screen.a) rendering;
            int i10 = c.f11051a[aVar.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = un.d.f33042d;
            } else {
                if (i10 != 2) {
                    throw new gt.l();
                }
                dVar = un.d.f33047i;
            }
            ho.c0 a11 = ((c0.a) c11.a(dVar)).a(I1, ((lo.e) b2()).b);
            Object obj3 = this.currentRunner;
            if (!(obj3 instanceof b0)) {
                obj3 = null;
            }
            Object obj4 = (b0) obj3;
            if (obj4 == null) {
                Pair pair2 = new Pair(new b0(a11), a11.getRoot());
                Object a12 = pair2.a();
                r4 = (View) pair2.b();
                obj4 = a12;
            }
            uq.l transition2 = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
            if (r4 != null) {
                Q2(r4, transition2);
            }
            ((b0) obj4).b(aVar, N2());
            this.currentRunner = obj4;
        } else if (rendering instanceof Screen.b) {
            if ((this.currentScreen instanceof Screen.h) && (this.currentRunner instanceof q)) {
                Object tag = ((lo.e) b2()).b.getTag(n2.f18695l0);
                View view = tag instanceof View ? (View) tag : null;
                if (view != null) {
                    ((lo.e) b2()).b.removeView(view);
                }
            }
            View view2 = this.retainedCameraView;
            if (view2 != null) {
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ((lo.e) b2()).b.setTag(n2.f18695l0, this.retainedCameraView);
                u uVar = this.retainedCameraRunner;
                if (uVar != null) {
                    uVar.b((Screen.b) rendering, N2());
                }
                this.currentRunner = this.retainedCameraRunner;
            } else {
                Object obj5 = this.currentRunner;
                if (!(obj5 instanceof u)) {
                    obj5 = null;
                }
                u uVar2 = (u) obj5;
                if (uVar2 == null) {
                    Pair<u, View> w22 = w2((Screen.b) rendering);
                    u a13 = w22.a();
                    r4 = w22.b();
                    uVar2 = a13;
                }
                uq.l transition3 = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
                if (r4 != null) {
                    Q2(r4, transition3);
                }
                uVar2.b((Screen.b) rendering, N2());
                this.currentRunner = uVar2;
            }
        } else if (rendering instanceof Screen.c) {
            Object obj6 = this.currentRunner;
            if (!(obj6 instanceof qo.e)) {
                obj6 = null;
            }
            Object obj7 = (qo.e) obj6;
            if (obj7 == null) {
                lo.d c12 = lo.d.c(LayoutInflater.from(I1), ((lo.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(c12, "inflate(...)");
                Pair pair3 = new Pair(new qo.e(c12), c12.getRoot());
                Object a14 = pair3.a();
                r4 = (View) pair3.b();
                obj7 = a14;
            }
            uq.l transition4 = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
            if (r4 != null) {
                Q2(r4, transition4);
            }
            ((qo.e) obj7).b((Screen.c) rendering, N2());
            this.currentRunner = obj7;
        } else if (rendering instanceof Screen.d) {
            Screen.d dVar2 = (Screen.d) rendering;
            if (dVar2.getVideoCaptureEnabled() && this.cameraController != null) {
                android.view.s k02 = k0();
                Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
                ju.k.d(t.a(k02), null, null, new i(rendering, I1, null), 3, null);
                return;
            }
            y2(dVar2, I1);
        } else if (rendering instanceof Screen.h) {
            Screen.h hVar = (Screen.h) rendering;
            if (hVar.getKeepCameraAlive()) {
                Object obj8 = this.currentRunner;
                if ((obj8 instanceof u) && (this.currentScreen instanceof Screen.b)) {
                    Intrinsics.d(obj8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner");
                    this.retainedCameraRunner = (u) obj8;
                    Object tag2 = ((lo.e) b2()).b.getTag(n2.f18695l0);
                    r4 = tag2 instanceof View ? (View) tag2 : null;
                    this.retainedCameraView = r4;
                    if (r4 != null) {
                        r4.setVisibility(4);
                    }
                    Pair<q, View> D2 = D2(hVar);
                    q a15 = D2.a();
                    View b = D2.b();
                    ((lo.e) b2()).b.addView(b);
                    ((lo.e) b2()).b.setTag(n2.f18695l0, b);
                    a15.b(hVar, N2());
                    this.currentRunner = a15;
                }
            }
            Object obj9 = this.currentRunner;
            if (!(obj9 instanceof q)) {
                obj9 = null;
            }
            q qVar = (q) obj9;
            if (qVar == null) {
                Pair<q, View> D22 = D2(hVar);
                q a16 = D22.a();
                r4 = D22.b();
                qVar = a16;
            }
            uq.l transition5 = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
            if (r4 != null) {
                Q2(r4, transition5);
            }
            qVar.b(hVar, N2());
            this.currentRunner = qVar;
        } else if (rendering instanceof Screen.i) {
            Object obj10 = this.currentRunner;
            if (!(obj10 instanceof qo.p)) {
                obj10 = null;
            }
            Object obj11 = (qo.p) obj10;
            if (obj11 == null) {
                lo.j c13 = lo.j.c(LayoutInflater.from(I1), ((lo.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(c13, "inflate(...)");
                Pair pair4 = new Pair(new qo.p(c13), c13.getRoot());
                Object a17 = pair4.a();
                r4 = (View) pair4.b();
                obj11 = a17;
            }
            uq.l transition6 = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
            if (r4 != null) {
                Q2(r4, transition6);
            }
            ((qo.p) obj11).b((Screen.i) rendering, N2());
            this.currentRunner = obj11;
        } else if (rendering instanceof Screen.j) {
            Screen.j jVar = (Screen.j) rendering;
            if (jVar.getIsFinalizingVideoCapture()) {
                G2(rendering, new Function0() { // from class: oo.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit T2;
                        T2 = GovernmentIdStepFragment.T2(GovernmentIdStepFragment.this, rendering, I1);
                        return T2;
                    }
                });
                return;
            }
            E2(jVar, I1);
        } else if (rendering instanceof Screen.f) {
            Screen.f fVar = (Screen.f) rendering;
            if (fVar.getIsFinalizingVideoCapture()) {
                G2(rendering, new Function0() { // from class: oo.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit U2;
                        U2 = GovernmentIdStepFragment.U2(GovernmentIdStepFragment.this, rendering, I1);
                        return U2;
                    }
                });
                return;
            }
            z2(fVar, I1);
        } else {
            if (!(rendering instanceof Screen.g)) {
                throw new gt.l();
            }
            if (this.cameraController != null) {
                android.view.s k03 = k0();
                Intrinsics.checkNotNullExpressionValue(k03, "getViewLifecycleOwner(...)");
                ju.k.d(t.a(k03), null, null, new h(rendering, I1, null), 3, null);
                return;
            }
            C2((Screen.g) rendering, I1);
        }
        this.currentScreen = rendering;
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        b governmentIdStepStateManager = O2().getGovernmentIdStepStateManager();
        g2(governmentIdStepStateManager.c());
        android.view.s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        ju.k.d(t.a(k02), null, null, new g(governmentIdStepStateManager, this, null), 3, null);
        Screen screen = this.pendingRendering;
        if (screen != null) {
            h2(screen);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<u, View> w2(Screen.b initialRendering) {
        un.d dVar;
        Context context = ((lo.e) b2()).b.getContext();
        a.C0601a c10 = un.a.f33038a.c(w.a.class, new w.a() { // from class: oo.j
            @Override // io.w.a
            public final io.w b(dn.x xVar, com.withpersona.sdk2.camera.b bVar, eo.e eVar, Screen.b bVar2, Context context2, ViewGroup viewGroup) {
                io.w x22;
                x22 = GovernmentIdStepFragment.x2(xVar, bVar, eVar, bVar2, context2, viewGroup);
                return x22;
            }
        });
        int i10 = c.f11051a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = un.d.b;
        } else {
            if (i10 != 2) {
                throw new gt.l();
            }
            dVar = un.d.f33045g;
        }
        w.a aVar = (w.a) c10.a(dVar);
        x xVar = K2().get();
        Intrinsics.checkNotNullExpressionValue(xVar, "get(...)");
        com.withpersona.sdk2.camera.b I2 = I2();
        eo.e J2 = J2();
        Intrinsics.checkNotNull(context);
        w b = aVar.b(xVar, I2, J2, initialRendering, context, ((lo.e) b2()).b);
        this.cameraController = b.getCameraController();
        dn.g cameraController = b.getCameraController();
        x xVar2 = K2().get();
        Intrinsics.checkNotNullExpressionValue(xVar2, "get(...)");
        return new Pair<>(new u(context, b, cameraController, xVar2, M2()), b.getRoot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y2(Screen.d rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof qo.j)) {
            obj = null;
        }
        Object obj2 = (qo.j) obj;
        if (obj2 == null) {
            lo.a c10 = lo.a.c(LayoutInflater.from(context), ((lo.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
            Pair pair = new Pair(new qo.j(c10), c10.getRoot());
            Object a10 = pair.a();
            view = (View) pair.b();
            obj2 = a10;
        }
        uq.l transition = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((qo.j) obj2).b(rendering, N2());
        this.currentRunner = obj2;
    }

    public final void z2(Screen.f rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof oo.a)) {
            obj = null;
        }
        Object obj2 = (oo.a) obj;
        if (obj2 == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            yq.s sVar = yq.s.f37035a;
            UiComponentScreen uiScreen = rendering.getUiScreen();
            Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: oo.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit A2;
                    A2 = GovernmentIdStepFragment.A2((lq.b) obj3, (Map) obj4);
                    return A2;
                }
            };
            yt.n nVar = new yt.n() { // from class: oo.l
                @Override // yt.n
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    Unit B2;
                    B2 = GovernmentIdStepFragment.B2((lq.b) obj3, (Screen.f) obj4, (Map) obj5);
                    return B2;
                }
            };
            lq.b c10 = lq.b.c(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
            frameLayout.removeAllViews();
            frameLayout.addView(c10.getRoot());
            Pair pair = new Pair(new oo.a(new d(uiScreen, c10, nVar, sVar.l(c10, uiScreen, function2, true))), frameLayout);
            obj2 = pair.a();
            view = (View) pair.b();
        }
        uq.l transition = rendering.b(this.currentScreen) ? uq.l.f33107c : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((oo.a) obj2).a(rendering, L2());
        this.currentRunner = obj2;
    }
}
