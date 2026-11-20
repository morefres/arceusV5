package mi;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import ju.g1;
import ju.k;
import ju.m0;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.j;
import org.jetbrains.annotations.NotNull;
import ot.m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u000b\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmi/c;", "", "<init>", "()V", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "block", "f", "(Lkotlin/jvm/functions/Function2;)V", "", "conversationId", "Lkotlin/Function1;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", j6.b.f21518e, "Lju/p0;", "scope", "Ljava/util/concurrent/ConcurrentHashMap;", "Llu/g;", "Ljava/util/concurrent/ConcurrentHashMap;", "conversationChannels", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f24511a = new c();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()).plus(new b(m0.INSTANCE)));

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, lu.g<Function1<mt.b<? super Unit>, Object>>> conversationChannels = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.job.BackgroundJobDispatcher$enqueueOrdered$channel$1$1$1", f = "BackgroundJobDispatcher.kt", l = {35, MotionEventCompat.AXIS_GENERIC_6}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f24513t;

        /* renamed from: u, reason: collision with root package name */
        public Object f24514u;

        /* renamed from: v, reason: collision with root package name */
        public int f24515v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ lu.g<Function1<mt.b<? super Unit>, Object>> f24516w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f24517x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu.g<Function1<mt.b<? super Unit>, Object>> gVar, String str, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f24516w = gVar;
            this.f24517x = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f24516w, this.f24517x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            if (r9.invoke(r8) == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0062 -> B:8:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0065 -> B:8:0x007d). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r8.f24515v
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r8.f24514u
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                java.lang.Object r1 = r8.f24513t
                lu.i r1 = (lu.i) r1
                gt.o.b(r9)     // Catch: java.lang.Exception -> L1a
                goto L7d
            L1a:
                r9 = move-exception
                goto L65
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                java.lang.Object r1 = r8.f24513t
                lu.i r1 = (lu.i) r1
                gt.o.b(r9)
                goto L46
            L2c:
                gt.o.b(r9)
                lu.g<kotlin.jvm.functions.Function1<mt.b<? super kotlin.Unit>, java.lang.Object>> r9 = r8.f24516w
                lu.i r9 = r9.iterator()
            L35:
                r8.f24513t = r9
                r1 = 0
                r8.f24514u = r1
                r8.f24515v = r3
                java.lang.Object r1 = r9.a(r8)
                if (r1 != r0) goto L43
                goto L64
            L43:
                r7 = r1
                r1 = r9
                r9 = r7
            L46:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7f
                java.lang.Object r9 = r1.next()
                kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                r8.f24513t = r1     // Catch: java.lang.Exception -> L1a
                java.lang.Object r4 = ot.l.a(r9)     // Catch: java.lang.Exception -> L1a
                r8.f24514u = r4     // Catch: java.lang.Exception -> L1a
                r8.f24515v = r2     // Catch: java.lang.Exception -> L1a
                java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Exception -> L1a
                if (r9 != r0) goto L7d
            L64:
                return r0
            L65:
                java.lang.String r4 = r8.f24517x
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Failed to execute ordered job for "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "BackgroundJobDispatcher"
                android.util.Log.e(r5, r4, r9)
            L7d:
                r9 = r1
                goto L35
            L7f:
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mi.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"mi/c$b", "Lkotlin/coroutines/a;", "Lju/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends kotlin.coroutines.a implements m0 {
        public b(m0.Companion companion) {
            super(companion);
        }

        @Override // ju.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            Log.e("BackgroundJobDispatcher", "Uncaught exception in background job", exception);
        }
    }

    public static final lu.g d(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        lu.g b10 = j.b(Integer.MAX_VALUE, null, null, 6, null);
        k.d(scope, null, null, new a(b10, str, null), 3, null);
        return b10;
    }

    public static final lu.g e(Function1 function1, Object obj) {
        return (lu.g) function1.invoke(obj);
    }

    public final void c(@NotNull final String conversationId, @NotNull Function1<? super mt.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(block, "block");
        ConcurrentHashMap<String, lu.g<Function1<mt.b<? super Unit>, Object>>> concurrentHashMap = conversationChannels;
        final Function1 function1 = new Function1() { // from class: mi.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lu.g d10;
                d10 = c.d(conversationId, (String) obj);
                return d10;
            }
        };
        lu.g<Function1<mt.b<? super Unit>, Object>> computeIfAbsent = concurrentHashMap.computeIfAbsent(conversationId, new Function() { // from class: mi.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                lu.g e10;
                e10 = c.e(Function1.this, obj);
                return e10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(computeIfAbsent, "computeIfAbsent(...)");
        computeIfAbsent.v(block);
    }

    public final void f(@NotNull Function2<? super p0, ? super mt.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        k.d(scope, null, null, block, 3, null);
    }
}
