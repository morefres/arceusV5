package wa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f34171a;
    public final String b = "com.google.android.gms.appset.internal.IAppSetService";

    public a(IBinder iBinder, String str) {
        this.f34171a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34171a;
    }

    public final Parcel r2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final void s2(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f34171a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
