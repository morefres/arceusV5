package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import ja.f;
import n9.k;
import o9.b;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class StockProfileImageEntity extends zzg implements StockProfileImage {

    @NonNull
    public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new f();

    /* renamed from: f, reason: collision with root package name */
    public final String f6219f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f6220g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6221h;

    public StockProfileImageEntity(@NonNull String str, @NonNull Uri uri, @NonNull String str2) {
        this.f6219f = str;
        this.f6220g = uri;
        this.f6221h = str2;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public String C0() {
        return this.f6219f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return k.b(this.f6219f, stockProfileImage.C0()) && k.b(this.f6220g, stockProfileImage.zza()) && k.b(this.f6221h, stockProfileImage.zzb());
    }

    public final int hashCode() {
        return k.c(this.f6219f, this.f6220g);
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("ImageId", this.f6219f).a("ImageUri", this.f6220g).a("A11yLabel", this.f6221h).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.v(parcel, 1, C0(), false);
        b.t(parcel, 2, this.f6220g, i10, false);
        b.v(parcel, 3, this.f6221h, false);
        b.b(parcel, a10);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final Uri zza() {
        return this.f6220g;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final String zzb() {
        return this.f6221h;
    }
}
