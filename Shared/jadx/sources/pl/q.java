package pl;

import android.app.Application;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.provider.Settings;
import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import pl.p;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final NsdManager f28673a;
    public final ConcurrentHashMap<String, NsdServiceInfo> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public p.b f28674c = p.b.INACTIVE;

    /* renamed from: d, reason: collision with root package name */
    public NsdManager.DiscoveryListener f28675d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference<Application> f28676e;

    public class a implements NsdManager.DiscoveryListener {

        /* renamed from: pl.q$a$a, reason: collision with other inner class name */
        public class C0506a implements NsdManager.ResolveListener {
            public C0506a() {
            }

            @Override // android.net.nsd.NsdManager.ResolveListener
            public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i10) {
                Log.e("MagicLoginNsdHelperClient", "Resolve failed: " + i10);
            }

            @Override // android.net.nsd.NsdManager.ResolveListener
            public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
                q.this.e(nsdServiceInfo);
            }
        }

        public a() {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
            q.this.i(p.b.ACTIVE);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            q qVar = q.this;
            if (qVar.f28674c == p.b.ACTIVE) {
                qVar.i(p.b.INACTIVE);
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            if (!nsdServiceInfo.getServiceType().equals("_scpi-raw._tcp.")) {
                Log.i("MagicLoginNsdHelperClient", "onServiceFound, but service type is mismatch (possibly an unrelated device): " + nsdServiceInfo.toString());
                return;
            }
            if (nsdServiceInfo.getServiceName().contains("Roblox-Magic-Login")) {
                q.this.f28673a.resolveService(nsdServiceInfo, new C0506a());
            } else {
                Log.i("MagicLoginNsdHelperClient", "onServiceFound, but service name is mismatch (possibly an unrelated device): " + nsdServiceInfo.toString());
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            q.this.d(nsdServiceInfo);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i10) {
            Log.e("MagicLoginNsdHelperClient", "Fail when StartDiscovery: " + i10);
            q.this.f28673a.stopServiceDiscovery(this);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i10) {
            Log.e("MagicLoginNsdHelperClient", "Fail when StopDiscovery: " + i10);
            q.this.f28673a.stopServiceDiscovery(this);
        }
    }

    public q(Application application) {
        this.f28673a = (NsdManager) application.getSystemService("servicediscovery");
        this.f28676e = new WeakReference<>(application);
    }

    public final void c() {
        this.f28675d = new a();
    }

    public void d(NsdServiceInfo nsdServiceInfo) {
        this.b.remove(nsdServiceInfo.getServiceName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(lm.a.l(), lm.a.h());
            jSONObject.put(lm.a.g(), nsdServiceInfo.getServiceName());
            MessageBus f10 = MessageBus.f();
            if (f10 != null) {
                f10.l(lm.a.m(), jSONObject);
            } else {
                Log.e("MagicLoginNsdHelperClient", "Magic Login could not find message bus on EndpointLost");
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginNsdHelperClient", "JSONException while onServiceLost: " + e10.toString());
        }
    }

    public void e(NsdServiceInfo nsdServiceInfo) {
        this.b.put(nsdServiceInfo.getServiceName(), nsdServiceInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(lm.a.l(), lm.a.f());
            jSONObject.put(lm.a.g(), nsdServiceInfo.getServiceName());
            String i10 = lm.a.i();
            byte[] bArr = nsdServiceInfo.getAttributes().get(lm.a.i());
            Charset charset = StandardCharsets.UTF_8;
            jSONObject.put(i10, new String(bArr, charset));
            jSONObject.put(lm.a.j(), new String(nsdServiceInfo.getAttributes().get(lm.a.j()), charset));
            MessageBus f10 = MessageBus.f();
            if (f10 != null) {
                f10.l(lm.a.m(), jSONObject);
            } else {
                Log.e("MagicLoginNsdHelperClient", "Magic Login could not find message bus on EndpointFound");
            }
        } catch (IllegalArgumentException e10) {
            Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException while sending EndpointFound: " + e10.toString());
        } catch (JSONException e11) {
            Log.e("MagicLoginNsdHelperClient", "JSONException while sending EndpointFound: " + e11.toString());
        }
    }

    public synchronized void f() {
        if (this.f28674c == p.b.ACTIVE) {
            k();
            this.f28674c = p.b.PAUSED;
        }
    }

    public synchronized void g(String str, String str2, String str3) {
        NsdServiceInfo nsdServiceInfo;
        try {
            try {
                nsdServiceInfo = this.b.get(str);
            } catch (IllegalStateException e10) {
                Log.e("MagicLoginNsdHelperClient", "IllegalStateException in requestConnection: " + e10.toString());
            }
        } catch (IllegalArgumentException e11) {
            Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException in requestConnection: " + e11.toString());
        }
        if (nsdServiceInfo == null) {
            Log.e("MagicLoginNsdHelperClient", "Service info not found for endpoint: " + str);
            return;
        }
        int port = nsdServiceInfo.getPort();
        String hostAddress = nsdServiceInfo.getHost().getHostAddress();
        String str4 = "";
        if (this.f28676e.get() != null) {
            str4 = Settings.Secure.getString(this.f28676e.get().getContentResolver(), "bluetooth_name");
        } else {
            Log.e("MagicLoginNsdHelperClient", "weakApplication is null");
        }
        s.a(hostAddress, port, str2, str3, str4);
    }

    public synchronized void h() {
        try {
            if (this.f28674c == p.b.PAUSED) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(lm.a.l(), lm.a.b());
                    MessageBus f10 = MessageBus.f();
                    if (f10 != null) {
                        f10.l(lm.a.m(), jSONObject);
                    } else {
                        Log.e("MagicLoginNsdHelperClient", "Magic Login could not find message bus on clearDeviceList");
                    }
                } catch (JSONException e10) {
                    Log.e("MagicLoginNsdHelperClient", "JSONException while resumeDiscovery: " + e10.toString());
                }
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(p.b bVar) {
        this.f28674c = bVar;
    }

    public synchronized void j() {
        try {
            if (this.f28674c != p.b.ACTIVE) {
                this.b.clear();
                try {
                    try {
                        if (this.f28675d == null) {
                            c();
                        }
                        this.f28673a.discoverServices("_scpi-raw._tcp.", 1, this.f28675d);
                    } catch (IllegalStateException e10) {
                        Log.e("MagicLoginNsdHelperClient", "IllegalStateException while starting discovery: " + e10.toString());
                    }
                } catch (IllegalArgumentException e11) {
                    Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException while starting discovery: " + e11.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k() {
        NsdManager.DiscoveryListener discoveryListener;
        if (this.f28674c == p.b.ACTIVE && (discoveryListener = this.f28675d) != null) {
            try {
                try {
                    this.f28673a.stopServiceDiscovery(discoveryListener);
                } catch (IllegalArgumentException e10) {
                    Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException while stopping discovery: " + e10.toString());
                }
            } catch (IllegalStateException e11) {
                Log.e("MagicLoginNsdHelperClient", "IllegalStateException while stopping discovery: " + e11.toString());
            }
        }
    }
}
