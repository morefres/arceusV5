package wl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import ek.s;
import java.lang.ref.WeakReference;
import java.util.Optional;
import km.i;
import km.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final MessageBus f34354a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public volatile b f34355c = new b();

    /* renamed from: d, reason: collision with root package name */
    public Optional<C0638c> f34356d = Optional.empty();

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<Context> f34357e = new WeakReference<>(null);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f34358a = new c(MessageBus.f());
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f34359a = 0;
    }

    /* renamed from: wl.c$c, reason: collision with other inner class name */
    public class C0638c extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            c.this.g(1);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            c.this.g(s.b(networkCapabilities) ? 1 : 2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            c.this.g(2);
        }

        public C0638c() {
        }
    }

    public c(MessageBus messageBus) {
        this.f34354a = messageBus;
    }

    public static /* synthetic */ l b(JSONObject jSONObject) {
        l lVar = new l();
        try {
            lVar.f22865a.put("isNetworkStatusAvailable", true);
            return lVar;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on onIsNetworkStatusAvailable: ", e10);
            return lVar;
        }
    }

    public static JSONObject d(b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("networkStatus", bVar.f34359a);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on get network status: ", e10);
            return jSONObject;
        }
    }

    public static void h(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static c i() {
        return a.f34358a;
    }

    public static void l(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public void e() {
        this.f34354a.p("ConnectivityProtocol", "GetNetworkStatus", new i() { // from class: wl.a
            @Override // km.i
            public final l a(JSONObject jSONObject) {
                l f10;
                f10 = c.this.f(jSONObject);
                return f10;
            }
        });
        this.f34354a.p("ConnectivityProtocol", "IsNetworkStatusAvailable", new i() { // from class: wl.b
            @Override // km.i
            public final l a(JSONObject jSONObject) {
                return c.b(jSONObject);
            }
        });
    }

    public final /* synthetic */ l f(JSONObject jSONObject) {
        b bVar;
        synchronized (this.b) {
            try {
                Context context = this.f34357e.get();
                if (this.f34355c.f34359a == 0 && context != null) {
                    this.f34355c.f34359a = s.a(context) ? 1 : 2;
                }
                bVar = this.f34355c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l lVar = new l();
        lVar.f22865a = d(bVar);
        return lVar;
    }

    public final void g(int i10) {
        synchronized (this.b) {
            try {
                if (this.f34355c.f34359a == i10) {
                    return;
                }
                this.f34355c.f34359a = i10;
                b bVar = this.f34355c;
                Log.d("ConnectivityProtocol", "Published network status change with new status: " + bVar.f34359a);
                this.f34354a.l("ConnectivityProtocol.NetworkStatusChanged.Broadcast", d(bVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(Context context) {
        this.f34357e = new WeakReference<>(context);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring");
            g(2);
        } else {
            Optional<C0638c> of2 = Optional.of(new C0638c());
            this.f34356d = of2;
            h(connectivityManager, of2.get());
        }
    }

    public void k(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring clean up");
                synchronized (this.b) {
                    this.f34357e = new WeakReference<>(null);
                    this.f34356d = Optional.empty();
                    this.f34355c = new b();
                }
                return;
            }
            if (this.f34356d.isPresent()) {
                l(connectivityManager, this.f34356d.get());
            }
            synchronized (this.b) {
                this.f34357e = new WeakReference<>(null);
                this.f34356d = Optional.empty();
                this.f34355c = new b();
            }
        } catch (Throwable th2) {
            synchronized (this.b) {
                this.f34357e = new WeakReference<>(null);
                this.f34356d = Optional.empty();
                this.f34355c = new b();
                throw th2;
            }
        }
    }
}
