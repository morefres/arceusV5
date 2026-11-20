package ua;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // ua.f
    public final boolean B(boolean z10) {
        Parcel r22 = r2();
        c.a(r22, true);
        Parcel s22 = s2(2, r22);
        boolean b = c.b(s22);
        s22.recycle();
        return b;
    }

    @Override // ua.f
    public final String zzc() {
        Parcel s22 = s2(1, r2());
        String readString = s22.readString();
        s22.recycle();
        return readString;
    }
}
