package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.e0;
import ca.t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import n9.k;

/* loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new e0();

    /* renamed from: f, reason: collision with root package name */
    public final Attachment f5988f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f5989g;

    /* renamed from: h, reason: collision with root package name */
    public final UserVerificationRequirement f5990h;

    /* renamed from: i, reason: collision with root package name */
    public final ResidentKeyRequirement f5991i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Attachment f5992a;
        public Boolean b;

        /* renamed from: c, reason: collision with root package name */
        public ResidentKeyRequirement f5993c;

        @NonNull
        public AuthenticatorSelectionCriteria a() {
            Attachment attachment = this.f5992a;
            String attachment2 = attachment == null ? null : attachment.toString();
            Boolean bool = this.b;
            ResidentKeyRequirement residentKeyRequirement = this.f5993c;
            return new AuthenticatorSelectionCriteria(attachment2, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        @NonNull
        public a b(Attachment attachment) {
            this.f5992a = attachment;
            return this;
        }

        @NonNull
        public a c(Boolean bool) {
            this.b = bool;
            return this;
        }

        @NonNull
        public a d(ResidentKeyRequirement residentKeyRequirement) {
            this.f5993c = residentKeyRequirement;
            return this;
        }
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment a10;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = Attachment.a(str);
            } catch (t | Attachment.a | ResidentKeyRequirement.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f5988f = a10;
        this.f5989g = bool;
        this.f5990h = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.a(str3);
        }
        this.f5991i = residentKeyRequirement;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return k.b(this.f5988f, authenticatorSelectionCriteria.f5988f) && k.b(this.f5989g, authenticatorSelectionCriteria.f5989g) && k.b(this.f5990h, authenticatorSelectionCriteria.f5990h) && k.b(x3(), authenticatorSelectionCriteria.x3());
    }

    public int hashCode() {
        return k.c(this.f5988f, this.f5989g, this.f5990h, x3());
    }

    @NonNull
    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.f5991i;
        UserVerificationRequirement userVerificationRequirement = this.f5990h;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.f5988f) + ", \n requireResidentKey=" + this.f5989g + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    public String v3() {
        Attachment attachment = this.f5988f;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean w3() {
        return this.f5989g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 2, v3(), false);
        o9.b.e(parcel, 3, w3(), false);
        UserVerificationRequirement userVerificationRequirement = this.f5990h;
        o9.b.v(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        o9.b.v(parcel, 5, y3(), false);
        o9.b.b(parcel, a10);
    }

    public ResidentKeyRequirement x3() {
        ResidentKeyRequirement residentKeyRequirement = this.f5991i;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f5989g;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public String y3() {
        ResidentKeyRequirement x32 = x3();
        if (x32 == null) {
            return null;
        }
        return x32.toString();
    }
}
