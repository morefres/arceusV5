package uk;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f33026a = new Object();
    public static a b;

    public static a a() {
        synchronized (f33026a) {
            try {
                a aVar = b;
                if (aVar != null) {
                    return aVar;
                }
                b bVar = new b();
                b = bVar;
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(a aVar) {
        synchronized (f33026a) {
            b = aVar;
        }
    }
}
