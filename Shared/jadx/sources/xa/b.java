package xa;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import j9.h;
import l9.n;
import n9.e;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f35493e;

    public b(Context context, Looper looper, n9.d dVar, y8.c cVar, l9.e eVar, n nVar) {
        super(context, looper, 16, dVar, eVar, nVar);
        this.f35493e = cVar == null ? new Bundle() : cVar.a();
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f35493e;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return h.f21609a;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // n9.c, k9.a.f
    public final boolean requiresSignIn() {
        n9.d d10 = d();
        return (TextUtils.isEmpty(d10.b()) || d10.e(y8.b.f36537a).isEmpty()) ? false : true;
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
