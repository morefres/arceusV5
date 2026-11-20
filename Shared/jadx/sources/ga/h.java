package ga;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import fb.k0;

/* loaded from: classes.dex */
public final class h extends fb.a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void t2(g gVar, long j10) {
        Parcel r22 = r2();
        k0.d(r22, gVar);
        r22.writeLong(j10);
        s2(15501, r22);
    }

    public final void u2(long j10) {
        Parcel r22 = r2();
        r22.writeLong(j10);
        s2(5001, r22);
    }

    public final void v2(e eVar) {
        Parcel r22 = r2();
        k0.d(r22, eVar);
        s2(5002, r22);
    }

    public final void w2(IBinder iBinder, Bundle bundle) {
        Parcel r22 = r2();
        r22.writeStrongBinder(iBinder);
        k0.c(r22, bundle);
        s2(5005, r22);
    }

    public final void x2() {
        s2(5006, r2());
    }

    public final void y2(e eVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel r22 = r2();
        k0.d(r22, eVar);
        r22.writeString(str);
        r22.writeStrongBinder(iBinder);
        k0.c(r22, bundle);
        s2(5024, r22);
    }

    public final void z2(e eVar, boolean z10) {
        Parcel r22 = r2();
        k0.d(r22, eVar);
        r22.writeInt(z10 ? 1 : 0);
        s2(6001, r22);
    }
}
