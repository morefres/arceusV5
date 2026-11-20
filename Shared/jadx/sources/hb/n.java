package hb;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import k9.f;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: g, reason: collision with root package name */
    public final m f19197g;

    public n(Context context, Looper looper, f.a aVar, f.b bVar, String str, n9.d dVar) {
        super(context, looper, aVar, bVar, str, dVar);
        this.f19197g = new m(context, this.f19201f);
    }

    @Override // n9.c, k9.a.f
    public final void disconnect() {
        synchronized (this.f19197g) {
            if (isConnected()) {
                try {
                    this.f19197g.b();
                    this.f19197g.c();
                } catch (Exception e10) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e10);
                }
            }
            super.disconnect();
        }
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
