package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.a1;
import android.view.b1;
import android.view.c1;
import android.view.y0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StyleVariant;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.e;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.c;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.a;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import e4.l0;
import java.util.Map;
import ju.p0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import mu.b0;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.ScreenState;
import xo.e0;
import xo.x;
import yo.e;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J+\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010\u0018J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b0\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\f¨\u0006V"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i;", "Landroidx/fragment/app/c;", "Luo/b;", "Liq/d;", "<init>", "()V", "", "resetState", "", "h2", "(Z)V", "r2", "()Z", "Landroid/content/Context;", "context", "i2", "(Landroid/content/Context;)V", "", "redirectUri", "p2", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "resultBundle", "q2", "(Landroid/os/Bundle;)V", "g2", "C0", "savedInstanceState", "F0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "c1", "a1", "V0", "d1", "K0", "N0", "outState", "b1", "Luo/a;", "k2", "()Luo/a;", "w", "()Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "cancelOutput", "n2", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;)V", "Lcom/withpersona/sdk2/inquiry/internal/workflows/a$a;", "m2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "output", "o2", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;)V", "Lcom/withpersona/sdk2/inquiry/internal/h;", "f0", "Lgt/h;", "j2", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "args", "Lxo/x;", "g0", "l2", "()Lxo/x;", "viewModel", "Lzo/f;", "h0", "Lzo/f;", "binding", "i0", "Landroid/content/Context;", "themedContext", "", "getTheme", "()Ljava/lang/Integer;", "theme", "isInline", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends androidx.fragment.app.c implements uo.b, iq.d {

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h args = gt.i.b(new Function0() { // from class: xo.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            com.withpersona.sdk2.inquiry.internal.h f22;
            f22 = com.withpersona.sdk2.inquiry.internal.i.f2(com.withpersona.sdk2.inquiry.internal.i.this);
            return f22;
        }
    });

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public zo.f binding;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context themedContext;

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"com/withpersona/sdk2/inquiry/internal/i$a", "Lnq/e;", "Lmu/h;", "Lnq/a;", ve.a.f33391e, "Lmu/h;", "c", "()Lmu/h;", "controllerRequestFlow", "Lmu/c0;", "Luo/c;", j6.b.f21518e, "Lmu/c0;", "()Lmu/c0;", "screenStateFlow", "Lmu/b0;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "Lmu/b0;", "()Lmu/b0;", "eventFlow", "", rl.d.f30696a, "Z", "()Z", "isNavBarEnabled", "e", "handleBackPress", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements nq.e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final mu.h<nq.a> controllerRequestFlow;

        /* renamed from: b, reason: from kotlin metadata */
        public final c0<ScreenState> screenStateFlow;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final b0<InquiryEvent> eventFlow;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean isNavBarEnabled;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final boolean handleBackPress;

        public a(i iVar) {
            this.controllerRequestFlow = iVar.l2().g();
            this.screenStateFlow = iVar.l2().x();
            this.eventFlow = iVar.l2().l();
            this.isNavBarEnabled = iVar.j2().H();
            this.handleBackPress = iVar.j2().l();
        }

        @Override // nq.e
        public b0<InquiryEvent> a() {
            return this.eventFlow;
        }

        @Override // nq.e
        public c0<ScreenState> b() {
            return this.screenStateFlow;
        }

        @Override // nq.e
        public mu.h<nq.a> c() {
            return this.controllerRequestFlow;
        }

        @Override // nq.e
        /* renamed from: d, reason: from getter */
        public boolean getIsNavBarEnabled() {
            return this.isNavBarEnabled;
        }

        @Override // nq.e
        /* renamed from: e, reason: from getter */
        public boolean getHandleBackPress() {
            return this.handleBackPress;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1", f = "InquiryFragment.kt", l = {152}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11873t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f11875a;

            public a(i iVar) {
                this.f11875a = iVar;
            }

            public final Object b(boolean z10, mt.b<? super Unit> bVar) {
                this.f11875a.h2(true);
                return Unit.f22894a;
            }

            @Override // mu.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, mt.b bVar) {
                return b(((Boolean) obj).booleanValue(), bVar);
            }
        }

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return i.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11873t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h n10 = mu.j.n(i.this.l2().m(), 1);
                a aVar = new a(i.this);
                this.f11873t = 1;
                if (n10.collect(aVar, this) == e10) {
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
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", j6.b.f21518e, "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11876i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.c cVar) {
            super(0);
            this.f11876i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f11876i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", j6.b.f21518e, "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class d extends kotlin.jvm.internal.m implements Function0<c1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11877i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.f11877i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f11877i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f11878i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(gt.h hVar) {
            super(0);
            this.f11878i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            c1 c10;
            c10 = l0.c(this.f11878i);
            return c10.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11879i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f11880j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, gt.h hVar) {
            super(0);
            this.f11879i = function0;
            this.f11880j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            c1 c10;
            CreationExtras creationExtras;
            Function0 function0 = this.f11879i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c10 = l0.c(this.f11880j);
            android.view.j jVar = c10 instanceof android.view.j ? (android.view.j) c10 : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22349c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", j6.b.f21518e, "()Landroidx/lifecycle/a1$c;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends kotlin.jvm.internal.m implements Function0<a1.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11881i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f11882j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.c cVar, gt.h hVar) {
            super(0);
            this.f11881i = cVar;
            this.f11882j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            c1 c10;
            a1.c W;
            c10 = l0.c(this.f11882j);
            android.view.j jVar = c10 instanceof android.view.j ? (android.view.j) c10 : null;
            return (jVar == null || (W = jVar.W()) == null) ? this.f11881i.W() : W;
        }
    }

    public i() {
        gt.h a10 = gt.i.a(gt.k.f18836c, new d(new c(this)));
        this.viewModel = l0.b(this, d0.b(x.class), new e(a10), new f(null, a10), new g(this, a10));
    }

    public static final h f2(i iVar) {
        return new h(iVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h j2() {
        return (h) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x l2() {
        return (x) this.viewModel.getValue();
    }

    private final boolean r2() {
        String w5 = j2().w();
        if (w5 == null || !StringsKt.Z(w5, '\n', false, 2, null)) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.f13734f);
        q2(bundle);
        L().a1();
        return false;
    }

    @Override // androidx.fragment.app.c
    public void C0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.C0(context);
        if (isInline()) {
            context = new o.d(context, getTheme().intValue());
        }
        this.themedContext = context;
    }

    @Override // androidx.fragment.app.c
    public void F0(@Nullable Bundle savedInstanceState) {
        Context I1 = I1();
        Intrinsics.checkNotNullExpressionValue(I1, "requireContext(...)");
        Context context = this.themedContext;
        if (context == null) {
            context = I1;
        }
        i2(context);
        super.F0(savedInstanceState);
        ap.c.a(I1);
        if (j2().e() || j2().b()) {
            ap.c.d(I1, l2().getSdkFilesManager().b());
        }
    }

    @Override // androidx.fragment.app.c
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.J0(inflater, container, savedInstanceState);
        zo.f c10 = zo.f.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            Intrinsics.u("binding");
            c10 = null;
        }
        CoordinatorLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.c
    public void K0() {
        Context I1 = I1();
        Intrinsics.checkNotNullExpressionValue(I1, "requireContext(...)");
        ap.c.e(I1);
        uo.a k22 = k2();
        if (k22 != null) {
            k22.a();
        }
        super.K0();
    }

    @Override // androidx.fragment.app.c
    public void N0() {
        super.N0();
        this.themedContext = null;
    }

    @Override // androidx.fragment.app.c
    public void V0() {
        super.V0();
        l2().C();
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        super.a1();
        l2().F();
        l2().D();
    }

    @Override // androidx.fragment.app.c
    public void b1(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.b1(outState);
        ir.a.INSTANCE.a().e(outState);
    }

    @Override // androidx.fragment.app.c
    public void c1() {
        super.c1();
        Context I1 = I1();
        Intrinsics.checkNotNullExpressionValue(I1, "requireContext(...)");
        vn.c.d(I1);
    }

    @Override // androidx.fragment.app.c
    public void d1() {
        super.d1();
        Context I1 = I1();
        Intrinsics.checkNotNullExpressionValue(I1, "requireContext(...)");
        vn.c.f(I1);
    }

    @Override // androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        try {
            if (r2()) {
                ir.a.INSTANCE.a().b(savedInstanceState);
                l2().B(this);
                l2().n().o(j2().m());
                l2().A().o(j2().w());
                android.view.s k02 = k0();
                Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
                ju.k.d(android.view.t.a(k02), null, null, new b(null), 3, null);
                h2(false);
                uo.a k22 = k2();
                if (k22 != null) {
                    k22.b(this);
                }
            }
        } catch (Exception e10) {
            if (!j2().b()) {
                throw e10;
            }
            if (j2().e()) {
                Context I1 = I1();
                Intrinsics.checkNotNullExpressionValue(I1, "requireContext(...)");
                ap.c.c(I1).c(e10);
            }
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.f13740l);
            q2(bundle);
        }
    }

    public final void g2() {
        xo.s component = l2().getComponent();
        if (component == null) {
            return;
        }
        component.j().b();
        component.g().f();
        l2().getSdkFilesManager().a();
    }

    @Override // iq.d
    @NotNull
    public Integer getTheme() {
        int i10;
        if (isInline()) {
            Integer C = j2().C();
            i10 = (C == null || C.intValue() == 0) ? tp.h.f32410c : C.intValue();
        } else {
            i10 = 0;
        }
        return Integer.valueOf(i10);
    }

    public final void h2(boolean resetState) {
        InquiryWorkflow$Props templateProps;
        Context context = this.themedContext;
        if (context == null) {
            return;
        }
        String f10 = l2().n().f();
        String o8 = j2().o();
        String s8 = j2().s();
        String f11 = l2().A().f();
        if (f10 != null) {
            templateProps = new InquiryWorkflow$Props.InquiryProps(f10, f11, j2().g(), j2().f(), j2().C(), false, j2().x(), j2().j(), 32, null);
        } else if (o8 != null) {
            templateProps = new InquiryWorkflow$Props.OneTimeCodeProps(o8, j2().f(), j2().C(), false, j2().x(), j2().j(), 8, null);
        } else if (s8 != null) {
            templateProps = new InquiryWorkflow$Props.RelaySessionProps(s8, j2().f(), j2().C(), false, null, null, 56, null);
        } else {
            String A = j2().A();
            String B = j2().B();
            String a10 = j2().a();
            String r8 = j2().r();
            InquiryFieldsMap k10 = j2().k();
            Map<String, InquiryField> a11 = k10 != null ? k10.a() : null;
            templateProps = new InquiryWorkflow$Props.TemplateProps(A, B, a10, r8, j2().g(), a11, j2().D(), j2().y(), j2().f(), j2().C(), false, j2().q(), j2().x(), j2().j(), 1024, null);
        }
        if (resetState) {
            i2(context);
            FragmentManager u8 = u();
            Intrinsics.checkNotNullExpressionValue(u8, "getChildFragmentManager(...)");
            androidx.fragment.app.h r10 = u8.r();
            r10.n(e0.f35812d, InquiryWorkflowFragment.INSTANCE.a(j2().m(), j2().w(), templateProps));
            r10.g();
            return;
        }
        if (u().m0(e0.f35812d) == null) {
            FragmentManager u10 = u();
            Intrinsics.checkNotNullExpressionValue(u10, "getChildFragmentManager(...)");
            androidx.fragment.app.h r11 = u10.r();
            r11.n(e0.f35812d, InquiryWorkflowFragment.INSTANCE.a(j2().m(), j2().w(), templateProps));
            r11.g();
        }
    }

    public final void i2(Context context) {
        com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar;
        if (l2().getComponent() != null) {
            return;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        boolean T = kotlin.text.x.T(packageName, "com.withpersona", false, 2, null);
        String v5 = T ? j2().v() : "https://withpersona.com";
        String G = T ? j2().G() : "https://webrtc-consumer.withpersona.com";
        String i10 = T ? j2().i() : "https://inquiry-fallback.withpersona.com";
        String E = T ? j2().E() : "https://tg.withpersona.com";
        kq.a dataCollector = j2().u() ? l2().getDataCollector() : new kq.d();
        FallbackMode h10 = (l2().m().getValue().booleanValue() || j2().y() != null) ? FallbackMode.ALWAYS : j2().h();
        if (h10 == FallbackMode.ALWAYS) {
            aVar = new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(c.a.f11802a);
        } else {
            StaticInquiryTemplate y10 = j2().y();
            LocalStaticInquiryTemplate localStaticInquiryTemplate = y10 instanceof LocalStaticInquiryTemplate ? (LocalStaticInquiryTemplate) y10 : null;
            aVar = localStaticInquiryTemplate != null ? new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(new c.b(localStaticInquiryTemplate.getResourceId())) : new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(c.a.f11802a);
        }
        a aVar2 = new a(this);
        e.a a10 = com.withpersona.sdk2.inquiry.internal.e.a();
        e4.q H1 = H1();
        Intrinsics.checkNotNullExpressionValue(H1, "requireActivity(...)");
        e.a c10 = a10.j(new xo.n(H1, j2().n(), y0.a(l2()))).e(new kp.i(l2().t(), l2().k(), l2().z())).f(new kp.q(l2().j())).o(new kp.w(l2().u())).n(new op.e(l2().s())).l(new jp.c(l2().p())).c(new kp.d(l2().h()));
        boolean F = j2().F();
        String g10 = j2().g();
        String n10 = j2().n();
        StyleVariant z10 = j2().z();
        xo.s b10 = c10.m(new NetworkCoreModule(F, g10, n10, z10 != null ? z10.getValue() : null, j2().p())).d(new kq.b(dataCollector)).k(new com.withpersona.sdk2.inquiry.internal.network.f(v5, G, i10, j2().p())).a(aVar).g(new nq.f(aVar2)).q(new hq.c0(j2().c(), j2().d())).p(new kp.c0(l2().v())).h(new bp.c(h10, j2().f(), l2().getSavedStateHandle())).i(new oq.a(l2().getSdkFilesManager())).r(new TrackingEventsModule(E)).b();
        l2().H(b10);
        ir.a.INSTANCE.b(b10.h());
        op.c.f28098a.a(b10.b());
    }

    @Override // iq.d
    public boolean isInline() {
        return H1().getClass() != InquiryActivity.class;
    }

    @Nullable
    public final uo.a k2() {
        d5.i J = J();
        LayoutInflater.Factory p8 = p();
        if (J instanceof uo.a) {
            return (uo.a) J;
        }
        if (p8 instanceof uo.a) {
            return (uo.a) p8;
        }
        return null;
    }

    @NotNull
    public final a.InterfaceC0227a m2() {
        xo.s component = l2().getComponent();
        if (component != null) {
            return component.f();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void n2(@NotNull InquiryWorkflow$Output.Cancel cancelOutput) {
        xo.s component;
        xo.i d10;
        TrackingEventsLogger b10;
        Intrinsics.checkNotNullParameter(cancelOutput, "cancelOutput");
        long currentTimeMillis = System.currentTimeMillis() - l2().getInquiryStartTimeMs();
        xo.s component2 = l2().getComponent();
        if (component2 != null && (b10 = component2.b()) != null) {
            TrackingEventsLogger.logInquiryEndEvent$default(b10, InquiryEndReason.Cancel, currentTimeMillis, null, false, 12, null);
        }
        if (!cancelOutput.getSkipBackendCall()) {
            String sessionToken = cancelOutput.getSessionToken();
            if (sessionToken != null && (component = l2().getComponent()) != null && (d10 = component.d()) != null) {
                d10.i(sessionToken);
            }
            p2(cancelOutput.getRedirectUri());
        }
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        if (hq.j.f(cancelOutput.getInquiryId())) {
            bundle.putString("INQUIRY_ID_KEY", cancelOutput.getInquiryId());
            String sessionToken2 = cancelOutput.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? h.INSTANCE.a(sessionToken2) : null);
        }
        q2(bundle);
    }

    public final void o2(@NotNull InquiryWorkflow$Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        xo.s component = l2().getComponent();
        if (component == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - l2().getInquiryStartTimeMs();
        boolean z10 = output instanceof InquiryWorkflow$Output.Complete;
        if (z10 || (output instanceof InquiryWorkflow$Output.ReinitializeWithFallbackMode)) {
            TrackingEventsLogger.logInquiryEndEvent$default(component.b(), z10 ? InquiryEndReason.Complete : InquiryEndReason.Fallback, currentTimeMillis, null, false, 12, null);
        } else if (output instanceof InquiryWorkflow$Output.Error) {
            TrackingEventsLogger.logInquiryEndEvent$default(component.b(), InquiryEndReason.Error, currentTimeMillis, ((InquiryWorkflow$Output.Error) output).getDebugMessage(), false, 8, null);
        } else if (!(output instanceof InquiryWorkflow$Output.Cancel)) {
            throw new gt.l();
        }
        String sessionToken = output.getSessionToken();
        if (sessionToken != null) {
            component.d().h(sessionToken);
        }
        if (output instanceof InquiryWorkflow$Output.Complete) {
            InquiryWorkflow$Output.Complete complete = (InquiryWorkflow$Output.Complete) output;
            p2(complete.getRedirectUri());
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
            bundle.putString("INQUIRY_ID_KEY", complete.getInquiryId());
            bundle.putString("INQUIRY_STATUS_KEY", complete.getInquiryStatus());
            bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(complete.a()));
            bundle.putParcelable("COLLECTED_DATA", xo.a.d(l2().getDataCollector().c()));
            String sessionToken2 = complete.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? h.INSTANCE.a(sessionToken2) : null);
            q2(bundle);
            return;
        }
        if (output instanceof InquiryWorkflow$Output.ReinitializeWithFallbackMode) {
            InquiryWorkflow$Output.ReinitializeWithFallbackMode reinitializeWithFallbackMode = (InquiryWorkflow$Output.ReinitializeWithFallbackMode) output;
            l2().n().o(reinitializeWithFallbackMode.getInquiryId());
            l2().A().o(reinitializeWithFallbackMode.getSessionToken());
            l2().I(true);
            return;
        }
        if (output instanceof InquiryWorkflow$Output.Cancel) {
            InquiryWorkflow$Output.Cancel cancel = (InquiryWorkflow$Output.Cancel) output;
            if (cancel.getForce()) {
                n2(cancel);
                return;
            }
            e.Companion companion = yo.e.INSTANCE;
            FragmentManager u8 = u();
            Intrinsics.checkNotNullExpressionValue(u8, "getChildFragmentManager(...)");
            companion.a(u8, getTheme().intValue(), cancel);
            return;
        }
        if (!(output instanceof InquiryWorkflow$Output.Error)) {
            throw new gt.l();
        }
        InquiryWorkflow$Output.Error error = (InquiryWorkflow$Output.Error) output;
        String sessionToken3 = error.getSessionToken();
        if (sessionToken3 != null) {
            component.d().f(sessionToken3, error.getCause());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle2.putString("ERROR_DEBUG_MESSAGE_KEY", error.getDebugMessage());
        bundle2.putParcelable("ERROR_CODE_KEY", error.getErrorCode());
        q2(bundle2);
    }

    public final void p2(String redirectUri) {
        if (redirectUri != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(redirectUri));
                Context w5 = w();
                if (w5 != null) {
                    w5.startActivity(intent);
                    Unit unit = Unit.f22894a;
                }
            } catch (Exception unused) {
                Unit unit2 = Unit.f22894a;
            }
        }
    }

    public final void q2(Bundle resultBundle) {
        g2();
        e4.u.a(this, j2().t(), resultBundle);
    }

    @Override // androidx.fragment.app.c
    @Nullable
    public Context w() {
        Context context = this.themedContext;
        return context == null ? super.w() : context;
    }
}
