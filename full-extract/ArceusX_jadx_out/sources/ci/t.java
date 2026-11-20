package ci;

import java.net.CookiePolicy;

/* loaded from: classes2.dex */
public class t implements uk.a {
    public static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public s f4985a;

    @Override // uk.a
    public uk.j getInstance() {
        s sVar;
        synchronized (b) {
            try {
                if (this.f4985a == null) {
                    this.f4985a = new s(CookiePolicy.ACCEPT_ALL);
                }
                sVar = this.f4985a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
