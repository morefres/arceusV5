package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;

/* loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new ca.g();

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f6080f;

    public zzag(@NonNull String str) {
        this.f6080f = (String) m.l(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f6080f.equals(((zzag) obj).f6080f);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f6080f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6080f;
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, str, false);
        o9.b.b(parcel, a10);
    }
}
