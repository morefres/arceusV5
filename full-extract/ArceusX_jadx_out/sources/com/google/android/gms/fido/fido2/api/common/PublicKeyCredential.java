package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.k;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import eb.p4;
import n9.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new k();

    /* renamed from: f, reason: collision with root package name */
    public final String f6010f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f6011g;

    /* renamed from: h, reason: collision with root package name */
    public final m3 f6012h;

    /* renamed from: i, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f6013i;

    /* renamed from: j, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f6014j;

    /* renamed from: k, reason: collision with root package name */
    public final AuthenticatorErrorResponse f6015k;

    /* renamed from: l, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f6016l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6017m;

    /* renamed from: n, reason: collision with root package name */
    public String f6018n;

    public PublicKeyCredential(String str, @NonNull String str2, m3 m3Var, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        boolean z10 = false;
        m.b((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && m3Var != null)) {
            z10 = true;
        }
        m.b(z10, "Must provide id and rawId if not an error response.");
        this.f6010f = str;
        this.f6011g = str2;
        this.f6012h = m3Var;
        this.f6013i = authenticatorAttestationResponse;
        this.f6014j = authenticatorAssertionResponse;
        this.f6015k = authenticatorErrorResponse;
        this.f6016l = authenticationExtensionsClientOutputs;
        this.f6017m = str3;
        this.f6018n = null;
    }

    @NonNull
    public static PublicKeyCredential a(@NonNull byte[] bArr) {
        return (PublicKeyCredential) o9.c.a(bArr, CREATOR);
    }

    @NonNull
    public String A3() {
        return this.f6011g;
    }

    @NonNull
    public String B3() {
        return C3().toString();
    }

    @NonNull
    public final JSONObject C3() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            m3 m3Var = this.f6012h;
            if (m3Var != null && m3Var.p().length > 0) {
                jSONObject2.put("rawId", u9.c.b(this.f6012h.p()));
            }
            String str = this.f6017m;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.f6011g;
            if (str2 != null && this.f6015k == null) {
                jSONObject2.put(Payload.TYPE, str2);
            }
            String str3 = this.f6010f;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            String str4 = Payload.RESPONSE;
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f6014j;
            boolean z10 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.A3();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f6013i;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.z3();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.f6015k;
                    z10 = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObject = authenticatorErrorResponse.y3();
                        str4 = "error";
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f6016l;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.x3());
                return jSONObject2;
            }
            if (z10) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return n9.k.b(this.f6010f, publicKeyCredential.f6010f) && n9.k.b(this.f6011g, publicKeyCredential.f6011g) && n9.k.b(this.f6012h, publicKeyCredential.f6012h) && n9.k.b(this.f6013i, publicKeyCredential.f6013i) && n9.k.b(this.f6014j, publicKeyCredential.f6014j) && n9.k.b(this.f6015k, publicKeyCredential.f6015k) && n9.k.b(this.f6016l, publicKeyCredential.f6016l) && n9.k.b(this.f6017m, publicKeyCredential.f6017m);
    }

    public int hashCode() {
        return n9.k.c(this.f6010f, this.f6011g, this.f6012h, this.f6014j, this.f6013i, this.f6015k, this.f6016l, this.f6017m);
    }

    @NonNull
    public final String toString() {
        m3 m3Var = this.f6012h;
        byte[] p8 = m3Var == null ? null : m3Var.p();
        String str = this.f6011g;
        String str2 = this.f6010f;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f6013i;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f6014j;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f6015k;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f6016l;
        String str3 = this.f6017m;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + u9.c.b(p8) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    public String v3() {
        return this.f6017m;
    }

    public AuthenticationExtensionsClientOutputs w3() {
        return this.f6016l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (p4.b()) {
            this.f6018n = C3().toString();
        }
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, x3(), false);
        o9.b.v(parcel, 2, A3(), false);
        o9.b.g(parcel, 3, y3(), false);
        o9.b.t(parcel, 4, this.f6013i, i10, false);
        o9.b.t(parcel, 5, this.f6014j, i10, false);
        o9.b.t(parcel, 6, this.f6015k, i10, false);
        o9.b.t(parcel, 7, w3(), i10, false);
        o9.b.v(parcel, 8, v3(), false);
        o9.b.v(parcel, 9, this.f6018n, false);
        o9.b.b(parcel, a10);
        this.f6018n = null;
    }

    public String x3() {
        return this.f6010f;
    }

    public byte[] y3() {
        m3 m3Var = this.f6012h;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    @NonNull
    public AuthenticatorResponse z3() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f6013i;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f6014j;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f6015k;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public PublicKeyCredential(String str, @NonNull String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        this(str, str2, bArr == null ? null : m3.m(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
