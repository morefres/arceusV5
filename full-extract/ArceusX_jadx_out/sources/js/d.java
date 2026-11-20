package js;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J7\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ljs/d;", "", "expression", "Lkotlin/Function1;", "", "", "operation", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Double;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {
    @Nullable
    default Double c(@Nullable Object expression, @NotNull Function1<? super List<Double>, Double> operation) {
        List a02;
        Intrinsics.checkNotNullParameter(operation, "operation");
        List<Double> b = expression != null ? rs.a.b(expression) : null;
        List a03 = b != null ? CollectionsKt.a0(b) : null;
        if (!Intrinsics.c(a03 != null ? Integer.valueOf(a03.size()) : null, b != null ? Integer.valueOf(b.size()) : null) || b == null || (a02 = CollectionsKt.a0(b)) == null) {
            return null;
        }
        return operation.invoke(a02);
    }
}
