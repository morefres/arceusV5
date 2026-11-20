package sk;

import ev.c;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static c f31407a;

    public static c a() {
        if (f31407a == null) {
            synchronized (b.class) {
                try {
                    if (f31407a == null) {
                        f31407a = c.b().a();
                    }
                } finally {
                }
            }
        }
        return f31407a;
    }
}
