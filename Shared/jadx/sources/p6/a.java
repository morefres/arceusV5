package p6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import e7.d0;
import e7.h0;
import e7.u;
import gt.o;
import ju.p0;
import k6.j;
import k6.n;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import o6.SourceFetchResult;
import o6.i;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import p6.d;
import s6.d;
import x6.ImageRequest;
import x6.Options;
import x6.SuccessResult;
import x6.r;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u0002&\u000fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001f\u0010 J@\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lp6/a;", "Lp6/d;", "Lk6/s;", "imageLoader", "Le7/d0;", "systemCallbacks", "Lx6/r;", "requestService", "Le7/u;", "logger", "<init>", "(Lk6/s;Le7/d0;Lx6/r;Le7/u;)V", "Lp6/d$a;", "chain", "Lx6/k;", ve.a.f33391e, "(Lp6/d$a;Lmt/b;)Ljava/lang/Object;", "Lx6/g;", "request", "", "mappedData", "Lx6/p;", "options", "Lk6/j;", "eventListener", "Lp6/a$b;", "h", "(Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lmt/b;)Ljava/lang/Object;", "Lk6/h;", "components", "Lo6/i;", "i", "(Lk6/h;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lmt/b;)Ljava/lang/Object;", "Lo6/o;", "fetchResult", "g", "(Lo6/o;Lk6/h;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lmt/b;)Ljava/lang/Object;", "Lk6/s;", j6.b.f21518e, "Le7/d0;", "c", "Lx6/r;", rl.d.f30696a, "Le7/u;", "Ls6/e;", "e", "Ls6/e;", "memoryCacheService", "f", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements p6.d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d0 systemCallbacks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r requestService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final u logger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s6.e memoryCacheService;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lp6/a$b;", "", "Lk6/n;", "image", "", "isSampled", "Lm6/f;", "dataSource", "", "diskCacheKey", "<init>", "(Lk6/n;ZLm6/f;Ljava/lang/String;)V", ve.a.f33391e, "(Lk6/n;ZLm6/f;Ljava/lang/String;)Lp6/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lk6/n;", "e", "()Lk6/n;", j6.b.f21518e, "Z", "f", "()Z", "c", "Lm6/f;", "()Lm6/f;", rl.d.f30696a, "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: p6.a$b, reason: from toString */
    public static final /* data */ class ExecuteResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n image;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isSampled;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final m6.f dataSource;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String diskCacheKey;

        public ExecuteResult(@NotNull n nVar, boolean z10, @NotNull m6.f fVar, @Nullable String str) {
            this.image = nVar;
            this.isSampled = z10;
            this.dataSource = fVar;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ ExecuteResult b(ExecuteResult executeResult, n nVar, boolean z10, m6.f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                nVar = executeResult.image;
            }
            if ((i10 & 2) != 0) {
                z10 = executeResult.isSampled;
            }
            if ((i10 & 4) != 0) {
                fVar = executeResult.dataSource;
            }
            if ((i10 & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.a(nVar, z10, fVar, str);
        }

        @NotNull
        public final ExecuteResult a(@NotNull n image, boolean isSampled, @NotNull m6.f dataSource, @Nullable String diskCacheKey) {
            return new ExecuteResult(image, isSampled, dataSource, diskCacheKey);
        }

        @NotNull
        /* renamed from: c, reason: from getter */
        public final m6.f getDataSource() {
            return this.dataSource;
        }

        @Nullable
        /* renamed from: d, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        @NotNull
        /* renamed from: e, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) other;
            return Intrinsics.c(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && Intrinsics.c(this.diskCacheKey, executeResult.diskCacheKey);
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public int hashCode() {
            int hashCode = ((((this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode()) * 31;
            String str = this.diskCacheKey;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "ExecuteResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", diskCacheKey=" + this.diskCacheKey + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "decode")
    public static final class c extends ot.d {
        public Object A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* renamed from: t, reason: collision with root package name */
        public Object f28454t;

        /* renamed from: u, reason: collision with root package name */
        public Object f28455u;

        /* renamed from: v, reason: collision with root package name */
        public Object f28456v;

        /* renamed from: w, reason: collision with root package name */
        public Object f28457w;

        /* renamed from: x, reason: collision with root package name */
        public Object f28458x;

        /* renamed from: y, reason: collision with root package name */
        public Object f28459y;

        /* renamed from: z, reason: collision with root package name */
        public Object f28460z;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.g(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 130, 148}, m = "execute")
    public static final class d extends ot.d {
        public Object A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: t, reason: collision with root package name */
        public Object f28461t;

        /* renamed from: u, reason: collision with root package name */
        public Object f28462u;

        /* renamed from: v, reason: collision with root package name */
        public Object f28463v;

        /* renamed from: w, reason: collision with root package name */
        public Object f28464w;

        /* renamed from: x, reason: collision with root package name */
        public Object f28465x;

        /* renamed from: y, reason: collision with root package name */
        public Object f28466y;

        /* renamed from: z, reason: collision with root package name */
        public Object f28467z;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.h(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lp6/a$b;", "<anonymous>", "(Lju/p0;)Lp6/a$b;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, mt.b<? super ExecuteResult>, Object> {
        public final /* synthetic */ j A;

        /* renamed from: t, reason: collision with root package name */
        public int f28468t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<i> f28470v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<k6.h> f28471w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f28472x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Object f28473y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ c0<Options> f28474z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c0<i> c0Var, c0<k6.h> c0Var2, ImageRequest imageRequest, Object obj, c0<Options> c0Var3, j jVar, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f28470v = c0Var;
            this.f28471w = c0Var2;
            this.f28472x = imageRequest;
            this.f28473y = obj;
            this.f28474z = c0Var3;
            this.A = jVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new e(this.f28470v, this.f28471w, this.f28472x, this.f28473y, this.f28474z, this.A, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f28468t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = a.this;
            SourceFetchResult sourceFetchResult = (SourceFetchResult) this.f28470v.f22963a;
            k6.h hVar = this.f28471w.f22963a;
            ImageRequest imageRequest = this.f28472x;
            Object obj2 = this.f28473y;
            Options options = this.f28474z.f22963a;
            j jVar = this.A;
            this.f28468t = 1;
            Object g10 = aVar.g(sourceFetchResult, hVar, imageRequest, obj2, options, jVar, this);
            return g10 == e10 ? e10 : g10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super ExecuteResult> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    public static final class f extends ot.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: t, reason: collision with root package name */
        public Object f28475t;

        /* renamed from: u, reason: collision with root package name */
        public Object f28476u;

        /* renamed from: v, reason: collision with root package name */
        public Object f28477v;

        /* renamed from: w, reason: collision with root package name */
        public Object f28478w;

        /* renamed from: x, reason: collision with root package name */
        public Object f28479x;

        /* renamed from: y, reason: collision with root package name */
        public Object f28480y;

        /* renamed from: z, reason: collision with root package name */
        public Object f28481z;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.i(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    public static final class g extends ot.d {
        public Object A;
        public Object B;
        public Object C;
        public /* synthetic */ Object D;
        public int F;

        /* renamed from: t, reason: collision with root package name */
        public Object f28482t;

        /* renamed from: u, reason: collision with root package name */
        public Object f28483u;

        /* renamed from: v, reason: collision with root package name */
        public Object f28484v;

        /* renamed from: w, reason: collision with root package name */
        public Object f28485w;

        /* renamed from: x, reason: collision with root package name */
        public Object f28486x;

        /* renamed from: y, reason: collision with root package name */
        public Object f28487y;

        /* renamed from: z, reason: collision with root package name */
        public Object f28488z;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.D = obj;
            this.F |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx6/t;", "<anonymous>", "(Lju/p0;)Lx6/t;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, mt.b<? super SuccessResult>, Object> {
        public final /* synthetic */ d.a A;

        /* renamed from: t, reason: collision with root package name */
        public int f28489t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f28491v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Object f28492w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Options f28493x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ j f28494y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ d.Key f28495z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ImageRequest imageRequest, Object obj, Options options, j jVar, d.Key key, d.a aVar, mt.b<? super h> bVar) {
            super(2, bVar);
            this.f28491v = imageRequest;
            this.f28492w = obj;
            this.f28493x = options;
            this.f28494y = jVar;
            this.f28495z = key;
            this.A = aVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new h(this.f28491v, this.f28492w, this.f28493x, this.f28494y, this.f28495z, this.A, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object h10;
            Object e10 = nt.c.e();
            int i10 = this.f28489t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                ImageRequest imageRequest = this.f28491v;
                Object obj2 = this.f28492w;
                Options options = this.f28493x;
                j jVar = this.f28494y;
                this.f28489t = 1;
                h10 = aVar.h(imageRequest, obj2, options, jVar, this);
                if (h10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                h10 = obj;
            }
            ExecuteResult executeResult = (ExecuteResult) h10;
            a.this.systemCallbacks.a();
            boolean h11 = a.this.memoryCacheService.h(this.f28495z, this.f28491v, executeResult);
            n image = executeResult.getImage();
            ImageRequest imageRequest2 = this.f28491v;
            m6.f dataSource = executeResult.getDataSource();
            d.Key key = this.f28495z;
            if (!h11) {
                key = null;
            }
            return new SuccessResult(image, imageRequest2, dataSource, key, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), h0.p(this.A));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super SuccessResult> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public a(@NotNull s sVar, @NotNull d0 d0Var, @NotNull r rVar, @Nullable u uVar) {
        this.imageLoader = sVar;
        this.systemCallbacks = d0Var;
        this.requestService = rVar;
        this.logger = uVar;
        this.memoryCacheService = new s6.e(sVar, rVar, uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // p6.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull p6.d.a r19, @org.jetbrains.annotations.NotNull mt.b<? super x6.k> r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.a(p6.d$a, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0099 -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(o6.SourceFetchResult r7, k6.h r8, x6.ImageRequest r9, java.lang.Object r10, x6.Options r11, k6.j r12, mt.b<? super p6.a.ExecuteResult> r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.g(o6.o, k6.h, x6.g, java.lang.Object, x6.p, k6.j, mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0226, code lost:
    
        if (r0 == r9) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, k6.h] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, k6.h] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, x6.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(x6.ImageRequest r18, java.lang.Object r19, x6.Options r20, k6.j r21, mt.b<? super p6.a.ExecuteResult> r22) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.h(x6.g, java.lang.Object, x6.p, k6.j, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(k6.h r7, x6.ImageRequest r8, java.lang.Object r9, x6.Options r10, k6.j r11, mt.b<? super o6.i> r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof p6.a.f
            if (r0 == 0) goto L13
            r0 = r12
            p6.a$f r0 = (p6.a.f) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            p6.a$f r0 = new p6.a$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.B
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L4e
            int r7 = r0.A
            java.lang.Object r8 = r0.f28481z
            o6.j r8 = (o6.j) r8
            java.lang.Object r9 = r0.f28480y
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r9 = r0.f28479x
            k6.j r9 = (k6.j) r9
            java.lang.Object r10 = r0.f28478w
            x6.p r10 = (x6.Options) r10
            java.lang.Object r11 = r0.f28477v
            java.lang.Object r2 = r0.f28476u
            x6.g r2 = (x6.ImageRequest) r2
            java.lang.Object r4 = r0.f28475t
            k6.h r4 = (k6.h) r4
            gt.o.b(r12)
            r5 = r4
            r4 = r7
            r7 = r5
            r5 = r2
            r2 = r8
            r8 = r5
            r5 = r11
            r11 = r9
            r9 = r5
            goto L93
        L4e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L56:
            gt.o.b(r12)
            r12 = 0
        L5a:
            k6.s r2 = r6.imageLoader
            kotlin.Pair r12 = r7.m(r9, r10, r2, r12)
            if (r12 == 0) goto Lb2
            java.lang.Object r2 = r12.c()
            o6.j r2 = (o6.j) r2
            java.lang.Object r4 = r12.d()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r3
            r11.h(r8, r2, r10)
            r0.f28475t = r7
            r0.f28476u = r8
            r0.f28477v = r9
            r0.f28478w = r10
            r0.f28479x = r11
            java.lang.Object r12 = ot.l.a(r12)
            r0.f28480y = r12
            r0.f28481z = r2
            r0.A = r4
            r0.D = r3
            java.lang.Object r12 = r2.a(r0)
            if (r12 != r1) goto L93
            return r1
        L93:
            o6.i r12 = (o6.i) r12
            r11.g(r8, r2, r10, r12)     // Catch: java.lang.Throwable -> L9d
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r12 = r4
            goto L5a
        L9d:
            r7 = move-exception
            boolean r8 = r12 instanceof o6.SourceFetchResult
            if (r8 == 0) goto La5
            o6.o r12 = (o6.SourceFetchResult) r12
            goto La6
        La5:
            r12 = 0
        La6:
            if (r12 == 0) goto Lb1
            m6.s r8 = r12.getSource()
            if (r8 == 0) goto Lb1
            e7.h0.i(r8)
        Lb1:
            throw r7
        Lb2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unable to create a fetcher that supports: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.i(k6.h, x6.g, java.lang.Object, x6.p, k6.j, mt.b):java.lang.Object");
    }
}
