package qj;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29865a;
    public Map<String, Long> b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29866a = new b();
    }

    public static b a() {
        return a.f29866a;
    }

    public synchronized JSONObject b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (String str : this.b.keySet()) {
            try {
                jSONObject.put(str, this.b.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public b() {
        this.f29865a = false;
        this.b = new HashMap();
    }
}
