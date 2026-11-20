package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzg;
import ha.a;
import n9.k;
import o9.b;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class ExperienceEventEntity extends zzg implements ExperienceEvent {

    @NonNull
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final String f6179f;

    /* renamed from: g, reason: collision with root package name */
    public final GameEntity f6180g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6181h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6182i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6183j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f6184k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6185l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6186m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6187n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6188o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6189p;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j10, long j11, long j12, int i10, int i11) {
        this.f6179f = str;
        this.f6180g = gameEntity;
        this.f6181h = str2;
        this.f6182i = str3;
        this.f6183j = str4;
        this.f6184k = uri;
        this.f6185l = j10;
        this.f6186m = j11;
        this.f6187n = j12;
        this.f6188o = i10;
        this.f6189p = i11;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long c() {
        return this.f6186m;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int d() {
        return this.f6188o;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int e() {
        return this.f6189p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExperienceEvent experienceEvent = (ExperienceEvent) obj;
        return k.b(experienceEvent.zza(), this.f6179f) && k.b(experienceEvent.zzb(), this.f6180g) && k.b(experienceEvent.zzc(), this.f6181h) && k.b(experienceEvent.zzd(), this.f6182i) && k.b(experienceEvent.getIconImageUrl(), getIconImageUrl()) && k.b(experienceEvent.zze(), this.f6184k) && k.b(Long.valueOf(experienceEvent.zzf()), Long.valueOf(this.f6185l)) && k.b(Long.valueOf(experienceEvent.c()), Long.valueOf(this.f6186m)) && k.b(Long.valueOf(experienceEvent.zzh()), Long.valueOf(this.f6187n)) && k.b(Integer.valueOf(experienceEvent.d()), Integer.valueOf(this.f6188o)) && k.b(Integer.valueOf(experienceEvent.e()), Integer.valueOf(this.f6189p));
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public String getIconImageUrl() {
        return this.f6183j;
    }

    public final int hashCode() {
        return k.c(this.f6179f, this.f6180g, this.f6181h, this.f6182i, getIconImageUrl(), this.f6184k, Long.valueOf(this.f6185l), Long.valueOf(this.f6186m), Long.valueOf(this.f6187n), Integer.valueOf(this.f6188o), Integer.valueOf(this.f6189p));
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("ExperienceId", this.f6179f).a("Game", this.f6180g).a("DisplayTitle", this.f6181h).a("DisplayDescription", this.f6182i).a("IconImageUrl", getIconImageUrl()).a("IconImageUri", this.f6184k).a("CreatedTimestamp", Long.valueOf(this.f6185l)).a("XpEarned", Long.valueOf(this.f6186m)).a("CurrentXp", Long.valueOf(this.f6187n)).a("Type", Integer.valueOf(this.f6188o)).a("NewLevel", Integer.valueOf(this.f6189p)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6179f;
        int a10 = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.t(parcel, 2, this.f6180g, i10, false);
        b.v(parcel, 3, this.f6181h, false);
        b.v(parcel, 4, this.f6182i, false);
        b.v(parcel, 5, getIconImageUrl(), false);
        b.t(parcel, 6, this.f6184k, i10, false);
        b.r(parcel, 7, this.f6185l);
        b.r(parcel, 8, this.f6186m);
        b.r(parcel, 9, this.f6187n);
        b.n(parcel, 10, this.f6188o);
        b.n(parcel, 11, this.f6189p);
        b.b(parcel, a10);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zza() {
        return this.f6179f;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Game zzb() {
        return this.f6180g;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzc() {
        return this.f6181h;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzd() {
        return this.f6182i;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Uri zze() {
        return this.f6184k;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzf() {
        return this.f6185l;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzh() {
        return this.f6187n;
    }
}
