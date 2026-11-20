package l9;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public int f23366d;
    public final w1.a b = new w1.a();

    /* renamed from: c, reason: collision with root package name */
    public final sb.k f23365c = new sb.k();

    /* renamed from: e, reason: collision with root package name */
    public boolean f23367e = false;

    /* renamed from: a, reason: collision with root package name */
    public final w1.a f23364a = new w1.a();

    public p1(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f23364a.put(((k9.g) it.next()).u(), null);
        }
        this.f23366d = this.f23364a.keySet().size();
    }

    public final Task a() {
        return this.f23365c.a();
    }

    public final Set b() {
        return this.f23364a.keySet();
    }

    public final void c(b bVar, ConnectionResult connectionResult, String str) {
        this.f23364a.put(bVar, connectionResult);
        this.b.put(bVar, str);
        this.f23366d--;
        if (!connectionResult.A3()) {
            this.f23367e = true;
        }
        if (this.f23366d == 0) {
            if (!this.f23367e) {
                this.f23365c.c(this.b);
            } else {
                this.f23365c.b(new k9.c(this.f23364a));
            }
        }
    }
}
