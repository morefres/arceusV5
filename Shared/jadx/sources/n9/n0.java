package n9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;

/* loaded from: classes.dex */
public final class n0 extends db.a implements p0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // n9.p0
    public final zzr H1(zzp zzpVar) {
        Parcel s22 = s2();
        db.o.c(s22, zzpVar);
        Parcel r22 = r2(6, s22);
        zzr zzrVar = (zzr) db.o.b(r22, zzr.CREATOR);
        r22.recycle();
        return zzrVar;
    }

    @Override // n9.p0
    public final boolean L(zzt zztVar, y9.a aVar) {
        Parcel s22 = s2();
        db.o.c(s22, zztVar);
        db.o.d(s22, aVar);
        Parcel r22 = r2(5, s22);
        boolean a10 = db.o.a(r22);
        r22.recycle();
        return a10;
    }

    @Override // n9.p0
    public final boolean c() {
        Parcel r22 = r2(7, s2());
        boolean a10 = db.o.a(r22);
        r22.recycle();
        return a10;
    }

    @Override // n9.p0
    public final zzr d2(zzp zzpVar) {
        Parcel s22 = s2();
        db.o.c(s22, zzpVar);
        Parcel r22 = r2(8, s22);
        zzr zzrVar = (zzr) db.o.b(r22, zzr.CREATOR);
        r22.recycle();
        return zzrVar;
    }
}
