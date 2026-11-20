package t6;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import k6.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.text.StringsKt;
import kotlin.text.x;
import m6.t;
import n6.a;
import o6.SourceFetchResult;
import o6.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.NetworkHeaders;
import t6.m;
import wu.b0;
import x6.Options;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JB\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00020\u001d2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0006\u0012\u0004\u0018\u00010(0&H\u0082@¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u0004\u0018\u00010\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020.*\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u0014\u00102\u001a\u00020.*\u000201H\u0082@¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u00020.*\u000204H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lt6/m;", "Lo6/j;", "", "url", "Lx6/p;", "options", "Lgt/h;", "Lt6/i;", "networkClient", "Ln6/a;", "diskCache", "Lt6/b;", "cacheStrategy", "Lt6/d;", "connectivityChecker", "<init>", "(Ljava/lang/String;Lx6/p;Lgt/h;Lgt/h;Lgt/h;Lt6/d;)V", "Lo6/i;", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "contentType", "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ln6/a$c;", "m", "()Ln6/a$c;", "snapshot", "Lt6/q;", "cacheResponse", "Lt6/o;", "networkRequest", "networkResponse", "r", "(Ln6/a$c;Lt6/q;Lt6/o;Lt6/q;Lmt/b;)Ljava/lang/Object;", "l", "()Lt6/o;", "T", "request", "Lkotlin/Function2;", "Lmt/b;", "", "block", "h", "(Lt6/o;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "q", "(Ln6/a$c;)Lt6/q;", "Lm6/s;", "o", "(Ln6/a$c;)Lm6/s;", "Lt6/r;", "n", "(Lt6/r;Lmt/b;)Ljava/lang/Object;", "Lwu/e;", "p", "(Lwu/e;)Lm6/s;", "Ljava/lang/String;", j6.b.f21518e, "Lx6/p;", "c", "Lgt/h;", rl.d.f30696a, "e", "f", "Lt6/d;", "i", "()Ljava/lang/String;", "diskCacheKey", "Lwu/l;", "j", "()Lwu/l;", "fileSystem", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m implements o6.j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h<i> networkClient;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h<n6.a> diskCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h<t6.b> cacheStrategy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t6.d connectivityChecker;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Lt6/q;", Payload.RESPONSE, "<anonymous>"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend")
    public static final class b<T> extends ot.m implements Function2<NetworkResponse, mt.b<? super T>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f32006t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32007u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<NetworkResponse, mt.b<? super T>, Object> f32008v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super NetworkResponse, ? super mt.b<? super T>, ? extends Object> function2, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f32008v = function2;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f32008v, bVar);
            bVar2.f32007u = obj;
            return bVar2;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f32007u;
            Object e10 = nt.c.e();
            int i10 = this.f32006t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            int code = networkResponse.getCode();
            if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
                throw new t6.g(networkResponse);
            }
            Function2<NetworkResponse, mt.b<? super T>, Object> function2 = this.f32008v;
            this.f32007u = ot.l.a(networkResponse);
            this.f32006t = 1;
            Object invoke = function2.invoke(networkResponse, this);
            return invoke == e10 ? e10 : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, mt.b<? super T> bVar) {
            return ((b) create(networkResponse, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, 102}, m = "fetch")
    public static final class c extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f32009t;

        /* renamed from: u, reason: collision with root package name */
        public Object f32010u;

        /* renamed from: v, reason: collision with root package name */
        public Object f32011v;

        /* renamed from: w, reason: collision with root package name */
        public Object f32012w;

        /* renamed from: x, reason: collision with root package name */
        public Object f32013x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f32014y;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32014y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return m.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt6/q;", Payload.RESPONSE, "Lo6/o;", "<anonymous>", "(Lt6/q;)Lo6/o;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<NetworkResponse, mt.b<? super SourceFetchResult>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f32016t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32017u;

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            d dVar = m.this.new d(bVar);
            dVar.f32017u = obj;
            return dVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f32017u;
            Object e10 = nt.c.e();
            int i10 = this.f32016t;
            if (i10 == 0) {
                gt.o.b(obj);
                m mVar = m.this;
                r f10 = u6.e.f(networkResponse);
                this.f32017u = networkResponse;
                this.f32016t = 1;
                obj = mVar.n(f10, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            m mVar2 = m.this;
            return new SourceFetchResult((m6.s) obj, mVar2.k(mVar2.url, networkResponse.getHeaders().c("Content-Type")), m6.f.f24339d);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, mt.b<? super SourceFetchResult> bVar) {
            return ((d) create(networkResponse, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt6/q;", Payload.RESPONSE, "Lo6/o;", "<anonymous>", "(Lt6/q;)Lo6/o;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<NetworkResponse, mt.b<? super SourceFetchResult>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f32019t;

        /* renamed from: u, reason: collision with root package name */
        public int f32020u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f32021v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<a.c> f32022w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ m f32023x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ c0<NetworkResponse> f32024y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ NetworkRequest f32025z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c0<a.c> c0Var, m mVar, c0<NetworkResponse> c0Var2, NetworkRequest networkRequest, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f32022w = c0Var;
            this.f32023x = mVar;
            this.f32024y = c0Var2;
            this.f32025z = networkRequest;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            e eVar = new e(this.f32022w, this.f32023x, this.f32024y, this.f32025z, bVar);
            eVar.f32021v = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
        
            if (r12 == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v9, types: [T, t6.q] */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f32021v
                r5 = r0
                t6.q r5 = (t6.NetworkResponse) r5
                java.lang.Object r0 = nt.c.e()
                int r1 = r11.f32020u
                java.lang.String r7 = "Content-Type"
                r8 = 2
                r2 = 1
                r9 = 0
                if (r1 == 0) goto L2d
                if (r1 == r2) goto L24
                if (r1 != r8) goto L1c
                gt.o.b(r12)
                r6 = r11
                goto Laf
            L1c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L24:
                java.lang.Object r1 = r11.f32019t
                kotlin.jvm.internal.c0 r1 = (kotlin.jvm.internal.c0) r1
                gt.o.b(r12)
                r6 = r11
                goto L54
            L2d:
                gt.o.b(r12)
                kotlin.jvm.internal.c0<n6.a$c> r12 = r11.f32022w
                t6.m r1 = r11.f32023x
                T r3 = r12.f22963a
                n6.a$c r3 = (n6.a.c) r3
                kotlin.jvm.internal.c0<t6.q> r4 = r11.f32024y
                T r4 = r4.f22963a
                t6.q r4 = (t6.NetworkResponse) r4
                r6 = r2
                r2 = r3
                r3 = r4
                t6.o r4 = r11.f32025z
                r11.f32021v = r5
                r11.f32019t = r12
                r11.f32020u = r6
                r6 = r11
                java.lang.Object r1 = t6.m.g(r1, r2, r3, r4, r5, r6)
                if (r1 != r0) goto L51
                goto Lae
            L51:
                r10 = r1
                r1 = r12
                r12 = r10
            L54:
                r1.f22963a = r12
                kotlin.jvm.internal.c0<n6.a$c> r12 = r6.f32022w
                T r12 = r12.f22963a
                if (r12 == 0) goto L9e
                kotlin.jvm.internal.c0<t6.q> r0 = r6.f32024y
                t6.m r1 = r6.f32023x
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
                n6.a$c r12 = (n6.a.c) r12
                t6.q r12 = t6.m.f(r1, r12)
                r0.f22963a = r12
                o6.o r12 = new o6.o
                t6.m r0 = r6.f32023x
                kotlin.jvm.internal.c0<n6.a$c> r1 = r6.f32022w
                T r1 = r1.f22963a
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                n6.a$c r1 = (n6.a.c) r1
                m6.s r0 = t6.m.d(r0, r1)
                t6.m r1 = r6.f32023x
                java.lang.String r2 = t6.m.b(r1)
                kotlin.jvm.internal.c0<t6.q> r3 = r6.f32024y
                T r3 = r3.f22963a
                t6.q r3 = (t6.NetworkResponse) r3
                if (r3 == 0) goto L94
                t6.n r3 = r3.getHeaders()
                if (r3 == 0) goto L94
                java.lang.String r9 = r3.c(r7)
            L94:
                java.lang.String r1 = r1.k(r2, r9)
                m6.f r2 = m6.f.f24339d
                r12.<init>(r0, r1, r2)
                return r12
            L9e:
                t6.r r12 = u6.e.f(r5)
                r6.f32021v = r5
                r6.f32019t = r9
                r6.f32020u = r8
                java.lang.Object r12 = u6.e.e(r12, r11)
                if (r12 != r0) goto Laf
            Lae:
                return r0
            Laf:
                wu.e r12 = (wu.e) r12
                long r0 = r12.getSize()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto Ldb
                o6.o r0 = new o6.o
                t6.m r1 = r6.f32023x
                m6.s r12 = t6.m.e(r1, r12)
                t6.m r1 = r6.f32023x
                java.lang.String r2 = t6.m.b(r1)
                t6.n r3 = r5.getHeaders()
                java.lang.String r3 = r3.c(r7)
                java.lang.String r1 = r1.k(r2, r3)
                m6.f r2 = m6.f.f24339d
                r0.<init>(r12, r1, r2)
                return r0
            Ldb:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: t6.m.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, mt.b<? super SourceFetchResult> bVar) {
            return ((e) create(networkResponse, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
    public static final class f extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f32026t;

        /* renamed from: u, reason: collision with root package name */
        public Object f32027u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f32028v;

        /* renamed from: x, reason: collision with root package name */
        public int f32030x;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32028v = obj;
            this.f32030x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return m.this.n(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
    public static final class g extends ot.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public Object f32031t;

        /* renamed from: u, reason: collision with root package name */
        public Object f32032u;

        /* renamed from: v, reason: collision with root package name */
        public Object f32033v;

        /* renamed from: w, reason: collision with root package name */
        public Object f32034w;

        /* renamed from: x, reason: collision with root package name */
        public Object f32035x;

        /* renamed from: y, reason: collision with root package name */
        public Object f32036y;

        /* renamed from: z, reason: collision with root package name */
        public Object f32037z;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return m.this.r(null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull String str, @NotNull Options options, @NotNull gt.h<? extends i> hVar, @NotNull gt.h<? extends n6.a> hVar2, @NotNull gt.h<? extends t6.b> hVar3, @NotNull t6.d dVar) {
        this.url = str;
        this.options = options;
        this.networkClient = hVar;
        this.diskCache = hVar2;
        this.cacheStrategy = hVar3;
        this.connectivityChecker = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:87|88|(5:(4:90|(2:101|102)|93|(2:95|(2:97|41)(1:98)))|67|68|(4:70|36|37|(0)(0))|41)|103|60|(2:78|79)|62|63|64|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0140, code lost:
    
        if (r15 == null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017b A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:37:0x0177, B:39:0x017b), top: B:36:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f A[Catch: Exception -> 0x007d, TRY_LEAVE, TryCatch #1 {Exception -> 0x007d, blocks: (B:53:0x0078, B:54:0x0107, B:56:0x010f), top: B:52:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, n6.a$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, t6.q] */
    @Override // o6.j
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull mt.b<? super o6.i> r15) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.m.a(mt.b):java.lang.Object");
    }

    public final <T> Object h(NetworkRequest networkRequest, Function2<? super NetworkResponse, ? super mt.b<? super T>, ? extends Object> function2, mt.b<? super T> bVar) {
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
            u6.f.a();
        }
        return this.networkClient.getValue().a(networkRequest, new b(function2, null), bVar);
    }

    public final String i() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    public final wu.l j() {
        wu.l fileSystem;
        n6.a value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    @Nullable
    public final String k(@NotNull String url, @Nullable String contentType) {
        String b10;
        if ((contentType == null || x.T(contentType, "text/plain", false, 2, null)) && (b10 = e7.x.f15736a.b(url)) != null) {
            return b10;
        }
        if (contentType != null) {
            return StringsKt.i1(contentType, ';', null, 2, null);
        }
        return null;
    }

    public final NetworkRequest l() {
        NetworkHeaders.a d10 = h.b(this.options).d();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z10 = this.options.getNetworkCachePolicy().getReadEnabled() && this.connectivityChecker.c();
        if (!z10 && readEnabled) {
            d10.c("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z10 || readEnabled) {
            if (!z10 && !readEnabled) {
                d10.c("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            d10.c("Cache-Control", "no-cache");
        } else {
            d10.c("Cache-Control", "no-cache, no-store");
        }
        return new NetworkRequest(this.url, h.c(this.options), d10.b(), h.a(this.options), this.options.getExtras());
    }

    public final a.c m() {
        n6.a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.b(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(t6.r r5, mt.b<? super m6.s> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t6.m.f
            if (r0 == 0) goto L13
            r0 = r6
            t6.m$f r0 = (t6.m.f) r0
            int r1 = r0.f32030x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32030x = r1
            goto L18
        L13:
            t6.m$f r0 = new t6.m$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32028v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f32030x
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f32027u
            wu.e r5 = (wu.e) r5
            java.lang.Object r0 = r0.f32026t
            t6.r r0 = (t6.r) r0
            gt.o.b(r6)
            goto L53
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            gt.o.b(r6)
            wu.e r6 = new wu.e
            r6.<init>()
            java.lang.Object r2 = ot.l.a(r5)
            r0.f32026t = r2
            r0.f32027u = r6
            r0.f32030x = r3
            java.lang.Object r5 = r5.v(r6, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r5 = r6
        L53:
            m6.s r5 = r4.p(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.m.n(t6.r, mt.b):java.lang.Object");
    }

    public final m6.s o(a.c cVar) {
        return t.d(cVar.getData(), j(), i(), cVar, null, 16, null);
    }

    public final m6.s p(wu.e eVar) {
        return t.c(eVar, j(), null, 4, null);
    }

    public final NetworkResponse q(a.c cVar) {
        Throwable th2;
        NetworkResponse networkResponse;
        try {
            wu.g c10 = b0.c(j().source(cVar.getMetadata()));
            try {
                networkResponse = t6.a.f31985a.a(c10);
                if (c10 != null) {
                    try {
                        c10.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (c10 != null) {
                    try {
                        c10.close();
                    } catch (Throwable th5) {
                        gt.a.a(th4, th5);
                    }
                }
                th2 = th4;
                networkResponse = null;
            }
            if (th2 == null) {
                return networkResponse;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0140, code lost:
    
        if (r0.R2(r3, r4, r6) == r7) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(n6.a.c r11, t6.NetworkResponse r12, t6.NetworkRequest r13, t6.NetworkResponse r14, mt.b<? super n6.a.c> r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.m.r(n6.a$c, t6.q, t6.o, t6.q, mt.b):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR$\u0010#\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lt6/m$a;", "Lo6/j$a;", "Lk6/h0;", "Lkotlin/Function0;", "Lt6/i;", "networkClient", "Lt6/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lt6/d;", "connectivityChecker", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "data", "", "g", "(Lk6/h0;)Z", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "e", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "Lgt/h;", ve.a.f33391e, "Lgt/h;", "networkClientLazy", j6.b.f21518e, "cacheStrategyLazy", "Lu6/b;", "c", "Lu6/b;", "connectivityCheckerLazy", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<h0> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final gt.h<i> networkClientLazy;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final gt.h<t6.b> cacheStrategyLazy;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final u6.b<Context, t6.d> connectivityCheckerLazy;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: t6.m$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0574a extends kotlin.jvm.internal.k implements Function1<Context, t6.d> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0574a f32005a = new C0574a();

            public C0574a() {
                super(1, t6.f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final t6.d invoke(Context context) {
                return t6.f.a(context);
            }
        }

        public a(@NotNull Function0<? extends i> function0, @NotNull Function0<? extends t6.b> function02, @NotNull Function1<? super Context, ? extends t6.d> function1) {
            this.networkClientLazy = gt.i.b(function0);
            this.cacheStrategyLazy = gt.i.b(function02);
            this.connectivityCheckerLazy = u6.c.a(function1);
        }

        public static final t6.b d() {
            return t6.b.b;
        }

        public static final n6.a f(k6.s sVar) {
            return sVar.b();
        }

        private final boolean g(h0 data) {
            return Intrinsics.c(data.getScheme(), "http") || Intrinsics.c(data.getScheme(), "https");
        }

        @Override // o6.j.a
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public o6.j a(@NotNull h0 data, @NotNull Options options, @NotNull final k6.s imageLoader) {
            if (g(data)) {
                return new m(data.getData(), options, this.networkClientLazy, gt.i.b(new Function0() { // from class: t6.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        n6.a f10;
                        f10 = m.a.f(k6.s.this);
                        return f10;
                    }
                }), this.cacheStrategyLazy, this.connectivityCheckerLazy.a(options.getContext()));
            }
            return null;
        }

        public /* synthetic */ a(Function0 function0, Function0 function02, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i10 & 2) != 0 ? new Function0() { // from class: t6.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    b d10;
                    d10 = m.a.d();
                    return d10;
                }
            } : function02, (i10 & 4) != 0 ? C0574a.f32005a : function1);
        }
    }
}
