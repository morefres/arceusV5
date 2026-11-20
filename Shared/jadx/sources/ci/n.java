package ci;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.x;
import ju.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lci/n;", "Lokhttp3/Dns;", "systemDns", "<init>", "(Lokhttp3/Dns;)V", "", "hostname", "", rl.d.f30696a, "(Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "e", "()V", ve.a.f33391e, "Lokhttp3/Dns;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lju/x;", j6.b.f21518e, "Ljava/util/concurrent/ConcurrentHashMap;", "prewarmingFutures", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n implements Dns {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final n f4962d = new n(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Dns systemDns;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, x<List<InetAddress>>> prewarmingFutures;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lci/n$a;", "", "<init>", "()V", "Lci/n;", "Instance", "Lci/n;", ve.a.f33391e, "()Lci/n;", "getInstance$annotations", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ci.n$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n a() {
            return n.f4962d;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Ljava/net/InetAddress;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1", f = "PrewarmableDnsResolver.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function2<p0, mt.b<? super List<? extends InetAddress>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4964t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x<List<InetAddress>> f4965u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n f4966v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f4967w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f4968t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<List<InetAddress>> f4969u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ n f4970v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f4971w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x<List<InetAddress>> xVar, n nVar, String str, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f4969u = xVar;
                this.f4970v = nVar;
                this.f4971w = str;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f4969u, this.f4970v, this.f4971w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f4968t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                try {
                    this.f4969u.r(this.f4970v.systemDns.lookup(this.f4971w));
                } catch (UnknownHostException unused) {
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x<List<InetAddress>> xVar, n nVar, String str, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f4965u = xVar;
            this.f4966v = nVar;
            this.f4967w = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f4965u, this.f4966v, this.f4967w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4964t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            ju.k.d(q0.a(g1.b()), null, null, new a(this.f4965u, this.f4966v, this.f4967w, null), 3, null);
            x<List<InetAddress>> xVar = this.f4965u;
            this.f4964t = 1;
            Object w5 = xVar.w(this);
            return w5 == e10 ? e10 : w5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super List<? extends InetAddress>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.http.PrewarmableDnsResolver$prewarmIOThread$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4972t;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f4972t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public n(@NotNull Dns systemDns) {
        Intrinsics.checkNotNullParameter(systemDns, "systemDns");
        this.systemDns = systemDns;
        this.prewarmingFutures = new ConcurrentHashMap<>();
    }

    @NotNull
    public static final n c() {
        return INSTANCE.a();
    }

    public final void d(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        x<List<InetAddress>> c10 = z.c(null, 1, null);
        if (this.prewarmingFutures.putIfAbsent(hostname, c10) == null) {
            try {
                e();
                c10.r(this.systemDns.lookup(hostname));
            } catch (UnknownHostException e10) {
                if (c10.q(e10)) {
                    this.prewarmingFutures.remove(hostname, c10);
                }
            }
        }
    }

    public final void e() {
        ju.k.d(q0.a(g1.b()), null, null, new c(null), 3, null);
    }

    @Override // okhttp3.Dns
    @NotNull
    public List<InetAddress> lookup(@NotNull String hostname) {
        Object b10;
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        x<List<InetAddress>> xVar = this.prewarmingFutures.get(hostname);
        if (xVar == null) {
            return this.systemDns.lookup(hostname);
        }
        try {
            if (xVar.d()) {
                return xVar.g();
            }
            b10 = ju.j.b(null, new b(xVar, this, hostname, null), 1, null);
            return (List) b10;
        } catch (UnknownHostException unused) {
            return this.systemDns.lookup(hostname);
        }
    }

    public /* synthetic */ n(Dns dns, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
