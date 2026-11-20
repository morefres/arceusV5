package th;

import ek.q;
import java.util.HashMap;
import java.util.function.LongSupplier;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    public static m f32231d;

    /* renamed from: c, reason: collision with root package name */
    public LongSupplier f32233c = new LongSupplier() { // from class: th.l
        @Override // java.util.function.LongSupplier
        public final long getAsLong() {
            return System.currentTimeMillis();
        }
    };
    public HashMap<String, Long> b = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public long f32232a = 180000;

    public static m b() {
        m mVar = f32231d;
        if (mVar != null) {
            return mVar;
        }
        synchronized (m.class) {
            try {
                if (f32231d == null) {
                    f32231d = new m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32231d;
    }

    public boolean a(String str) {
        q.h("WebFragmentRefreshHelper", "Checking is refresh is needed. url=" + str);
        if (this.b.containsKey(str)) {
            long longValue = this.b.get(str).longValue();
            this.b.put(str, Long.valueOf(this.f32233c.getAsLong()));
            r2 = this.f32233c.getAsLong() - longValue >= this.f32232a;
            q.h("WebFragmentRefreshHelper", "Needs refresh=" + r2);
        }
        return r2;
    }

    public void c(String str) {
        this.b.put(str, Long.MAX_VALUE);
    }

    public void d(long j10) {
        this.f32232a = j10;
    }
}
