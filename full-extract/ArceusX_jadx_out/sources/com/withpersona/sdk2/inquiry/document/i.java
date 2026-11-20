package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.net.Uri;
import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.document.i;
import h.f;
import java.util.List;
import ju.g1;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import wm.o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0011\u0013\u001eB/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "Ltr/h;", "", "key", "Landroid/content/Context;", "context", "Loq/c;", "sdkFilesManager", "Lkotlin/Function0;", "", "launchPicker", "<init>", "(Ljava/lang/String;Landroid/content/Context;Loq/c;Lkotlin/jvm/functions/Function0;)V", "otherWorker", "", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", "Lmu/h;", "run", "()Lmu/h;", "Lmu/i;", "", "Landroid/net/Uri;", "documentSelectResult", "f", "(Lmu/i;Ljava/util/List;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Ljava/lang/String;", "Landroid/content/Context;", rl.d.f30696a, "Loq/c;", "e", "Lkotlin/jvm/functions/Function0;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements o<c>, tr.h<c> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10265a = new a("FileNotFound", 0);
        public static final a b = new a("PermissionDenied", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f10266c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ pt.a f10267d;

        static {
            a[] a10 = a();
            f10266c = a10;
            f10267d = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f10265a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10266c.clone();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$b;", "", "Lg/c;", "", "", "openDocumentLauncher", "Lg/h;", "selectFromPhotoLibraryLauncher", "Landroid/content/Context;", "context", "Loq/c;", "sdkFilesManager", "<init>", "(Lg/c;Lg/c;Landroid/content/Context;Loq/c;)V", "Lcom/withpersona/sdk2/inquiry/document/i;", "c", "()Lcom/withpersona/sdk2/inquiry/document/i;", "e", ve.a.f33391e, "Lg/c;", j6.b.f21518e, "Landroid/content/Context;", rl.d.f30696a, "Loq/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g.c<String[]> openDocumentLauncher;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.c<g.h> selectFromPhotoLibraryLauncher;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final oq.c sdkFilesManager;

        public b(@NotNull g.c<String[]> openDocumentLauncher, @NotNull g.c<g.h> selectFromPhotoLibraryLauncher, @NotNull Context context, @NotNull oq.c sdkFilesManager) {
            Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
            Intrinsics.checkNotNullParameter(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
            this.openDocumentLauncher = openDocumentLauncher;
            this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
            this.context = context;
            this.sdkFilesManager = sdkFilesManager;
        }

        public static final Unit d(b bVar) {
            bVar.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
            return Unit.f22894a;
        }

        public static final Unit f(b bVar) {
            bVar.selectFromPhotoLibraryLauncher.b(g.i.b(f.d.f18923a, 0, false, null, 14, null));
            return Unit.f22894a;
        }

        @NotNull
        public final i c() {
            return new i("DocumentPicker", this.context, this.sdkFilesManager, new Function0() { // from class: xn.l2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit d10;
                    d10 = i.b.d(i.b.this);
                    return d10;
                }
            });
        }

        @NotNull
        public final i e() {
            return new i("PhotoLibraryPicker", this.context, this.sdkFilesManager, new Function0() { // from class: xn.m2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit f10;
                    f10 = i.b.f(i.b.this);
                    return f10;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "<init>", "()V", "c", j6.b.f21518e, ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/document/i$c$a;", "Lcom/withpersona/sdk2/inquiry/document/i$c$b;", "Lcom/withpersona/sdk2/inquiry/document/i$c$c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$a;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f10271a = new a();

            public a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$b;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "", "absoluteFilePaths", "Lcom/withpersona/sdk2/inquiry/document/i$a;", "reason", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/i$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/util/List;", "()Ljava/util/List;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/document/i$a;", "getReason", "()Lcom/withpersona/sdk2/inquiry/document/i$a;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.i$c$b, reason: from toString */
        public static final /* data */ class Failure extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<String> absoluteFilePaths;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final a reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull List<String> absoluteFilePaths, @NotNull a reason) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePaths, "absoluteFilePaths");
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.absoluteFilePaths = absoluteFilePaths;
                this.reason = reason;
            }

            @NotNull
            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.c(this.absoluteFilePaths, failure.absoluteFilePaths) && this.reason == failure.reason;
            }

            public int hashCode() {
                return (this.absoluteFilePaths.hashCode() * 31) + this.reason.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failure(absoluteFilePaths=" + this.absoluteFilePaths + ", reason=" + this.reason + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$c;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "", "absoluteFilePaths", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.i$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class Success extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<String> absoluteFilePaths;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<String> absoluteFilePaths) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePaths, "absoluteFilePaths");
                this.absoluteFilePaths = absoluteFilePaths;
            }

            @NotNull
            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.absoluteFilePaths, ((Success) other).absoluteFilePaths);
            }

            public int hashCode() {
                return this.absoluteFilePaths.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(absoluteFilePaths=" + this.absoluteFilePaths + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1", f = "DocumentsSelectWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_14, 49, 53, 57}, m = "invokeSuspend")
    public static final class d extends m implements Function2<mu.i<? super c>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f10274t;

        /* renamed from: u, reason: collision with root package name */
        public int f10275u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10276v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$1", f = "DocumentsSelectWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f10278t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i f10279u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f10279u = iVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f10279u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f10278t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                this.f10279u.launchPicker.invoke();
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f10280a;
            public final /* synthetic */ mu.i<c> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(i iVar, mu.i<? super c> iVar2) {
                this.f10280a = iVar;
                this.b = iVar2;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends Uri> list, mt.b<? super Unit> bVar) {
                Object f10 = this.f10280a.f(this.b, list, bVar);
                return f10 == nt.c.e() ? f10 : Unit.f22894a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Landroid/net/Uri;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$documentSelectResult$1", f = "DocumentsSelectWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_15}, m = "invokeSuspend")
        public static final class c extends m implements Function2<p0, mt.b<? super List<? extends Uri>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f10281t;

            public c(mt.b<? super c> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new c(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f10281t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                v vVar = new v();
                this.f10281t = 1;
                Object v5 = mu.j.v(vVar, this);
                return v5 == e10 ? e10 : v5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super List<? extends Uri>> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            d dVar = i.this.new d(bVar);
            dVar.f10276v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ac, code lost:
        
            if (r10.collect(r3, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            if (r10.f(r0, r2, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        
            if (ju.i.g(r10, r6, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
        
            if (r10 == r1) goto L29;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f10276v
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r9.f10275u
                r3 = 0
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L3e
                if (r2 == r7) goto L3a
                if (r2 == r6) goto L32
                if (r2 == r5) goto L2a
                if (r2 == r4) goto L21
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r0 = r9.f10274t
                java.util.List r0 = (java.util.List) r0
                gt.o.b(r10)
                goto Laf
            L2a:
                java.lang.Object r2 = r9.f10274t
                java.util.List r2 = (java.util.List) r2
                gt.o.b(r10)
                goto L8e
            L32:
                java.lang.Object r0 = r9.f10274t
                java.util.List r0 = (java.util.List) r0
                gt.o.b(r10)
                goto L6f
            L3a:
                gt.o.b(r10)
                goto L53
            L3e:
                gt.o.b(r10)
                com.withpersona.sdk2.inquiry.document.i$d$c r10 = new com.withpersona.sdk2.inquiry.document.i$d$c
                r10.<init>(r3)
                r9.f10276v = r0
                r9.f10275u = r7
                r7 = 100
                java.lang.Object r10 = ju.g3.e(r7, r10, r9)
                if (r10 != r1) goto L53
                goto Lae
            L53:
                r2 = r10
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L72
                com.withpersona.sdk2.inquiry.document.i r10 = com.withpersona.sdk2.inquiry.document.i.this
                java.lang.Object r3 = ot.l.a(r0)
                r9.f10276v = r3
                java.lang.Object r3 = ot.l.a(r2)
                r9.f10274t = r3
                r9.f10275u = r6
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.document.i.e(r10, r0, r2, r9)
                if (r10 != r1) goto L6f
                goto Lae
            L6f:
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            L72:
                ju.n2 r10 = ju.g1.c()
                com.withpersona.sdk2.inquiry.document.i$d$a r6 = new com.withpersona.sdk2.inquiry.document.i$d$a
                com.withpersona.sdk2.inquiry.document.i r7 = com.withpersona.sdk2.inquiry.document.i.this
                r6.<init>(r7, r3)
                r9.f10276v = r0
                java.lang.Object r3 = ot.l.a(r2)
                r9.f10274t = r3
                r9.f10275u = r5
                java.lang.Object r10 = ju.i.g(r10, r6, r9)
                if (r10 != r1) goto L8e
                goto Lae
            L8e:
                kp.v r10 = new kp.v
                r10.<init>()
                com.withpersona.sdk2.inquiry.document.i$d$b r3 = new com.withpersona.sdk2.inquiry.document.i$d$b
                com.withpersona.sdk2.inquiry.document.i r5 = com.withpersona.sdk2.inquiry.document.i.this
                r3.<init>(r5, r0)
                java.lang.Object r0 = ot.l.a(r0)
                r9.f10276v = r0
                java.lang.Object r0 = ot.l.a(r2)
                r9.f10274t = r0
                r9.f10275u = r4
                java.lang.Object r10 = r10.collect(r3, r9)
                if (r10 != r1) goto Laf
            Lae:
                return r1
            Laf:
                gt.d r10 = new gt.d
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super c> iVar, mt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public i(@NotNull String key, @NotNull Context context, @NotNull oq.c sdkFilesManager, @NotNull Function0<Unit> launchPicker) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        this.key = key;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
        this.launchPicker = launchPicker;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof i) && Intrinsics.c(this.key, ((i) otherWorker).key);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof i) && Intrinsics.c(this.key, ((i) otherWorker).key);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mu.i<? super com.withpersona.sdk2.inquiry.document.i.c> r11, java.util.List<? extends android.net.Uri> r12, mt.b<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            android.content.Context r1 = r10.context
            android.content.ContentResolver r1 = r1.getContentResolver()
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L20
            com.withpersona.sdk2.inquiry.document.i$c$a r12 = com.withpersona.sdk2.inquiry.document.i.c.a.f10271a
            java.lang.Object r11 = r11.emit(r12, r13)
            java.lang.Object r12 = nt.c.e()
            if (r11 != r12) goto L1d
            return r11
        L1d:
            kotlin.Unit r11 = kotlin.Unit.f22894a
            return r11
        L20:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
            r3 = 0
            r4 = r3
        L2d:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L88
            java.lang.Object r5 = r12.next()
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.String r6 = r1.getType(r5)     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            java.lang.String r6 = r0.getExtensionFromMimeType(r6)     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            oq.c r7 = r10.sdkFilesManager     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            if (r6 != 0) goto L47
            java.lang.String r6 = "jpg"
        L47:
            java.io.File r6 = r7.e(r6)     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            java.io.InputStream r5 = r1.openInputStream(r5)     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            if (r5 == 0) goto L75
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            r7.<init>(r6)     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            r8 = 0
            r9 = 2
            tt.b.b(r5, r7, r8, r9, r3)     // Catch: java.lang.Throwable -> L68
            tt.c.a(r5, r3)     // Catch: java.lang.Throwable -> L66
            tt.c.a(r7, r3)     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            java.lang.String r5 = r6.getAbsolutePath()     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            goto L82
        L66:
            r4 = move-exception
            goto L6f
        L68:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L6a
        L6a:
            r6 = move-exception
            tt.c.a(r5, r4)     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L66
        L6f:
            throw r4     // Catch: java.lang.Throwable -> L70
        L70:
            r5 = move-exception
            tt.c.a(r7, r4)     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            throw r5     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
        L75:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            r4.<init>()     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
            throw r4     // Catch: java.lang.SecurityException -> L7b java.io.FileNotFoundException -> L7f
        L7b:
            com.withpersona.sdk2.inquiry.document.i$a r4 = com.withpersona.sdk2.inquiry.document.i.a.b
        L7d:
            r5 = r3
            goto L82
        L7f:
            com.withpersona.sdk2.inquiry.document.i$a r4 = com.withpersona.sdk2.inquiry.document.i.a.f10265a
            goto L7d
        L82:
            if (r5 == 0) goto L2d
            r2.add(r5)
            goto L2d
        L88:
            if (r4 != 0) goto L9a
            com.withpersona.sdk2.inquiry.document.i$c$c r12 = new com.withpersona.sdk2.inquiry.document.i$c$c
            r12.<init>(r2)
            java.lang.Object r11 = r11.emit(r12, r13)
            java.lang.Object r12 = nt.c.e()
            if (r11 != r12) goto Laa
            return r11
        L9a:
            com.withpersona.sdk2.inquiry.document.i$c$b r12 = new com.withpersona.sdk2.inquiry.document.i$c$b
            r12.<init>(r2, r4)
            java.lang.Object r11 = r11.emit(r12, r13)
            java.lang.Object r12 = nt.c.e()
            if (r11 != r12) goto Laa
            return r11
        Laa:
            kotlin.Unit r11 = kotlin.Unit.f22894a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.i.f(mu.i, java.util.List, mt.b):java.lang.Object");
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<c> run() {
        return mu.j.y(mu.j.w(new d(null)), g1.b());
    }
}
