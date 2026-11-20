package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import n9.k;

/* loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new z();

    /* renamed from: f, reason: collision with root package name */
    public final m3 f6092f;

    /* renamed from: g, reason: collision with root package name */
    public final m3 f6093g;

    public zzf(m3 m3Var, m3 m3Var2) {
        this.f6092f = m3Var;
        this.f6093g = m3Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return k.b(this.f6092f, zzfVar.f6092f) && k.b(this.f6093g, zzfVar.f6093g);
    }

    public final int hashCode() {
        return k.c(this.f6092f, this.f6093g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        m3 m3Var = this.f6092f;
        int a10 = o9.b.a(parcel);
        o9.b.g(parcel, 1, m3Var == null ? null : m3Var.p(), false);
        m3 m3Var2 = this.f6093g;
        o9.b.g(parcel, 2, m3Var2 != null ? m3Var2.p() : null, false);
        o9.b.b(parcel, a10);
    }
}
