package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1744a;
    public final CopyOnWriteArrayList<r> b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final Map<r, a> f1745c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final android.view.l f1746a;
        public android.view.p b;

        public void a() {
            this.f1746a.d(this.b);
            this.b = null;
        }
    }

    public p(Runnable runnable) {
        this.f1744a = runnable;
    }

    public void a(r rVar) {
        this.b.add(rVar);
        this.f1744a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void f(r rVar) {
        this.b.remove(rVar);
        a remove = this.f1745c.remove(rVar);
        if (remove != null) {
            remove.a();
        }
        this.f1744a.run();
    }
}
