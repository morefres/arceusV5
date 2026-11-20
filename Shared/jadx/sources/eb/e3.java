package eb;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        m3 m3Var = (m3) obj;
        m3 m3Var2 = (m3) obj2;
        d3 d3Var = new d3(m3Var);
        d3 d3Var2 = new d3(m3Var2);
        while (d3Var.hasNext() && d3Var2.hasNext()) {
            int compareTo = Integer.valueOf(d3Var.zza() & 255).compareTo(Integer.valueOf(d3Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(m3Var.d()).compareTo(Integer.valueOf(m3Var2.d()));
    }
}
