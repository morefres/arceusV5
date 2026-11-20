package n9;

import android.os.IBinder;
import android.os.Parcel;
import y9.a;

/* loaded from: classes.dex */
public final class k1 extends db.a implements m1 {
    public k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // n9.m1
    public final y9.a zzd() {
        Parcel r22 = r2(1, s2());
        y9.a s22 = a.AbstractBinderC0675a.s2(r22.readStrongBinder());
        r22.recycle();
        return s22;
    }

    @Override // n9.m1
    public final int zze() {
        Parcel r22 = r2(2, s2());
        int readInt = r22.readInt();
        r22.recycle();
        return readInt;
    }
}
