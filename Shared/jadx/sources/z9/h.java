package z9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import db.o;
import y9.a;

/* loaded from: classes.dex */
public final class h extends db.a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final y9.a t2(y9.a aVar, String str, int i10) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(i10);
        Parcel r22 = r2(2, s22);
        y9.a s23 = a.AbstractBinderC0675a.s2(r22.readStrongBinder());
        r22.recycle();
        return s23;
    }

    public final int u2(y9.a aVar, String str, boolean z10) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(z10 ? 1 : 0);
        Parcel r22 = r2(3, s22);
        int readInt = r22.readInt();
        r22.recycle();
        return readInt;
    }

    public final y9.a v2(y9.a aVar, String str, int i10) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(i10);
        Parcel r22 = r2(4, s22);
        y9.a s23 = a.AbstractBinderC0675a.s2(r22.readStrongBinder());
        r22.recycle();
        return s23;
    }

    public final int w2(y9.a aVar, String str, boolean z10) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(z10 ? 1 : 0);
        Parcel r22 = r2(5, s22);
        int readInt = r22.readInt();
        r22.recycle();
        return readInt;
    }

    public final int x2() {
        Parcel r22 = r2(6, s2());
        int readInt = r22.readInt();
        r22.recycle();
        return readInt;
    }

    public final y9.a y2(y9.a aVar, String str, boolean z10, long j10) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(z10 ? 1 : 0);
        s22.writeLong(j10);
        Parcel r22 = r2(7, s22);
        y9.a s23 = a.AbstractBinderC0675a.s2(r22.readStrongBinder());
        r22.recycle();
        return s23;
    }

    public final y9.a z2(y9.a aVar, String str, int i10, y9.a aVar2) {
        Parcel s22 = s2();
        o.d(s22, aVar);
        s22.writeString(str);
        s22.writeInt(i10);
        o.d(s22, aVar2);
        Parcel r22 = r2(8, s22);
        y9.a s23 = a.AbstractBinderC0675a.s2(r22.readStrongBinder());
        r22.recycle();
        return s23;
    }
}
