package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.view.MotionEventCompat;
import com.appsflyer.share.attribution.RequestError;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import com.withpersona.sdk2.inquiry.ui.h;
import java.util.ArrayList;
import java.util.List;
import ju.g1;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import wm.o;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002!\u0018Bo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0012$\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R2\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "Ltr/h;", "", "key", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "launchPicker", "Lkotlin/Function1;", "Lmt/b;", "", "Landroid/net/Uri;", "", "collectResult", "checkPendingResult", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "otherWorker", "", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", "Lmu/h;", "run", "()Lmu/h;", "Lmu/i;", "uris", "h", "(Lmu/i;Ljava/util/List;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Ljava/lang/String;", "Landroid/content/Context;", rl.d.f30696a, "Lkotlin/jvm/functions/Function0;", "e", "Lkotlin/jvm/functions/Function1;", "f", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements o<b>, tr.h<b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<mt.b<? super List<? extends Uri>>, Object> collectResult;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<mt.b<? super List<? extends Uri>>, Object> checkPendingResult;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$a;", "", "Lg/c;", "", "", "openMultipleDocumentsLauncher", "openSingleDocumentLauncher", "Landroid/content/Context;", "context", "<init>", "(Lg/c;Lg/c;Landroid/content/Context;)V", "componentName", "allowedFileTypes", "", "fileUploadLimit", "Lcom/withpersona/sdk2/inquiry/ui/h;", j6.b.f21518e, "(Ljava/lang/String;[Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/ui/h;", ve.a.f33391e, "Lg/c;", "c", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g.c<String[]> openMultipleDocumentsLauncher;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.c<String[]> openSingleDocumentLauncher;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/net/Uri;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2", f = "UiStepFileSelectWorker.kt", l = {116, 119}, m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.ui.h$a$a, reason: collision with other inner class name */
        public static final class C0259a extends m implements Function1<mt.b<? super List<? extends Uri>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f13930t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f13931u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0259a(int i10, mt.b<? super C0259a> bVar) {
                super(1, bVar);
                this.f13931u = i10;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new C0259a(this.f13931u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
            
                if (r5 == r0) goto L23;
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
                    int r1 = r4.f13930t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    gt.o.b(r5)
                    goto L4f
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    gt.o.b(r5)
                    goto L33
                L1e:
                    gt.o.b(r5)
                    int r5 = r4.f13931u
                    if (r5 != r3) goto L41
                    kp.u r5 = new kp.u
                    r5.<init>()
                    r4.f13930t = r3
                    java.lang.Object r5 = mu.j.u(r5, r4)
                    if (r5 != r0) goto L33
                    goto L4e
                L33:
                    android.net.Uri r5 = (android.net.Uri) r5
                    if (r5 == 0) goto L3c
                    java.util.List r5 = kotlin.collections.o.d(r5)
                    return r5
                L3c:
                    java.util.List r5 = kotlin.collections.p.k()
                    return r5
                L41:
                    kp.v r5 = new kp.v
                    r5.<init>()
                    r4.f13930t = r2
                    java.lang.Object r5 = mu.j.u(r5, r4)
                    if (r5 != r0) goto L4f
                L4e:
                    return r0
                L4f:
                    java.util.List r5 = (java.util.List) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.h.a.C0259a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super List<? extends Uri>> bVar) {
                return ((C0259a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/net/Uri;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$3", f = "UiStepFileSelectWorker.kt", l = {124, 127}, m = "invokeSuspend")
        public static final class b extends m implements Function1<mt.b<? super List<? extends Uri>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f13932t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f13933u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, mt.b<? super b> bVar) {
                super(1, bVar);
                this.f13933u = i10;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new b(this.f13933u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
            
                if (r5 == r0) goto L23;
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
                    int r1 = r4.f13932t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    gt.o.b(r5)
                    goto L4c
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    gt.o.b(r5)
                    goto L33
                L1e:
                    gt.o.b(r5)
                    int r5 = r4.f13933u
                    if (r5 != r3) goto L3e
                    kp.u r5 = new kp.u
                    r5.<init>()
                    r4.f13932t = r3
                    java.lang.Object r5 = mu.j.v(r5, r4)
                    if (r5 != r0) goto L33
                    goto L4b
                L33:
                    android.net.Uri r5 = (android.net.Uri) r5
                    if (r5 == 0) goto L3c
                    java.util.List r5 = kotlin.collections.o.d(r5)
                    return r5
                L3c:
                    r5 = 0
                    return r5
                L3e:
                    kp.v r5 = new kp.v
                    r5.<init>()
                    r4.f13932t = r2
                    java.lang.Object r5 = mu.j.v(r5, r4)
                    if (r5 != r0) goto L4c
                L4b:
                    return r0
                L4c:
                    java.util.List r5 = (java.util.List) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.h.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super List<? extends Uri>> bVar) {
                return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public a(@NotNull g.c<String[]> openMultipleDocumentsLauncher, @NotNull g.c<String[]> openSingleDocumentLauncher, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(openMultipleDocumentsLauncher, "openMultipleDocumentsLauncher");
            Intrinsics.checkNotNullParameter(openSingleDocumentLauncher, "openSingleDocumentLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            this.openMultipleDocumentsLauncher = openMultipleDocumentsLauncher;
            this.openSingleDocumentLauncher = openSingleDocumentLauncher;
            this.context = context;
        }

        public static final Unit c(int i10, a aVar, String[] strArr) {
            if (i10 == 1) {
                aVar.openSingleDocumentLauncher.b(strArr);
            } else {
                aVar.openMultipleDocumentsLauncher.b(strArr);
            }
            return Unit.f22894a;
        }

        @NotNull
        public final h b(@NotNull String componentName, @NotNull final String[] allowedFileTypes, final int fileUploadLimit) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
            return new h("FileUploadPicker-" + componentName, this.context, new Function0() { // from class: mr.a4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit c10;
                    c10 = h.a.c(fileUploadLimit, this, allowedFileTypes);
                    return c10;
                }
            }, new C0259a(fileUploadLimit, null), new b(fileUploadLimit, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "<init>", "()V", "c", ve.a.f33391e, j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/ui/h$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/h$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/h$b$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f13934a = new a();

            public a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.ui.h$b$b, reason: collision with other inner class name */
        public static final class C0260b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0260b f13935a = new C0260b();

            public C0260b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;", "files", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.ui.h$b$c, reason: from toString */
        public static final /* data */ class Success extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<SelectedFile> files;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<SelectedFile> files) {
                super(null);
                Intrinsics.checkNotNullParameter(files, "files");
                this.files = files;
            }

            @NotNull
            public final List<SelectedFile> a() {
                return this.files;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.files, ((Success) other).files);
            }

            public int hashCode() {
                return this.files.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(files=" + this.files + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1", f = "UiStepFileSelectWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_11, MotionEventCompat.AXIS_GENERIC_15, RequestError.RESPONSE_CODE_FAILURE, 54, 55}, m = "invokeSuspend")
    public static final class c extends m implements Function2<mu.i<? super b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f13937t;

        /* renamed from: u, reason: collision with root package name */
        public Object f13938u;

        /* renamed from: v, reason: collision with root package name */
        public int f13939v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f13940w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$1", f = "UiStepFileSelectWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f13942t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h f13943u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f13943u = hVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f13943u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f13942t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                this.f13943u.launchPicker.invoke();
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Landroid/net/Uri;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$pendingResult$1", f = "UiStepFileSelectWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_12}, m = "invokeSuspend")
        public static final class b extends m implements Function2<p0, mt.b<? super List<? extends Uri>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f13944t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h f13945u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f13945u = hVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f13945u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f13944t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                Function1 function1 = this.f13945u.checkPendingResult;
                this.f13944t = 1;
                Object invoke = function1.invoke(this);
                return invoke == e10 ? e10 : invoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super List<? extends Uri>> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = h.this.new c(bVar);
            cVar.f13940w = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00d4, code lost:
        
            if (r3.h(r0, r11, r10) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
        
            if (r11 != r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        
            if (r2.h(r0, r11, r10) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
        
            if (r11 == r1) goto L35;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f13940w
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r10.f13939v
                r3 = 0
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r2 == 0) goto L4e
                if (r2 == r8) goto L4a
                if (r2 == r7) goto L42
                if (r2 == r6) goto L3a
                if (r2 == r5) goto L31
                if (r2 != r4) goto L29
                java.lang.Object r0 = r10.f13938u
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r10.f13937t
                java.util.List r0 = (java.util.List) r0
                gt.o.b(r11)
                goto Ld7
            L29:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L31:
                java.lang.Object r2 = r10.f13937t
                java.util.List r2 = (java.util.List) r2
                gt.o.b(r11)
                goto Lb8
            L3a:
                java.lang.Object r2 = r10.f13937t
                java.util.List r2 = (java.util.List) r2
                gt.o.b(r11)
                goto La1
            L42:
                java.lang.Object r0 = r10.f13937t
                java.util.List r0 = (java.util.List) r0
                gt.o.b(r11)
                goto L81
            L4a:
                gt.o.b(r11)
                goto L66
            L4e:
                gt.o.b(r11)
                com.withpersona.sdk2.inquiry.ui.h$c$b r11 = new com.withpersona.sdk2.inquiry.ui.h$c$b
                com.withpersona.sdk2.inquiry.ui.h r2 = com.withpersona.sdk2.inquiry.ui.h.this
                r11.<init>(r2, r3)
                r10.f13940w = r0
                r10.f13939v = r8
                r8 = 100
                java.lang.Object r11 = ju.g3.e(r8, r11, r10)
                if (r11 != r1) goto L66
                goto Ld6
            L66:
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L84
                com.withpersona.sdk2.inquiry.ui.h r2 = com.withpersona.sdk2.inquiry.ui.h.this
                java.lang.Object r3 = ot.l.a(r0)
                r10.f13940w = r3
                java.lang.Object r3 = ot.l.a(r11)
                r10.f13937t = r3
                r10.f13939v = r7
                java.lang.Object r11 = com.withpersona.sdk2.inquiry.ui.h.g(r2, r0, r11, r10)
                if (r11 != r1) goto L81
                goto Ld6
            L81:
                kotlin.Unit r11 = kotlin.Unit.f22894a
                return r11
            L84:
                ju.n2 r2 = ju.g1.c()
                com.withpersona.sdk2.inquiry.ui.h$c$a r7 = new com.withpersona.sdk2.inquiry.ui.h$c$a
                com.withpersona.sdk2.inquiry.ui.h r8 = com.withpersona.sdk2.inquiry.ui.h.this
                r7.<init>(r8, r3)
                r10.f13940w = r0
                java.lang.Object r3 = ot.l.a(r11)
                r10.f13937t = r3
                r10.f13939v = r6
                java.lang.Object r2 = ju.i.g(r2, r7, r10)
                if (r2 != r1) goto La0
                goto Ld6
            La0:
                r2 = r11
            La1:
                com.withpersona.sdk2.inquiry.ui.h r11 = com.withpersona.sdk2.inquiry.ui.h.this
                kotlin.jvm.functions.Function1 r11 = com.withpersona.sdk2.inquiry.ui.h.e(r11)
                r10.f13940w = r0
                java.lang.Object r3 = ot.l.a(r2)
                r10.f13937t = r3
                r10.f13939v = r5
                java.lang.Object r11 = r11.invoke(r10)
                if (r11 != r1) goto Lb8
                goto Ld6
            Lb8:
                java.util.List r11 = (java.util.List) r11
                com.withpersona.sdk2.inquiry.ui.h r3 = com.withpersona.sdk2.inquiry.ui.h.this
                java.lang.Object r5 = ot.l.a(r0)
                r10.f13940w = r5
                java.lang.Object r2 = ot.l.a(r2)
                r10.f13937t = r2
                java.lang.Object r2 = ot.l.a(r11)
                r10.f13938u = r2
                r10.f13939v = r4
                java.lang.Object r11 = com.withpersona.sdk2.inquiry.ui.h.g(r3, r0, r11, r10)
                if (r11 != r1) goto Ld7
            Ld6:
                return r1
            Ld7:
                kotlin.Unit r11 = kotlin.Unit.f22894a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super b> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull String key, @NotNull Context context, @NotNull Function0<Unit> launchPicker, @NotNull Function1<? super mt.b<? super List<? extends Uri>>, ? extends Object> collectResult, @NotNull Function1<? super mt.b<? super List<? extends Uri>>, ? extends Object> checkPendingResult) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        Intrinsics.checkNotNullParameter(collectResult, "collectResult");
        Intrinsics.checkNotNullParameter(checkPendingResult, "checkPendingResult");
        this.key = key;
        this.context = context;
        this.launchPicker = launchPicker;
        this.collectResult = collectResult;
        this.checkPendingResult = checkPendingResult;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof h) && Intrinsics.c(this.key, ((h) otherWorker).key);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof h) && Intrinsics.c(this.key, ((h) otherWorker).key);
    }

    public final Object h(mu.i<? super b> iVar, List<? extends Uri> list, mt.b<? super Unit> bVar) {
        String string;
        int columnIndex;
        if (list.isEmpty()) {
            Object emit = iVar.emit(b.a.f13934a, bVar);
            return emit == nt.c.e() ? emit : Unit.f22894a;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : list) {
            Cursor query = this.context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    string = (!query.moveToFirst() || (columnIndex = query.getColumnIndex("_display_name")) < 0) ? null : query.getString(columnIndex);
                    tt.c.a(query, null);
                    if (string != null) {
                        arrayList.add(new SelectedFile(uri, string));
                    }
                } finally {
                }
            }
            string = uri.getLastPathSegment();
            if (string == null) {
                string = "file";
            }
            arrayList.add(new SelectedFile(uri, string));
        }
        if (arrayList.isEmpty()) {
            Object emit2 = iVar.emit(b.C0260b.f13935a, bVar);
            return emit2 == nt.c.e() ? emit2 : Unit.f22894a;
        }
        Object emit3 = iVar.emit(new b.Success(arrayList), bVar);
        return emit3 == nt.c.e() ? emit3 : Unit.f22894a;
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return mu.j.y(mu.j.w(new c(null)), g1.b());
    }
}
