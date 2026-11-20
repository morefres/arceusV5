package ee;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15977a;

    public /* synthetic */ e(f fVar, d dVar) {
        this.f15977a = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t0 t0Var;
        t0Var = this.f15977a.b;
        t0Var.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f15977a.c().post(new b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        t0 t0Var;
        t0Var = this.f15977a.b;
        t0Var.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f15977a.c().post(new c(this));
    }
}
