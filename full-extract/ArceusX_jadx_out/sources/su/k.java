package su;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.i1;
import ju.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.b0;
import pu.e0;
import zl.t;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001&B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u000e\u0018\u00010\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0018\u0010\nJ!\u0010\u001a\u001a\u00020\f2\u0010\u0010\u0019\u001a\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\u001c\u0010\nJ2\u0010!\u001a\u00020\f*\u00020\u001d2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"JD\u0010&\u001a\u00020\f\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00010$2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040%H\u0096\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\f*\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b5\u0010\u000eJ!\u00107\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010@\u001a\u0004\bA\u0010BR(\u0010E\u001a\u0014\u0012\u000e\u0012\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010FR\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010HR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010FR\u0014\u0010L\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0002X\u0082\u0004¨\u0006O"}, d2 = {"Lsu/k;", "R", "Lju/m;", "Lsu/d;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "q", "(Lmt/b;)Ljava/lang/Object;", "clauseObject", "", "k", "(Ljava/lang/Object;)V", "z", "w", "internalResult", "", "y", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lsu/k$a;", "r", "(Ljava/lang/Object;)Lsu/k$a;", "m", "selectedClause", "l", "(Lsu/k$a;)V", "o", "Lsu/f;", "Lkotlin/Function1;", "Lmt/b;", "block", j6.b.f21518e, "(Lsu/f;Lkotlin/jvm/functions/Function1;)V", "Q", "Lsu/h;", "Lkotlin/Function2;", ve.a.f33391e, "(Lsu/h;Lkotlin/jvm/functions/Function2;)V", "", "reregister", "u", "(Lsu/k$a;Z)V", "Lju/i1;", "disposableHandle", "n", "(Lju/i1;)V", "Lpu/b0;", "segment", "index", "c", "(Lpu/b0;I)V", "e", "result", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lsu/o;", "x", "(Ljava/lang/Object;Ljava/lang/Object;)Lsu/o;", "", "cause", rl.d.f30696a, "(Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", t.f38095d, "()Z", "isSelected", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class k<R> implements ju.m, d<R>, l, k3 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31694f = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<k<R>.a> clauses;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object disposableHandleOrSegment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int indexInSegment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object internalResult;
    private volatile /* synthetic */ Object state$volatile;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012H\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\"R6\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R6\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"RV\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010*\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lsu/k$a;", "", "clauseObject", "Lkotlin/Function3;", "Lsu/l;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lsu/k;Ljava/lang/Object;Lyt/n;Lyt/n;Ljava/lang/Object;Ljava/lang/Object;Lyt/n;)V", "Lsu/k;", "select", "", "e", "(Lsu/k;)Z", "result", rl.d.f30696a, "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "()V", "internalResult", ve.a.f33391e, "(Lsu/l;Ljava/lang/Object;)Lyt/n;", "Ljava/lang/Object;", "Lyt/n;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Object clauseObject;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final yt.n<Object, l<?>, Object, Unit> regFunc;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final yt.n<Object, Object, Object, Object> processResFunc;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object param;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Object block;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final yt.n<l<?>, Object, Object, yt.n<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object disposableHandleOrSegment;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, @NotNull yt.n<Object, ? super l<?>, Object, Unit> nVar, @NotNull yt.n<Object, Object, Object, ? extends Object> nVar2, @Nullable Object obj2, @NotNull Object obj3, @Nullable yt.n<? super l<?>, Object, Object, ? extends yt.n<? super Throwable, Object, ? super CoroutineContext, Unit>> nVar3) {
            this.clauseObject = obj;
            this.regFunc = nVar;
            this.processResFunc = nVar2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = nVar3;
        }

        @Nullable
        public final yt.n<Throwable, Object, CoroutineContext, Unit> a(@NotNull l<?> select, @Nullable Object internalResult) {
            yt.n<l<?>, Object, Object, yt.n<Throwable, Object, CoroutineContext, Unit>> nVar = this.onCancellationConstructor;
            if (nVar != null) {
                return nVar.invoke(select, this.param, internalResult);
            }
            return null;
        }

        public final void b() {
            Object obj = this.disposableHandleOrSegment;
            k<R> kVar = k.this;
            if (obj instanceof b0) {
                ((b0) obj).s(this.indexInSegment, null, kVar.getContext());
                return;
            }
            i1 i1Var = obj instanceof i1 ? (i1) obj : null;
            if (i1Var != null) {
                i1Var.a();
            }
        }

        @Nullable
        public final Object c(@Nullable Object obj, @NotNull mt.b<? super R> bVar) {
            Object obj2 = this.block;
            if (this.param == m.i()) {
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(bVar);
            }
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, bVar);
        }

        @Nullable
        public final Object d(@Nullable Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        public final boolean e(@NotNull k<R> select) {
            e0 e0Var;
            this.regFunc.invoke(this.clauseObject, select, this.param);
            Object obj = select.internalResult;
            e0Var = m.f31714e;
            return obj == e0Var;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31707t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31708u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<R> f31709v;

        /* renamed from: w, reason: collision with root package name */
        public int f31710w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k<R> kVar, mt.b<? super b> bVar) {
            super(bVar);
            this.f31709v = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31708u = obj;
            this.f31710w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31709v.q(this);
        }
    }

    public k(@NotNull CoroutineContext coroutineContext) {
        e0 e0Var;
        e0 e0Var2;
        this.context = coroutineContext;
        e0Var = m.b;
        this.state$volatile = e0Var;
        this.clauses = new ArrayList(2);
        this.indexInSegment = -1;
        e0Var2 = m.f31714e;
        this.internalResult = e0Var2;
    }

    public static /* synthetic */ <R> Object p(k<R> kVar, mt.b<? super R> bVar) {
        return kVar.t() ? kVar.m(bVar) : kVar.q(bVar);
    }

    private final boolean t() {
        return f31694f.get(this) instanceof a;
    }

    public static /* synthetic */ void v(k kVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kVar.u(aVar, z10);
    }

    @Override // su.d
    public <Q> void a(@NotNull h<? extends Q> hVar, @NotNull Function2<? super Q, ? super mt.b<? super R>, ? extends Object> function2) {
        v(this, new a(hVar.getClauseObject(), hVar.a(), hVar.c(), null, function2, hVar.b()), false, 1, null);
    }

    @Override // su.d
    public void b(@NotNull f fVar, @NotNull Function1<? super mt.b<? super R>, ? extends Object> function1) {
        v(this, new a(fVar.getClauseObject(), fVar.a(), fVar.c(), m.i(), function1, fVar.b()), false, 1, null);
    }

    @Override // ju.k3
    public void c(@NotNull b0<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // ju.m
    public void d(@Nullable Throwable cause) {
        Object obj;
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31694f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            e0Var = m.f31712c;
            if (obj == e0Var) {
                return;
            } else {
                e0Var2 = m.f31713d;
            }
        } while (!y1.b.a(atomicReferenceFieldUpdater, this, obj, e0Var2));
        List<k<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        e0Var3 = m.f31714e;
        this.internalResult = e0Var3;
        this.clauses = null;
    }

    @Override // su.l
    public void e(@Nullable Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // su.l
    public boolean f(@NotNull Object clauseObject, @Nullable Object result) {
        return y(clauseObject, result) == 0;
    }

    @Override // su.l
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    public final void k(Object clauseObject) {
        List<k<R>.a> list = this.clauses;
        Intrinsics.checkNotNull(list);
        List<k<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
            }
        }
    }

    public final void l(k<R>.a selectedClause) {
        e0 e0Var;
        e0 e0Var2;
        List<k<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (k<R>.a aVar : list) {
            if (aVar != selectedClause) {
                aVar.b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31694f;
        e0Var = m.f31712c;
        atomicReferenceFieldUpdater.set(this, e0Var);
        e0Var2 = m.f31714e;
        this.internalResult = e0Var2;
        this.clauses = null;
    }

    public final Object m(mt.b<? super R> bVar) {
        Object obj = f31694f.get(this);
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        k<R>.a aVar = (a) obj;
        Object obj2 = this.internalResult;
        l(aVar);
        return aVar.c(aVar.d(obj2), bVar);
    }

    public void n(@NotNull i1 disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Nullable
    public Object o(@NotNull mt.b<? super R> bVar) {
        return p(this, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(mt.b<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof su.k.b
            if (r0 == 0) goto L13
            r0 = r6
            su.k$b r0 = (su.k.b) r0
            int r1 = r0.f31710w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31710w = r1
            goto L18
        L13:
            su.k$b r0 = new su.k$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31708u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31710w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            gt.o.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f31707t
            su.k r2 = (su.k) r2
            gt.o.b(r6)
            goto L4b
        L3c:
            gt.o.b(r6)
            r0.f31707t = r5
            r0.f31710w = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f31707t = r6
            r0.f31710w = r3
            java.lang.Object r6 = r2.m(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: su.k.q(mt.b):java.lang.Object");
    }

    public final k<R>.a r(Object clauseObject) {
        List<k<R>.a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).clauseObject == clauseObject) {
                obj = next;
                break;
            }
        }
        k<R>.a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    public final void u(@NotNull k<R>.a aVar, boolean z10) {
        if (f31694f.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            k(aVar.clauseObject);
        }
        if (!aVar.e(this)) {
            f31694f.set(this, aVar);
            return;
        }
        if (!z10) {
            List<k<R>.a> list = this.clauses;
            Intrinsics.checkNotNull(list);
            list.add(aVar);
        }
        aVar.disposableHandleOrSegment = this.disposableHandleOrSegment;
        aVar.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    public final void w(Object clauseObject) {
        k<R>.a r8 = r(clauseObject);
        Intrinsics.checkNotNull(r8);
        r8.disposableHandleOrSegment = null;
        r8.indexInSegment = -1;
        u(r8, true);
    }

    @NotNull
    public final o x(@NotNull Object clauseObject, @Nullable Object result) {
        o a10;
        a10 = m.a(y(clauseObject, result));
        return a10;
    }

    public final int y(Object clauseObject, Object internalResult) {
        boolean j10;
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        e0 e0Var4;
        while (true) {
            Object obj = f31694f.get(this);
            if (obj instanceof ju.n) {
                k<R>.a r8 = r(clauseObject);
                if (r8 == null) {
                    continue;
                } else {
                    yt.n<Throwable, Object, CoroutineContext, Unit> a10 = r8.a(this, internalResult);
                    if (y1.b.a(f31694f, this, obj, r8)) {
                        this.internalResult = internalResult;
                        j10 = m.j((ju.n) obj, a10);
                        if (j10) {
                            return 0;
                        }
                        e0Var = m.f31714e;
                        this.internalResult = e0Var;
                        return 2;
                    }
                }
            } else {
                e0Var2 = m.f31712c;
                if (Intrinsics.c(obj, e0Var2) || (obj instanceof a)) {
                    return 3;
                }
                e0Var3 = m.f31713d;
                if (Intrinsics.c(obj, e0Var3)) {
                    return 2;
                }
                e0Var4 = m.b;
                if (Intrinsics.c(obj, e0Var4)) {
                    if (y1.b.a(f31694f, this, obj, kotlin.collections.o.d(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (y1.b.a(f31694f, this, obj, CollectionsKt.x0((Collection) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r0 = r0.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r0 != nt.c.e()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        ot.h.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r0 != nt.c.e()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        return kotlin.Unit.f22894a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(mt.b<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            ju.p r0 = new ju.p
            mt.b r1 = nt.b.c(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.F()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = i()
        L11:
            java.lang.Object r2 = r1.get(r5)
            pu.e0 r3 = su.m.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = i()
            boolean r2 = y1.b.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            ju.r.c(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = i()
            pu.e0 r4 = su.m.g()
            boolean r3 = y1.b.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            j(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof su.k.a
            if (r1 == 0) goto L79
            kotlin.Unit r1 = kotlin.Unit.f22894a
            su.k$a r2 = (su.k.a) r2
            java.lang.Object r3 = h(r5)
            yt.n r2 = r2.a(r5, r3)
            r0.J(r1, r2)
        L62:
            java.lang.Object r0 = r0.z()
            java.lang.Object r1 = nt.c.e()
            if (r0 != r1) goto L6f
            ot.h.c(r6)
        L6f:
            java.lang.Object r6 = nt.c.e()
            if (r0 != r6) goto L76
            return r0
        L76:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: su.k.z(mt.b):java.lang.Object");
    }
}
