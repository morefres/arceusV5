package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import okhttp3.internal.http.HttpStatusCodesKt;

/* loaded from: classes.dex */
public final class t extends ya.a implements IInterface {
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void t2(s sVar, GoogleSignInOptions googleSignInOptions) {
        Parcel r22 = r2();
        ya.t.d(r22, sVar);
        ya.t.c(r22, googleSignInOptions);
        s2(HttpStatusCodesKt.HTTP_EARLY_HINTS, r22);
    }

    public final void u2(s sVar, GoogleSignInOptions googleSignInOptions) {
        Parcel r22 = r2();
        ya.t.d(r22, sVar);
        ya.t.c(r22, googleSignInOptions);
        s2(102, r22);
    }
}
