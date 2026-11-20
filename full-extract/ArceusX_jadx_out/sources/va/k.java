package va;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k {
    public static volatile j b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f33367a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f33368c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final m f33369d = new m(new Object() { // from class: va.i
    }, null);

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f33370e = new AtomicInteger();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final android.content.Context r3) {
        /*
            va.j r0 = va.k.b
            if (r0 != 0) goto L45
            java.lang.Object r0 = va.k.f33367a
            monitor-enter(r0)
            va.j r1 = va.k.b     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L41
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f
            va.j r1 = va.k.b     // Catch: java.lang.Throwable -> L1e
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L15
            r3 = r2
        L15:
            if (r1 == 0) goto L20
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L1e
            if (r1 == r3) goto L3b
            goto L20
        L1e:
            r3 = move-exception
            goto L3d
        L20:
            va.g.a()     // Catch: java.lang.Throwable -> L1e
            va.l.a()     // Catch: java.lang.Throwable -> L1e
            va.h r1 = new va.h     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            va.r r1 = va.t.a(r1)     // Catch: java.lang.Throwable -> L1e
            va.f r2 = new va.f     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1e
            va.k.b = r2     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicInteger r3 = va.k.f33370e     // Catch: java.lang.Throwable -> L1e
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L1e
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            goto L41
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L3f
        L3f:
            r3 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r3
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.k.a(android.content.Context):void");
    }
}
