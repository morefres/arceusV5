package v7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f33280a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f33281c;

    public k(@NonNull String str, @NonNull String str2) {
        this.f33280a = str;
        this.b = str2;
        this.f33281c = new JSONObject(str);
        com.google.android.gms.internal.play_billing.s0.k();
    }

    public a a() {
        JSONObject jSONObject = this.f33281c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new a(optString, optString2);
    }

    public String b() {
        String optString = this.f33281c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    @NonNull
    public String c() {
        return this.f33280a;
    }

    @NonNull
    public String d() {
        return this.f33281c.optString("packageName");
    }

    @NonNull
    public List<String> e() {
        return j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return TextUtils.equals(this.f33280a, kVar.c()) && TextUtils.equals(this.b, kVar.h());
    }

    public int f() {
        return this.f33281c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    @NonNull
    public String g() {
        JSONObject jSONObject = this.f33281c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @NonNull
    public String h() {
        return this.b;
    }

    public int hashCode() {
        return this.f33280a.hashCode();
    }

    public boolean i() {
        return this.f33281c.optBoolean("acknowledged", true);
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f33281c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f33280a));
    }
}
