package mu;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lmu/h;", "", "destination", "", j6.b.f21518e, "(Lmu/h;Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "", "C", ve.a.f33391e, "(Lmu/h;Ljava/util/Collection;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {MotionEventCompat.AXIS_GAS}, m = "toCollection")
    public static final class a<T, C extends Collection<? super T>> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25100t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25101u;

        /* renamed from: v, reason: collision with root package name */
        public int f25102v;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25101u = obj;
            this.f25102v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return j.P(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f25103a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.f25103a = collection;
        }

        @Override // mu.i
        public final Object emit(T t8, mt.b<? super Unit> bVar) {
            this.f25103a.add(t8);
            return Unit.f22894a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@org.jetbrains.annotations.NotNull mu.h<? extends T> r4, @org.jetbrains.annotations.NotNull C r5, @org.jetbrains.annotations.NotNull mt.b<? super C> r6) {
        /*
            boolean r0 = r6 instanceof mu.n.a
            if (r0 == 0) goto L13
            r0 = r6
            mu.n$a r0 = (mu.n.a) r0
            int r1 = r0.f25102v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25102v = r1
            goto L18
        L13:
            mu.n$a r0 = new mu.n$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25101u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25102v
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f25100t
            java.util.Collection r4 = (java.util.Collection) r4
            gt.o.b(r6)
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            gt.o.b(r6)
            mu.n$b r6 = new mu.n$b
            r6.<init>(r5)
            r0.f25100t = r5
            r0.f25102v = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.n.a(mu.h, java.util.Collection, mt.b):java.lang.Object");
    }

    @Nullable
    public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull List<T> list, @NotNull mt.b<? super List<? extends T>> bVar) {
        return j.P(hVar, list, bVar);
    }

    public static /* synthetic */ Object c(h hVar, List list, mt.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return j.Q(hVar, list, bVar);
    }
}
