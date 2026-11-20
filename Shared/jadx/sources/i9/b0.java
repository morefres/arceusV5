package i9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static b0 f20323e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20324a;
    public final ScheduledExecutorService b;

    /* renamed from: c, reason: collision with root package name */
    public v f20325c = new v(this, null);

    /* renamed from: d, reason: collision with root package name */
    public int f20326d = 1;

    public b0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.f20324a = context.getApplicationContext();
    }

    public static synchronized b0 b(Context context) {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f20323e == null) {
                    cb.e.a();
                    f20323e = new b0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v9.b("MessengerIpcClient"))));
                }
                b0Var = f20323e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0Var;
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new x(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new a0(f(), i10, bundle));
    }

    public final synchronized int f() {
        int i10;
        i10 = this.f20326d;
        this.f20326d = i10 + 1;
        return i10;
    }

    public final synchronized Task g(y yVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(yVar.toString()));
            }
            if (!this.f20325c.g(yVar)) {
                v vVar = new v(this, null);
                this.f20325c = vVar;
                vVar.g(yVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return yVar.b.a();
    }
}
