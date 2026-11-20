package sb;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f31007a = new kb.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f31007a.post(runnable);
    }
}
