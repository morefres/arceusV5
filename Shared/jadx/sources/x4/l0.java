package x4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.CoroutineName;
import ju.p0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.k;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u00018Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J9\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070'2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010)J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0*2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b0\u0010\u001dJ/\u00104\u001a\u00020\u000f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR(\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lx4/l0;", "", "Lx4/u;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "", "onInvalidatedTablesIds", "<init>", "(Lx4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "names", zl.t.f38095d, "([Ljava/lang/String;)[Ljava/lang/String;", "Lx4/m;", "connection", "tableId", "v", "(Lx4/m;ILmt/b;)Ljava/lang/Object;", "w", "n", "(Lmt/b;)Ljava/lang/Object;", "j", "(Lx4/m;Lmt/b;)Ljava/lang/Object;", "Lf5/b;", "l", "(Lf5/b;)V", "resolvedTableNames", "", "tableIds", "emitInitialState", "Lmu/h;", "m", "([Ljava/lang/String;[IZ)Lmu/h;", "Lkotlin/Pair;", "y", "([Ljava/lang/String;)Lkotlin/Pair;", "p", "([I)Z", "q", "x", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "s", "()V", ve.a.f33391e, "Lx4/u;", j6.b.f21518e, "Ljava/util/Map;", "c", rl.d.f30696a, "Z", "e", "Lkotlin/jvm/functions/Function1;", "f", "tableIdLookup", "g", "[Ljava/lang/String;", "tablesNames", "Lx4/k;", "h", "Lx4/k;", "observedTableStates", "Lx4/l;", "i", "Lx4/l;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "k", "Lkotlin/jvm/functions/Function0;", "getOnAllowRefresh$room_runtime", "()Lkotlin/jvm/functions/Function0;", "u", "(Lkotlin/jvm/functions/Function0;)V", "onAllowRefresh", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String[] f35094m = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u database;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> shadowTablesMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Set<String>> viewTables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean useTempTable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Set<Integer>, Unit> onInvalidatedTablesIds;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Integer> tableIdLookup;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] tablesNames;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k observedTableStates;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l observedTableVersions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean pendingRefresh;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Boolean> onAllowRefresh;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lx4/l0$a;", "", "<init>", "()V", "", "tableName", "triggerType", j6.b.f21518e, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: x4.l0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(String tableName, String triggerType) {
            return "room_table_modification_trigger_" + tableName + '_' + triggerType;
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {445, 453}, m = "checkInvalidatedTables")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f35105t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35106u;

        /* renamed from: w, reason: collision with root package name */
        public int f35108w;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35106u = obj;
            this.f35108w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l0.this.j(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/i;", "", "", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {239, 239, 243}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<mu.i<? super Set<? extends String>>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35109t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35110u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int[] f35112w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f35113x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String[] f35114y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {239}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f35115t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ l0 f35116u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f35116u = l0Var;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f35116u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f35115t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    l0 l0Var = this.f35116u;
                    this.f35115t = 1;
                    if (l0Var.x(this) == e10) {
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
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<int[]> f35117a;
            public final /* synthetic */ boolean b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ mu.i<Set<String>> f35118c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String[] f35119d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int[] f35120e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {247, 256}, m = "emit")
            public static final class a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public Object f35121t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f35122u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ b<T> f35123v;

                /* renamed from: w, reason: collision with root package name */
                public int f35124w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(b<? super T> bVar, mt.b<? super a> bVar2) {
                    super(bVar2);
                    this.f35123v = bVar;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f35122u = obj;
                    this.f35124w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f35123v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlin.jvm.internal.c0<int[]> c0Var, boolean z10, mu.i<? super Set<String>> iVar, String[] strArr, int[] iArr) {
                this.f35117a = c0Var;
                this.b = z10;
                this.f35118c = iVar;
                this.f35119d = strArr;
                this.f35120e = iArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(int[] r13, mt.b<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof x4.l0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r14
                    x4.l0$c$b$a r0 = (x4.l0.c.b.a) r0
                    int r1 = r0.f35124w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35124w = r1
                    goto L18
                L13:
                    x4.l0$c$b$a r0 = new x4.l0$c$b$a
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f35122u
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f35124w
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L39
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    java.lang.Object r13 = r0.f35121t
                    int[] r13 = (int[]) r13
                    gt.o.b(r14)
                    goto L9f
                L39:
                    gt.o.b(r14)
                    kotlin.jvm.internal.c0<int[]> r14 = r12.f35117a
                    T r2 = r14.f22963a
                    if (r2 != 0) goto L59
                    boolean r14 = r12.b
                    if (r14 == 0) goto L9f
                    mu.i<java.util.Set<java.lang.String>> r14 = r12.f35118c
                    java.lang.String[] r2 = r12.f35119d
                    java.util.Set r2 = kotlin.collections.m.m0(r2)
                    r0.f35121t = r13
                    r0.f35124w = r4
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto L9f
                    goto L9e
                L59:
                    java.lang.String[] r2 = r12.f35119d
                    int[] r4 = r12.f35120e
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    int r6 = r2.length
                    r7 = 0
                    r8 = r7
                L65:
                    if (r7 >= r6) goto L88
                    r9 = r2[r7]
                    int r10 = r8 + 1
                    T r11 = r14.f22963a
                    if (r11 == 0) goto L80
                    int[] r11 = (int[]) r11
                    r8 = r4[r8]
                    r11 = r11[r8]
                    r8 = r13[r8]
                    if (r11 == r8) goto L7c
                    r5.add(r9)
                L7c:
                    int r7 = r7 + 1
                    r8 = r10
                    goto L65
                L80:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "Required value was null."
                    r13.<init>(r14)
                    throw r13
                L88:
                    boolean r14 = r5.isEmpty()
                    if (r14 != 0) goto L9f
                    mu.i<java.util.Set<java.lang.String>> r14 = r12.f35118c
                    java.util.Set r2 = kotlin.collections.CollectionsKt.Q0(r5)
                    r0.f35121t = r13
                    r0.f35124w = r3
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto L9f
                L9e:
                    return r1
                L9f:
                    kotlin.jvm.internal.c0<int[]> r14 = r12.f35117a
                    r14.f22963a = r13
                    kotlin.Unit r13 = kotlin.Unit.f22894a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: x4.l0.c.b.emit(int[], mt.b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int[] iArr, boolean z10, String[] strArr, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f35112w = iArr;
            this.f35113x = z10;
            this.f35114y = strArr;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = l0.this.new c(this.f35112w, this.f35113x, this.f35114y, bVar);
            cVar.f35110u = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
        
            if (r12.a(r4, r11) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        
            if (ju.i.g((kotlin.coroutines.CoroutineContext) r12, r5, r11) == r0) goto L28;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r11.f35109t
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1a
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                gt.o.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L95
            L1f:
                r0 = move-exception
                r12 = r0
                goto L9b
            L23:
                java.lang.Object r1 = r11.f35110u
                mu.i r1 = (mu.i) r1
                gt.o.b(r12)
                goto L71
            L2b:
                java.lang.Object r1 = r11.f35110u
                mu.i r1 = (mu.i) r1
                gt.o.b(r12)
                goto L5d
            L33:
                gt.o.b(r12)
                java.lang.Object r12 = r11.f35110u
                mu.i r12 = (mu.i) r12
                x4.l0 r1 = x4.l0.this
                x4.k r1 = x4.l0.e(r1)
                int[] r6 = r11.f35112w
                boolean r1 = r1.i(r6)
                if (r1 == 0) goto L73
                x4.l0 r1 = x4.l0.this
                x4.u r1 = x4.l0.d(r1)
                r11.f35110u = r12
                r11.f35109t = r5
                r5 = 0
                java.lang.Object r1 = c5.a.b(r1, r5, r11)
                if (r1 != r0) goto L5a
                goto L94
            L5a:
                r10 = r1
                r1 = r12
                r12 = r10
            L5d:
                kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12
                x4.l0$c$a r5 = new x4.l0$c$a
                x4.l0 r6 = x4.l0.this
                r5.<init>(r6, r2)
                r11.f35110u = r1
                r11.f35109t = r4
                java.lang.Object r12 = ju.i.g(r12, r5, r11)
                if (r12 != r0) goto L71
                goto L94
            L71:
                r7 = r1
                goto L74
            L73:
                r7 = r12
            L74:
                kotlin.jvm.internal.c0 r5 = new kotlin.jvm.internal.c0     // Catch: java.lang.Throwable -> L1f
                r5.<init>()     // Catch: java.lang.Throwable -> L1f
                x4.l0 r12 = x4.l0.this     // Catch: java.lang.Throwable -> L1f
                x4.l r12 = x4.l0.f(r12)     // Catch: java.lang.Throwable -> L1f
                x4.l0$c$b r4 = new x4.l0$c$b     // Catch: java.lang.Throwable -> L1f
                boolean r6 = r11.f35113x     // Catch: java.lang.Throwable -> L1f
                java.lang.String[] r8 = r11.f35114y     // Catch: java.lang.Throwable -> L1f
                int[] r9 = r11.f35112w     // Catch: java.lang.Throwable -> L1f
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
                r11.f35110u = r2     // Catch: java.lang.Throwable -> L1f
                r11.f35109t = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = r12.a(r4, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L95
            L94:
                return r0
            L95:
                gt.d r12 = new gt.d     // Catch: java.lang.Throwable -> L1f
                r12.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r12     // Catch: java.lang.Throwable -> L1f
            L9b:
                x4.l0 r0 = x4.l0.this
                x4.k r0 = x4.l0.e(r0)
                int[] r1 = r11.f35112w
                r0.j(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.l0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super Set<String>> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {417}, m = "notifyInvalidation")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f35125t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35126u;

        /* renamed from: w, reason: collision with root package name */
        public int f35128w;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35126u = obj;
            this.f35128w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l0.this.n(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx4/g0;", "connection", "", "", "<anonymous>", "(Lx4/g0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {418, 425}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<g0, mt.b<? super Set<? extends Integer>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35129t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35130u;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/f0;", "", "", "<anonymous>", "(Lx4/f0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {426}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<f0<Set<? extends Integer>>, mt.b<? super Set<? extends Integer>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f35132t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f35133u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l0 f35134v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f35134v = l0Var;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(this.f35134v, bVar);
                aVar.f35133u = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f35132t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                f0 f0Var = (f0) this.f35133u;
                l0 l0Var = this.f35134v;
                this.f35132t = 1;
                Object j10 = l0Var.j(f0Var, this);
                return j10 == e10 ? e10 : j10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<Set<Integer>> f0Var, mt.b<? super Set<Integer>> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            e eVar = l0.this.new e(bVar);
            eVar.f35130u = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r6.f35129t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r7)     // Catch: android.database.SQLException -> L5a
                goto L57
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f35130u
                x4.g0 r1 = (x4.g0) r1
                gt.o.b(r7)
                goto L35
            L22:
                gt.o.b(r7)
                java.lang.Object r7 = r6.f35130u
                r1 = r7
                x4.g0 r1 = (x4.g0) r1
                r6.f35130u = r1
                r6.f35129t = r3
                java.lang.Object r7 = r1.a(r6)
                if (r7 != r0) goto L35
                goto L56
            L35:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L42
                java.util.Set r7 = kotlin.collections.q0.d()
                return r7
            L42:
                x4.g0$a r7 = x4.g0.a.b     // Catch: android.database.SQLException -> L5a
                x4.l0$e$a r3 = new x4.l0$e$a     // Catch: android.database.SQLException -> L5a
                x4.l0 r4 = x4.l0.this     // Catch: android.database.SQLException -> L5a
                r5 = 0
                r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
                r6.f35130u = r5     // Catch: android.database.SQLException -> L5a
                r6.f35129t = r2     // Catch: android.database.SQLException -> L5a
                java.lang.Object r7 = r1.b(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
                return r7
            L5a:
                java.util.Set r7 = kotlin.collections.q0.d()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.l0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, mt.b<? super Set<Integer>> bVar) {
            return ((e) create(g0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {394}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35135t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f35137v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f35137v = function0;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return l0.this.new f(this.f35137v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f35135t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    l0 l0Var = l0.this;
                    this.f35135t = 1;
                    obj = l0Var.n(this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                this.f35137v.invoke();
                return Unit.f22894a;
            } catch (Throwable th2) {
                this.f35137v.invoke();
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
    public static final class g extends ot.d {
        public int B;

        /* renamed from: t, reason: collision with root package name */
        public Object f35138t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35139u;

        /* renamed from: v, reason: collision with root package name */
        public Object f35140v;

        /* renamed from: w, reason: collision with root package name */
        public int f35141w;

        /* renamed from: x, reason: collision with root package name */
        public int f35142x;

        /* renamed from: y, reason: collision with root package name */
        public int f35143y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f35144z;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35144z = obj;
            this.B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l0.this.v(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {347}, m = "stopTrackingTable")
    public static final class h extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f35145t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35146u;

        /* renamed from: v, reason: collision with root package name */
        public Object f35147v;

        /* renamed from: w, reason: collision with root package name */
        public int f35148w;

        /* renamed from: x, reason: collision with root package name */
        public int f35149x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f35150y;

        public h(mt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35150y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l0.this.w(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {306}, m = "syncTriggers$room_runtime")
    public static final class i extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f35152t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35153u;

        /* renamed from: w, reason: collision with root package name */
        public int f35155w;

        public i(mt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35153u = obj;
            this.f35155w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l0.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/g0;", "connection", "", "<anonymous>", "(Lx4/g0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT, 314}, m = "invokeSuspend")
    public static final class j extends ot.m implements Function2<g0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f35156t;

        /* renamed from: u, reason: collision with root package name */
        public int f35157u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f35158v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/f0;", "", "<anonymous>", "(Lx4/f0;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {318, 319}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<f0<Unit>, mt.b<? super Unit>, Object> {
            public final /* synthetic */ k.a[] A;
            public final /* synthetic */ l0 B;
            public final /* synthetic */ g0 C;

            /* renamed from: t, reason: collision with root package name */
            public Object f35160t;

            /* renamed from: u, reason: collision with root package name */
            public Object f35161u;

            /* renamed from: v, reason: collision with root package name */
            public Object f35162v;

            /* renamed from: w, reason: collision with root package name */
            public int f35163w;

            /* renamed from: x, reason: collision with root package name */
            public int f35164x;

            /* renamed from: y, reason: collision with root package name */
            public int f35165y;

            /* renamed from: z, reason: collision with root package name */
            public int f35166z;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: x4.l0$j$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0649a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f35167a;

                static {
                    int[] iArr = new int[k.a.values().length];
                    try {
                        iArr[k.a.f35085a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k.a.b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k.a.f35086c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f35167a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k.a[] aVarArr, l0 l0Var, g0 g0Var, mt.b<? super a> bVar) {
                super(2, bVar);
                this.A = aVarArr;
                this.B = l0Var;
                this.C = g0Var;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.A, this.B, this.C, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
            
                if (r7.v(r12, r6, r11) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
            
                r6 = r12;
                r5 = r9;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0086 -> B:10:0x0087). Please report as a decompilation issue!!! */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = nt.c.e()
                    int r1 = r11.f35166z
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f35165y
                    int r4 = r11.f35164x
                    int r5 = r11.f35163w
                    java.lang.Object r6 = r11.f35162v
                    x4.g0 r6 = (x4.g0) r6
                    java.lang.Object r7 = r11.f35161u
                    x4.l0 r7 = (x4.l0) r7
                    java.lang.Object r8 = r11.f35160t
                    x4.k$a[] r8 = (x4.k.a[]) r8
                    gt.o.b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    gt.o.b(r12)
                    x4.k$a[] r12 = r11.A
                    x4.l0 r1 = r11.B
                    x4.g0 r4 = r11.C
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L3c:
                    if (r4 >= r1) goto L89
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = x4.l0.j.a.C0649a.f35167a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f35160t = r8
                    r11.f35161u = r7
                    r11.f35162v = r12
                    r11.f35163w = r9
                    r11.f35164x = r4
                    r11.f35165y = r1
                    r11.f35166z = r2
                    java.lang.Object r5 = x4.l0.i(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                    goto L85
                L66:
                    r6 = r12
                    r5 = r9
                L68:
                    r12 = r6
                    r6 = r5
                    goto L87
                L6b:
                    gt.l r12 = new gt.l
                    r12.<init>()
                    throw r12
                L71:
                    r11.f35160t = r8
                    r11.f35161u = r7
                    r11.f35162v = r12
                    r11.f35163w = r9
                    r11.f35164x = r4
                    r11.f35165y = r1
                    r11.f35166z = r3
                    java.lang.Object r5 = x4.l0.h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    kotlin.Unit r12 = kotlin.Unit.f22894a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: x4.l0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<Unit> f0Var, mt.b<? super Unit> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public j(mt.b<? super j> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            j jVar = l0.this.new j(bVar);
            jVar.f35158v = obj;
            return jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x00b3, code lost:
        
            if (r14 != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0044, code lost:
        
            if (r6 == r0) goto L52;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.l0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, mt.b<? super Unit> bVar) {
            return ((j) create(g0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(@NotNull u database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, ? extends Set<String>> viewTables, @NotNull String[] tableNames, boolean z10, @NotNull Function1<? super Set<Integer>, Unit> onInvalidatedTablesIds) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.useTempTable = z10;
        this.onInvalidatedTablesIds = onInvalidatedTablesIds;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new Function0() { // from class: x4.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean o8;
                o8 = l0.o();
                return Boolean.valueOf(o8);
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = tableNames[i10];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.shadowTablesMap.get(tableNames[i10]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i10] = lowerCase;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = value.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase3, kotlin.collections.k0.k(map, lowerCase2));
            }
        }
        this.observedTableStates = new k(this.tablesNames.length);
        this.observedTableVersions = new l(this.tablesNames.length);
    }

    public static final Set k(f5.d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Set b10 = kotlin.collections.p0.b();
        while (statement.i3()) {
            b10.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return kotlin.collections.p0.a(b10);
    }

    public static final boolean o() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(x4.m r6, mt.b<? super java.util.Set<java.lang.Integer>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof x4.l0.b
            if (r0 == 0) goto L13
            r0 = r7
            x4.l0$b r0 = (x4.l0.b) r0
            int r1 = r0.f35108w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35108w = r1
            goto L18
        L13:
            x4.l0$b r0 = new x4.l0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35106u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f35108w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f35105t
            java.util.Set r6 = (java.util.Set) r6
            gt.o.b(r7)
            return r6
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f35105t
            x4.m r6 = (x4.m) r6
            gt.o.b(r7)
            goto L55
        L40:
            gt.o.b(r7)
            x4.j0 r7 = new x4.j0
            r7.<init>()
            r0.f35105t = r6
            r0.f35108w = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.c(r2, r7, r0)
            if (r7 != r1) goto L55
            goto L6c
        L55:
            java.util.Set r7 = (java.util.Set) r7
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L6d
            r0.f35105t = r7
            r0.f35108w = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = x4.i0.b(r6, r2, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.j(x4.m, mt.b):java.lang.Object");
    }

    public final void l(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        f5.d r32 = connection.r3("PRAGMA query_only");
        try {
            r32.i3();
            boolean Y1 = r32.Y1(0);
            wt.a.a(r32, null);
            if (Y1) {
                return;
            }
            f5.a.a(connection, "PRAGMA temp_store = MEMORY");
            f5.a.a(connection, "PRAGMA recursive_triggers = 1");
            f5.a.a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                f5.a.a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                f5.a.a(connection, kotlin.text.x.N("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            }
            this.observedTableStates.h();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                wt.a.a(r32, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final mu.h<Set<String>> m(@NotNull String[] resolvedTableNames, @NotNull int[] tableIds, boolean emitInitialState) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return mu.j.w(new c(tableIds, emitInitialState, resolvedTableNames, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x0089, B:14:0x0094), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(mt.b<? super java.util.Set<java.lang.Integer>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof x4.l0.d
            if (r0 == 0) goto L13
            r0 = r9
            x4.l0$d r0 = (x4.l0.d) r0
            int r1 = r0.f35128w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35128w = r1
            goto L18
        L13:
            x4.l0$d r0 = new x4.l0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f35126u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f35128w
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f35125t
            y4.a r0 = (y4.a) r0
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L89
        L2d:
            r9 = move-exception
            goto La2
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            gt.o.b(r9)
            x4.u r9 = r8.database
            y4.a r9 = r9.getCloseBarrier()
            boolean r2 = r9.a()
            if (r2 == 0) goto La6
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.pendingRefresh     // Catch: java.lang.Throwable -> L58
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L5d
            java.util.Set r0 = kotlin.collections.q0.d()     // Catch: java.lang.Throwable -> L58
            r9.c()
            return r0
        L58:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto La2
        L5d:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r2 = r8.onAllowRefresh     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L58
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L73
            java.util.Set r0 = kotlin.collections.q0.d()     // Catch: java.lang.Throwable -> L58
            r9.c()
            return r0
        L73:
            x4.u r2 = r8.database     // Catch: java.lang.Throwable -> L58
            x4.l0$e r5 = new x4.l0$e     // Catch: java.lang.Throwable -> L58
            r6 = 0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L58
            r0.f35125t = r9     // Catch: java.lang.Throwable -> L58
            r0.f35128w = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r2.W(r4, r5, r0)     // Catch: java.lang.Throwable -> L58
            if (r0 != r1) goto L86
            return r1
        L86:
            r7 = r0
            r0 = r9
            r9 = r7
        L89:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L2d
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L9e
            x4.l r1 = r8.observedTableVersions     // Catch: java.lang.Throwable -> L2d
            r1.b(r9)     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.functions.Function1<java.util.Set<java.lang.Integer>, kotlin.Unit> r1 = r8.onInvalidatedTablesIds     // Catch: java.lang.Throwable -> L2d
            r1.invoke(r9)     // Catch: java.lang.Throwable -> L2d
        L9e:
            r0.c()
            return r9
        La2:
            r0.c()
            throw r9
        La6:
            java.util.Set r9 = kotlin.collections.q0.d()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.n(mt.b):java.lang.Object");
    }

    public final boolean p(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.i(tableIds);
    }

    public final boolean q(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.j(tableIds);
    }

    public final void r(@NotNull Function0<Unit> onRefreshScheduled, @NotNull Function0<Unit> onRefreshCompleted) {
        Intrinsics.checkNotNullParameter(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.checkNotNullParameter(onRefreshCompleted, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            ju.k.d(this.database.s(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    public final void s() {
        this.observedTableStates.k();
    }

    public final String[] t(String[] names) {
        Set b10 = kotlin.collections.p0.b();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                b10.addAll(set);
            } else {
                b10.add(str);
            }
        }
        return (String[]) kotlin.collections.p0.a(b10).toArray(new String[0]);
    }

    public final void u(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onAllowRefresh = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e0, code lost:
    
        if (x4.i0.b(r7, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (x4.i0.b(r13, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e0 -> B:11:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(x4.m r13, int r14, mt.b<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.v(x4.m, int, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0085 -> B:10:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(x4.m r10, int r11, mt.b<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof x4.l0.h
            if (r0 == 0) goto L13
            r0 = r12
            x4.l0$h r0 = (x4.l0.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            x4.l0$h r0 = new x4.l0$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f35150y
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f35149x
            int r11 = r0.f35148w
            java.lang.Object r2 = r0.f35147v
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f35146u
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f35145t
            x4.m r5 = (x4.m) r5
            gt.o.b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            gt.o.b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = x4.l0.f35094m
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            x4.l0$a r6 = x4.l0.INSTANCE
            java.lang.String r5 = x4.l0.Companion.a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f35145t = r11
            r0.f35146u = r12
            r0.f35147v = r2
            r0.f35148w = r4
            r0.f35149x = r10
            r0.A = r3
            java.lang.Object r5 = x4.i0.b(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            kotlin.Unit r10 = kotlin.Unit.f22894a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.w(x4.m, int, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(@org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof x4.l0.i
            if (r0 == 0) goto L13
            r0 = r8
            x4.l0$i r0 = (x4.l0.i) r0
            int r1 = r0.f35155w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35155w = r1
            goto L18
        L13:
            x4.l0$i r0 = new x4.l0$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f35153u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f35155w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f35152t
            y4.a r0 = (y4.a) r0
            gt.o.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5b
        L2d:
            r8 = move-exception
            goto L63
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            gt.o.b(r8)
            x4.u r8 = r7.database
            y4.a r8 = r8.getCloseBarrier()
            boolean r2 = r8.a()
            if (r2 == 0) goto L67
            x4.u r2 = r7.database     // Catch: java.lang.Throwable -> L5f
            x4.l0$j r4 = new x4.l0$j     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5f
            r0.f35152t = r8     // Catch: java.lang.Throwable -> L5f
            r0.f35155w = r3     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            java.lang.Object r0 = r2.W(r3, r4, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r0 = r8
        L5b:
            r0.c()
            goto L67
        L5f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L63:
            r0.c()
            throw r8
        L67:
            kotlin.Unit r8 = kotlin.Unit.f22894a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.x(mt.b):java.lang.Object");
    }

    @NotNull
    public final Pair<String[], int[]> y(@NotNull String[] names) {
        Intrinsics.checkNotNullParameter(names, "names");
        String[] t8 = t(names);
        int length = t8.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = t8[i10];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i10] = num.intValue();
        }
        return gt.s.a(t8, iArr);
    }
}
