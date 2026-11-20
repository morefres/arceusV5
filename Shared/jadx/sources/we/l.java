package we;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import ue.b;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f34257c = Logger.getLogger(l.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final l f34258d = new l();

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentMap<String, pe.m<?>> f34259a = new ConcurrentHashMap();
    public ConcurrentMap<String, Boolean> b = new ConcurrentHashMap();

    public static l d() {
        return f34258d;
    }

    public <P> pe.m<P> a(String str, Class<P> cls) {
        pe.m<P> mVar = (pe.m<P>) b(str);
        if (mVar.a().equals(cls)) {
            return mVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + mVar.getClass() + ", which only supports: " + mVar.a());
    }

    public final synchronized pe.m<?> b(String str) {
        if (!this.f34259a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f34259a.get(str);
    }

    public pe.m<?> c(String str) {
        return b(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r4.f34259a.putIfAbsent(r0, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(pe.m<?> r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r5.c()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L37
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = r4.b     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L37
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = r4.b     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L1e
            goto L37
        L1e:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "New keys are already disallowed for key type "
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            r6.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L35:
            r5 = move-exception
            goto L9e
        L37:
            java.util.concurrent.ConcurrentMap<java.lang.String, pe.m<?>> r1 = r4.f34259a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L35
            pe.m r1 = (pe.m) r1     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L86
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L50
            goto L86
        L50:
            java.util.logging.Logger r6 = we.l.f34257c     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r7.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Attempted overwrite of a registered key manager for key type "
            r7.append(r2)     // Catch: java.lang.Throwable -> L35
            r7.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L35
            r6.warning(r7)     // Catch: java.lang.Throwable -> L35
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L35
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r5}     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = java.lang.String.format(r7, r5)     // Catch: java.lang.Throwable -> L35
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L86:
            if (r6 != 0) goto L8e
            java.util.concurrent.ConcurrentMap<java.lang.String, pe.m<?>> r6 = r4.f34259a     // Catch: java.lang.Throwable -> L35
            r6.putIfAbsent(r0, r5)     // Catch: java.lang.Throwable -> L35
            goto L93
        L8e:
            java.util.concurrent.ConcurrentMap<java.lang.String, pe.m<?>> r6 = r4.f34259a     // Catch: java.lang.Throwable -> L35
            r6.put(r0, r5)     // Catch: java.lang.Throwable -> L35
        L93:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r5 = r4.b     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L35
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)
            return
        L9e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: we.l.e(pe.m, boolean, boolean):void");
    }

    public boolean f(String str) {
        return this.b.get(str).booleanValue();
    }

    public synchronized <P> void g(pe.m<P> mVar, boolean z10) {
        h(mVar, b.EnumC0592b.f32672a, z10);
    }

    public synchronized <P> void h(pe.m<P> mVar, b.EnumC0592b enumC0592b, boolean z10) {
        if (!enumC0592b.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(mVar, false, z10);
    }
}
