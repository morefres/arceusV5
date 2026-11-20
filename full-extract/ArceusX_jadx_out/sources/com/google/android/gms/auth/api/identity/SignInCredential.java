package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import n9.m;
import z8.k;

@Deprecated
/* loaded from: classes.dex */
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new k();

    /* renamed from: f, reason: collision with root package name */
    public final String f5650f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5651g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5652h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5653i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f5654j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5655k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5656l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5657m;

    /* renamed from: n, reason: collision with root package name */
    public final PublicKeyCredential f5658n;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f5650f = (String) m.l(str);
        this.f5651g = str2;
        this.f5652h = str3;
        this.f5653i = str4;
        this.f5654j = uri;
        this.f5655k = str5;
        this.f5656l = str6;
        this.f5657m = str7;
        this.f5658n = publicKeyCredential;
    }

    @Deprecated
    public String A3() {
        return this.f5657m;
    }

    public Uri B3() {
        return this.f5654j;
    }

    public PublicKeyCredential C3() {
        return this.f5658n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return n9.k.b(this.f5650f, signInCredential.f5650f) && n9.k.b(this.f5651g, signInCredential.f5651g) && n9.k.b(this.f5652h, signInCredential.f5652h) && n9.k.b(this.f5653i, signInCredential.f5653i) && n9.k.b(this.f5654j, signInCredential.f5654j) && n9.k.b(this.f5655k, signInCredential.f5655k) && n9.k.b(this.f5656l, signInCredential.f5656l) && n9.k.b(this.f5657m, signInCredential.f5657m) && n9.k.b(this.f5658n, signInCredential.f5658n);
    }

    public int hashCode() {
        return n9.k.c(this.f5650f, this.f5651g, this.f5652h, this.f5653i, this.f5654j, this.f5655k, this.f5656l, this.f5657m, this.f5658n);
    }

    public String l() {
        return this.f5651g;
    }

    public String v3() {
        return this.f5653i;
    }

    public String w3() {
        return this.f5652h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, y3(), false);
        o9.b.v(parcel, 2, l(), false);
        o9.b.v(parcel, 3, w3(), false);
        o9.b.v(parcel, 4, v3(), false);
        o9.b.t(parcel, 5, B3(), i10, false);
        o9.b.v(parcel, 6, z3(), false);
        o9.b.v(parcel, 7, x3(), false);
        o9.b.v(parcel, 8, A3(), false);
        o9.b.t(parcel, 9, C3(), i10, false);
        o9.b.b(parcel, a10);
    }

    public String x3() {
        return this.f5656l;
    }

    @NonNull
    public String y3() {
        return this.f5650f;
    }

    public String z3() {
        return this.f5655k;
    }
}
