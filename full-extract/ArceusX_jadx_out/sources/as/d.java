package as;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Las/d;", "Lzr/b;", "<init>", "()V", "", "expression", "data", "", ve.a.f33391e, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements zr.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f3620a = new d();

    @Override // zr.b
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean l(@Nullable Object expression, @Nullable Object data) {
        Object firstOrNull = CollectionsKt.firstOrNull(rs.a.c(expression));
        Object b = rs.c.b(rs.a.c(expression));
        return b instanceof String ? Boolean.valueOf(StringsKt.a0((CharSequence) b, String.valueOf(firstOrNull), false, 2, null)) : b instanceof List ? Boolean.valueOf(((List) b).contains(firstOrNull)) : Boolean.FALSE;
    }
}
