package c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lf5/d;", "", "name", "", ve.a.f33391e, "(Lf5/d;Ljava/lang/String;)I", j6.b.f21518e, "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
/* loaded from: classes.dex */
public final /* synthetic */ class l {
    public static final int a(@NotNull f5.d dVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int b = j.b(dVar, name);
        if (b >= 0) {
            return b;
        }
        int b10 = j.b(dVar, '`' + name + '`');
        return b10 >= 0 ? b10 : b(dVar, name);
    }

    public static final int b(f5.d dVar, String str) {
        return -1;
    }
}
