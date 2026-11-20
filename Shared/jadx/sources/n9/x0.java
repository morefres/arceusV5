package n9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f26008a;
    public final /* synthetic */ c b;

    public x0(c cVar, int i10) {
        Objects.requireNonNull(cVar);
        this.b = cVar;
        this.f26008a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.b;
        if (iBinder == null) {
            cVar.zzf(16);
            return;
        }
        synchronized (cVar.zzh()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar.zzi((queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new m0(iBinder) : (i) queryLocalInterface);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.zzb(0, null, this.f26008a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c cVar = this.b;
        synchronized (cVar.zzh()) {
            cVar.zzi(null);
        }
        c cVar2 = this.b;
        int i10 = this.f26008a;
        Handler handler = cVar2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
