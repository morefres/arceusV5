package be;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public class g1 implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3974a;
    public final String b = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    public g1(IBinder iBinder, String str) {
        this.f3974a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3974a;
    }

    public final Parcel r2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final void s2(int i10, Parcel parcel) {
        try {
            this.f3974a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
