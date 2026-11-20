package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import c9.f;
import c9.h;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k9.a;
import n9.m;
import o9.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f5675q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f5676r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public static final Scope f5677s = new Scope("profile");

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public static final Scope f5678t = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public static final Scope f5679u = new Scope("openid");

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public static final Scope f5680v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public static final Scope f5681w;

    /* renamed from: x, reason: collision with root package name */
    public static final Comparator f5682x;

    /* renamed from: f, reason: collision with root package name */
    public final int f5683f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5684g;

    /* renamed from: h, reason: collision with root package name */
    public Account f5685h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5686i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5687j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5688k;

    /* renamed from: l, reason: collision with root package name */
    public String f5689l;

    /* renamed from: m, reason: collision with root package name */
    public String f5690m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f5691n;

    /* renamed from: o, reason: collision with root package name */
    public String f5692o;

    /* renamed from: p, reason: collision with root package name */
    public Map f5693p;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f5680v = scope;
        f5681w = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f5675q = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f5676r = aVar2.a();
        CREATOR = new h();
        f5682x = new f();
    }

    public static GoogleSignInOptions D3(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public static Map O3(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public boolean A3() {
        return this.f5686i;
    }

    public boolean B3() {
        return this.f5687j;
    }

    public Account H2() {
        return this.f5685h;
    }

    @NonNull
    public final String H3() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f5684g, f5682x);
            ArrayList arrayList = this.f5684g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((Scope) obj).v3());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f5685h;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f5686i);
            jSONObject.put("forceCodeForRefreshToken", this.f5688k);
            jSONObject.put("serverAuthRequested", this.f5687j);
            if (!TextUtils.isEmpty(this.f5689l)) {
                jSONObject.put("serverClientId", this.f5689l);
            }
            if (!TextUtils.isEmpty(this.f5690m)) {
                jSONObject.put("hostedDomain", this.f5690m);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.H2()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f5691n     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f5691n     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f5684g     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.x3()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f5684g     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.x3()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f5685h     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.H2()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.H2()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f5689l     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.y3()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f5689l     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.y3()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f5688k     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.z3()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f5686i     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.A3()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f5687j     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.B3()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f5692o     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.w3()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5684g;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).v3());
        }
        Collections.sort(arrayList);
        d9.a aVar = new d9.a();
        aVar.a(arrayList);
        aVar.a(this.f5685h);
        aVar.a(this.f5689l);
        aVar.c(this.f5688k);
        aVar.c(this.f5686i);
        aVar.c(this.f5687j);
        aVar.a(this.f5692o);
        return aVar.b();
    }

    @NonNull
    public ArrayList<GoogleSignInOptionsExtensionParcelable> v3() {
        return this.f5691n;
    }

    public String w3() {
        return this.f5692o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5683f;
        int a10 = b.a(parcel);
        b.n(parcel, 1, i11);
        b.z(parcel, 2, x3(), false);
        b.t(parcel, 3, H2(), i10, false);
        b.c(parcel, 4, A3());
        b.c(parcel, 5, B3());
        b.c(parcel, 6, z3());
        b.v(parcel, 7, y3(), false);
        b.v(parcel, 8, this.f5690m, false);
        b.z(parcel, 9, v3(), false);
        b.v(parcel, 10, w3(), false);
        b.b(parcel, a10);
    }

    @NonNull
    public ArrayList<Scope> x3() {
        return new ArrayList<>(this.f5684g);
    }

    public String y3() {
        return this.f5689l;
    }

    public boolean z3() {
        return this.f5688k;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Set f5694a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5695c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5696d;

        /* renamed from: e, reason: collision with root package name */
        public String f5697e;

        /* renamed from: f, reason: collision with root package name */
        public Account f5698f;

        /* renamed from: g, reason: collision with root package name */
        public String f5699g;

        /* renamed from: h, reason: collision with root package name */
        public Map f5700h;

        /* renamed from: i, reason: collision with root package name */
        public String f5701i;

        public a() {
            this.f5694a = new HashSet();
            this.f5700h = new HashMap();
        }

        @NonNull
        public GoogleSignInOptions a() {
            if (this.f5694a.contains(GoogleSignInOptions.f5681w)) {
                Set set = this.f5694a;
                Scope scope = GoogleSignInOptions.f5680v;
                if (set.contains(scope)) {
                    this.f5694a.remove(scope);
                }
            }
            if (this.f5696d && (this.f5698f == null || !this.f5694a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f5694a), this.f5698f, this.f5696d, this.b, this.f5695c, this.f5697e, this.f5699g, this.f5700h, this.f5701i);
        }

        @NonNull
        public a b() {
            this.f5694a.add(GoogleSignInOptions.f5679u);
            return this;
        }

        @NonNull
        public a c() {
            this.f5694a.add(GoogleSignInOptions.f5677s);
            return this;
        }

        @NonNull
        public a d(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f5694a.add(scope);
            this.f5694a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.f5701i = str;
            return this;
        }

        public a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f5694a = new HashSet();
            this.f5700h = new HashMap();
            m.l(googleSignInOptions);
            this.f5694a = new HashSet(googleSignInOptions.f5684g);
            this.b = googleSignInOptions.f5687j;
            this.f5695c = googleSignInOptions.f5688k;
            this.f5696d = googleSignInOptions.f5686i;
            this.f5697e = googleSignInOptions.f5689l;
            this.f5698f = googleSignInOptions.f5685h;
            this.f5699g = googleSignInOptions.f5690m;
            this.f5700h = GoogleSignInOptions.O3(googleSignInOptions.f5691n);
            this.f5701i = googleSignInOptions.f5692o;
        }
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, O3(arrayList2), str3);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f5683f = i10;
        this.f5684g = arrayList;
        this.f5685h = account;
        this.f5686i = z10;
        this.f5687j = z11;
        this.f5688k = z12;
        this.f5689l = str;
        this.f5690m = str2;
        this.f5691n = new ArrayList(map.values());
        this.f5693p = map;
        this.f5692o = str3;
    }
}
