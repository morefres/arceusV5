package t3;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.d2;
import ju.p0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t3.j0;
import t3.w;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00136Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tH\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b(\u0010\u001cJ<\u0010+\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010-\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b/\u0010!JI\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u001002\u0006\u0010-\u001a\u00020\u00162\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n01H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\f0OR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R!\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000T8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\ba\u0010b*\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lt3/k;", "T", "Lt3/i;", "Lt3/e0;", "storage", "", "Lkotlin/Function2;", "Lt3/s;", "Lmt/b;", "", "", "initTasksList", "Lt3/e;", "corruptionHandler", "Lju/p0;", "scope", "<init>", "(Lt3/e0;Ljava/util/List;Lt3/e;Lju/p0;)V", "transform", ve.a.f33391e, "(Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLmt/b;)Ljava/lang/Object;", "u", "(Lmt/b;)Ljava/lang/Object;", "p", "requireLock", "Lt3/d0;", "z", "(ZLmt/b;)Ljava/lang/Object;", "Lt3/w$a;", "update", zl.t.f38095d, "(Lt3/w$a;Lmt/b;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lmt/b;)Ljava/lang/Object;", "hasWriteFileLock", "Lt3/f;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "Lt3/e0;", j6.b.f21518e, "Lt3/e;", "c", "Lju/p0;", "Lmu/h;", rl.d.f30696a, "Lmu/h;", "getData", "()Lmu/h;", "data", "Ltu/a;", "e", "Ltu/a;", "collectorMutex", "f", "I", "collectorCounter", "Lju/d2;", "g", "Lju/d2;", "collectorJob", "Lt3/l;", "h", "Lt3/l;", "inMemoryCache", "Lt3/k$b;", "i", "Lt3/k$b;", "readAndInit", "Lgt/h;", "Lt3/f0;", "j", "Lgt/h;", "storageConnectionDelegate", "Lt3/t;", "k", "r", "()Lt3/t;", "coordinator", "Lt3/b0;", "l", "Lt3/b0;", "writeActor", "s", "()Lt3/f0;", "getStorageConnection$datastore_core_release$delegate", "(Lt3/k;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k<T> implements t3.i<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0<T> storage;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final t3.e<T> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.h<T> data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.a collectorMutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int collectorCounter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 collectorJob;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.l<T> inMemoryCache;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k<T>.b readAndInit;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h<f0<T>> storageConnectionDelegate;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h coordinator;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<w.a<T>> writeActor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lt3/k$b;", "Lt3/z;", "", "Lkotlin/Function2;", "Lt3/s;", "Lmt/b;", "", "", "initTasksList", "<init>", "(Lt3/k;Ljava/util/List;)V", j6.b.f21518e, "(Lmt/b;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends z {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<? extends Function2<? super t3.s<T>, ? super mt.b<? super Unit>, ? extends Object>> initTasks;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k<T> f31792d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @ot.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public Object f31793t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31794u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ k<T>.b f31795v;

            /* renamed from: w, reason: collision with root package name */
            public int f31796w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T>.b bVar, mt.b<? super a> bVar2) {
                super(bVar2);
                this.f31795v = bVar;
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f31794u = obj;
                this.f31796w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f31795v.b(this);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/f;", "<anonymous>", "()Lt3/f;"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
        /* renamed from: t3.k$b$b, reason: collision with other inner class name */
        public static final class C0567b extends ot.m implements Function1<mt.b<? super t3.f<T>>, Object> {
            public final /* synthetic */ k<T> A;
            public final /* synthetic */ k<T>.b B;

            /* renamed from: t, reason: collision with root package name */
            public Object f31797t;

            /* renamed from: u, reason: collision with root package name */
            public Object f31798u;

            /* renamed from: v, reason: collision with root package name */
            public Object f31799v;

            /* renamed from: w, reason: collision with root package name */
            public Object f31800w;

            /* renamed from: x, reason: collision with root package name */
            public Object f31801x;

            /* renamed from: y, reason: collision with root package name */
            public int f31802y;

            /* renamed from: z, reason: collision with root package name */
            public int f31803z;

            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"t3/k$b$b$a", "Lt3/s;", "Lkotlin/Function2;", "Lmt/b;", "", "transform", ve.a.f33391e, "(Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: t3.k$b$b$a */
            public static final class a implements t3.s<T> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ tu.a f31804a;
                public final /* synthetic */ kotlin.jvm.internal.y b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.c0<T> f31805c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ k<T> f31806d;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @ot.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                /* renamed from: t3.k$b$b$a$a, reason: collision with other inner class name */
                public static final class C0568a extends ot.d {
                    public int A;

                    /* renamed from: t, reason: collision with root package name */
                    public Object f31807t;

                    /* renamed from: u, reason: collision with root package name */
                    public Object f31808u;

                    /* renamed from: v, reason: collision with root package name */
                    public Object f31809v;

                    /* renamed from: w, reason: collision with root package name */
                    public Object f31810w;

                    /* renamed from: x, reason: collision with root package name */
                    public Object f31811x;

                    /* renamed from: y, reason: collision with root package name */
                    public /* synthetic */ Object f31812y;

                    public C0568a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f31812y = obj;
                        this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.a(null, this);
                    }
                }

                public a(tu.a aVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.c0<T> c0Var, k<T> kVar) {
                    this.f31804a = aVar;
                    this.b = yVar;
                    this.f31805c = c0Var;
                    this.f31806d = kVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // t3.s
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super mt.b<? super T>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull mt.b<? super T> r11) {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: t3.k.b.C0567b.a.a(kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0567b(k<T> kVar, k<T>.b bVar, mt.b<? super C0567b> bVar2) {
                super(1, bVar2);
                this.A = kVar;
                this.B = bVar;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@NotNull mt.b<?> bVar) {
                return new C0567b(this.A, this.B, bVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
            @Override // ot.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t3.k.b.C0567b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable mt.b<? super t3.f<T>> bVar) {
                return ((C0567b) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public b(@NotNull k kVar, List<? extends Function2<? super t3.s<T>, ? super mt.b<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f31792d = kVar;
            this.initTasks = CollectionsKt.M0(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // t3.z
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(@org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof t3.k.b.a
                if (r0 == 0) goto L13
                r0 = r7
                t3.k$b$a r0 = (t3.k.b.a) r0
                int r1 = r0.f31796w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f31796w = r1
                goto L18
            L13:
                t3.k$b$a r0 = new t3.k$b$a
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.f31794u
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f31796w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f31793t
                t3.k$b r0 = (t3.k.b) r0
                gt.o.b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.f31793t
                t3.k$b r0 = (t3.k.b) r0
                gt.o.b(r7)
                goto L7d
            L40:
                gt.o.b(r7)
                java.util.List<? extends kotlin.jvm.functions.Function2<? super t3.s<T>, ? super mt.b<? super kotlin.Unit>, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                t3.k<T> r7 = r6.f31792d
                t3.t r7 = t3.k.c(r7)
                t3.k$b$b r2 = new t3.k$b$b
                t3.k<T> r4 = r6.f31792d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f31793t = r6
                r0.f31796w = r3
                java.lang.Object r7 = r7.e(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                t3.f r7 = (t3.f) r7
                goto L7f
            L6e:
                t3.k<T> r7 = r6.f31792d
                r0.f31793t = r6
                r0.f31796w = r4
                r2 = 0
                java.lang.Object r7 = t3.k.n(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                t3.f r7 = (t3.f) r7
            L7f:
                t3.k<T> r0 = r0.f31792d
                t3.l r0 = t3.k.d(r0)
                r0.c(r7)
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.b.b(mt.b):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/t;", j6.b.f21518e, "()Lt3/t;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function0<t3.t> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f31814i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k<T> kVar) {
            super(0);
            this.f31814i = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t3.t invoke() {
            return this.f31814i.s().getCoordinator();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmu/i;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<mu.i<? super T>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31815t;

        /* renamed from: u, reason: collision with root package name */
        public int f31816u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31817v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31818w;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lmu/i;", "Lt3/d0;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<mu.i<? super d0<T>>, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31819t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f31820u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T> kVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f31820u = kVar;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                return new a(this.f31820u, bVar);
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f31819t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    k<T> kVar = this.f31820u;
                    this.f31819t = 1;
                    if (kVar.u(this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull mu.i<? super d0<T>> iVar, @Nullable mt.b<? super Unit> bVar) {
                return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<d0<T>, mt.b<? super Boolean>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31821t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31822u;

            public b(mt.b<? super b> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f31822u = obj;
                return bVar2;
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                nt.c.e();
                if (this.f31821t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return ot.b.a(!(((d0) this.f31822u) instanceof t3.r));
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable mt.b<? super Boolean> bVar) {
                return ((b) create(d0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class c extends ot.m implements Function2<d0<T>, mt.b<? super Boolean>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31823t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31824u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ d0<T> f31825v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d0<T> d0Var, mt.b<? super c> bVar) {
                super(2, bVar);
                this.f31825v = d0Var;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                c cVar = new c(this.f31825v, bVar);
                cVar.f31824u = obj;
                return cVar;
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                nt.c.e();
                if (this.f31823t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                d0 d0Var = (d0) this.f31824u;
                return ot.b.a((d0Var instanceof t3.f) && d0Var.getVersion() <= this.f31825v.getVersion());
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable mt.b<? super Boolean> bVar) {
                return ((c) create(d0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lmu/i;", "", "it", "", "<anonymous>", "(Lmu/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: t3.k$d$d, reason: collision with other inner class name */
        public static final class C0569d extends ot.m implements yt.n<mu.i<? super T>, Throwable, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31826t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f31827u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0569d(k<T> kVar, mt.b<? super C0569d> bVar) {
                super(3, bVar);
                this.f31827u = kVar;
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f31826t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    k<T> kVar = this.f31827u;
                    this.f31826t = 1;
                    if (kVar.p(this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22894a;
            }

            @Override // yt.n
            @Nullable
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull mu.i<? super T> iVar, @Nullable Throwable th2, @Nullable mt.b<? super Unit> bVar) {
                return new C0569d(this.f31827u, bVar).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements mu.h<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.h f31828a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements mu.i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ mu.i f31829a;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @ot.f(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                /* renamed from: t3.k$d$e$a$a, reason: collision with other inner class name */
                public static final class C0570a extends ot.d {

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31830t;

                    /* renamed from: u, reason: collision with root package name */
                    public int f31831u;

                    public C0570a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f31830t = obj;
                        this.f31831u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(mu.i iVar) {
                    this.f31829a = iVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // mu.i
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull mt.b r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof t3.k.d.e.a.C0570a
                        if (r0 == 0) goto L13
                        r0 = r6
                        t3.k$d$e$a$a r0 = (t3.k.d.e.a.C0570a) r0
                        int r1 = r0.f31831u
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f31831u = r1
                        goto L18
                    L13:
                        t3.k$d$e$a$a r0 = new t3.k$d$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f31830t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f31831u
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        gt.o.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        gt.o.b(r6)
                        mu.i r6 = r4.f31829a
                        t3.d0 r5 = (t3.d0) r5
                        boolean r2 = r5 instanceof t3.x
                        if (r2 != 0) goto L69
                        boolean r2 = r5 instanceof t3.f
                        if (r2 == 0) goto L52
                        t3.f r5 = (t3.f) r5
                        java.lang.Object r5 = r5.c()
                        r0.f31831u = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        kotlin.Unit r5 = kotlin.Unit.f22894a
                        return r5
                    L52:
                        boolean r6 = r5 instanceof t3.r
                        if (r6 == 0) goto L57
                        goto L59
                    L57:
                        boolean r3 = r5 instanceof t3.h0
                    L59:
                        if (r3 == 0) goto L63
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L63:
                        gt.l r5 = new gt.l
                        r5.<init>()
                        throw r5
                    L69:
                        t3.x r5 = (t3.x) r5
                        java.lang.Throwable r5 = r5.getReadException()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: t3.k.d.e.a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            public e(mu.h hVar) {
                this.f31828a = hVar;
            }

            @Override // mu.h
            @Nullable
            public Object collect(@NotNull mu.i iVar, @NotNull mt.b bVar) {
                Object collect = this.f31828a.collect(new a(iVar), bVar);
                return collect == nt.c.e() ? collect : Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k<T> kVar, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f31818w = kVar;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            d dVar = new d(this.f31818w, bVar);
            dVar.f31817v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
        
            if (mu.j.q(r1, r9, r8) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r8.f31816u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                gt.o.b(r9)
                goto Lbe
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.f31815t
                t3.d0 r1 = (t3.d0) r1
                java.lang.Object r3 = r8.f31817v
                mu.i r3 = (mu.i) r3
                gt.o.b(r9)
                goto L67
            L2a:
                java.lang.Object r1 = r8.f31817v
                mu.i r1 = (mu.i) r1
                gt.o.b(r9)
                goto L4b
            L32:
                gt.o.b(r9)
                java.lang.Object r9 = r8.f31817v
                mu.i r9 = (mu.i) r9
                t3.k<T> r1 = r8.f31818w
                r8.f31817v = r9
                r8.f31816u = r4
                r4 = 0
                java.lang.Object r1 = t3.k.o(r1, r4, r8)
                if (r1 != r0) goto L48
                goto Lbd
            L48:
                r7 = r1
                r1 = r9
                r9 = r7
            L4b:
                t3.d0 r9 = (t3.d0) r9
                boolean r4 = r9 instanceof t3.f
                if (r4 == 0) goto L6a
                r4 = r9
                t3.f r4 = (t3.f) r4
                java.lang.Object r4 = r4.c()
                r8.f31817v = r1
                r8.f31815t = r9
                r8.f31816u = r3
                java.lang.Object r3 = r1.emit(r4, r8)
                if (r3 != r0) goto L65
                goto Lbd
            L65:
                r3 = r1
                r1 = r9
            L67:
                r9 = r1
                r1 = r3
                goto L79
            L6a:
                boolean r3 = r9 instanceof t3.h0
                if (r3 != 0) goto Lc8
                boolean r3 = r9 instanceof t3.x
                if (r3 != 0) goto Lc1
                boolean r3 = r9 instanceof t3.r
                if (r3 == 0) goto L79
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            L79:
                t3.k<T> r3 = r8.f31818w
                t3.l r3 = t3.k.d(r3)
                mu.h r3 = r3.b()
                t3.k$d$a r4 = new t3.k$d$a
                t3.k<T> r5 = r8.f31818w
                r6 = 0
                r4.<init>(r5, r6)
                mu.h r3 = mu.j.F(r3, r4)
                t3.k$d$b r4 = new t3.k$d$b
                r4.<init>(r6)
                mu.h r3 = mu.j.N(r3, r4)
                t3.k$d$c r4 = new t3.k$d$c
                r4.<init>(r9, r6)
                mu.h r9 = mu.j.o(r3, r4)
                t3.k$d$e r3 = new t3.k$d$e
                r3.<init>(r9)
                t3.k$d$d r9 = new t3.k$d$d
                t3.k<T> r4 = r8.f31818w
                r9.<init>(r4, r6)
                mu.h r9 = mu.j.D(r3, r9)
                r8.f31817v = r6
                r8.f31815t = r6
                r8.f31816u = r2
                java.lang.Object r9 = mu.j.q(r1, r9, r8)
                if (r9 != r0) goto Lbe
            Lbd:
                return r0
            Lbe:
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            Lc1:
                t3.x r9 = (t3.x) r9
                java.lang.Throwable r9 = r9.getReadException()
                throw r9
            Lc8:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull mu.i<? super T> iVar, @Nullable mt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    public static final class e extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31833t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31834u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31835v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31836w;

        /* renamed from: x, reason: collision with root package name */
        public int f31837x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k<T> kVar, mt.b<? super e> bVar) {
            super(bVar);
            this.f31836w = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31835v = obj;
            this.f31837x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31836w.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    public static final class f<R> extends ot.m implements Function1<mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31838t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<mt.b<? super R>, Object> f31839u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super mt.b<? super R>, ? extends Object> function1, mt.b<? super f> bVar) {
            super(1, bVar);
            this.f31839u = function1;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@NotNull mt.b<?> bVar) {
            return new f(this.f31839u, bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31838t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            Function1<mt.b<? super R>, Object> function1 = this.f31839u;
            this.f31838t = 1;
            Object invoke = function1.invoke(this);
            return invoke == e10 ? e10 : invoke;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable mt.b<? super R> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    public static final class g extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31840t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31841u;

        /* renamed from: v, reason: collision with root package name */
        public Object f31842v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31843w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f31844x;

        /* renamed from: y, reason: collision with root package name */
        public int f31845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k<T> kVar, mt.b<? super g> bVar) {
            super(bVar);
            this.f31844x = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31843w = obj;
            this.f31845y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31844x.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    public static final class h extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31846t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31847u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31848v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31849w;

        /* renamed from: x, reason: collision with root package name */
        public int f31850x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(k<T> kVar, mt.b<? super h> bVar) {
            super(bVar);
            this.f31849w = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31848v = obj;
            this.f31850x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31849w.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
    public static final class i extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31851t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f31852u;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", j6.b.f21518e, "(Lkotlin/Unit;Lmt/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k<T> f31853a;

            public a(k<T> kVar) {
                this.f31853a = kVar;
            }

            @Override // mu.i
            @Nullable
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull Unit unit, @NotNull mt.b<? super Unit> bVar) {
                Object w5;
                return ((this.f31853a.inMemoryCache.a() instanceof t3.r) || (w5 = this.f31853a.w(true, bVar)) != nt.c.e()) ? Unit.f22894a : w5;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(k<T> kVar, mt.b<? super i> bVar) {
            super(2, bVar);
            this.f31852u = kVar;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            return new i(this.f31852u, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r5.a(r4) == r0) goto L15;
         */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r4.f31851t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                gt.o.b(r5)
                goto L30
            L1e:
                gt.o.b(r5)
                t3.k<T> r5 = r4.f31852u
                t3.k$b r5 = t3.k.e(r5)
                r4.f31851t = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                t3.k<T> r5 = r4.f31852u
                t3.t r5 = t3.k.c(r5)
                mu.h r5 = r5.c()
                mu.h r5 = mu.j.k(r5)
                t3.k$i$a r1 = new t3.k$i$a
                t3.k<T> r3 = r4.f31852u
                r1.<init>(r3)
                r4.f31851t = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    public static final class j extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31854t;

        /* renamed from: u, reason: collision with root package name */
        public int f31855u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31856v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31857w;

        /* renamed from: x, reason: collision with root package name */
        public int f31858x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(k<T> kVar, mt.b<? super j> bVar) {
            super(bVar);
            this.f31857w = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31856v = obj;
            this.f31858x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31857w.v(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    /* renamed from: t3.k$k, reason: collision with other inner class name */
    public static final class C0571k extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31859t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31860u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f31861v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31862w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f31863x;

        /* renamed from: y, reason: collision with root package name */
        public int f31864y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0571k(k<T> kVar, mt.b<? super C0571k> bVar) {
            super(bVar);
            this.f31863x = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31862w = obj;
            this.f31864y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31863x.w(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "Lt3/d0;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE}, m = "invokeSuspend")
    public static final class l extends ot.m implements Function1<mt.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31865t;

        /* renamed from: u, reason: collision with root package name */
        public int f31866u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31867v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k<T> kVar, mt.b<? super l> bVar) {
            super(1, bVar);
            this.f31867v = kVar;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@NotNull mt.b<?> bVar) {
            return new l(this.f31867v, bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            d0 d0Var;
            Object e10 = nt.c.e();
            int i10 = this.f31866u;
            try {
            } catch (Throwable th3) {
                t3.t r8 = this.f31867v.r();
                this.f31865t = th3;
                this.f31866u = 2;
                Object d10 = r8.d(this);
                if (d10 != e10) {
                    th2 = th3;
                    obj = d10;
                }
            }
            if (i10 == 0) {
                gt.o.b(obj);
                k<T> kVar = this.f31867v;
                this.f31866u = 1;
                obj = kVar.y(true, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.f31865t;
                    gt.o.b(obj);
                    d0Var = new t3.x(th2, ((Number) obj).intValue());
                    return gt.s.a(d0Var, ot.b.a(true));
                }
                gt.o.b(obj);
            }
            d0Var = (d0) obj;
            return gt.s.a(d0Var, ot.b.a(true));
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable mt.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lkotlin/Pair;", "Lt3/d0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    public static final class m extends ot.m implements Function2<Boolean, mt.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31868t;

        /* renamed from: u, reason: collision with root package name */
        public int f31869u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f31870v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31871w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f31872x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(k<T> kVar, int i10, mt.b<? super m> bVar) {
            super(2, bVar);
            this.f31871w = kVar;
            this.f31872x = i10;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            m mVar = new m(this.f31871w, this.f31872x, bVar);
            mVar.f31870v = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return o(bool.booleanValue(), (mt.b) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            int i10;
            boolean z10;
            d0 d0Var;
            boolean z11;
            Object e10 = nt.c.e();
            boolean z12 = this.f31869u;
            try {
            } catch (Throwable th3) {
                if (z12 != 0) {
                    t3.t r8 = this.f31871w.r();
                    this.f31868t = th3;
                    this.f31870v = z12;
                    this.f31869u = 2;
                    Object d10 = r8.d(this);
                    if (d10 != e10) {
                        z10 = z12;
                        th2 = th3;
                        obj = d10;
                    }
                } else {
                    boolean z13 = z12;
                    th2 = th3;
                    i10 = this.f31872x;
                    z10 = z13;
                }
            }
            if (z12 == 0) {
                gt.o.b(obj);
                boolean z14 = this.f31870v;
                k<T> kVar = this.f31871w;
                this.f31870v = z14;
                this.f31869u = 1;
                obj = kVar.y(z14, this);
                z12 = z14;
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (z12 != 1) {
                    if (z12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = this.f31870v;
                    th2 = (Throwable) this.f31868t;
                    gt.o.b(obj);
                    i10 = ((Number) obj).intValue();
                    t3.x xVar = new t3.x(th2, i10);
                    z11 = z10;
                    d0Var = xVar;
                    return gt.s.a(d0Var, ot.b.a(z11));
                }
                boolean z15 = this.f31870v;
                gt.o.b(obj);
                z12 = z15;
            }
            d0Var = (d0) obj;
            z11 = z12;
            return gt.s.a(d0Var, ot.b.a(z11));
        }

        @Nullable
        public final Object o(boolean z10, @Nullable mt.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((m) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    public static final class n extends ot.d {
        public final /* synthetic */ k<T> A;
        public int B;

        /* renamed from: t, reason: collision with root package name */
        public Object f31873t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31874u;

        /* renamed from: v, reason: collision with root package name */
        public Object f31875v;

        /* renamed from: w, reason: collision with root package name */
        public Object f31876w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f31877x;

        /* renamed from: y, reason: collision with root package name */
        public int f31878y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f31879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(k<T> kVar, mt.b<? super n> bVar) {
            super(bVar);
            this.A = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31879z = obj;
            this.B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.A.y(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lt3/f;", "<anonymous>", "(Z)Lt3/f;"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    public static final class o extends ot.m implements Function2<Boolean, mt.b<? super t3.f<T>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31880t;

        /* renamed from: u, reason: collision with root package name */
        public int f31881u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f31882v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31883w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f31884x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(k<T> kVar, int i10, mt.b<? super o> bVar) {
            super(2, bVar);
            this.f31883w = kVar;
            this.f31884x = i10;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            o oVar = new o(this.f31883w, this.f31884x, bVar);
            oVar.f31882v = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return o(bool.booleanValue(), (mt.b) obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        
            if (r6 == r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r5.f31881u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f31880t
                gt.o.b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.f31882v
                gt.o.b(r6)
                goto L34
            L22:
                gt.o.b(r6)
                boolean r1 = r5.f31882v
                t3.k<T> r6 = r5.f31883w
                r5.f31882v = r1
                r5.f31881u = r3
                java.lang.Object r6 = t3.k.m(r6, r5)
                if (r6 != r0) goto L34
                goto L46
            L34:
                if (r1 == 0) goto L50
                t3.k<T> r1 = r5.f31883w
                t3.t r1 = t3.k.c(r1)
                r5.f31880t = r6
                r5.f31881u = r2
                java.lang.Object r1 = r1.d(r5)
                if (r1 != r0) goto L47
            L46:
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.f31884x
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                t3.f r1 = new t3.f
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Nullable
        public final Object o(boolean z10, @Nullable mt.b<? super t3.f<T>> bVar) {
            return ((o) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    public static final class p extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31885t;

        /* renamed from: u, reason: collision with root package name */
        public int f31886u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0<T> f31887v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31888w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f31889x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.jvm.internal.c0<T> c0Var, k<T> kVar, kotlin.jvm.internal.a0 a0Var, mt.b<? super p> bVar) {
            super(1, bVar);
            this.f31887v = c0Var;
            this.f31888w = kVar;
            this.f31889x = a0Var;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@NotNull mt.b<?> bVar) {
            return new p(this.f31887v, this.f31888w, this.f31889x, bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.jvm.internal.a0 a0Var;
            kotlin.jvm.internal.c0<T> c0Var;
            kotlin.jvm.internal.a0 a0Var2;
            Object e10 = nt.c.e();
            int i10 = this.f31886u;
            try {
            } catch (t3.d unused) {
                kotlin.jvm.internal.a0 a0Var3 = this.f31889x;
                k<T> kVar = this.f31888w;
                T t8 = this.f31887v.f22963a;
                this.f31885t = a0Var3;
                this.f31886u = 3;
                Object B = kVar.B(t8, true, this);
                if (B != e10) {
                    a0Var = a0Var3;
                    obj = (T) B;
                }
            }
            if (i10 == 0) {
                gt.o.b(obj);
                c0Var = this.f31887v;
                k<T> kVar2 = this.f31888w;
                this.f31885t = c0Var;
                this.f31886u = 1;
                obj = (T) kVar2.x(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        a0Var2 = (kotlin.jvm.internal.a0) this.f31885t;
                        gt.o.b(obj);
                        a0Var2.f22960a = ((Number) obj).intValue();
                        return Unit.f22894a;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = (kotlin.jvm.internal.a0) this.f31885t;
                    gt.o.b(obj);
                    a0Var.f22960a = ((Number) obj).intValue();
                    return Unit.f22894a;
                }
                c0Var = (kotlin.jvm.internal.c0) this.f31885t;
                gt.o.b(obj);
            }
            c0Var.f22963a = (T) obj;
            a0Var2 = this.f31889x;
            t3.t r8 = this.f31888w.r();
            this.f31885t = a0Var2;
            this.f31886u = 2;
            obj = (T) r8.d(this);
            if (obj == e10) {
                return e10;
            }
            a0Var2.f22960a = ((Number) obj).intValue();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable mt.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lju/p0;", "Lt3/d0;", "<anonymous>", "(Lju/p0;)Lt3/d0;"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    public static final class q extends ot.m implements Function2<p0, mt.b<? super d0<T>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31890t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f31891u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f31892v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(k<T> kVar, boolean z10, mt.b<? super q> bVar) {
            super(2, bVar);
            this.f31891u = kVar;
            this.f31892v = z10;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            return new q(this.f31891u, this.f31892v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        
            if (r5.v(r4) == r0) goto L22;
         */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r4.f31890t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                gt.o.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                gt.o.b(r5)
                t3.k<T> r5 = r4.f31891u
                t3.l r5 = t3.k.d(r5)
                t3.d0 r5 = r5.a()
                boolean r5 = r5 instanceof t3.r
                if (r5 == 0) goto L3c
                t3.k<T> r5 = r4.f31891u
                t3.l r5 = t3.k.d(r5)
                t3.d0 r5 = r5.a()
                return r5
            L3c:
                t3.k<T> r5 = r4.f31891u     // Catch: java.lang.Throwable -> L1e
                r4.f31890t = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = t3.k.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                t3.k<T> r5 = r4.f31891u
                boolean r1 = r4.f31892v
                r4.f31890t = r2
                java.lang.Object r5 = t3.k.l(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                t3.d0 r5 = (t3.d0) r5
                return r5
            L57:
                t3.x r0 = new t3.x
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super d0<T>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/f0;", j6.b.f21518e, "()Lt3/f0;"}, k = 3, mv = {1, 8, 0})
    public static final class r extends kotlin.jvm.internal.m implements Function0<f0<T>> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f31893i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(k<T> kVar) {
            super(0);
            this.f31893i = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f0<T> invoke() {
            return this.f31893i.storage.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    public static final class s extends ot.m implements Function1<mt.b<? super T>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31894t;

        /* renamed from: u, reason: collision with root package name */
        public int f31895u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31896v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f31897w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<T, mt.b<? super T>, Object> f31898x;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<p0, mt.b<? super T>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31899t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function2<T, mt.b<? super T>, Object> f31900u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ t3.f<T> f31901v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super T, ? super mt.b<? super T>, ? extends Object> function2, t3.f<T> fVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f31900u = function2;
                this.f31901v = fVar;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                return new a(this.f31900u, this.f31901v, bVar);
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f31899t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                Function2<T, mt.b<? super T>, Object> function2 = this.f31900u;
                T c10 = this.f31901v.c();
                this.f31899t = 1;
                Object invoke = function2.invoke(c10, this);
                return invoke == e10 ? e10 : invoke;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super T> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(k<T> kVar, CoroutineContext coroutineContext, Function2<? super T, ? super mt.b<? super T>, ? extends Object> function2, mt.b<? super s> bVar) {
            super(1, bVar);
            this.f31896v = kVar;
            this.f31897w = coroutineContext;
            this.f31898x = function2;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@NotNull mt.b<?> bVar) {
            return new s(this.f31896v, this.f31897w, this.f31898x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r9 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        
            if (r9 == r0) goto L23;
         */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r8.f31895u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f31894t
                gt.o.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f31894t
                t3.f r1 = (t3.f) r1
                gt.o.b(r9)
                goto L51
            L27:
                gt.o.b(r9)
                goto L39
            L2b:
                gt.o.b(r9)
                t3.k<T> r9 = r8.f31896v
                r8.f31895u = r4
                java.lang.Object r9 = t3.k.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                t3.f r1 = (t3.f) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f31897w
                t3.k$s$a r5 = new t3.k$s$a
                kotlin.jvm.functions.Function2<T, mt.b<? super T>, java.lang.Object> r6 = r8.f31898x
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f31894t = r1
                r8.f31895u = r3
                java.lang.Object r9 = ju.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r9)
                if (r1 != 0) goto L6b
                t3.k<T> r1 = r8.f31896v
                r8.f31894t = r9
                r8.f31895u = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable mt.b<? super T> bVar) {
            return ((s) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class t extends ot.m implements Function2<p0, mt.b<? super T>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31902t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31903u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31904v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<T, mt.b<? super T>, Object> f31905w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(k<T> kVar, Function2<? super T, ? super mt.b<? super T>, ? extends Object> function2, mt.b<? super t> bVar) {
            super(2, bVar);
            this.f31904v = kVar;
            this.f31905w = function2;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            t tVar = new t(this.f31904v, this.f31905w, bVar);
            tVar.f31903u = obj;
            return tVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31902t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            p0 p0Var = (p0) this.f31903u;
            ju.x c10 = ju.z.c(null, 1, null);
            this.f31904v.writeActor.e(new w.a(this.f31905w, c10, this.f31904v.inMemoryCache.a(), p0Var.getCoroutineContext()));
            this.f31902t = 1;
            Object w5 = c10.w(this);
            return w5 == e10 ? e10 : w5;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super T> bVar) {
            return ((t) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", ve.a.f33391e, "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class u extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f31906i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(k<T> kVar) {
            super(1);
            this.f31906i = kVar;
        }

        public final void a(@Nullable Throwable th2) {
            if (th2 != null) {
                this.f31906i.inMemoryCache.c(new t3.r(th2));
            }
            if (this.f31906i.storageConnectionDelegate.isInitialized()) {
                this.f31906i.s().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lt3/w$a;", NotificationCompat.CATEGORY_MESSAGE, "", "ex", "", ve.a.f33391e, "(Lt3/w$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class v extends kotlin.jvm.internal.m implements Function2<w.a<T>, Throwable, Unit> {

        /* renamed from: i, reason: collision with root package name */
        public static final v f31907i = new v();

        public v() {
            super(2);
        }

        public final void a(@NotNull w.a<T> msg, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            ju.x<T> a10 = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a10.q(th2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            a((w.a) obj, th2);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/w$a;", NotificationCompat.CATEGORY_MESSAGE, "", "<anonymous>", "(Lt3/w$a;)V"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend")
    public static final class w extends ot.m implements Function2<w.a<T>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31908t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31909u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31910v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(k<T> kVar, mt.b<? super w> bVar) {
            super(2, bVar);
            this.f31910v = kVar;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            w wVar = new w(this.f31910v, bVar);
            wVar.f31909u = obj;
            return wVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31908t;
            if (i10 == 0) {
                gt.o.b(obj);
                w.a aVar = (w.a) this.f31909u;
                k<T> kVar = this.f31910v;
                this.f31908t = 1;
                if (kVar.t(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull w.a<T> aVar, @Nullable mt.b<? super Unit> bVar) {
            return ((w) create(aVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    public static final class x extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31911t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31912u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31913v;

        /* renamed from: w, reason: collision with root package name */
        public int f31914w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(k<T> kVar, mt.b<? super x> bVar) {
            super(bVar);
            this.f31913v = kVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31912u = obj;
            this.f31914w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31913v.B(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lt3/k0;", "", "<anonymous>", "(Lt3/k0;)V"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    public static final class y extends ot.m implements Function2<k0<T>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31915t;

        /* renamed from: u, reason: collision with root package name */
        public int f31916u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31917v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f31918w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f31919x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ T f31920y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f31921z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(kotlin.jvm.internal.a0 a0Var, k<T> kVar, T t8, boolean z10, mt.b<? super y> bVar) {
            super(2, bVar);
            this.f31918w = a0Var;
            this.f31919x = kVar;
            this.f31920y = t8;
            this.f31921z = z10;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            y yVar = new y(this.f31918w, this.f31919x, this.f31920y, this.f31921z, bVar);
            yVar.f31917v = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r3.e(r7, r6) == r0) goto L16;
         */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r6.f31916u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f31915t
                kotlin.jvm.internal.a0 r1 = (kotlin.jvm.internal.a0) r1
                java.lang.Object r3 = r6.f31917v
                t3.k0 r3 = (t3.k0) r3
                gt.o.b(r7)
                goto L45
            L26:
                gt.o.b(r7)
                java.lang.Object r7 = r6.f31917v
                t3.k0 r7 = (t3.k0) r7
                kotlin.jvm.internal.a0 r1 = r6.f31918w
                t3.k<T> r4 = r6.f31919x
                t3.t r4 = t3.k.c(r4)
                r6.f31917v = r7
                r6.f31915t = r1
                r6.f31916u = r3
                java.lang.Object r3 = r4.b(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f22960a = r7
                T r7 = r6.f31920y
                r1 = 0
                r6.f31917v = r1
                r6.f31915t = r1
                r6.f31916u = r2
                java.lang.Object r7 = r3.e(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f31921z
                if (r7 == 0) goto L7d
                t3.k<T> r7 = r6.f31919x
                t3.l r7 = t3.k.d(r7)
                t3.f r0 = new t3.f
                T r1 = r6.f31920y
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.a0 r3 = r6.f31918w
                int r3 = r3.f22960a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull k0<T> k0Var, @Nullable mt.b<? super Unit> bVar) {
            return ((y) create(k0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public k(@NotNull e0<T> storage, @NotNull List<? extends Function2<? super t3.s<T>, ? super mt.b<? super Unit>, ? extends Object>> initTasksList, @NotNull t3.e<T> corruptionHandler, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = mu.j.w(new d(this, null));
        this.collectorMutex = tu.g.b(false, 1, null);
        this.inMemoryCache = new t3.l<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = gt.i.b(new r(this));
        this.coordinator = gt.i.b(new c(this));
        this.writeActor = new b0<>(scope, new u(this), v.f31907i, new w(this, null));
    }

    public final Object A(Function2<? super T, ? super mt.b<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, mt.b<? super T> bVar) {
        return r().e(new s(this, coroutineContext, function2, null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(T r11, boolean r12, @org.jetbrains.annotations.NotNull mt.b<? super java.lang.Integer> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof t3.k.x
            if (r0 == 0) goto L13
            r0 = r13
            t3.k$x r0 = (t3.k.x) r0
            int r1 = r0.f31914w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31914w = r1
            goto L18
        L13:
            t3.k$x r0 = new t3.k$x
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f31912u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31914w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f31911t
            kotlin.jvm.internal.a0 r11 = (kotlin.jvm.internal.a0) r11
            gt.o.b(r13)
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            gt.o.b(r13)
            kotlin.jvm.internal.a0 r5 = new kotlin.jvm.internal.a0
            r5.<init>()
            t3.f0 r13 = r10.s()
            t3.k$y r4 = new t3.k$y
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f31911t = r5
            r0.f31914w = r3
            java.lang.Object r11 = r13.c(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f22960a
            java.lang.Integer r11 = ot.b.c(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.B(java.lang.Object, boolean, mt.b):java.lang.Object");
    }

    @Override // t3.i
    @Nullable
    public Object a(@NotNull Function2<? super T, ? super mt.b<? super T>, ? extends Object> function2, @NotNull mt.b<? super T> bVar) {
        j0 j0Var = (j0) bVar.getContext().get(j0.Companion.C0566a.f31778a);
        if (j0Var != null) {
            j0Var.a(this);
        }
        return ju.i.g(new j0(j0Var, this), new t(this, function2, null), bVar);
    }

    @Override // t3.i
    @NotNull
    public mu.h<T> getData() {
        return this.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x004e, B:13:0x0056, B:15:0x005a, B:16:0x0060, B:17:0x0062), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(mt.b<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3.k.e
            if (r0 == 0) goto L13
            r0 = r6
            t3.k$e r0 = (t3.k.e) r0
            int r1 = r0.f31837x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31837x = r1
            goto L18
        L13:
            t3.k$e r0 = new t3.k$e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31835v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31837x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f31834u
            tu.a r1 = (tu.a) r1
            java.lang.Object r0 = r0.f31833t
            t3.k r0 = (t3.k) r0
            gt.o.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            gt.o.b(r6)
            tu.a r6 = r5.collectorMutex
            r0.f31833t = r5
            r0.f31834u = r6
            r0.f31837x = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.collectorCounter     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.collectorCounter = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            ju.d2 r6 = r0.collectorJob     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            ju.d2.a.a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.collectorJob = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L5e
            r1.f(r4)
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L6a:
            r1.f(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.p(mt.b):java.lang.Object");
    }

    public final <R> Object q(boolean z10, Function1<? super mt.b<? super R>, ? extends Object> function1, mt.b<? super R> bVar) {
        return z10 ? function1.invoke(bVar) : r().e(new f(function1, null), bVar);
    }

    public final t3.t r() {
        return (t3.t) this.coordinator.getValue();
    }

    @NotNull
    public final f0<T> s() {
        return this.storageConnectionDelegate.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(6:(1:(1:(2:12|13))(3:15|16|17))|26|27|21|22|23)(5:28|29|30|(6:32|(1:34)|20|21|22|23)(3:35|(1:37)(1:53)|(2:39|(2:41|(1:43)(1:44))(2:45|46))(2:47|(2:49|50)(2:51|52)))|25)|18))|58|6|7|(0)(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, t3.k, t3.k<T>] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ju.x] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(t3.w.a<T> r9, mt.b<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.t(t3.w$a, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x004e, B:13:0x0055, B:14:0x006a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(mt.b<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof t3.k.h
            if (r0 == 0) goto L13
            r0 = r12
            t3.k$h r0 = (t3.k.h) r0
            int r1 = r0.f31850x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31850x = r1
            goto L18
        L13:
            t3.k$h r0 = new t3.k$h
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f31848v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31850x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f31847u
            tu.a r1 = (tu.a) r1
            java.lang.Object r0 = r0.f31846t
            t3.k r0 = (t3.k) r0
            gt.o.b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            gt.o.b(r12)
            tu.a r12 = r11.collectorMutex
            r0.f31846t = r11
            r0.f31847u = r12
            r0.f31850x = r3
            java.lang.Object r0 = r12.c(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.collectorCounter     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.collectorCounter = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L6a
            ju.p0 r5 = r0.scope     // Catch: java.lang.Throwable -> L67
            t3.k$i r8 = new t3.k$i     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            ju.d2 r12 = ju.i.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.collectorJob = r12     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r12 = r0
            goto L72
        L6a:
            kotlin.Unit r12 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L67
            r1.f(r4)
            kotlin.Unit r12 = kotlin.Unit.f22894a
            return r12
        L72:
            r1.f(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.u(mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(mt.b<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3.k.j
            if (r0 == 0) goto L13
            r0 = r6
            t3.k$j r0 = (t3.k.j) r0
            int r1 = r0.f31858x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31858x = r1
            goto L18
        L13:
            t3.k$j r0 = new t3.k$j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31856v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31858x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f31855u
            java.lang.Object r0 = r0.f31854t
            t3.k r0 = (t3.k) r0
            gt.o.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f31854t
            t3.k r2 = (t3.k) r2
            gt.o.b(r6)
            goto L57
        L44:
            gt.o.b(r6)
            t3.t r6 = r5.r()
            r0.f31854t = r5
            r0.f31858x = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            t3.k<T>$b r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.f31854t = r2     // Catch: java.lang.Throwable -> L6f
            r0.f31855u = r6     // Catch: java.lang.Throwable -> L6f
            r0.f31858x = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            t3.l<T> r0 = r0.inMemoryCache
            t3.x r2 = new t3.x
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.v(mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r10, mt.b<? super t3.d0<T>> r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.w(boolean, mt.b):java.lang.Object");
    }

    public final Object x(mt.b<? super T> bVar) {
        return g0.a(s(), bVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|83|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0066, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0067, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(boolean r10, mt.b<? super t3.f<T>> r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.y(boolean, mt.b):java.lang.Object");
    }

    public final Object z(boolean z10, mt.b<? super d0<T>> bVar) {
        return ju.i.g(this.scope.getCoroutineContext(), new q(this, z10, null), bVar);
    }
}
