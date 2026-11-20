package be;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class l0 extends h1 implements m0 {
    public l0() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // be.h1
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                k0(readInt, bundle);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                Z(readInt2, bundle2);
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                i(readInt3, bundle3);
                return true;
            case 5:
                int readInt4 = parcel.readInt();
                Bundle bundle4 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                v0(readInt4, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                h0(bundle5);
                return true;
            case 7:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                i1.b(parcel);
                r(createTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                R0(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                t1(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                b0(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                q0(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                d1(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) i1.a(parcel, Bundle.CREATOR);
                i1.b(parcel);
                j(bundle11);
                return true;
            default:
                return false;
        }
    }
}
