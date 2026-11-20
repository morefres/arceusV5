package ka;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.games.internal.v2.appshortcuts.zzi;
import com.google.android.gms.games.internal.v2.appshortcuts.zzr;
import fb.k0;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends fb.a implements IInterface {
    public r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
    }

    public final void t2(t tVar, zzr zzrVar, List list, List list2) {
        Parcel r22 = r2();
        k0.d(r22, tVar);
        k0.c(r22, zzrVar);
        r22.writeTypedList(list);
        r22.writeTypedList(list2);
        s2(3, r22);
    }

    public final void u2(t tVar, zzr zzrVar, zzi zziVar) {
        Parcel r22 = r2();
        k0.d(r22, tVar);
        k0.c(r22, zzrVar);
        k0.c(r22, zziVar);
        s2(4, r22);
    }
}
