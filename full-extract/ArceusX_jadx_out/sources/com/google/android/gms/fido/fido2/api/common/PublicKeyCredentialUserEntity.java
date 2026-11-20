package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import n9.k;
import n9.m;

/* loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new o();

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f6053f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f6054g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6055h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final String f6056i;

    public PublicKeyCredentialUserEntity(m3 m3Var, String str, String str2, String str3) {
        this.f6053f = (m3) m.l(m3Var);
        this.f6054g = (String) m.l(str);
        this.f6055h = str2;
        this.f6056i = (String) m.l(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return k.b(this.f6053f, publicKeyCredentialUserEntity.f6053f) && k.b(this.f6054g, publicKeyCredentialUserEntity.f6054g) && k.b(this.f6055h, publicKeyCredentialUserEntity.f6055h) && k.b(this.f6056i, publicKeyCredentialUserEntity.f6056i);
    }

    @NonNull
    public String getName() {
        return this.f6054g;
    }

    public int hashCode() {
        return k.c(this.f6053f, this.f6054g, this.f6055h, this.f6056i);
    }

    @NonNull
    public String l() {
        return this.f6056i;
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + u9.c.b(this.f6053f.p()) + ", \n name='" + this.f6054g + "', \n icon='" + this.f6055h + "', \n displayName='" + this.f6056i + "'}";
    }

    public String v3() {
        return this.f6055h;
    }

    @NonNull
    public byte[] w3() {
        return this.f6053f.p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.g(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, getName(), false);
        o9.b.v(parcel, 4, v3(), false);
        o9.b.v(parcel, 5, l(), false);
        o9.b.b(parcel, a10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicKeyCredentialUserEntity(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull java.lang.String r4, java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6) {
        /*
            r2 = this;
            java.lang.Object r3 = n9.m.l(r3)
            byte[] r3 = (byte[]) r3
            eb.m3 r0 = eb.m3.b
            int r0 = r3.length
            r1 = 0
            eb.m3 r3 = eb.m3.m(r3, r1, r0)
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.<init>(byte[], java.lang.String, java.lang.String, java.lang.String):void");
    }
}
