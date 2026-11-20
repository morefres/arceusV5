package d;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: n, reason: collision with root package name */
    public static final String f14193n = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0276a extends Binder implements a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        public static class C0277a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f14194a;

            public C0277a(IBinder iBinder) {
                this.f14194a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14194a;
            }

            @Override // d.a
            public void i2(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14193n);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f14194a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f14193n);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0277a(iBinder) : (a) queryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t8, int i10) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i10);
            }
        }
    }

    void i2(String str, int i10, String str2, Notification notification);
}
