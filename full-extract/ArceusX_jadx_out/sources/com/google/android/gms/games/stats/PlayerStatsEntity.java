package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import n9.k;
import qa.a;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public class PlayerStatsEntity extends zzg implements PlayerStats {

    @NonNull
    public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final float f6299f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6300g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6301h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6302i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6303j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6304k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6305l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f6306m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6307n;

    /* renamed from: o, reason: collision with root package name */
    public final float f6308o;

    /* renamed from: p, reason: collision with root package name */
    public final float f6309p;

    public PlayerStatsEntity(float f10, float f11, int i10, int i11, int i12, float f12, float f13, Bundle bundle, float f14, float f15, float f16) {
        this.f6299f = f10;
        this.f6300g = f11;
        this.f6301h = i10;
        this.f6302i = i11;
        this.f6303j = i12;
        this.f6304k = f12;
        this.f6305l = f13;
        this.f6306m = bundle;
        this.f6307n = f14;
        this.f6308o = f15;
        this.f6309p = f16;
    }

    public static int w3(PlayerStats playerStats) {
        return k.c(Float.valueOf(playerStats.t3()), Float.valueOf(playerStats.F()), Integer.valueOf(playerStats.u1()), Integer.valueOf(playerStats.M0()), Integer.valueOf(playerStats.Q1()), Float.valueOf(playerStats.H0()), Float.valueOf(playerStats.W()), Float.valueOf(playerStats.J0()), Float.valueOf(playerStats.g3()), Float.valueOf(playerStats.a2()));
    }

    public static boolean x3(PlayerStats playerStats, Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        PlayerStats playerStats2 = (PlayerStats) obj;
        return k.b(Float.valueOf(playerStats2.t3()), Float.valueOf(playerStats.t3())) && k.b(Float.valueOf(playerStats2.F()), Float.valueOf(playerStats.F())) && k.b(Integer.valueOf(playerStats2.u1()), Integer.valueOf(playerStats.u1())) && k.b(Integer.valueOf(playerStats2.M0()), Integer.valueOf(playerStats.M0())) && k.b(Integer.valueOf(playerStats2.Q1()), Integer.valueOf(playerStats.Q1())) && k.b(Float.valueOf(playerStats2.H0()), Float.valueOf(playerStats.H0())) && k.b(Float.valueOf(playerStats2.W()), Float.valueOf(playerStats.W())) && k.b(Float.valueOf(playerStats2.J0()), Float.valueOf(playerStats.J0())) && k.b(Float.valueOf(playerStats2.g3()), Float.valueOf(playerStats.g3())) && k.b(Float.valueOf(playerStats2.a2()), Float.valueOf(playerStats.a2()));
    }

    public static String y3(PlayerStats playerStats) {
        return k.d(playerStats).a("AverageSessionLength", Float.valueOf(playerStats.t3())).a("ChurnProbability", Float.valueOf(playerStats.F())).a("DaysSinceLastPlayed", Integer.valueOf(playerStats.u1())).a("NumberOfPurchases", Integer.valueOf(playerStats.M0())).a("NumberOfSessions", Integer.valueOf(playerStats.Q1())).a("SessionPercentile", Float.valueOf(playerStats.H0())).a("SpendPercentile", Float.valueOf(playerStats.W())).a("SpendProbability", Float.valueOf(playerStats.J0())).a("HighSpenderProbability", Float.valueOf(playerStats.g3())).a("TotalSpendNext28Days", Float.valueOf(playerStats.a2())).toString();
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float F() {
        return this.f6300g;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float H0() {
        return this.f6304k;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float J0() {
        return this.f6307n;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int M0() {
        return this.f6302i;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int Q1() {
        return this.f6303j;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float W() {
        return this.f6305l;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float a2() {
        return this.f6309p;
    }

    public final boolean equals(Object obj) {
        return x3(this, obj);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float g3() {
        return this.f6308o;
    }

    public final int hashCode() {
        return w3(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float t3() {
        return this.f6299f;
    }

    @NonNull
    public final String toString() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int u1() {
        return this.f6301h;
    }

    @NonNull
    public final Bundle v3() {
        return this.f6306m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        a.a(this, parcel, i10);
    }
}
