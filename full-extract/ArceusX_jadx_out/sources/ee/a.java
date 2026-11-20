package ee;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f15974a;
    public final String b;

    public a(IBinder iBinder, String str) {
        this.f15974a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15974a;
    }

    public final Parcel r2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final void s2(int i10, Parcel parcel) {
        try {
            this.f15974a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
