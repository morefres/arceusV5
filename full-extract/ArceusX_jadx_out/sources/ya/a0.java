package ya;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* loaded from: classes.dex */
public final class a0 extends a implements IInterface {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void t2(g0 g0Var, SavePasswordRequest savePasswordRequest) {
        Parcel r22 = r2();
        t.d(r22, g0Var);
        t.c(r22, savePasswordRequest);
        s2(2, r22);
    }
}
