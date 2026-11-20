package u9;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static String f32654a;
    public static int b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f32655c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f32654a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f32654a = Application.getProcessName();
            } else {
                int i10 = b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    b = i10;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(i10);
                        sb2.append("/cmdline");
                        String sb3 = sb2.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb3));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        n9.m.l(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        l.a(bufferedReader2);
                        throw th;
                    }
                    l.a(bufferedReader);
                }
                f32654a = str;
            }
        }
        return f32654a;
    }

    public static boolean b() {
        Boolean bool = f32655c;
        if (bool == null) {
            if (m.h()) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object a10 = db.r.a(Process.class, "isIsolated", new db.q[0]);
                    Object[] objArr = new Object[0];
                    if (a10 == null) {
                        throw new db.u(db.t.a("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) a10;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f32655c = bool;
        }
        return bool.booleanValue();
    }
}
