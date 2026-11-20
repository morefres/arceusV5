package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import da.q;
import n9.b;
import n9.k;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {

    @NonNull
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new q();
    public final String A;
    public final long B;
    public final zzo C;
    public final zza D;
    public final boolean E;
    public final String F;

    /* renamed from: h, reason: collision with root package name */
    public final String f6121h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6122i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f6123j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f6124k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6125l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6126m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6127n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6128o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6129p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6130q;

    /* renamed from: r, reason: collision with root package name */
    public final MostRecentGameInfoEntity f6131r;

    /* renamed from: s, reason: collision with root package name */
    public final PlayerLevelInfo f6132s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f6133t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f6134u;

    /* renamed from: v, reason: collision with root package name */
    public final String f6135v;

    /* renamed from: w, reason: collision with root package name */
    public final String f6136w;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f6137x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6138y;

    /* renamed from: z, reason: collision with root package name */
    public final Uri f6139z;

    public PlayerEntity(@NonNull Player player) {
        String m32 = player.m3();
        this.f6121h = m32;
        String l10 = player.l();
        this.f6122i = l10;
        this.f6123j = player.h();
        this.f6128o = player.getIconImageUrl();
        this.f6124k = player.B();
        this.f6129p = player.getHiResImageUrl();
        long Z = player.Z();
        this.f6125l = Z;
        this.f6126m = player.zze();
        this.f6127n = player.o0();
        this.f6130q = player.getTitle();
        this.f6133t = player.zzf();
        com.google.android.gms.games.internal.player.zza zzh = player.zzh();
        this.f6131r = zzh == null ? null : new MostRecentGameInfoEntity(zzh);
        this.f6132s = player.w0();
        this.f6134u = player.zzd();
        this.f6135v = player.zzb();
        this.f6136w = player.zzc();
        this.f6137x = player.G1();
        this.f6138y = player.getBannerImageLandscapeUrl();
        this.f6139z = player.c0();
        this.A = player.getBannerImagePortraitUrl();
        this.B = player.d();
        PlayerRelationshipInfo a12 = player.a1();
        this.C = a12 == null ? null : new zzo(a12.freeze());
        CurrentPlayerInfo c22 = player.c2();
        this.D = c22 != null ? (zza) c22.freeze() : null;
        this.E = player.c();
        this.F = player.zza();
        b.a(m32);
        b.a(l10);
        b.b(Z > 0);
    }

    public static String A3(Player player) {
        k.a a10 = k.d(player).a("PlayerId", player.m3()).a("DisplayName", player.l()).a("HasDebugAccess", Boolean.valueOf(player.zzd())).a("IconImageUri", player.h()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.B()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.Z())).a("Title", player.getTitle()).a("LevelInfo", player.w0()).a("GamerTag", player.zzb()).a("Name", player.zzc()).a("BannerImageLandscapeUri", player.G1()).a("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", player.c0()).a("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).a("CurrentPlayerInfo", player.c2()).a("TotalUnlockedAchievement", Long.valueOf(player.d()));
        if (player.c()) {
            a10.a("AlwaysAutoSignIn", Boolean.valueOf(player.c()));
        }
        if (player.a1() != null) {
            a10.a("RelationshipInfo", player.a1());
        }
        if (player.zza() != null) {
            a10.a("GamePlayerId", player.zza());
        }
        return a10.toString();
    }

    public static int y3(Player player) {
        return k.c(player.m3(), player.l(), Boolean.valueOf(player.zzd()), player.h(), player.B(), Long.valueOf(player.Z()), player.getTitle(), player.w0(), player.zzb(), player.zzc(), player.G1(), player.c0(), Long.valueOf(player.d()), player.a1(), player.c2(), Boolean.valueOf(player.c()), player.zza());
    }

    public static boolean z3(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return k.b(player2.m3(), player.m3()) && k.b(player2.l(), player.l()) && k.b(Boolean.valueOf(player2.zzd()), Boolean.valueOf(player.zzd())) && k.b(player2.h(), player.h()) && k.b(player2.B(), player.B()) && k.b(Long.valueOf(player2.Z()), Long.valueOf(player.Z())) && k.b(player2.getTitle(), player.getTitle()) && k.b(player2.w0(), player.w0()) && k.b(player2.zzb(), player.zzb()) && k.b(player2.zzc(), player.zzc()) && k.b(player2.G1(), player.G1()) && k.b(player2.c0(), player.c0()) && k.b(Long.valueOf(player2.d()), Long.valueOf(player.d())) && k.b(player2.c2(), player.c2()) && k.b(player2.a1(), player.a1()) && k.b(Boolean.valueOf(player2.c()), Boolean.valueOf(player.c())) && k.b(player2.zza(), player.zza());
    }

    @Override // com.google.android.gms.games.Player
    public Uri B() {
        return this.f6124k;
    }

    @Override // com.google.android.gms.games.Player
    public Uri G1() {
        return this.f6137x;
    }

    @Override // com.google.android.gms.games.Player
    public long Z() {
        return this.f6125l;
    }

    @Override // com.google.android.gms.games.Player
    public PlayerRelationshipInfo a1() {
        return this.C;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean c() {
        return this.E;
    }

    @Override // com.google.android.gms.games.Player
    public Uri c0() {
        return this.f6139z;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public CurrentPlayerInfo c2() {
        return this.D;
    }

    @Override // com.google.android.gms.games.Player
    public final long d() {
        return this.B;
    }

    public boolean equals(Object obj) {
        return z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return this.f6138y;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return this.A;
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.f6129p;
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.f6128o;
    }

    @Override // com.google.android.gms.games.Player
    public String getTitle() {
        return this.f6130q;
    }

    @Override // com.google.android.gms.games.Player
    public Uri h() {
        return this.f6123j;
    }

    public int hashCode() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String l() {
        return this.f6122i;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String m3() {
        return this.f6121h;
    }

    @Override // com.google.android.gms.games.Player
    public long o0() {
        return this.f6127n;
    }

    @NonNull
    public String toString() {
        return A3(this);
    }

    @Override // com.google.android.gms.games.Player
    public PlayerLevelInfo w0() {
        return this.f6132s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeString(this.f6121h);
            parcel.writeString(this.f6122i);
            Uri uri = this.f6123j;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6124k;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.f6125l);
            return;
        }
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, m3(), false);
        o9.b.v(parcel, 2, l(), false);
        o9.b.t(parcel, 3, h(), i10, false);
        o9.b.t(parcel, 4, B(), i10, false);
        o9.b.r(parcel, 5, Z());
        o9.b.n(parcel, 6, this.f6126m);
        o9.b.r(parcel, 7, o0());
        o9.b.v(parcel, 8, getIconImageUrl(), false);
        o9.b.v(parcel, 9, getHiResImageUrl(), false);
        o9.b.v(parcel, 14, getTitle(), false);
        o9.b.t(parcel, 15, this.f6131r, i10, false);
        o9.b.t(parcel, 16, w0(), i10, false);
        o9.b.c(parcel, 18, this.f6133t);
        o9.b.c(parcel, 19, this.f6134u);
        o9.b.v(parcel, 20, this.f6135v, false);
        o9.b.v(parcel, 21, this.f6136w, false);
        o9.b.t(parcel, 22, G1(), i10, false);
        o9.b.v(parcel, 23, getBannerImageLandscapeUrl(), false);
        o9.b.t(parcel, 24, c0(), i10, false);
        o9.b.v(parcel, 25, getBannerImagePortraitUrl(), false);
        o9.b.r(parcel, 29, this.B);
        o9.b.t(parcel, 33, a1(), i10, false);
        o9.b.t(parcel, 35, c2(), i10, false);
        o9.b.c(parcel, 36, this.E);
        o9.b.v(parcel, 37, this.F, false);
        o9.b.b(parcel, a10);
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return this.F;
    }

    @Override // com.google.android.gms.games.Player
    public final String zzb() {
        return this.f6135v;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return this.f6136w;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return this.f6134u;
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return this.f6126m;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return this.f6133t;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        return this.f6131r;
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j10, int i10, long j11, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z10, boolean z11, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j12, zzo zzoVar, zza zzaVar, boolean z12, String str10) {
        this.f6121h = str;
        this.f6122i = str2;
        this.f6123j = uri;
        this.f6128o = str3;
        this.f6124k = uri2;
        this.f6129p = str4;
        this.f6125l = j10;
        this.f6126m = i10;
        this.f6127n = j11;
        this.f6130q = str5;
        this.f6133t = z10;
        this.f6131r = mostRecentGameInfoEntity;
        this.f6132s = playerLevelInfo;
        this.f6134u = z11;
        this.f6135v = str6;
        this.f6136w = str7;
        this.f6137x = uri3;
        this.f6138y = str8;
        this.f6139z = uri4;
        this.A = str9;
        this.B = j12;
        this.C = zzoVar;
        this.D = zzaVar;
        this.E = z12;
        this.F = str10;
    }
}
