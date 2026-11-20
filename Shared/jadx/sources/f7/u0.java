package f7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17026a = false;
    public final Set<b> b = new w1.b();

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, s7.i> f17027c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Comparator<x2.c<String, Float>> f17028d = new a();

    public class a implements Comparator<x2.c<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(x2.c<String, Float> cVar, x2.c<String, Float> cVar2) {
            float floatValue = cVar.b.floatValue();
            float floatValue2 = cVar2.b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f10);
    }

    public void a(String str, float f10) {
        if (this.f17026a) {
            s7.i iVar = this.f17027c.get(str);
            if (iVar == null) {
                iVar = new s7.i();
                this.f17027c.put(str, iVar);
            }
            iVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    public void b(boolean z10) {
        this.f17026a = z10;
    }
}
