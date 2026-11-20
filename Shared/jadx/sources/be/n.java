package be;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final zd.f f3985a;
    public final i b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3986c;

    /* renamed from: d, reason: collision with root package name */
    public final m f3987d;

    /* renamed from: e, reason: collision with root package name */
    public PackageInfo f3988e;

    public n(Context context, zd.f fVar, i iVar) {
        m mVar = new m(new zd.b(fVar));
        this.f3985a = fVar;
        this.b = iVar;
        this.f3986c = context;
        this.f3987d = mVar;
    }

    public static X509Certificate e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e10) {
            Log.e("SplitCompat", "Cannot decode certificate.", e10);
            return null;
        }
    }

    public final boolean a(File[] fileArr) {
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? d().getLongVersionCode() : r0.versionCode;
        AssetManager assetManager = (AssetManager) g0.c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f3987d.b(assetManager, fileArr[length]);
        } while (longVersionCode == this.f3987d.a());
        return false;
    }

    public final boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f3985a.g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(File[] fileArr) {
        PackageInfo d10 = d();
        ArrayList arrayList = null;
        if (d10 != null && d10.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : d10.signatures) {
                X509Certificate e10 = e(signature);
                if (e10 != null) {
                    arrayList.add(e10);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                String absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] a10 = e1.a(absolutePath);
                    if (a10 != null && a10.length != 0 && a10[0].length != 0) {
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                X509Certificate x509Certificate = (X509Certificate) obj;
                                for (X509Certificate[] x509CertificateArr : a10) {
                                    int i11 = x509CertificateArr[0].equals(x509Certificate) ? 0 : i11 + 1;
                                }
                                Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                                break loop1;
                            }
                        }
                        Log.e("SplitCompat", "No certificates found for app.");
                        break;
                    }
                    break;
                } catch (Exception e11) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e11);
                }
            } catch (Exception e12) {
                Log.e("SplitCompat", "Split verification error.", e12);
                return false;
            }
        }
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    public final PackageInfo d() {
        if (this.f3988e == null) {
            try {
                this.f3988e = this.f3986c.getPackageManager().getPackageInfo(this.f3986c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f3988e;
    }
}
