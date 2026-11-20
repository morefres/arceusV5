package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: m, reason: collision with root package name */
    public static final String f4442m = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        /* renamed from: c.b$a$a, reason: collision with other inner class name */
        public static class C0093a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f4443a;

            public C0093a(IBinder iBinder) {
                this.f4443a = iBinder;
            }

            @Override // c.b
            public boolean J(c.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4442m);
                    obtain.writeStrongInterface(aVar);
                    this.f4443a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4443a;
            }

            @Override // c.b
            public boolean h1(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4442m);
                    obtain.writeLong(j10);
                    this.f4443a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // c.b
            public boolean j1(c.a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4442m);
                    obtain.writeStrongInterface(aVar);
                    C0094b.b(obtain, uri, 0);
                    this.f4443a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // c.b
            public boolean l2(c.a aVar, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4442m);
                    obtain.writeStrongInterface(aVar);
                    C0094b.b(obtain, uri, 0);
                    C0094b.b(obtain, bundle, 0);
                    this.f4443a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // c.b
            public boolean m(c.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4442m);
                    obtain.writeStrongInterface(aVar);
                    C0094b.b(obtain, bundle, 0);
                    this.f4443a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // c.b
            public int w0(c.a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4442m);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    C0094b.b(obtain, bundle, 0);
                    this.f4443a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f4442m);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0093a(iBinder) : (b) queryLocalInterface;
        }
    }

    /* renamed from: c.b$b, reason: collision with other inner class name */
    public static class C0094b {
        public static <T extends Parcelable> void b(Parcel parcel, T t8, int i10) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i10);
            }
        }
    }

    boolean J(c.a aVar);

    boolean h1(long j10);

    boolean j1(c.a aVar, Uri uri);

    boolean l2(c.a aVar, Uri uri, Bundle bundle);

    boolean m(c.a aVar, Bundle bundle);

    int w0(c.a aVar, String str, Bundle bundle);
}
