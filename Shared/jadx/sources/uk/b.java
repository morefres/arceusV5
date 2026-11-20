package uk;

import java.net.CookiePolicy;

/* loaded from: classes2.dex */
public class b implements a {
    public static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public j f32982a;

    @Override // uk.a
    public j getInstance() {
        j jVar;
        synchronized (b) {
            try {
                if (this.f32982a == null) {
                    this.f32982a = new j(CookiePolicy.ACCEPT_ALL);
                }
                jVar = this.f32982a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
