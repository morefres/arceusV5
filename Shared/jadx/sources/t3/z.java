package t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lt3/z;", "", "<init>", "()V", "", j6.b.f21518e, "(Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "c", "Ltu/a;", "Ltu/a;", "runMutex", "Lju/x;", "Lju/x;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.a runMutex = tu.g.b(false, 1, null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ju.x<Unit> didRun = ju.z.c(null, 1, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31964t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31965u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31966v;

        /* renamed from: x, reason: collision with root package name */
        public int f31968x;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31966v = obj;
            this.f31968x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return z.this.c(this);
        }
    }

    @Nullable
    public final Object a(@NotNull mt.b<? super Unit> bVar) {
        Object w5 = this.didRun.w(bVar);
        return w5 == nt.c.e() ? w5 : Unit.f22894a;
    }

    @Nullable
    public abstract Object b(@NotNull mt.b<? super Unit> bVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof t3.z.a
            if (r0 == 0) goto L13
            r0 = r7
            t3.z$a r0 = (t3.z.a) r0
            int r1 = r0.f31968x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31968x = r1
            goto L18
        L13:
            t3.z$a r0 = new t3.z$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31966v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31968x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f31965u
            tu.a r1 = (tu.a) r1
            java.lang.Object r0 = r0.f31964t
            t3.z r0 = (t3.z) r0
            gt.o.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f31965u
            tu.a r2 = (tu.a) r2
            java.lang.Object r4 = r0.f31964t
            t3.z r4 = (t3.z) r4
            gt.o.b(r7)
            r7 = r2
            goto L6a
        L4c:
            gt.o.b(r7)
            ju.x<kotlin.Unit> r7 = r6.didRun
            boolean r7 = r7.d()
            if (r7 == 0) goto L5a
            kotlin.Unit r7 = kotlin.Unit.f22894a
            return r7
        L5a:
            tu.a r7 = r6.runMutex
            r0.f31964t = r6
            r0.f31965u = r7
            r0.f31968x = r4
            java.lang.Object r2 = r7.c(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            ju.x<kotlin.Unit> r2 = r4.didRun     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            kotlin.Unit r0 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L78
            r7.f(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f31964t = r4     // Catch: java.lang.Throwable -> L78
            r0.f31965u = r7     // Catch: java.lang.Throwable -> L78
            r0.f31968x = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            ju.x<kotlin.Unit> r7 = r0.didRun     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r0 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L35
            r7.r(r0)     // Catch: java.lang.Throwable -> L35
            r1.f(r5)
            return r0
        L96:
            r1.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.z.c(mt.b):java.lang.Object");
    }
}
