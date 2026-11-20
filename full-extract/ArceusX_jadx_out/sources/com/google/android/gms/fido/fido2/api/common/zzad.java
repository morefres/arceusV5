package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;

/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new ca.e();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6079f;

    public zzad(boolean z10) {
        this.f6079f = ((Boolean) m.l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzad) && this.f6079f == ((zzad) obj).f6079f;
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f6079f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f6079f;
        int a10 = o9.b.a(parcel);
        o9.b.c(parcel, 1, z10);
        o9.b.b(parcel, a10);
    }
}
