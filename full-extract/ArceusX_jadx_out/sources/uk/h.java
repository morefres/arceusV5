package uk;

import android.webkit.CookieManager;
import com.google.mlkit.common.MlKitException;
import ek.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import tk.e;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public tk.c f33016a;
    public volatile String b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f33017c;

    /* renamed from: d, reason: collision with root package name */
    public Set<d> f33018d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f33019e = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = h.this.f33018d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a();
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33021a;

        public b(String str) {
            this.f33021a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String i10;
            q.h("rbx.platform", "Verifying cookies.");
            if (rh.h.a().S1()) {
                i10 = h.this.i(CookieManager.getInstance().getCookie(this.f33021a));
                if (!h.this.f33017c) {
                    h.this.b = i10;
                    h.this.f33017c = true;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("verifyCookies: recorded initial jar baseline (present=");
                    sb2.append(i10 != null);
                    sb2.append("), not notifying.");
                    q.h("rbx.platform", sb2.toString());
                    return;
                }
            } else {
                i10 = h.this.i(j.c().b(this.f33021a));
            }
            if (i10 == null || i10.equals(h.this.b)) {
                return;
            }
            q.h("rbx.platform", "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers.");
            h.this.b = i10;
            h.this.f33016a.a().execute(h.this.f33019e);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final h f33022a = new h(new tk.e(new uk.d(Executors.newSingleThreadScheduledExecutor(), MlKitException.CODE_SCANNER_UNAVAILABLE), new e.a()));
    }

    public interface d {
        void a();
    }

    public h(tk.c cVar) {
        this.f33016a = cVar;
    }

    public static h j() {
        return c.f33022a;
    }

    public final String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(".ROBLOSECURITY")) == -1) {
            return null;
        }
        String substring = str.substring(indexOf);
        int indexOf2 = substring.indexOf(59);
        if (indexOf2 == -1) {
            indexOf2 = substring.length();
        }
        return substring.substring(0, indexOf2);
    }

    public void k(d dVar) {
        q.b("rbx.platform", "WebViewCookieHandler.registerCookieObserver().");
        this.f33018d.add(dVar);
    }

    public void l(String str) {
        this.b = i(str);
        this.f33017c = true;
    }

    public void m(d dVar) {
        q.b("rbx.platform", "WebViewCookieHandler.unregisterCookieObserver().");
        this.f33018d.remove(dVar);
    }

    public void n(String str) {
        if (this.f33018d.size() == 0) {
            return;
        }
        this.f33016a.b().execute(new b(str));
    }
}
