package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import db.n;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends n implements b {
        @NonNull
        public static b s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new c(iBinder);
        }
    }

    @NonNull
    Account zzb();
}
