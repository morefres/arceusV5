package eb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import k9.f;

/* loaded from: classes.dex */
public final class d extends n9.e {
    public d(Context context, Looper looper, n9.d dVar, f.a aVar, f.b bVar) {
        super(context, looper, 119, dVar, aVar, bVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return queryLocalInterface instanceof x4 ? (x4) queryLocalInterface : new x4(iBinder);
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
