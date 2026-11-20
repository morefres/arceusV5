package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import java.util.Arrays;
import n9.k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new a0();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6094f;

    /* renamed from: g, reason: collision with root package name */
    public final m3 f6095g;

    public zzh(boolean z10, m3 m3Var) {
        this.f6094f = z10;
        this.f6095g = m3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f6094f == zzhVar.f6094f && k.b(this.f6095g, zzhVar.f6095g);
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f6094f), this.f6095g);
    }

    public final String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + v3().toString() + "}";
    }

    public final JSONObject v3() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f6094f) {
                jSONObject.put("enabled", true);
            }
            byte[] w32 = w3();
            if (w32 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(w32, 32), 11));
                if (w32.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(w32, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final byte[] w3() {
        m3 m3Var = this.f6095g;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        boolean z10 = this.f6094f;
        int a10 = o9.b.a(parcel);
        o9.b.c(parcel, 1, z10);
        o9.b.g(parcel, 2, w3(), false);
        o9.b.b(parcel, a10);
    }
}
