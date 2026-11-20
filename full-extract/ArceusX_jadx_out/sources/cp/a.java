package cp;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.share.attribution.RequestError;
import gt.n;
import gt.o;
import ju.k;
import ju.l0;
import ju.n;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import lp.e;
import mu.c0;
import mu.h;
import mu.i;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import td.c;
import tu.g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0016B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006+"}, d2 = {"Lcp/a;", "", "Landroid/content/Context;", "applicationContext", "Llp/e$a;", "loggerFactory", "Lcp/f;", "standardIntegrityManagerFactory", "Lju/l0;", "dispatcher", "<init>", "(Landroid/content/Context;Llp/e$a;Lcp/f;Lju/l0;)V", "", "cloudProjectNumber", "", "h", "(Ljava/lang/String;)V", "g", "(Lmt/b;)Ljava/lang/Object;", "i", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Llp/e$a;", "c", "Lcp/f;", rl.d.f30696a, "Lju/l0;", "Llp/e;", "e", "Llp/e;", "logger", "Ltu/a;", "f", "Ltu/a;", "mutex", "Lju/p0;", "Lju/p0;", "coroutineScope", "Lmu/c0;", "Lcp/a$b;", "Lmu/c0;", "playIntegrityState", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    public static final long f14091j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final e.a loggerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f standardIntegrityManagerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 dispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.e logger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.a mutex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<b> playIntegrityState;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcp/a$b;", "", j6.b.f21518e, "c", ve.a.f33391e, rl.d.f30696a, "Lcp/a$b$a;", "Lcp/a$b$b;", "Lcp/a$b$c;", "Lcp/a$b$d;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcp/a$b$a;", "Lcp/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: cp.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C0265a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0265a f14099a = new C0265a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0265a);
            }

            public int hashCode() {
                return 1174409699;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcp/a$b$b;", "Lcp/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: cp.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0266b implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0266b f14100a = new C0266b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0266b);
            }

            public int hashCode() {
                return -384804045;
            }

            @NotNull
            public String toString() {
                return "NotStarted";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcp/a$b$c;", "Lcp/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f14101a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -230105505;
            }

            @NotNull
            public String toString() {
                return "Preparing";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcp/a$b$d;", "Lcp/a$b;", "Ltd/c$c;", "integrityTokenProvider", "<init>", "(Ltd/c$c;)V", ve.a.f33391e, "Ltd/c$c;", "()Ltd/c$c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final c.InterfaceC0579c integrityTokenProvider;

            public d(@NotNull c.InterfaceC0579c integrityTokenProvider) {
                Intrinsics.checkNotNullParameter(integrityTokenProvider, "integrityTokenProvider");
                this.integrityTokenProvider = integrityTokenProvider;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final c.InterfaceC0579c getIntegrityTokenProvider() {
                return this.integrityTokenProvider;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2", f = "PlayIntegrityHelper.kt", l = {119, 158}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super String>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f14103t;

        /* renamed from: u, reason: collision with root package name */
        public Object f14104u;

        /* renamed from: v, reason: collision with root package name */
        public int f14105v;

        /* renamed from: w, reason: collision with root package name */
        public int f14106w;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: cp.a$c$a, reason: collision with other inner class name */
        public static final class C0267a implements Function1<c.b, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<String> f14108a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0267a(n<? super String> nVar) {
                this.f14108a = nVar;
            }

            public final void a(c.b bVar) {
                n<String> nVar = this.f14108a;
                n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(bVar.a()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(c.b bVar) {
                a(bVar);
                return Unit.f22894a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements sb.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f14109a;
            public final /* synthetic */ ju.n<String> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(a aVar, ju.n<? super String> nVar) {
                this.f14109a = aVar;
                this.b = nVar;
            }

            @Override // sb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                lp.e.b(this.f14109a.logger, "integrity:request:" + it.getMessage(), null, 2, null);
                this.b.resumeWith(gt.n.b(null));
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmu/i;", "Lcp/a$b;", "", "it", "", "<anonymous>", "(Lmu/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2", f = "PlayIntegrityHelper.kt", l = {}, m = "invokeSuspend")
        /* renamed from: cp.a$c$c, reason: collision with other inner class name */
        public static final class C0268c extends m implements yt.n<i<? super b>, Throwable, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f14110t;

            public C0268c(mt.b<? super C0268c> bVar) {
                super(3, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f14110t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                b.C0265a c0265a = b.C0265a.f14099a;
                return Unit.f22894a;
            }

            @Override // yt.n
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b> iVar, Throwable th2, mt.b<? super Unit> bVar) {
                return new C0268c(bVar).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements h<b> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f14111a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: cp.a$c$d$a, reason: collision with other inner class name */
            public static final class C0269a<T> implements i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f14112a;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @ot.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2", f = "PlayIntegrityHelper.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
                /* renamed from: cp.a$c$d$a$a, reason: collision with other inner class name */
                public static final class C0270a extends ot.d {
                    public int A;

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f14113t;

                    /* renamed from: u, reason: collision with root package name */
                    public int f14114u;

                    /* renamed from: v, reason: collision with root package name */
                    public Object f14115v;

                    /* renamed from: w, reason: collision with root package name */
                    public Object f14116w;

                    /* renamed from: y, reason: collision with root package name */
                    public Object f14118y;

                    /* renamed from: z, reason: collision with root package name */
                    public Object f14119z;

                    public C0270a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        this.f14113t = obj;
                        this.f14114u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return C0269a.this.emit(null, this);
                    }
                }

                public C0269a(i iVar) {
                    this.f14112a = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // mu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, mt.b r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof cp.a.c.d.C0269a.C0270a
                        if (r0 == 0) goto L13
                        r0 = r7
                        cp.a$c$d$a$a r0 = (cp.a.c.d.C0269a.C0270a) r0
                        int r1 = r0.f14114u
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14114u = r1
                        goto L18
                    L13:
                        cp.a$c$d$a$a r0 = new cp.a$c$d$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f14113t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f14114u
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.f14119z
                        mu.i r6 = (mu.i) r6
                        java.lang.Object r6 = r0.f14116w
                        cp.a$c$d$a$a r6 = (cp.a.c.d.C0269a.C0270a) r6
                        gt.o.b(r7)
                        goto L6d
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        gt.o.b(r7)
                        mu.i r7 = r5.f14112a
                        r2 = r6
                        cp.a$b r2 = (cp.a.b) r2
                        boolean r4 = r2 instanceof cp.a.b.C0265a
                        if (r4 != 0) goto L49
                        boolean r2 = r2 instanceof cp.a.b.d
                        if (r2 == 0) goto L6d
                    L49:
                        java.lang.Object r2 = ot.l.a(r6)
                        r0.f14115v = r2
                        java.lang.Object r2 = ot.l.a(r0)
                        r0.f14116w = r2
                        java.lang.Object r2 = ot.l.a(r6)
                        r0.f14118y = r2
                        java.lang.Object r2 = ot.l.a(r7)
                        r0.f14119z = r2
                        r2 = 0
                        r0.A = r2
                        r0.f14114u = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L6d
                        return r1
                    L6d:
                        kotlin.Unit r6 = kotlin.Unit.f22894a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cp.a.c.d.C0269a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            public d(h hVar) {
                this.f14111a = hVar;
            }

            @Override // mu.h
            public Object collect(i<? super b> iVar, mt.b bVar) {
                Object collect = this.f14111a.collect(new C0269a(iVar), bVar);
                return collect == nt.c.e() ? collect : Unit.f22894a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e implements h<c.InterfaceC0579c> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f14120a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: cp.a$c$e$a, reason: collision with other inner class name */
            public static final class C0271a<T> implements i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f14121a;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @ot.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2", f = "PlayIntegrityHelper.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
                /* renamed from: cp.a$c$e$a$a, reason: collision with other inner class name */
                public static final class C0272a extends ot.d {
                    public int A;

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f14122t;

                    /* renamed from: u, reason: collision with root package name */
                    public int f14123u;

                    /* renamed from: v, reason: collision with root package name */
                    public Object f14124v;

                    /* renamed from: x, reason: collision with root package name */
                    public Object f14126x;

                    /* renamed from: y, reason: collision with root package name */
                    public Object f14127y;

                    /* renamed from: z, reason: collision with root package name */
                    public Object f14128z;

                    public C0272a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        this.f14122t = obj;
                        this.f14123u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return C0271a.this.emit(null, this);
                    }
                }

                public C0271a(i iVar) {
                    this.f14121a = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // mu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, mt.b r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof cp.a.c.e.C0271a.C0272a
                        if (r0 == 0) goto L13
                        r0 = r8
                        cp.a$c$e$a$a r0 = (cp.a.c.e.C0271a.C0272a) r0
                        int r1 = r0.f14123u
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14123u = r1
                        goto L18
                    L13:
                        cp.a$c$e$a$a r0 = new cp.a$c$e$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f14122t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f14123u
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f14128z
                        mu.i r7 = (mu.i) r7
                        java.lang.Object r7 = r0.f14126x
                        cp.a$c$e$a$a r7 = (cp.a.c.e.C0271a.C0272a) r7
                        gt.o.b(r8)
                        goto L74
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        gt.o.b(r8)
                        mu.i r8 = r6.f14121a
                        r2 = r7
                        cp.a$b r2 = (cp.a.b) r2
                        boolean r4 = r2 instanceof cp.a.b.d
                        r5 = 0
                        if (r4 == 0) goto L49
                        cp.a$b$d r2 = (cp.a.b.d) r2
                        goto L4a
                    L49:
                        r2 = r5
                    L4a:
                        if (r2 == 0) goto L50
                        td.c$c r5 = r2.getIntegrityTokenProvider()
                    L50:
                        java.lang.Object r2 = ot.l.a(r7)
                        r0.f14124v = r2
                        java.lang.Object r2 = ot.l.a(r0)
                        r0.f14126x = r2
                        java.lang.Object r7 = ot.l.a(r7)
                        r0.f14127y = r7
                        java.lang.Object r7 = ot.l.a(r8)
                        r0.f14128z = r7
                        r7 = 0
                        r0.A = r7
                        r0.f14123u = r3
                        java.lang.Object r7 = r8.emit(r5, r0)
                        if (r7 != r1) goto L74
                        return r1
                    L74:
                        kotlin.Unit r7 = kotlin.Unit.f22894a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cp.a.c.e.C0271a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            public e(h hVar) {
                this.f14120a = hVar;
            }

            @Override // mu.h
            public Object collect(i<? super c.InterfaceC0579c> iVar, mt.b bVar) {
                Object collect = this.f14120a.collect(new C0271a(iVar), bVar);
                return collect == nt.c.e() ? collect : Unit.f22894a;
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new c(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        
            if (r8 == r0) goto L24;
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
                int r1 = r7.f14106w
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r7.f14104u
                cp.a r0 = (cp.a) r0
                java.lang.Object r0 = r7.f14103t
                td.c$c r0 = (td.c.InterfaceC0579c) r0
                gt.o.b(r8)
                return r8
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                gt.o.b(r8)
                goto L63
            L27:
                gt.o.b(r8)
                cp.a r8 = cp.a.this
                mu.c0 r8 = cp.a.e(r8)
                java.lang.Object r8 = r8.getValue()
                boolean r8 = r8 instanceof cp.a.b.C0266b
                if (r8 == 0) goto L39
                return r3
            L39:
                cp.a r8 = cp.a.this
                mu.c0 r8 = cp.a.e(r8)
                cp.a$c$d r1 = new cp.a$c$d
                r1.<init>(r8)
                long r5 = cp.a.b()
                mu.h r8 = mu.j.O(r1, r5)
                cp.a$c$c r1 = new cp.a$c$c
                r1.<init>(r3)
                mu.h r8 = mu.j.f(r8, r1)
                cp.a$c$e r1 = new cp.a$c$e
                r1.<init>(r8)
                r7.f14106w = r4
                java.lang.Object r8 = mu.j.v(r1, r7)
                if (r8 != r0) goto L63
                goto Lbc
            L63:
                td.c$c r8 = (td.c.InterfaceC0579c) r8
                if (r8 != 0) goto L68
                return r3
            L68:
                cp.a r1 = cp.a.this
                r7.f14103t = r8
                r7.f14104u = r1
                r3 = 0
                r7.f14105v = r3
                r7.f14106w = r2
                ju.p r2 = new ju.p
                mt.b r3 = nt.b.c(r7)
                r2.<init>(r3, r4)
                r2.F()
                td.c$d$a r3 = td.c.d.a()
                java.util.UUID r4 = java.util.UUID.randomUUID()
                java.lang.String r4 = r4.toString()
                td.c$d$a r3 = r3.b(r4)
                td.c$d r3 = r3.a()
                com.google.android.gms.tasks.Task r8 = r8.a(r3)
                cp.a$c$a r3 = new cp.a$c$a
                r3.<init>(r2)
                cp.b r4 = new cp.b
                r4.<init>(r3)
                com.google.android.gms.tasks.Task r8 = r8.g(r4)
                cp.a$c$b r3 = new cp.a$c$b
                r3.<init>(r1, r2)
                r8.e(r3)
                java.lang.Object r8 = r2.z()
                java.lang.Object r1 = nt.c.e()
                if (r8 != r1) goto Lba
                ot.h.c(r7)
            Lba:
                if (r8 != r0) goto Lbd
            Lbc:
                return r0
            Lbd:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cp.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super String> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1", f = "PlayIntegrityHelper.kt", l = {153, 72, 156, 91, 95}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {
        public int A;
        public int B;
        public final /* synthetic */ String D;

        /* renamed from: t, reason: collision with root package name */
        public Object f14129t;

        /* renamed from: u, reason: collision with root package name */
        public Object f14130u;

        /* renamed from: v, reason: collision with root package name */
        public Object f14131v;

        /* renamed from: w, reason: collision with root package name */
        public Object f14132w;

        /* renamed from: x, reason: collision with root package name */
        public Object f14133x;

        /* renamed from: y, reason: collision with root package name */
        public int f14134y;

        /* renamed from: z, reason: collision with root package name */
        public int f14135z;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: cp.a$d$a, reason: collision with other inner class name */
        public static final class C0273a implements Function1<c.InterfaceC0579c, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ju.n<gt.n<? extends c.InterfaceC0579c>> f14136a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0273a(ju.n<? super gt.n<? extends c.InterfaceC0579c>> nVar) {
                this.f14136a = nVar;
            }

            public final void a(c.InterfaceC0579c interfaceC0579c) {
                this.f14136a.resumeWith(gt.n.b(gt.n.a(gt.n.b(interfaceC0579c))));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(c.InterfaceC0579c interfaceC0579c) {
                a(interfaceC0579c);
                return Unit.f22894a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements sb.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ju.n<gt.n<? extends c.InterfaceC0579c>> f14137a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(ju.n<? super gt.n<? extends c.InterfaceC0579c>> nVar) {
                this.f14137a = nVar;
            }

            @Override // sb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ju.n<gt.n<? extends c.InterfaceC0579c>> nVar = this.f14137a;
                n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(gt.n.a(gt.n.b(o.a(it)))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, mt.b<? super d> bVar) {
            super(2, bVar);
            this.D = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new d(this.D, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x01de, code lost:
        
            if (r3.emit(r6, r17) == r0) goto L55;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0168 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:12:0x01e1, B:23:0x015c, B:25:0x0168, B:29:0x0199, B:40:0x00f4, B:42:0x0152, B:50:0x00c0, B:52:0x00d0, B:55:0x00d6), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0199 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:12:0x01e1, B:23:0x015c, B:25:0x0168, B:29:0x0199, B:40:0x00f4, B:42:0x0152, B:50:0x00c0, B:52:0x00d0, B:55:0x00d6), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0152 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:12:0x01e1, B:23:0x015c, B:25:0x0168, B:29:0x0199, B:40:0x00f4, B:42:0x0152, B:50:0x00c0, B:52:0x00d0, B:55:0x00d6), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [tu.a] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v14 */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cp.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2", f = "PlayIntegrityHelper.kt", l = {153, 144}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f14138t;

        /* renamed from: u, reason: collision with root package name */
        public Object f14139u;

        /* renamed from: v, reason: collision with root package name */
        public int f14140v;

        /* renamed from: w, reason: collision with root package name */
        public int f14141w;

        /* renamed from: x, reason: collision with root package name */
        public int f14142x;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            tu.a aVar;
            a aVar2;
            int i10;
            tu.a aVar3;
            Throwable th2;
            Object e10 = nt.c.e();
            int i11 = this.f14142x;
            try {
                if (i11 == 0) {
                    o.b(obj);
                    aVar = a.this.mutex;
                    a aVar4 = a.this;
                    this.f14138t = aVar;
                    this.f14139u = aVar4;
                    this.f14140v = 0;
                    this.f14142x = 1;
                    if (aVar.c(null, this) != e10) {
                        aVar2 = aVar4;
                        i10 = 0;
                    }
                    return e10;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (tu.a) this.f14138t;
                    try {
                        o.b(obj);
                        Unit unit = Unit.f22894a;
                        aVar3.f(null);
                        return Unit.f22894a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar3.f(null);
                        throw th2;
                    }
                }
                i10 = this.f14140v;
                aVar2 = (a) this.f14139u;
                tu.a aVar5 = (tu.a) this.f14138t;
                o.b(obj);
                aVar = aVar5;
                c0 c0Var = aVar2.playIntegrityState;
                b.C0266b c0266b = b.C0266b.f14100a;
                this.f14138t = aVar;
                this.f14139u = null;
                this.f14140v = i10;
                this.f14141w = 0;
                this.f14142x = 2;
                if (c0Var.emit(c0266b, this) != e10) {
                    aVar3 = aVar;
                    Unit unit2 = Unit.f22894a;
                    aVar3.f(null);
                    return Unit.f22894a;
                }
                return e10;
            } catch (Throwable th4) {
                aVar3 = aVar;
                th2 = th4;
                aVar3.f(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        a.Companion companion = kotlin.time.a.INSTANCE;
        f14091j = kotlin.time.b.p(10, iu.b.f21121e);
    }

    public a(@NotNull Context applicationContext, @NotNull e.a loggerFactory, @NotNull f standardIntegrityManagerFactory, @NotNull l0 dispatcher) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(standardIntegrityManagerFactory, "standardIntegrityManagerFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.applicationContext = applicationContext;
        this.loggerFactory = loggerFactory;
        this.standardIntegrityManagerFactory = standardIntegrityManagerFactory;
        this.dispatcher = dispatcher;
        this.logger = loggerFactory.create("com.withpersona.sdk2.inquiry.integrity");
        this.mutex = g.b(false, 1, null);
        this.coroutineScope = q0.a(dispatcher.plus(z2.b(null, 1, null)));
        this.playIntegrityState = r0.a(b.C0266b.f14100a);
    }

    @Nullable
    public final Object g(@NotNull mt.b<? super String> bVar) {
        return ju.i.g(this.dispatcher, new c(null), bVar);
    }

    public final void h(@NotNull String cloudProjectNumber) {
        Intrinsics.checkNotNullParameter(cloudProjectNumber, "cloudProjectNumber");
        k.d(this.coroutineScope, null, null, new d(cloudProjectNumber, null), 3, null);
    }

    @Nullable
    public final Object i(@NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(this.dispatcher, new e(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }
}
