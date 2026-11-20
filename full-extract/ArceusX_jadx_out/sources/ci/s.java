package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.roblox.client.RobloxApplication;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.a;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import rg.a1;

/* loaded from: classes2.dex */
public class s extends uk.j {
    public SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4980c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicBoolean f4981d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicBoolean f4982e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4983a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f4983a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.C0461a b = nh.a.b(this.f4983a);
            if (b != null) {
                s.this.b.edit().putString(this.b, b.a()).apply();
                s.this.b.edit().putString(this.b + "-2", b.b()).commit();
            }
        }
    }

    public s(CookiePolicy cookiePolicy) {
        super(cookiePolicy);
        this.f4980c = Executors.newSingleThreadExecutor();
        this.f4981d = new AtomicBoolean(true);
        this.f4982e = new AtomicBoolean(false);
        Context f10 = RobloxApplication.f();
        if (f10 != null) {
            this.b = f10.getSharedPreferences("webView_backup", 0);
        }
    }

    public static String o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.equals("auth." + a1.O()) || !str2.startsWith(".ROBLOSECURITY")) {
            return str;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (String str3 : str2.split(";")) {
            String trim = str3.trim();
            if (!z10 && trim.startsWith("domain")) {
                String[] split = trim.split("=");
                if (split.length == 2 && split[1].equals(a1.O())) {
                    z10 = true;
                }
            }
            if (z11 || !trim.equals("secure")) {
                if (z10 && z11) {
                    break;
                }
            } else {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return str;
        }
        return "https://" + str;
    }

    @Override // uk.j
    public String b(String str) {
        URL url;
        String b = super.b(str);
        if (this.f4981d.getAndSet(false) && ((b == null || mh.d.a(b)) && n())) {
            ek.q.b("ShellCookieHandler", "Cookie is invalid at first check.");
            this.f4982e.set(true);
        }
        if (this.f4982e.get()) {
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url != null) {
                ek.q.b("ShellCookieHandler", "no cookie for " + url.getHost());
                String m10 = m(str);
                if (!TextUtils.isEmpty(url.getHost()) && !TextUtils.isEmpty(m10) && ((b == null || !b.contains(".ROBLOSECURITY")) && m10.contains(".ROBLOSECURITY"))) {
                    ek.q.b("ShellCookieHandler", "Use back up.");
                    super.f(a1.O(), m10);
                    return m10;
                }
                ek.q.b("ShellCookieHandler", "No backup found.");
            }
        }
        return b;
    }

    @Override // uk.j
    public void f(String str, String str2) {
        l(str, str2);
        super.f(o(str, str2), str2);
    }

    @Override // uk.j
    public void g(String str, String str2, ValueCallback<Boolean> valueCallback) {
        super.g(o(str, str2), str2, valueCallback);
    }

    public void k() {
        String str;
        String b = super.b(a1.O());
        if (b == null || !b.contains(".ROBLOSECURITY")) {
            return;
        }
        String[] split = b.split(";");
        if (split.length == 0) {
            return;
        }
        int length = split.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                str = null;
                break;
            }
            str = split[i10];
            if (str.contains(".ROBLOSECURITY")) {
                break;
            } else {
                i10++;
            }
        }
        if (str == null) {
            return;
        }
        p(a1.O(), String.format("%s; domain=%s; path=/", str, a1.O()));
    }

    public final void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("auth." + a1.O())) {
            p(a1.O(), str2);
        }
    }

    public final String m(String str) {
        URL url;
        SharedPreferences sharedPreferences;
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
        }
        if (TextUtils.isEmpty(url.getHost()) || !url.getHost().endsWith(a1.O()) || (sharedPreferences = this.b) == null) {
            return null;
        }
        String string = sharedPreferences.getString(a1.O(), null);
        String string2 = this.b.getString(a1.O() + "-2", null);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            return nh.a.a(string, string2);
        }
        return null;
    }

    public final boolean n() {
        SharedPreferences sharedPreferences = this.b;
        return (sharedPreferences == null || sharedPreferences.getString(a1.O(), null) == null) ? false : true;
    }

    public final void p(String str, String str2) {
        if (this.b == null) {
            return;
        }
        this.f4980c.execute(new a(str2, str));
    }

    @Override // uk.j, okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        super.saveFromResponse(httpUrl, list);
        uk.h.j().n(httpUrl.uri().toString());
    }
}
