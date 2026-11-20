package uk;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import ek.q;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import uk.e;

/* loaded from: classes2.dex */
public class j extends CookieManager implements CookieJar {

    /* renamed from: a, reason: collision with root package name */
    public android.webkit.CookieManager f33025a;

    public j(CookiePolicy cookiePolicy) {
        super(null, cookiePolicy);
        if (rh.h.a().S1()) {
            e.m();
        }
    }

    public static /* synthetic */ void a(android.webkit.CookieManager cookieManager, String str, ValueCallback valueCallback, Boolean bool) {
        if (bool.booleanValue()) {
            cookieManager.flush();
            q.h("rbx.platform", "Flushed WebViewCookieHandler with Cookies from URL " + str);
        } else {
            q.e("rbx.platform", "Failed to Flush WebViewCookieHandler with Cookies from URL " + str);
        }
        valueCallback.onReceiveValue(bool);
    }

    public static j c() {
        return k.a().getInstance();
    }

    public String b(String str) {
        return rh.h.a().S1() ? e.d() : d().getCookie(str);
    }

    public final android.webkit.CookieManager d() {
        if (this.f33025a == null) {
            this.f33025a = android.webkit.CookieManager.getInstance();
        }
        return this.f33025a;
    }

    public void e(String str, String str2) {
        q.b("rbx.platform", "WebViewCookieHandler.removeSecurityCookie() url:" + str2 + " domain:" + str);
        if (rh.h.a().S1()) {
            e.t();
            return;
        }
        f(str2, ".ROBLOSECURITY=;expires=Wed, 10 May 2000 23:59:59 GMT;path=/;domain=" + str);
    }

    public void f(String str, String str2) {
        i(str, str2, e.c.f33013f);
    }

    public void g(String str, String str2, ValueCallback<Boolean> valueCallback) {
        h(str, str2, valueCallback, e.c.f33013f);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return null;
        }
        q.b("rbx.platform", "WebViewCookieHandler.get() " + map.toString());
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        String b = b(uri2);
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("Cookie", Collections.singletonList(b));
        }
        return hashMap;
    }

    public void h(final String str, String str2, final ValueCallback<Boolean> valueCallback, e.c cVar) {
        if (rh.h.a().S1()) {
            e.y(str2, cVar);
            valueCallback.onReceiveValue(Boolean.TRUE);
        } else {
            final android.webkit.CookieManager d10 = d();
            d10.setCookie(str, str2, new ValueCallback() { // from class: uk.i
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    j.a(d10, str, valueCallback, (Boolean) obj);
                }
            });
        }
    }

    public void i(String str, String str2, e.c cVar) {
        if (rh.h.a().S1()) {
            e.y(str2, cVar);
        } else {
            d().setCookie(str, str2);
        }
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<String>> it = get(httpUrl.uri(), new HashMap()).values().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                for (String str : it2.next().split(";")) {
                    Cookie parse = Cookie.parse(httpUrl, str);
                    if (parse != null) {
                        arrayList.add(parse);
                    }
                }
            }
        }
        q.b("rbx.platform", "WebViewCookieHandler.loadForRequest() " + arrayList.toString());
        return arrayList;
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return;
        }
        q.b("rbx.platform", "WebViewCookieHandler.put() " + map.toString());
        String host = uri.getHost();
        for (String str : map.keySet()) {
            if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                Iterator<String> it = map.get(str).iterator();
                while (it.hasNext()) {
                    i(host, it.next(), e.c.b);
                }
            }
        }
    }

    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        q.b("rbx.platform", "WebViewCookieHandler.saveFromResponse() " + list.toString());
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        hashMap.put("Set-Cookie", arrayList);
        put(httpUrl.uri(), hashMap);
    }
}
