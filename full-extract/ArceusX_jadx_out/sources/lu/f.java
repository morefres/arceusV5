package lu;

import backtraceio.library.services.BacktraceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import pu.e0;
import pu.h0;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001aK\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\"\b\u0002\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u0014\u0010,\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u00100\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+\"\u0014\u00102\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+\"\u0014\u00104\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+\"\u0014\u00106\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+\"\u0014\u00108\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+\"\u0014\u0010:\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010+\"\u001a\u0010>\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010=\"\u0014\u0010@\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010+\"\u0014\u0010B\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010+\"\u0014\u0010D\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010+\"\u0014\u0010F\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010+\"\u0014\u0010H\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010+\"\u0014\u0010J\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010+\"\u0014\u0010L\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010+¨\u0006M"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Llu/m;", "y", "()Lgu/g;", "id", "prev", "x", "(JLlu/m;)Llu/m;", "T", "Lju/n;", "value", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "", "onCancellation", "", "B", "(Lju/n;Ljava/lang/Object;Lyt/n;)Z", "", "capacity", "A", "(I)J", "counter", "closeStatus", "w", "(JI)J", "pauseEB", "v", "(JZ)J", "", ve.a.f33391e, "Llu/m;", "NULL_SEGMENT", j6.b.f21518e, "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Lpu/e0;", rl.d.f30696a, "Lpu/e0;", "BUFFERED", "e", "IN_BUFFER", "f", "RESUMING_BY_RCV", "g", "RESUMING_BY_EB", "h", "POISONED", "i", "DONE_RCV", "j", "INTERRUPTED_SEND", "k", "INTERRUPTED_RCV", "l", "z", "()Lpu/e0;", "CHANNEL_CLOSED", "m", "SUSPEND", "n", "SUSPEND_NO_WAITER", "o", "FAILED", "p", "NO_RECEIVE_RESULT", "q", "CLOSE_HANDLER_CLOSED", "r", "CLOSE_HANDLER_INVOKED", "s", "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m<Object> f23883a = new m<>(-1, null, null, 0);
    public static final int b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f23884c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e0 f23885d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e0 f23886e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e0 f23887f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final e0 f23888g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e0 f23889h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final e0 f23890i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final e0 f23891j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final e0 f23892k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final e0 f23893l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final e0 f23894m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final e0 f23895n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final e0 f23896o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    public static final e0 f23897p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    public static final e0 f23898q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public static final e0 f23899r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    public static final e0 f23900s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a<E> extends kotlin.jvm.internal.k implements Function2<Long, m<E>, m<E>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23901a = new a();

        public a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m<E> d(long j10, m<E> mVar) {
            return f.x(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return d(l10.longValue(), (m) obj);
        }
    }

    static {
        int e10;
        int e11;
        e10 = h0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        b = e10;
        e11 = h0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", BacktraceMetrics.defaultTimeBetweenRetriesMs, 0, 0, 12, null);
        f23884c = e11;
        f23885d = new e0("BUFFERED");
        f23886e = new e0("SHOULD_BUFFER");
        f23887f = new e0("S_RESUMING_BY_RCV");
        f23888g = new e0("RESUMING_BY_EB");
        f23889h = new e0("POISONED");
        f23890i = new e0("DONE_RCV");
        f23891j = new e0("INTERRUPTED_SEND");
        f23892k = new e0("INTERRUPTED_RCV");
        f23893l = new e0("CHANNEL_CLOSED");
        f23894m = new e0("SUSPEND");
        f23895n = new e0("SUSPEND_NO_WAITER");
        f23896o = new e0("FAILED");
        f23897p = new e0("NO_RECEIVE_RESULT");
        f23898q = new e0("CLOSE_HANDLER_CLOSED");
        f23899r = new e0("CLOSE_HANDLER_INVOKED");
        f23900s = new e0("NO_CLOSE_CAUSE");
    }

    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(ju.n<? super T> nVar, T t8, yt.n<? super Throwable, ? super T, ? super CoroutineContext, Unit> nVar2) {
        Object f10 = nVar.f(t8, null, nVar2);
        if (f10 == null) {
            return false;
        }
        nVar.L(f10);
        return true;
    }

    public static /* synthetic */ boolean C(ju.n nVar, Object obj, yt.n nVar2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            nVar2 = null;
        }
        return B(nVar, obj, nVar2);
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    public static final <E> m<E> x(long j10, m<E> mVar) {
        return new m<>(j10, mVar, mVar.y(), 0);
    }

    @NotNull
    public static final <E> gu.g<m<E>> y() {
        return a.f23901a;
    }

    @NotNull
    public static final e0 z() {
        return f23893l;
    }
}
