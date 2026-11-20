package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u000fR\u0016\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u0010\nR\u0011\u00106\u001a\b\u0012\u0004\u0012\u00020\u0007058\u0002X\u0082\u0004¨\u00067"}, d2 = {"Lmu/q0;", "T", "Lnu/b;", "Lmu/s0;", "Lmu/c0;", "Lmu/c;", "Lnu/q;", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "expect", "update", "", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", ve.a.f33391e, "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "j", "()V", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "n", "()Lmu/s0;", "", "size", "", "o", "(I)[Lmu/s0;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Llu/a;", "onBufferOverflow", "Lmu/h;", "h", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lmu/h;", "expectedState", "newState", "q", "e", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class q0<T> extends kotlin.b<s0> implements c0<T>, c<T>, kotlin.q<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25145f = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int sequence;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, HttpStatusCode.UNAUTHORIZED_401, 406}, m = "collect")
    public static final class a extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f25147t;

        /* renamed from: u, reason: collision with root package name */
        public Object f25148u;

        /* renamed from: v, reason: collision with root package name */
        public Object f25149v;

        /* renamed from: w, reason: collision with root package name */
        public Object f25150w;

        /* renamed from: x, reason: collision with root package name */
        public Object f25151x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f25152y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ q0<T> f25153z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0<T> q0Var, mt.b<? super a> bVar) {
            super(bVar);
            this.f25153z = q0Var;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25152y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f25153z.collect(null, this);
        }
    }

    public q0(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    @Override // mu.b0
    public boolean a(T value) {
        setValue(value);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f2, code lost:
    
        if (r12 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        if (((mu.t0) r11).b(r0) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ac, B:16:0x00b6, B:18:0x00bb, B:20:0x00dc, B:22:0x00e2, B:26:0x00c1, B:29:0x00c8, B:38:0x0060, B:40:0x0073, B:41:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ac, B:16:0x00b6, B:18:0x00bb, B:20:0x00dc, B:22:0x00e2, B:26:0x00c1, B:29:0x00c8, B:38:0x0060, B:40:0x0073, B:41:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ac, B:16:0x00b6, B:18:0x00bb, B:20:0x00dc, B:22:0x00e2, B:26:0x00c1, B:29:0x00c8, B:38:0x0060, B:40:0x0073, B:41:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [nu.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e0 -> B:14:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f2 -> B:14:0x00ac). Please report as a decompilation issue!!! */
    @Override // mu.g0, mu.h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull mu.i<? super T> r11, @org.jetbrains.annotations.NotNull mt.b<?> r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.q0.collect(mu.i, mt.b):java.lang.Object");
    }

    @Override // mu.b0, mu.i
    @Nullable
    public Object emit(T t8, @NotNull mt.b<? super Unit> bVar) {
        setValue(t8);
        return Unit.f22894a;
    }

    @Override // mu.c0, mu.p0
    public T getValue() {
        pu.e0 e0Var = kotlin.t.f27442a;
        T t8 = (T) f25145f.get(this);
        if (t8 == e0Var) {
            return null;
        }
        return t8;
    }

    @Override // kotlin.q
    @NotNull
    public h<T> h(@NotNull CoroutineContext context, int capacity, @NotNull lu.a onBufferOverflow) {
        return r0.d(this, context, capacity, onBufferOverflow);
    }

    @Override // mu.c0
    public boolean i(T expect, T update) {
        if (expect == null) {
            expect = (T) kotlin.t.f27442a;
        }
        if (update == null) {
            update = (T) kotlin.t.f27442a;
        }
        return q(expect, update);
    }

    @Override // mu.b0
    public void j() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlin.b
    @NotNull
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public s0 e() {
        return new s0();
    }

    @Override // kotlin.b
    @NotNull
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public s0[] f(int size) {
        return new s0[size];
    }

    public final boolean q(Object expectedState, Object newState) {
        int i10;
        s0[] m10;
        synchronized (this) {
            Object obj = f25145f.get(this);
            if (expectedState != null && !Intrinsics.c(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.c(obj, newState)) {
                return true;
            }
            f25145f.set(this, newState);
            int i11 = this.sequence;
            if ((i11 & 1) != 0) {
                this.sequence = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.sequence = i12;
            s0[] m11 = m();
            Unit unit = Unit.f22894a;
            while (true) {
                s0[] s0VarArr = m11;
                if (s0VarArr != null) {
                    for (s0 s0Var : s0VarArr) {
                        if (s0Var != null) {
                            s0Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.sequence;
                    if (i10 == i12) {
                        this.sequence = i12 + 1;
                        return true;
                    }
                    m10 = m();
                    Unit unit2 = Unit.f22894a;
                }
                m11 = m10;
                i12 = i10;
            }
        }
    }

    @Override // mu.c0
    public void setValue(T t8) {
        if (t8 == null) {
            t8 = (T) kotlin.t.f27442a;
        }
        q(null, t8);
    }
}
