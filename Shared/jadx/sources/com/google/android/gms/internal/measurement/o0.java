package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class o0 implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f6739a;
    public final String b;

    public o0(IBinder iBinder, String str) {
        this.f6739a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6739a;
    }

    public final Parcel r2(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f6739a.transact(i10, parcel, obtain, 0);
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

    public final Parcel s2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final void t2(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6739a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void u2(int i10, Parcel parcel) {
        try {
            this.f6739a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
