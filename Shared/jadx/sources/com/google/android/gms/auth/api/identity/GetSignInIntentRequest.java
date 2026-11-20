package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;
import z8.h;

@Deprecated
/* loaded from: classes.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new h();

    /* renamed from: f, reason: collision with root package name */
    public final String f5633f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5634g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5635h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5636i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5637j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5638k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f5639a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f5640c;

        /* renamed from: d, reason: collision with root package name */
        public String f5641d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5642e;

        /* renamed from: f, reason: collision with root package name */
        public int f5643f;

        @NonNull
        public GetSignInIntentRequest a() {
            return new GetSignInIntentRequest(this.f5639a, this.b, this.f5640c, this.f5641d, this.f5642e, this.f5643f);
        }

        @NonNull
        public a b(String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public a c(String str) {
            this.f5641d = str;
            return this;
        }

        @NonNull
        @Deprecated
        public a d(boolean z10) {
            this.f5642e = z10;
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            m.l(str);
            this.f5639a = str;
            return this;
        }

        @NonNull
        public final a f(String str) {
            this.f5640c = str;
            return this;
        }

        @NonNull
        public final a g(int i10) {
            this.f5643f = i10;
            return this;
        }
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z10, int i10) {
        m.l(str);
        this.f5633f = str;
        this.f5634g = str2;
        this.f5635h = str3;
        this.f5636i = str4;
        this.f5637j = z10;
        this.f5638k = i10;
    }

    @NonNull
    public static a A3(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        m.l(getSignInIntentRequest);
        a v32 = v3();
        v32.e(getSignInIntentRequest.y3());
        v32.c(getSignInIntentRequest.x3());
        v32.b(getSignInIntentRequest.w3());
        v32.d(getSignInIntentRequest.f5637j);
        v32.g(getSignInIntentRequest.f5638k);
        String str = getSignInIntentRequest.f5635h;
        if (str != null) {
            v32.f(str);
        }
        return v32;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return k.b(this.f5633f, getSignInIntentRequest.f5633f) && k.b(this.f5636i, getSignInIntentRequest.f5636i) && k.b(this.f5634g, getSignInIntentRequest.f5634g) && k.b(Boolean.valueOf(this.f5637j), Boolean.valueOf(getSignInIntentRequest.f5637j)) && this.f5638k == getSignInIntentRequest.f5638k;
    }

    public int hashCode() {
        return k.c(this.f5633f, this.f5634g, this.f5636i, Boolean.valueOf(this.f5637j), Integer.valueOf(this.f5638k));
    }

    public String w3() {
        return this.f5634g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, y3(), false);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, this.f5635h, false);
        o9.b.v(parcel, 4, x3(), false);
        o9.b.c(parcel, 5, z3());
        o9.b.n(parcel, 6, this.f5638k);
        o9.b.b(parcel, a10);
    }

    public String x3() {
        return this.f5636i;
    }

    @NonNull
    public String y3() {
        return this.f5633f;
    }

    @Deprecated
    public boolean z3() {
        return this.f5637j;
    }
}
