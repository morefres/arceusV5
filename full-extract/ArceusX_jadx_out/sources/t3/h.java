package t3;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lt3/h;", "T", "", ve.a.f33391e, "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lt3/h$a;", "", "<init>", "()V", "T", "", "Lt3/g;", "migrations", "Lkotlin/Function2;", "Lt3/s;", "Lmt/b;", "", j6.b.f21518e, "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "api", "c", "(Ljava/util/List;Lt3/s;Lmt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t3.h$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/s;", "api", "", "<anonymous>", "(Lt3/s;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {MotionEventCompat.AXIS_GENERIC_2}, m = "invokeSuspend")
        /* renamed from: t3.h$a$a, reason: collision with other inner class name */
        public static final class C0564a extends ot.m implements Function2<s<T>, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31756t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31757u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<g<T>> f31758v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0564a(List<? extends g<T>> list, mt.b<? super C0564a> bVar) {
                super(2, bVar);
                this.f31758v = list;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                C0564a c0564a = new C0564a(this.f31758v, bVar);
                c0564a.f31757u = obj;
                return c0564a;
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f31756t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    s sVar = (s) this.f31757u;
                    Companion companion = h.INSTANCE;
                    List<g<T>> list = this.f31758v;
                    this.f31756t = 1;
                    if (companion.c(list, sVar, this) == e10) {
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
            public final Object invoke(@NotNull s<T> sVar, @Nullable mt.b<? super Unit> bVar) {
                return ((C0564a) create(sVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @ot.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {MotionEventCompat.AXIS_GENERIC_11, 57}, m = "runMigrations")
        /* renamed from: t3.h$a$b */
        public static final class b<T> extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public Object f31759t;

            /* renamed from: u, reason: collision with root package name */
            public Object f31760u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f31761v;

            /* renamed from: x, reason: collision with root package name */
            public int f31763x;

            public b(mt.b<? super b> bVar) {
                super(bVar);
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f31761v = obj;
                this.f31763x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return Companion.this.c(null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @ot.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {MotionEventCompat.AXIS_GENERIC_13, MotionEventCompat.AXIS_GENERIC_15}, m = "invokeSuspend")
        /* renamed from: t3.h$a$c */
        public static final class c extends ot.m implements Function2<T, mt.b<? super T>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f31764t;

            /* renamed from: u, reason: collision with root package name */
            public Object f31765u;

            /* renamed from: v, reason: collision with root package name */
            public Object f31766v;

            /* renamed from: w, reason: collision with root package name */
            public int f31767w;

            /* renamed from: x, reason: collision with root package name */
            public /* synthetic */ Object f31768x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ List<g<T>> f31769y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ List<Function1<mt.b<? super Unit>, Object>> f31770z;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @ot.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {MotionEventCompat.AXIS_GENERIC_14}, m = "invokeSuspend")
            /* renamed from: t3.h$a$c$a, reason: collision with other inner class name */
            public static final class C0565a extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31771t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ g<T> f31772u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0565a(g<T> gVar, mt.b<? super C0565a> bVar) {
                    super(1, bVar);
                    this.f31772u = gVar;
                }

                @Override // ot.a
                @NotNull
                public final mt.b<Unit> create(@NotNull mt.b<?> bVar) {
                    return new C0565a(this.f31772u, bVar);
                }

                @Override // ot.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object e10 = nt.c.e();
                    int i10 = this.f31771t;
                    if (i10 == 0) {
                        gt.o.b(obj);
                        g<T> gVar = this.f31772u;
                        this.f31771t = 1;
                        if (gVar.c(this) == e10) {
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

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@Nullable mt.b<? super Unit> bVar) {
                    return ((C0565a) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends g<T>> list, List<Function1<mt.b<? super Unit>, Object>> list2, mt.b<? super c> bVar) {
                super(2, bVar);
                this.f31769y = list;
                this.f31770z = list2;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                c cVar = new c(this.f31769y, this.f31770z, bVar);
                cVar.f31768x = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
            @Override // ot.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = nt.c.e()
                    int r1 = r9.f31767w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f31764t
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f31768x
                    java.util.List r4 = (java.util.List) r4
                    gt.o.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f31766v
                    java.lang.Object r4 = r9.f31765u
                    t3.g r4 = (t3.g) r4
                    java.lang.Object r5 = r9.f31764t
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f31768x
                    java.util.List r6 = (java.util.List) r6
                    gt.o.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    gt.o.b(r10)
                    java.lang.Object r10 = r9.f31768x
                    java.util.List<t3.g<T>> r1 = r9.f31769y
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<kotlin.jvm.functions.Function1<mt.b<? super kotlin.Unit>, java.lang.Object>> r4 = r9.f31770z
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    t3.g r5 = (t3.g) r5
                    r9.f31768x = r4
                    r9.f31764t = r1
                    r9.f31765u = r5
                    r9.f31766v = r10
                    r9.f31767w = r3
                    java.lang.Object r6 = r5.b(r10, r9)
                    if (r6 != r0) goto L63
                    goto L89
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    t3.h$a$c$a r10 = new t3.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f31768x = r4
                    r9.f31764t = r5
                    r9.f31765u = r7
                    r9.f31766v = r7
                    r9.f31767w = r2
                    java.lang.Object r10 = r6.a(r1, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: t3.h.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t8, @Nullable mt.b<? super T> bVar) {
                return ((c) create(t8, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Function2<s<T>, mt.b<? super Unit>, Object> b(@NotNull List<? extends g<T>> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0564a(migrations, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(java.util.List<? extends t3.g<T>> r7, t3.s<T> r8, mt.b<? super kotlin.Unit> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof t3.h.Companion.b
                if (r0 == 0) goto L13
                r0 = r9
                t3.h$a$b r0 = (t3.h.Companion.b) r0
                int r1 = r0.f31763x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f31763x = r1
                goto L18
            L13:
                t3.h$a$b r0 = new t3.h$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f31761v
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f31763x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f31760u
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f31759t
                kotlin.jvm.internal.c0 r8 = (kotlin.jvm.internal.c0) r8
                gt.o.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f31759t
                java.util.List r7 = (java.util.List) r7
                gt.o.b(r9)
                goto L60
            L46:
                gt.o.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                t3.h$a$c r2 = new t3.h$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f31759t = r9
                r0.f31763x = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L83
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.c0 r8 = new kotlin.jvm.internal.c0
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                r0.f31759t = r8     // Catch: java.lang.Throwable -> L34
                r0.f31760u = r7     // Catch: java.lang.Throwable -> L34
                r0.f31763x = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
            L83:
                return r1
            L84:
                T r2 = r8.f22963a
                if (r2 != 0) goto L8b
                r8.f22963a = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                gt.a.a(r2, r9)
                goto L6b
            L94:
                T r7 = r8.f22963a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.h.Companion.c(java.util.List, t3.s, mt.b):java.lang.Object");
        }

        public Companion() {
        }
    }
}
