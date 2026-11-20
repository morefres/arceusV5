package hb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import k9.f;
import lb.a0;

/* loaded from: classes.dex */
public class v extends n9.e<f> {

    /* renamed from: e, reason: collision with root package name */
    public final String f19200e;

    /* renamed from: f, reason: collision with root package name */
    public final r<f> f19201f;

    public v(Context context, Looper looper, f.a aVar, f.b bVar, String str, n9.d dVar) {
        super(context, looper, 23, dVar, aVar, bVar);
        this.f19201f = new u(this);
        this.f19200e = str;
    }

    @Override // n9.c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new e(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return a0.f23409f;
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f19200e);
        return bundle;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
