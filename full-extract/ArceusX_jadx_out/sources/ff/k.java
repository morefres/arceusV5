package ff;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import n9.m;
import u9.o;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f17184a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17185c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17186d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17187e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17188f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17189g;

    public k(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        m.q(!o.a(str), "ApplicationId must be set.");
        this.b = str;
        this.f17184a = str2;
        this.f17185c = str3;
        this.f17186d = str4;
        this.f17187e = str5;
        this.f17188f = str6;
        this.f17189g = str7;
    }

    public static k a(@NonNull Context context) {
        n9.o oVar = new n9.o(context);
        String a10 = oVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new k(a10, oVar.a("google_api_key"), oVar.a("firebase_database_url"), oVar.a("ga_trackingId"), oVar.a("gcm_defaultSenderId"), oVar.a("google_storage_bucket"), oVar.a("project_id"));
    }

    @NonNull
    public String b() {
        return this.f17184a;
    }

    @NonNull
    public String c() {
        return this.b;
    }

    public String d() {
        return this.f17187e;
    }

    public String e() {
        return this.f17189g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n9.k.b(this.b, kVar.b) && n9.k.b(this.f17184a, kVar.f17184a) && n9.k.b(this.f17185c, kVar.f17185c) && n9.k.b(this.f17186d, kVar.f17186d) && n9.k.b(this.f17187e, kVar.f17187e) && n9.k.b(this.f17188f, kVar.f17188f) && n9.k.b(this.f17189g, kVar.f17189g);
    }

    public int hashCode() {
        return n9.k.c(this.b, this.f17184a, this.f17185c, this.f17186d, this.f17187e, this.f17188f, this.f17189g);
    }

    public String toString() {
        return n9.k.d(this).a("applicationId", this.b).a("apiKey", this.f17184a).a("databaseUrl", this.f17185c).a("gcmSenderId", this.f17187e).a("storageBucket", this.f17188f).a("projectId", this.f17189g).toString();
    }
}
