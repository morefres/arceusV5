package ql;

import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.share.attribution.RequestError;
import java.io.Serializable;
import java.util.List;
import ju.g1;
import ju.p0;
import ju.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lql/w;", "", "Lql/b;", "local", "Lql/v;", "remote", "<init>", "(Lql/b;Lql/v;)V", "Ljava/io/Serializable;", rl.d.f30696a, "(Lmt/b;)Ljava/lang/Object;", "", "c", ve.a.f33391e, "Lql/b;", j6.b.f21518e, "Lql/v;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ql.b local;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final v remote;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2", f = "Replicator.kt", l = {41, 82}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Integer>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f29909t;

        /* renamed from: u, reason: collision with root package name */
        public Object f29910u;

        /* renamed from: v, reason: collision with root package name */
        public int f29911v;

        /* renamed from: w, reason: collision with root package name */
        public int f29912w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f29913x;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$2$1$1", f = "Replicator.kt", l = {54}, m = "invokeSuspend", v = 1)
        public static final class a extends ot.m implements Function2<p0, mt.b<? super gt.n<? extends String>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f29915t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ w f29916u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Achievement f29917v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, Achievement achievement, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f29916u = wVar;
                this.f29917v = achievement;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f29916u, this.f29917v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super gt.n<? extends String>> bVar) {
                return invoke2(p0Var, (mt.b<? super gt.n<String>>) bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object b;
                Object b10;
                Object e10 = nt.c.e();
                int i10 = this.f29915t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    v vVar = this.f29916u.remote;
                    Achievement achievement = this.f29917v;
                    this.f29915t = 1;
                    b = vVar.b(achievement, this);
                    if (b == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    b = ((gt.n) obj).getValue();
                }
                Achievement achievement2 = this.f29917v;
                if (gt.n.h(b)) {
                    boolean booleanValue = ((Boolean) b).booleanValue();
                    if (!booleanValue) {
                        Log.w("rbx.achievement.replicator", "remote grant of " + achievement2.getCodeName() + " failed");
                    }
                    if (rh.h.a().C()) {
                        t.f29898a.n("remote", achievement2.getCodeName(), booleanValue);
                    }
                    String codeName = achievement2.getCodeName();
                    if (!booleanValue) {
                        codeName = null;
                    }
                    b10 = gt.n.b(codeName);
                } else {
                    b10 = gt.n.b(b);
                }
                Achievement achievement3 = this.f29917v;
                Throwable e11 = gt.n.e(b10);
                if (e11 != null) {
                    Log.w("rbx.achievement.replicator", "granting " + achievement3.getCodeName() + " failed exceptionally", e11);
                    b10 = gt.n.b(null);
                }
                return gt.n.a(b10);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, mt.b<? super gt.n<String>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: ql.w$b$b, reason: collision with other inner class name */
        public static final class C0520b implements mu.h<List<? extends Achievement>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.h f29918a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: ql.w$b$b$a */
            public static final class a<T> implements mu.i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ mu.i f29919a;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @ot.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$filter$1$2", f = "Replicator.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
                /* renamed from: ql.w$b$b$a$a, reason: collision with other inner class name */
                public static final class C0521a extends ot.d {
                    public int A;

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f29920t;

                    /* renamed from: u, reason: collision with root package name */
                    public int f29921u;

                    /* renamed from: v, reason: collision with root package name */
                    public Object f29922v;

                    /* renamed from: w, reason: collision with root package name */
                    public Object f29923w;

                    /* renamed from: y, reason: collision with root package name */
                    public Object f29925y;

                    /* renamed from: z, reason: collision with root package name */
                    public Object f29926z;

                    public C0521a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        this.f29920t = obj;
                        this.f29921u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(mu.i iVar) {
                    this.f29919a = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // mu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, mt.b r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ql.w.b.C0520b.a.C0521a
                        if (r0 == 0) goto L13
                        r0 = r6
                        ql.w$b$b$a$a r0 = (ql.w.b.C0520b.a.C0521a) r0
                        int r1 = r0.f29921u
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29921u = r1
                        goto L18
                    L13:
                        ql.w$b$b$a$a r0 = new ql.w$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f29920t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f29921u
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.f29926z
                        mu.i r5 = (mu.i) r5
                        java.lang.Object r5 = r0.f29923w
                        ql.w$b$b$a$a r5 = (ql.w.b.C0520b.a.C0521a) r5
                        gt.o.b(r6)
                        goto L6d
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        gt.o.b(r6)
                        mu.i r6 = r4.f29919a
                        r2 = r5
                        java.util.List r2 = (java.util.List) r2
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L6d
                        java.lang.Object r2 = ot.l.a(r5)
                        r0.f29922v = r2
                        java.lang.Object r2 = ot.l.a(r0)
                        r0.f29923w = r2
                        java.lang.Object r2 = ot.l.a(r5)
                        r0.f29925y = r2
                        java.lang.Object r2 = ot.l.a(r6)
                        r0.f29926z = r2
                        r2 = 0
                        r0.A = r2
                        r0.f29921u = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L6d
                        return r1
                    L6d:
                        kotlin.Unit r5 = kotlin.Unit.f22894a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ql.w.b.C0520b.a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            public C0520b(mu.h hVar) {
                this.f29918a = hVar;
            }

            @Override // mu.h
            public Object collect(mu.i<? super List<? extends Achievement>> iVar, mt.b bVar) {
                Object collect = this.f29918a.collect(new a(iVar), bVar);
                return collect == nt.c.e() ? collect : Unit.f22894a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements mu.h<List<? extends w0<? extends gt.n<? extends String>>>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.h f29927a;
            public final /* synthetic */ p0 b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f29928c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements mu.i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ mu.i f29929a;
                public final /* synthetic */ p0 b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f29930c;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @ot.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$1$2", f = "Replicator.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
                /* renamed from: ql.w$b$c$a$a, reason: collision with other inner class name */
                public static final class C0522a extends ot.d {
                    public int A;

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f29931t;

                    /* renamed from: u, reason: collision with root package name */
                    public int f29932u;

                    /* renamed from: v, reason: collision with root package name */
                    public Object f29933v;

                    /* renamed from: x, reason: collision with root package name */
                    public Object f29935x;

                    /* renamed from: y, reason: collision with root package name */
                    public Object f29936y;

                    /* renamed from: z, reason: collision with root package name */
                    public Object f29937z;

                    public C0522a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        this.f29931t = obj;
                        this.f29932u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(mu.i iVar, p0 p0Var, w wVar) {
                    this.f29929a = iVar;
                    this.b = p0Var;
                    this.f29930c = wVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // mu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r13, mt.b r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof ql.w.b.c.a.C0522a
                        if (r0 == 0) goto L13
                        r0 = r14
                        ql.w$b$c$a$a r0 = (ql.w.b.c.a.C0522a) r0
                        int r1 = r0.f29932u
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29932u = r1
                        goto L18
                    L13:
                        ql.w$b$c$a$a r0 = new ql.w$b$c$a$a
                        r0.<init>(r14)
                    L18:
                        java.lang.Object r14 = r0.f29931t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f29932u
                        r3 = 1
                        if (r2 == 0) goto L3a
                        if (r2 != r3) goto L32
                        java.lang.Object r13 = r0.f29937z
                        mu.i r13 = (mu.i) r13
                        java.lang.Object r13 = r0.f29935x
                        ql.w$b$c$a$a r13 = (ql.w.b.c.a.C0522a) r13
                        gt.o.b(r14)
                        goto Lb3
                    L32:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L3a:
                        gt.o.b(r14)
                        mu.i r14 = r12.f29929a
                        r2 = r13
                        java.util.List r2 = (java.util.List) r2
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>()
                        java.lang.String r5 = "Syncing "
                        r4.append(r5)
                        r4.append(r2)
                        java.lang.String r5 = " achievements to remote"
                        r4.append(r5)
                        java.lang.String r4 = r4.toString()
                        java.lang.String r5 = "rbx.achievement.replicator"
                        android.util.Log.i(r5, r4)
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = kotlin.collections.q.u(r2, r5)
                        r4.<init>(r5)
                        java.util.Iterator r2 = r2.iterator()
                    L6e:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L8f
                        java.lang.Object r5 = r2.next()
                        ql.a r5 = (ql.Achievement) r5
                        ju.p0 r6 = r12.b
                        ql.w$b$a r9 = new ql.w$b$a
                        ql.w r7 = r12.f29930c
                        r8 = 0
                        r9.<init>(r7, r5, r8)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        ju.w0 r5 = ju.i.b(r6, r7, r8, r9, r10, r11)
                        r4.add(r5)
                        goto L6e
                    L8f:
                        java.lang.Object r2 = ot.l.a(r13)
                        r0.f29933v = r2
                        java.lang.Object r2 = ot.l.a(r0)
                        r0.f29935x = r2
                        java.lang.Object r13 = ot.l.a(r13)
                        r0.f29936y = r13
                        java.lang.Object r13 = ot.l.a(r14)
                        r0.f29937z = r13
                        r13 = 0
                        r0.A = r13
                        r0.f29932u = r3
                        java.lang.Object r13 = r14.emit(r4, r0)
                        if (r13 != r1) goto Lb3
                        return r1
                    Lb3:
                        kotlin.Unit r13 = kotlin.Unit.f22894a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ql.w.b.c.a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            public c(mu.h hVar, p0 p0Var, w wVar) {
                this.f29927a = hVar;
                this.b = p0Var;
                this.f29928c = wVar;
            }

            @Override // mu.h
            public Object collect(mu.i<? super List<? extends w0<? extends gt.n<? extends String>>>> iVar, mt.b bVar) {
                Object collect = this.f29927a.collect(new a(iVar, this.b, this.f29928c), bVar);
                return collect == nt.c.e() ? collect : Unit.f22894a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements mu.h<gt.n<? extends Unit>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.h f29938a;
            public final /* synthetic */ p0 b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f29939c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements mu.i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ mu.i f29940a;
                public final /* synthetic */ p0 b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f29941c;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @ot.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$2$2", f = "Replicator.kt", l = {52, 67, RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
                /* renamed from: ql.w$b$d$a$a, reason: collision with other inner class name */
                public static final class C0523a extends ot.d {
                    public Object A;
                    public Object B;
                    public Object C;
                    public Object D;
                    public Object E;
                    public int F;
                    public int G;
                    public int H;

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f29942t;

                    /* renamed from: u, reason: collision with root package name */
                    public int f29943u;

                    /* renamed from: v, reason: collision with root package name */
                    public Object f29944v;

                    /* renamed from: x, reason: collision with root package name */
                    public Object f29946x;

                    /* renamed from: y, reason: collision with root package name */
                    public Object f29947y;

                    /* renamed from: z, reason: collision with root package name */
                    public Object f29948z;

                    public C0523a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        this.f29942t = obj;
                        this.f29943u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(mu.i iVar, p0 p0Var, w wVar) {
                    this.f29940a = iVar;
                    this.b = p0Var;
                    this.f29941c = wVar;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(9:18|19|20|21|(1:23)|24|25|(1:27)|28))(4:35|36|37|38))(5:63|64|65|(1:67)|30)|39|40|(6:43|(1:45)|46|(2:48|49)(1:51)|50|41)|52|53|(7:55|21|(0)|24|25|(0)|28)|30))|71|6|7|(0)(0)|39|40|(1:41)|52|53|(0)|30|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0220, code lost:
                
                    if (r4.emit(r0, r6) == r2) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0136, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0137, code lost:
                
                    r3 = r9;
                    r5 = r14;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x01c3 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:20:0x006a, B:21:0x01b4, B:23:0x01c3, B:24:0x01cb), top: B:19:0x006a }] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x01eb  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:40:0x0105, B:41:0x0112, B:43:0x0118, B:46:0x012a, B:48:0x0132, B:53:0x013e), top: B:39:0x0105 }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x01ae  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
                @Override // mu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r21, mt.b r22) {
                    /*
                        Method dump skipped, instructions count: 550
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ql.w.b.d.a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            public d(mu.h hVar, p0 p0Var, w wVar) {
                this.f29938a = hVar;
                this.b = p0Var;
                this.f29939c = wVar;
            }

            @Override // mu.h
            public Object collect(mu.i<? super gt.n<? extends Unit>> iVar, mt.b bVar) {
                Object collect = this.f29938a.collect(new a(iVar, this.b, this.f29939c), bVar);
                return collect == nt.c.e() ? collect : Unit.f22894a;
            }
        }

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = w.this.new b(bVar);
            bVar2.f29913x = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
        
            if (mu.j.i(r5, r11) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0043, code lost:
        
            if (r12 == r1) goto L35;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.w.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Integer> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ljava/io/Serializable;", "<anonymous>", "(Lju/p0;)Ljava/io/Serializable;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.universalapp.achievement.Replicator$syncRemoteToLocal$2", f = "Replicator.kt", l = {25, 31}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super Serializable>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f29949t;

        /* renamed from: u, reason: collision with root package name */
        public Object f29950u;

        /* renamed from: v, reason: collision with root package name */
        public int f29951v;

        /* renamed from: w, reason: collision with root package name */
        public int f29952w;

        /* renamed from: x, reason: collision with root package name */
        public int f29953x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f29954y;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = w.this.new c(bVar);
            cVar.f29954y = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        
            if (r2.d(r7, r6) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
        
            if (r7 == r1) goto L22;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f29954y
                ju.p0 r0 = (ju.p0) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r6.f29953x
                java.lang.String r3 = "rbx.achievement.replicator"
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L34
                if (r2 == r5) goto L2a
                if (r2 != r4) goto L22
                java.lang.Object r0 = r6.f29950u
                ju.p0 r0 = (ju.p0) r0
                java.lang.Object r0 = r6.f29949t
                java.util.List r0 = (java.util.List) r0
                gt.o.b(r7)     // Catch: java.lang.Throwable -> L20
                goto L76
            L20:
                r7 = move-exception
                goto L7d
            L22:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L2a:
                gt.o.b(r7)
                gt.n r7 = (gt.n) r7
                java.lang.Object r7 = r7.getValue()
                goto L48
            L34:
                gt.o.b(r7)
                ql.w r7 = ql.w.this
                ql.v r7 = ql.w.b(r7)
                r6.f29954y = r0
                r6.f29953x = r5
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r1) goto L48
                goto L75
            L48:
                ql.w r2 = ql.w.this
                java.lang.Throwable r5 = gt.n.e(r7)
                if (r5 != 0) goto L97
                java.util.List r7 = (java.util.List) r7
                ql.b r2 = ql.w.a(r2)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r5 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L20
                r6.f29954y = r5     // Catch: java.lang.Throwable -> L20
                java.lang.Object r5 = ot.l.a(r7)     // Catch: java.lang.Throwable -> L20
                r6.f29949t = r5     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L20
                r6.f29950u = r0     // Catch: java.lang.Throwable -> L20
                r0 = 0
                r6.f29951v = r0     // Catch: java.lang.Throwable -> L20
                r6.f29952w = r0     // Catch: java.lang.Throwable -> L20
                r6.f29953x = r4     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = r2.d(r7, r6)     // Catch: java.lang.Throwable -> L20
                if (r7 != r1) goto L76
            L75:
                return r1
            L76:
                kotlin.Unit r7 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = gt.n.b(r7)     // Catch: java.lang.Throwable -> L20
                goto L87
            L7d:
                gt.n$a r0 = gt.n.INSTANCE
                java.lang.Object r7 = gt.o.a(r7)
                java.lang.Object r7 = gt.n.b(r7)
            L87:
                java.lang.Throwable r0 = gt.n.e(r7)
                if (r0 == 0) goto L92
                java.lang.String r1 = "Unable to replicate remote achievements locally"
                android.util.Log.w(r3, r1, r0)
            L92:
                gt.n r7 = gt.n.a(r7)
                return r7
            L97:
                java.lang.String r7 = "Unable to gather remote achievements"
                int r7 = android.util.Log.w(r3, r7, r5)
                java.lang.Integer r7 = ot.b.c(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.w.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Serializable> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public w(@NotNull ql.b local, @NotNull v remote) {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(remote, "remote");
        this.local = local;
        this.remote = remote;
    }

    @Nullable
    public final Object c(@NotNull mt.b<? super Integer> bVar) {
        return ju.i.g(g1.b(), new b(null), bVar);
    }

    @Nullable
    public final Object d(@NotNull mt.b<? super Serializable> bVar) {
        return ju.i.g(g1.b(), new c(null), bVar);
    }
}
