package w6;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import t6.NetworkHeaders;
import t6.NetworkResponse;
import t6.j;
import wu.g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lt6/o;", "Lokhttp3/Request;", "h", "(Lt6/o;Lmt/b;)Ljava/lang/Object;", "Lt6/p;", "Lwu/h;", rl.d.f30696a, "(Lt6/p;Lmt/b;)Ljava/lang/Object;", "Lokhttp3/Response;", "Lt6/q;", "g", "(Lokhttp3/Response;)Lt6/q;", "Lt6/n;", "Lokhttp3/Headers;", "e", "(Lt6/n;)Lokhttp3/Headers;", "f", "(Lokhttp3/Headers;)Lt6/n;", "coil-network-okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {MotionEventCompat.AXIS_GENERIC_8}, m = "readByteString")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f33728t;

        /* renamed from: u, reason: collision with root package name */
        public Object f33729u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33730v;

        /* renamed from: w, reason: collision with root package name */
        public int f33731w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33730v = obj;
            this.f33731w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {32}, m = "toRequest")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f33732t;

        /* renamed from: u, reason: collision with root package name */
        public Object f33733u;

        /* renamed from: v, reason: collision with root package name */
        public Object f33734v;

        /* renamed from: w, reason: collision with root package name */
        public Object f33735w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f33736x;

        /* renamed from: y, reason: collision with root package name */
        public int f33737y;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33736x = obj;
            this.f33737y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.h(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(t6.p r4, mt.b<? super wu.h> r5) {
        /*
            boolean r0 = r5 instanceof w6.e.a
            if (r0 == 0) goto L13
            r0 = r5
            w6.e$a r0 = (w6.e.a) r0
            int r1 = r0.f33731w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33731w = r1
            goto L18
        L13:
            w6.e$a r0 = new w6.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f33730v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f33731w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f33729u
            wu.e r4 = (wu.e) r4
            java.lang.Object r0 = r0.f33728t
            t6.p r0 = (t6.p) r0
            gt.o.b(r5)
            goto L53
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            gt.o.b(r5)
            wu.e r5 = new wu.e
            r5.<init>()
            java.lang.Object r2 = ot.l.a(r4)
            r0.f33728t = r2
            r0.f33729u = r5
            r0.f33731w = r3
            java.lang.Object r4 = r4.v(r5, r0)
            if (r4 != r1) goto L52
            return r1
        L52:
            r4 = r5
        L53:
            wu.h r4 = r4.G2()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.e.d(t6.p, mt.b):java.lang.Object");
    }

    public static final Headers e(NetworkHeaders networkHeaders) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : networkHeaders.b().entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder.addUnsafeNonAscii(key, it.next());
            }
        }
        return builder.build();
    }

    public static final NetworkHeaders f(Headers headers) {
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
        while (it.hasNext()) {
            Pair<? extends String, ? extends String> next = it.next();
            aVar.a(next.a(), next.b());
        }
        return aVar.b();
    }

    public static final NetworkResponse g(Response response) {
        g bodySource;
        int code = response.code();
        long sentRequestAtMillis = response.sentRequestAtMillis();
        long receivedResponseAtMillis = response.receivedResponseAtMillis();
        NetworkHeaders f10 = f(response.headers());
        ResponseBody body = response.body();
        return new NetworkResponse(code, sentRequestAtMillis, receivedResponseAtMillis, f10, (body == null || (bodySource = body.getBodySource()) == null) ? null : j.a(bodySource), response);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(t6.NetworkRequest r6, mt.b<? super okhttp3.Request> r7) {
        /*
            boolean r0 = r7 instanceof w6.e.b
            if (r0 == 0) goto L13
            r0 = r7
            w6.e$b r0 = (w6.e.b) r0
            int r1 = r0.f33737y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33737y = r1
            goto L18
        L13:
            w6.e$b r0 = new w6.e$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f33736x
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f33737y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r6 = r0.f33735w
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.f33734v
            okhttp3.Request$Builder r1 = (okhttp3.Request.Builder) r1
            java.lang.Object r2 = r0.f33733u
            okhttp3.Request$Builder r2 = (okhttp3.Request.Builder) r2
            java.lang.Object r0 = r0.f33732t
            t6.o r0 = (t6.NetworkRequest) r0
            gt.o.b(r7)
            goto L71
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            gt.o.b(r7)
            okhttp3.Request$Builder r7 = new okhttp3.Request$Builder
            r7.<init>()
            java.lang.String r2 = r6.getUrl()
            r7.url(r2)
            java.lang.String r2 = r6.getMethod()
            t6.p r5 = r6.getBody()
            if (r5 == 0) goto L81
            r0.f33732t = r6
            r0.f33733u = r7
            r0.f33734v = r7
            r0.f33735w = r2
            r0.f33737y = r4
            java.lang.Object r0 = d(r5, r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r1 = r7
            r7 = r0
            r0 = r6
            r6 = r2
            r2 = r1
        L71:
            wu.h r7 = (wu.h) r7
            if (r7 == 0) goto L7c
            okhttp3.RequestBody$Companion r5 = okhttp3.RequestBody.INSTANCE
            okhttp3.RequestBody r3 = okhttp3.RequestBody.Companion.create$default(r5, r7, r3, r4, r3)
            goto L87
        L7c:
            r7 = r0
            r0 = r6
            r6 = r7
            r7 = r1
            goto L83
        L81:
            r0 = r2
            r2 = r7
        L83:
            r1 = r0
            r0 = r6
            r6 = r1
            r1 = r7
        L87:
            r1.method(r6, r3)
            t6.n r6 = r0.getHeaders()
            okhttp3.Headers r6 = e(r6)
            r2.headers(r6)
            okhttp3.Request r6 = r2.build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.e.h(t6.o, mt.b):java.lang.Object");
    }
}
