package rk;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public b f30685a;
    public Handler b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap<String, rk.b> f30686c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30687a;

        public a(String str) {
            this.f30687a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.evaluateJavascript(this.f30687a, null);
        }
    }

    public interface b {
        void a(String str, String str2);
    }

    public class c {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f30689a;

            public a(String str) {
                this.f30689a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e(this.f30689a);
            }
        }

        @JavascriptInterface
        public void executeRoblox(String str) {
            d.this.b.post(new a(str));
        }

        public c() {
        }
    }

    /* renamed from: rk.d$d, reason: collision with other inner class name */
    public static class C0539d extends rk.a {

        /* renamed from: e, reason: collision with root package name */
        public WeakReference<d> f30690e;

        public C0539d(WeakReference<d> weakReference) {
            this.f30690e = weakReference;
        }

        @Override // rk.a
        public void a(boolean z10, JSONObject jSONObject) {
            this.f30690e.get().c(b(), z10, jSONObject);
        }

        @Override // rk.a
        public Context c() {
            return this.f30690e.get().getContext();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30686c = new HashMap<>();
        d(context);
    }

    public void a() {
        stopLoading();
        removeJavascriptInterface("__globalRobloxAndroidBridge__");
        this.b.removeCallbacksAndMessages(null);
        setWebViewClient(null);
        setWebChromeClient(null);
        this.f30686c.clear();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        destroy();
    }

    public void b(String str) {
        if (this.b.getLooper().getThread() == Thread.currentThread()) {
            evaluateJavascript(str, null);
        } else {
            this.b.post(new a(str));
        }
    }

    public void c(String str, boolean z10, JSONObject jSONObject) {
        b(String.format("if (window.Roblox.Hybrid && window.Roblox.Hybrid.Bridge.nativeCallback && typeof window.Roblox.Hybrid.Bridge.nativeCallback === \"function\") { window.Roblox.Hybrid.Bridge.nativeCallback('%s', %s, %s); }", str, z10 ? "true" : "false", jSONObject != null ? jSONObject.toString() : "{}"));
    }

    public void d(Context context) {
        this.b = new Handler(getContext().getMainLooper());
        g(context);
        addJavascriptInterface(new c(), "__globalRobloxAndroidBridge__");
    }

    public void e(String str) {
        try {
            C0539d c0539d = new C0539d(new WeakReference(this));
            JSONObject jSONObject = new JSONObject(str);
            c0539d.i(jSONObject.getString("moduleID"));
            c0539d.h(jSONObject.getString("functionName"));
            c0539d.j(jSONObject.getJSONObject("params"));
            c0539d.g(jSONObject.optString("callbackID"));
            b bVar = this.f30685a;
            if (bVar != null) {
                bVar.a(c0539d.e(), c0539d.d());
            }
            rk.b bVar2 = this.f30686c.get(c0539d.e());
            if (bVar2 != null) {
                bVar2.a(c0539d);
                return;
            }
            Log.e("rbx.hybrid", "Couldn't find module with ID: " + c0539d.e());
        } catch (JSONException e10) {
            Log.e("rbx.hybrid", "There was an error parsing the JSON command: " + e10.getMessage());
        }
    }

    public void f(rk.b bVar) {
        this.f30686c.put(bVar.b(), bVar);
    }

    public void g(Context context) {
    }

    public void setCommandListener(b bVar) {
        this.f30685a = bVar;
    }

    public d(Context context) {
        super(context);
        this.f30686c = new HashMap<>();
        d(context);
    }
}
