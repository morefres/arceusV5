package is;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.w;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lis/c;", "", "value", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "o", "g", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {
    default Object g(Object value) {
        String obj;
        Object intOrNull;
        Object obj2 = null;
        String str = value instanceof String ? (String) value : null;
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            obj2 = intOrNull;
        } else if (str != null) {
            obj2 = w.r(str);
        }
        return (obj2 == null || (obj = obj2.toString()) == null) ? value : obj;
    }

    @Nullable
    default Object k(@Nullable Object value) {
        Object o8 = o(value);
        return !Intrinsics.c(o8, value) ? new SingleNestedValue(g(o8)) : g(value);
    }

    default Object o(Object obj) {
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        return list.size() == 1 ? o(CollectionsKt.firstOrNull(list)) : obj;
    }
}
