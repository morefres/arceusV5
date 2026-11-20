package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n9.k;
import n9.m;

@Deprecated
/* loaded from: classes.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    /* renamed from: f, reason: collision with root package name */
    public final PasswordRequestOptions f5593f;

    /* renamed from: g, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f5594g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5595h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5596i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5597j;

    /* renamed from: k, reason: collision with root package name */
    public final PasskeysRequestOptions f5598k;

    /* renamed from: l, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f5599l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5600m;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f5601f;

        /* renamed from: g, reason: collision with root package name */
        public final String f5602g;

        /* renamed from: h, reason: collision with root package name */
        public final String f5603h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f5604i;

        /* renamed from: j, reason: collision with root package name */
        public final String f5605j;

        /* renamed from: k, reason: collision with root package name */
        public final List f5606k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f5607l;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f5608a = false;
            public String b = null;

            /* renamed from: c, reason: collision with root package name */
            public String f5609c = null;

            /* renamed from: d, reason: collision with root package name */
            public boolean f5610d = true;

            /* renamed from: e, reason: collision with root package name */
            public String f5611e = null;

            /* renamed from: f, reason: collision with root package name */
            public List f5612f = null;

            /* renamed from: g, reason: collision with root package name */
            public boolean f5613g = false;

            @NonNull
            public a a(@NonNull String str, List<String> list) {
                this.f5611e = (String) m.m(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f5612f = list;
                return this;
            }

            @NonNull
            public GoogleIdTokenRequestOptions b() {
                return new GoogleIdTokenRequestOptions(this.f5608a, this.b, this.f5609c, this.f5610d, this.f5611e, this.f5612f, this.f5613g);
            }

            @NonNull
            public a c(boolean z10) {
                this.f5610d = z10;
                return this;
            }

            @NonNull
            public a d(String str) {
                this.f5609c = str;
                return this;
            }

            @NonNull
            @Deprecated
            public a e(boolean z10) {
                this.f5613g = z10;
                return this;
            }

            @NonNull
            public a f(@NonNull String str) {
                this.b = m.f(str);
                return this;
            }

            @NonNull
            public a g(boolean z10) {
                this.f5608a = z10;
                return this;
            }
        }

        public GoogleIdTokenRequestOptions(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            m.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f5601f = z10;
            if (z10) {
                m.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f5602g = str;
            this.f5603h = str2;
            this.f5604i = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f5606k = arrayList;
            this.f5605j = str3;
            this.f5607l = z12;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public String A3() {
            return this.f5602g;
        }

        public boolean B3() {
            return this.f5601f;
        }

        @Deprecated
        public boolean C3() {
            return this.f5607l;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f5601f == googleIdTokenRequestOptions.f5601f && k.b(this.f5602g, googleIdTokenRequestOptions.f5602g) && k.b(this.f5603h, googleIdTokenRequestOptions.f5603h) && this.f5604i == googleIdTokenRequestOptions.f5604i && k.b(this.f5605j, googleIdTokenRequestOptions.f5605j) && k.b(this.f5606k, googleIdTokenRequestOptions.f5606k) && this.f5607l == googleIdTokenRequestOptions.f5607l;
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5601f), this.f5602g, this.f5603h, Boolean.valueOf(this.f5604i), this.f5605j, this.f5606k, Boolean.valueOf(this.f5607l));
        }

        public boolean w3() {
            return this.f5604i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int a10 = o9.b.a(parcel);
            o9.b.c(parcel, 1, B3());
            o9.b.v(parcel, 2, A3(), false);
            o9.b.v(parcel, 3, z3(), false);
            o9.b.c(parcel, 4, w3());
            o9.b.v(parcel, 5, y3(), false);
            o9.b.x(parcel, 6, x3(), false);
            o9.b.c(parcel, 7, C3());
            o9.b.b(parcel, a10);
        }

        public List<String> x3() {
            return this.f5606k;
        }

        public String y3() {
            return this.f5605j;
        }

        public String z3() {
            return this.f5603h;
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f5614f;

        /* renamed from: g, reason: collision with root package name */
        public final String f5615g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f5616a = false;
            public String b;

            @NonNull
            public PasskeyJsonRequestOptions a() {
                return new PasskeyJsonRequestOptions(this.f5616a, this.b);
            }

            @NonNull
            public a b(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            public a c(boolean z10) {
                this.f5616a = z10;
                return this;
            }
        }

        public PasskeyJsonRequestOptions(boolean z10, String str) {
            if (z10) {
                m.l(str);
            }
            this.f5614f = z10;
            this.f5615g = str;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f5614f == passkeyJsonRequestOptions.f5614f && k.b(this.f5615g, passkeyJsonRequestOptions.f5615g);
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5614f), this.f5615g);
        }

        @NonNull
        public String w3() {
            return this.f5615g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int a10 = o9.b.a(parcel);
            o9.b.c(parcel, 1, x3());
            o9.b.v(parcel, 2, w3(), false);
            o9.b.b(parcel, a10);
        }

        public boolean x3() {
            return this.f5614f;
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f5617f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f5618g;

        /* renamed from: h, reason: collision with root package name */
        public final String f5619h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f5620a = false;
            public byte[] b;

            /* renamed from: c, reason: collision with root package name */
            public String f5621c;

            @NonNull
            public PasskeysRequestOptions a() {
                return new PasskeysRequestOptions(this.f5620a, this.b, this.f5621c);
            }

            @NonNull
            public a b(@NonNull byte[] bArr) {
                this.b = bArr;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                this.f5621c = str;
                return this;
            }

            @NonNull
            public a d(boolean z10) {
                this.f5620a = z10;
                return this;
            }
        }

        public PasskeysRequestOptions(boolean z10, byte[] bArr, String str) {
            if (z10) {
                m.l(bArr);
                m.l(str);
            }
            this.f5617f = z10;
            this.f5618g = bArr;
            this.f5619h = str;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f5617f == passkeysRequestOptions.f5617f && Arrays.equals(this.f5618g, passkeysRequestOptions.f5618g) && Objects.equals(this.f5619h, passkeysRequestOptions.f5619h);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f5617f), this.f5619h) * 31) + Arrays.hashCode(this.f5618g);
        }

        @NonNull
        public byte[] w3() {
            return this.f5618g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int a10 = o9.b.a(parcel);
            o9.b.c(parcel, 1, y3());
            o9.b.g(parcel, 2, w3(), false);
            o9.b.v(parcel, 3, x3(), false);
            o9.b.b(parcel, a10);
        }

        @NonNull
        public String x3() {
            return this.f5619h;
        }

        public boolean y3() {
            return this.f5617f;
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f5622f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f5623a = false;

            @NonNull
            public PasswordRequestOptions a() {
                return new PasswordRequestOptions(this.f5623a);
            }

            @NonNull
            public a b(boolean z10) {
                this.f5623a = z10;
                return this;
            }
        }

        public PasswordRequestOptions(boolean z10) {
            this.f5622f = z10;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f5622f == ((PasswordRequestOptions) obj).f5622f;
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5622f));
        }

        public boolean w3() {
            return this.f5622f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int a10 = o9.b.a(parcel);
            o9.b.c(parcel, 1, w3());
            o9.b.b(parcel, a10);
        }
    }

    @Deprecated
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public PasswordRequestOptions f5624a;
        public GoogleIdTokenRequestOptions b;

        /* renamed from: c, reason: collision with root package name */
        public PasskeysRequestOptions f5625c;

        /* renamed from: d, reason: collision with root package name */
        public PasskeyJsonRequestOptions f5626d;

        /* renamed from: e, reason: collision with root package name */
        public String f5627e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5628f;

        /* renamed from: g, reason: collision with root package name */
        public int f5629g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f5630h;

        public a() {
            PasswordRequestOptions.a v32 = PasswordRequestOptions.v3();
            v32.b(false);
            this.f5624a = v32.a();
            GoogleIdTokenRequestOptions.a v33 = GoogleIdTokenRequestOptions.v3();
            v33.g(false);
            this.b = v33.b();
            PasskeysRequestOptions.a v34 = PasskeysRequestOptions.v3();
            v34.d(false);
            this.f5625c = v34.a();
            PasskeyJsonRequestOptions.a v35 = PasskeyJsonRequestOptions.v3();
            v35.c(false);
            this.f5626d = v35.a();
        }

        @NonNull
        public BeginSignInRequest a() {
            return new BeginSignInRequest(this.f5624a, this.b, this.f5627e, this.f5628f, this.f5629g, this.f5625c, this.f5626d, this.f5630h);
        }

        @NonNull
        public a b(boolean z10) {
            this.f5628f = z10;
            return this;
        }

        @NonNull
        public a c(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.b = (GoogleIdTokenRequestOptions) m.l(googleIdTokenRequestOptions);
            return this;
        }

        @NonNull
        public a d(@NonNull PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f5626d = (PasskeyJsonRequestOptions) m.l(passkeyJsonRequestOptions);
            return this;
        }

        @NonNull
        @Deprecated
        public a e(@NonNull PasskeysRequestOptions passkeysRequestOptions) {
            this.f5625c = (PasskeysRequestOptions) m.l(passkeysRequestOptions);
            return this;
        }

        @NonNull
        public a f(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.f5624a = (PasswordRequestOptions) m.l(passwordRequestOptions);
            return this;
        }

        @NonNull
        public a g(boolean z10) {
            this.f5630h = z10;
            return this;
        }

        @NonNull
        public final a h(@NonNull String str) {
            this.f5627e = str;
            return this;
        }

        @NonNull
        public final a i(int i10) {
            this.f5629g = i10;
            return this;
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z10, int i10, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z11) {
        this.f5593f = (PasswordRequestOptions) m.l(passwordRequestOptions);
        this.f5594g = (GoogleIdTokenRequestOptions) m.l(googleIdTokenRequestOptions);
        this.f5595h = str;
        this.f5596i = z10;
        this.f5597j = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.a v32 = PasskeysRequestOptions.v3();
            v32.d(false);
            passkeysRequestOptions = v32.a();
        }
        this.f5598k = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.a v33 = PasskeyJsonRequestOptions.v3();
            v33.c(false);
            passkeyJsonRequestOptions = v33.a();
        }
        this.f5599l = passkeyJsonRequestOptions;
        this.f5600m = z11;
    }

    @NonNull
    public static a C3(@NonNull BeginSignInRequest beginSignInRequest) {
        m.l(beginSignInRequest);
        a v32 = v3();
        v32.c(beginSignInRequest.w3());
        v32.f(beginSignInRequest.z3());
        v32.e(beginSignInRequest.y3());
        v32.d(beginSignInRequest.x3());
        v32.b(beginSignInRequest.f5596i);
        v32.i(beginSignInRequest.f5597j);
        v32.g(beginSignInRequest.f5600m);
        String str = beginSignInRequest.f5595h;
        if (str != null) {
            v32.h(str);
        }
        return v32;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    public boolean A3() {
        return this.f5600m;
    }

    public boolean B3() {
        return this.f5596i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return k.b(this.f5593f, beginSignInRequest.f5593f) && k.b(this.f5594g, beginSignInRequest.f5594g) && k.b(this.f5598k, beginSignInRequest.f5598k) && k.b(this.f5599l, beginSignInRequest.f5599l) && k.b(this.f5595h, beginSignInRequest.f5595h) && this.f5596i == beginSignInRequest.f5596i && this.f5597j == beginSignInRequest.f5597j && this.f5600m == beginSignInRequest.f5600m;
    }

    public int hashCode() {
        return k.c(this.f5593f, this.f5594g, this.f5598k, this.f5599l, this.f5595h, Boolean.valueOf(this.f5596i), Integer.valueOf(this.f5597j), Boolean.valueOf(this.f5600m));
    }

    @NonNull
    public GoogleIdTokenRequestOptions w3() {
        return this.f5594g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 1, z3(), i10, false);
        o9.b.t(parcel, 2, w3(), i10, false);
        o9.b.v(parcel, 3, this.f5595h, false);
        o9.b.c(parcel, 4, B3());
        o9.b.n(parcel, 5, this.f5597j);
        o9.b.t(parcel, 6, y3(), i10, false);
        o9.b.t(parcel, 7, x3(), i10, false);
        o9.b.c(parcel, 8, A3());
        o9.b.b(parcel, a10);
    }

    @NonNull
    public PasskeyJsonRequestOptions x3() {
        return this.f5599l;
    }

    @NonNull
    public PasskeysRequestOptions y3() {
        return this.f5598k;
    }

    @NonNull
    public PasswordRequestOptions z3() {
        return this.f5593f;
    }
}
