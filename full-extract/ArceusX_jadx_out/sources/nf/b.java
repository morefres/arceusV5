package nf;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f27036e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f27037a = new AtomicLong();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27038c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f27039d;

    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.f27038c = i10;
        this.f27039d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f27038c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f27039d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f27036e.newThread(new Runnable() { // from class: nf.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this, runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, Long.valueOf(this.f27037a.getAndIncrement())));
        return newThread;
    }
}
