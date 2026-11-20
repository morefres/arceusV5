package ne;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ne.b;

/* loaded from: classes2.dex */
public class v<V> implements x<V> {
    public static final x<?> b = new v(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f27029c = Logger.getLogger(v.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final V f27030a;

    public static final class a<V> extends b.j<V> {
        public a(Throwable th2) {
            E(th2);
        }
    }

    public v(V v5) {
        this.f27030a = v5;
    }

    @Override // ne.x
    public void a(Runnable runnable, Executor executor) {
        he.n.m(runnable, "Runnable was null.");
        he.n.m(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f27029c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f27030a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f27030a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb2.append(obj);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(valueOf);
        sb2.append("]]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        he.n.l(timeUnit);
        return get();
    }
}
