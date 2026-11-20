package ib;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f20368a;

    public /* synthetic */ m(o oVar, n nVar) {
        Objects.requireNonNull(oVar);
        this.f20368a = oVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar;
        o oVar = this.f20368a;
        dVar = oVar.b;
        dVar.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        oVar.c().post(new k(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar;
        o oVar = this.f20368a;
        dVar = oVar.b;
        dVar.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        oVar.c().post(new l(this));
    }
}
