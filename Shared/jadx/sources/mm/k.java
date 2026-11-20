package mm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f24606a;
    public MessageBus b = MessageBus.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f24607c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Integer, String[]> f24608d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Map<Integer, km.m> f24609e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f24610f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<Connection> f24611g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public Map<String, b> f24612h = new HashMap();

    public interface a {
        boolean e(Context context);
    }

    public interface b {
        void a(Context context, boolean z10, boolean z11);

        boolean b(Context context);

        boolean c(Context context, boolean z10);

        boolean d(Context context);
    }

    public k() {
        this.f24611g.add(this.b.w("PermissionsProtocol", "PermissionsRequest", new Callback() { // from class: mm.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                k.this.C(jSONObject);
            }
        }));
        this.f24611g.add(this.b.w("PermissionsProtocol", "HasPermissions", new Callback() { // from class: mm.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                k.this.D(jSONObject);
            }
        }));
        this.f24611g.add(this.b.w("PermissionsProtocol", "SupportsPermissions", new Callback() { // from class: mm.c
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                k.this.E(jSONObject);
            }
        }));
        this.f24611g.add(this.b.w("PermissionsProtocol", "ShouldShowPermissionUpsell", new Callback() { // from class: mm.d
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                k.this.F(jSONObject);
            }
        }));
        this.f24611g.add(this.b.w("PermissionsProtocol", "ShouldShowRequestPermissionRationale", new Callback() { // from class: mm.e
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                k.this.G(jSONObject);
            }
        }));
        if (rh.h.a().h2()) {
            this.b.r(new km.a("PermissionsProtocol", "PermissionsRequest", new km.j() { // from class: mm.f
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    k.this.H(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "HasPermissions", new km.j() { // from class: mm.g
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    k.this.I(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "SupportsPermissions", new km.j() { // from class: mm.h
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    k.this.J(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "ShouldShowPermissionUpsell", new km.j() { // from class: mm.i
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    k.this.K(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "ShouldShowRequestPermissionRationale", new km.j() { // from class: mm.j
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    k.this.L(jSONObject, mVar);
                }
            }));
        }
    }

    public static boolean B() {
        return false;
    }

    public static List<String> X(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static HashMap<String, String> q(String str, String[] strArr) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains("CAMERA_ACCESS")) {
            hashMap.put("missing_camera_access", "");
        }
        if (hashSet.contains("MICROPHONE_ACCESS")) {
            hashMap.put("missing_microphone_access", "");
        }
        if (hashSet.contains("LOCAL_NETWORK")) {
            hashMap.put("missing_local_network", "");
        }
        if (hashSet.contains("CONTACTS_ACCESS")) {
            hashMap.put("missing_contacts_access", "");
        }
        if (hashSet.contains("WRITE_MEDIA_STORAGE")) {
            hashMap.put("missing_write_media_storage", "");
        }
        if (hashSet.contains("POST_NOTIFICATIONS")) {
            hashMap.put("missing_post_notifications", "");
        }
        hashMap.put(NotificationCompat.CATEGORY_STATUS, str);
        return hashMap;
    }

    public static HashMap<String, String> r(String str, String[] strArr) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains("CAMERA_ACCESS")) {
            hashMap.put("missing_camera_access", "");
        }
        if (hashSet.contains("MICROPHONE_ACCESS")) {
            hashMap.put("missing_microphone_access", "");
        }
        if (hashSet.contains("LOCAL_NETWORK")) {
            hashMap.put("missing_local_network", "");
        }
        if (hashSet.contains("CONTACTS_ACCESS")) {
            hashMap.put("missing_contacts_access", "");
        }
        if (hashSet.contains("WRITE_MEDIA_STORAGE")) {
            hashMap.put("missing_write_media_storage", "");
        }
        if (hashSet.contains("POST_NOTIFICATIONS")) {
            hashMap.put("missing_post_notifications", "");
        }
        hashMap.put("upsellStatus", str);
        return hashMap;
    }

    public final boolean A(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 33 && strArr != null) {
            for (String str : strArr) {
                if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ void C(JSONObject jSONObject) {
        H(jSONObject, null);
    }

    public final /* synthetic */ void D(JSONObject jSONObject) {
        I(jSONObject, null);
    }

    public final /* synthetic */ void E(JSONObject jSONObject) {
        J(jSONObject, null);
    }

    public final /* synthetic */ void F(JSONObject jSONObject) {
        K(jSONObject, null);
    }

    public final /* synthetic */ void G(JSONObject jSONObject) {
        L(jSONObject, null);
    }

    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void I(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onHasPermissionRequest: " + jSONObject.toString());
        t(p(jSONObject, "HasPermissions"), mVar);
    }

    public final void N(String str, String[] strArr, km.m mVar) {
        JSONObject n10 = n(str, strArr, "HasPermissions");
        HashMap<String, String> q10 = q(str, strArr);
        Log.d("PermissionsProtocol", "Has permission response: " + n10.toString());
        this.b.m("PermissionsProtocol", "HasPermissions", n10, 0, q10);
        if (!rh.h.a().h2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22865a = n10;
        mVar.a(lVar);
    }

    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void H(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onPermissionRequest: " + jSONObject.toString());
        a0(p(jSONObject, "PermissionsRequest"), mVar);
    }

    public final void P(String str, String[] strArr, km.m mVar) {
        JSONObject n10 = n(str, strArr, "PermissionsRequest");
        this.b.m("PermissionsProtocol", "PermissionsRequest", n10, 0, q(str, strArr));
        if (!rh.h.a().h2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22865a = n10;
        mVar.a(lVar);
    }

    public void Q(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        WeakReference<Activity> weakReference;
        b bVar;
        WeakReference<Activity> weakReference2;
        if (this.f24608d.containsKey(Integer.valueOf(i10))) {
            String[] remove = this.f24608d.remove(Integer.valueOf(i10));
            HashMap hashMap = new HashMap();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                hashMap.put(strArr[i11], Integer.valueOf(iArr[i11]));
            }
            ArrayList arrayList = new ArrayList();
            String str = "AUTHORIZED";
            int length = remove.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                String str2 = remove[i12];
                List<String> u8 = u(str2);
                for (String str3 : u8) {
                    if (!hashMap.containsKey(str3) || ((Integer) hashMap.get(str3)).equals(-1)) {
                        str = "DENIED";
                        arrayList.add(str2);
                        break;
                    }
                }
                if (str2.equals("POST_NOTIFICATIONS") && u8.size() > 0) {
                    Integer num = (Integer) hashMap.get(u8.get(0));
                    q.e(i10, num != null && num.intValue() == 0);
                }
                if (str2.equals("POST_NOTIFICATIONS") && u8.size() > 0 && (weakReference2 = this.f24606a) != null && weakReference2.get() != null) {
                    Activity activity = this.f24606a.get();
                    synchronized (this) {
                        try {
                            if (this.f24612h.containsKey("POST_NOTIFICATIONS")) {
                                this.f24612h.get("POST_NOTIFICATIONS").a(activity.getApplicationContext(), k2.b.v(activity, u8.get(0)), str.equals("AUTHORIZED"));
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (str2.equals("MEDIA_PICKER") && u8.size() > 0 && (weakReference = this.f24606a) != null && weakReference.get() != null) {
                    Activity activity2 = this.f24606a.get();
                    synchronized (this) {
                        try {
                            bVar = this.f24612h.containsKey("MEDIA_PICKER") ? this.f24612h.get("MEDIA_PICKER") : null;
                        } finally {
                        }
                    }
                    if (bVar != null) {
                        try {
                            bVar.a(activity2.getApplicationContext(), k2.b.v(activity2, u8.get(0)), str.equals("AUTHORIZED"));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                i12++;
            }
            if (rh.h.a().h2() && this.f24609e.containsKey(Integer.valueOf(i10))) {
                P(str, (String[]) arrayList.toArray(new String[0]), this.f24609e.remove(Integer.valueOf(i10)));
            } else {
                P(str, (String[]) arrayList.toArray(new String[0]), null);
            }
        }
    }

    public final void R(String str, String[] strArr, km.m mVar) {
        JSONObject o8 = o(str, strArr, "ShouldShowPermissionUpsell");
        this.b.m("PermissionsProtocol", "ShouldShowPermissionUpsell", o8, 0, r(str, strArr));
        if (!rh.h.a().h2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22865a = o8;
        mVar.a(lVar);
    }

    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void K(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onShouldShowPermissionUpsellRequest: " + jSONObject.toString());
        l(p(jSONObject, "ShouldShowPermissionUpsell"), mVar);
    }

    public final void T(String str, String[] strArr, km.m mVar) {
        JSONObject o8 = o(str, strArr, "ShouldShowRequestPermissionRationale");
        this.b.m("PermissionsProtocol", "ShouldShowRequestPermissionRationale", o8, 0, r(str, strArr));
        if (!rh.h.a().h2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22865a = o8;
        mVar.a(lVar);
    }

    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void L(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onShouldShowRequestPermissionRationaleRequest: " + jSONObject.toString());
        m(p(jSONObject, "ShouldShowRequestPermissionRationale"), mVar);
    }

    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void J(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onSupportsPermissionsRequest: " + jSONObject.toString());
        try {
            JSONArray jSONArray = new JSONArray();
            if (!B()) {
                jSONArray.put("CAMERA_ACCESS");
            }
            jSONArray.put("MICROPHONE_ACCESS");
            jSONArray.put("LOCAL_NETWORK");
            if (!B()) {
                jSONArray.put("CONTACTS_ACCESS");
            }
            jSONArray.put("WRITE_MEDIA_STORAGE");
            jSONArray.put("POST_NOTIFICATIONS");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("permissions", jSONArray);
            Log.d("PermissionsProtocol", "Support permissions response: " + jSONObject2.toString());
            HashMap hashMap = new HashMap();
            hashMap.put("CAMERA_ACCESS", "");
            hashMap.put("MICROPHONE_ACCESS", "");
            hashMap.put("LOCAL_NETWORK", "");
            hashMap.put("CONTACTS_ACCESS", "");
            hashMap.put("WRITE_MEDIA_STORAGE", "");
            hashMap.put("POST_NOTIFICATIONS", "");
            this.b.m("PermissionsProtocol", "SupportsPermissions", jSONObject2, 0, hashMap);
            if (!rh.h.a().h2() || mVar == null) {
                return;
            }
            km.l lVar = new km.l();
            lVar.f22865a = jSONObject2;
            mVar.a(lVar);
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling supports permissions request: " + e10.toString());
            this.b.m("PermissionsProtocol", "SupportsPermissions", new JSONObject(), 13, new HashMap());
            if (!rh.h.a().h2() || mVar == null) {
                return;
            }
            km.l lVar2 = new km.l();
            lVar2.f22865a = new JSONObject();
            mVar.a(lVar2);
        }
    }

    public final String W(Activity activity) {
        boolean a10 = k2.n.f(activity).a();
        boolean z10 = false;
        boolean z11 = Build.VERSION.SDK_INT >= 33 && k2.b.v(activity, "android.permission.POST_NOTIFICATIONS");
        synchronized (this) {
            b bVar = this.f24612h.get("POST_NOTIFICATIONS");
            if (bVar instanceof a) {
                try {
                    z10 = ((a) bVar).e(activity.getApplicationContext());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return q.b(a10, z11, z10);
    }

    public void Y(String str) {
        synchronized (this) {
            this.f24612h.remove(str);
        }
    }

    public void Z(String[] strArr) {
        a0(strArr, null);
    }

    public final void a0(String[] strArr, km.m mVar) {
        Log.d("PermissionsProtocol", "requestPermissionsForFeatures: " + Arrays.toString(strArr));
        String[] v5 = v(strArr);
        if (v5 == null || v5.length == 0) {
            Log.e("PermissionsProtocol", "Can't request any permissions");
            P("DENIED", strArr, mVar);
            return;
        }
        WeakReference<Activity> weakReference = this.f24606a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while requesting permissions");
            P("DENIED", strArr, mVar);
            return;
        }
        Activity activity = this.f24606a.get();
        if (y(strArr, activity).size() == 0) {
            if (strArr[0].equals("MEDIA_PICKER")) {
                return;
            }
            P("AUTHORIZED", new String[0], mVar);
            return;
        }
        if (!rh.h.a().I5() && Build.VERSION.SDK_INT >= 33 && "android.permission.POST_NOTIFICATIONS".equals(v5[0])) {
            synchronized (this) {
                try {
                    if (!this.f24612h.containsKey("POST_NOTIFICATIONS") || !this.f24612h.get("POST_NOTIFICATIONS").c(activity.getApplicationContext(), k2.b.v(activity, v5[0]))) {
                        Log.i("PermissionsProtocol", "... should not request POST_NOTIFICATIONS based on protocol listener checks.");
                        P("DENIED", new String[0], mVar);
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    P("DENIED", new String[0], mVar);
                    return;
                }
            }
        }
        int i10 = this.f24610f;
        int i11 = (i10 % 100) + 100;
        this.f24610f = i10 + 1;
        this.f24608d.put(Integer.valueOf(i11), strArr);
        if (rh.h.a().h2()) {
            this.f24609e.put(Integer.valueOf(i11), mVar);
        }
        if (A(v5)) {
            q.d(i11, W(activity), true);
        }
        k2.b.u(activity, v5, i11);
    }

    public void b0(Context context) {
        Log.i("PermissionsProtocol", "requestPermissionsOnAppReady");
        WeakReference<Activity> weakReference = this.f24606a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "Activity is not set in requestPermissionsOnAppReady");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            n nVar = n.POST_NOTIFICATIONS;
            if (!e0(nVar)) {
                Z(new String[]{nVar.toString()});
                return;
            }
        }
        z(context);
    }

    public void c0() {
        Log.i("PermissionsProtocol", "requestPermissionsOnStartup: didRequest:" + this.f24607c);
        if (this.f24607c) {
            return;
        }
        this.f24607c = true;
        WeakReference<Activity> weakReference = this.f24606a;
        if (weakReference == null || weakReference.get() == null) {
            throw new IllegalStateException("Activity is not set");
        }
    }

    public void d0(Activity activity) {
        this.f24606a = new WeakReference<>(activity);
    }

    public boolean e0(n nVar) {
        WeakReference<Activity> weakReference = this.f24606a;
        if (weakReference != null && weakReference.get() != null) {
            return k2.b.v(this.f24606a.get(), s(nVar));
        }
        Log.e("PermissionsProtocol", "No Activity found while testing permissions");
        return false;
    }

    public void k(String str, b bVar) {
        synchronized (this) {
            if (bVar != null) {
                try {
                    this.f24612h.put(str, bVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void l(String[] strArr, km.m mVar) {
        Log.d("PermissionsProtocol", "checkShouldShowPermissionUpsellForFeatures: " + Arrays.toString(strArr));
        String[] v5 = v(strArr);
        if (v5 == null || v5.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission upsell");
            R("HIDE", strArr, mVar);
            return;
        }
        WeakReference<Activity> weakReference = this.f24606a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission upsell");
            R("HIDE", strArr, mVar);
        } else {
            List<String> w5 = w(strArr, this.f24606a.get());
            R(w5.isEmpty() ? "SHOW" : "HIDE", (String[]) w5.toArray(new String[0]), mVar);
        }
    }

    public final void m(String[] strArr, km.m mVar) {
        Log.d("PermissionsProtocol", "checkShouldShowRequestPermissionRationaleForFeatures: " + Arrays.toString(strArr));
        String[] v5 = v(strArr);
        if (v5 == null || v5.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission rationale");
            T("HIDE", strArr, mVar);
            return;
        }
        WeakReference<Activity> weakReference = this.f24606a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission rationale");
            T("HIDE", strArr, mVar);
        } else {
            List<String> x10 = x(strArr, this.f24606a.get());
            T(x10.isEmpty() ? "SHOW" : "HIDE", (String[]) x10.toArray(new String[0]), mVar);
        }
    }

    public final JSONObject n(String str, String[] strArr, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str);
            jSONObject.put("missingPermissions", new JSONArray(strArr));
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str2 + ": " + e10.toString());
            return jSONObject;
        }
    }

    public final JSONObject o(String str, String[] strArr, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("upsellStatus", str);
            jSONObject.put("hiddenUpsellPermissions", new JSONArray(strArr));
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str2 + ": " + e10.toString());
            return jSONObject;
        }
    }

    public final String[] p(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            String[] strArr = new String[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                strArr[i10] = jSONArray.getString(i10);
            }
            return strArr;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str + ": " + e10.toString());
            return new String[0];
        }
    }

    public abstract String s(n nVar);

    public final void t(String[] strArr, km.m mVar) {
        WeakReference<Activity> weakReference = this.f24606a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while getting permission status");
            N("DENIED", strArr, mVar);
        } else {
            List<String> y10 = y(strArr, this.f24606a.get());
            N(y10.isEmpty() ? "AUTHORIZED" : "DENIED", (String[]) y10.toArray(new String[0]), mVar);
        }
    }

    public final List<String> u(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        str.getClass();
        switch (str) {
            case "CONTACTS_ACCESS":
                arrayList.addAll(Arrays.asList(s(n.CONTACT)));
                break;
            case "POST_NOTIFICATIONS":
                arrayList.add(s(n.POST_NOTIFICATIONS));
                break;
            case "WRITE_MEDIA_STORAGE":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "WRITE_MEDIA_STORAGE requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(s(n.WRITE_EXTERNAL_STORAGE)));
                    break;
                }
            case "CAMERA_ACCESS":
                arrayList.addAll(Arrays.asList(s(n.CAMERA)));
                break;
            case "MICROPHONE_ACCESS":
                arrayList.addAll(Arrays.asList(s(n.MODIFY_AUDIO_SETTINGS), s(n.RECORD_AUDIO)));
                break;
            case "MEDIA_PICKER":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "MEDIA_PICKER requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(s(n.READ_EXTERNAL_STORAGE)));
                    break;
                }
            case "LOCAL_NETWORK":
                break;
            default:
                Log.w("PermissionsProtocol", "Permission " + str + " is not supported.");
                break;
        }
        return X(arrayList);
    }

    public final String[] v(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.addAll(u(str));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r0.add(r3);
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> w(java.lang.String[] r9, android.app.Activity r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r9.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L7e
            r3 = r9[r2]
            java.util.List r4 = r8.u(r3)
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = l2.b.a(r10, r5)
            r7 = -1
            if (r6 == r7) goto L2a
            r0.add(r3)
            goto L7b
        L2a:
            java.lang.String r6 = "android.permission.POST_NOTIFICATIONS"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L78
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r6 < r7) goto L74
            boolean r5 = k2.b.v(r10, r5)
            if (r5 == 0) goto L3f
            goto L74
        L3f:
            monitor-enter(r8)
            java.util.Map<java.lang.String, mm.k$b> r5 = r8.f24612h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.lang.String r6 = "POST_NOTIFICATIONS"
            boolean r5 = r5.containsKey(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r5 == 0) goto L65
            java.util.Map<java.lang.String, mm.k$b> r5 = r8.f24612h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.lang.String r6 = "POST_NOTIFICATIONS"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            mm.k$b r5 = (mm.k.b) r5     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            android.content.Context r6 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            boolean r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r5 != 0) goto L5f
            goto L65
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            goto L13
        L61:
            r9 = move-exception
            goto L72
        L63:
            r4 = move-exception
            goto L6a
        L65:
            r0.add(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            goto L7b
        L6a:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L61
            r0.add(r3)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            goto L7b
        L72:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            throw r9
        L74:
            r0.add(r3)
            goto L7b
        L78:
            r0.add(r3)
        L7b:
            int r2 = r2 + 1
            goto L7
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.k.w(java.lang.String[], android.app.Activity):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r0.add(r3);
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> x(java.lang.String[] r9, android.app.Activity r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r9.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L7e
            r3 = r9[r2]
            java.util.List r4 = r8.u(r3)
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = l2.b.a(r10, r5)
            r7 = -1
            if (r6 == r7) goto L2a
            r0.add(r3)
            goto L7b
        L2a:
            java.lang.String r6 = "android.permission.POST_NOTIFICATIONS"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L78
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r6 < r7) goto L74
            boolean r5 = k2.b.v(r10, r5)
            if (r5 != 0) goto L3f
            goto L74
        L3f:
            monitor-enter(r8)
            java.util.Map<java.lang.String, mm.k$b> r5 = r8.f24612h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.lang.String r6 = "POST_NOTIFICATIONS"
            boolean r5 = r5.containsKey(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r5 == 0) goto L65
            java.util.Map<java.lang.String, mm.k$b> r5 = r8.f24612h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.lang.String r6 = "POST_NOTIFICATIONS"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            mm.k$b r5 = (mm.k.b) r5     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            android.content.Context r6 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            boolean r5 = r5.d(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r5 != 0) goto L5f
            goto L65
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            goto L13
        L61:
            r9 = move-exception
            goto L72
        L63:
            r4 = move-exception
            goto L6a
        L65:
            r0.add(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            goto L7b
        L6a:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L61
            r0.add(r3)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            goto L7b
        L72:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            throw r9
        L74:
            r0.add(r3)
            goto L7b
        L78:
            r0.add(r3)
        L7b:
            int r2 = r2 + 1
            goto L7
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.k.x(java.lang.String[], android.app.Activity):java.util.List");
    }

    @NonNull
    public final List<String> y(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = u(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (l2.b.a(activity, it.next()) == -1) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return arrayList;
    }

    public final void z(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        if (Build.VERSION.SDK_INT >= 28) {
            intent.addFlags(268435456);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
