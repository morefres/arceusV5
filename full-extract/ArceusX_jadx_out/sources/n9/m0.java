package n9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* loaded from: classes.dex */
public final class m0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f25992a;

    public m0(IBinder iBinder) {
        this.f25992a = iBinder;
    }

    @Override // n9.i
    public final void R(h hVar, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                d1.a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f25992a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25992a;
    }
}
