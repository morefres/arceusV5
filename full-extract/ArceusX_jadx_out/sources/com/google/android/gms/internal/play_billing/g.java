package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class g implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f7098a;
    public final String b;

    public g(IBinder iBinder, String str) {
        this.f7098a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7098a;
    }

    public final Parcel r2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final Parcel s2(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f7098a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void t2(int i10, Parcel parcel) {
        try {
            this.f7098a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
