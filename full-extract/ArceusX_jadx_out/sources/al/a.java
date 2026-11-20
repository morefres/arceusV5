package al;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f586a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f587c;

    /* renamed from: d, reason: collision with root package name */
    public final String f588d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f589e;

    public a(String str) {
        JSONObject jSONObject;
        String str2;
        JSONObject optJSONObject;
        this.f588d = str;
        String str3 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        int i10 = -1;
        if (jSONObject != null) {
            this.f589e = true;
            JSONArray optJSONArray = jSONObject.optJSONArray("errors");
            if (optJSONArray != null && optJSONArray.length() > 0 && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                i10 = optJSONObject.optInt("code", -1);
                str3 = optJSONObject.optString("message");
                str2 = optJSONObject.optString("userFacingMessage");
                this.f586a = i10;
                this.b = str3;
                this.f587c = str2;
            }
        } else {
            this.f589e = false;
        }
        str2 = null;
        this.f586a = i10;
        this.b = str3;
        this.f587c = str2;
    }
}
