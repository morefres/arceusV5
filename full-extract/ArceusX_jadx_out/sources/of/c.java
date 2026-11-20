package of;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import gt.o;
import gu.l;
import java.util.List;
import java.util.Map;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.w;
import mu.h;
import org.jetbrains.annotations.NotNull;
import ot.m;
import t3.i;
import x3.f;
import x3.g;
import x3.j;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lof/c;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Lx3/f$a;", "key", "defaultValue", "j", "(Lx3/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lx3/f;", "k", "(Lx3/f$a;Ljava/lang/Object;)Lx3/f;", "", "h", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lx3/c;", "", "transform", "g", "(Lkotlin/jvm/functions/Function1;)Lx3/f;", ve.a.f33391e, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", j6.b.f21518e, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "c", "Ljava/lang/ThreadLocal;", "editLock", "Lt3/i;", rl.d.f30696a, "Lcu/a;", "i", "(Landroid/content/Context;)Lt3/i;", "dataStore", "e", "Lt3/i;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l<Object>[] f27827f = {d0.h(new w(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadLocal<Boolean> editLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cu.a dataStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i<f> dataStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx3/f;", "<anonymous>", "(Lju/p0;)Lx3/f;"}, k = 3, mv = {2, 0, 0})
    @ot.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super f>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27832t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<x3.c, Unit> f27834v;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, k = 3, mv = {2, 0, 0})
        @ot.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        /* renamed from: of.c$a$a, reason: collision with other inner class name */
        public static final class C0486a extends m implements Function2<x3.c, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f27835t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f27836u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1<x3.c, Unit> f27837v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0486a(Function1<? super x3.c, Unit> function1, mt.b<? super C0486a> bVar) {
                super(2, bVar);
                this.f27837v = function1;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                C0486a c0486a = new C0486a(this.f27837v, bVar);
                c0486a.f27836u = obj;
                return c0486a;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f27835t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f27837v.invoke((x3.c) this.f27836u);
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x3.c cVar, mt.b<? super Unit> bVar) {
                return ((C0486a) create(cVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super x3.c, Unit> function1, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f27834v = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new a(this.f27834v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f27832t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    if (Intrinsics.c(c.this.editLock.get(), ot.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.editLock.set(ot.b.a(true));
                    i iVar = c.this.dataStore;
                    C0486a c0486a = new C0486a(this.f27834v, null);
                    this.f27832t = 1;
                    obj = j.a(iVar, c0486a, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return (f) obj;
            } finally {
                c.this.editLock.set(ot.b.a(false));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super f> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "Lx3/f$a;", "", "<anonymous>", "(Lju/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @ot.f(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, mt.b<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27838t;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Map<f.a<?>, Object> a10;
            Object e10 = nt.c.e();
            int i10 = this.f27838t;
            if (i10 == 0) {
                o.b(obj);
                h data = c.this.dataStore.getData();
                this.f27838t = 1;
                obj = mu.j.v(data, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (a10 = fVar.a()) == null) ? k0.j() : a10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Map<f.a<?>, ? extends Object>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @ot.f(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: of.c$c, reason: collision with other inner class name */
    public static final class C0487c<T> extends m implements Function2<p0, mt.b<? super T>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27840t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f27842v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f27843w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0487c(f.a<T> aVar, T t8, mt.b<? super C0487c> bVar) {
            super(2, bVar);
            this.f27842v = aVar;
            this.f27843w = t8;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new C0487c(this.f27842v, this.f27843w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object e10 = nt.c.e();
            int i10 = this.f27840t;
            if (i10 == 0) {
                o.b(obj);
                h<T> data = c.this.dataStore.getData();
                this.f27840t = 1;
                obj = mu.j.v(data, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (b = fVar.b(this.f27842v)) == null) ? this.f27843w : b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super T> bVar) {
            return ((C0487c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx3/f;", "<anonymous>", "(Lju/p0;)Lx3/f;"}, k = 3, mv = {2, 0, 0})
    @ot.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, mt.b<? super f>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27844t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f27846v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f27847w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, k = 3, mv = {2, 0, 0})
        @ot.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<x3.c, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f27848t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f27849u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ f.a<T> f27850v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ T f27851w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a<T> aVar, T t8, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f27850v = aVar;
                this.f27851w = t8;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(this.f27850v, this.f27851w, bVar);
                aVar.f27849u = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f27848t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((x3.c) this.f27849u).i(this.f27850v, this.f27851w);
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x3.c cVar, mt.b<? super Unit> bVar) {
                return ((a) create(cVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a<T> aVar, T t8, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f27846v = aVar;
            this.f27847w = t8;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new d(this.f27846v, this.f27847w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f27844t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            i iVar = c.this.dataStore;
            a aVar = new a(this.f27846v, this.f27847w, null);
            this.f27844t = 1;
            Object a10 = j.a(iVar, aVar, this);
            return a10 == e10 ? e10 : a10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super f> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public c(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        this.dataStore = w3.a.b(name, new u3.b(new Function1() { // from class: of.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                f e10;
                e10 = c.e(c.this, (t3.d) obj);
                return e10;
            }
        }), new Function1() { // from class: of.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List f10;
                f10 = c.f(c.this, (Context) obj);
                return f10;
            }
        }, null, 8, null);
        this.dataStore = i(context);
    }

    public static final f e(c cVar, t3.d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(d0.b(c.class).g(), "CorruptionException in " + cVar.name + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    public static final List f(c cVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.o.d(w3.i.b(it, cVar.name, null, 4, null));
    }

    @NotNull
    public final f g(@NotNull Function1<? super x3.c, Unit> transform) {
        Object b10;
        Intrinsics.checkNotNullParameter(transform, "transform");
        b10 = ju.j.b(null, new a(transform, null), 1, null);
        return (f) b10;
    }

    @NotNull
    public final Map<f.a<?>, Object> h() {
        Object b10;
        b10 = ju.j.b(null, new b(null), 1, null);
        return (Map) b10;
    }

    public final i<f> i(Context context) {
        return (i) this.dataStore.getValue(context, f27827f[0]);
    }

    public final <T> T j(@NotNull f.a<T> key, T defaultValue) {
        Object b10;
        Intrinsics.checkNotNullParameter(key, "key");
        b10 = ju.j.b(null, new C0487c(key, defaultValue, null), 1, null);
        return (T) b10;
    }

    @NotNull
    public final <T> f k(@NotNull f.a<T> key, T value) {
        Object b10;
        Intrinsics.checkNotNullParameter(key, "key");
        b10 = ju.j.b(null, new d(key, value, null), 1, null);
        return (f) b10;
    }
}
