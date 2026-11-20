package fb;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17069a;
    public final HashMap b;

    public abstract void a(String str, int i10);

    public final void b() {
        synchronized (this.f17069a) {
            try {
                HashMap hashMap = this.b;
                for (Map.Entry entry : hashMap.entrySet()) {
                    a((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
                }
                hashMap.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
