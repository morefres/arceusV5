package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import q5.a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1593a = (IconCompat) aVar.v(remoteActionCompat.f1593a, 1);
        remoteActionCompat.b = aVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.f1594c = aVar.l(remoteActionCompat.f1594c, 3);
        remoteActionCompat.f1595d = (PendingIntent) aVar.r(remoteActionCompat.f1595d, 4);
        remoteActionCompat.f1596e = aVar.h(remoteActionCompat.f1596e, 5);
        remoteActionCompat.f1597f = aVar.h(remoteActionCompat.f1597f, 6);
        return remoteActionCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.graphics.drawable.IconCompat, q5.c] */
    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1593a, 1);
        aVar.D(remoteActionCompat.b, 2);
        aVar.D(remoteActionCompat.f1594c, 3);
        aVar.H(remoteActionCompat.f1595d, 4);
        aVar.z(remoteActionCompat.f1596e, 5);
        aVar.z(remoteActionCompat.f1597f, 6);
    }
}
