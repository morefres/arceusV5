package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import ia.a;
import n9.k;
import o9.b;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements zza {

    @NonNull
    public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new a();

    /* renamed from: h, reason: collision with root package name */
    public final int f6190h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6191i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6192j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f6193k;

    public GameBadgeEntity(int i10, String str, String str2, Uri uri) {
        this.f6190h = i10;
        this.f6191i = str;
        this.f6192j = str2;
        this.f6193k = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zza zzaVar = (zza) obj;
        return k.b(Integer.valueOf(zzaVar.zza()), this.f6191i) && k.b(zzaVar.zzb(), this.f6193k);
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f6190h), this.f6191i, this.f6192j, this.f6193k);
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("Type", Integer.valueOf(this.f6190h)).a("Title", this.f6191i).a("Description", this.f6192j).a("IconImageUri", this.f6193k).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeInt(this.f6190h);
            parcel.writeString(this.f6191i);
            parcel.writeString(this.f6192j);
            Uri uri = this.f6193k;
            parcel.writeString(uri == null ? null : uri.toString());
            return;
        }
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f6190h);
        b.v(parcel, 2, this.f6191i, false);
        b.v(parcel, 3, this.f6192j, false);
        b.t(parcel, 4, this.f6193k, i10, false);
        b.b(parcel, a10);
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final int zza() {
        return this.f6190h;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    @NonNull
    public final String zzb() {
        return this.f6192j;
    }
}
