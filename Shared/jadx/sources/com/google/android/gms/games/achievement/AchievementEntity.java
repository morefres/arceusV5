package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzg;
import ea.b;
import n9.k;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class AchievementEntity extends zzg implements Achievement {

    @NonNull
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    public final String f6152f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6153g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6154h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6155i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f6156j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6157k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f6158l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6159m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6160n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6161o;

    /* renamed from: p, reason: collision with root package name */
    public final PlayerEntity f6162p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6163q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6164r;

    /* renamed from: s, reason: collision with root package name */
    public final String f6165s;

    /* renamed from: t, reason: collision with root package name */
    public final long f6166t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6167u;

    /* renamed from: v, reason: collision with root package name */
    public final float f6168v;

    /* renamed from: w, reason: collision with root package name */
    public final String f6169w;

    public AchievementEntity(@NonNull Achievement achievement) {
        String F0 = achievement.F0();
        this.f6152f = F0;
        this.f6153g = achievement.getType();
        this.f6154h = achievement.getName();
        String description = achievement.getDescription();
        this.f6155i = description;
        this.f6156j = achievement.H();
        this.f6157k = achievement.getUnlockedImageUrl();
        this.f6158l = achievement.D2();
        this.f6159m = achievement.getRevealedImageUrl();
        Player zzb = achievement.zzb();
        if (zzb != null) {
            this.f6162p = new PlayerEntity(zzb);
        } else {
            this.f6162p = null;
        }
        this.f6163q = achievement.getState();
        this.f6166t = achievement.g1();
        this.f6167u = achievement.m2();
        this.f6168v = achievement.zzc();
        this.f6169w = achievement.zza();
        if (achievement.getType() == 1) {
            this.f6160n = achievement.o1();
            this.f6161o = achievement.H1();
            this.f6164r = achievement.J2();
            this.f6165s = achievement.U1();
        } else {
            this.f6160n = 0;
            this.f6161o = null;
            this.f6164r = 0;
            this.f6165s = null;
        }
        n9.b.a(F0);
        n9.b.a(description);
    }

    public static int a(Achievement achievement) {
        int i10;
        int i11;
        if (achievement.getType() == 1) {
            i10 = achievement.J2();
            i11 = achievement.o1();
        } else {
            i10 = 0;
            i11 = 0;
        }
        return k.c(achievement.F0(), achievement.zza(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.m2()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.g1()), achievement.zzb(), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static boolean v3(Achievement achievement, Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        Achievement achievement2 = (Achievement) obj;
        if (achievement2.getType() != achievement.getType()) {
            return false;
        }
        return (achievement.getType() != 1 || (achievement2.J2() == achievement.J2() && achievement2.o1() == achievement.o1())) && achievement2.m2() == achievement.m2() && achievement2.getState() == achievement.getState() && achievement2.g1() == achievement.g1() && k.b(achievement2.F0(), achievement.F0()) && k.b(achievement2.zza(), achievement.zza()) && k.b(achievement2.getName(), achievement.getName()) && k.b(achievement2.getDescription(), achievement.getDescription()) && k.b(achievement2.zzb(), achievement.zzb()) && achievement2.zzc() == achievement.zzc();
    }

    public static String w3(Achievement achievement) {
        k.a a10 = k.d(achievement).a("Id", achievement.F0()).a("Game Id", achievement.zza()).a("Type", Integer.valueOf(achievement.getType())).a("Name", achievement.getName()).a("Description", achievement.getDescription()).a("Player", achievement.zzb()).a("State", Integer.valueOf(achievement.getState())).a("Rarity Percent", Float.valueOf(achievement.zzc()));
        if (achievement.getType() == 1) {
            a10.a("CurrentSteps", Integer.valueOf(achievement.J2()));
            a10.a("TotalSteps", Integer.valueOf(achievement.o1()));
        }
        return a10.toString();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri D2() {
        return this.f6158l;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String F0() {
        return this.f6152f;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri H() {
        return this.f6156j;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String H1() {
        n9.b.b(getType() == 1);
        return this.f6161o;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int J2() {
        n9.b.b(getType() == 1);
        return this.f6164r;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String U1() {
        n9.b.b(getType() == 1);
        return this.f6165s;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long g1() {
        return this.f6166t;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getDescription() {
        return this.f6155i;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getName() {
        return this.f6154h;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.f6159m;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.f6163q;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.f6153g;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.f6157k;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long m2() {
        return this.f6167u;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int o1() {
        n9.b.b(getType() == 1);
        return this.f6160n;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, F0(), false);
        o9.b.n(parcel, 2, getType());
        o9.b.v(parcel, 3, getName(), false);
        o9.b.v(parcel, 4, getDescription(), false);
        o9.b.t(parcel, 5, H(), i10, false);
        o9.b.v(parcel, 6, getUnlockedImageUrl(), false);
        o9.b.t(parcel, 7, D2(), i10, false);
        o9.b.v(parcel, 8, getRevealedImageUrl(), false);
        o9.b.n(parcel, 9, this.f6160n);
        o9.b.v(parcel, 10, this.f6161o, false);
        o9.b.t(parcel, 11, this.f6162p, i10, false);
        o9.b.n(parcel, 12, getState());
        o9.b.n(parcel, 13, this.f6164r);
        o9.b.v(parcel, 14, this.f6165s, false);
        o9.b.r(parcel, 15, g1());
        o9.b.r(parcel, 16, m2());
        o9.b.k(parcel, 17, this.f6168v);
        o9.b.v(parcel, 18, this.f6169w, false);
        o9.b.b(parcel, a10);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String zza() {
        return this.f6169w;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzb() {
        return this.f6162p;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zzc() {
        return this.f6168v;
    }

    public AchievementEntity(String str, int i10, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i11, String str6, PlayerEntity playerEntity, int i12, int i13, String str7, long j10, long j11, float f10, String str8) {
        this.f6152f = str;
        this.f6153g = i10;
        this.f6154h = str2;
        this.f6155i = str3;
        this.f6156j = uri;
        this.f6157k = str4;
        this.f6158l = uri2;
        this.f6159m = str5;
        this.f6160n = i11;
        this.f6161o = str6;
        this.f6162p = playerEntity;
        this.f6163q = i12;
        this.f6164r = i13;
        this.f6165s = str7;
        this.f6166t = j10;
        this.f6167u = j11;
        this.f6168v = f10;
        this.f6169w = str8;
    }
}
