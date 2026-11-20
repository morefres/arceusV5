package hg;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {
    public static volatile d b;

    /* renamed from: a, reason: collision with root package name */
    public final Set<f> f19412a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = b;
                if (dVar == null) {
                    dVar = new d();
                    b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f19412a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f19412a);
        }
        return unmodifiableSet;
    }
}
