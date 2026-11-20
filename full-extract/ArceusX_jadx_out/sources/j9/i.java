package j9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static i f21615c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21616a;
    public volatile String b;

    public i(@NonNull Context context) {
        this.f21616a = context.getApplicationContext();
    }

    @NonNull
    public static i a(@NonNull Context context) {
        n9.m.l(context);
        synchronized (i.class) {
            try {
                if (f21615c == null) {
                    c0.a(context);
                    f21615c = new i(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21615c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.i.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static x f(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            y yVar = new y(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < xVarArr.length; i10++) {
                if (xVarArr[i10].equals(yVar)) {
                    return xVarArr[i10];
                }
            }
        }
        return null;
    }

    public boolean b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (h.e(this.f21616a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        j0 c10;
        int length;
        String[] packagesForUid = this.f21616a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    n9.m.l(c10);
                    break;
                }
                c10 = e(packagesForUid[i11], false, false);
                if (c10.f21620a) {
                    break;
                }
                i11++;
            }
        } else {
            c10 = j0.c("no pkgs");
        }
        c10.e();
        return c10.f21620a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j9.j0 e(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L9
            j9.j0 r6 = j9.j0.c(r7)
            return r6
        L9:
            java.lang.String r8 = r5.b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto Ld0
            j9.a0 r8 = j9.c0.f21596a
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            r0 = 1
            j9.c0.b()     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48 com.google.android.gms.dynamite.DynamiteModule.a -> L4a
            n9.p0 r1 = j9.c0.f21601g     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48 com.google.android.gms.dynamite.DynamiteModule.a -> L4a
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48 com.google.android.gms.dynamite.DynamiteModule.a -> L4a
            android.os.StrictMode.setThreadPolicy(r8)
            if (r1 == 0) goto L55
            j9.g0 r7 = new j9.g0
            r8 = 0
            r7.<init>(r8)
            r7.a(r6)
            android.content.Context r8 = r5.f21616a
            boolean r8 = j9.h.e(r8)
            r7.b(r8)
            r7.c(r0)
            j9.h0 r7 = r7.d()
            j9.j0 r7 = j9.c0.c(r7)
            goto Lb9
        L45:
            r6 = move-exception
            goto Lcc
        L48:
            r1 = move-exception
            goto L4b
        L4a:
            r1 = move-exception
        L4b:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L45
            android.os.StrictMode.setThreadPolicy(r8)
        L55:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r8 < r1) goto L5f
            r8 = 134217792(0x8000040, float:3.8518893E-34)
            goto L61
        L5f:
            r8 = 64
        L61:
            android.content.Context r1 = r5.f21616a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc0
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc0
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r6, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc0
            android.content.Context r1 = r5.f21616a
            boolean r1 = j9.h.e(r1)
            if (r8 != 0) goto L78
            j9.j0 r7 = j9.j0.c(r7)
            goto Lb9
        L78:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto Lb3
            int r7 = r7.length
            if (r7 == r0) goto L80
            goto Lb3
        L80:
            j9.y r7 = new j9.y
            android.content.pm.Signature[] r2 = r8.signatures
            r3 = 0
            r2 = r2[r3]
            byte[] r2 = r2.toByteArray()
            r7.<init>(r2)
            java.lang.String r2 = r8.packageName
            j9.j0 r1 = j9.c0.d(r2, r7, r1, r3)
            boolean r4 = r1.f21620a
            if (r4 == 0) goto Lb1
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto Lb1
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto Lb1
            j9.j0 r7 = j9.c0.d(r2, r7, r3, r0)
            boolean r7 = r7.f21620a
            if (r7 == 0) goto Lb1
            java.lang.String r7 = "debuggable release cert app rejected"
            j9.j0 r7 = j9.j0.c(r7)
            goto Lb9
        Lb1:
            r7 = r1
            goto Lb9
        Lb3:
            java.lang.String r7 = "single cert required"
            j9.j0 r7 = j9.j0.c(r7)
        Lb9:
            boolean r8 = r7.f21620a
            if (r8 == 0) goto Lbf
            r5.b = r6
        Lbf:
            return r7
        Lc0:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            j9.j0 r6 = j9.j0.d(r6, r7)
            return r6
        Lcc:
            android.os.StrictMode.setThreadPolicy(r8)
            throw r6
        Ld0:
            j9.j0 r6 = j9.j0.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.i.e(java.lang.String, boolean, boolean):j9.j0");
    }
}
