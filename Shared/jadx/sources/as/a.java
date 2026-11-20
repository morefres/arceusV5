package as;

import kotlin.Metadata;
import kotlin.text.w;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Las/a;", "", "wrappedValue", "", j6.b.f21518e, "(Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    @Nullable
    default Boolean b(@Nullable Object wrappedValue) {
        Double r8;
        if (wrappedValue instanceof Boolean) {
            return (Boolean) wrappedValue;
        }
        if (wrappedValue instanceof Number) {
            return Boolean.valueOf(((Number) wrappedValue).longValue() > 0);
        }
        if (!(wrappedValue instanceof String) || (r8 = w.r((String) wrappedValue)) == null) {
            return null;
        }
        return Boolean.valueOf(((long) r8.doubleValue()) > 0);
    }
}
