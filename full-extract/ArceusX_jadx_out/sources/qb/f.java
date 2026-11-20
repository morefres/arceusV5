package qb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.zai;

/* loaded from: classes.dex */
public final class f extends bb.a implements IInterface {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void u2(zai zaiVar, e eVar) {
        Parcel r22 = r2();
        bb.c.c(r22, zaiVar);
        bb.c.d(r22, eVar);
        s2(12, r22);
    }
}
