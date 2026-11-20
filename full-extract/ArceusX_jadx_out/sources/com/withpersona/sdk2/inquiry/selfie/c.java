package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.s;
import android.view.t;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.camera.d;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.c;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import dn.h0;
import dn.l0;
import dn.m0;
import dn.n0;
import dn.v0;
import fn.o0;
import java.io.File;
import ju.d2;
import ju.g1;
import ju.p0;
import ju.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00103\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010.j\u0004\u0018\u0001`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lyp/a;", "binding", "Ldn/g;", "cameraController", "Ldn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lyp/a;Ldn/g;Ldn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "v", "()V", "rendering", "Lym/y;", "viewEnvironment", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lym/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Landroid/widget/TextView;", "", "scale", "s", "(Landroid/widget/TextView;F)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", j6.b.f21518e, "Lyp/a;", "c", "Ldn/g;", rl.d.f30696a, "Ldn/n0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lju/d2;", "f", "Lju/d2;", "maxRecordingLimitJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "g", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "i", "cameraStateListenerJob", "", "j", "I", "confirmConst", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements ym.k<SelfieWorkflow.c.C0240c> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yp.a binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.g cameraController;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n0 selfieDirectionFeed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 maxRecordingLimitJob;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 cameraStateListenerJob;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int confirmConst;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/c$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements android.view.f {
        public a() {
        }

        public static final void b(c cVar) {
            Function0 function0 = cVar.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            cVar.v();
        }

        @Override // android.view.f
        public void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // android.view.f
        public void onDestroy(s sVar) {
            super.onDestroy(sVar);
        }

        @Override // android.view.f
        public void onPause(s sVar) {
            super.onPause(sVar);
        }

        @Override // android.view.f
        public void onResume(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ConstraintLayout root = c.this.binding.getRoot();
            final c cVar = c.this;
            root.post(new Runnable() { // from class: wp.k
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.b(com.withpersona.sdk2.inquiry.selfie.c.this);
                }
            });
        }

        @Override // android.view.f
        public void onStart(s sVar) {
            super.onStart(sVar);
        }

        @Override // android.view.f
        public void onStop(s sVar) {
            super.onStop(sVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12904a;

        static {
            int[] iArr = new int[SelfieWorkflow.c.C0240c.EnumC0243c.values().length];
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12806a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12808d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12811g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12809e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12812h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12815k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12818n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12821q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12814j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12817m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12807c.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12810f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12813i.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12816l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12819o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12820p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12822r.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f12904a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$registerCameraStateListener$1", f = "OldCameraScreenRunner.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.c$c, reason: collision with other inner class name */
    public static final class C0244c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12905t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.c$c$a */
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f12907a;

            public a(c cVar) {
                this.f12907a = cVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.camera.d dVar, mt.b<? super Unit> bVar) {
                Function1 function1;
                if (Intrinsics.c(dVar, d.b.f9993a)) {
                    Function1 function12 = this.f12907a.currentErrorHandler;
                    if (function12 != null) {
                        function12.invoke(new v0());
                    }
                } else if (dVar instanceof d.Closed) {
                    d.Closed closed = (d.Closed) dVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f12907a.currentErrorHandler) != null) {
                        function1.invoke(new l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f22894a;
            }
        }

        public C0244c(mt.b<? super C0244c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new C0244c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f12905t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h<com.withpersona.sdk2.camera.d> a10 = com.withpersona.sdk2.camera.a.a(c.this.cameraController.b());
                a aVar = new a(c.this);
                this.f12905t = 1;
                if (a10.collect(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((C0244c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1", f = "OldCameraScreenRunner.kt", l = {236, 238}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12908t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0240c.b f12910v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ android.view.m f12911w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$1", f = "OldCameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<com.withpersona.sdk2.camera.d, mt.b<? super Boolean>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f12912t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12913u;

            public a(mt.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f12913u = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                com.withpersona.sdk2.camera.d dVar = (com.withpersona.sdk2.camera.d) this.f12913u;
                nt.c.e();
                if (this.f12912t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return ot.b.a(!(dVar instanceof d.Ready));
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.withpersona.sdk2.camera.d dVar, mt.b<? super Boolean> bVar) {
                return ((a) create(dVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2", f = "OldCameraScreenRunner.kt", l = {240}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f12914t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ SelfieWorkflow.c.C0240c.b f12915u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c f12916v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ android.view.m f12917w;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2$1$1", f = "OldCameraScreenRunner.kt", l = {245, 249}, m = "invokeSuspend")
            public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f12918t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ SelfieWorkflow.c.C0240c.b f12919u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ c f12920v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SelfieWorkflow.c.C0240c.b bVar, c cVar, mt.b<? super a> bVar2) {
                    super(2, bVar2);
                    this.f12919u = bVar;
                    this.f12920v = cVar;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    return new a(this.f12919u, this.f12920v, bVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
                
                    if (r12 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
                
                    if (ju.z0.b(r4, r11) == r0) goto L19;
                 */
                @Override // ot.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Object r0 = nt.c.e()
                        int r1 = r11.f12918t
                        r2 = 1
                        r3 = 2
                        if (r1 == 0) goto L24
                        if (r1 == r2) goto L20
                        if (r1 != r3) goto L18
                        gt.o.b(r12)
                        gt.n r12 = (gt.n) r12
                        java.lang.Object r12 = r12.getValue()
                        goto L5c
                    L18:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L20:
                        gt.o.b(r12)
                        goto L38
                    L24:
                        gt.o.b(r12)
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b r12 = r11.f12919u
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$g r12 = (com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b.g) r12
                        long r4 = r12.getMaxRecordingLengthMs()
                        r11.f12918t = r2
                        java.lang.Object r12 = ju.z0.b(r4, r11)
                        if (r12 != r0) goto L38
                        goto L5b
                    L38:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12920v
                        dn.g r12 = com.withpersona.sdk2.inquiry.selfie.c.l(r12)
                        mu.p0 r12 = r12.b()
                        java.lang.Object r12 = r12.getValue()
                        boolean r12 = r12 instanceof com.withpersona.sdk2.camera.d.Closed
                        if (r12 == 0) goto L4d
                        kotlin.Unit r12 = kotlin.Unit.f22894a
                        return r12
                    L4d:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12920v
                        dn.g r12 = com.withpersona.sdk2.inquiry.selfie.c.l(r12)
                        r11.f12918t = r3
                        java.lang.Object r12 = r12.k(r11)
                        if (r12 != r0) goto L5c
                    L5b:
                        return r0
                    L5c:
                        boolean r0 = gt.n.h(r12)
                        if (r0 == 0) goto L67
                        java.io.File r12 = (java.io.File) r12
                        r12.delete()
                    L67:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12920v
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r12 = com.withpersona.sdk2.inquiry.selfie.c.p(r12)
                        com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData r4 = new com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData
                        com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState r5 = com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState.RECORDING_TIMED_OUT
                        r9 = 8
                        r10 = 0
                        java.lang.String r6 = "local_video"
                        r7 = 0
                        r8 = 0
                        r4.<init>(r5, r6, r7, r8, r9, r10)
                        r0 = 0
                        r1 = 0
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logSelfieCaptureStateEvent$default(r12, r4, r0, r3, r1)
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12920v
                        kotlin.jvm.functions.Function1 r12 = com.withpersona.sdk2.inquiry.selfie.c.m(r12)
                        if (r12 == 0) goto L90
                        dn.m0 r0 = new dn.m0
                        r0.<init>()
                        r12.invoke(r0)
                    L90:
                        kotlin.Unit r12 = kotlin.Unit.f22894a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.c.d.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SelfieWorkflow.c.C0240c.b bVar, c cVar, android.view.m mVar, mt.b<? super b> bVar2) {
                super(2, bVar2);
                this.f12915u = bVar;
                this.f12916v = cVar;
                this.f12917w = mVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f12915u, this.f12916v, this.f12917w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object f10;
                d2 d10;
                Object e10 = nt.c.e();
                int i10 = this.f12914t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    if (((SelfieWorkflow.c.C0240c.b.g) this.f12915u).getRecordLocalVideo()) {
                        dn.g gVar = this.f12916v.cameraController;
                        this.f12914t = 1;
                        f10 = gVar.f(this);
                        if (f10 == e10) {
                            return e10;
                        }
                    }
                    ((SelfieWorkflow.c.C0240c.b.g) this.f12915u).d().invoke(this.f12916v.cameraController.a());
                    return Unit.f22894a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                f10 = ((gt.n) obj).getValue();
                c cVar = this.f12916v;
                android.view.m mVar = this.f12917w;
                SelfieWorkflow.c.C0240c.b bVar = this.f12915u;
                if (gt.n.h(f10) && ((Boolean) f10).booleanValue()) {
                    d2 d2Var = cVar.maxRecordingLimitJob;
                    if (d2Var != null) {
                        d2.a.a(d2Var, null, 1, null);
                    }
                    d10 = ju.k.d(mVar, g1.b(), null, new a(bVar, cVar, null), 2, null);
                    cVar.maxRecordingLimitJob = d10;
                }
                SelfieWorkflow.c.C0240c.b bVar2 = this.f12915u;
                Throwable e11 = gt.n.e(f10);
                if (e11 != null) {
                    ((SelfieWorkflow.c.C0240c.b.g) bVar2).c().invoke(e11);
                }
                ((SelfieWorkflow.c.C0240c.b.g) this.f12915u).d().invoke(this.f12916v.cameraController.a());
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SelfieWorkflow.c.C0240c.b bVar, android.view.m mVar, mt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f12910v = bVar;
            this.f12911w = mVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new d(this.f12910v, this.f12911w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        
            if (ju.i.g(r8, r1, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            if (mu.j.i(r8, r7) == r0) goto L15;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r7.f12908t
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                gt.o.b(r8)
                goto L56
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                gt.o.b(r8)
                goto L3e
            L1f:
                gt.o.b(r8)
                com.withpersona.sdk2.inquiry.selfie.c r8 = com.withpersona.sdk2.inquiry.selfie.c.this
                dn.g r8 = com.withpersona.sdk2.inquiry.selfie.c.l(r8)
                mu.p0 r8 = r8.b()
                com.withpersona.sdk2.inquiry.selfie.c$d$a r1 = new com.withpersona.sdk2.inquiry.selfie.c$d$a
                r1.<init>(r2)
                mu.h r8 = mu.j.N(r8, r1)
                r7.f12908t = r4
                java.lang.Object r8 = mu.j.i(r8, r7)
                if (r8 != r0) goto L3e
                goto L55
            L3e:
                ju.n2 r8 = ju.g1.c()
                com.withpersona.sdk2.inquiry.selfie.c$d$b r1 = new com.withpersona.sdk2.inquiry.selfie.c$d$b
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b r4 = r7.f12910v
                com.withpersona.sdk2.inquiry.selfie.c r5 = com.withpersona.sdk2.inquiry.selfie.c.this
                androidx.lifecycle.m r6 = r7.f12911w
                r1.<init>(r4, r5, r6, r2)
                r7.f12908t = r3
                java.lang.Object r8 = ju.i.g(r8, r1, r7)
                if (r8 != r0) goto L56
            L55:
                return r0
            L56:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$2", f = "OldCameraScreenRunner.kt", l = {280}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12921t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0240c.b f12922u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c f12923v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SelfieWorkflow.c.C0240c.b bVar, c cVar, mt.b<? super e> bVar2) {
            super(2, bVar2);
            this.f12922u = bVar;
            this.f12923v = cVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f12922u, this.f12923v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f12921t;
            if (i10 == 0) {
                gt.o.b(obj);
                long maxRecordingLengthMs = ((SelfieWorkflow.c.C0240c.b.i) this.f12922u).getMaxRecordingLengthMs();
                this.f12921t = 1;
                if (z0.b(maxRecordingLengthMs, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            if (this.f12923v.cameraController.b().getValue() instanceof d.Closed) {
                return Unit.f22894a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f12923v.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "webrtc", null, null, 8, null), false, 2, null);
            Function1 function1 = this.f12923v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new m0());
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$6", f = "OldCameraScreenRunner.kt", l = {400}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12924t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0240c.b f12926v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0240c f12927w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SelfieWorkflow.c.C0240c.b bVar, SelfieWorkflow.c.C0240c c0240c, mt.b<? super f> bVar2) {
            super(2, bVar2);
            this.f12926v = bVar;
            this.f12927w = c0240c;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new f(this.f12926v, this.f12927w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object k10;
            Object e10 = nt.c.e();
            int i10 = this.f12924t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = c.this.cameraController;
                this.f12924t = 1;
                k10 = gVar.k(this);
                if (k10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                k10 = ((gt.n) obj).getValue();
            }
            SelfieWorkflow.c.C0240c.b bVar = this.f12926v;
            if (gt.n.h(k10)) {
                ((SelfieWorkflow.c.C0240c.b.C0242c) bVar).b().invoke((File) k10);
            }
            SelfieWorkflow.c.C0240c c0240c = this.f12927w;
            Throwable e11 = gt.n.e(k10);
            if (e11 != null && !(e11 instanceof h0)) {
                c0240c.i().invoke(e11);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$takePhoto$1", f = "OldCameraScreenRunner.kt", l = {333}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12928t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0240c.b f12930v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieWorkflow.c.C0240c.b bVar, mt.b<? super g> bVar2) {
            super(2, bVar2);
            this.f12930v = bVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new g(this.f12930v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            Object e10 = nt.c.e();
            int i10 = this.f12928t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = c.this.cameraController;
                this.f12928t = 1;
                d10 = gVar.d(this);
                if (d10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                d10 = ((gt.n) obj).getValue();
            }
            SelfieWorkflow.c.C0240c.b bVar = this.f12930v;
            if (gt.n.h(d10)) {
                Function1<String, Unit> d11 = ((SelfieWorkflow.c.C0240c.b.d) bVar).d();
                String absolutePath = ((File) d10).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                d11.invoke(absolutePath);
            }
            SelfieWorkflow.c.C0240c.b bVar2 = this.f12930v;
            Throwable e11 = gt.n.e(d10);
            if (e11 != null && !(e11 instanceof o0)) {
                ((SelfieWorkflow.c.C0240c.b.d) bVar2).c().invoke(e11);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public c(@NotNull yp.a binding, @NotNull dn.g cameraController, @NotNull n0 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.binding = binding;
        this.cameraController = cameraController;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        binding.f36863l.setPreviewView(cameraController.getPreviewView());
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hq.g.i(context).a().a(new a());
        v();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public static final void A(yp.a aVar, android.view.m mVar, c cVar, SelfieWorkflow.c.C0240c.b bVar, View view) {
        x(aVar, mVar, cVar, bVar);
    }

    public static final void B(yp.a aVar, final SelfieWorkflow.c.C0240c.b bVar, View view) {
        if (aVar.f36863l.a0()) {
            ((SelfieWorkflow.c.C0240c.b.e) bVar).b().invoke();
        } else {
            aVar.f36863l.X(new Function0() { // from class: wp.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit C;
                    C = com.withpersona.sdk2.inquiry.selfie.c.C(SelfieWorkflow.c.C0240c.b.this);
                    return C;
                }
            });
        }
    }

    public static final Unit C(SelfieWorkflow.c.C0240c.b bVar) {
        ((SelfieWorkflow.c.C0240c.b.e) bVar).b().invoke();
        return Unit.f22894a;
    }

    public static final Unit D(SelfieWorkflow.c.C0240c.b bVar) {
        ((SelfieWorkflow.c.C0240c.b.C0242c) bVar).c().invoke();
        return Unit.f22894a;
    }

    public static final Unit E(SelfieWorkflow.c.C0240c c0240c) {
        c0240c.h().invoke();
        return Unit.f22894a;
    }

    public static final Unit F(SelfieWorkflow.c.C0240c c0240c) {
        c0240c.j().invoke();
        return Unit.f22894a;
    }

    public static final void G(android.view.m mVar, c cVar, SelfieWorkflow.c.C0240c.b bVar) {
        ju.k.d(mVar, g1.c(), null, cVar.new g(bVar, null), 2, null);
    }

    public static final void t(TextView textView) {
        textView.setAlpha(1.0f);
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        d2 d10;
        d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d10 = ju.k.d(t.a(hq.g.i(context)), null, null, new C0244c(null), 3, null);
        this.cameraStateListenerJob = d10;
    }

    public static final void x(yp.a aVar, final android.view.m mVar, final c cVar, final SelfieWorkflow.c.C0240c.b bVar) {
        aVar.b.setEnabled(false);
        if (aVar.f36863l.a0()) {
            G(mVar, cVar, bVar);
        } else {
            aVar.f36863l.X(new Function0() { // from class: wp.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit y10;
                    y10 = com.withpersona.sdk2.inquiry.selfie.c.y(android.view.m.this, cVar, bVar);
                    return y10;
                }
            });
        }
    }

    public static final Unit y(android.view.m mVar, c cVar, SelfieWorkflow.c.C0240c.b bVar) {
        G(mVar, cVar, bVar);
        return Unit.f22894a;
    }

    public static final Unit z(SelfieWorkflow.c.C0240c.b bVar) {
        ((SelfieWorkflow.c.C0240c.b.f) bVar).b().invoke();
        return Unit.f22894a;
    }

    public final OldSelfieOverlayView.b H(SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c) {
        switch (b.f12904a[enumC0243c.ordinal()]) {
            case 1:
                return OldSelfieOverlayView.b.f13128a;
            case 2:
                return OldSelfieOverlayView.b.f13130d;
            case 3:
                return OldSelfieOverlayView.b.f13133g;
            case 4:
                return OldSelfieOverlayView.b.b;
            case 5:
                return OldSelfieOverlayView.b.f13131e;
            case 6:
                return OldSelfieOverlayView.b.f13134h;
            case 7:
                return OldSelfieOverlayView.b.f13137k;
            case 8:
                return OldSelfieOverlayView.b.f13140n;
            case 9:
                return OldSelfieOverlayView.b.f13143q;
            case 10:
                return OldSelfieOverlayView.b.f13136j;
            case 11:
                return OldSelfieOverlayView.b.f13139m;
            case 12:
                return OldSelfieOverlayView.b.f13129c;
            case 13:
                return OldSelfieOverlayView.b.f13132f;
            case 14:
                return OldSelfieOverlayView.b.f13135i;
            case 15:
                return OldSelfieOverlayView.b.f13138l;
            case 16:
                return OldSelfieOverlayView.b.f13141o;
            case 17:
                return OldSelfieOverlayView.b.f13142p;
            case 18:
                return OldSelfieOverlayView.b.f13144r;
            default:
                throw new gt.l();
        }
    }

    public final void s(final TextView textView, float f10) {
        textView.setVisibility(0);
        textView.animate().setDuration(500L).scaleX(f10).scaleY(f10).alpha(0.0f).withEndAction(new Runnable() { // from class: wp.h
            @Override // java.lang.Runnable
            public final void run() {
                com.withpersona.sdk2.inquiry.selfie.c.t(textView);
            }
        });
    }

    public final void u(StepStyles.SelfieStepStyle styles) {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f36864m;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            hr.h0.l(title, titleStyleValue, null, 2, null);
            this.binding.f36864m.setTextColor(-1);
        }
        TextBasedComponentStyle selfieCaptureHintTextStyle = styles.getSelfieCaptureHintTextStyle();
        if (selfieCaptureHintTextStyle != null) {
            TextView hintMessage = this.binding.f36857f;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            hr.h0.l(hintMessage, selfieCaptureHintTextStyle, null, 2, null);
            this.binding.f36857f.setTextColor(-1);
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f36859h.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
    }

    @Override // ym.k
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final SelfieWorkflow.c.C0240c rendering, @NotNull ViewEnvironment viewEnvironment) {
        d2 d10;
        Function1<? super Throwable, Unit> function1;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (rendering.getRecordingLocallyRequired() && !this.cameraController.getRecordingStarted() && (function1 = this.currentErrorHandler) != null) {
            function1.invoke(new l0(false));
        }
        this.currentErrorHandler = rendering.i();
        this.permissionChangedHandler = rendering.k();
        this.cameraController.j();
        this.cameraController.getPreviewView().setVisibility(0);
        if ((rendering.getMode() instanceof SelfieWorkflow.c.C0240c.b.i) || (rendering.getMode() instanceof SelfieWorkflow.c.C0240c.b.g)) {
            this.binding.f36855d.setVisibility(0);
        } else {
            this.binding.f36855d.setVisibility(8);
        }
        this.selfieDirectionFeed.m(rendering.getRequireStrictSelfieCapture() ? 0.45d : 0.35d, 0.8d, false);
        final yp.a aVar = this.binding;
        Context context = aVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final android.view.m a10 = t.a(hq.g.i(context));
        TextView textView = this.binding.f36864m;
        String title = rendering.getTitle();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextView textView2 = this.binding.f36864m;
        CharSequence text = aVar.f36864m.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(StringsKt.p0(text) ? 8 : 0);
        String message = rendering.getMessage();
        String str = message != null ? message : "";
        if (!Intrinsics.c(str, aVar.f36857f.getText())) {
            aVar.f36857f.setText(str);
        }
        aVar.f36863l.setLeftPoseImage(rendering.getAssetOverrides().getLeftPoseImage());
        aVar.f36863l.setRightPoseImage(rendering.getAssetOverrides().getRightPoseImage());
        int i10 = b.f12904a[rendering.getMode().getOverlay().ordinal()];
        if (i10 == 1) {
            TextView textView3 = aVar.f36857f;
            textView3.announceForAccessibility(textView3.getContext().getString(tp.g.T));
        } else if (i10 == 2) {
            TextView textView4 = aVar.f36857f;
            textView4.announceForAccessibility(textView4.getContext().getString(tp.g.V));
        } else if (i10 == 3) {
            TextView textView5 = aVar.f36857f;
            textView5.announceForAccessibility(textView5.getContext().getString(tp.g.W));
        } else if (rendering.getMode() instanceof SelfieWorkflow.c.C0240c.b.d) {
            TextView textView6 = aVar.f36857f;
            textView6.announceForAccessibility(textView6.getContext().getString(tp.g.U));
        }
        aVar.b.setEnabled(true);
        if (!(rendering.getMode() instanceof SelfieWorkflow.c.C0240c.b.C0241b)) {
            aVar.f36856e.setVisibility(8);
        }
        if (!(rendering.getMode() instanceof SelfieWorkflow.c.C0240c.b.i)) {
            aVar.f36858g.setVisibility(8);
        }
        final SelfieWorkflow.c.C0240c.b mode = rendering.getMode();
        if (mode instanceof SelfieWorkflow.c.C0240c.b.g) {
            aVar.b.setVisibility(4);
            ju.k.d(a10, g1.a(), null, new d(mode, a10, null), 2, null);
            SelfieWorkflow.c.C0240c.b.g gVar = (SelfieWorkflow.c.C0240c.b.g) mode;
            OldSelfieOverlayView.f0(aVar.f36863l, H(gVar.getOverlay()), gVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0240c.b.i) {
            aVar.f36858g.setVisibility(0);
            aVar.b.setVisibility(4);
            d2 d2Var = this.maxRecordingLimitJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            d10 = ju.k.d(a10, g1.b(), null, new e(mode, this, null), 2, null);
            this.maxRecordingLimitJob = d10;
        } else if (mode instanceof SelfieWorkflow.c.C0240c.b.f) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0240c.b.f fVar = (SelfieWorkflow.c.C0240c.b.f) mode;
            aVar.f36863l.e0(H(fVar.getOverlay()), fVar.getShowProgress(), new Function0() { // from class: wp.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit z10;
                    z10 = com.withpersona.sdk2.inquiry.selfie.c.z(SelfieWorkflow.c.C0240c.b.this);
                    return z10;
                }
            });
        } else if (mode instanceof SelfieWorkflow.c.C0240c.b.C0241b) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0240c.b.C0241b c0241b = (SelfieWorkflow.c.C0240c.b.C0241b) mode;
            if (!Intrinsics.c(aVar.f36856e.getTag(), Integer.valueOf(c0241b.getCountDown()))) {
                TextView countdown = aVar.f36856e;
                Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
                s(countdown, kotlin.ranges.d.c(4 - c0241b.getCountDown(), 1) * 1.5f);
                aVar.f36856e.setText(String.valueOf(c0241b.getCountDown()));
                aVar.f36856e.setTag(Integer.valueOf(c0241b.getCountDown()));
            }
            OldSelfieOverlayView.f0(aVar.f36863l, H(c0241b.getOverlay()), c0241b.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0240c.b.h) {
            d2 d2Var2 = this.maxRecordingLimitJob;
            if (d2Var2 != null) {
                d2.a.a(d2Var2, null, 1, null);
            }
            aVar.b.setEnabled(false);
            SelfieWorkflow.c.C0240c.b.h hVar = (SelfieWorkflow.c.C0240c.b.h) mode;
            aVar.f36863l.e0(H(hVar.getOverlay()), hVar.getShowProgress(), hVar.c());
            if (hVar.getImageCaptured()) {
                aVar.getRoot().setHapticFeedbackEnabled(true);
                aVar.getRoot().performHapticFeedback(this.confirmConst, 2);
            }
        } else if (mode instanceof SelfieWorkflow.c.C0240c.b.d) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: wp.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.selfie.c.A(yp.a.this, a10, this, mode, view);
                }
            });
            SelfieWorkflow.c.C0240c.b.d dVar = (SelfieWorkflow.c.C0240c.b.d) mode;
            if (dVar.getForceCapture()) {
                aVar.b.setVisibility(4);
                x(aVar, a10, this, mode);
            }
            OldSelfieOverlayView.f0(aVar.f36863l, H(dVar.getOverlay()), dVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0240c.b.e) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: wp.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.selfie.c.B(yp.a.this, mode, view);
                }
            });
            SelfieWorkflow.c.C0240c.b.e eVar = (SelfieWorkflow.c.C0240c.b.e) mode;
            OldSelfieOverlayView.f0(aVar.f36863l, H(eVar.getOverlay()), eVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0240c.b.a) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0240c.b.a aVar2 = (SelfieWorkflow.c.C0240c.b.a) mode;
            OldSelfieOverlayView.f0(aVar.f36863l, H(aVar2.getOverlay()), aVar2.getShowProgress(), null, 4, null);
        } else {
            if (!(mode instanceof SelfieWorkflow.c.C0240c.b.C0242c)) {
                throw new gt.l();
            }
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0240c.b.C0242c c0242c = (SelfieWorkflow.c.C0240c.b.C0242c) mode;
            if (c0242c.getStartFinalize()) {
                d2 d2Var3 = this.maxRecordingLimitJob;
                if (d2Var3 != null) {
                    d2.a.a(d2Var3, null, 1, null);
                }
                ju.k.d(a10, g1.c(), null, new f(mode, rendering, null), 2, null);
            }
            aVar.f36863l.e0(H(c0242c.getOverlay()), c0242c.getShowProgress(), new Function0() { // from class: wp.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit D;
                    D = com.withpersona.sdk2.inquiry.selfie.c.D(SelfieWorkflow.c.C0240c.b.this);
                    return D;
                }
            });
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: wp.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit E;
                E = com.withpersona.sdk2.inquiry.selfie.c.E(SelfieWorkflow.c.C0240c.this);
                return E;
            }
        };
        Function0 function02 = new Function0() { // from class: wp.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit F;
                F = com.withpersona.sdk2.inquiry.selfie.c.F(SelfieWorkflow.c.C0240c.this);
                return F;
            }
        };
        Pi2NavigationBar navigationBar = aVar.f36859h;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        gr.c.e(navigationState, function0, function02, null, navigationBar, root, null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 72, null);
        String watermarkText = rendering.getWatermarkText();
        if (watermarkText == null || StringsKt.p0(watermarkText)) {
            aVar.f36865n.setVisibility(8);
        } else {
            aVar.f36865n.setText(rendering.getWatermarkText());
            aVar.f36865n.setVisibility(0);
        }
        StepStyles.SelfieStepStyle styles2 = rendering.getStyles();
        if (styles2 != null) {
            u(styles2);
            int c10 = l2.b.c(this.binding.getRoot().getContext(), tp.b.f32357a);
            this.binding.f36863l.W(styles2);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            tq.c.b(viewEnvironment, context2, c10);
        }
    }
}
