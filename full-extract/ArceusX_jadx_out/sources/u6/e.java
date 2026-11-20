package u6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import e.j0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n6.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.NetworkHeaders;
import t6.NetworkResponse;
import t6.r;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\u00060\u0014j\u0002`\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lt6/n$a;", "", "line", j6.b.f21518e, "(Lt6/n$a;Ljava/lang/String;)Lt6/n$a;", "Ln6/a$b;", "", ve.a.f33391e, "(Ln6/a$b;)V", "Lt6/r;", "Lwu/e;", "e", "(Lt6/r;Lmt/b;)Ljava/lang/Object;", "Lt6/n;", "other", rl.d.f30696a, "(Lt6/n;Lt6/n;)Lt6/n;", "Lt6/q;", "f", "(Lt6/q;)Lt6/r;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "c", "(Ljava/lang/AutoCloseable;)V", "coil-network-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.network.internal.UtilsKt", f = "utils.kt", l = {31}, m = "readBuffer")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f32639t;

        /* renamed from: u, reason: collision with root package name */
        public Object f32640u;

        /* renamed from: v, reason: collision with root package name */
        public Object f32641v;

        /* renamed from: w, reason: collision with root package name */
        public Object f32642w;

        /* renamed from: x, reason: collision with root package name */
        public int f32643x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f32644y;

        /* renamed from: z, reason: collision with root package name */
        public int f32645z;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32644y = obj;
            this.f32645z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.e(null, this);
        }
    }

    public static final void a(@NotNull a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final NetworkHeaders.a b(@NotNull NetworkHeaders.a aVar, @NotNull String str) {
        int m02 = StringsKt.m0(str, ':', 0, false, 6, null);
        if (m02 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String substring = str.substring(0, m02);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String obj = StringsKt.p1(substring).toString();
        String substring2 = str.substring(m02 + 1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        aVar.a(obj, substring2);
        return aVar;
    }

    public static final void c(@NotNull AutoCloseable autoCloseable) {
        try {
            j0.a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final NetworkHeaders d(@NotNull NetworkHeaders networkHeaders, @NotNull NetworkHeaders networkHeaders2) {
        NetworkHeaders.a d10 = networkHeaders.d();
        for (Map.Entry<String, List<String>> entry : networkHeaders2.b().entrySet()) {
            d10.d(entry.getKey(), entry.getValue());
        }
        return d10.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@org.jetbrains.annotations.NotNull t6.r r4, @org.jetbrains.annotations.NotNull mt.b<? super wu.e> r5) {
        /*
            boolean r0 = r5 instanceof u6.e.a
            if (r0 == 0) goto L13
            r0 = r5
            u6.e$a r0 = (u6.e.a) r0
            int r1 = r0.f32645z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32645z = r1
            goto L18
        L13:
            u6.e$a r0 = new u6.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f32644y
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f32645z
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r4 = r0.f32642w
            wu.e r4 = (wu.e) r4
            java.lang.Object r1 = r0.f32641v
            t6.r r1 = (t6.r) r1
            java.lang.Object r1 = r0.f32640u
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            java.lang.Object r0 = r0.f32639t
            t6.r r0 = (t6.r) r0
            gt.o.b(r5)     // Catch: java.lang.Throwable -> L39
            goto L69
        L39:
            r4 = move-exception
            goto L71
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L43:
            gt.o.b(r5)
            wu.e r5 = new wu.e     // Catch: java.lang.Throwable -> L6e
            r5.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = ot.l.a(r4)     // Catch: java.lang.Throwable -> L6e
            r0.f32639t = r2     // Catch: java.lang.Throwable -> L6e
            r0.f32640u = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = ot.l.a(r4)     // Catch: java.lang.Throwable -> L6e
            r0.f32641v = r2     // Catch: java.lang.Throwable -> L6e
            r0.f32642w = r5     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r0.f32643x = r2     // Catch: java.lang.Throwable -> L6e
            r0.f32645z = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r4.v(r5, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r1) goto L67
            return r1
        L67:
            r1 = r4
            r4 = r5
        L69:
            r5 = 0
            wt.a.a(r1, r5)
            return r4
        L6e:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L71:
            throw r4     // Catch: java.lang.Throwable -> L72
        L72:
            r5 = move-exception
            wt.a.a(r1, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.e.e(t6.r, mt.b):java.lang.Object");
    }

    @NotNull
    public static final r f(@NotNull NetworkResponse networkResponse) {
        r body = networkResponse.getBody();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("body == null");
    }
}
