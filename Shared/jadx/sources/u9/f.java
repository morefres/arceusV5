package u9;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    @NonNull
    @Deprecated
    public static <T> List<T> a(@NonNull T t8) {
        return Collections.singletonList(t8);
    }

    @NonNull
    @Deprecated
    public static <T> List<T> b(@NonNull T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.EMPTY_LIST;
    }
}
