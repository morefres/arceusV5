package be;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v implements o {
    public static void c(ClassLoader classLoader, Set set, u uVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object c10 = s.c(classLoader);
        f0 b = g0.b(c10, "nativeLibraryDirectories", List.class);
        synchronized (ae.q0.class) {
            ArrayList arrayList = new ArrayList((Collection) b.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            b.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] a10 = uVar.a(c10, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (ae.q0.class) {
                g0.a(c10, "nativeLibraryPathElements", Object.class).e(Arrays.asList(a10));
            }
            return;
        }
        d0 d0Var = new d0("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(d0Var, (IOException) arrayList2.get(i10));
            } catch (Exception unused) {
            }
        }
        throw d0Var;
    }
}
