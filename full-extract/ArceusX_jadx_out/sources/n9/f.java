package n9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f25959a = new Object();
    public static int b = 9;

    /* renamed from: c, reason: collision with root package name */
    public static h1 f25960c;

    /* renamed from: d, reason: collision with root package name */
    public static HandlerThread f25961d;

    /* renamed from: e, reason: collision with root package name */
    public static Executor f25962e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f25963f;

    @NonNull
    public static f a(@NonNull Context context) {
        synchronized (f25959a) {
            try {
                if (f25960c == null) {
                    f25960c = new h1(context.getApplicationContext(), f25963f ? b().getLooper() : context.getMainLooper(), f25962e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f25960c;
    }

    @NonNull
    public static HandlerThread b() {
        synchronized (f25959a) {
            try {
                HandlerThread handlerThread = f25961d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", b);
                f25961d = handlerThread2;
                handlerThread2.start();
                return f25961d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract ConnectionResult c(e1 e1Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(@NonNull String str, @NonNull String str2, int i10, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z10) {
        e(new e1(str, str2, 4225, z10), serviceConnection, str3);
    }

    public abstract void e(e1 e1Var, ServiceConnection serviceConnection, String str);
}
