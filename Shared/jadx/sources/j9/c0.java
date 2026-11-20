package j9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import n9.o0;
import n9.p0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile p0 f21601g;

    /* renamed from: i, reason: collision with root package name */
    public static Context f21603i;

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f21596a = new r(x.u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    public static final a0 b = new s(x.u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f21597c = new t(x.u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f21598d = new u(x.u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f21599e = new v(x.u2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f21600f = new w(x.u2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: h, reason: collision with root package name */
    public static final Object f21602h = new Object();

    public static synchronized void a(Context context) {
        synchronized (c0.class) {
            if (f21603i != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f21603i = context.getApplicationContext();
            }
        }
    }

    public static void b() {
        if (f21601g != null) {
            return;
        }
        n9.m.l(f21603i);
        synchronized (f21602h) {
            try {
                if (f21601g == null) {
                    f21601g = o0.s2(DynamiteModule.e(f21603i, DynamiteModule.f5914f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static j0 c(h0 h0Var) {
        j0 d10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            n9.m.l(f21603i);
            try {
                b();
                n9.m.l(f21603i);
                zzp b10 = h0Var.b(f21603i);
                try {
                    zzr H1 = h0Var.a() ? f21601g.H1(b10) : f21601g.d2(b10);
                    if (H1.zza()) {
                        d10 = j0.f(H1.zze(), H1.zzc());
                    } else {
                        String zzb = H1.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = H1.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (zzb == null) {
                            zzb = "error checking package certificate";
                        }
                        d10 = j0.g(H1.zze(), H1.zzd(), zzb, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    d10 = j0.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                d10 = j0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d10;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    @Deprecated
    public static j0 d(String str, x xVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, xVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static /* synthetic */ String e(boolean z10, String str, x xVar) {
        String str2 = (z10 || !f(str, xVar, true, false).f21620a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = u9.a.b("SHA-256");
        n9.m.l(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, u9.k.a(b10.digest(xVar.t2())), Boolean.valueOf(z10), "12451000.false");
    }

    @Deprecated
    public static j0 f(final String str, final x xVar, final boolean z10, boolean z11) {
        try {
            b();
            n9.m.l(f21603i);
            try {
                return f21601g.L(new zzt(str, xVar, z10, z11), y9.b.u2(f21603i.getPackageManager())) ? j0.b() : new i0(new Callable() { // from class: j9.z
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return c0.e(z10, str, xVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return j0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return j0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
