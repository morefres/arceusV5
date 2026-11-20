package eb;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 {
    public static final Appendable a(Appendable appendable, Iterator it, e0 e0Var, String str) {
        String str2;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(e0.d(entry.getKey()));
            appendable.append(" : ");
            appendable.append(e0.d(entry.getValue()));
            while (it.hasNext()) {
                str2 = e0Var.f15782a;
                appendable.append(str2);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(e0.d(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(e0.d(entry2.getValue()));
            }
        }
        return appendable;
    }
}
