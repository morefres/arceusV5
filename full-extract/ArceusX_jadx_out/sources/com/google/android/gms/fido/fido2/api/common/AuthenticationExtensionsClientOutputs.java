package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.w;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new w();

    /* renamed from: f, reason: collision with root package name */
    public final UvmEntries f5970f;

    /* renamed from: g, reason: collision with root package name */
    public final zzf f5971g;

    /* renamed from: h, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f5972h;

    /* renamed from: i, reason: collision with root package name */
    public final zzh f5973i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5974j;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.f5970f = uvmEntries;
        this.f5971g = zzfVar;
        this.f5972h = authenticationExtensionsCredPropsOutputs;
        this.f5973i = zzhVar;
        this.f5974j = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return k.b(this.f5970f, authenticationExtensionsClientOutputs.f5970f) && k.b(this.f5971g, authenticationExtensionsClientOutputs.f5971g) && k.b(this.f5972h, authenticationExtensionsClientOutputs.f5972h) && k.b(this.f5973i, authenticationExtensionsClientOutputs.f5973i) && k.b(this.f5974j, authenticationExtensionsClientOutputs.f5974j);
    }

    public int hashCode() {
        return k.c(this.f5970f, this.f5971g, this.f5972h, this.f5973i, this.f5974j);
    }

    @NonNull
    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + x3().toString() + "}";
    }

    public AuthenticationExtensionsCredPropsOutputs v3() {
        return this.f5972h;
    }

    public UvmEntries w3() {
        return this.f5970f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 1, w3(), i10, false);
        o9.b.t(parcel, 2, this.f5971g, i10, false);
        o9.b.t(parcel, 3, v3(), i10, false);
        o9.b.t(parcel, 4, this.f5973i, i10, false);
        o9.b.v(parcel, 5, this.f5974j, false);
        o9.b.b(parcel, a10);
    }

    @NonNull
    public final JSONObject x3() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f5972h;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.w3());
            }
            UvmEntries uvmEntries = this.f5970f;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.w3());
            }
            zzh zzhVar = this.f5973i;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.v3());
            }
            String str = this.f5974j;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }
}
