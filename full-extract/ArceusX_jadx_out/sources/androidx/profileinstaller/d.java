package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import ne.x;
import y1.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final f<c> f2692a = f.B();
    public static final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f2693c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2694a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2695c;

        /* renamed from: d, reason: collision with root package name */
        public final long f2696d;

        public b(int i10, int i11, long j10, long j11) {
            this.f2694a = i10;
            this.b = i11;
            this.f2695c = j10;
            this.f2696d = j11;
        }

        public static b a(@NonNull File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public void b(@NonNull File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2694a);
                dataOutputStream.writeInt(this.b);
                dataOutputStream.writeLong(this.f2695c);
                dataOutputStream.writeLong(this.f2696d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.f2695c == bVar.f2695c && this.f2694a == bVar.f2694a && this.f2696d == bVar.f2696d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.f2695c), Integer.valueOf(this.f2694a), Long.valueOf(this.f2696d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2697a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2698c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2699d;

        public c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f2697a = i10;
            this.f2698c = z11;
            this.b = z10;
            this.f2699d = z12;
        }

        public int a() {
            return this.f2697a;
        }

        public boolean b() {
            return this.f2698c;
        }

        public boolean c() {
            return this.b;
        }
    }

    @NonNull
    public static x<c> a() {
        return f2692a;
    }

    public static long b(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c c(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f2693c = cVar;
        f2692a.x(cVar);
        return f2693c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:33|34|35|(2:74|75)(1:37)|38|(8:45|(1:49)|(1:56)|57|(2:64|65)|61|62|63)|(1:71)(1:(1:73))|(1:49)|(3:51|54|56)|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fa, code lost:
    
        r14 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
    
        r5 = 327680;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.d.c d(@androidx.annotation.NonNull android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.d.d(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
