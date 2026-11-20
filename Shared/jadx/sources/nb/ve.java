package nb;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class ve extends k8 {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f26743i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f26744j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f26745c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f26746d;

    /* renamed from: e, reason: collision with root package name */
    public int f26747e;

    /* renamed from: f, reason: collision with root package name */
    public r4.a f26748f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f26749g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f26750h;

    public ve(g7 g7Var) {
        super(g7Var);
        this.f26750h = null;
        this.f26746d = new AtomicLong(0L);
    }

    public static MessageDigest C() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long D(byte[] bArr) {
        n9.m.l(bArr);
        int length = bArr.length;
        int i10 = 0;
        n9.m.p(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static boolean E(Context context, boolean z10) {
        n9.m.l(context);
        return F(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean N(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean O(String str, String[] strArr) {
        n9.m.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(String str) {
        return !f26744j[0].equals(str);
    }

    public static ArrayList h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.f7458f);
            bundle.putString("origin", zzahVar.f7459g);
            bundle.putLong("creation_timestamp", zzahVar.f7461i);
            bundle.putString("name", zzahVar.f7460h.f7488g);
            m8.a(bundle, n9.m.l(zzahVar.f7460h.zza()));
            bundle.putBoolean("active", zzahVar.f7462j);
            String str = zzahVar.f7463k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzahVar.f7464l;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.f7471f);
                zzbe zzbeVar = zzbgVar.f7472g;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.y3());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.f7465m);
            zzbg zzbgVar2 = zzahVar.f7466n;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.f7471f);
                zzbe zzbeVar2 = zzbgVar2.f7472g;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.y3());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.f7460h.f7489h);
            bundle.putLong("time_to_live", zzahVar.f7467o);
            zzbg zzbgVar3 = zzahVar.f7468p;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.f7471f);
                zzbe zzbeVar3 = zzbgVar3.f7472g;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.y3());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean j0(Context context) {
        ActivityInfo receiverInfo;
        n9.m.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void k0(bb bbVar, Bundle bundle, boolean z10) {
        if (bundle != null && bbVar != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = bbVar.f26068a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = bbVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", bbVar.f26069c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && bbVar == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean m0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean r0(String str) {
        n9.m.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final void A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            g7 g7Var = this.f26328a;
            g7Var.a().t().c("Not putting event parameter. Invalid value type. name, type", g7Var.D().b(str), simpleName);
        }
    }

    public final int A0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f26328a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }

    public final void B(ue ueVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        ueVar.a(str, "_err", bundle);
    }

    public final boolean B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean C0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f26328a.a().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final void D0(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int z02;
        String str4;
        int r8;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        g7 g7Var = this.f26328a;
        int i10 = true != g7Var.w().f26328a.C().V(231100000, true) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                z02 = !z10 ? z0(str5) : 0;
                if (z02 == 0) {
                    z02 = A0(str5);
                }
            } else {
                z02 = 0;
            }
            if (z02 != 0) {
                x(bundle, z02, str5, z02 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (B0(bundle.get(str5))) {
                    g7Var.a().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    r8 = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    r8 = r(str, str2, str5, bundle.get(str5), bundle, list2, z10, false);
                }
                if (r8 != 0 && !"_ev".equals(str5)) {
                    x(bundle, r8, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (r0(str5) && !O(str5, s8.f26651d)) {
                    i11++;
                    if (!V(231100000, true)) {
                        g7Var.a().q().c("Item array not supported on client's version of Google Play Services (Android Only)", g7Var.D().a(str2), g7Var.D().e(bundle));
                        m0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i11 > i10) {
                        if (!g7Var.w().H(str4, z4.f26868f1) || !z11) {
                            u5 q10 = g7Var.a().q();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            q10.c(sb2.toString(), g7Var.D().a(str2), g7Var.D().e(bundle));
                        }
                        m0(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z11 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean G() {
        h();
        return J() == 1;
    }

    public final r4.a H() {
        if (this.f26748f == null) {
            this.f26748f = r4.a.a(this.f26328a.d());
        }
        return this.f26748f;
    }

    public final int I() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public final long J() {
        long j10;
        h();
        if (!L(this.f26328a.L().q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            g7 g7Var = this.f26328a;
            int I = I();
            g7Var.w();
            j10 = I < ((Integer) z4.f26888m0.b(null)).intValue() ? 16L : 0L;
        }
        if (!M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !K()) {
            j10 = 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    @TargetApi(BacktraceMetrics.defaultTimeIntervalInMin)
    public final boolean K() {
        Object e10;
        Integer num;
        if (this.f26749g == null) {
            r4.a H = H();
            boolean z10 = false;
            if (H == null) {
                return false;
            }
            try {
                num = H.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e11) {
                        e10 = e11;
                        this.f26328a.a().r().b("Measurement manager api exception", e10);
                        this.f26749g = Boolean.FALSE;
                        this.f26328a.a().w().b("Measurement manager api status result", num);
                        return this.f26749g.booleanValue();
                    } catch (CancellationException e12) {
                        e10 = e12;
                        this.f26328a.a().r().b("Measurement manager api exception", e10);
                        this.f26749g = Boolean.FALSE;
                        this.f26328a.a().w().b("Measurement manager api status result", num);
                        return this.f26749g.booleanValue();
                    } catch (ExecutionException e13) {
                        e10 = e13;
                        this.f26328a.a().r().b("Measurement manager api exception", e10);
                        this.f26749g = Boolean.FALSE;
                        this.f26328a.a().w().b("Measurement manager api status result", num);
                        return this.f26749g.booleanValue();
                    } catch (TimeoutException e14) {
                        e10 = e14;
                        this.f26328a.a().r().b("Measurement manager api exception", e10);
                        this.f26749g = Boolean.FALSE;
                        this.f26328a.a().w().b("Measurement manager api status result", num);
                        return this.f26749g.booleanValue();
                    }
                }
                this.f26749g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                e10 = e15;
                num = null;
            }
            this.f26328a.a().w().b("Measurement manager api status result", num);
        }
        return this.f26749g.booleanValue();
    }

    public final boolean L(String str) {
        String str2 = (String) z4.f26900s0.b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean M(String str) {
        h();
        g7 g7Var = this.f26328a;
        if (w9.c.a(g7Var.d()).a(str) == 0) {
            return true;
        }
        g7Var.a().v().b("Permission not granted", str);
        return false;
    }

    public final boolean P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        g7 g7Var = this.f26328a;
        String i10 = g7Var.w().i();
        g7Var.c();
        return i10.equals(str);
    }

    public final Bundle Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object s8 = s(str2, bundle.get(str2));
                if (s8 == null) {
                    g7 g7Var = this.f26328a;
                    g7Var.a().t().b("Param value can't be null", g7Var.D().b(str2));
                } else {
                    A(bundle2, str2, s8);
                }
            }
        }
        return bundle2;
    }

    public final zzbg R(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (x0(str2) != 0) {
            g7 g7Var = this.f26328a;
            g7Var.a().o().b("Invalid conditional property event name", g7Var.D().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle t8 = t(str, str2, bundle2, u9.f.a("_o"), true);
        if (z10) {
            t8 = Q(t8, str);
        }
        n9.m.l(t8);
        return new zzbg(str2, new zzbe(t8), str3, j10);
    }

    public final boolean S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e10 = w9.c.a(context).e(str, 64);
            if (e10 == null || (signatureArr = e10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e11) {
            this.f26328a.a().o().b("Package name not found", e11);
            return true;
        } catch (CertificateException e12) {
            this.f26328a.a().o().b("Error obtaining certificate", e12);
            return true;
        }
    }

    public final byte[] T(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final boolean V(int i10, boolean z10) {
        Boolean x10 = this.f26328a.J().x();
        if (W() < i10 / 1000) {
            return (x10 == null || x10.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int W() {
        if (this.f26750h == null) {
            this.f26750h = Integer.valueOf(j9.d.f().a(this.f26328a.d()) / 1000);
        }
        return this.f26750h.intValue();
    }

    public final int X(int i10) {
        return j9.d.f().h(this.f26328a.d(), j9.h.f21609a);
    }

    public final long Y(long j10, long j11) {
        return (j10 + (j11 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS)) / 86400000;
    }

    public final void Z(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f26328a.a().r().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void a0(com.google.android.gms.internal.measurement.x1 x1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f26328a.a().r().b("Error returning string value to wrapper", e10);
        }
    }

    public final void b0(com.google.android.gms.internal.measurement.x1 x1Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f26328a.a().r().b("Error returning long value to wrapper", e10);
        }
    }

    public final void c0(com.google.android.gms.internal.measurement.x1 x1Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f26328a.a().r().b("Error returning int value to wrapper", e10);
        }
    }

    public final void d0(com.google.android.gms.internal.measurement.x1 x1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f26328a.a().r().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void e0(com.google.android.gms.internal.measurement.x1 x1Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f26328a.a().r().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void f0(com.google.android.gms.internal.measurement.x1 x1Var, Bundle bundle) {
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f26328a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void g0(com.google.android.gms.internal.measurement.x1 x1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f26328a.a().r().b("Error returning bundle list to wrapper", e10);
        }
    }

    @Override // nb.k8
    public final boolean i() {
        return true;
    }

    public final URL i0(long j10, String str, String str2, long j11, String str3) {
        try {
            n9.m.f(str2);
            n9.m.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(W())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f26328a.w().j())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e10) {
            e = e10;
            this.f26328a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            this.f26328a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // nb.k8
    public final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f26328a.a().r().a("Utils falling back to Random for random id");
            }
        }
        this.f26746d.set(nextLong);
    }

    public final String l0() {
        byte[] bArr = new byte[16];
        q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object n0(int i10, Object obj, boolean z10, boolean z11, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle Q = Q((Bundle) parcelable, null);
                if (!Q.isEmpty()) {
                    arrayList.add(Q);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f26328a.a().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        n9.m.l(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.f26328a.a().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", w5.x(str));
        return false;
    }

    public final int o0(String str) {
        if ("_ldl".equals(str)) {
            this.f26328a.w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f26328a.w();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f26328a.w();
            return 100;
        }
        this.f26328a.w();
        return 36;
    }

    public final boolean p(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            n9.m.l(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final long p0() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f26746d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f26746d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nextLong = new Random(System.nanoTime() ^ this.f26328a.e().a()).nextLong();
            int i10 = this.f26747e + 1;
            this.f26747e = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    public final String q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public final SecureRandom q0() {
        h();
        if (this.f26745c == null) {
            this.f26745c = new SecureRandom();
        }
        return this.f26745c;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.ve.r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final Object s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return n0(this.f26328a.w().y(null, false), obj, true, true, null);
        }
        return n0(N(str) ? this.f26328a.w().y(null, false) : this.f26328a.w().x(null, false), obj, false, true, null);
    }

    public final Bundle s0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(Payload.SOURCE, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString(Payload.CAMPAIGN_ID, str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            this.f26328a.a().r().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    public final Bundle t(String str, String str2, Bundle bundle, List list, boolean z10) {
        int z02;
        List list2 = list;
        boolean O = O(str2, r8.f26632d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        g7 g7Var = this.f26328a;
        int v5 = g7Var.w().v();
        int i10 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                z02 = !z10 ? z0(str3) : 0;
                if (z02 == 0) {
                    z02 = A0(str3);
                }
            } else {
                z02 = 0;
            }
            if (z02 != 0) {
                x(bundle2, z02, str3, z02 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int r8 = r(str, str2, str3, bundle.get(str3), bundle2, list2, z10, O);
                if (r8 == 17) {
                    x(bundle2, 17, str3, Boolean.FALSE);
                } else if (r8 != 0 && !"_ev".equals(str3)) {
                    x(bundle2, r8, r8 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (r0(str3) && (i10 = i10 + 1) > v5) {
                    if (!g7Var.w().H(null, z4.f26868f1) || !z11) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(v5).length() + 37);
                        sb2.append("Event can't contain more than ");
                        sb2.append(v5);
                        sb2.append(" params");
                        g7Var.a().q().c(sb2.toString(), g7Var.D().a(str2), g7Var.D().e(bundle));
                    }
                    m0(bundle2, 5);
                    bundle2.remove(str3);
                    z11 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final boolean t0(String str, String str2) {
        if (str2 == null) {
            this.f26328a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f26328a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f26328a.a().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f26328a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void u(x5 x5Var, int i10) {
        Bundle bundle = x5Var.f26793d;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (r0(str) && (i11 = i11 + 1) > i10) {
                g7 g7Var = this.f26328a;
                if (!g7Var.w().H(null, z4.f26868f1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    g7Var.a().q().c(sb2.toString(), g7Var.D().a(x5Var.f26791a), g7Var.D().e(bundle));
                    m0(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final boolean u0(String str, String str2) {
        if (str2 == null) {
            this.f26328a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f26328a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.f26328a.a().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f26328a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void v(Parcelable[] parcelableArr, int i10) {
        n9.m.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (r0(str) && !O(str, s8.f26651d) && (i11 = i11 + 1) > i10) {
                    g7 g7Var = this.f26328a;
                    if (!g7Var.w().H(null, z4.f26868f1) || !z10) {
                        u5 q10 = g7Var.a().q();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        q10.c(sb2.toString(), g7Var.D().b(str), g7Var.D().e(bundle));
                    }
                    m0(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final boolean v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f26328a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        n9.m.l(str2);
        String[] strArr3 = f26743i;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f26328a.a().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && O(str2, strArr2)) {
            return true;
        }
        this.f26328a.a().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f26328a.C().A(bundle, str, bundle2.get(str));
            }
        }
    }

    public final boolean w0(String str, int i10, String str2) {
        if (str2 == null) {
            this.f26328a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f26328a.a().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final void x(Bundle bundle, int i10, String str, Object obj) {
        if (m0(bundle, i10)) {
            this.f26328a.w();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                n9.m.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int x0(String str) {
        if (!u0(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!v0(NotificationCompat.CATEGORY_EVENT, r8.f26630a, r8.b, str)) {
            return 13;
        }
        this.f26328a.w();
        return !w0(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    public final int y(String str, Object obj) {
        return "_ldl".equals(str) ? C0("user property referrer", str, o0(str), obj) : C0("user property", str, o0(str), obj) ? 0 : 7;
    }

    public final int y0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!v0("user property", t8.f26683a, null, str)) {
            return 15;
        }
        this.f26328a.w();
        return !w0("user property", 24, str) ? 6 : 0;
    }

    public final Object z(String str, Object obj) {
        return "_ldl".equals(str) ? n0(o0(str), obj, true, false, null) : n0(o0(str), obj, false, false, null);
    }

    public final int z0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f26328a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }
}
