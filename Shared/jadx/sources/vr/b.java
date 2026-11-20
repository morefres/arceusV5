package vr;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ur.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvr/b;", "Lzr/a;", "Lqs/a;", "<init>", "()V", "", "expression", "data", "Lur/l;", "evaluator", "j", "(Ljava/lang/Object;Ljava/lang/Object;Lur/l;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements zr.a, qs.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f33521a = new b();

    @Override // qs.a
    @Nullable
    public List<Object> h(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.h(list, obj, lVar);
    }

    @Override // zr.a
    @Nullable
    public Object j(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> c10 = rs.a.c(expression);
        List<Object> h10 = f33521a.h(c10, data, evaluator);
        Map<String, ? extends Object> a10 = rs.c.a(c10);
        if (a10 != null && h10 != null) {
            for (Object obj : h10) {
                if (Intrinsics.c(evaluator.a(a10, obj), Boolean.TRUE)) {
                    return obj;
                }
            }
        }
        return null;
    }
}
