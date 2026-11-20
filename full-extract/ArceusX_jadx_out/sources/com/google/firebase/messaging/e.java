package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k2.k;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f8812a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f8813c;

    public e(Context context, h0 h0Var, ExecutorService executorService) {
        this.f8812a = executorService;
        this.b = context;
        this.f8813c = h0Var;
    }

    public boolean a() {
        if (this.f8813c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        d0 d10 = d();
        c.a e10 = c.e(this.b, this.f8813c);
        e(e10.f8803a, d10);
        c(e10);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!u9.m.e()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVar.b, aVar.f8804c, aVar.f8803a.c());
    }

    public final d0 d() {
        d0 d10 = d0.d(this.f8813c.p("gcm.n.image"));
        if (d10 != null) {
            d10.f(this.f8812a);
        }
        return d10;
    }

    public final void e(k.f fVar, d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) sb.m.b(d0Var.e(), 5L, TimeUnit.SECONDS);
            fVar.s(bitmap);
            fVar.B(new k.c().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            d0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            d0Var.close();
        }
    }
}
