package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import n9.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new x();

    /* renamed from: f, reason: collision with root package name */
    public final FidoAppIdExtension f5947f;

    /* renamed from: g, reason: collision with root package name */
    public final zzs f5948g;

    /* renamed from: h, reason: collision with root package name */
    public final UserVerificationMethodExtension f5949h;

    /* renamed from: i, reason: collision with root package name */
    public final zzz f5950i;

    /* renamed from: j, reason: collision with root package name */
    public final zzab f5951j;

    /* renamed from: k, reason: collision with root package name */
    public final zzad f5952k;

    /* renamed from: l, reason: collision with root package name */
    public final zzu f5953l;

    /* renamed from: m, reason: collision with root package name */
    public final zzag f5954m;

    /* renamed from: n, reason: collision with root package name */
    public final GoogleThirdPartyPaymentExtension f5955n;

    /* renamed from: o, reason: collision with root package name */
    public final zzak f5956o;

    /* renamed from: p, reason: collision with root package name */
    public final zzaw f5957p;

    /* renamed from: q, reason: collision with root package name */
    public final zzai f5958q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public FidoAppIdExtension f5959a;
        public UserVerificationMethodExtension b;

        /* renamed from: c, reason: collision with root package name */
        public zzs f5960c;

        /* renamed from: d, reason: collision with root package name */
        public zzz f5961d;

        /* renamed from: e, reason: collision with root package name */
        public zzab f5962e;

        /* renamed from: f, reason: collision with root package name */
        public zzad f5963f;

        /* renamed from: g, reason: collision with root package name */
        public zzu f5964g;

        /* renamed from: h, reason: collision with root package name */
        public zzag f5965h;

        /* renamed from: i, reason: collision with root package name */
        public GoogleThirdPartyPaymentExtension f5966i;

        /* renamed from: j, reason: collision with root package name */
        public zzak f5967j;

        /* renamed from: k, reason: collision with root package name */
        public zzaw f5968k;

        /* renamed from: l, reason: collision with root package name */
        public zzai f5969l;

        @NonNull
        public AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.f5959a, this.f5960c, this.b, this.f5961d, this.f5962e, this.f5963f, this.f5964g, this.f5965h, this.f5966i, this.f5967j, this.f5968k, this.f5969l);
        }

        @NonNull
        public a b(FidoAppIdExtension fidoAppIdExtension) {
            this.f5959a = fidoAppIdExtension;
            return this;
        }

        @NonNull
        public a c(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f5966i = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        public a d(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.b = userVerificationMethodExtension;
            return this;
        }

        public final a e(zzs zzsVar) {
            this.f5960c = zzsVar;
            return this;
        }

        public final a f(zzu zzuVar) {
            this.f5964g = zzuVar;
            return this;
        }

        public final a g(zzz zzzVar) {
            this.f5961d = zzzVar;
            return this;
        }

        public final a h(zzab zzabVar) {
            this.f5962e = zzabVar;
            return this;
        }

        public final a i(zzad zzadVar) {
            this.f5963f = zzadVar;
            return this;
        }

        public final a j(zzag zzagVar) {
            this.f5965h = zzagVar;
            return this;
        }

        public final a k(zzak zzakVar) {
            this.f5967j = zzakVar;
            return this;
        }

        public final a l(zzaw zzawVar) {
            this.f5968k = zzawVar;
            return this;
        }
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.f5947f = fidoAppIdExtension;
        this.f5949h = userVerificationMethodExtension;
        this.f5948g = zzsVar;
        this.f5950i = zzzVar;
        this.f5951j = zzabVar;
        this.f5952k = zzadVar;
        this.f5953l = zzuVar;
        this.f5954m = zzagVar;
        this.f5955n = googleThirdPartyPaymentExtension;
        this.f5956o = zzakVar;
        this.f5957p = zzawVar;
        this.f5958q = zzaiVar;
    }

    @NonNull
    public static AuthenticationExtensions x3(@NonNull JSONObject jSONObject) {
        a aVar = new a();
        if (jSONObject.has("fidoAppIdExtension")) {
            aVar.b(new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")));
        }
        if (jSONObject.has("appid")) {
            aVar.b(new FidoAppIdExtension(jSONObject.getString("appid")));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            aVar.k(zzak.a(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            aVar.k(zzak.a(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            aVar.e(new zzs(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            aVar.d(new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            aVar.g(new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            aVar.h(new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            aVar.i(new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            aVar.f(new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            aVar.j(new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            aVar.c(new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            aVar.l(new zzaw(jSONObject.getString("txAuthSimple")));
        }
        return aVar.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return k.b(this.f5947f, authenticationExtensions.f5947f) && k.b(this.f5948g, authenticationExtensions.f5948g) && k.b(this.f5949h, authenticationExtensions.f5949h) && k.b(this.f5950i, authenticationExtensions.f5950i) && k.b(this.f5951j, authenticationExtensions.f5951j) && k.b(this.f5952k, authenticationExtensions.f5952k) && k.b(this.f5953l, authenticationExtensions.f5953l) && k.b(this.f5954m, authenticationExtensions.f5954m) && k.b(this.f5955n, authenticationExtensions.f5955n) && k.b(this.f5956o, authenticationExtensions.f5956o) && k.b(this.f5957p, authenticationExtensions.f5957p) && k.b(this.f5958q, authenticationExtensions.f5958q);
    }

    public int hashCode() {
        return k.c(this.f5947f, this.f5948g, this.f5949h, this.f5950i, this.f5951j, this.f5952k, this.f5953l, this.f5954m, this.f5955n, this.f5956o, this.f5957p, this.f5958q);
    }

    @NonNull
    public final String toString() {
        zzaw zzawVar = this.f5957p;
        zzak zzakVar = this.f5956o;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.f5955n;
        zzag zzagVar = this.f5954m;
        zzu zzuVar = this.f5953l;
        zzad zzadVar = this.f5952k;
        zzab zzabVar = this.f5951j;
        zzz zzzVar = this.f5950i;
        UserVerificationMethodExtension userVerificationMethodExtension = this.f5949h;
        zzs zzsVar = this.f5948g;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.f5947f) + ", \n cableAuthenticationExtension=" + String.valueOf(zzsVar) + ", \n userVerificationMethodExtension=" + String.valueOf(userVerificationMethodExtension) + ", \n googleMultiAssertionExtension=" + String.valueOf(zzzVar) + ", \n googleSessionIdExtension=" + String.valueOf(zzabVar) + ", \n googleSilentVerificationExtension=" + String.valueOf(zzadVar) + ", \n devicePublicKeyExtension=" + String.valueOf(zzuVar) + ", \n googleTunnelServerIdExtension=" + String.valueOf(zzagVar) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(googleThirdPartyPaymentExtension) + ", \n prfExtension=" + String.valueOf(zzakVar) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(zzawVar) + "}";
    }

    public FidoAppIdExtension v3() {
        return this.f5947f;
    }

    public UserVerificationMethodExtension w3() {
        return this.f5949h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 2, v3(), i10, false);
        o9.b.t(parcel, 3, this.f5948g, i10, false);
        o9.b.t(parcel, 4, w3(), i10, false);
        o9.b.t(parcel, 5, this.f5950i, i10, false);
        o9.b.t(parcel, 6, this.f5951j, i10, false);
        o9.b.t(parcel, 7, this.f5952k, i10, false);
        o9.b.t(parcel, 8, this.f5953l, i10, false);
        o9.b.t(parcel, 9, this.f5954m, i10, false);
        o9.b.t(parcel, 10, this.f5955n, i10, false);
        o9.b.t(parcel, 11, this.f5956o, i10, false);
        o9.b.t(parcel, 12, this.f5957p, i10, false);
        o9.b.t(parcel, 13, this.f5958q, i10, false);
        o9.b.b(parcel, a10);
    }
}
