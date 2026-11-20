package im;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.roblox.universalapp.linking.JNILinkingProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import km.l;
import km.n;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final MessageBus f20946a;
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20947c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<Connection> f20948d;

    /* renamed from: e, reason: collision with root package name */
    public Connection f20949e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<Intent> f20950f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20951g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f20952h;

    /* renamed from: i, reason: collision with root package name */
    public JSONObject f20953i;

    /* renamed from: j, reason: collision with root package name */
    public Optional<i> f20954j;

    /* renamed from: k, reason: collision with root package name */
    public Optional<h> f20955k;

    /* renamed from: l, reason: collision with root package name */
    public im.h f20956l;

    public class a implements km.i {
        public a() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.I(jSONObject);
        }
    }

    public class b implements km.i {
        public b() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.J(jSONObject);
        }
    }

    public class c implements km.i {
        public c() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.u(jSONObject);
        }
    }

    public class d implements km.i {
        public d() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.t(jSONObject);
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            f.this.D(jSONObject);
        }
    }

    /* renamed from: im.f$f, reason: collision with other inner class name */
    public class C0367f implements Callback {
        public C0367f() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            f.this.s(jSONObject);
        }
    }

    public class g implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f20963a;

        public g(k kVar) {
            this.f20963a = kVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                this.f20963a.a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to check whether this URL is registered due to: " + e10.getMessage());
            }
        }
    }

    public interface h {
        void a(JSONObject jSONObject);
    }

    public interface i {
        void a(boolean z10);
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public static final f f20964a = new f();
    }

    public interface k {
        void a(boolean z10);
    }

    public static f F() {
        return j.f20964a;
    }

    public void A(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void B(JSONObject jSONObject) {
        synchronized (this.f20952h) {
            this.f20953i = jSONObject;
        }
    }

    public void C(Intent intent) {
        this.f20950f.set(intent);
    }

    public void D(JSONObject jSONObject) {
        try {
            boolean z10 = jSONObject.getBoolean(JNILinkingProtocol.getEnableTrackingKey());
            if (this.f20954j.isPresent()) {
                this.f20954j.get().a(z10);
            } else {
                Log.e("LinkingProtocol", "Recevied attempt to toggle tracking with no implementation available.");
            }
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Received exception while trying to check enableTracking value: " + e10.toString());
        }
    }

    public void E(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUIDKey(), str);
            this.f20946a.l(JNILinkingProtocol.getSetUIDId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for UID detection failed with error: " + e10.getMessage());
        }
    }

    public void G(Context context) {
        if (this.f20947c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Already started.");
            return;
        }
        this.f20947c = true;
        if (!this.f20951g) {
            if (rh.h.a().s()) {
                this.f20946a.s(new km.k(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new km.i() { // from class: im.d
                    @Override // km.i
                    public final l a(JSONObject jSONObject) {
                        l u8;
                        u8 = f.this.u(jSONObject);
                        return u8;
                    }
                }));
            } else {
                this.f20946a.p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new c());
            }
        }
        if (rh.h.a().i4()) {
            this.f20946a.p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsTrackingAvailableId(), new d());
            this.f20948d.add(this.f20946a.t(MessageBus.getMessageId(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getSetTrackingEnabledId()), new e()));
        }
        this.f20948d.add(this.f20946a.t(MessageBus.getMessageId("Linking", "adConsentResolved"), new C0367f()));
        this.f20951g = true;
    }

    public void H() {
        if (!this.f20947c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Not started.");
            return;
        }
        int i10 = 0;
        this.f20947c = false;
        ArrayList<Connection> arrayList = this.f20948d;
        int size = arrayList.size();
        while (i10 < size) {
            Connection connection = arrayList.get(i10);
            i10++;
            connection.a();
        }
        this.f20948d.clear();
    }

    public l I(JSONObject jSONObject) {
        l lVar = new l();
        JSONObject jSONObject2 = new JSONObject();
        Log.d("LinkingProtocol", "onSupportsSwitchToSettingsApp: " + jSONObject.toString());
        try {
            jSONObject2.put("support", true);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "JSON exception while handling supports switch to settings app request: " + e10.toString());
        }
        lVar.f22865a = jSONObject2;
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r7.equals("camera") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r5 = new android.content.Intent("android.settings.SETTINGS");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public km.l J(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r0 = "route"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "switchToSettingsApp: "
            r1.append(r2)
            java.lang.String r2 = r7.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "LinkingProtocol"
            android.util.Log.d(r2, r1)
            km.l r1 = new km.l
            r1.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            rh.i r3 = rh.h.a()     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            boolean r3 = r3.V1()     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            java.lang.String r4 = "android.settings.SETTINGS"
            if (r3 == 0) goto L8e
            boolean r3 = r7.has(r0)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            r5 = 0
            if (r3 == 0) goto L86
            java.lang.String r7 = r7.getString(r0)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            int r0 = r7.hashCode()     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            r3 = -1367751899(0xffffffffae79c325, float:-5.678937E-11)
            if (r0 == r3) goto L67
            r3 = -567451565(0xffffffffde2d6053, float:-3.1232692E18)
            if (r0 == r3) goto L5e
            r3 = 1370921258(0x51b6992a, float:9.8031714E10)
            if (r0 == r3) goto L51
            goto L86
        L51:
            java.lang.String r0 = "microphone"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            if (r7 == 0) goto L86
            goto L6f
        L5a:
            r7 = move-exception
            goto L9e
        L5c:
            r7 = move-exception
            goto Lb7
        L5e:
            java.lang.String r0 = "contacts"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            if (r7 == 0) goto L86
            goto L6f
        L67:
            java.lang.String r0 = "camera"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            if (r7 == 0) goto L86
        L6f:
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            java.lang.String r0 = "package"
            android.content.Context r3 = r6.b     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            android.net.Uri r0 = android.net.Uri.fromParts(r0, r3, r5)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            r7.setData(r0)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            r5 = r7
        L86:
            if (r5 != 0) goto L93
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            r5.<init>(r4)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            goto L93
        L8e:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            r5.<init>(r4)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
        L93:
            r7 = 268435456(0x10000000, float:2.524355E-29)
            r5.setFlags(r7)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            android.content.Context r7 = r6.b     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            r7.startActivity(r5)     // Catch: java.lang.Exception -> L5a android.content.ActivityNotFoundException -> L5c
            return r1
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Exception while handling switch to settings app request: "
            r0.append(r3)
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r2, r7)
            goto Lcf
        Lb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Activity not found exception while handling switch to settings app request Activity Not Found: "
            r0.append(r3)
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r2, r7)
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: im.f.J(org.json.JSONObject):km.l");
    }

    public void K(JSONObject jSONObject, String str) {
        synchronized (this.f20952h) {
            if (jSONObject != null) {
                if (jSONObject == this.f20953i) {
                    try {
                        jSONObject.put("url", str);
                    } catch (JSONException e10) {
                        Log.e("LinkingProtocol", "Failed to update DLIC seed URL: " + e10.getMessage());
                    }
                }
            }
        }
    }

    public void d(String str, String str2) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        String nativeCreateAtIngress = JNILinkingProtocol.nativeCreateAtIngress(str, str2);
        if (nativeCreateAtIngress != null) {
            try {
                if (!nativeCreateAtIngress.isEmpty()) {
                    jSONObject = new JSONObject(nativeCreateAtIngress);
                    B(jSONObject);
                }
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                B(null);
                return;
            }
        }
        jSONObject = null;
        B(jSONObject);
    }

    public void e(String str, String str2) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
        if (rh.h.a().g5()) {
            if (rh.h.a().e()) {
                d(str, str2);
                return;
            }
            String nativeCreateAtIngress = JNILinkingProtocol.nativeCreateAtIngress(str, str2);
            if (nativeCreateAtIngress != null) {
                try {
                    if (!nativeCreateAtIngress.isEmpty()) {
                        jSONObject = new JSONObject(nativeCreateAtIngress);
                        B(jSONObject);
                    }
                } catch (JSONException e10) {
                    Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                    B(null);
                    return;
                }
            }
            jSONObject = null;
            B(jSONObject);
        }
    }

    public void f(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
        if (rh.h.a().g5()) {
            if (rh.h.a().e()) {
                d(str, str2);
                return;
            }
            String nativeCreateAtIngress = JNILinkingProtocol.nativeCreateAtIngress(str, str2);
            if (nativeCreateAtIngress != null) {
                try {
                    if (!nativeCreateAtIngress.isEmpty()) {
                        jSONObject = new JSONObject(nativeCreateAtIngress);
                        B(jSONObject);
                    }
                } catch (JSONException e10) {
                    Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                    B(null);
                    return;
                }
            }
            jSONObject = null;
            B(jSONObject);
        }
    }

    public final void g(JSONObject jSONObject) {
        synchronized (this.f20952h) {
            try {
                JSONObject jSONObject2 = this.f20953i;
                if (jSONObject2 != null) {
                    jSONObject.put("dlicSeed", jSONObject2);
                    this.f20953i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public JSONObject h(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str != null && str2 != null) {
            y(str, str2);
            String nativeCreateAtIngressWithOrigin = JNILinkingProtocol.nativeCreateAtIngressWithOrigin(str, str2, z10);
            if (nativeCreateAtIngressWithOrigin != null) {
                try {
                    if (!nativeCreateAtIngressWithOrigin.isEmpty()) {
                        jSONObject = new JSONObject(nativeCreateAtIngressWithOrigin);
                        B(jSONObject);
                        return jSONObject;
                    }
                } catch (JSONException e10) {
                    Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                    B(null);
                }
            }
            jSONObject = null;
            B(jSONObject);
            return jSONObject;
        }
        return null;
    }

    public String i(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return JNILinkingProtocol.nativeCreateInternalDlic(str, str2);
    }

    public void j(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (rh.h.a().Y3() && p(JNILinkingProtocol.nativeDlicGetUrl(str))) {
            JNILinkingProtocol.nativeDlicSetTerminated(str, "success", "explicit_report", "external_browser_handoff");
        } else {
            JNILinkingProtocol.nativeDetectDlic(str);
        }
    }

    public void k(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            g(jSONObject);
            if (rh.h.a().Y3() && p(str)) {
                return;
            }
            this.f20946a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void l(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            if (str2 != null) {
                jSONObject.put(JNILinkingProtocol.getAttributionUrlKey(), str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                jSONObject.put("attributionAdName", str3);
            }
            g(jSONObject);
            this.f20946a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void m(String str) {
        if (str == null) {
            return;
        }
        if (rh.h.a().Y3() && p(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            this.f20946a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void n(String str, String str2, String str3) {
        if (str == null || str.isEmpty() || str2 == null || str3 == null) {
            return;
        }
        JNILinkingProtocol.nativeDlicSetTerminated(str, str2, "explicit_report", str3);
    }

    public void o(String str, k kVar) {
        if (rh.h.a().Y3() && q(JNILinkingProtocol.nativeDlicGetUrl(str), false)) {
            kVar.a(true);
        } else {
            kVar.a(JNILinkingProtocol.nativeEngineShouldHandleDlic(str));
        }
    }

    public final boolean p(String str) {
        return q(str, true);
    }

    public final boolean q(String str, boolean z10) {
        String queryParameter;
        if (str == null || !str.regionMatches(true, 0, "roblox://open-external?", 0, 23) || (queryParameter = Uri.parse(str).getQueryParameter("url")) == null || !im.a.d(queryParameter)) {
            return false;
        }
        if (!z10) {
            return true;
        }
        new im.a("LinkingProtocol").g(this.b, queryParameter);
        return true;
    }

    public void r(String str, final k kVar) {
        if (rh.h.a().Y3() && q(str, false)) {
            kVar.a(true);
            return;
        }
        if (rh.h.a().F()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
                this.f20946a.k(new km.b(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsURLRegisteredId(), jSONObject, new km.g() { // from class: im.e
                }));
                return;
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e10.getMessage());
                return;
            }
        }
        if (rh.h.a().s()) {
            this.f20949e = this.f20946a.v(new n(JNILinkingProtocol.getIsURLRegisteredResponseId(), new km.g() { // from class: im.e
            }));
        } else {
            this.f20949e = this.f20946a.u(JNILinkingProtocol.getIsURLRegisteredResponseId(), new g(kVar), true);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(JNILinkingProtocol.getUrlKey(), str);
            this.f20946a.l(JNILinkingProtocol.getIsURLRegisteredRequestId(), jSONObject2);
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e11.getMessage());
        }
    }

    public final void s(JSONObject jSONObject) {
        if (this.f20955k.isPresent()) {
            this.f20955k.get().a(jSONObject);
        } else {
            Log.e("LinkingProtocol", "Received adConsentResolved with no implementation available.");
        }
    }

    public l t(JSONObject jSONObject) {
        l lVar = new l();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(JNILinkingProtocol.getTrackingAvailableKey(), this.f20956l.a());
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to write failure JSON", e10);
        }
        lVar.f22865a = jSONObject2;
        return lVar;
    }

    public final l u(JSONObject jSONObject) {
        l lVar = new l();
        JSONObject jSONObject2 = new JSONObject();
        try {
            String string = jSONObject.getString(JNILinkingProtocol.getUrlKey());
            Log.i("LinkingProtocol", "Opening URL: " + string);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            this.b.startActivity(intent);
            jSONObject2.put(JNILinkingProtocol.getSuccessKey(), true);
        } catch (ActivityNotFoundException e10) {
            Log.e("LinkingProtocol", "Activity not found: " + e10.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            } catch (JSONException unused) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e10.getMessage());
            }
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Retrieving URL from JSON params for Open URL Request failed with error: " + e11.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            } catch (JSONException unused2) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e11.getMessage());
            }
        }
        lVar.f22865a = jSONObject2;
        return lVar;
    }

    public void v() {
        Intent andSet = this.f20950f.getAndSet(null);
        if (andSet != null) {
            k(andSet.getDataString());
        }
    }

    public void w(h hVar) {
        this.f20955k = Optional.of(hVar);
    }

    public void x(i iVar) {
        this.f20954j = Optional.of(iVar);
    }

    public void y(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
    }

    public void z(String str, String str2, boolean z10) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
    }

    public f() {
        MessageBus f10 = MessageBus.f();
        this.f20946a = f10;
        this.f20947c = false;
        this.f20948d = new ArrayList<>();
        this.f20949e = null;
        this.f20950f = new AtomicReference<>(null);
        this.f20951g = false;
        this.f20952h = new Object();
        this.f20953i = null;
        if (rh.h.a().s()) {
            f10.s(new km.k("Linking", "supportsSwitchToSettingsApp", new km.i() { // from class: im.b
                @Override // km.i
                public final l a(JSONObject jSONObject) {
                    return f.this.I(jSONObject);
                }
            }));
            f10.s(new km.k("Linking", "switchToSettingsApp", new km.i() { // from class: im.c
                @Override // km.i
                public final l a(JSONObject jSONObject) {
                    return f.this.J(jSONObject);
                }
            }));
        } else {
            f10.p("Linking", "supportsSwitchToSettingsApp", new a());
            f10.p("Linking", "switchToSettingsApp", new b());
        }
        this.f20956l = new im.h();
        this.f20954j = Optional.empty();
        this.f20955k = Optional.empty();
    }
}
