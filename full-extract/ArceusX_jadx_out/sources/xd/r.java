package xd;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class r implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f35508a;

    public /* synthetic */ r(t tVar, s sVar) {
        this.f35508a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i iVar;
        iVar = this.f35508a.b;
        iVar.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f35508a.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i iVar;
        iVar = this.f35508a.b;
        iVar.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f35508a.c().post(new q(this));
    }
}
