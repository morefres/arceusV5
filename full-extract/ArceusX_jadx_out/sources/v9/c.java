package v9;

import android.os.Process;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f33356a;

    public c(Runnable runnable, int i10) {
        this.f33356a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f33356a.run();
    }
}
