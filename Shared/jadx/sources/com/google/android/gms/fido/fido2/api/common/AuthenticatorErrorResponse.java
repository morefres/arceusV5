package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.d0;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import eb.j0;
import eb.k0;
import n9.k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new d0();

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ErrorCode f5985f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5986g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5987h;

    public AuthenticatorErrorResponse(int i10, String str, int i11) {
        try {
            this.f5985f = ErrorCode.j(i10);
            this.f5986g = str;
            this.f5987h = i11;
        } catch (ErrorCode.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return k.b(this.f5985f, authenticatorErrorResponse.f5985f) && k.b(this.f5986g, authenticatorErrorResponse.f5986g) && k.b(Integer.valueOf(this.f5987h), Integer.valueOf(authenticatorErrorResponse.f5987h));
    }

    public int hashCode() {
        return k.c(this.f5985f, this.f5986g, Integer.valueOf(this.f5987h));
    }

    @NonNull
    public String toString() {
        j0 a10 = k0.a(this);
        a10.a("errorCode", this.f5985f.a());
        String str = this.f5986g;
        if (str != null) {
            a10.b("errorMessage", str);
        }
        return a10.toString();
    }

    @NonNull
    public ErrorCode v3() {
        return this.f5985f;
    }

    public int w3() {
        return this.f5985f.a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 2, w3());
        o9.b.v(parcel, 3, x3(), false);
        o9.b.n(parcel, 4, this.f5987h);
        o9.b.b(parcel, a10);
    }

    public String x3() {
        return this.f5986g;
    }

    @NonNull
    public final JSONObject y3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f5985f.a());
            String str = this.f5986g;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("message", str);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
        }
    }
}
