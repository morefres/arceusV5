package z9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import db.o;
import y9.a;

/* loaded from: classes.dex */
public final class i extends db.a implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final y9.a t2(y9.a aVar, String str, int i10, y9.a aVar2) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(i10);
        o.d(s22, aVar2);
        Parcel r22 = r2(2, s22);
        y9.a s23 = a.AbstractBinderC0675a.s2(r22.readStrongBinder());
        r22.recycle();
        return s23;
    }

    public final y9.a u2(y9.a aVar, String str, int i10, y9.a aVar2) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(i10);
        o.d(s22, aVar2);
        Parcel r22 = r2(3, s22);
        y9.a s23 = a.AbstractBinderC0675a.s2(r22.readStrongBinder());
        r22.recycle();
        return s23;
    }
}
