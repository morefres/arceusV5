package com.withpersona.sdk2.inquiry.document.step;

import android.content.Context;
import android.os.Parcelable;
import android.view.l0;
import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.document.CaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.document.a;
import com.withpersona.sdk2.inquiry.document.i;
import com.withpersona.sdk2.inquiry.document.network.a;
import com.withpersona.sdk2.inquiry.document.network.c;
import com.withpersona.sdk2.inquiry.document.network.e;
import com.withpersona.sdk2.inquiry.document.network.g;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import gt.l;
import gt.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.g1;
import ju.k;
import ju.p0;
import k6.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import ot.m;
import pp.i0;
import pp.j1;
import zn.a;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001aB\u008f\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J1\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000201H\u0002¢\u0006\u0004\b7\u00108J1\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000209H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020)*\u00020<2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u00020)*\u00020?2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/b;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lk6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/document/a;", "documentCameraWorker", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorkerFactory", "Lzn/a$a;", "documentFileDeleteWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Lsq/a;", "navigationStateManager", "Lnq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorker", "Lju/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lzn/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Lsq/a;Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lju/p0;)V", "renderProps", "renderState", "", "l0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Ltr/f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", NotificationCompat.CATEGORY_EVENT, "S0", "(Ltr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "c0", "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "T0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "U0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "props", "k0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "e", "Landroidx/lifecycle/l0;", "f", "Lk6/s;", "g", "Landroid/content/Context;", "h", "Lcom/withpersona/sdk2/inquiry/document/a;", "i", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "k", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "l", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "m", "Lzn/a$a;", "n", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "o", "Lsq/a;", "p", "Lnq/c;", "q", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "c", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends tr.c<DocumentWorkflow.Input, DocumentWorkflow.State, DocumentWorkflow.b, DocumentWorkflow.c> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.a documentCameraWorker;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i.b documentsSelectWorkerFactory;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.C0184a documentCreateWorkerFactory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a documentLoadWorker;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a documentFileUploadWorkerFactory;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.C0697a documentFileDeleteWorkerFactory;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.a documentSubmitWorker;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a permissionRequestWorker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$1$1", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10464t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow.State f10466v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DocumentWorkflow.State state, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f10466v = state;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new a(this.f10466v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f10464t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            b bVar = b.this;
            bVar.l0(bVar.b().getValue(), this.f10466v);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$2", f = "DocumentStepStateManager.kt", l = {97}, m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.document.step.b$b, reason: collision with other inner class name */
    public static final class C0195b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10467t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.step.b$b$a */
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f10469a;

            public a(b bVar) {
                this.f10469a = bVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(DocumentWorkflow.Input input, mt.b<? super Unit> bVar) {
                b bVar2 = this.f10469a;
                DocumentWorkflow.State i10 = bVar2.d().i();
                if (i10 == null) {
                    return Unit.f22894a;
                }
                bVar2.l0(input, i10);
                return Unit.f22894a;
            }
        }

        public C0195b(mt.b<? super C0195b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new C0195b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f10467t;
            if (i10 == 0) {
                o.b(obj);
                c0<DocumentWorkflow.Input> b = b.this.b();
                a aVar = new a(b.this);
                this.f10467t = 1;
                if (b.collect(aVar, this) == e10) {
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
            return ((C0195b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/b$c;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/document/step/b;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/document/step/b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        b a(@NotNull DocumentWorkflow.Input initialProps, @NotNull l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10470a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.f28919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.f28920c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10470a = iArr;
            int[] iArr2 = new int[DocumentWorkflow.State.a.values().length];
            try {
                iArr2[DocumentWorkflow.State.a.f10124a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.f10125c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.f10126d.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.f10127e.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$handleState$screen$14", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10471t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10473v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, mt.b<? super e> bVar) {
            super(1, bVar);
            this.f10473v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return b.this.new e(this.f10473v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f10471t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            DocumentWorkflow.State i10 = b.this.d().i();
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = i10 instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId ? (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) i10 : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f22894a;
            }
            DocumentWorkflow.State.a aVar = null;
            b.this.d().p(new DocumentWorkflow.State.ReviewCaptures(reviewCapturesWithoutDocumentId.m(), this.f10473v, aVar, new DocumentWorkflow.State.UploadState.UploadFiles(this.f10473v), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$run$4", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class f extends m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10474t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow.State.UploadState f10476v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DocumentWorkflow.State.UploadState uploadState, mt.b<? super f> bVar) {
            super(1, bVar);
            this.f10476v = uploadState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return b.this.new f(this.f10476v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f10474t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            DocumentWorkflow.State i10 = b.this.d().i();
            if (i10 == null) {
                return Unit.f22894a;
            }
            b.this.d().p(DocumentWorkflow.State.i(i10, new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) this.f10476v).getDocumentId()), null, null, null, 14, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull DocumentWorkflow.Input initialProps, @NotNull l0 savedStateHandle, @NotNull s imageLoader, @NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.document.a documentCameraWorker, @NotNull i.b documentsSelectWorkerFactory, @NotNull a.C0184a documentCreateWorkerFactory, @NotNull e.a documentLoadWorker, @NotNull c.a documentFileUploadWorkerFactory, @NotNull a.C0697a documentFileDeleteWorkerFactory, @NotNull g.a documentSubmitWorker, @NotNull sq.a navigationStateManager, @NotNull nq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull e.a permissionRequestWorker, @NotNull final p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(documentCameraWorker, "documentCameraWorker");
        Intrinsics.checkNotNullParameter(documentsSelectWorkerFactory, "documentsSelectWorkerFactory");
        Intrinsics.checkNotNullParameter(documentCreateWorkerFactory, "documentCreateWorkerFactory");
        Intrinsics.checkNotNullParameter(documentLoadWorker, "documentLoadWorker");
        Intrinsics.checkNotNullParameter(documentFileUploadWorkerFactory, "documentFileUploadWorkerFactory");
        Intrinsics.checkNotNullParameter(documentFileDeleteWorkerFactory, "documentFileDeleteWorkerFactory");
        Intrinsics.checkNotNullParameter(documentSubmitWorker, "documentSubmitWorker");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorker, "permissionRequestWorker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.imageLoader = imageLoader;
        this.applicationContext = applicationContext;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = documentsSelectWorkerFactory;
        this.documentCreateWorkerFactory = documentCreateWorkerFactory;
        this.documentLoadWorker = documentLoadWorker;
        this.documentFileUploadWorkerFactory = documentFileUploadWorkerFactory;
        this.documentFileDeleteWorkerFactory = documentFileDeleteWorkerFactory;
        this.documentSubmitWorker = documentSubmitWorker;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorker = permissionRequestWorker;
        if (d().i() == null) {
            d().p(k0(b().getValue()));
        }
        d().o(new Function1() { // from class: ao.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Z;
                Z = com.withpersona.sdk2.inquiry.document.step.b.Z(ju.p0.this, this, (DocumentWorkflow.State) obj);
                return Z;
            }
        });
        k.d(coroutineScope, g1.d(), null, new C0195b(null), 2, null);
    }

    public static final Unit A0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10134a);
        return Unit.f22894a;
    }

    public static final Unit B0(DocumentFile.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22894a;
    }

    public static final Unit C0() {
        return Unit.f22894a;
    }

    public static final Unit D0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit E0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0169a.f10130a);
        return Unit.f22894a;
    }

    public static final Unit F0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.d.f10133a);
        return Unit.f22894a;
    }

    public static final Unit G0(b bVar, g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, g.b.C0194b.f10410a)) {
            bVar.e(DocumentWorkflow.b.d.f10143a);
        } else {
            if (!(it instanceof g.b.Error)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((g.b.Error) it).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit H0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit I0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10132a);
        return Unit.f22894a;
    }

    public static final Unit J0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit K0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit L0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit M0(b bVar, DocumentWorkflow.State state, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10470a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.f10125c) : state.a(DocumentWorkflow.State.a.f10124a));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit N0(b bVar, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State i10 = bVar.d().i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = i10 instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) i10 : null;
        if (reviewCaptures == null) {
            return Unit.f22894a;
        }
        if (it instanceof e.b.C0193b) {
            tr.f<DocumentWorkflow.State> d10 = bVar.d();
            DocumentWorkflow.State.UploadState.ReadyToSubmit readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId());
            List<DocumentFile> a10 = ((e.b.C0193b) it).a();
            List<DocumentFile> m10 = reviewCaptures.m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m10) {
                if (obj instanceof DocumentFile.Local) {
                    arrayList.add(obj);
                }
            }
            d10.p(DocumentWorkflow.State.ReviewCaptures.p(reviewCaptures, CollectionsKt.w0(a10, arrayList), null, null, readyToSubmit, null, false, false, null, 214, null));
        } else {
            if (!(it instanceof e.b.a)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((e.b.a) it).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit O0(b bVar, DocumentWorkflow.State state, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10470a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.f10125c) : state.a(DocumentWorkflow.State.a.f10124a));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit P0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10132a);
        return Unit.f22894a;
    }

    public static final Unit Q0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10136a);
        return Unit.f22894a;
    }

    public static final Unit R0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit V0(b bVar, DocumentWorkflow.Input input, a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State i10 = bVar.d().i();
        if (i10 == null) {
            return Unit.f22894a;
        }
        if (it instanceof a.b.C0174b) {
            tr.f<DocumentWorkflow.State> d10 = bVar.d();
            DocumentWorkflow.State.UploadState uploadState = i10.getUploadState();
            DocumentWorkflow.State.a aVar = null;
            DocumentFile documentFile = null;
            boolean z10 = false;
            boolean z11 = false;
            String str = null;
            d10.p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.x0(i10.m(), new DocumentFile.Local(((a.b.C0174b) it).getAbsoluteFilePath(), CaptureMethod.f10037c, 0, 4, null)), input.getDocumentFileLimit()), i10.getDocumentId(), aVar, uploadState, documentFile, z10, z11, str, 244, null));
        } else {
            if (!Intrinsics.c(it, a.b.C0173a.f10200a)) {
                throw new l();
            }
            bVar.d().p(i10.a(DocumentWorkflow.State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit W0(b bVar, DocumentWorkflow.Input input, DocumentWorkflow.State state, i.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State i10 = bVar.d().i();
        if (i10 == null) {
            return Unit.f22894a;
        }
        if (it instanceof i.c.Success) {
            DocumentWorkflow.State.a aVar = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(i10.m(), com.withpersona.sdk2.inquiry.document.g.b(((i.c.Success) it).a())), input.getDocumentFileLimit()), i10.getDocumentId(), aVar, i10.getUploadState(), null, false, false, null, 244, null));
        } else if (it instanceof i.c.Failure) {
            DocumentWorkflow.State.a aVar2 = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(i10.m(), com.withpersona.sdk2.inquiry.document.g.b(((i.c.Failure) it).a())), input.getDocumentFileLimit()), i10.getDocumentId(), aVar2, i10.getUploadState(), null, false, false, bVar.applicationContext.getString(tp.g.f32395m), 116, null));
        } else {
            if (!Intrinsics.c(it, i.c.a.f10271a)) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit X0(b bVar, a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State i10 = bVar.d().i();
        if (i10 == null) {
            return Unit.f22894a;
        }
        if (it instanceof a.b.C0186b) {
            a.b.C0186b c0186b = (a.b.C0186b) it;
            bVar.d().p(DocumentWorkflow.State.i(i10, new DocumentWorkflow.State.UploadState.ReadyToSubmit(c0186b.getDocumentId()), c0186b.getDocumentId(), null, null, 12, null));
        } else {
            if (!(it instanceof a.b.Error)) {
                throw new l();
            }
            a.b.Error error = (a.b.Error) it;
            if (!error.getCause().isRecoverable()) {
                bVar.e(new DocumentWorkflow.b.Errored(error.getCause()));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit Y0(b bVar, DocumentWorkflow.State.UploadState uploadState, DocumentFile.Local local, DocumentWorkflow.Input input, Object obj) {
        DocumentWorkflow.State.UploadState uploadFiles;
        DocumentWorkflow.State.UploadState readyToSubmit;
        DocumentWorkflow.State i10 = bVar.d().i();
        if (i10 == null) {
            return Unit.f22894a;
        }
        if (obj instanceof c.b.d) {
            List<DocumentFile> m10 = i10.m();
            ArrayList arrayList = new ArrayList(q.u(m10, 10));
            for (Parcelable parcelable : m10) {
                c.b.d dVar = (c.b.d) obj;
                if (Intrinsics.c(parcelable, dVar.getOldLocalDocument())) {
                    parcelable = dVar.getNewRemoteDocument();
                }
                arrayList.add(parcelable);
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    if (((DocumentFile) obj2) instanceof DocumentFile.Local) {
                        readyToSubmit = new DocumentWorkflow.State.UploadState.UploadFiles(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                        break;
                    }
                }
            }
            readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
            bVar.d().p(DocumentWorkflow.State.i(i10, readyToSubmit, null, arrayList, null, 10, null));
        } else if (obj instanceof c.b.C0188c) {
            List<DocumentFile> m11 = i10.m();
            ArrayList arrayList2 = new ArrayList(q.u(m11, 10));
            for (Parcelable parcelable2 : m11) {
                if ((parcelable2 instanceof DocumentFile.Local) && Intrinsics.c(parcelable2, local)) {
                    parcelable2 = DocumentFile.Local.f((DocumentFile.Local) parcelable2, null, null, ((c.b.C0188c) obj).getProgressPercentage(), 3, null);
                }
                arrayList2.add(parcelable2);
            }
            bVar.d().p(DocumentWorkflow.State.i(i10, i10.getUploadState(), null, arrayList2, null, 10, null));
        } else if (obj instanceof c.b.a) {
            List v02 = CollectionsKt.v0(i10.m(), local);
            List list = v02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                        uploadFiles = new DocumentWorkflow.State.UploadState.UploadFiles(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                        break;
                    }
                }
            }
            uploadFiles = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
            DocumentWorkflow.State.UploadState uploadState2 = uploadFiles;
            c.b.a aVar = (c.b.a) obj;
            DocumentFile documentFile = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCaptures(v02, ((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId(), DocumentWorkflow.State.a.f10124a, uploadState2, documentFile, aVar.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, false, com.withpersona.sdk2.inquiry.document.g.c(aVar.getCause(), bVar.applicationContext, input), 80, null));
        } else if (obj instanceof c.b.C0187b) {
            bVar.e(new DocumentWorkflow.b.Errored(((c.b.C0187b) obj).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit Z(p0 p0Var, b bVar, DocumentWorkflow.State state) {
        if (state == null) {
            return Unit.f22894a;
        }
        k.d(p0Var, g1.d(), null, bVar.new a(state, null), 2, null);
        return Unit.f22894a;
    }

    public static final Unit Z0(b bVar, DocumentFile.Remote remote, DocumentWorkflow.State.UploadState uploadState, a.b response) {
        DocumentWorkflow.State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(response, "response");
        DocumentWorkflow.State i10 = bVar.d().i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = i10 instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) i10 : null;
        if (reviewCaptures == null) {
            return Unit.f22894a;
        }
        List v02 = CollectionsKt.v0(reviewCaptures.m(), remote);
        List list = v02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new DocumentWorkflow.State.UploadState.UploadFiles(((DocumentWorkflow.State.UploadState.DeleteFiles) uploadState).getDocumentId());
                    break;
                }
            }
        }
        uploadFiles = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.DeleteFiles) uploadState).getDocumentId());
        DocumentWorkflow.State.UploadState uploadState2 = uploadFiles;
        if (response instanceof a.b.C0699b) {
            bVar.d().p(DocumentWorkflow.State.ReviewCaptures.p(reviewCaptures, v02, null, null, uploadState2, null, false, false, null, 230, null));
        } else {
            if (!(response instanceof a.b.Error)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((a.b.Error) response).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit d0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10136a);
        return Unit.f22894a;
    }

    public static final Unit e0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit f0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10139a);
        return Unit.f22894a;
    }

    public static final Unit g0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10134a);
        return Unit.f22894a;
    }

    public static final Unit h0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10136a);
        return Unit.f22894a;
    }

    public static final Unit i0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit j0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10139a);
        return Unit.f22894a;
    }

    public static final Unit m0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0169a.f10130a);
        return Unit.f22894a;
    }

    public static final Unit n0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10139a);
        return Unit.f22894a;
    }

    public static final Unit o0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10134a);
        return Unit.f22894a;
    }

    public static final Unit p0(b bVar, DocumentWorkflow.State state, DocumentFile.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        bVar.S0(bVar.d(), new DocumentWorkflow.a.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId(), document));
        return Unit.f22894a;
    }

    public static final Unit q0(b bVar, DocumentWorkflow.State state) {
        bVar.S0(bVar.d(), new DocumentWorkflow.a.Submit(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId()));
        return Unit.f22894a;
    }

    public static final Unit r0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit s0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0169a.f10130a);
        return Unit.f22894a;
    }

    public static final Unit t0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.d.f10133a);
        return Unit.f22894a;
    }

    public static final Unit u0(b bVar, DocumentWorkflow.State state, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10470a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.f10125c) : state.a(DocumentWorkflow.State.a.f10124a));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit v0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10132a);
        return Unit.f22894a;
    }

    public static final Unit w0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10136a);
        return Unit.f22894a;
    }

    public static final Unit x0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit y0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit z0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10139a);
        return Unit.f22894a;
    }

    public final void S0(tr.f<DocumentWorkflow.State> fVar, DocumentWorkflow.a aVar) {
        DocumentWorkflow.State i10 = fVar.i();
        if (i10 == null) {
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.b.f10131a)) {
            e(DocumentWorkflow.b.C0170b.f10141a);
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.C0169a.f10130a)) {
            e(DocumentWorkflow.b.a.f10140a);
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.g.f10136a)) {
            fVar.p(i10.a(DocumentWorkflow.State.a.f10126d).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.h.f10137a)) {
            fVar.p(i10.a(DocumentWorkflow.State.a.f10127e).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.j.f10139a)) {
            fVar.p(i10.a(DocumentWorkflow.State.a.b).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.e.f10134a)) {
            fVar.p(i10.f(true));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.c.f10132a)) {
            fVar.p(i10.f(false));
            return;
        }
        if (aVar instanceof DocumentWorkflow.a.RemoveDocument) {
            if (i10 instanceof DocumentWorkflow.State.ReviewCaptures) {
                DocumentWorkflow.a.RemoveDocument removeDocument = (DocumentWorkflow.a.RemoveDocument) aVar;
                fVar.p(DocumentWorkflow.State.i(i10, new DocumentWorkflow.State.UploadState.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
                return;
            }
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.d.f10133a)) {
            if (i10 instanceof DocumentWorkflow.State.ReviewCaptures) {
                fVar.p(DocumentWorkflow.State.ReviewCaptures.p((DocumentWorkflow.State.ReviewCaptures) i10, null, null, null, null, null, false, false, null, 127, null));
            }
        } else {
            if (!(aVar instanceof DocumentWorkflow.a.Submit)) {
                throw new l();
            }
            DocumentWorkflow.a.Submit submit = (DocumentWorkflow.a.Submit) aVar;
            fVar.p(new DocumentWorkflow.State.UploadDocument(i10.m(), submit.getDocumentId(), new DocumentWorkflow.State.UploadState.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        }
    }

    public final void T0(DocumentWorkflow.State.a aVar, final DocumentWorkflow.Input input, final DocumentWorkflow.State state) {
        int i10 = d.b[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        if (i10 == 3) {
            d().n(this.documentCameraWorker, new Function1() { // from class: ao.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit V0;
                    V0 = com.withpersona.sdk2.inquiry.document.step.b.V0(com.withpersona.sdk2.inquiry.document.step.b.this, input, (a.b) obj);
                    return V0;
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new l();
            }
            d().n(state.getCaptureState() == DocumentWorkflow.State.a.f10126d ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.e(), new Function1() { // from class: ao.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit W0;
                    W0 = com.withpersona.sdk2.inquiry.document.step.b.W0(com.withpersona.sdk2.inquiry.document.step.b.this, input, state, (i.c) obj);
                    return W0;
                }
            });
        }
    }

    public final void U0(final DocumentWorkflow.State.UploadState uploadState, final DocumentWorkflow.Input input, DocumentWorkflow.State state) {
        if (Intrinsics.c(uploadState, DocumentWorkflow.State.UploadState.CreateDocument.f10120a)) {
            if (state.getDocumentId() != null) {
                return;
            }
            d().n(this.documentCreateWorkerFactory.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), new Function1() { // from class: ao.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit X0;
                    X0 = com.withpersona.sdk2.inquiry.document.step.b.X0(com.withpersona.sdk2.inquiry.document.step.b.this, (a.b) obj);
                    return X0;
                }
            });
            return;
        }
        if (!(uploadState instanceof DocumentWorkflow.State.UploadState.UploadFiles)) {
            if (!(uploadState instanceof DocumentWorkflow.State.UploadState.DeleteFiles)) {
                if (!(uploadState instanceof DocumentWorkflow.State.UploadState.ReadyToSubmit)) {
                    throw new l();
                }
                return;
            } else {
                if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                    DocumentWorkflow.State.ReviewCaptures reviewCaptures = (DocumentWorkflow.State.ReviewCaptures) state;
                    DocumentFile documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                    final DocumentFile.Remote remote = documentFileToDelete instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFileToDelete : null;
                    if (remote == null) {
                        return;
                    }
                    d().n(this.documentFileDeleteWorkerFactory.a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), new Function1() { // from class: ao.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Z0;
                            Z0 = com.withpersona.sdk2.inquiry.document.step.b.Z0(com.withpersona.sdk2.inquiry.document.step.b.this, remote, uploadState, (a.b) obj);
                            return Z0;
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<DocumentFile> m10 = state.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            d().m("upload_complete", new f(uploadState, null));
            return;
        }
        for (final DocumentFile.Local local : CollectionsKt.H0(arrayList, 3)) {
            tr.f<DocumentWorkflow.State> d10 = d();
            c.a aVar = this.documentFileUploadWorkerFactory;
            String sessionToken = input.getSessionToken();
            String documentId = ((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            d10.n(tr.g.a(aVar.a(sessionToken, documentId, local, z10), local.getAbsoluteFilePath()), new Function1() { // from class: ao.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit Y0;
                    Y0 = com.withpersona.sdk2.inquiry.document.step.b.Y0(com.withpersona.sdk2.inquiry.document.step.b.this, uploadState, local, input, obj2);
                    return Y0;
                }
            });
        }
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> b0(DocumentStartPage documentStartPage) {
        return new NestedUiStep.a().a(documentStartPage.getSelectDocumentButton(), new Function1() { // from class: ao.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d02;
                d02 = com.withpersona.sdk2.inquiry.document.step.b.d0(com.withpersona.sdk2.inquiry.document.step.b.this, (UiComponent) obj);
                return d02;
            }
        }).a(documentStartPage.getSelectPhotoButton(), new Function1() { // from class: ao.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e02;
                e02 = com.withpersona.sdk2.inquiry.document.step.b.e0(com.withpersona.sdk2.inquiry.document.step.b.this, (UiComponent) obj);
                return e02;
            }
        }).a(documentStartPage.getTakePhotoButton(), new Function1() { // from class: ao.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit f02;
                f02 = com.withpersona.sdk2.inquiry.document.step.b.f0(com.withpersona.sdk2.inquiry.document.step.b.this, (UiComponent) obj);
                return f02;
            }
        }).a(documentStartPage.getLaunchUploadOptionsButton(), new Function1() { // from class: ao.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit g02;
                g02 = com.withpersona.sdk2.inquiry.document.step.b.g0(com.withpersona.sdk2.inquiry.document.step.b.this, (UiComponent) obj);
                return g02;
            }
        }).b();
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> c0(UploadOptionsDialog uploadOptionsDialog) {
        return new NestedUiStep.a().a(uploadOptionsDialog.getSelectDocumentButton(), new Function1() { // from class: ao.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit h02;
                h02 = com.withpersona.sdk2.inquiry.document.step.b.h0(com.withpersona.sdk2.inquiry.document.step.b.this, (UiComponent) obj);
                return h02;
            }
        }).a(uploadOptionsDialog.getSelectPhotoButton(), new Function1() { // from class: ao.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit i02;
                i02 = com.withpersona.sdk2.inquiry.document.step.b.i0(com.withpersona.sdk2.inquiry.document.step.b.this, (UiComponent) obj);
                return i02;
            }
        }).a(uploadOptionsDialog.getTakePhotoButton(), new Function1() { // from class: ao.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j02;
                j02 = com.withpersona.sdk2.inquiry.document.step.b.j0(com.withpersona.sdk2.inquiry.document.step.b.this, (UiComponent) obj);
                return j02;
            }
        }).b();
    }

    @NotNull
    public final DocumentWorkflow.State k0(@NotNull DocumentWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        DocumentWorkflow.StartPage startPage = props.getStartPage();
        if (Intrinsics.c(startPage, DocumentWorkflow.StartPage.Prompt.f10091a)) {
            return new DocumentWorkflow.State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (!(startPage instanceof DocumentWorkflow.StartPage.Review)) {
            throw new l();
        }
        return new DocumentWorkflow.State.ReviewCaptures(p.k(), ((DocumentWorkflow.StartPage.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
    }

    public final void l0(DocumentWorkflow.Input renderProps, final DocumentWorkflow.State renderState) {
        DocumentWorkflow.c bVar;
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof DocumentWorkflow.State.UploadDocument), false, 8, null);
        T0(renderState.getCaptureState(), renderProps, renderState);
        U0(renderState.getUploadState(), renderProps, renderState);
        com.withpersona.sdk2.inquiry.document.g.a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        if (renderState instanceof DocumentWorkflow.State.Start) {
            DocumentWorkflow.State.Start start = (DocumentWorkflow.State.Start) renderState;
            bVar = new com.withpersona.sdk2.inquiry.document.b(yq.b.a(renderProps.getPages().getDocumentStartPage()), b0(renderProps.getPages().getDocumentStartPage()), this.navigationStateManager.b(), new Function0() { // from class: ao.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit m02;
                    m02 = com.withpersona.sdk2.inquiry.document.step.b.m0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return m02;
                }
            }, new Function0() { // from class: ao.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit x02;
                    x02 = com.withpersona.sdk2.inquiry.document.step.b.x0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return x02;
                }
            }, start.getShouldShowUploadOptionsDialog() ? yq.s.f37035a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: ao.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit I0;
                    I0 = com.withpersona.sdk2.inquiry.document.step.b.I0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return I0;
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles());
            if (start.getCaptureState() == DocumentWorkflow.State.a.b) {
                tr.f<DocumentWorkflow.State> d10 = d();
                e.a aVar = this.permissionRequestWorker;
                i0 i0Var = i0.f28911a;
                String permissionsTitle = renderProps.getPermissionsTitle();
                String str = permissionsTitle == null ? "" : permissionsTitle;
                String permissionsRationale = renderProps.getPermissionsRationale();
                if (permissionsRationale == null) {
                    permissionsRationale = this.applicationContext.getString(tp.g.f32388f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
                }
                String str2 = permissionsRationale;
                Context context = this.applicationContext;
                String string = context.getString(tp.g.f32387e, hq.g.b(context));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                d10.n(aVar.a(new PermissionRequestWorkflow.Props(i0Var, false, str, str2, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: ao.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit M0;
                        M0 = com.withpersona.sdk2.inquiry.document.step.b.M0(com.withpersona.sdk2.inquiry.document.step.b.this, renderState, (e.b) obj);
                        return M0;
                    }
                });
            }
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCaptures) {
            DocumentWorkflow.State.ReviewCaptures reviewCaptures = (DocumentWorkflow.State.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                d().n(this.documentLoadWorker.a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), new Function1() { // from class: ao.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit N0;
                        N0 = com.withpersona.sdk2.inquiry.document.step.b.N0(com.withpersona.sdk2.inquiry.document.step.b.this, (e.b) obj);
                        return N0;
                    }
                });
            }
            if (reviewCaptures.getCaptureState() == DocumentWorkflow.State.a.b) {
                tr.f<DocumentWorkflow.State> d11 = d();
                e.a aVar2 = this.permissionRequestWorker;
                i0 i0Var2 = i0.f28911a;
                String permissionsTitle2 = renderProps.getPermissionsTitle();
                String str3 = permissionsTitle2 == null ? "" : permissionsTitle2;
                String permissionsRationale2 = renderProps.getPermissionsRationale();
                if (permissionsRationale2 == null) {
                    permissionsRationale2 = this.applicationContext.getString(tp.g.f32388f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
                }
                String str4 = permissionsRationale2;
                Context context2 = this.applicationContext;
                String string2 = context2.getString(tp.g.f32387e, hq.g.b(context2));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                d11.n(aVar2.a(new PermissionRequestWorkflow.Props(i0Var2, false, str3, str4, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: ao.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit O0;
                        O0 = com.withpersona.sdk2.inquiry.document.step.b.O0(com.withpersona.sdk2.inquiry.document.step.b.this, renderState, (e.b) obj);
                        return O0;
                    }
                });
            }
            bVar = new DocumentWorkflow.c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.m(), this.navigationStateManager.b(), new Function0() { // from class: ao.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit Q0;
                    Q0 = com.withpersona.sdk2.inquiry.document.step.b.Q0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return Q0;
                }
            }, new Function0() { // from class: ao.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit R0;
                    R0 = com.withpersona.sdk2.inquiry.document.step.b.R0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return R0;
                }
            }, new Function0() { // from class: ao.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit n02;
                    n02 = com.withpersona.sdk2.inquiry.document.step.b.n0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return n02;
                }
            }, new Function0() { // from class: ao.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit o02;
                    o02 = com.withpersona.sdk2.inquiry.document.step.b.o0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return o02;
                }
            }, new Function1() { // from class: ao.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit p02;
                    p02 = com.withpersona.sdk2.inquiry.document.step.b.p0(com.withpersona.sdk2.inquiry.document.step.b.this, renderState, (DocumentFile.Remote) obj);
                    return p02;
                }
            }, new Function0() { // from class: ao.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit q02;
                    q02 = com.withpersona.sdk2.inquiry.document.step.b.q0(com.withpersona.sdk2.inquiry.document.step.b.this, renderState);
                    return q02;
                }
            }, new Function0() { // from class: ao.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit r02;
                    r02 = com.withpersona.sdk2.inquiry.document.step.b.r0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return r02;
                }
            }, new Function0() { // from class: ao.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit s02;
                    s02 = com.withpersona.sdk2.inquiry.document.step.b.s0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return s02;
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.m().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.m().isEmpty() && Intrinsics.c(reviewCaptures.getUploadState(), new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: ao.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit t02;
                    t02 = com.withpersona.sdk2.inquiry.document.step.b.t0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return t02;
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCaptures.getShouldShowUploadOptionsDialog() ? yq.s.f37035a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: ao.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit P0;
                    P0 = com.withpersona.sdk2.inquiry.document.step.b.P0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return P0;
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) {
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) renderState;
            String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            if (documentId != null) {
                d().m(documentId, new e(documentId, null));
            }
            if (reviewCapturesWithoutDocumentId.getCaptureState() == DocumentWorkflow.State.a.b) {
                tr.f<DocumentWorkflow.State> d12 = d();
                e.a aVar3 = this.permissionRequestWorker;
                i0 i0Var3 = i0.f28911a;
                String permissionsTitle3 = renderProps.getPermissionsTitle();
                String str5 = permissionsTitle3 == null ? "" : permissionsTitle3;
                String permissionsRationale3 = renderProps.getPermissionsRationale();
                if (permissionsRationale3 == null) {
                    permissionsRationale3 = this.applicationContext.getString(tp.g.f32388f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
                }
                String str6 = permissionsRationale3;
                Context context3 = this.applicationContext;
                String string3 = context3.getString(tp.g.f32387e, hq.g.b(context3));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                d12.n(aVar3.a(new PermissionRequestWorkflow.Props(i0Var3, false, str5, str6, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: ao.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit u02;
                        u02 = com.withpersona.sdk2.inquiry.document.step.b.u0(com.withpersona.sdk2.inquiry.document.step.b.this, renderState, (e.b) obj);
                        return u02;
                    }
                });
            }
            bVar = new DocumentWorkflow.c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.m(), this.navigationStateManager.b(), new Function0() { // from class: ao.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit w02;
                    w02 = com.withpersona.sdk2.inquiry.document.step.b.w0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return w02;
                }
            }, new Function0() { // from class: ao.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit y02;
                    y02 = com.withpersona.sdk2.inquiry.document.step.b.y0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return y02;
                }
            }, new Function0() { // from class: ao.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit z02;
                    z02 = com.withpersona.sdk2.inquiry.document.step.b.z0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return z02;
                }
            }, new Function0() { // from class: ao.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit A0;
                    A0 = com.withpersona.sdk2.inquiry.document.step.b.A0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return A0;
                }
            }, new Function1() { // from class: ao.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit B0;
                    B0 = com.withpersona.sdk2.inquiry.document.step.b.B0((DocumentFile.Remote) obj);
                    return B0;
                }
            }, new Function0() { // from class: ao.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit C0;
                    C0 = com.withpersona.sdk2.inquiry.document.step.b.C0();
                    return C0;
                }
            }, new Function0() { // from class: ao.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit D0;
                    D0 = com.withpersona.sdk2.inquiry.document.step.b.D0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return D0;
                }
            }, new Function0() { // from class: ao.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit E0;
                    E0 = com.withpersona.sdk2.inquiry.document.step.b.E0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return E0;
                }
            }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.m().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: ao.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit F0;
                    F0 = com.withpersona.sdk2.inquiry.document.step.b.F0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return F0;
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? yq.s.f37035a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: ao.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit v02;
                    v02 = com.withpersona.sdk2.inquiry.document.step.b.v0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return v02;
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else {
            if (!(renderState instanceof DocumentWorkflow.State.UploadDocument)) {
                throw new l();
            }
            d().n(this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((DocumentWorkflow.State.UploadDocument) renderState).m()), new Function1() { // from class: ao.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit G0;
                    G0 = com.withpersona.sdk2.inquiry.document.step.b.G0(com.withpersona.sdk2.inquiry.document.step.b.this, (g.b) obj);
                    return G0;
                }
            });
            sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
            bVar = customPendingPage != null ? new DocumentWorkflow.c.b(yq.b.a(customPendingPage), this.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: ao.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit H0;
                    H0 = com.withpersona.sdk2.inquiry.document.step.b.H0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return H0;
                }
            }, new Function0() { // from class: ao.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit J0;
                    J0 = com.withpersona.sdk2.inquiry.document.step.b.J0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return J0;
                }
            }, renderProps.getPendingPageNavBarTitle(), null, 64, null) : new DocumentWorkflow.c.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new Function0() { // from class: ao.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit K0;
                    K0 = com.withpersona.sdk2.inquiry.document.step.b.K0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return K0;
                }
            }, new Function0() { // from class: ao.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit L0;
                    L0 = com.withpersona.sdk2.inquiry.document.step.b.L0(com.withpersona.sdk2.inquiry.document.step.b.this);
                    return L0;
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, 512, null);
        }
        c().setValue(bVar);
    }
}
