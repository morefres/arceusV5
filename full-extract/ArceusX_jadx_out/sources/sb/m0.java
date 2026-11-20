package sb;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 extends l9.i {
    public final List b;

    public m0(l9.j jVar) {
        super(jVar);
        this.b = new ArrayList();
        this.f23323a.g("TaskOnStopCallback", this);
    }

    public static m0 l(Activity activity) {
        m0 m0Var;
        l9.j c10 = l9.i.c(activity);
        synchronized (c10) {
            try {
                m0Var = (m0) c10.d("TaskOnStopCallback", m0.class);
                if (m0Var == null) {
                    m0Var = new m0(c10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m0Var;
    }

    @Override // l9.i
    public final void k() {
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    h0 h0Var = (h0) ((WeakReference) it.next()).get();
                    if (h0Var != null) {
                        h0Var.zzc();
                    }
                }
                this.b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(h0 h0Var) {
        synchronized (this.b) {
            this.b.add(new WeakReference(h0Var));
        }
    }
}
