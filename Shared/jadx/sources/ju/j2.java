package ju;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005i\u0098\u0001¦\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b6\u00103J\u0019\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J*\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0004\u0018\u00010?*\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bL\u00101J\u0019\u0010N\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010/J\u000f\u0010Q\u001a\u00020\u0014H\u0014¢\u0006\u0004\bQ\u0010RJ\u0011\u0010U\u001a\u00060Sj\u0002`T¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00060Sj\u0002`T*\u00020\u000f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0004\bX\u0010YJ'\u0010^\u001a\u00020]2\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\b^\u0010_J7\u0010b\u001a\u00020]2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u00042\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020]2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bg\u00101J\u0017\u0010h\u001a\u00020\u00142\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\bh\u0010-J\u001f\u0010i\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020IH\u0014¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bm\u0010nJ\u0015\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u0003¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010#J\u0017\u0010s\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bs\u0010#J\u0019\u0010t\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bt\u0010uJ\u0013\u0010v\u001a\u00060Sj\u0002`TH\u0016¢\u0006\u0004\bv\u0010VJ\u0019\u0010w\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bw\u0010uJ\u001b\u0010x\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bx\u00103J\u0015\u0010z\u001a\u00020y2\u0006\u0010@\u001a\u00020\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\u000fH\u0010¢\u0006\u0004\b}\u0010nJ\u0019\u0010~\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b~\u0010nJ\u0017\u0010\u007f\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u007f\u0010#J\u001c\u0010\u0080\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u0011\u0010\u0083\u0001\u001a\u00020IH\u0016¢\u0006\u0005\b\u0083\u0001\u0010lJ\u0011\u0010\u0084\u0001\u001a\u00020IH\u0007¢\u0006\u0005\b\u0084\u0001\u0010lJ\u0011\u0010\u0085\u0001\u001a\u00020IH\u0010¢\u0006\u0005\b\u0085\u0001\u0010lJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u0088\u0001\u00101R\u001e\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u00105R\u0019\u0010\u008e\u0001\u001a\u0007\u0012\u0002\b\u00030\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R.\u0010\u0094\u0001\u001a\u0004\u0018\u00010y2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010y8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010M\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0087\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010/R\u0013\u0010\u009b\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010/R\u0013\u0010\u009c\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010/R\u0016\u0010\u009e\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010/R\u0016\u0010 \u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010/R\u0016\u0010¢\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010/R\u0015\u0010¤\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0£\u00018\u0002X\u0082\u0004R\u0015\u0010¥\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010y0£\u00018\u0002X\u0082\u0004¨\u0006§\u0001"}, d2 = {"Lju/j2;", "Lju/d2;", "Lju/w;", "Lju/s2;", "", "active", "<init>", "(Z)V", "Lju/j2$c;", "state", "", "proposedUpdate", "c0", "(Lju/j2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "f0", "(Lju/j2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "O", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lju/y1;", "update", "O0", "(Lju/y1;Ljava/lang/Object;)Z", "Z", "(Lju/y1;Ljava/lang/Object;)V", "Lju/o2;", "list", "cause", "A0", "(Lju/o2;Ljava/lang/Throwable;)V", "W", "(Ljava/lang/Throwable;)Z", "B0", "", "J0", "(Ljava/lang/Object;)I", "Lju/l1;", "F0", "(Lju/l1;)V", "Lju/i2;", "G0", "(Lju/i2;)V", "t0", "()Z", "u0", "(Lmt/b;)Ljava/lang/Object;", "V", "(Ljava/lang/Object;)Ljava/lang/Object;", "b0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "v0", "i0", "(Lju/y1;)Lju/o2;", "P0", "(Lju/y1;Ljava/lang/Throwable;)Z", "Q0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "R0", "(Lju/y1;Ljava/lang/Object;)Ljava/lang/Object;", "Lju/v;", "child", "S0", "(Lju/j2$c;Lju/v;Ljava/lang/Object;)Z", "lastChild", "a0", "(Lju/j2$c;Lju/v;Ljava/lang/Object;)V", "Lpu/p;", "z0", "(Lpu/p;)Lju/v;", "", "K0", "(Ljava/lang/Object;)Ljava/lang/String;", "R", "parent", "q0", "(Lju/d2;)V", "start", "E0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "m", "()Ljava/util/concurrent/CancellationException;", "message", "L0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lju/i1;", "o", "(Lkotlin/jvm/functions/Function1;)Lju/i1;", "onCancelling", "invokeImmediately", "l", "(ZZLkotlin/jvm/functions/Function1;)Lju/i1;", "node", "r0", "(ZLju/i2;)Lju/i1;", "j", "H0", "c", "(Ljava/util/concurrent/CancellationException;)V", "X", "()Ljava/lang/String;", "U", "(Ljava/lang/Throwable;)V", "parentJob", "x", "(Lju/s2;)V", "Y", "S", "T", "(Ljava/lang/Object;)Z", "u", "w0", "x0", "Lju/u;", "B", "(Lju/w;)Lju/u;", "exception", "p0", "C0", "o0", "D0", "(Ljava/lang/Object;)V", "P", "toString", "N0", "y0", "d0", "()Ljava/lang/Object;", "Q", "e0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "value", "k0", "()Lju/u;", "I0", "(Lju/u;)V", "parentHandle", "j0", "()Lju/d2;", "l0", j6.b.f21518e, "isActive", rl.d.f30696a, "isCompleted", "isCancelled", "h0", "onCancelComplete", "s0", "isScopedCoroutine", "g0", "handlesException", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", ve.a.f33391e, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class j2 implements d2, w, s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22098a = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lju/j2$a;", "T", "Lju/p;", "Lmt/b;", "delegate", "Lju/j2;", "job", "<init>", "(Lmt/b;Lju/j2;)V", "Lju/d2;", "parent", "", "x", "(Lju/d2;)Ljava/lang/Throwable;", "", "O", "()Ljava/lang/String;", "i", "Lju/j2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends p<T> {

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j2 job;

        public a(@NotNull mt.b<? super T> bVar, @NotNull j2 j2Var) {
            super(bVar, 1);
            this.job = j2Var;
        }

        @Override // ju.p
        @NotNull
        public String O() {
            return "AwaitContinuation";
        }

        @Override // ju.p
        @NotNull
        public Throwable x(@NotNull d2 parent) {
            Throwable f10;
            Object l02 = this.job.l0();
            return (!(l02 instanceof c) || (f10 = ((c) l02).f()) == null) ? l02 instanceof c0 ? ((c0) l02).cause : parent.m() : f10;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lju/j2$b;", "Lju/i2;", "Lju/j2;", "parent", "Lju/j2$c;", "state", "Lju/v;", "child", "", "proposedUpdate", "<init>", "(Lju/j2;Lju/j2$c;Lju/v;Ljava/lang/Object;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "e", "Lju/j2;", "f", "Lju/j2$c;", "g", "Lju/v;", "h", "Ljava/lang/Object;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends i2 {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j2 parent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final v child;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object proposedUpdate;

        public b(@NotNull j2 j2Var, @NotNull c cVar, @NotNull v vVar, @Nullable Object obj) {
            this.parent = j2Var;
            this.state = cVar;
            this.child = vVar;
            this.proposedUpdate = obj;
        }

        @Override // ju.i2
        public boolean w() {
            return false;
        }

        @Override // ju.i2
        public void x(@Nullable Throwable cause) {
            this.parent.a0(this.state, this.child, this.proposedUpdate);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0017j\b\u0012\u0004\u0012\u00020\b`\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0013R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010+\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R(\u00100\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b038\u0002X\u0082\u0004R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001038\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lju/j2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lju/y1;", "Lju/o2;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lju/o2;ZLjava/lang/Throwable;)V", "proposedException", "", "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", ve.a.f33391e, "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "Lju/o2;", rl.d.f30696a, "()Lju/o2;", "value", "k", "()Z", "n", "(Z)V", "f", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", j6.b.f21518e, "isActive", "e", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "Lkotlinx/atomicfu/AtomicRef;", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements y1 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f22104c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f22105d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final o2 list;

        public c(@NotNull o2 o2Var, boolean z10, @Nullable Throwable th2) {
            this.list = o2Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        public final void a(@NotNull Throwable exception) {
            Throwable f10 = f();
            if (f10 == null) {
                p(exception);
                return;
            }
            if (exception == f10) {
                return;
            }
            Object e10 = e();
            if (e10 == null) {
                o(exception);
                return;
            }
            if (e10 instanceof Throwable) {
                if (exception == e10) {
                    return;
                }
                ArrayList<Throwable> c10 = c();
                c10.add(e10);
                c10.add(exception);
                o(c10);
                return;
            }
            if (e10 instanceof ArrayList) {
                ((ArrayList) e10).add(exception);
                return;
            }
            throw new IllegalStateException(("State is " + e10).toString());
        }

        @Override // ju.y1
        /* renamed from: b */
        public boolean getIsActive() {
            return f() == null;
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        @Override // ju.y1
        @NotNull
        /* renamed from: d, reason: from getter */
        public o2 getList() {
            return this.list;
        }

        public final Object e() {
            return f22105d.get(this);
        }

        @Nullable
        public final Throwable f() {
            return (Throwable) f22104c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return b.get(this) == 1;
        }

        public final boolean l() {
            pu.e0 e0Var;
            Object e10 = e();
            e0Var = k2.f22112e;
            return e10 == e0Var;
        }

        @NotNull
        public final List<Throwable> m(@Nullable Throwable proposedException) {
            ArrayList<Throwable> arrayList;
            pu.e0 e0Var;
            Object e10 = e();
            if (e10 == null) {
                arrayList = c();
            } else if (e10 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(e10);
                arrayList = c10;
            } else {
                if (!(e10 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
                arrayList = (ArrayList) e10;
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (proposedException != null && !Intrinsics.c(proposedException, f10)) {
                arrayList.add(proposedException);
            }
            e0Var = k2.f22112e;
            o(e0Var);
            return arrayList;
        }

        public final void n(boolean z10) {
            b.set(this, z10 ? 1 : 0);
        }

        public final void o(Object obj) {
            f22105d.set(this, obj);
        }

        public final void p(@Nullable Throwable th2) {
            f22104c.set(this, th2);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + getList() + ']';
        }
    }

    public j2(boolean z10) {
        this._state$volatile = z10 ? k2.f22114g : k2.f22113f;
    }

    public static /* synthetic */ CancellationException M0(j2 j2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return j2Var.L0(th2, str);
    }

    public final void A0(o2 list, Throwable cause) {
        C0(cause);
        list.h(4);
        Object l10 = list.l();
        Intrinsics.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        d0 d0Var = null;
        for (pu.p pVar = (pu.p) l10; !Intrinsics.c(pVar, list); pVar = pVar.m()) {
            if ((pVar instanceof i2) && ((i2) pVar).w()) {
                try {
                    ((i2) pVar).x(cause);
                } catch (Throwable th2) {
                    if (d0Var != null) {
                        gt.a.a(d0Var, th2);
                    } else {
                        d0Var = new d0("Exception in completion handler " + pVar + " for " + this, th2);
                        Unit unit = Unit.f22894a;
                    }
                }
            }
        }
        if (d0Var != null) {
            p0(d0Var);
        }
        W(cause);
    }

    @Override // ju.d2
    @NotNull
    public final u B(@NotNull w child) {
        v vVar = new v(child);
        vVar.y(this);
        while (true) {
            Object l02 = l0();
            if (l02 instanceof l1) {
                l1 l1Var = (l1) l02;
                if (!l1Var.getIsActive()) {
                    F0(l1Var);
                } else if (y1.b.a(f22098a, this, l02, vVar)) {
                    return vVar;
                }
            } else {
                if (!(l02 instanceof y1)) {
                    Object l03 = l0();
                    c0 c0Var = l03 instanceof c0 ? (c0) l03 : null;
                    vVar.x(c0Var != null ? c0Var.cause : null);
                    return q2.f22142a;
                }
                o2 list = ((y1) l02).getList();
                if (list != null) {
                    if (!list.e(vVar, 7)) {
                        boolean e10 = list.e(vVar, 3);
                        Object l04 = l0();
                        if (l04 instanceof c) {
                            r2 = ((c) l04).f();
                        } else {
                            c0 c0Var2 = l04 instanceof c0 ? (c0) l04 : null;
                            if (c0Var2 != null) {
                                r2 = c0Var2.cause;
                            }
                        }
                        vVar.x(r2);
                        if (!e10) {
                            return q2.f22142a;
                        }
                    }
                    return vVar;
                }
                Intrinsics.d(l02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                G0((i2) l02);
            }
        }
    }

    public final void B0(o2 o2Var, Throwable th2) {
        o2Var.h(1);
        Object l10 = o2Var.l();
        Intrinsics.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        d0 d0Var = null;
        for (pu.p pVar = (pu.p) l10; !Intrinsics.c(pVar, o2Var); pVar = pVar.m()) {
            if (pVar instanceof i2) {
                try {
                    ((i2) pVar).x(th2);
                } catch (Throwable th3) {
                    if (d0Var != null) {
                        gt.a.a(d0Var, th3);
                    } else {
                        d0Var = new d0("Exception in completion handler " + pVar + " for " + this, th3);
                        Unit unit = Unit.f22894a;
                    }
                }
            }
        }
        if (d0Var != null) {
            p0(d0Var);
        }
    }

    public void C0(@Nullable Throwable cause) {
    }

    public void D0(@Nullable Object state) {
    }

    public void E0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ju.x1] */
    public final void F0(l1 state) {
        o2 o2Var = new o2();
        if (!state.getIsActive()) {
            o2Var = new x1(o2Var);
        }
        y1.b.a(f22098a, this, state, o2Var);
    }

    public final void G0(i2 state) {
        state.g(new o2());
        y1.b.a(f22098a, this, state, state.m());
    }

    public final void H0(@NotNull i2 node) {
        Object l02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l1 l1Var;
        do {
            l02 = l0();
            if (!(l02 instanceof i2)) {
                if (!(l02 instanceof y1) || ((y1) l02).getList() == null) {
                    return;
                }
                node.s();
                return;
            }
            if (l02 != node) {
                return;
            }
            atomicReferenceFieldUpdater = f22098a;
            l1Var = k2.f22114g;
        } while (!y1.b.a(atomicReferenceFieldUpdater, this, l02, l1Var));
    }

    public final void I0(@Nullable u uVar) {
        b.set(this, uVar);
    }

    public final int J0(Object state) {
        l1 l1Var;
        if (!(state instanceof l1)) {
            if (!(state instanceof x1)) {
                return 0;
            }
            if (!y1.b.a(f22098a, this, state, ((x1) state).getList())) {
                return -1;
            }
            E0();
            return 1;
        }
        if (((l1) state).getIsActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22098a;
        l1Var = k2.f22114g;
        if (!y1.b.a(atomicReferenceFieldUpdater, this, state, l1Var)) {
            return -1;
        }
        E0();
        return 1;
    }

    public final String K0(Object state) {
        if (!(state instanceof c)) {
            return state instanceof y1 ? ((y1) state).getIsActive() ? "Active" : "New" : state instanceof c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) state;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    @NotNull
    public final CancellationException L0(@NotNull Throwable th2, @Nullable String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = X();
            }
            cancellationException = new e2(str, th2, this);
        }
        return cancellationException;
    }

    @NotNull
    public final String N0() {
        return y0() + '{' + K0(l0()) + '}';
    }

    public final void O(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th2 : exceptions) {
            if (th2 != rootCause && th2 != rootCause && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                gt.a.a(rootCause, th2);
            }
        }
    }

    public final boolean O0(y1 state, Object update) {
        if (!y1.b.a(f22098a, this, state, k2.g(update))) {
            return false;
        }
        C0(null);
        D0(update);
        Z(state, update);
        return true;
    }

    public void P(@Nullable Object state) {
    }

    public final boolean P0(y1 state, Throwable rootCause) {
        o2 i02 = i0(state);
        if (i02 == null) {
            return false;
        }
        if (!y1.b.a(f22098a, this, state, new c(i02, false, rootCause))) {
            return false;
        }
        A0(i02, rootCause);
        return true;
    }

    @Nullable
    public final Object Q(@NotNull mt.b<Object> bVar) {
        Object l02;
        do {
            l02 = l0();
            if (!(l02 instanceof y1)) {
                if (l02 instanceof c0) {
                    throw ((c0) l02).cause;
                }
                return k2.h(l02);
            }
        } while (J0(l02) < 0);
        return R(bVar);
    }

    public final Object Q0(Object state, Object proposedUpdate) {
        pu.e0 e0Var;
        pu.e0 e0Var2;
        if (!(state instanceof y1)) {
            e0Var2 = k2.f22109a;
            return e0Var2;
        }
        if ((!(state instanceof l1) && !(state instanceof i2)) || (state instanceof v) || (proposedUpdate instanceof c0)) {
            return R0((y1) state, proposedUpdate);
        }
        if (O0((y1) state, proposedUpdate)) {
            return proposedUpdate;
        }
        e0Var = k2.f22110c;
        return e0Var;
    }

    public final Object R(mt.b<Object> bVar) {
        a aVar = new a(nt.b.c(bVar), this);
        aVar.F();
        r.a(aVar, h2.j(this, false, new t2(aVar), 1, null));
        Object z10 = aVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object R0(y1 state, Object proposedUpdate) {
        pu.e0 e0Var;
        pu.e0 e0Var2;
        pu.e0 e0Var3;
        o2 i02 = i0(state);
        if (i02 == null) {
            e0Var3 = k2.f22110c;
            return e0Var3;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(i02, false, null);
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        synchronized (cVar) {
            if (cVar.k()) {
                e0Var2 = k2.f22109a;
                return e0Var2;
            }
            cVar.n(true);
            if (cVar != state && !y1.b.a(f22098a, this, state, cVar)) {
                e0Var = k2.f22110c;
                return e0Var;
            }
            boolean j10 = cVar.j();
            c0 c0Var2 = proposedUpdate instanceof c0 ? (c0) proposedUpdate : null;
            if (c0Var2 != null) {
                cVar.a(c0Var2.cause);
            }
            ?? f10 = j10 ? 0 : cVar.f();
            c0Var.f22963a = f10;
            Unit unit = Unit.f22894a;
            if (f10 != 0) {
                A0(i02, f10);
            }
            v z02 = z0(i02);
            if (z02 != null && S0(cVar, z02, proposedUpdate)) {
                return k2.b;
            }
            i02.h(2);
            v z03 = z0(i02);
            return (z03 == null || !S0(cVar, z03, proposedUpdate)) ? c0(cVar, proposedUpdate) : k2.b;
        }
    }

    public final boolean S(@Nullable Throwable cause) {
        return T(cause);
    }

    public final boolean S0(c state, v child, Object proposedUpdate) {
        while (g2.i(child.childJob, false, new b(this, state, child, proposedUpdate)) == q2.f22142a) {
            child = z0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean T(@Nullable Object cause) {
        Object obj;
        pu.e0 e0Var;
        pu.e0 e0Var2;
        pu.e0 e0Var3;
        obj = k2.f22109a;
        if (h0() && (obj = V(cause)) == k2.b) {
            return true;
        }
        e0Var = k2.f22109a;
        if (obj == e0Var) {
            obj = v0(cause);
        }
        e0Var2 = k2.f22109a;
        if (obj == e0Var2 || obj == k2.b) {
            return true;
        }
        e0Var3 = k2.f22111d;
        if (obj == e0Var3) {
            return false;
        }
        P(obj);
        return true;
    }

    public void U(@NotNull Throwable cause) {
        T(cause);
    }

    public final Object V(Object cause) {
        pu.e0 e0Var;
        Object Q0;
        pu.e0 e0Var2;
        do {
            Object l02 = l0();
            if (!(l02 instanceof y1) || ((l02 instanceof c) && ((c) l02).k())) {
                e0Var = k2.f22109a;
                return e0Var;
            }
            Q0 = Q0(l02, new c0(b0(cause), false, 2, null));
            e0Var2 = k2.f22110c;
        } while (Q0 == e0Var2);
        return Q0;
    }

    public final boolean W(Throwable cause) {
        if (s0()) {
            return true;
        }
        boolean z10 = cause instanceof CancellationException;
        u k02 = k0();
        return (k02 == null || k02 == q2.f22142a) ? z10 : k02.c(cause) || z10;
    }

    @NotNull
    public String X() {
        return "Job was cancelled";
    }

    public boolean Y(@NotNull Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return T(cause) && getHandlesException();
    }

    public final void Z(y1 state, Object update) {
        u k02 = k0();
        if (k02 != null) {
            k02.a();
            I0(q2.f22142a);
        }
        c0 c0Var = update instanceof c0 ? (c0) update : null;
        Throwable th2 = c0Var != null ? c0Var.cause : null;
        if (!(state instanceof i2)) {
            o2 list = state.getList();
            if (list != null) {
                B0(list, th2);
                return;
            }
            return;
        }
        try {
            ((i2) state).x(th2);
        } catch (Throwable th3) {
            p0(new d0("Exception in completion handler " + state + " for " + this, th3));
        }
    }

    public final void a0(c state, v lastChild, Object proposedUpdate) {
        v z02 = z0(lastChild);
        if (z02 == null || !S0(state, z02, proposedUpdate)) {
            state.getList().h(2);
            v z03 = z0(lastChild);
            if (z03 == null || !S0(state, z03, proposedUpdate)) {
                P(c0(state, proposedUpdate));
            }
        }
    }

    @Override // ju.d2
    public boolean b() {
        Object l02 = l0();
        return (l02 instanceof y1) && ((y1) l02).getIsActive();
    }

    public final Throwable b0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th2 = (Throwable) cause;
            return th2 == null ? new e2(X(), null, this) : th2;
        }
        Intrinsics.d(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((s2) cause).u();
    }

    @Override // ju.d2
    public void c(@Nullable CancellationException cause) {
        if (cause == null) {
            cause = new e2(X(), null, this);
        }
        U(cause);
    }

    public final Object c0(c state, Object proposedUpdate) {
        boolean j10;
        Throwable f02;
        c0 c0Var = proposedUpdate instanceof c0 ? (c0) proposedUpdate : null;
        Throwable th2 = c0Var != null ? c0Var.cause : null;
        synchronized (state) {
            j10 = state.j();
            List<Throwable> m10 = state.m(th2);
            f02 = f0(state, m10);
            if (f02 != null) {
                O(f02, m10);
            }
        }
        if (f02 != null && f02 != th2) {
            proposedUpdate = new c0(f02, false, 2, null);
        }
        if (f02 != null && (W(f02) || o0(f02))) {
            Intrinsics.d(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((c0) proposedUpdate).c();
        }
        if (!j10) {
            C0(f02);
        }
        D0(proposedUpdate);
        y1.b.a(f22098a, this, state, k2.g(proposedUpdate));
        Z(state, proposedUpdate);
        return proposedUpdate;
    }

    @Override // ju.d2
    public final boolean d() {
        return !(l0() instanceof y1);
    }

    @Nullable
    public final Object d0() {
        Object l02 = l0();
        if (l02 instanceof y1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (l02 instanceof c0) {
            throw ((c0) l02).cause;
        }
        return k2.h(l02);
    }

    public final Throwable e0(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.cause;
        }
        return null;
    }

    public final Throwable f0(c state, List<? extends Throwable> exceptions) {
        Object obj;
        Object obj2 = null;
        if (exceptions.isEmpty()) {
            if (state.j()) {
                return new e2(X(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list = exceptions;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = exceptions.get(0);
        if (th3 instanceof e3) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof e3)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) d2.a.b(this, r8, function2);
    }

    /* renamed from: g0 */
    public boolean getHandlesException() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) d2.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.b<?> getKey() {
        return d2.INSTANCE;
    }

    public boolean h0() {
        return false;
    }

    public final o2 i0(y1 state) {
        o2 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof l1) {
            return new o2();
        }
        if (state instanceof i2) {
            G0((i2) state);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + state).toString());
    }

    @Override // ju.d2
    public final boolean isCancelled() {
        Object l02 = l0();
        if (l02 instanceof c0) {
            return true;
        }
        return (l02 instanceof c) && ((c) l02).j();
    }

    @Override // ju.d2
    @Nullable
    public final Object j(@NotNull mt.b<? super Unit> bVar) {
        if (t0()) {
            Object u02 = u0(bVar);
            return u02 == nt.c.e() ? u02 : Unit.f22894a;
        }
        g2.g(bVar.getContext());
        return Unit.f22894a;
    }

    @Nullable
    public d2 j0() {
        u k02 = k0();
        if (k02 != null) {
            return k02.getParent();
        }
        return null;
    }

    @Nullable
    public final u k0() {
        return (u) b.get(this);
    }

    @Override // ju.d2
    @NotNull
    public final i1 l(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return r0(invokeImmediately, onCancelling ? new b2(handler) : new c2(handler));
    }

    @Nullable
    public final Object l0() {
        return f22098a.get(this);
    }

    @Override // ju.d2
    @NotNull
    public final CancellationException m() {
        Object l02 = l0();
        if (!(l02 instanceof c)) {
            if (l02 instanceof y1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (l02 instanceof c0) {
                return M0(this, ((c0) l02).cause, null, 1, null);
            }
            return new e2(t0.a(this) + " has completed normally", null, this);
        }
        Throwable f10 = ((c) l02).f();
        if (f10 != null) {
            CancellationException L0 = L0(f10, t0.a(this) + " is cancelling");
            if (L0 != null) {
                return L0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return d2.a.d(this, bVar);
    }

    @Override // ju.d2
    @NotNull
    public final i1 o(@NotNull Function1<? super Throwable, Unit> handler) {
        return r0(true, new c2(handler));
    }

    public boolean o0(@NotNull Throwable exception) {
        return false;
    }

    public void p0(@NotNull Throwable exception) {
        throw exception;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return d2.a.e(this, coroutineContext);
    }

    public final void q0(@Nullable d2 parent) {
        if (parent == null) {
            I0(q2.f22142a);
            return;
        }
        parent.start();
        u B = parent.B(this);
        I0(B);
        if (d()) {
            B.a();
            I0(q2.f22142a);
        }
    }

    @NotNull
    public final i1 r0(boolean invokeImmediately, @NotNull i2 node) {
        boolean z10;
        boolean e10;
        node.y(this);
        while (true) {
            Object l02 = l0();
            z10 = true;
            if (!(l02 instanceof l1)) {
                if (!(l02 instanceof y1)) {
                    z10 = false;
                    break;
                }
                y1 y1Var = (y1) l02;
                o2 list = y1Var.getList();
                if (list == null) {
                    Intrinsics.d(l02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    G0((i2) l02);
                } else {
                    if (node.w()) {
                        c cVar = y1Var instanceof c ? (c) y1Var : null;
                        Throwable f10 = cVar != null ? cVar.f() : null;
                        if (f10 != null) {
                            if (invokeImmediately) {
                                node.x(f10);
                            }
                            return q2.f22142a;
                        }
                        e10 = list.e(node, 5);
                    } else {
                        e10 = list.e(node, 1);
                    }
                    if (e10) {
                        break;
                    }
                }
            } else {
                l1 l1Var = (l1) l02;
                if (!l1Var.getIsActive()) {
                    F0(l1Var);
                } else if (y1.b.a(f22098a, this, l02, node)) {
                    break;
                }
            }
        }
        if (z10) {
            return node;
        }
        if (invokeImmediately) {
            Object l03 = l0();
            c0 c0Var = l03 instanceof c0 ? (c0) l03 : null;
            node.x(c0Var != null ? c0Var.cause : null);
        }
        return q2.f22142a;
    }

    public boolean s0() {
        return false;
    }

    @Override // ju.d2
    public final boolean start() {
        int J0;
        do {
            J0 = J0(l0());
            if (J0 == 0) {
                return false;
            }
        } while (J0 != 1);
        return true;
    }

    public final boolean t0() {
        Object l02;
        do {
            l02 = l0();
            if (!(l02 instanceof y1)) {
                return false;
            }
        } while (J0(l02) < 0);
        return true;
    }

    @NotNull
    public String toString() {
        return N0() + '@' + t0.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // ju.s2
    @NotNull
    public CancellationException u() {
        CancellationException cancellationException;
        Object l02 = l0();
        if (l02 instanceof c) {
            cancellationException = ((c) l02).f();
        } else if (l02 instanceof c0) {
            cancellationException = ((c0) l02).cause;
        } else {
            if (l02 instanceof y1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + l02).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new e2("Parent job is " + K0(l02), cancellationException, this);
    }

    public final Object u0(mt.b<? super Unit> bVar) {
        p pVar = new p(nt.b.c(bVar), 1);
        pVar.F();
        r.a(pVar, h2.j(this, false, new u2(pVar), 1, null));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10 == nt.c.e() ? z10 : Unit.f22894a;
    }

    public final Object v0(Object cause) {
        pu.e0 e0Var;
        pu.e0 e0Var2;
        pu.e0 e0Var3;
        pu.e0 e0Var4;
        pu.e0 e0Var5;
        pu.e0 e0Var6;
        Throwable th2 = null;
        while (true) {
            Object l02 = l0();
            if (l02 instanceof c) {
                synchronized (l02) {
                    if (((c) l02).l()) {
                        e0Var2 = k2.f22111d;
                        return e0Var2;
                    }
                    boolean j10 = ((c) l02).j();
                    if (cause != null || !j10) {
                        if (th2 == null) {
                            th2 = b0(cause);
                        }
                        ((c) l02).a(th2);
                    }
                    Throwable f10 = j10 ? null : ((c) l02).f();
                    if (f10 != null) {
                        A0(((c) l02).getList(), f10);
                    }
                    e0Var = k2.f22109a;
                    return e0Var;
                }
            }
            if (!(l02 instanceof y1)) {
                e0Var3 = k2.f22111d;
                return e0Var3;
            }
            if (th2 == null) {
                th2 = b0(cause);
            }
            y1 y1Var = (y1) l02;
            if (!y1Var.getIsActive()) {
                Object Q0 = Q0(l02, new c0(th2, false, 2, null));
                e0Var5 = k2.f22109a;
                if (Q0 == e0Var5) {
                    throw new IllegalStateException(("Cannot happen in " + l02).toString());
                }
                e0Var6 = k2.f22110c;
                if (Q0 != e0Var6) {
                    return Q0;
                }
            } else if (P0(y1Var, th2)) {
                e0Var4 = k2.f22109a;
                return e0Var4;
            }
        }
    }

    public final boolean w0(@Nullable Object proposedUpdate) {
        Object Q0;
        pu.e0 e0Var;
        pu.e0 e0Var2;
        do {
            Q0 = Q0(l0(), proposedUpdate);
            e0Var = k2.f22109a;
            if (Q0 == e0Var) {
                return false;
            }
            if (Q0 == k2.b) {
                return true;
            }
            e0Var2 = k2.f22110c;
        } while (Q0 == e0Var2);
        P(Q0);
        return true;
    }

    @Override // ju.w
    public final void x(@NotNull s2 parentJob) {
        T(parentJob);
    }

    @Nullable
    public final Object x0(@Nullable Object proposedUpdate) {
        Object Q0;
        pu.e0 e0Var;
        pu.e0 e0Var2;
        do {
            Q0 = Q0(l0(), proposedUpdate);
            e0Var = k2.f22109a;
            if (Q0 == e0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, e0(proposedUpdate));
            }
            e0Var2 = k2.f22110c;
        } while (Q0 == e0Var2);
        return Q0;
    }

    @NotNull
    public String y0() {
        return t0.a(this);
    }

    public final v z0(pu.p pVar) {
        while (pVar.r()) {
            pVar = pVar.n();
        }
        while (true) {
            pVar = pVar.m();
            if (!pVar.r()) {
                if (pVar instanceof v) {
                    return (v) pVar;
                }
                if (pVar instanceof o2) {
                    return null;
                }
            }
        }
    }
}
