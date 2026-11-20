package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import c9.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n9.m;
import o9.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u9.h;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e();

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public static final u9.e f5661s = h.c();

    /* renamed from: f, reason: collision with root package name */
    public final int f5662f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5663g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5664h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5665i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5666j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f5667k;

    /* renamed from: l, reason: collision with root package name */
    public String f5668l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5669m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5670n;

    /* renamed from: o, reason: collision with root package name */
    public final List f5671o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5672p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5673q;

    /* renamed from: r, reason: collision with root package name */
    public final Set f5674r = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f5662f = i10;
        this.f5663g = str;
        this.f5664h = str2;
        this.f5665i = str3;
        this.f5666j = str4;
        this.f5667k = uri;
        this.f5668l = str5;
        this.f5669m = j10;
        this.f5670n = str6;
        this.f5671o = list;
        this.f5672p = str7;
        this.f5673q = str8;
    }

    @NonNull
    public static GoogleSignInAccount D3(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), m.f(str7), new ArrayList((Collection) m.l(set)), str5, str6);
    }

    public static GoogleSignInAccount E3(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount D3 = D3(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        D3.f5668l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return D3;
    }

    public Uri A3() {
        return this.f5667k;
    }

    @NonNull
    public Set<Scope> B3() {
        HashSet hashSet = new HashSet(this.f5671o);
        hashSet.addAll(this.f5674r);
        return hashSet;
    }

    public String C3() {
        return this.f5668l;
    }

    @NonNull
    public final String F3() {
        return this.f5670n;
    }

    @NonNull
    public final String G3() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (y3() != null) {
                jSONObject.put("id", y3());
            }
            if (z3() != null) {
                jSONObject.put("tokenId", z3());
            }
            if (v3() != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, v3());
            }
            if (l() != null) {
                jSONObject.put("displayName", l());
            }
            if (x3() != null) {
                jSONObject.put("givenName", x3());
            }
            if (w3() != null) {
                jSONObject.put("familyName", w3());
            }
            Uri A3 = A3();
            if (A3 != null) {
                jSONObject.put("photoUrl", A3.toString());
            }
            if (C3() != null) {
                jSONObject.put("serverAuthCode", C3());
            }
            jSONObject.put("expirationTime", this.f5669m);
            jSONObject.put("obfuscatedIdentifier", this.f5670n);
            JSONArray jSONArray = new JSONArray();
            List list = this.f5671o;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: c9.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).v3().compareTo(((Scope) obj2).v3());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.v3());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Account H2() {
        String str = this.f5665i;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5670n.equals(this.f5670n) && googleSignInAccount.B3().equals(B3());
    }

    public int hashCode() {
        return ((this.f5670n.hashCode() + 527) * 31) + B3().hashCode();
    }

    public String l() {
        return this.f5666j;
    }

    public String v3() {
        return this.f5665i;
    }

    public String w3() {
        return this.f5673q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f5662f);
        b.v(parcel, 2, y3(), false);
        b.v(parcel, 3, z3(), false);
        b.v(parcel, 4, v3(), false);
        b.v(parcel, 5, l(), false);
        b.t(parcel, 6, A3(), i10, false);
        b.v(parcel, 7, C3(), false);
        b.r(parcel, 8, this.f5669m);
        b.v(parcel, 9, this.f5670n, false);
        b.z(parcel, 10, this.f5671o, false);
        b.v(parcel, 11, x3(), false);
        b.v(parcel, 12, w3(), false);
        b.b(parcel, a10);
    }

    public String x3() {
        return this.f5672p;
    }

    public String y3() {
        return this.f5663g;
    }

    public String z3() {
        return this.f5664h;
    }
}
