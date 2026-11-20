package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fb.d2;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new d2();

    /* renamed from: f, reason: collision with root package name */
    public final String f6387f;

    public zzs(String str) {
        this.f6387f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return k.b(this.f6387f, ((zzs) obj).f6387f);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f6387f);
    }

    public final String toString() {
        return k.d(this).a("gameRunToken", this.f6387f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6387f;
        int a10 = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.b(parcel, a10);
    }

    public final String zza() {
        return this.f6387f;
    }
}
