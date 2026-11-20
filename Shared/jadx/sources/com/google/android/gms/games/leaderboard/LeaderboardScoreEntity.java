package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import ma.b;
import n9.k;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class LeaderboardScoreEntity implements b {

    /* renamed from: a, reason: collision with root package name */
    public final long f6255a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6256c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6257d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6258e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6259f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f6260g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f6261h;

    /* renamed from: i, reason: collision with root package name */
    public final PlayerEntity f6262i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6263j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6264k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6265l;

    public static int a(b bVar) {
        return k.c(Long.valueOf(bVar.k2()), bVar.w1(), Long.valueOf(bVar.j2()), bVar.h1(), Long.valueOf(bVar.f2()), bVar.O2(), bVar.X2(), bVar.e3(), bVar.L());
    }

    public static boolean b(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return k.b(Long.valueOf(bVar2.k2()), Long.valueOf(bVar.k2())) && k.b(bVar2.w1(), bVar.w1()) && k.b(Long.valueOf(bVar2.j2()), Long.valueOf(bVar.j2())) && k.b(bVar2.h1(), bVar.h1()) && k.b(Long.valueOf(bVar2.f2()), Long.valueOf(bVar.f2())) && k.b(bVar2.O2(), bVar.O2()) && k.b(bVar2.X2(), bVar.X2()) && k.b(bVar2.e3(), bVar.e3()) && k.b(bVar2.L(), bVar.L()) && k.b(bVar2.a0(), bVar.a0());
    }

    public static String f(b bVar) {
        return k.d(bVar).a("Rank", Long.valueOf(bVar.k2())).a("DisplayRank", bVar.w1()).a("Score", Long.valueOf(bVar.j2())).a("DisplayScore", bVar.h1()).a("Timestamp", Long.valueOf(bVar.f2())).a("DisplayName", bVar.O2()).a("IconImageUri", bVar.X2()).a("IconImageUrl", bVar.getScoreHolderIconImageUrl()).a("HiResImageUri", bVar.e3()).a("HiResImageUrl", bVar.getScoreHolderHiResImageUrl()).a("Player", bVar.L() == null ? null : bVar.L()).a("ScoreTag", bVar.a0()).toString();
    }

    @Override // ma.b
    @NonNull
    public final Player L() {
        return this.f6262i;
    }

    @Override // ma.b
    @NonNull
    public final String O2() {
        PlayerEntity playerEntity = this.f6262i;
        return playerEntity == null ? this.f6259f : playerEntity.l();
    }

    @Override // ma.b
    @NonNull
    public final Uri X2() {
        PlayerEntity playerEntity = this.f6262i;
        return playerEntity == null ? this.f6260g : playerEntity.h();
    }

    @Override // ma.b
    @NonNull
    public final String a0() {
        return this.f6263j;
    }

    @Override // ma.b
    @NonNull
    public final Uri e3() {
        PlayerEntity playerEntity = this.f6262i;
        return playerEntity == null ? this.f6261h : playerEntity.B();
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    @Override // ma.b
    public final long f2() {
        return this.f6258e;
    }

    @Override // ma.b
    @NonNull
    public String getScoreHolderHiResImageUrl() {
        PlayerEntity playerEntity = this.f6262i;
        return playerEntity == null ? this.f6265l : playerEntity.getHiResImageUrl();
    }

    @Override // ma.b
    @NonNull
    public String getScoreHolderIconImageUrl() {
        PlayerEntity playerEntity = this.f6262i;
        return playerEntity == null ? this.f6264k : playerEntity.getIconImageUrl();
    }

    @Override // ma.b
    @NonNull
    public final String h1() {
        return this.f6256c;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.b
    public final long j2() {
        return this.f6257d;
    }

    @Override // ma.b
    public final long k2() {
        return this.f6255a;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.b
    @NonNull
    public final String w1() {
        return this.b;
    }
}
