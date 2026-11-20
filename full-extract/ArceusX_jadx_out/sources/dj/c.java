package dj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f14818a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f14819c;

    /* renamed from: d, reason: collision with root package name */
    public List<String> f14820d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14821e;

    public c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14818a = jSONObject.getString("providerProductId");
            this.b = jSONObject.getString("providerProductType");
            this.f14819c = jSONObject.getString("chargeRequestId");
            this.f14820d = e(jSONObject.optString("offerId", null));
            this.f14821e = !this.f14818a.isEmpty() && (this.b.equalsIgnoreCase("subs") || this.b.equalsIgnoreCase("inapp")) && !this.f14819c.isEmpty();
        } catch (Exception unused) {
            this.f14821e = false;
            this.f14820d = Collections.EMPTY_LIST;
        }
    }

    public String a() {
        return this.f14819c;
    }

    public boolean b() {
        return this.f14821e;
    }

    public boolean c() {
        return this.b.equals("subs");
    }

    public List<String> d() {
        return this.f14820d;
    }

    public final List<String> e(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            String trim = str2.trim();
            if (!trim.isEmpty()) {
                arrayList.add(trim);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String f() {
        return this.f14818a;
    }

    public String g() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "{ providerProductId: " + this.f14818a + ", providerProductType: " + this.b + ", chargeRequestId: " + this.f14819c + ", offerIds: " + this.f14820d + " }";
    }
}
