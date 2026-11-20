package v9;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import n9.m;

/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f33355a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public b(@NonNull String str) {
        m.m(str, "Name must not be null");
        this.f33355a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.b.newThread(new c(runnable, 0));
        newThread.setName(this.f33355a);
        return newThread;
    }
}
