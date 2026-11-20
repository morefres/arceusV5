package n9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private volatile String zzA;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzj zzE;
    j1 zza;
    final Handler zzb;

    @NonNull
    protected InterfaceC0458c zzc;

    @NonNull
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final f zzn;
    private final j9.d zzo;
    private final Object zzp;
    private final Object zzq;
    private i zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private x0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    public interface b {
        void onConnectionFailed(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: n9.c$c, reason: collision with other inner class name */
    public interface InterfaceC0458c {
        void a(@NonNull ConnectionResult connectionResult);
    }

    public class d implements InterfaceC0458c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f25937a;

        public d(c cVar) {
            Objects.requireNonNull(cVar);
            this.f25937a = cVar;
        }

        @Override // n9.c.InterfaceC0458c
        public final void a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.A3()) {
                c cVar = this.f25937a;
                cVar.getRemoteService(null, cVar.getScopes());
            } else {
                c cVar2 = this.f25937a;
                if (cVar2.zzl() != null) {
                    cVar2.zzl().onConnectionFailed(connectionResult);
                }
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, n9.c.a r13, n9.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            n9.f r3 = n9.f.a(r10)
            j9.d r4 = j9.d.f()
            n9.m.l(r13)
            n9.m.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.c.<init>(android.content.Context, android.os.Looper, int, n9.c$a, n9.c$b, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzp(int i10, IInterface iInterface) {
        j1 j1Var;
        m.a((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    x0 x0Var = this.zzu;
                    if (x0Var != null) {
                        f fVar = this.zzn;
                        String a10 = this.zza.a();
                        m.l(a10);
                        fVar.d(a10, this.zza.b(), 4225, x0Var, zza(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    x0 x0Var2 = this.zzu;
                    if (x0Var2 != null && (j1Var = this.zza) != null) {
                        String a11 = j1Var.a();
                        String b10 = j1Var.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a11).length() + 70 + String.valueOf(b10).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(a11);
                        sb2.append(" on ");
                        sb2.append(b10);
                        Log.e("GmsClient", sb2.toString());
                        f fVar2 = this.zzn;
                        String a12 = this.zza.a();
                        m.l(a12);
                        fVar2.d(a12, this.zza.b(), 4225, x0Var2, zza(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    x0 x0Var3 = new x0(this, this.zzd.get());
                    this.zzu = x0Var3;
                    j1 j1Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new j1(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new j1(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = j1Var2;
                    if (j1Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a())));
                    }
                    f fVar3 = this.zzn;
                    String a13 = this.zza.a();
                    m.l(a13);
                    ConnectionResult c10 = fVar3.c(new e1(a13, this.zza.b(), 4225, this.zza.c()), x0Var3, zza(), getBindServiceExecutor());
                    if (!c10.A3()) {
                        String a14 = this.zza.a();
                        String b11 = this.zza.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a14).length() + 34 + String.valueOf(b11).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(a14);
                        sb3.append(" on ");
                        sb3.append(b11);
                        Log.w("GmsClient", sb3.toString());
                        int w32 = c10.w3() == -1 ? 16 : c10.w3();
                        if (c10.y3() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c10.y3());
                        }
                        zzb(w32, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    m.l(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int h10 = this.zzo.h(this.zzl, getMinApkVersion());
        if (h10 == 0) {
            connect(new d(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(this), h10, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@NonNull InterfaceC0458c interfaceC0458c) {
        m.m(interfaceC0458c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0458c;
        zzp(2, null);
    }

    public abstract T createServiceInterface(@NonNull IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((v0) arrayList.get(i10)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    @NonNull
    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f5864g;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.zzl;
    }

    @NonNull
    public String getEndpointPackageName() {
        j1 j1Var;
        if (!isConnected() || (j1Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return j1Var.b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public int getMinApkVersion() {
        return j9.d.f21604a;
    }

    public void getRemoteService(com.google.android.gms.common.internal.b bVar, @NonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i10 = this.zzy;
        int i11 = j9.d.f21604a;
        Scope[] scopeArr = GetServiceRequest.f5822t;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f5823u;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f5827i = this.zzl.getPackageName();
        getServiceRequest.f5830l = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f5829k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f5831m = account;
            if (bVar != null) {
                getServiceRequest.f5828j = bVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f5831m = getAccount();
        }
        getServiceRequest.f5832n = zze;
        getServiceRequest.f5833o = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f5836r = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    i iVar = this.zzr;
                    if (iVar != null) {
                        iVar.R(new w0(this, this.zzd.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    @NonNull
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    public final T getService() {
        T t8;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                m.m(iInterface, "Client is connected but service is null");
                t8 = (T) iInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }

    @NonNull
    public abstract String getServiceDescriptor();

    @NonNull
    public abstract String getStartServiceAction();

    @NonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f5866i;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(@NonNull T t8) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzi = connectionResult.w3();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        y0 y0Var = new y0(this, i10, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, y0Var));
    }

    public void onUserSignOut(@NonNull e eVar) {
        eVar.a();
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    public void triggerNotAvailable(@NonNull InterfaceC0458c interfaceC0458c, int i10, PendingIntent pendingIntent) {
        m.m(interfaceC0458c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0458c;
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i10, Bundle bundle, int i11) {
        z0 z0Var = new z0(this, i10, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, z0Var));
    }

    public final /* synthetic */ void zzc(zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f5866i;
            n.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.A3());
        }
    }

    public final /* synthetic */ void zzd(int i10, IInterface iInterface) {
        zzp(i10, null);
    }

    public final /* synthetic */ boolean zze(int i10, int i11, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i10) {
                    return false;
                }
                zzp(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzf(int i10) {
        int i11;
        int i12;
        synchronized (this.zzp) {
            i11 = this.zzv;
        }
        if (i11 == 3) {
            this.zzD = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i12, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(i iVar) {
        this.zzr = iVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ a zzk() {
        return this.zzw;
    }

    public final /* synthetic */ b zzl() {
        return this.zzx;
    }

    public final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public c(@NonNull Context context, @NonNull Looper looper, @NonNull f fVar, @NonNull j9.d dVar, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        m.m(context, "Context must not be null");
        this.zzl = context;
        m.m(looper, "Looper must not be null");
        this.zzm = looper;
        m.m(fVar, "Supervisor must not be null");
        this.zzn = fVar;
        m.m(dVar, "API availability must not be null");
        this.zzo = dVar;
        this.zzb = new u0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(@NonNull String str) {
        this.zzk = str;
        disconnect();
    }
}
