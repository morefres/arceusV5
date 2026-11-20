package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import da.k;
import o9.b;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {

    @NonNull
    public static final Parcelable.Creator<GameEntity> CREATOR = new k();
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final boolean G;

    /* renamed from: h, reason: collision with root package name */
    public final String f6102h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6103i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6104j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6105k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6106l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6107m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f6108n;

    /* renamed from: o, reason: collision with root package name */
    public final Uri f6109o;

    /* renamed from: p, reason: collision with root package name */
    public final Uri f6110p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6111q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6112r;

    /* renamed from: s, reason: collision with root package name */
    public final String f6113s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6114t;

    /* renamed from: u, reason: collision with root package name */
    public final int f6115u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6116v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6117w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f6118x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6119y;

    /* renamed from: z, reason: collision with root package name */
    public final String f6120z;

    public GameEntity(@NonNull Game game) {
        this.f6102h = game.O1();
        this.f6104j = game.Y();
        this.f6105k = game.O0();
        this.f6106l = game.getDescription();
        this.f6107m = game.g0();
        this.f6103i = game.l();
        this.f6108n = game.h();
        this.f6119y = game.getIconImageUrl();
        this.f6109o = game.B();
        this.f6120z = game.getHiResImageUrl();
        this.f6110p = game.C1();
        this.A = game.getFeaturedImageUrl();
        this.f6111q = game.zza();
        this.f6112r = game.zze();
        this.f6113s = game.zzf();
        this.f6114t = 1;
        this.f6115u = game.N0();
        this.f6116v = game.d2();
        this.f6117w = game.c();
        this.f6118x = game.zzh();
        this.B = game.zzb();
        this.C = game.zzc();
        this.D = game.D0();
        this.E = game.B0();
        this.F = game.s1();
        this.G = game.zzd();
    }

    public static String A3(Game game) {
        return n9.k.d(game).a("ApplicationId", game.O1()).a("DisplayName", game.l()).a("PrimaryCategory", game.Y()).a("SecondaryCategory", game.O0()).a("Description", game.getDescription()).a("DeveloperName", game.g0()).a("IconImageUri", game.h()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.B()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.C1()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.zza())).a("InstanceInstalled", Boolean.valueOf(game.zze())).a("InstancePackageName", game.zzf()).a("AchievementTotalCount", Integer.valueOf(game.N0())).a("LeaderboardCount", Integer.valueOf(game.d2())).a("AreSnapshotsEnabled", Boolean.valueOf(game.D0())).a("ThemeColor", game.B0()).a("HasGamepadSupport", Boolean.valueOf(game.s1())).toString();
    }

    public static int y3(Game game) {
        return n9.k.c(game.O1(), game.l(), game.Y(), game.O0(), game.getDescription(), game.g0(), game.h(), game.B(), game.C1(), Boolean.valueOf(game.zza()), Boolean.valueOf(game.zze()), game.zzf(), Integer.valueOf(game.N0()), Integer.valueOf(game.d2()), Boolean.valueOf(game.c()), Boolean.valueOf(game.zzh()), Boolean.valueOf(game.zzb()), Boolean.valueOf(game.zzc()), Boolean.valueOf(game.D0()), game.B0(), Boolean.valueOf(game.s1()), Boolean.valueOf(game.zzd()));
    }

    public static boolean z3(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return n9.k.b(game2.O1(), game.O1()) && n9.k.b(game2.l(), game.l()) && n9.k.b(game2.Y(), game.Y()) && n9.k.b(game2.O0(), game.O0()) && n9.k.b(game2.getDescription(), game.getDescription()) && n9.k.b(game2.g0(), game.g0()) && n9.k.b(game2.h(), game.h()) && n9.k.b(game2.B(), game.B()) && n9.k.b(game2.C1(), game.C1()) && n9.k.b(Boolean.valueOf(game2.zza()), Boolean.valueOf(game.zza())) && n9.k.b(Boolean.valueOf(game2.zze()), Boolean.valueOf(game.zze())) && n9.k.b(game2.zzf(), game.zzf()) && n9.k.b(Integer.valueOf(game2.N0()), Integer.valueOf(game.N0())) && n9.k.b(Integer.valueOf(game2.d2()), Integer.valueOf(game.d2())) && n9.k.b(Boolean.valueOf(game2.c()), Boolean.valueOf(game.c())) && n9.k.b(Boolean.valueOf(game2.zzh()), Boolean.valueOf(game.zzh())) && n9.k.b(Boolean.valueOf(game2.zzb()), Boolean.valueOf(game.zzb())) && n9.k.b(Boolean.valueOf(game2.zzc()), Boolean.valueOf(game.zzc())) && n9.k.b(Boolean.valueOf(game2.D0()), Boolean.valueOf(game.D0())) && n9.k.b(game2.B0(), game.B0()) && n9.k.b(Boolean.valueOf(game2.s1()), Boolean.valueOf(game.s1())) && n9.k.b(Boolean.valueOf(game2.zzd()), Boolean.valueOf(game.zzd()));
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri B() {
        return this.f6109o;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String B0() {
        return this.E;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri C1() {
        return this.f6110p;
    }

    @Override // com.google.android.gms.games.Game
    public boolean D0() {
        return this.D;
    }

    @Override // com.google.android.gms.games.Game
    public int N0() {
        return this.f6115u;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String O0() {
        return this.f6105k;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String O1() {
        return this.f6102h;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String Y() {
        return this.f6104j;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean c() {
        return this.f6117w;
    }

    @Override // com.google.android.gms.games.Game
    public int d2() {
        return this.f6116v;
    }

    public boolean equals(Object obj) {
        return z3(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String g0() {
        return this.f6107m;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getDescription() {
        return this.f6106l;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getFeaturedImageUrl() {
        return this.A;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getHiResImageUrl() {
        return this.f6120z;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getIconImageUrl() {
        return this.f6119y;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri h() {
        return this.f6108n;
    }

    public int hashCode() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String l() {
        return this.f6103i;
    }

    @Override // com.google.android.gms.games.Game
    public boolean s1() {
        return this.F;
    }

    @NonNull
    public String toString() {
        return A3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeString(this.f6102h);
            parcel.writeString(this.f6103i);
            parcel.writeString(this.f6104j);
            parcel.writeString(this.f6105k);
            parcel.writeString(this.f6106l);
            parcel.writeString(this.f6107m);
            Uri uri = this.f6108n;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6109o;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.f6110p;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.f6111q ? 1 : 0);
            parcel.writeInt(this.f6112r ? 1 : 0);
            parcel.writeString(this.f6113s);
            parcel.writeInt(this.f6114t);
            parcel.writeInt(this.f6115u);
            parcel.writeInt(this.f6116v);
            return;
        }
        int a10 = b.a(parcel);
        b.v(parcel, 1, O1(), false);
        b.v(parcel, 2, l(), false);
        b.v(parcel, 3, Y(), false);
        b.v(parcel, 4, O0(), false);
        b.v(parcel, 5, getDescription(), false);
        b.v(parcel, 6, g0(), false);
        b.t(parcel, 7, h(), i10, false);
        b.t(parcel, 8, B(), i10, false);
        b.t(parcel, 9, C1(), i10, false);
        b.c(parcel, 10, this.f6111q);
        b.c(parcel, 11, this.f6112r);
        b.v(parcel, 12, this.f6113s, false);
        b.n(parcel, 13, this.f6114t);
        b.n(parcel, 14, N0());
        b.n(parcel, 15, d2());
        b.c(parcel, 16, this.f6117w);
        b.c(parcel, 17, this.f6118x);
        b.v(parcel, 18, getIconImageUrl(), false);
        b.v(parcel, 19, getHiResImageUrl(), false);
        b.v(parcel, 20, getFeaturedImageUrl(), false);
        b.c(parcel, 21, this.B);
        b.c(parcel, 22, this.C);
        b.c(parcel, 23, D0());
        b.v(parcel, 24, B0(), false);
        b.c(parcel, 25, s1());
        b.c(parcel, 28, this.G);
        b.b(parcel, a10);
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zza() {
        return this.f6111q;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
        return this.B;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
        return this.C;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
        return this.G;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
        return this.f6112r;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String zzf() {
        return this.f6113s;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzh() {
        return this.f6118x;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z10, boolean z11, String str7, int i10, int i11, int i12, boolean z12, boolean z13, String str8, String str9, String str10, boolean z14, boolean z15, boolean z16, String str11, boolean z17, boolean z18) {
        this.f6102h = str;
        this.f6103i = str2;
        this.f6104j = str3;
        this.f6105k = str4;
        this.f6106l = str5;
        this.f6107m = str6;
        this.f6108n = uri;
        this.f6119y = str8;
        this.f6109o = uri2;
        this.f6120z = str9;
        this.f6110p = uri3;
        this.A = str10;
        this.f6111q = z10;
        this.f6112r = z11;
        this.f6113s = str7;
        this.f6114t = i10;
        this.f6115u = i11;
        this.f6116v = i12;
        this.f6117w = z12;
        this.f6118x = z13;
        this.B = z14;
        this.C = z15;
        this.D = z16;
        this.E = str11;
        this.F = z17;
        this.G = z18;
    }
}
