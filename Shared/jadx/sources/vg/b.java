package vg;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ek.q;
import org.json.JSONException;
import org.json.JSONObject;
import ug.c0;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33409a = "rbx.browserservice";
    public Handler b;

    /* renamed from: c, reason: collision with root package name */
    public d f33410c;

    /* renamed from: d, reason: collision with root package name */
    public Connection f33411d;

    /* renamed from: e, reason: collision with root package name */
    public Connection f33412e;

    /* renamed from: f, reason: collision with root package name */
    public Connection f33413f;

    public class a implements Callback {

        /* renamed from: vg.b$a$a, reason: collision with other inner class name */
        public class RunnableC0614a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ll.a f33415a;

            public RunnableC0614a(ll.a aVar) {
                this.f33415a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f33410c.d(this.f33415a);
            }
        }

        public a() {
        }

        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.OpenBrowserWindow : " + str);
            c0.w(c0.b.b, str);
            b.this.d(new RunnableC0614a(new ll.a(str)));
        }
    }

    /* renamed from: vg.b$b, reason: collision with other inner class name */
    public class C0615b implements Callback {

        /* renamed from: vg.b$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f33410c.e();
            }
        }

        public C0615b() {
        }

        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.CloseBrowserWindow");
            b.this.d(new a());
        }
    }

    public class c implements Callback {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ll.a f33419a;

            public a(ll.a aVar) {
                this.f33419a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f33410c.d(this.f33419a);
            }
        }

        /* renamed from: vg.b$c$b, reason: collision with other inner class name */
        public class RunnableC0616b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ll.a f33420a;

            public RunnableC0616b(ll.a aVar) {
                this.f33420a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f33410c.f(this.f33420a);
            }
        }

        public c() {
        }

        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.SendCommand : " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("command");
                if (string.equals("open")) {
                    String string2 = jSONObject.getString("url");
                    c0.w(c0.b.b, string2);
                    b.this.d(new a(new ll.a(string2, jSONObject.optString(Title.type, ""), Boolean.valueOf(jSONObject.optBoolean("visible", true)), Boolean.valueOf(jSONObject.optBoolean("modal", false)), Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled", false)), Boolean.valueOf(jSONObject.optBoolean("showDomainAsTitle", false)))));
                } else {
                    if (string.equals("config")) {
                        b.this.d(new RunnableC0616b(new ll.a(null, jSONObject.has(Title.type) ? jSONObject.optString(Title.type) : null, jSONObject.has("visible") ? Boolean.valueOf(jSONObject.optBoolean("visible")) : null, null, jSONObject.has("backNavigationDisabled") ? Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled")) : null, Boolean.FALSE)));
                        return;
                    }
                    q.e("rbx.browserservice", "ERROR, Command is not supported, BrowserService.SendCommand : " + str);
                }
            } catch (JSONException unused) {
                q.e("rbx.browserservice", "ERROR, BrowserService.SendCommand : " + str);
            }
        }
    }

    public interface d {
        void d(ll.a aVar);

        void e();

        void f(ll.a aVar);
    }

    public b(d dVar, Handler handler) {
        this.f33410c = dVar;
        this.b = handler;
    }

    public void c() {
        this.f33411d = MemStorage.bind("BrowserService.OpenBrowserWindow", new a());
        this.f33412e = MemStorage.bind("BrowserService.CloseBrowserWindow", new C0615b());
        this.f33413f = MemStorage.bind("BrowserService.SendCommand", new c());
    }

    public final void d(Runnable runnable) {
        this.b.post(runnable);
    }

    public void e() {
        Connection connection = this.f33411d;
        if (connection != null) {
            connection.disconnect();
        }
        Connection connection2 = this.f33412e;
        if (connection2 != null) {
            connection2.disconnect();
        }
        Connection connection3 = this.f33413f;
        if (connection3 != null) {
            connection3.disconnect();
        }
    }
}
