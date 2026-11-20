package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.b0;
import eb.j0;
import eb.k0;
import eb.m3;
import eb.u2;
import n9.k;
import n9.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new b0();

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f5976f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f5977g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f5978h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final m3 f5979i;

    /* renamed from: j, reason: collision with root package name */
    public final m3 f5980j;

    public AuthenticatorAssertionResponse(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = (byte[]) m.l(bArr);
        m3 m3Var = m3.b;
        m3 m10 = m3.m(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) m.l(bArr2);
        m3 m11 = m3.m(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) m.l(bArr3);
        m3 m12 = m3.m(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) m.l(bArr4);
        m3 m13 = m3.m(bArr9, 0, bArr9.length);
        m3 m14 = bArr5 == null ? null : m3.m(bArr5, 0, bArr5.length);
        this.f5976f = (m3) m.l(m10);
        this.f5977g = (m3) m.l(m11);
        this.f5978h = (m3) m.l(m12);
        this.f5979i = (m3) m.l(m13);
        this.f5980j = m14;
    }

    @NonNull
    public final JSONObject A3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u9.c.b(w3()));
            jSONObject.put("authenticatorData", u9.c.b(v3()));
            jSONObject.put("signature", u9.c.b(y3()));
            if (this.f5980j == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", u9.c.b(z3()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return k.b(this.f5976f, authenticatorAssertionResponse.f5976f) && k.b(this.f5977g, authenticatorAssertionResponse.f5977g) && k.b(this.f5978h, authenticatorAssertionResponse.f5978h) && k.b(this.f5979i, authenticatorAssertionResponse.f5979i) && k.b(this.f5980j, authenticatorAssertionResponse.f5980j);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(k.c(this.f5976f)), Integer.valueOf(k.c(this.f5977g)), Integer.valueOf(k.c(this.f5978h)), Integer.valueOf(k.c(this.f5979i)), Integer.valueOf(k.c(this.f5980j)));
    }

    @NonNull
    public String toString() {
        j0 a10 = k0.a(this);
        u2 d10 = u2.d();
        byte[] x32 = x3();
        a10.b("keyHandle", d10.e(x32, 0, x32.length));
        u2 d11 = u2.d();
        byte[] w32 = w3();
        a10.b("clientDataJSON", d11.e(w32, 0, w32.length));
        u2 d12 = u2.d();
        byte[] v32 = v3();
        a10.b("authenticatorData", d12.e(v32, 0, v32.length));
        u2 d13 = u2.d();
        byte[] y32 = y3();
        a10.b("signature", d13.e(y32, 0, y32.length));
        byte[] z32 = z3();
        if (z32 != null) {
            a10.b("userHandle", u2.d().e(z32, 0, z32.length));
        }
        return a10.toString();
    }

    @NonNull
    public byte[] v3() {
        return this.f5978h.p();
    }

    @NonNull
    public byte[] w3() {
        return this.f5977g.p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.g(parcel, 2, x3(), false);
        o9.b.g(parcel, 3, w3(), false);
        o9.b.g(parcel, 4, v3(), false);
        o9.b.g(parcel, 5, y3(), false);
        o9.b.g(parcel, 6, z3(), false);
        o9.b.b(parcel, a10);
    }

    @NonNull
    @Deprecated
    public byte[] x3() {
        return this.f5976f.p();
    }

    @NonNull
    public byte[] y3() {
        return this.f5979i.p();
    }

    public byte[] z3() {
        m3 m3Var = this.f5980j;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }
}
