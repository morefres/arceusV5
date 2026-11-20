package hb;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;

/* loaded from: classes.dex */
public final class e extends a implements f {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // hb.f
    public final void U(zzl zzlVar) {
        Parcel r22 = r2();
        t.c(r22, zzlVar);
        s2(75, r22);
    }

    @Override // hb.f
    public final void q2(boolean z10) {
        Parcel r22 = r2();
        t.a(r22, z10);
        s2(12, r22);
    }

    @Override // hb.f
    public final void w(zzbc zzbcVar) {
        Parcel r22 = r2();
        t.c(r22, zzbcVar);
        s2(59, r22);
    }
}
