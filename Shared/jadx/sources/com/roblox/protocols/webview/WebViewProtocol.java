package com.roblox.protocols.webview;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.protocols.webview.a;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import km.i;
import km.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WebViewProtocol {

    /* renamed from: a, reason: collision with root package name */
    public String f9788a = "WebViewProtocol";

    @NonNull
    public final ll.b b;

    /* renamed from: c, reason: collision with root package name */
    public Connection f9789c;

    /* renamed from: d, reason: collision with root package name */
    public Connection f9790d;

    /* renamed from: e, reason: collision with root package name */
    public Connection f9791e;

    public class a implements i {
        public a() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            l lVar = new l();
            JSONObject jSONObject2 = new JSONObject();
            lVar.f22865a = jSONObject2;
            try {
                jSONObject2.put(WebViewProtocol.getAvailableKey(), true);
                return lVar;
            } catch (JSONException unused) {
                Log.e(WebViewProtocol.this.f9788a, "Failed to write Availability to JSON");
                return lVar;
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            String r8 = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getUrlKey());
            if (r8 == null) {
                Log.e(WebViewProtocol.this.f9788a, "Attempted to open WebView window with no URL");
                return;
            }
            String r10 = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject q10 = WebViewProtocol.this.q(jSONObject, WebViewProtocol.getSearchParamsKey());
            WebViewProtocol.this.b.a(r8, r10, q10 != null ? WebViewProtocol.this.r(q10, WebViewProtocol.getSearchTypeKey()) : null, WebViewProtocol.this.p(jSONObject, WebViewProtocol.getIsVisibleKey()), WebViewProtocol.this.r(jSONObject, WebViewProtocol.getWindowTypeKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getShowDomainAsTitleKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getBackButtonVisibleKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getHideHeaderKey()));
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            String r8 = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getUrlKey());
            String r10 = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject q10 = WebViewProtocol.this.q(jSONObject, WebViewProtocol.getSearchParamsKey());
            WebViewProtocol.this.b.b(r8, r10, q10 != null ? WebViewProtocol.this.r(q10, WebViewProtocol.getSearchTypeKey()) : null, WebViewProtocol.this.p(jSONObject, WebViewProtocol.getIsVisibleKey()), WebViewProtocol.this.r(jSONObject, WebViewProtocol.getWindowTypeKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getShowDomainAsTitleKey()));
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            WebViewProtocol.this.b.c();
        }
    }

    public WebViewProtocol(@NonNull a.d dVar) {
        this.b = new com.roblox.protocols.webview.a(dVar);
        MessageBus.f().p(getProtocolName(), getIsAvailableId(), new a());
        this.f9789c = MessageBus.f().t(MessageBus.getMessageId(getProtocolName(), getOpenWindowId()), new b());
        this.f9790d = MessageBus.f().t(MessageBus.getMessageId(getProtocolName(), getMutateWindowId()), new c());
        this.f9791e = MessageBus.f().t(MessageBus.getMessageId(getProtocolName(), getCloseWindowId()), new d());
        initializeAndroidWebViewProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getAvailableKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getBackButtonVisibleKey();

    private static native String getCloseWindowId();

    private static native String getHandleWindowCloseId();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getHideHeaderKey();

    private static native String getIsAvailableId();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getIsVisibleKey();

    private static native String getMutateWindowId();

    private static native String getOpenWindowId();

    private static native String getProtocolName();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getSearchParamsKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getSearchTypeKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getShowDomainAsTitleKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getTitleKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getUrlKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getWindowTypeKey();

    private static native void initializeAndroidWebViewProtocol();

    public static native void signalJavascriptCallback(String str);

    public final Boolean p(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9788a, String.format("Received \"%s\" that is not a Boolean type", str));
            return null;
        }
    }

    public final JSONObject q(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getJSONObject(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9788a, String.format("Received \"%s\" that is not a JSON Object type", str));
            return null;
        }
    }

    public final String r(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9788a, String.format("Received \"%s\" that is not a String type", str));
            return null;
        }
    }

    public void s(String str) {
        signalJavascriptCallback(str);
    }

    public void t() {
        MessageBus.f().l(MessageBus.getMessageId(getProtocolName(), getHandleWindowCloseId()), new JSONObject());
    }
}
