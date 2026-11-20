package n0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final List<g3> f25424a;

    public k3(List<g3> list) {
        this.f25424a = new ArrayList(list);
    }

    public static String d(k3 k3Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<g3> it = k3Var.f25424a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public boolean a(Class<? extends g3> cls) {
        Iterator<g3> it = this.f25424a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends g3> T b(Class<T> cls) {
        Iterator<g3> it = this.f25424a.iterator();
        while (it.hasNext()) {
            T t8 = (T) it.next();
            if (t8.getClass() == cls) {
                return t8;
            }
        }
        return null;
    }

    public <T extends g3> List<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (g3 g3Var : this.f25424a) {
            if (cls.isAssignableFrom(g3Var.getClass())) {
                arrayList.add(g3Var);
            }
        }
        return arrayList;
    }
}
