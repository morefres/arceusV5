package x4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx4/m;", "", "sql", "", j6.b.f21518e, "(Lx4/m;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {
    @Nullable
    public static final Object b(@NotNull m mVar, @NotNull String str, @NotNull mt.b<? super Unit> bVar) {
        Object c10 = mVar.c(str, new Function1() { // from class: x4.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean c11;
                c11 = i0.c((f5.d) obj);
                return Boolean.valueOf(c11);
            }
        }, bVar);
        return c10 == nt.c.e() ? c10 : Unit.f22894a;
    }

    public static final boolean c(f5.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.i3();
    }
}
