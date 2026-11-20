package xq;

import android.content.Context;
import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import ju.g1;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import tr.h;
import wm.o;
import xq.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lxq/a;", "Lwm/o;", "Lxq/c$b;", "Ltr/h;", "Lxq/c;", "snaClient", "", "timeoutSeconds", "<init>", "(Lxq/c;I)V", "otherWorker", "", "c", "(Lwm/o;)Z", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lxq/c;", "I", ve.a.f33391e, "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements o<c.b>, h<c.b> {

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final c snaClient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int timeoutSeconds;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxq/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;", "config", "", "timeoutSeconds", "Lxq/a;", ve.a.f33391e, "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;I)Lxq/a;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: xq.a$a, reason: collision with other inner class name */
    public static final class C0662a {
        @NotNull
        public final a a(@NotNull Context applicationContext, @NotNull SilentNetworkAuthConfig config, int timeoutSeconds) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(config, "config");
            return new a(e.f36101a.a(applicationContext, config), timeoutSeconds);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lxq/c$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1", f = "SilentNetworkAuthWorker.kt", l = {MotionEventCompat.AXIS_DISTANCE, MotionEventCompat.AXIS_GENERIC_2, MotionEventCompat.AXIS_GENERIC_8}, m = "invokeSuspend")
    public static final class b extends m implements Function2<i<? super c.b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f36084t;

        /* renamed from: u, reason: collision with root package name */
        public Object f36085u;

        /* renamed from: v, reason: collision with root package name */
        public int f36086v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f36087w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lxq/c$b;", "<anonymous>", "(Lju/p0;)Lxq/c$b;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1$response$1", f = "SilentNetworkAuthWorker.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xq.a$b$a, reason: collision with other inner class name */
        public static final class C0663a extends m implements Function2<p0, mt.b<? super c.b>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f36089t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f36090u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0663a(c cVar, mt.b<? super C0663a> bVar) {
                super(2, bVar);
                this.f36090u = cVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0663a(this.f36090u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f36089t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return this.f36090u.a();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super c.b> bVar) {
                return ((C0663a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = a.this.new b(bVar);
            bVar2.f36087w = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00d0, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (r10 == r1) goto L27;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f36087w
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r9.f36086v
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3a
                if (r2 == r5) goto L32
                if (r2 == r4) goto L2a
                if (r2 != r3) goto L22
                java.lang.Object r0 = r9.f36085u
                xq.c$b r0 = (xq.c.b) r0
                java.lang.Object r0 = r9.f36084t
                xq.c r0 = (xq.c) r0
                gt.o.b(r10)
                goto Ld3
            L22:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2a:
                java.lang.Object r2 = r9.f36084t
                xq.c r2 = (xq.c) r2
                gt.o.b(r10)
                goto L8d
            L32:
                java.lang.Object r0 = r9.f36084t
                xq.c r0 = (xq.c) r0
                gt.o.b(r10)
                goto L69
            L3a:
                gt.o.b(r10)
                xq.a r10 = xq.a.this
                xq.c r2 = xq.a.d(r10)
                if (r2 != 0) goto L6c
                xq.c$b$a r10 = new xq.c$b$a
                xq.d r3 = xq.d.f36093c
                java.lang.String r4 = r3.getKey()
                java.lang.String r3 = r3.getMessage()
                r10.<init>(r4, r3)
                java.lang.Object r3 = ot.l.a(r0)
                r9.f36087w = r3
                java.lang.Object r2 = ot.l.a(r2)
                r9.f36084t = r2
                r9.f36086v = r5
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto L69
                goto Ld2
            L69:
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            L6c:
                xq.a r10 = xq.a.this
                int r10 = xq.a.e(r10)
                long r5 = (long) r10
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r7
                xq.a$b$a r10 = new xq.a$b$a
                r7 = 0
                r10.<init>(r2, r7)
                r9.f36087w = r0
                java.lang.Object r7 = ot.l.a(r2)
                r9.f36084t = r7
                r9.f36086v = r4
                java.lang.Object r10 = ju.g3.e(r5, r10, r9)
                if (r10 != r1) goto L8d
                goto Ld2
            L8d:
                xq.c$b r10 = (xq.c.b) r10
                if (r10 != 0) goto Lb8
                xq.c$b$a r10 = new xq.c$b$a
                xq.d r4 = xq.d.f36097g
                java.lang.String r4 = r4.getKey()
                xq.a r5 = xq.a.this
                int r5 = xq.a.e(r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "SNA timed out after "
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = "s"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r10.<init>(r4, r5)
            Lb8:
                java.lang.Object r4 = ot.l.a(r0)
                r9.f36087w = r4
                java.lang.Object r2 = ot.l.a(r2)
                r9.f36084t = r2
                java.lang.Object r2 = ot.l.a(r10)
                r9.f36085u = r2
                r9.f36086v = r3
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto Ld3
            Ld2:
                return r1
            Ld3:
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: xq.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super c.b> iVar, mt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public a(@Nullable c cVar, int i10) {
        this.snaClient = cVar;
        this.timeoutSeconds = i10;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof a;
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<c.b> run() {
        return j.y(j.w(new b(null)), g1.a());
    }
}
