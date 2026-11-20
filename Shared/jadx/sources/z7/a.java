package z7;

import androidx.annotation.NonNull;
import b8.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f37943c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f37944d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f37945e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set<y7.c> f37946f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f37947g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f37948h;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f37949a;
    public final String b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f37943c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f37944d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f37945e = a12;
        f37946f = Collections.unmodifiableSet(new HashSet(Arrays.asList(y7.c.b("proto"), y7.c.b("json"))));
        f37947g = new a(a10, null);
        f37948h = new a(a11, a12);
    }

    public a(@NonNull String str, String str2) {
        this.f37949a = str;
        this.b = str2;
    }

    @NonNull
    public static a c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // b8.g
    public Set<y7.c> a() {
        return f37946f;
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.f37949a == null) {
            return null;
        }
        String str2 = this.f37949a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.b;
    }

    @NonNull
    public String e() {
        return this.f37949a;
    }

    @Override // b8.f
    public byte[] getExtras() {
        return b();
    }

    @Override // b8.f
    @NonNull
    public String getName() {
        return "cct";
    }
}
