package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fb.c2;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new c2();

    /* renamed from: f, reason: collision with root package name */
    public final int f6385f;

    /* renamed from: g, reason: collision with root package name */
    public final zzx f6386g;

    public zzq(int i10, zzx zzxVar) {
        this.f6385f = i10;
        this.f6386g = zzxVar;
    }

    public static zzq v3(int i10) {
        return new zzq(i10, null);
    }

    public static zzq w3(int i10, zzx zzxVar) {
        return new zzq(i10, zzxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f6385f == zzqVar.f6385f && k.b(this.f6386g, zzqVar.f6386g);
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f6385f), this.f6386g);
    }

    public final String toString() {
        return k.d(this).a("signInType", Integer.valueOf(this.f6385f)).a("previousStepResolutionResult", this.f6386g).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f6385f);
        b.t(parcel, 2, this.f6386g, i10, false);
        b.b(parcel, a10);
    }

    public final int zzc() {
        return this.f6385f;
    }

    public final boolean zzd() {
        return this.f6386g == null;
    }
}
