package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import da.m;
import ja.b;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes.dex */
public final class PlayerRef extends m implements Player {

    /* renamed from: d, reason: collision with root package name */
    public final b f6147d;

    /* renamed from: e, reason: collision with root package name */
    public final PlayerLevelInfo f6148e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.games.internal.player.zzc f6149f;

    /* renamed from: g, reason: collision with root package name */
    public final zzq f6150g;

    /* renamed from: h, reason: collision with root package name */
    public final zzc f6151h;

    public PlayerRef(@NonNull DataHolder dataHolder, int i10, @NonNull String str) {
        super(dataHolder, i10);
        b bVar = new b(null);
        this.f6147d = bVar;
        this.f6149f = new com.google.android.gms.games.internal.player.zzc(dataHolder, i10, bVar);
        this.f6150g = new zzq(dataHolder, i10, bVar);
        this.f6151h = new zzc(dataHolder, i10, bVar);
        if (m(bVar.f21641k) || i(bVar.f21641k) == -1) {
            this.f6148e = null;
            return;
        }
        int g10 = g(bVar.f21642l);
        int g11 = g(bVar.f21645o);
        PlayerLevel playerLevel = new PlayerLevel(g10, i(bVar.f21643m), i(bVar.f21644n));
        this.f6148e = new PlayerLevelInfo(i(bVar.f21641k), i(bVar.f21647q), playerLevel, g10 != g11 ? new PlayerLevel(g11, i(bVar.f21644n), i(bVar.f21646p)) : playerLevel);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri B() {
        return n(this.f6147d.f21636f);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri G1() {
        return n(this.f6147d.C);
    }

    @Override // com.google.android.gms.games.Player
    public final long Z() {
        return i(this.f6147d.f21638h);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo a1() {
        zzq zzqVar = this.f6150g;
        if (zzqVar.X() == -1 && zzqVar.zza() == null && zzqVar.zzb() == null) {
            return null;
        }
        return zzqVar;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean c() {
        String str = this.f6147d.M;
        return k(str) && a(str);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri c0() {
        return n(this.f6147d.E);
    }

    @Override // com.google.android.gms.games.Player
    public final CurrentPlayerInfo c2() {
        zzc zzcVar = this.f6151h;
        if (zzcVar.zza()) {
            return zzcVar;
        }
        return null;
    }

    @Override // com.google.android.gms.games.Player
    public final long d() {
        String str = this.f6147d.G;
        if (!k(str) || m(str)) {
            return -1L;
        }
        return i(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return PlayerEntity.z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImageLandscapeUrl() {
        return j(this.f6147d.D);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImagePortraitUrl() {
        return j(this.f6147d.F);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getHiResImageUrl() {
        return j(this.f6147d.f21637g);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getIconImageUrl() {
        return j(this.f6147d.f21635e);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String getTitle() {
        return j(this.f6147d.f21648r);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri h() {
        return n(this.f6147d.f21634d);
    }

    public final int hashCode() {
        return PlayerEntity.y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String l() {
        return j(this.f6147d.f21633c);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String m3() {
        return j(this.f6147d.f21632a);
    }

    @Override // com.google.android.gms.games.Player
    public final long o0() {
        String str = this.f6147d.f21640j;
        if (!k(str) || m(str)) {
            return -1L;
        }
        return i(str);
    }

    @NonNull
    public final String toString() {
        return PlayerEntity.A3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final PlayerLevelInfo w0() {
        return this.f6148e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new PlayerEntity(this).writeToParcel(parcel, i10);
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return p(this.f6147d.b, null);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzb() {
        return j(this.f6147d.A);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return j(this.f6147d.B);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return a(this.f6147d.f21656z);
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return g(this.f6147d.f21639i);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return a(this.f6147d.f21649s);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        if (m(this.f6147d.f21650t)) {
            return null;
        }
        return this.f6149f;
    }
}
