package v7;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f33275a;
    public final AtomicInteger b;

    public i0(com.android.billingclient.api.b bVar) {
        Objects.requireNonNull(bVar);
        this.f33275a = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.b;
        Thread newThread = this.f33275a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
