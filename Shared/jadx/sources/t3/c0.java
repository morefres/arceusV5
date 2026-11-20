package t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.share.attribution.RequestError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Lt3/c0;", "Lt3/t;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lmt/b;", "", "block", "e", "(Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "", ve.a.f33391e, "(Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "", rl.d.f30696a, "(Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Ljava/lang/String;", "Ltu/a;", "Ltu/a;", "mutex", "Lt3/b;", "c", "Lt3/b;", "version", "Lmu/h;", "", "Lmu/h;", "()Lmu/h;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 implements t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String filePath;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final tu.a mutex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.b version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.h<Unit> updateNotifications;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
    public static final class a<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31740t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31741u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31742v;

        /* renamed from: x, reason: collision with root package name */
        public int f31744x;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31742v = obj;
            this.f31744x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c0.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "tryLock")
    public static final class b<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31745t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f31746u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31747v;

        /* renamed from: x, reason: collision with root package name */
        public int f31749x;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31747v = obj;
            this.f31749x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c0.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmu/i;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<mu.i<? super Unit>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31750t;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            nt.c.e();
            if (this.f31750t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull mu.i<? super Unit> iVar, @Nullable mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public c0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = tu.g.b(false, 1, null);
        this.version = new t3.b(0);
        this.updateNotifications = mu.j.w(new c(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t3.t
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super mt.b<? super T>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull mt.b<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t3.c0.b
            if (r0 == 0) goto L13
            r0 = r8
            t3.c0$b r0 = (t3.c0.b) r0
            int r1 = r0.f31749x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31749x = r1
            goto L18
        L13:
            t3.c0$b r0 = new t3.c0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31747v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31749x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f31746u
            java.lang.Object r0 = r0.f31745t
            tu.a r0 = (tu.a) r0
            gt.o.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            gt.o.b(r8)
            tu.a r8 = r6.mutex
            boolean r2 = r8.e(r4)
            java.lang.Boolean r5 = ot.b.a(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f31745t = r8     // Catch: java.lang.Throwable -> L5d
            r0.f31746u = r2     // Catch: java.lang.Throwable -> L5d
            r0.f31749x = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.f(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.f(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.a(kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }

    @Override // t3.t
    @Nullable
    public Object b(@NotNull mt.b<? super Integer> bVar) {
        return ot.b.c(this.version.d());
    }

    @Override // t3.t
    @NotNull
    public mu.h<Unit> c() {
        return this.updateNotifications;
    }

    @Override // t3.t
    @Nullable
    public Object d(@NotNull mt.b<? super Integer> bVar) {
        return ot.b.c(this.version.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r9.c(null, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // t3.t
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mt.b<? super T>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull mt.b<? super T> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof t3.c0.a
            if (r0 == 0) goto L13
            r0 = r9
            t3.c0$a r0 = (t3.c0.a) r0
            int r1 = r0.f31744x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31744x = r1
            goto L18
        L13:
            t3.c0$a r0 = new t3.c0$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f31742v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31744x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f31740t
            tu.a r8 = (tu.a) r8
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f31741u
            tu.a r8 = (tu.a) r8
            java.lang.Object r2 = r0.f31740t
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            gt.o.b(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            gt.o.b(r9)
            tu.a r9 = r7.mutex
            r0.f31740t = r8
            r0.f31741u = r9
            r0.f31744x = r4
            java.lang.Object r2 = r9.c(r5, r0)
            if (r2 != r1) goto L5b
            goto L67
        L5b:
            r0.f31740t = r9     // Catch: java.lang.Throwable -> L6f
            r0.f31741u = r5     // Catch: java.lang.Throwable -> L6f
            r0.f31744x = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.f(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.f(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.e(kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }
}
