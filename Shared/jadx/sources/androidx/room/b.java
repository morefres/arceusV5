package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3119k = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        public static class C0055a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f3120a;

            public C0055a(IBinder iBinder) {
                this.f3120a = iBinder;
            }

            @Override // androidx.room.b
            public void B0(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3119k);
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f3120a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.b
            public int Y0(androidx.room.a aVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3119k);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    this.f3120a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3120a;
            }

            @Override // androidx.room.b
            public void n2(androidx.room.a aVar, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3119k);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeInt(i10);
                    this.f3120a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.f3119k);
        }

        public static b r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f3119k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0055a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = b.f3119k;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int Y0 = Y0(a.AbstractBinderC0053a.r2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Y0);
            } else if (i10 == 2) {
                n2(a.AbstractBinderC0053a.r2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                B0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void B0(int i10, String[] strArr);

    int Y0(androidx.room.a aVar, String str);

    void n2(androidx.room.a aVar, int i10);
}
