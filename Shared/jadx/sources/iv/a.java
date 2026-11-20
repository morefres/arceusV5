package iv;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21128a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f21128a.post(runnable);
    }
}
