package i9;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f20357a;
    public final sb.k b = new sb.k();

    /* renamed from: c, reason: collision with root package name */
    public final int f20358c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f20359d;

    public y(int i10, int i11, Bundle bundle) {
        this.f20357a = i10;
        this.f20358c = i11;
        this.f20359d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(z zVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zVar.toString());
        }
        this.b.b(zVar);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f20358c + " id=" + this.f20357a + " oneWay=" + b() + "}";
    }
}
