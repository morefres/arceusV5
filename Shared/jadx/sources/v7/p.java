package v7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f33295a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33297d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33298e;

    public p(String str) {
        this.f33295a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String optString = jSONObject.optString(Payload.TYPE);
        this.f33296c = optString;
        this.f33297d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f33298e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.f33295a, ((p) obj).f33295a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33295a.hashCode();
    }

    @NonNull
    public String toString() {
        return "UnfetchedProduct{productId='" + this.b + "', productType='" + this.f33296c + "', statusCode=" + this.f33297d + "}";
    }
}
