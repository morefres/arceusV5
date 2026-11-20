package ds;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rs.d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lds/b;", "Lzr/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements zr.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f15388a = new b();

    @Override // zr.b
    @NotNull
    public Object l(@Nullable Object expression, @Nullable Object data) {
        Object firstOrNull;
        String obj;
        boolean z10 = expression instanceof List;
        List list = z10 ? (List) expression : null;
        long c10 = (list == null || (firstOrNull = CollectionsKt.firstOrNull(list)) == null || (obj = firstOrNull.toString()) == null) ? 0L : d.c(obj);
        List list2 = z10 ? (List) expression : null;
        Object b = list2 != null ? rs.c.b(list2) : null;
        List list3 = b instanceof List ? (List) b : null;
        if (list3 == null) {
            list3 = p.k();
        }
        List<Object> l10 = a.f15387a.l(list3, data);
        List<Object> list4 = ((long) (list3.size() - l10.size())) < c10 ? l10 : null;
        return list4 == null ? p.k() : list4;
    }
}
