package e7;

import android.view.InterfaceC0703r;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.n;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/l;", "", ve.a.f33391e, "(Landroidx/lifecycle/l;Lmt/b;)Ljava/lang/Object;", "Landroidx/lifecycle/r;", "observer", j6.b.f21518e, "(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {MotionEventCompat.AXIS_GENERIC_11}, m = "awaitStarted")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f15721t;

        /* renamed from: u, reason: collision with root package name */
        public Object f15722u;

        /* renamed from: v, reason: collision with root package name */
        public int f15723v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f15724w;

        /* renamed from: x, reason: collision with root package name */
        public int f15725x;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15724w = obj;
            this.f15725x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return s.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"e7/s$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements android.view.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ju.n<Unit> f15726a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ju.n<? super Unit> nVar) {
            this.f15726a = nVar;
        }

        @Override // android.view.f
        public void onStart(android.view.s owner) {
            ju.n<Unit> nVar = this.f15726a;
            n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(Unit.f22894a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, e7.s$b, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull android.view.l r6, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof e7.s.a
            if (r0 == 0) goto L13
            r0 = r7
            e7.s$a r0 = (e7.s.a) r0
            int r1 = r0.f15725x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15725x = r1
            goto L18
        L13:
            e7.s$a r0 = new e7.s$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15724w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f15725x
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f15722u
            kotlin.jvm.internal.c0 r6 = (kotlin.jvm.internal.c0) r6
            java.lang.Object r0 = r0.f15721t
            androidx.lifecycle.l r0 = (android.view.l) r0
            gt.o.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L8f
        L31:
            r7 = move-exception
            goto L9b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            gt.o.b(r7)
            androidx.lifecycle.l$b r7 = r6.getState()
            androidx.lifecycle.l$b r2 = androidx.lifecycle.l.b.f2629d
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L4d
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L4d:
            kotlin.jvm.internal.c0 r7 = new kotlin.jvm.internal.c0
            r7.<init>()
            r0.f15721t = r6     // Catch: java.lang.Throwable -> L84
            r0.f15722u = r7     // Catch: java.lang.Throwable -> L84
            r2 = 0
            r0.f15723v = r2     // Catch: java.lang.Throwable -> L84
            r0.f15725x = r3     // Catch: java.lang.Throwable -> L84
            ju.p r2 = new ju.p     // Catch: java.lang.Throwable -> L84
            mt.b r4 = nt.b.c(r0)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L84
            r2.F()     // Catch: java.lang.Throwable -> L84
            e7.s$b r3 = new e7.s$b     // Catch: java.lang.Throwable -> L84
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L84
            r7.f22963a = r3     // Catch: java.lang.Throwable -> L84
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L84
            androidx.lifecycle.r r3 = (android.view.InterfaceC0703r) r3     // Catch: java.lang.Throwable -> L84
            r6.a(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r2.z()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = nt.c.e()     // Catch: java.lang.Throwable -> L84
            if (r2 != r3) goto L8a
            ot.h.c(r0)     // Catch: java.lang.Throwable -> L84
            goto L8a
        L84:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L9b
        L8a:
            if (r2 != r1) goto L8d
            return r1
        L8d:
            r0 = r6
            r6 = r7
        L8f:
            T r6 = r6.f22963a
            androidx.lifecycle.r r6 = (android.view.InterfaceC0703r) r6
            if (r6 == 0) goto L98
            r0.d(r6)
        L98:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L9b:
            T r6 = r6.f22963a
            androidx.lifecycle.r r6 = (android.view.InterfaceC0703r) r6
            if (r6 == 0) goto La4
            r0.d(r6)
        La4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.s.a(androidx.lifecycle.l, mt.b):java.lang.Object");
    }

    public static final void b(@NotNull android.view.l lVar, @NotNull InterfaceC0703r interfaceC0703r) {
        lVar.d(interfaceC0703r);
        lVar.a(interfaceC0703r);
    }
}
