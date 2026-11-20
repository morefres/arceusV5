package ck;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f5009a;

    public b(JSONObject jSONObject) {
        this.f5009a = jSONObject.isNull("themeType") ? null : jSONObject.getString("themeType");
    }

    public String a() {
        return this.f5009a;
    }
}
