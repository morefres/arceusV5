package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.NonNull;
import ca.j;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import eb.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n9.k;
import n9.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new j();

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final PublicKeyCredentialRpEntity f6019f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final PublicKeyCredentialUserEntity f6020g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final byte[] f6021h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final List f6022i;

    /* renamed from: j, reason: collision with root package name */
    public final Double f6023j;

    /* renamed from: k, reason: collision with root package name */
    public final List f6024k;

    /* renamed from: l, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f6025l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f6026m;

    /* renamed from: n, reason: collision with root package name */
    public final TokenBinding f6027n;

    /* renamed from: o, reason: collision with root package name */
    public final AttestationConveyancePreference f6028o;

    /* renamed from: p, reason: collision with root package name */
    public final AuthenticationExtensions f6029p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6030q;

    /* renamed from: r, reason: collision with root package name */
    public ResultReceiver f6031r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public PublicKeyCredentialRpEntity f6032a;
        public PublicKeyCredentialUserEntity b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f6033c;

        /* renamed from: d, reason: collision with root package name */
        public List f6034d;

        /* renamed from: e, reason: collision with root package name */
        public Double f6035e;

        /* renamed from: f, reason: collision with root package name */
        public List f6036f;

        /* renamed from: g, reason: collision with root package name */
        public AuthenticatorSelectionCriteria f6037g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f6038h;

        /* renamed from: i, reason: collision with root package name */
        public TokenBinding f6039i;

        /* renamed from: j, reason: collision with root package name */
        public AttestationConveyancePreference f6040j;

        /* renamed from: k, reason: collision with root package name */
        public AuthenticationExtensions f6041k;

        @NonNull
        public PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f6032a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
            byte[] bArr = this.f6033c;
            List list = this.f6034d;
            Double d10 = this.f6035e;
            List list2 = this.f6036f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f6037g;
            Integer num = this.f6038h;
            TokenBinding tokenBinding = this.f6039i;
            AttestationConveyancePreference attestationConveyancePreference = this.f6040j;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d10, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f6041k, null, null);
        }

        @NonNull
        public a b(AttestationConveyancePreference attestationConveyancePreference) {
            this.f6040j = attestationConveyancePreference;
            return this;
        }

        @NonNull
        public a c(AuthenticationExtensions authenticationExtensions) {
            this.f6041k = authenticationExtensions;
            return this;
        }

        @NonNull
        public a d(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f6037g = authenticatorSelectionCriteria;
            return this;
        }

        @NonNull
        public a e(@NonNull byte[] bArr) {
            this.f6033c = (byte[]) m.l(bArr);
            return this;
        }

        @NonNull
        public a f(List<PublicKeyCredentialDescriptor> list) {
            this.f6036f = list;
            return this;
        }

        @NonNull
        public a g(@NonNull List<PublicKeyCredentialParameters> list) {
            this.f6034d = (List) m.l(list);
            return this;
        }

        @NonNull
        public a h(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f6032a = (PublicKeyCredentialRpEntity) m.l(publicKeyCredentialRpEntity);
            return this;
        }

        @NonNull
        public a i(Double d10) {
            this.f6035e = d10;
            return this;
        }

        @NonNull
        public a j(@NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.b = (PublicKeyCredentialUserEntity) m.l(publicKeyCredentialUserEntity);
            return this;
        }
    }

    public PublicKeyCredentialCreationOptions(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @NonNull byte[] bArr, @NonNull List list, Double d10, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.f6031r = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions H3 = H3(new JSONObject(str2));
                this.f6019f = H3.f6019f;
                this.f6020g = H3.f6020g;
                this.f6021h = H3.f6021h;
                this.f6022i = H3.f6022i;
                this.f6023j = H3.f6023j;
                this.f6024k = H3.f6024k;
                this.f6025l = H3.f6025l;
                this.f6026m = H3.f6026m;
                this.f6027n = H3.f6027n;
                this.f6028o = H3.f6028o;
                this.f6029p = H3.f6029p;
                this.f6030q = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f6019f = (PublicKeyCredentialRpEntity) m.l(publicKeyCredentialRpEntity);
        this.f6020g = (PublicKeyCredentialUserEntity) m.l(publicKeyCredentialUserEntity);
        this.f6021h = (byte[]) m.l(bArr);
        this.f6022i = (List) m.l(list);
        this.f6023j = d10;
        this.f6024k = list2;
        this.f6025l = authenticatorSelectionCriteria;
        this.f6026m = num;
        this.f6027n = tokenBinding;
        if (str != null) {
            try {
                this.f6028o = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.a e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f6028o = null;
        }
        this.f6029p = authenticationExtensions;
        this.f6030q = null;
    }

    @NonNull
    public static PublicKeyCredentialCreationOptions H3(@NonNull JSONObject jSONObject) {
        m0 c10;
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        aVar.h(new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        aVar.j(new PublicKeyCredentialUserEntity(u9.c.a(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        aVar.e(u9.c.a(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            try {
                c10 = m0.d(new PublicKeyCredentialParameters(jSONObject4.getString(Payload.TYPE), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                c10 = m0.c();
            }
            if (c10.b()) {
                arrayList.add(c10.a());
            }
        }
        aVar.g(arrayList);
        if (jSONObject.has("timeout")) {
            aVar.i(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(PublicKeyCredentialDescriptor.y3(jSONArray2.getJSONObject(i11)));
            }
            aVar.f(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            aVar.d(new AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has("extensions")) {
            aVar.c(AuthenticationExtensions.x3(jSONObject.getJSONObject("extensions")));
        }
        if (jSONObject.has("attestation")) {
            try {
                aVar.b(AttestationConveyancePreference.a(jSONObject.getString("attestation")));
            } catch (AttestationConveyancePreference.a e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                aVar.b(AttestationConveyancePreference.NONE);
            }
        }
        return aVar.a();
    }

    public String A3() {
        return this.f6030q;
    }

    @NonNull
    public List<PublicKeyCredentialParameters> B3() {
        return this.f6022i;
    }

    public Integer C3() {
        return this.f6026m;
    }

    @NonNull
    public PublicKeyCredentialRpEntity D3() {
        return this.f6019f;
    }

    public Double E3() {
        return this.f6023j;
    }

    public TokenBinding F3() {
        return this.f6027n;
    }

    @NonNull
    public PublicKeyCredentialUserEntity G3() {
        return this.f6020g;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return k.b(this.f6019f, publicKeyCredentialCreationOptions.f6019f) && k.b(this.f6020g, publicKeyCredentialCreationOptions.f6020g) && Arrays.equals(this.f6021h, publicKeyCredentialCreationOptions.f6021h) && k.b(this.f6023j, publicKeyCredentialCreationOptions.f6023j) && this.f6022i.containsAll(publicKeyCredentialCreationOptions.f6022i) && publicKeyCredentialCreationOptions.f6022i.containsAll(this.f6022i) && (((list = this.f6024k) == null && publicKeyCredentialCreationOptions.f6024k == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f6024k) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f6024k.containsAll(this.f6024k))) && k.b(this.f6025l, publicKeyCredentialCreationOptions.f6025l) && k.b(this.f6026m, publicKeyCredentialCreationOptions.f6026m) && k.b(this.f6027n, publicKeyCredentialCreationOptions.f6027n) && k.b(this.f6028o, publicKeyCredentialCreationOptions.f6028o) && k.b(this.f6029p, publicKeyCredentialCreationOptions.f6029p) && k.b(this.f6030q, publicKeyCredentialCreationOptions.f6030q);
    }

    public int hashCode() {
        return k.c(this.f6019f, this.f6020g, Integer.valueOf(Arrays.hashCode(this.f6021h)), this.f6022i, this.f6023j, this.f6024k, this.f6025l, this.f6026m, this.f6027n, this.f6028o, this.f6029p, this.f6030q);
    }

    @NonNull
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.f6029p;
        AttestationConveyancePreference attestationConveyancePreference = this.f6028o;
        TokenBinding tokenBinding = this.f6027n;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f6025l;
        List list = this.f6024k;
        List list2 = this.f6022i;
        byte[] bArr = this.f6021h;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f6020g;
        return "PublicKeyCredentialCreationOptions{\n rp=" + String.valueOf(this.f6019f) + ", \n user=" + String.valueOf(publicKeyCredentialUserEntity) + ", \n challenge=" + u9.c.b(bArr) + ", \n parameters=" + String.valueOf(list2) + ", \n timeoutSeconds=" + this.f6023j + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.f6026m + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + "}";
    }

    public String v3() {
        AttestationConveyancePreference attestationConveyancePreference = this.f6028o;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    public AuthenticationExtensions w3() {
        return this.f6029p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 2, D3(), i10, false);
        o9.b.t(parcel, 3, G3(), i10, false);
        o9.b.g(parcel, 4, y3(), false);
        o9.b.z(parcel, 5, B3(), false);
        o9.b.j(parcel, 6, E3(), false);
        o9.b.z(parcel, 7, z3(), false);
        o9.b.t(parcel, 8, x3(), i10, false);
        o9.b.q(parcel, 9, C3(), false);
        o9.b.t(parcel, 10, F3(), i10, false);
        o9.b.v(parcel, 11, v3(), false);
        o9.b.t(parcel, 12, w3(), i10, false);
        o9.b.v(parcel, 13, A3(), false);
        o9.b.t(parcel, 14, this.f6031r, i10, false);
        o9.b.b(parcel, a10);
    }

    public AuthenticatorSelectionCriteria x3() {
        return this.f6025l;
    }

    @NonNull
    public byte[] y3() {
        return this.f6021h;
    }

    public List<PublicKeyCredentialDescriptor> z3() {
        return this.f6024k;
    }

    public PublicKeyCredentialCreationOptions(@NonNull String str) {
        try {
            PublicKeyCredentialCreationOptions H3 = H3(new JSONObject(str));
            this.f6019f = H3.f6019f;
            this.f6020g = H3.f6020g;
            this.f6021h = H3.f6021h;
            this.f6022i = H3.f6022i;
            this.f6023j = H3.f6023j;
            this.f6024k = H3.f6024k;
            this.f6025l = H3.f6025l;
            this.f6026m = H3.f6026m;
            this.f6027n = H3.f6027n;
            this.f6028o = H3.f6028o;
            this.f6029p = H3.f6029p;
            this.f6030q = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
