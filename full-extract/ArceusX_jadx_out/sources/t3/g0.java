package t3;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lt3/f0;", ve.a.f33391e, "(Lt3/f0;Lmt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lt3/y;", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    public static final class a<T> extends ot.m implements yt.n<y<T>, Boolean, mt.b<? super T>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31753t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31754u;

        public a(mt.b<? super a> bVar) {
            super(3, bVar);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return o((y) obj, bool.booleanValue(), (mt.b) obj2);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31753t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            y yVar = (y) this.f31754u;
            this.f31753t = 1;
            Object a10 = yVar.a(this);
            return a10 == e10 ? e10 : a10;
        }

        @Nullable
        public final Object o(@NotNull y<T> yVar, boolean z10, @Nullable mt.b<? super T> bVar) {
            a aVar = new a(bVar);
            aVar.f31754u = yVar;
            return aVar.invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> Object a(@NotNull f0<T> f0Var, @NotNull mt.b<? super T> bVar) {
        return f0Var.b(new a(null), bVar);
    }
}
