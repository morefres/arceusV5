package za;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import l9.n;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class i extends n9.e {
    public i(Context context, Looper looper, n9.d dVar, l9.e eVar, n nVar) {
        super(context, looper, WebSocketProtocol.PAYLOAD_SHORT, dVar, eVar, nVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return c.f37967e;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return j9.h.f21609a;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
