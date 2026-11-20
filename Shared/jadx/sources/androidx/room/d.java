package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import gt.o;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.b0;
import mu.h;
import mu.i;
import mu.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;

@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00132\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>¨\u0006@"}, d2 = {"Landroidx/room/d;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/room/c;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V", "Landroid/content/Intent;", "serviceIntent", "", "k", "(Landroid/content/Intent;)V", "l", "()V", "", "resolvedTableNames", "Lmu/h;", "", "h", "([Ljava/lang/String;)Lmu/h;", "j", ve.a.f33391e, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", j6.b.f21518e, "Landroidx/room/c;", "i", "()Landroidx/room/c;", "kotlin.jvm.PlatformType", "c", "Landroid/content/Context;", "appContext", "Lju/p0;", rl.d.f30696a, "Lju/p0;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "", "f", "I", "clientId", "Landroidx/room/b;", "g", "Landroidx/room/b;", "invalidationService", "Lmu/b0;", "Lmu/b0;", "invalidatedTables", "androidx/room/d$c", "Landroidx/room/d$c;", "observer", "Landroidx/room/a;", "Landroidx/room/a;", "invalidationCallback", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final androidx.room.c invalidationTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Context appContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean stopped;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int clientId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.room.b invalidationService;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<Set<String>> invalidatedTables;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c observer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.room.a invalidationCallback;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ServiceConnection serviceConnection;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h<Set<? extends String>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f3150a;
        public final /* synthetic */ String[] b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        public static final class C0057a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f3151a;
            public final /* synthetic */ String[] b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", l = {235}, m = "emit")
            /* renamed from: androidx.room.d$a$a$a, reason: collision with other inner class name */
            public static final class C0058a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f3152t;

                /* renamed from: u, reason: collision with root package name */
                public int f3153u;

                public C0058a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f3152t = obj;
                    this.f3153u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C0057a.this.emit(null, this);
                }
            }

            public C0057a(i iVar, String[] strArr) {
                this.f3151a = iVar;
                this.b = strArr;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, @org.jetbrains.annotations.NotNull mt.b r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof androidx.room.d.a.C0057a.C0058a
                    if (r0 == 0) goto L13
                    r0 = r12
                    androidx.room.d$a$a$a r0 = (androidx.room.d.a.C0057a.C0058a) r0
                    int r1 = r0.f3153u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f3153u = r1
                    goto L18
                L13:
                    androidx.room.d$a$a$a r0 = new androidx.room.d$a$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f3152t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f3153u
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    gt.o.b(r12)
                    goto L7c
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    gt.o.b(r12)
                    mu.i r12 = r10.f3151a
                    java.util.Set r11 = (java.util.Set) r11
                    java.util.Set r2 = kotlin.collections.p0.b()
                    java.lang.String[] r4 = r10.b
                    int r5 = r4.length
                    r6 = 0
                L40:
                    if (r6 >= r5) goto L64
                    r7 = r4[r6]
                    r8 = r11
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.Iterator r8 = r8.iterator()
                L4b:
                    boolean r9 = r8.hasNext()
                    if (r9 == 0) goto L61
                    java.lang.Object r9 = r8.next()
                    java.lang.String r9 = (java.lang.String) r9
                    boolean r9 = kotlin.text.x.E(r7, r9, r3)
                    if (r9 == 0) goto L4b
                    r2.add(r7)
                    goto L4b
                L61:
                    int r6 = r6 + 1
                    goto L40
                L64:
                    java.util.Set r11 = kotlin.collections.p0.a(r2)
                    java.util.Collection r11 = (java.util.Collection) r11
                    boolean r2 = r11.isEmpty()
                    if (r2 == 0) goto L71
                    r11 = 0
                L71:
                    if (r11 == 0) goto L7c
                    r0.f3153u = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L7c
                    return r1
                L7c:
                    kotlin.Unit r11 = kotlin.Unit.f22894a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.d.a.C0057a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public a(h hVar, String[] strArr) {
            this.f3150a = hVar;
            this.b = strArr;
        }

        @Override // mu.h
        @Nullable
        public Object collect(@NotNull i<? super Set<? extends String>> iVar, @NotNull mt.b bVar) {
            Object collect = this.f3150a.collect(new C0057a(iVar, this.b), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/d$b", "Landroidx/room/a$a;", "", "", "tables", "", "A", "([Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a.AbstractBinderC0053a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f3156t;

            /* renamed from: u, reason: collision with root package name */
            public int f3157u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String[] f3158v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d f3159w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String[] strArr, d dVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f3158v = strArr;
                this.f3159w = dVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f3158v, this.f3159w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Object e10 = nt.c.e();
                int i10 = this.f3157u;
                if (i10 == 0) {
                    o.b(obj);
                    String[] strArr = this.f3158v;
                    Set<String> g10 = q0.g(Arrays.copyOf(strArr, strArr.length));
                    b0 b0Var = this.f3159w.invalidatedTables;
                    this.f3156t = g10;
                    this.f3157u = 1;
                    if (b0Var.emit(g10, this) == e10) {
                        return e10;
                    }
                    set = g10;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.f3156t;
                    o.b(obj);
                }
                this.f3159w.getInvalidationTracker().q(set);
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public b() {
        }

        @Override // androidx.room.a
        public void A(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            k.d(d.this.coroutineScope, null, null, new a(tables, d.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/d$c", "Landroidx/room/c$b;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "", j6.b.f21518e, "()Z", "isRemote", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends c.b {
        public c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.b
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.b
        public void c(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (d.this.stopped.get()) {
                return;
            }
            try {
                androidx.room.b bVar = d.this.invalidationService;
                if (bVar != null) {
                    bVar.B0(d.this.clientId, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/d$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: androidx.room.d$d, reason: collision with other inner class name */
    public static final class ServiceConnectionC0059d implements ServiceConnection {
        public ServiceConnectionC0059d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            d.this.invalidationService = b.a.r2(service);
            d.this.j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            d.this.invalidationService = null;
        }
    }

    public d(@NotNull Context context, @NotNull String name, @NotNull androidx.room.c invalidationTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().s();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = i0.a(0, 0, lu.a.f23848a);
        this.observer = new c(invalidationTracker.getTableNames());
        this.invalidationCallback = new b();
        this.serviceConnection = new ServiceConnectionC0059d();
    }

    @NotNull
    public final h<Set<String>> h(@NotNull String[] resolvedTableNames) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        return new a(this.invalidatedTables, resolvedTableNames);
    }

    @NotNull
    /* renamed from: i, reason: from getter */
    public final androidx.room.c getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final void j() {
        try {
            androidx.room.b bVar = this.invalidationService;
            if (bVar != null) {
                this.clientId = bVar.Y0(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final void k(@NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.i(this.observer);
        }
    }

    public final void l() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.w(this.observer);
            try {
                androidx.room.b bVar = this.invalidationService;
                if (bVar != null) {
                    bVar.n2(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
