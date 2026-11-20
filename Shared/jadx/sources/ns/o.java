package ns;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lns/o;", "", "wrappedValue", "", ve.a.f33391e, "(Ljava/lang/Object;)Ljava/lang/String;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface o {
    @Nullable
    default String a(@Nullable Object wrappedValue) {
        List<Object> c10 = rs.a.c(wrappedValue);
        if (c10.size() <= 1) {
            Object firstOrNull = CollectionsKt.firstOrNull(c10);
            if (firstOrNull instanceof String) {
                return (String) firstOrNull;
            }
        }
        return null;
    }
}
