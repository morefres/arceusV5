package gs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J3\u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lgs/c;", "Las/c;", "Lis/a;", "Lis/c;", "", "values", "Lkotlin/Function2;", "", "", "operator", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Z", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c extends as.c, is.a, is.c {
    default boolean c(@Nullable Object values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        List<Object> c10 = rs.a.c(values);
        Object k10 = k(CollectionsKt.firstOrNull(c10));
        Object k11 = k(rs.c.b(c10));
        d dVar = d.f18820a;
        List<Object> a10 = dVar.a(k10);
        List<Object> a11 = dVar.a(k11);
        if (a10 != null || a11 != null) {
            if (a10 != null ? a10.contains(k11) : false) {
                return true;
            }
            return a11 != null ? a11.contains(k10) : false;
        }
        List<Object> list = c10;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return e(arrayList, operator);
    }
}
