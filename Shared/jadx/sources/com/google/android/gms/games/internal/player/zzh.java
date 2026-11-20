package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import ja.e;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class zzh extends zzg {
    public static final Parcelable.Creator<zzh> CREATOR = new e();

    /* renamed from: f, reason: collision with root package name */
    public final String f6233f;

    public zzh(String str) {
        this.f6233f = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return k.b(this.f6233f, ((zzh) obj).f6233f);
    }

    public final int hashCode() {
        return k.c(this.f6233f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6233f;
        int a10 = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.b(parcel, a10);
    }
}
