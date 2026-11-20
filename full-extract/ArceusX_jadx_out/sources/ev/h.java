package ev;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final List<h> f16320d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public Object f16321a;
    public n b;

    /* renamed from: c, reason: collision with root package name */
    public h f16322c;

    public h(Object obj, n nVar) {
        this.f16321a = obj;
        this.b = nVar;
    }

    public static h a(n nVar, Object obj) {
        List<h> list = f16320d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new h(obj, nVar);
                }
                h remove = list.remove(size - 1);
                remove.f16321a = obj;
                remove.b = nVar;
                remove.f16322c = null;
                return remove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(h hVar) {
        hVar.f16321a = null;
        hVar.b = null;
        hVar.f16322c = null;
        List<h> list = f16320d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
