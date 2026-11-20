package c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf5/b;", "connection", "", ve.a.f33391e, "(Lf5/b;)J", "", j6.b.f21518e, "(Lf5/b;)I", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    public static final long a(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (b(connection) == 0) {
            return -1L;
        }
        f5.d r32 = connection.r3("SELECT last_insert_rowid()");
        try {
            r32.i3();
            long j10 = r32.getLong(0);
            wt.a.a(r32, null);
            return j10;
        } finally {
        }
    }

    public static final int b(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        f5.d r32 = connection.r3("SELECT changes()");
        try {
            r32.i3();
            int i10 = (int) r32.getLong(0);
            wt.a.a(r32, null);
            return i10;
        } finally {
        }
    }
}
