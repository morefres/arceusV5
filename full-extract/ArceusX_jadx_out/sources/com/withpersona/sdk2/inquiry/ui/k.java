package com.withpersona.sdk2.inquiry.ui;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mr.t1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import sm.w;
import w.d;
import wm.o;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001c(Bg\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000b\u0012\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/k;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/ui/k$b;", "Ltr/h;", "Lg/c;", "Lkp/b;", "customTabsLauncher", "Lor/c;", "uiService", "Lsm/w;", "moshi", "", "sessionToken", "inquiryId", "url", "componentName", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Lg/c;Lor/c;Lsm/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "otherWorker", "", "c", "(Lwm/o;)Z", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lg/c;", "Lor/c;", rl.d.f30696a, "Lsm/w;", "e", "Ljava/lang/String;", "f", "g", "h", "i", "Ljava/util/Map;", ve.a.f33391e, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements o<b>, tr.h<b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<kp.b> customTabsLauncher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final or.c uiService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w moshi;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String componentName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, ComponentParam> componentParams;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JM\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/k$a;", "", "", "sessionToken", "inquiryId", "url", "componentName", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "Lcom/withpersona/sdk2/inquiry/ui/k;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/ui/k;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        k a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String url, @NotNull String componentName, @NotNull Map<String, ? extends ComponentParam> componentParams);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/k$b;", "", ve.a.f33391e, j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/ui/k$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/k$b$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/k$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/k$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f13966a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1215598964;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/k$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/k$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.ui.k$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class Error implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo errorInfo;

            public Error(@NotNull InternalErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                this.errorInfo = errorInfo;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final InternalErrorInfo getErrorInfo() {
                return this.errorInfo;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.errorInfo, ((Error) other).errorInfo);
            }

            public int hashCode() {
                return this.errorInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorInfo=" + this.errorInfo + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/ui/k$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1", f = "VerifyReusablePersonaWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_14, 51, 56, HtmlCompat.FROM_HTML_MODE_COMPACT, 73, 82, 84}, m = "invokeSuspend")
    public static final class c extends m implements Function2<mu.i<? super b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f13968t;

        /* renamed from: u, reason: collision with root package name */
        public Object f13969u;

        /* renamed from: v, reason: collision with root package name */
        public int f13970v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f13971w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1$1", f = "VerifyReusablePersonaWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f13973t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k f13974u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f13975v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, String str, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f13974u = kVar;
                this.f13975v = str;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f13974u, this.f13975v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f13973t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                g.c cVar = this.f13974u.customTabsLauncher;
                w.d a10 = new d.e().a();
                Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
                cVar.b(new kp.c(a10, t1.a(this.f13974u.url, this.f13975v, this.f13974u.componentName), null, 4, null));
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = k.this.new c(bVar);
            cVar.f13971w = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x015e, code lost:
        
            if (r0.emit(r9, r8) != r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
        
            if (r0.emit(r3, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x011e, code lost:
        
            if (ju.i.g(r5, r6, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0183, code lost:
        
            if (r0.emit(r2, r8) != r1) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super b> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull g.c<kp.b> customTabsLauncher, @NotNull or.c uiService, @NotNull w moshi, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String url, @NotNull String componentName, @NotNull Map<String, ? extends ComponentParam> componentParams) {
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(uiService, "uiService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        this.customTabsLauncher = customTabsLauncher;
        this.uiService = uiService;
        this.moshi = moshi;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.url = url;
        this.componentName = componentName;
        this.componentParams = componentParams;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return o.b.a(this, otherWorker) && Intrinsics.c(((k) otherWorker).url, this.url);
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return mu.j.w(new c(null));
    }
}
