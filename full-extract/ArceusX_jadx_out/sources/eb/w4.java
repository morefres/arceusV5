package eb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* loaded from: classes.dex */
public final class w4 extends a implements IInterface {
    public w4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t2(v4 v4Var, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        Parcel r22 = r2();
        ClassLoader classLoader = b1.f15771a;
        r22.writeStrongBinder(v4Var);
        b1.c(r22, publicKeyCredentialCreationOptions);
        s2(1, r22);
    }
}
