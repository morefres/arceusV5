package ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class p extends n9.e {

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f36565e;

    public p(Context context, Looper looper, z8.l lVar, n9.d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, 212, dVar, eVar, nVar);
        this.f36565e = new Bundle();
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new h0(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return q.f36573i;
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f36565e;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // n9.c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
