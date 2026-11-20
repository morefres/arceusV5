package vl;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.call.JNICallProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final MessageBus f33468a;
    public Connection b;

    /* renamed from: c, reason: collision with root package name */
    public Connection f33469c;

    /* renamed from: d, reason: collision with root package name */
    public Connection f33470d;

    /* renamed from: e, reason: collision with root package name */
    public Connection f33471e;

    /* renamed from: f, reason: collision with root package name */
    public Connection f33472f;

    /* renamed from: g, reason: collision with root package name */
    public Connection f33473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33474h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33475i;

    /* renamed from: j, reason: collision with root package name */
    public Set<a> f33476j = new HashSet();

    public interface a {
        void B(String str, boolean z10);

        void U(String str);

        void m0(String str);

        void o(String str, String str2, String str3, String str4, String str5, String str6);

        void p(String str, String str2, String str3, String str4, String str5, String str6);

        void u(String str, String str2);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final g f33477a = new g(null);
    }

    public g(MessageBus messageBus) {
        messageBus = messageBus == null ? MessageBus.f() : messageBus;
        this.f33468a = messageBus;
        this.f33473g = messageBus.t(JNICallProtocol.getHandleConnectingCallId(), new Callback() { // from class: vl.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                g.this.i(jSONObject);
            }
        });
        this.b = messageBus.t(JNICallProtocol.getHandleReceiveCallId(), new Callback() { // from class: vl.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                g.this.j(jSONObject);
            }
        });
        this.f33469c = messageBus.t(JNICallProtocol.getHandleAnswerCallId(), new Callback() { // from class: vl.c
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                g.this.k(jSONObject);
            }
        });
        this.f33470d = messageBus.t(JNICallProtocol.getHandleEndCallId(), new Callback() { // from class: vl.d
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                g.this.l(jSONObject);
            }
        });
        this.f33471e = messageBus.t(JNICallProtocol.getHandleActiveCallId(), new Callback() { // from class: vl.e
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                g.this.m(jSONObject);
            }
        });
        this.f33472f = messageBus.t(JNICallProtocol.getHandleRemovePendingReceivedCall(), new Callback() { // from class: vl.f
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                g.this.n(jSONObject);
            }
        });
    }

    public static g x() {
        return b.f33477a;
    }

    public void g(a aVar) {
        synchronized (this) {
            this.f33476j.add(aVar);
        }
    }

    public boolean h() {
        return this.f33474h;
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m(JSONObject jSONObject) {
        this.f33475i = false;
        String optString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String optString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String optString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String optString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String optString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String optString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33476j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).p(optString, optString2, optString3, optString5, optString4, optString6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void k(JSONObject jSONObject) {
        String optString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33476j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).U(optString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void i(JSONObject jSONObject) {
        this.f33475i = true;
        this.f33474h = true;
        String optString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String optString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String optString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String optString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String optString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String optString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33476j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).o(optString, optString2, optString3, optString5, optString4, optString6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void l(JSONObject jSONObject) {
        this.f33475i = false;
        this.f33474h = false;
        String optString = jSONObject.optString(JNICallProtocol.getCallActionKey());
        String optString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33476j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).u(optString2, optString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void j(JSONObject jSONObject) {
        this.f33474h = true;
        String optString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        boolean optBoolean = jSONObject.optBoolean(JNICallProtocol.getIsDuplicateKey());
        boolean optBoolean2 = jSONObject.optBoolean(JNICallProtocol.getIsExpiredKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33476j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).B(optString, (optBoolean || optBoolean2) ? false : true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void n(JSONObject jSONObject) {
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33476j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m0(jSONObject.optString(JNICallProtocol.getNotificationIdKey()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(String str, long j10, String str2, long j11, String str3, long j12, String str4, String str5, long j13, boolean z10, String str6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            jSONObject.put(JNICallProtocol.getCallerUserIdKey(), j10);
            jSONObject.put(JNICallProtocol.getCallerCombinedNameKey(), str2);
            jSONObject.put(JNICallProtocol.getCalleeUserIdKey(), j11);
            jSONObject.put(JNICallProtocol.getCalleeCombinedNameKey(), str3);
            jSONObject.put(JNICallProtocol.getPlaceIdKey(), j12);
            jSONObject.put(JNICallProtocol.getGameInstanceIdKey(), str4);
            jSONObject.put(JNICallProtocol.getReservedServerAccessCodeKey(), str5);
            jSONObject.put(JNICallProtocol.getCreatedUtcKey(), j13);
            jSONObject.put(JNICallProtocol.getIsCalleeMicEnabledKey(), z10);
            jSONObject.put(JNICallProtocol.getNotificationIdKey(), str6);
            JNICallProtocol.receiveCall(jSONObject.toString());
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for receive call failed with error.", e10);
        }
    }

    public void v(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f33468a.l(JNICallProtocol.getRejectCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for reject call failed with error: " + e10.getMessage());
        }
    }

    public void w(a aVar) {
        synchronized (this) {
            this.f33476j.remove(aVar);
        }
    }

    public void y(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f33468a.l(JNICallProtocol.getSuppressCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for suppress call failed with error: " + e10.getMessage());
        }
    }
}
