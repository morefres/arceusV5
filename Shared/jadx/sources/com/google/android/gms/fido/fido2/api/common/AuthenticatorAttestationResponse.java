package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.c0;
import eb.j0;
import eb.k0;
import eb.m3;
import eb.u2;
import java.util.Arrays;
import n9.k;
import n9.m;

/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new c0();

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f5981f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f5982g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f5983h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final String[] f5984i;

    public AuthenticatorAttestationResponse(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull String[] strArr) {
        byte[] bArr4 = (byte[]) m.l(bArr);
        m3 m3Var = m3.b;
        m3 m10 = m3.m(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) m.l(bArr2);
        m3 m11 = m3.m(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) m.l(bArr3);
        m3 m12 = m3.m(bArr6, 0, bArr6.length);
        this.f5981f = (m3) m.l(m10);
        this.f5982g = (m3) m.l(m11);
        this.f5983h = (m3) m.l(m12);
        this.f5984i = (String[]) m.l(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return k.b(this.f5981f, authenticatorAttestationResponse.f5981f) && k.b(this.f5982g, authenticatorAttestationResponse.f5982g) && k.b(this.f5983h, authenticatorAttestationResponse.f5983h);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(k.c(this.f5981f)), Integer.valueOf(k.c(this.f5982g)), Integer.valueOf(k.c(this.f5983h)));
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
        a10.b("attestationObject", d12.e(v32, 0, v32.length));
        a10.b("transports", Arrays.toString(this.f5984i));
        return a10.toString();
    }

    @NonNull
    public byte[] v3() {
        return this.f5983h.p();
    }

    @NonNull
    public byte[] w3() {
        return this.f5982g.p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.g(parcel, 2, x3(), false);
        o9.b.g(parcel, 3, w3(), false);
        o9.b.g(parcel, 4, v3(), false);
        o9.b.w(parcel, 5, y3(), false);
        o9.b.b(parcel, a10);
    }

    @NonNull
    @Deprecated
    public byte[] x3() {
        return this.f5981f.p();
    }

    @NonNull
    public String[] y3() {
        return this.f5984i;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f8 A[Catch: JSONException -> 0x0019, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0019, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x001c, B:8:0x0020, B:9:0x002d, B:10:0x0034, B:12:0x0039, B:14:0x0047, B:16:0x0054, B:17:0x004d, B:20:0x0057, B:22:0x0060, B:24:0x0068, B:26:0x007a, B:27:0x0082, B:29:0x0086, B:31:0x0098, B:33:0x00b6, B:34:0x00ce, B:39:0x00f4, B:45:0x01e4, B:47:0x01f8, B:50:0x0113, B:52:0x0125, B:57:0x0139, B:60:0x015b, B:62:0x0171, B:64:0x0177, B:65:0x0191, B:66:0x0196, B:67:0x0197, B:68:0x019c, B:73:0x01a7, B:75:0x01b7, B:77:0x01c5, B:78:0x01d8, B:79:0x01dd, B:80:0x01de, B:81:0x01e3, B:82:0x0202, B:83:0x0207, B:86:0x0208, B:87:0x020f, B:88:0x0210, B:89:0x0215, B:92:0x0219, B:93:0x0220, B:96:0x0223, B:97:0x022a, B:99:0x022b, B:100:0x0232, B:101:0x0235, B:102:0x023c, B:104:0x023d, B:105:0x0244, B:108:0x0248, B:109:0x024f), top: B:2:0x0002, inners: #0, #1, #5 }] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject z3() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.z3():org.json.JSONObject");
    }
}
