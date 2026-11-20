package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lmu/a;", "T", "Lmu/h;", "Lmu/c;", "<init>", "()V", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class a<T> implements h<T>, c<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    /* renamed from: mu.a$a, reason: collision with other inner class name */
    public static final class C0435a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25020t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25021u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a<T> f25022v;

        /* renamed from: w, reason: collision with root package name */
        public int f25023w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0435a(a<T> aVar, mt.b<? super C0435a> bVar) {
            super(bVar);
            this.f25022v = aVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25021u = obj;
            this.f25023w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f25022v.collect(null, this);
        }
    }

    @Nullable
    public abstract Object b(@NotNull i<? super T> iVar, @NotNull mt.b<? super Unit> bVar);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // mu.h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@org.jetbrains.annotations.NotNull mu.i<? super T> r6, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mu.a.C0435a
            if (r0 == 0) goto L13
            r0 = r7
            mu.a$a r0 = (mu.a.C0435a) r0
            int r1 = r0.f25023w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25023w = r1
            goto L18
        L13:
            mu.a$a r0 = new mu.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25021u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25023w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f25020t
            nu.v r6 = (kotlin.v) r6
            gt.o.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            gt.o.b(r7)
            nu.v r7 = new nu.v
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f25020t = r7     // Catch: java.lang.Throwable -> L55
            r0.f25023w = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.a.collect(mu.i, mt.b):java.lang.Object");
    }
}
