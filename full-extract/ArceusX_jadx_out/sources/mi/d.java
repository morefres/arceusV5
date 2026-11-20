package mi;

import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.n;
import gt.o;
import ju.g1;
import ju.i;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import ot.m;
import rh.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "conversationId", "", "conversationGuid", "message", "Lgt/n;", j6.b.f21518e, "(JLjava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "", ve.a.f33391e, "(JLjava/lang/String;Lmt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.job.ChatJobsKt$markConversationAsRead$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24518t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f24519u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f24520v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f24519u = str;
            this.f24520v = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f24519u, this.f24520v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            boolean c10;
            nt.c.e();
            if (this.f24518t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (h.a().v2()) {
                ResponseBody a10 = tk.g.d().c().a(new zk.a(new String[]{this.f24519u})).execute().a();
                Intrinsics.checkNotNull(a10);
                c10 = Intrinsics.c("success", new JSONObject(a10.string()).optString(NotificationCompat.CATEGORY_STATUS));
            } else {
                ResponseBody a11 = tk.g.d().c().d(new zk.b(new long[]{this.f24520v})).execute().a();
                Intrinsics.checkNotNull(a11);
                c10 = Intrinsics.c("success", new JSONObject(a11.string()).optString(NotificationCompat.CATEGORY_STATUS));
            }
            return ot.b.a(c10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Boolean> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.job.ChatJobsKt", f = "ChatJobs.kt", l = {MotionEventCompat.AXIS_BRAKE}, m = "sendChatMessage", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public long f24521t;

        /* renamed from: u, reason: collision with root package name */
        public Object f24522u;

        /* renamed from: v, reason: collision with root package name */
        public Object f24523v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f24524w;

        /* renamed from: x, reason: collision with root package name */
        public int f24525x;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24524w = obj;
            this.f24525x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object b = d.b(0L, null, null, this);
            return b == nt.c.e() ? b : n.a(b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.job.ChatJobsKt$sendChatMessage$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super n<? extends String>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24526t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f24527u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f24528v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f24529w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, long j10, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f24527u = str;
            this.f24528v = str2;
            this.f24529w = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f24527u, this.f24528v, this.f24529w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (mt.b<? super n<String>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            nt.c.e();
            if (this.f24526t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String[] strArr = {this.f24527u};
            ResponseBody a10 = (h.a().v2() ? tk.g.d().c().b(new zk.c(this.f24528v, strArr)).execute() : tk.g.d().c().c(new zk.d(this.f24529w, strArr)).execute()).a();
            Intrinsics.checkNotNull(a10);
            JSONArray jSONArray = new JSONObject(a10.string()).getJSONArray("messages");
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                String string = jSONObject.getString(NotificationCompat.CATEGORY_STATUS);
                if (Intrinsics.c("success", string)) {
                    n.Companion companion = n.INSTANCE;
                    b = n.b(jSONObject.getString("id"));
                } else {
                    n.Companion companion2 = n.INSTANCE;
                    Intrinsics.checkNotNull(string);
                    b = n.b(o.a(new e(string, "Send Failed")));
                }
            } else {
                n.Companion companion3 = n.INSTANCE;
                b = n.b(o.a(new e("failed", "No messages in the response")));
            }
            return n.a(b);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super n<String>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final Object a(long j10, @Nullable String str, @NotNull mt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new a(str, j10, null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(long r10, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<java.lang.String>> r14) {
        /*
            boolean r0 = r14 instanceof mi.d.b
            if (r0 == 0) goto L13
            r0 = r14
            mi.d$b r0 = (mi.d.b) r0
            int r1 = r0.f24525x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24525x = r1
            goto L18
        L13:
            mi.d$b r0 = new mi.d$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24524w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f24525x
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.f24523v
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f24522u
            java.lang.String r10 = (java.lang.String) r10
            gt.o.b(r14)
            goto L60
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            gt.o.b(r14)
            ju.l0 r14 = ju.g1.b()
            mi.d$c r4 = new mi.d$c
            r9 = 0
            r7 = r10
            r6 = r12
            r5 = r13
            r4.<init>(r5, r6, r7, r9)
            java.lang.Object r10 = ot.l.a(r6)
            r0.f24522u = r10
            java.lang.Object r10 = ot.l.a(r5)
            r0.f24523v = r10
            r0.f24521t = r7
            r0.f24525x = r3
            java.lang.Object r14 = ju.i.g(r14, r4, r0)
            if (r14 != r1) goto L60
            return r1
        L60:
            gt.n r14 = (gt.n) r14
            java.lang.Object r10 = r14.getValue()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.d.b(long, java.lang.String, java.lang.String, mt.b):java.lang.Object");
    }
}
