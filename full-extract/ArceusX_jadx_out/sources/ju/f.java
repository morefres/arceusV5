package ju;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0086@¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"T", "", "Lju/w0;", "", ve.a.f33391e, "(Ljava/util/Collection;Lmt/b;)Ljava/lang/Object;", "Lju/d2;", "", j6.b.f21518e, "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f22076t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22077u;

        /* renamed from: v, reason: collision with root package name */
        public int f22078v;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22077u = obj;
            this.f22078v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return f.b(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends w0<? extends T>> collection, @NotNull mt.b<? super List<? extends T>> bVar) {
        return collection.isEmpty() ? kotlin.collections.p.k() : new e((w0[]) collection.toArray(new w0[0])).c(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.Collection<? extends ju.d2> r4, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r5) {
        /*
            boolean r0 = r5 instanceof ju.f.a
            if (r0 == 0) goto L13
            r0 = r5
            ju.f$a r0 = (ju.f.a) r0
            int r1 = r0.f22078v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22078v = r1
            goto L18
        L13:
            ju.f$a r0 = new ju.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f22077u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22078v
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f22076t
            java.util.Iterator r4 = (java.util.Iterator) r4
            gt.o.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            gt.o.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            ju.d2 r5 = (ju.d2) r5
            r0.f22076t = r4
            r0.f22078v = r3
            java.lang.Object r5 = r5.j(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            kotlin.Unit r4 = kotlin.Unit.f22894a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ju.f.b(java.util.Collection, mt.b):java.lang.Object");
    }
}
