package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import da.i;
import n9.k;

/* loaded from: classes.dex */
public final class zza extends zzg implements CurrentPlayerInfo {
    public static final Parcelable.Creator<zza> CREATOR = new i();

    /* renamed from: f, reason: collision with root package name */
    public final int f6315f;

    public zza(int i10) {
        this.f6315f = i10;
    }

    public static int a(CurrentPlayerInfo currentPlayerInfo) {
        return k.c(Integer.valueOf(currentPlayerInfo.A1()));
    }

    public static boolean v3(CurrentPlayerInfo currentPlayerInfo, Object obj) {
        if (obj instanceof CurrentPlayerInfo) {
            return obj == currentPlayerInfo || ((CurrentPlayerInfo) obj).A1() == currentPlayerInfo.A1();
        }
        return false;
    }

    public static String w3(CurrentPlayerInfo currentPlayerInfo) {
        k.a d10 = k.d(currentPlayerInfo);
        d10.a("FriendsListVisibilityStatus", Integer.valueOf(currentPlayerInfo.A1()));
        return d10.toString();
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int A1() {
        return this.f6315f;
    }

    public final boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // m9.e
    public final /* bridge */ /* synthetic */ CurrentPlayerInfo freeze() {
        return this;
    }

    public final int hashCode() {
        return a(this);
    }

    public final String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.a(this, parcel, i10);
    }

    public zza(CurrentPlayerInfo currentPlayerInfo) {
        this.f6315f = currentPlayerInfo.A1();
    }
}
