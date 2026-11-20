package ya;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* loaded from: classes.dex */
public final class h0 extends a implements IInterface {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void t2(z zVar, BeginSignInRequest beginSignInRequest) {
        Parcel r22 = r2();
        t.d(r22, zVar);
        t.c(r22, beginSignInRequest);
        s2(1, r22);
    }

    public final void u2(c0 c0Var, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) {
        Parcel r22 = r2();
        t.d(r22, c0Var);
        t.c(r22, getPhoneNumberHintIntentRequest);
        r22.writeString(str);
        s2(4, r22);
    }

    public final void v2(e0 e0Var, GetSignInIntentRequest getSignInIntentRequest) {
        Parcel r22 = r2();
        t.d(r22, e0Var);
        t.c(r22, getSignInIntentRequest);
        s2(3, r22);
    }

    public final void w2(l9.g gVar, String str) {
        Parcel r22 = r2();
        t.d(r22, gVar);
        r22.writeString(str);
        s2(2, r22);
    }
}
