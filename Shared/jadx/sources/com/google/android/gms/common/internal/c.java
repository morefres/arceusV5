package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import db.o;

/* loaded from: classes.dex */
public final class c extends db.a implements b {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account zzb() {
        Parcel r22 = r2(2, s2());
        Account account = (Account) o.b(r22, Account.CREATOR);
        r22.recycle();
        return account;
    }
}
