package mh;

import android.content.Context;
import com.roblox.client.flags.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24504a = "configure_dev_settings";
    public final String b = "config_json";

    /* renamed from: c, reason: collision with root package name */
    public fh.d f24505c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f24506d;

    /* renamed from: e, reason: collision with root package name */
    public Context f24507e;

    public a(Context context) {
        this.f24507e = context;
        fh.d dVar = new fh.d(context);
        this.f24505c = dVar;
        fh.c a10 = dVar.a(context);
        this.f24506d = a10 != null ? a10.i() : new JSONObject();
    }

    public static JSONObject b(Context context) {
        if (context != null) {
            return new a(context).a();
        }
        return null;
    }

    public static String c(JSONObject jSONObject, String str, com.roblox.client.flags.a aVar) {
        String d10 = d(str, aVar);
        if (jSONObject.has(d10)) {
            return d10;
        }
        if (jSONObject.has(str)) {
            return str;
        }
        return null;
    }

    public static String d(String str, com.roblox.client.flags.a aVar) {
        if (aVar instanceof a.d) {
            return "FFlag" + str;
        }
        if (aVar instanceof a.f) {
            return "FInt" + str;
        }
        if (!(aVar instanceof a.g)) {
            return str;
        }
        return "FString" + str;
    }

    public JSONObject a() {
        return this.f24506d;
    }
}
