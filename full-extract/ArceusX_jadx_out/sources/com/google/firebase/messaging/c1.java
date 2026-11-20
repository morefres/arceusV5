package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8806a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static rb.a f8807c;

    public static void b(Context context) {
        if (f8807c == null) {
            rb.a aVar = new rb.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f8807c = aVar;
            aVar.d(true);
        }
    }

    public static void c(@NonNull Intent intent) {
        synchronized (b) {
            try {
                if (f8807c != null && d(intent)) {
                    f(intent, false);
                    f8807c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean d(@NonNull Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    public static void e(Context context, h1 h1Var, final Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean d10 = d(intent);
                f(intent, true);
                if (!d10) {
                    f8807c.a(f8806a);
                }
                h1Var.d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.b1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        c1.c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(@NonNull Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    public static ComponentName g(@NonNull Context context, @NonNull Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean d10 = d(intent);
                f(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d10) {
                    f8807c.a(f8806a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
