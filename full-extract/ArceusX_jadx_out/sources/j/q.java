package j;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q {
    public static u2.j a(u2.j jVar, u2.j jVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < jVar.f() + jVar2.f()) {
            Locale c10 = i10 < jVar.f() ? jVar.c(i10) : jVar2.c(i10 - jVar.f());
            if (c10 != null) {
                linkedHashSet.add(c10);
            }
            i10++;
        }
        return u2.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static u2.j b(u2.j jVar, u2.j jVar2) {
        return (jVar == null || jVar.e()) ? u2.j.d() : a(jVar, jVar2);
    }
}
