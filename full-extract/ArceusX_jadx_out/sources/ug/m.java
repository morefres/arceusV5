package ug;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.db.RobloxDatabase;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.t1;
import ju.v1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rg.a1;
import ug.p;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lug/m;", "", "<init>", "()V", "", "evt", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "", "waitForFullBatch", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "i", "(Z)V", "Lju/l0;", j6.b.f21518e, "Lju/l0;", "eventUploadDispatcher", "Lju/p0;", "Lju/p0;", "eventUploadScope", "Lug/p$c;", rl.d.f30696a, "Lug/p$c;", "eventUploader", "Lkh/a;", "e", "Lgt/h;", "f", "()Lkh/a;", "analyticEventDao", "Lug/p;", "g", "()Lug/p;", "eventUploadWorker", "Lug/p$b;", "h", "()Lug/p$b;", "eventUploaderConfig", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f32761a = new m();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final l0 eventUploadDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0 eventUploadScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p.c eventUploader;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h analyticEventDao;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h eventUploadWorker;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"ug/m$a", "Lug/p$c;", "", "url", "body", "contentType", "Lci/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "counterName", "", ve.a.f33391e, "(Ljava/lang/String;)V", "", "value", j6.b.f21518e, "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements p.c {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        @ot.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1", f = "EventUploadJob.kt", l = {55}, m = "upload", v = 1)
        /* renamed from: ug.m$a$a, reason: collision with other inner class name */
        public static final class C0596a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public Object f32766t;

            /* renamed from: u, reason: collision with root package name */
            public Object f32767u;

            /* renamed from: v, reason: collision with root package name */
            public Object f32768v;

            /* renamed from: w, reason: collision with root package name */
            public /* synthetic */ Object f32769w;

            /* renamed from: y, reason: collision with root package name */
            public int f32771y;

            public C0596a(mt.b<? super C0596a> bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f32769w = obj;
                this.f32771y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return a.this.c(null, null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lci/j;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Lci/j;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1$upload$2", f = "EventUploadJob.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends ot.m implements Function2<p0, mt.b<? super ci.j>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f32772t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f32773u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f32774v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f32775w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, String str3, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f32773u = str;
                this.f32774v = str2;
                this.f32775w = str3;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f32773u, this.f32774v, this.f32775w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f32772t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return ci.c.l(this.f32773u, this.f32774v, null, this.f32775w, -1, -1);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super ci.j> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Override // ug.p.c
        public void a(String counterName) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            ti.g.b().q(counterName);
        }

        @Override // ug.p.c
        public void b(String counterName, long value) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            ti.g.b().r(counterName, value);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // ug.p.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object c(java.lang.String r6, java.lang.String r7, java.lang.String r8, mt.b<? super ci.j> r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof ug.m.a.C0596a
                if (r0 == 0) goto L13
                r0 = r9
                ug.m$a$a r0 = (ug.m.a.C0596a) r0
                int r1 = r0.f32771y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32771y = r1
                goto L18
            L13:
                ug.m$a$a r0 = new ug.m$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f32769w
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f32771y
                r3 = 1
                if (r2 == 0) goto L3d
                if (r2 != r3) goto L35
                java.lang.Object r6 = r0.f32768v
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r6 = r0.f32767u
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r6 = r0.f32766t
                java.lang.String r6 = (java.lang.String) r6
                gt.o.b(r9)
                goto L65
            L35:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3d:
                gt.o.b(r9)
                ju.l0 r9 = ju.g1.b()
                ug.m$a$b r2 = new ug.m$a$b
                r4 = 0
                r2.<init>(r6, r7, r8, r4)
                java.lang.Object r6 = ot.l.a(r6)
                r0.f32766t = r6
                java.lang.Object r6 = ot.l.a(r7)
                r0.f32767u = r6
                java.lang.Object r6 = ot.l.a(r8)
                r0.f32768v = r6
                r0.f32771y = r3
                java.lang.Object r9 = ju.i.g(r9, r2, r0)
                if (r9 != r1) goto L65
                return r1
            L65:
                java.lang.String r6 = "withContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ug.m.a.c(java.lang.String, java.lang.String, java.lang.String, mt.b):java.lang.Object");
        }
    }

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        t1 c10 = v1.c(newSingleThreadExecutor);
        eventUploadDispatcher = c10;
        eventUploadScope = q0.a(c10);
        eventUploader = new a();
        analyticEventDao = gt.i.b(new Function0() { // from class: ug.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                kh.a d10;
                d10 = m.d();
                return d10;
            }
        });
        eventUploadWorker = gt.i.b(new Function0() { // from class: ug.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                p e10;
                e10 = m.e();
                return e10;
            }
        });
    }

    public static final void c(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        f32761a.g().h(evt, ctx, params, waitForFullBatch);
    }

    public static final kh.a d() {
        jh.c cVar = jh.c.f21761a;
        Context f10 = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getAppContext(...)");
        RobloxDatabase b = cVar.b(f10);
        if (b != null) {
            return b.X();
        }
        return null;
    }

    public static final p e() {
        p0 p0Var = eventUploadScope;
        m mVar = f32761a;
        return new p(p0Var, mVar.f(), eventUploader, mVar.h());
    }

    public static final void i(boolean waitForFullBatch) {
        f32761a.g().q(waitForFullBatch);
    }

    public final kh.a f() {
        return (kh.a) analyticEventDao.getValue();
    }

    public final p g() {
        return (p) eventUploadWorker.getValue();
    }

    public final p.Config h() {
        int v5 = rh.h.a().v();
        String D0 = a1.D0();
        Intrinsics.checkNotNullExpressionValue(D0, "rbxAnalyticsBatchUrl(...)");
        String S = a1.S();
        Intrinsics.checkNotNullExpressionValue(S, "getJsonContentType(...)");
        String mDeviceId = a1.f30261t;
        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
        return new p.Config(D0, v5, S, mDeviceId, ek.c.d(), false, rh.h.a().k5(), rh.h.a().X(), rh.h.a().G4(), rh.h.a().D2());
    }
}
