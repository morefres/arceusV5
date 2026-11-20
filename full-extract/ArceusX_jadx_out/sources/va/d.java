package va;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class d {
    public static v8.c a(@NonNull Status status, String str) {
        n9.m.l(status);
        String y32 = status.y3();
        if (true != q.a(y32)) {
            str = y32;
        }
        int x32 = status.x3();
        return x32 != 17510 ? x32 != 17511 ? new v8.c(str) : new v8.e(str) : new v8.d(str);
    }
}
