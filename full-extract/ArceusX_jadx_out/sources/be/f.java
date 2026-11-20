package be;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class f implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f3957a;

    public /* synthetic */ f(g gVar, e eVar) {
        this.f3957a = gVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q1 q1Var;
        q1Var = this.f3957a.b;
        q1Var.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        g gVar = this.f3957a;
        gVar.c().post(new c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        q1 q1Var;
        q1Var = this.f3957a.b;
        q1Var.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        g gVar = this.f3957a;
        gVar.c().post(new d(this));
    }
}
