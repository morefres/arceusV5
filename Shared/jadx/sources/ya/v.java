package ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import k9.f;

/* loaded from: classes.dex */
public final class v extends n9.e {

    /* renamed from: e, reason: collision with root package name */
    public final y8.g f36576e;

    public v(Context context, Looper looper, n9.d dVar, y8.g gVar, f.a aVar, f.b bVar) {
        super(context, looper, 68, dVar, aVar, bVar);
        y8.f fVar = new y8.f(gVar == null ? y8.g.f36542d : gVar);
        fVar.a(r.a());
        this.f36576e = new y8.g(fVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new w(iBinder);
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f36576e.a();
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
