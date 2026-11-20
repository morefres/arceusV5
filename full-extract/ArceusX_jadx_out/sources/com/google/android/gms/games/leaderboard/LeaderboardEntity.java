package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import ma.a;
import ma.c;
import n9.k;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class LeaderboardEntity implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6250a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f6251c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6252d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6253e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6254f;

    public static int a(a aVar) {
        return k.c(aVar.U2(), aVar.l(), aVar.h(), Integer.valueOf(aVar.v0()), aVar.Z1());
    }

    public static boolean b(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return k.b(aVar2.U2(), aVar.U2()) && k.b(aVar2.l(), aVar.l()) && k.b(aVar2.h(), aVar.h()) && k.b(Integer.valueOf(aVar2.v0()), Integer.valueOf(aVar.v0())) && k.b(aVar2.Z1(), aVar.Z1());
    }

    public static String f(a aVar) {
        return k.d(aVar).a("LeaderboardId", aVar.U2()).a("DisplayName", aVar.l()).a("IconImageUri", aVar.h()).a("IconImageUrl", aVar.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(aVar.v0())).a("Variants", aVar.Z1()).toString();
    }

    @Override // ma.a
    @NonNull
    public final String U2() {
        return this.f6250a;
    }

    @Override // ma.a
    @NonNull
    public final ArrayList<c> Z1() {
        return new ArrayList<>(this.f6253e);
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    @Override // ma.a
    @NonNull
    public String getIconImageUrl() {
        return this.f6254f;
    }

    @Override // ma.a
    @NonNull
    public final Uri h() {
        return this.f6251c;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.a
    @NonNull
    public final String l() {
        return this.b;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.a
    public final int v0() {
        return this.f6252d;
    }
}
