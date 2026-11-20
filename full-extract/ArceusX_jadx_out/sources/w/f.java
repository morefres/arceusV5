package w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33601a = new Object();
    public final c.b b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f33602c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f33603d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f33604e;

    public f(c.b bVar, c.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = bVar;
        this.f33602c = aVar;
        this.f33603d = componentName;
        this.f33604e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f33604e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public final Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f33604e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder d() {
        return this.f33602c.asBinder();
    }

    public ComponentName e() {
        return this.f33603d;
    }

    public PendingIntent f() {
        return this.f33604e;
    }

    public int g(String str, Bundle bundle) {
        int w02;
        Bundle b = b(bundle);
        synchronized (this.f33601a) {
            try {
                try {
                    w02 = this.b.w0(this.f33602c, str, b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w02;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle c10 = c(uri2);
            if (c10 == null) {
                return this.b.j1(this.f33602c, uri);
            }
            bundle.putAll(c10);
            return this.b.l2(this.f33602c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
