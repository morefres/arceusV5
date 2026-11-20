package com.withpersona.sdk2.inquiry.selfie.selfieStep;

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
import android.view.t;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.b;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dn.i0;
import dn.n0;
import dn.s;
import dq.k2;
import e4.l0;
import eo.a0;
import eq.g;
import fn.CameraChoices;
import fn.c;
import fn.f0;
import fn.m0;
import gt.o;
import java.util.Map;
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
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import un.a;
import xp.k0;
import xp.q;
import xp.r0;
import ym.ViewEnvironment;
import yq.ComponentView;
import yt.n;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u007f\u0080\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J)\u0010,\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0)¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0014¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010G\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010_\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR!\u0010}\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\by\u0010A\u0012\u0004\b|\u0010\u0005\u001a\u0004\bz\u0010{¨\u0006\u0081\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "Lmq/c;", "Lyp/h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/h;", "s2", "()Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "initialRendering", "Lxp/k0;", "p2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;)Lxp/k0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/c;", "r2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lcom/withpersona/sdk2/inquiry/selfie/l;", "x2", "()Lcom/withpersona/sdk2/inquiry/selfie/l;", "Lcom/withpersona/sdk2/inquiry/selfie/k;", "w2", "()Lcom/withpersona/sdk2/inquiry/selfie/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Leq/f;", "y2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;)Leq/f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcq/a;", "t2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;)Lcq/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "handler", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "rendering", "K2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "j0", "Liq/c;", "A2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "k0", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "I2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;", "l0", "Lgt/h;", "H2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;", "viewModel", "m0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "n0", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "pendingRendering", "", "o0", "Ljava/lang/Object;", "currentRenderer", "Lcom/withpersona/sdk2/camera/b;", "p0", "Lcom/withpersona/sdk2/camera/b;", "B2", "()Lcom/withpersona/sdk2/camera/b;", "setCameraPreview", "(Lcom/withpersona/sdk2/camera/b;)V", "cameraPreview", "Lat/a;", "Ldn/n0;", "q0", "Lat/a;", "D2", "()Lat/a;", "setSelfieDirectionFeed", "(Lat/a;)V", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "F2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Ltq/a;", "s0", "Ltq/a;", "E2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Leo/e;", "t0", "Leo/e;", "C2", "()Leo/e;", "setFeatureFlagManager", "(Leo/e;)V", "featureFlagManager", "Lym/y;", "u0", "G2", "()Lym/y;", "getViewEnvironment$annotations", "viewEnvironment", "v0", j6.b.f21518e, "SelfieStepFragmentArgs", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieStepFragment extends mq.c<yp.h, SelfieWorkflow.c> {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public b.a viewModelFactory;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super SelfieWorkflow.b, Unit> currentOutputHandler;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SelfieWorkflow.c pendingRendering;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object currentRenderer;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.camera.b cameraPreview;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public at.a<n0> selfieDirectionFeed;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public eo.e featureFlagManager;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewEnvironment;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelfieStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepFragmentArgs> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SelfieWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepFragmentArgs(SelfieWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepFragmentArgs[] newArray(int i10) {
                return new SelfieStepFragmentArgs[i10];
            }
        }

        public SelfieStepFragmentArgs(@NotNull SelfieWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final SelfieWorkflow.Input getProps() {
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
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements n<LayoutInflater, ViewGroup, Boolean, yp.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13101a = new a();

        public a() {
            super(3, yp.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieStepBinding;", 0);
        }

        public final yp.h d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return yp.h.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ yp.h invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelfieStepFragment a(@NotNull SelfieWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (SelfieStepFragment) iq.b.a(new SelfieStepFragment(), new SelfieStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13102a;

        static {
            int[] iArr = new int[wp.a.values().length];
            try {
                iArr[wp.a.f34486a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wp.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wp.a.f34487c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13102a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$d", "Ldn/s;", "", ve.a.f33391e, "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements s {
        public final /* synthetic */ yp.a b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0240c f13104c;

        public d(yp.a aVar, SelfieWorkflow.c.C0240c c0240c) {
            this.b = aVar;
            this.f13104c = c0240c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(SelfieWorkflow.c.C0240c c0240c, dn.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c0240c.i().invoke(it);
            return Unit.f22894a;
        }

        @Override // dn.s
        public void a() {
            com.withpersona.sdk2.camera.b B2 = SelfieStepFragment.this.B2();
            PreviewView previewviewSelfieCamera = this.b.f36862k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            b.a aVar = b.a.f9974a;
            n0 n0Var = SelfieStepFragment.this.D2().get();
            final SelfieWorkflow.c.C0240c c0240c = this.f13104c;
            com.withpersona.sdk2.camera.b.g(B2, previewviewSelfieCamera, aVar, n0Var, true, false, new Function1() { // from class: cq.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit c10;
                    c10 = SelfieStepFragment.d.c(SelfieWorkflow.c.C0240c.this, (dn.h) obj);
                    return c10;
                }
            }, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e", "Lyq/f;", "rendering", "Ltq/a;", "systemUiController", "", ve.a.f33391e, "(Ljava/lang/Object;Ltq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements yq.f<SelfieWorkflow.c.d> {
        public final /* synthetic */ UiComponentScreen b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lq.b f13105c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f13106d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yq.g f13107e;

        public e(UiComponentScreen uiComponentScreen, lq.b bVar, n nVar, yq.g gVar) {
            this.b = uiComponentScreen;
            this.f13105c = bVar;
            this.f13106d = nVar;
            this.f13107e = gVar;
        }

        @Override // yq.f
        public void a(SelfieWorkflow.c.d rendering, tq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer i10 = this.b.i();
            if (i10 != null) {
                lq.b bVar = this.f13105c;
                int intValue = i10.intValue();
                bVar.getRoot().setBackgroundColor(intValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, intValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f13105c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable a10 = uiComponentScreen.a(context2);
            if (a10 != null) {
                lq.b bVar2 = this.f13105c;
                bVar2.getRoot().setBackground(a10);
                bVar2.f23825d.setBackgroundColor(0);
            }
            this.f13106d.invoke(this.f13105c, rendering, this.f13107e.getViewBindings().a());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$onViewCreated$1", f = "SelfieStepFragment.kt", l = {117}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f13108t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k2 f13109u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieStepFragment f13110v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SelfieStepFragment f13111a;
            public final /* synthetic */ k2 b;

            public a(SelfieStepFragment selfieStepFragment, k2 k2Var) {
                this.f13111a = selfieStepFragment;
                this.b = k2Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SelfieWorkflow.b bVar, mt.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f22894a;
                }
                if (this.f13111a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f13111a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k2 k2Var, SelfieStepFragment selfieStepFragment, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f13109u = k2Var;
            this.f13110v = selfieStepFragment;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f13109u, this.f13110v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f13108t;
            if (i10 == 0) {
                o.b(obj);
                c0<SelfieWorkflow.b> a10 = this.f13109u.a();
                a aVar = new a(this.f13110v, this.f13109u);
                this.f13108t = 1;
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
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function0<Bundle> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f13112a;

        public g(androidx.fragment.app.c cVar) {
            this.f13112a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle t8 = this.f13112a.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalStateException("Fragment " + this.f13112a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h implements Function0<a1.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f13113a;
        public final /* synthetic */ Function1 b;

        public h(androidx.fragment.app.c cVar, Function1 function1) {
            this.f13113a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f13113a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", j6.b.f21518e, "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f13114i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.fragment.app.c cVar) {
            super(0);
            this.f13114i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f13114i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", j6.b.f21518e, "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends kotlin.jvm.internal.m implements Function0<c1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f13115i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0) {
            super(0);
            this.f13115i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f13115i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f13116i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(gt.h hVar) {
            super(0);
            this.f13116i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            c1 c10;
            c10 = l0.c(this.f13116i);
            return c10.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f13117i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f13118j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, gt.h hVar) {
            super(0);
            this.f13117i = function0;
            this.f13118j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            c1 c10;
            CreationExtras creationExtras;
            Function0 function0 = this.f13117i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c10 = l0.c(this.f13118j);
            android.view.j jVar = c10 instanceof android.view.j ? (android.view.j) c10 : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22349c;
        }
    }

    public SelfieStepFragment() {
        super(a.f13101a);
        this.args = new iq.c(d0.b(SelfieStepFragmentArgs.class), new g(this));
        h hVar = new h(this, new Function1() { // from class: cq.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.withpersona.sdk2.inquiry.selfie.selfieStep.b M2;
                M2 = SelfieStepFragment.M2(SelfieStepFragment.this, (android.view.l0) obj);
                return M2;
            }
        });
        gt.h a10 = gt.i.a(gt.k.f18836c, new j(new i(this)));
        this.viewModel = l0.b(this, d0.b(b.class), new k(a10), new l(null, a10), hVar);
        this.viewEnvironment = gt.i.b(new Function0() { // from class: cq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewEnvironment L2;
                L2 = SelfieStepFragment.L2(SelfieStepFragment.this);
                return L2;
            }
        });
    }

    private final ViewEnvironment G2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment L2(SelfieStepFragment selfieStepFragment) {
        return new ViewEnvironment(j0.g(gt.s.a(tq.b.b, selfieStepFragment.E2())));
    }

    public static final b M2(SelfieStepFragment selfieStepFragment, android.view.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return selfieStepFragment.I2().a(it, selfieStepFragment.A2().getProps());
    }

    public static final r0 q2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new q(context, viewGroup);
    }

    public static final Unit u2(lq.b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22894a;
    }

    public static final Unit v2(lq.b pendingBinding, SelfieWorkflow.c.d pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        cq.k.d(pendingBinding, pendingRendering);
        return Unit.f22894a;
    }

    public static final eq.g z2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new eq.c(context, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelfieStepFragmentArgs A2() {
        return (SelfieStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.camera.b B2() {
        com.withpersona.sdk2.camera.b bVar = this.cameraPreview;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.u("cameraPreview");
        return null;
    }

    @NotNull
    public final eo.e C2() {
        eo.e eVar = this.featureFlagManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.u("featureFlagManager");
        return null;
    }

    @NotNull
    public final at.a<n0> D2() {
        at.a<n0> aVar = this.selfieDirectionFeed;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("selfieDirectionFeed");
        return null;
    }

    @NotNull
    public final tq.a E2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @NotNull
    public final TrackingEventsLogger F2() {
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        if (trackingEventsLogger != null) {
            return trackingEventsLogger;
        }
        Intrinsics.u("trackingEventsLogger");
        return null;
    }

    public final b H2() {
        return (b) this.viewModel.getValue();
    }

    @NotNull
    public final b.a I2() {
        b.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    public final void J2(@NotNull SelfieWorkflow.Input props, @NotNull Function1<? super SelfieWorkflow.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        H2().f(props);
        this.currentOutputHandler = handler;
    }

    @Override // mq.c
    /* renamed from: K2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull SelfieWorkflow.c rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.b) {
            Object obj = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.h hVar = obj instanceof com.withpersona.sdk2.inquiry.selfie.h ? (com.withpersona.sdk2.inquiry.selfie.h) obj : null;
            if (hVar == null) {
                hVar = s2();
            }
            hVar.g((SelfieWorkflow.c.b) rendering, E2());
            this.currentRenderer = hVar;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.a) {
            Object obj2 = this.currentRenderer;
            k0 k0Var = obj2 instanceof k0 ? (k0) obj2 : null;
            if (k0Var == null) {
                k0Var = p2((SelfieWorkflow.c.a) rendering);
            }
            k0Var.H((SelfieWorkflow.c.a) rendering, E2());
            this.currentRenderer = k0Var;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.C0240c) {
            Object obj3 = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.c cVar = obj3 instanceof com.withpersona.sdk2.inquiry.selfie.c ? (com.withpersona.sdk2.inquiry.selfie.c) obj3 : null;
            if (cVar == null) {
                cVar = r2((SelfieWorkflow.c.C0240c) rendering);
            }
            cVar.b((SelfieWorkflow.c.C0240c) rendering, G2());
            this.currentRenderer = cVar;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.e) {
            Object obj4 = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.k kVar = obj4 instanceof com.withpersona.sdk2.inquiry.selfie.k ? (com.withpersona.sdk2.inquiry.selfie.k) obj4 : null;
            if (kVar == null) {
                kVar = w2();
            }
            kVar.b((SelfieWorkflow.c.e) rendering, G2());
            this.currentRenderer = kVar;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.f) {
            Object obj5 = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.l lVar = obj5 instanceof com.withpersona.sdk2.inquiry.selfie.l ? (com.withpersona.sdk2.inquiry.selfie.l) obj5 : null;
            if (lVar == null) {
                lVar = x2();
            }
            lVar.b((SelfieWorkflow.c.f) rendering, G2());
            this.currentRenderer = lVar;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.g) {
            Object obj6 = this.currentRenderer;
            eq.f fVar = obj6 instanceof eq.f ? (eq.f) obj6 : null;
            if (fVar == null) {
                fVar = y2((SelfieWorkflow.c.g) rendering);
            }
            fVar.b((SelfieWorkflow.c.g) rendering, G2());
            this.currentRenderer = fVar;
            return;
        }
        if (!(rendering instanceof SelfieWorkflow.c.d)) {
            throw new gt.l();
        }
        Object obj7 = this.currentRenderer;
        cq.a aVar = obj7 instanceof cq.a ? (cq.a) obj7 : null;
        if (aVar == null) {
            aVar = t2((SelfieWorkflow.c.d) rendering);
        }
        aVar.a((SelfieWorkflow.c.d) rendering, E2());
        this.currentRenderer = aVar;
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        k2 selfieStepStateManager = H2().getSelfieStepStateManager();
        g2(selfieStepStateManager.c());
        android.view.s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        ju.k.d(t.a(k02), null, null, new f(selfieStepStateManager, this, null), 3, null);
        SelfieWorkflow.c cVar = this.pendingRendering;
        if (cVar != null) {
            h2(cVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k0 p2(SelfieWorkflow.c.a initialRendering) {
        un.d dVar;
        Context context = ((yp.h) b2()).b.getContext();
        a.C0601a c10 = un.a.f33038a.c(r0.a.class, new r0.a() { // from class: cq.b
            @Override // xp.r0.a
            public final r0 a(Context context2, ViewGroup viewGroup) {
                r0 q22;
                q22 = SelfieStepFragment.q2(context2, viewGroup);
                return q22;
            }
        });
        int i10 = c.f13102a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Invalid design version.");
        }
        if (i10 == 2) {
            dVar = un.d.f33040a;
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            dVar = un.d.f33043e;
        }
        r0.a aVar = (r0.a) c10.a(dVar);
        Intrinsics.checkNotNull(context);
        r0 a10 = aVar.a(context, ((yp.h) b2()).b);
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(a10.getRoot());
        com.withpersona.sdk2.camera.b B2 = B2();
        n0 n0Var = D2().get();
        Intrinsics.checkNotNullExpressionValue(n0Var, "get(...)");
        return new k0(context, a10, B2, n0Var, F2(), C2().a(a0.f16087a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.c r2(SelfieWorkflow.c.C0240c initialRendering) {
        dn.g a10;
        Context context = ((yp.h) b2()).getRoot().getContext();
        yp.a c10 = yp.a.c(LayoutInflater.from(context));
        if (initialRendering.getVideoCaptureMethod() != kn.a.f22872c) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices b = f0.b(applicationContext, m0.f17385a);
            if (b == null) {
                initialRendering.i().invoke(new i0());
                Camera2PreviewView camera2Preview = c10.f36854c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                a10 = new com.withpersona.sdk2.camera.g(camera2Preview);
            } else {
                c.a camera2ControllerFactory = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = c10.f36854c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                n0 n0Var = D2().get();
                Intrinsics.checkNotNullExpressionValue(n0Var, "get(...)");
                a10 = camera2ControllerFactory.a(b, camera2Preview2, n0Var, kn.a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            e.a cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            com.withpersona.sdk2.camera.b B2 = B2();
            PreviewView previewviewSelfieCamera = c10.f36862k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            a10 = cameraXControllerFactory.a(B2, previewviewSelfieCamera, new d(c10, initialRendering), initialRendering.getIsAudioRequired());
        }
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(c10.getRoot());
        Intrinsics.checkNotNull(c10);
        n0 n0Var2 = D2().get();
        Intrinsics.checkNotNullExpressionValue(n0Var2, "get(...)");
        return new com.withpersona.sdk2.inquiry.selfie.c(c10, a10, n0Var2, F2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.h s2() {
        ((yp.h) b2()).b.removeAllViews();
        yp.e c10 = yp.e.c(LayoutInflater.from(w()), ((yp.h) b2()).b, true);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        return new com.withpersona.sdk2.inquiry.selfie.h(c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cq.a t2(SelfieWorkflow.c.d initialRendering) {
        yq.s sVar = yq.s.f37035a;
        FrameLayout content = ((yp.h) b2()).b;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: cq.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit u22;
                u22 = SelfieStepFragment.u2((lq.b) obj, (Map) obj2);
                return u22;
            }
        };
        n nVar = new n() { // from class: cq.g
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit v22;
                v22 = SelfieStepFragment.v2((lq.b) obj, (SelfieWorkflow.c.d) obj2, (Map) obj3);
                return v22;
            }
        };
        lq.b c10 = lq.b.c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        content.removeAllViews();
        content.addView(c10.getRoot());
        return new cq.a(new e(uiScreen, c10, nVar, sVar.l(c10, uiScreen, function2, true)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.k w2() {
        yp.d c10 = yp.d.c(LayoutInflater.from(((yp.h) b2()).b.getContext()), ((yp.h) b2()).b, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(c10.getRoot());
        return new com.withpersona.sdk2.inquiry.selfie.k(c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.l x2() {
        yp.f c10 = yp.f.c(LayoutInflater.from(((yp.h) b2()).b.getContext()), ((yp.h) b2()).b, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(c10.getRoot());
        return new com.withpersona.sdk2.inquiry.selfie.l(c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eq.f y2(SelfieWorkflow.c.g initialRendering) {
        un.d dVar;
        Context context = ((yp.h) b2()).b.getContext();
        a.C0601a c10 = un.a.f33038a.c(g.a.class, new g.a() { // from class: cq.c
            @Override // eq.g.a
            public final eq.g a(Context context2, ViewGroup viewGroup) {
                eq.g z22;
                z22 = SelfieStepFragment.z2(context2, viewGroup);
                return z22;
            }
        });
        int i10 = c.f13102a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1 || i10 == 2) {
            dVar = un.d.f33040a;
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            dVar = un.d.f33044f;
        }
        g.a aVar = (g.a) c10.a(dVar);
        Intrinsics.checkNotNull(context);
        eq.g a10 = aVar.a(context, ((yp.h) b2()).b);
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(a10.getRoot());
        return new eq.f(a10);
    }
}
