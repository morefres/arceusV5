package v2;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f33180a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33181c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f33182d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33183e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33184f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33185g;

    /* renamed from: h, reason: collision with root package name */
    public final String f33186h;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    public final String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List<List<byte[]>> b() {
        return this.f33182d;
    }

    public int c() {
        return this.f33183e;
    }

    public String d() {
        return this.f33186h;
    }

    public String e() {
        return this.f33180a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f33181c;
    }

    public String h() {
        return this.f33184f;
    }

    public String i() {
        return this.f33185g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f33180a + ", mProviderPackage: " + this.b + ", mQuery: " + this.f33181c + ", mSystemFont: " + this.f33184f + ", mVariationSettings: " + this.f33185g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f33182d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f33182d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f33183e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.f33180a = (String) x2.g.g(str);
        this.b = (String) x2.g.g(str2);
        this.f33181c = (String) x2.g.g(str3);
        this.f33182d = (List) x2.g.g(list);
        this.f33183e = 0;
        this.f33184f = str4;
        this.f33185g = str5;
        this.f33186h = a(str, str2, str3, str4, str5);
    }
}
