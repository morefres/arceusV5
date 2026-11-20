package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import fb.i2;
import ma.c;
import n9.k;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class LeaderboardVariantEntity implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f6266a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6267c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6268d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6269e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6270f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6271g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6272h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6273i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6274j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6275k;

    public static int a(c cVar) {
        return k.c(Integer.valueOf(cVar.V2()), Integer.valueOf(cVar.z1()), Boolean.valueOf(cVar.P()), Long.valueOf(cVar.k1()), cVar.I(), Long.valueOf(cVar.N2()), cVar.m1(), Long.valueOf(cVar.z2()), cVar.zza(), cVar.zzc(), cVar.zzb());
    }

    public static boolean b(c cVar, Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (cVar == obj) {
            return true;
        }
        c cVar2 = (c) obj;
        return k.b(Integer.valueOf(cVar2.V2()), Integer.valueOf(cVar.V2())) && k.b(Integer.valueOf(cVar2.z1()), Integer.valueOf(cVar.z1())) && k.b(Boolean.valueOf(cVar2.P()), Boolean.valueOf(cVar.P())) && k.b(Long.valueOf(cVar2.k1()), Long.valueOf(cVar.k1())) && k.b(cVar2.I(), cVar.I()) && k.b(Long.valueOf(cVar2.N2()), Long.valueOf(cVar.N2())) && k.b(cVar2.m1(), cVar.m1()) && k.b(Long.valueOf(cVar2.z2()), Long.valueOf(cVar.z2())) && k.b(cVar2.zza(), cVar.zza()) && k.b(cVar2.zzc(), cVar.zzc()) && k.b(cVar2.zzb(), cVar.zzb());
    }

    public static String f(c cVar) {
        String str;
        k.a a10 = k.d(cVar).a("TimeSpan", i2.a(cVar.V2()));
        int z12 = cVar.z1();
        if (z12 == -1) {
            str = "UNKNOWN";
        } else if (z12 == 0) {
            str = "PUBLIC";
        } else if (z12 != 1) {
            str = "SOCIAL_1P";
            if (z12 != 2) {
                if (z12 == 3) {
                    str = "FRIENDS";
                } else if (z12 != 4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(z12).length() + 32);
                    sb2.append("Unknown leaderboard collection: ");
                    sb2.append(z12);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        } else {
            str = "SOCIAL";
        }
        k.a a11 = a10.a("Collection", str);
        boolean P = cVar.P();
        String str2 = PayloadNotificationChannel.SOUND_NONE;
        k.a a12 = a11.a("RawPlayerScore", P ? Long.valueOf(cVar.k1()) : PayloadNotificationChannel.SOUND_NONE).a("DisplayPlayerScore", cVar.P() ? cVar.I() : PayloadNotificationChannel.SOUND_NONE).a("PlayerRank", cVar.P() ? Long.valueOf(cVar.N2()) : PayloadNotificationChannel.SOUND_NONE);
        if (cVar.P()) {
            str2 = cVar.m1();
        }
        return a12.a("DisplayPlayerRank", str2).a("NumScores", Long.valueOf(cVar.z2())).a("TopPageNextToken", cVar.zza()).a("WindowPageNextToken", cVar.zzc()).a("WindowPagePrevToken", cVar.zzb()).toString();
    }

    @Override // ma.c
    @NonNull
    public final String I() {
        return this.f6269e;
    }

    @Override // ma.c
    public final long N2() {
        return this.f6270f;
    }

    @Override // ma.c
    public final boolean P() {
        return this.f6267c;
    }

    @Override // ma.c
    public final int V2() {
        return this.f6266a;
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.c
    public final long k1() {
        return this.f6268d;
    }

    @Override // ma.c
    @NonNull
    public final String m1() {
        return this.f6271g;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.c
    public final int z1() {
        return this.b;
    }

    @Override // ma.c
    public final long z2() {
        return this.f6272h;
    }

    @Override // ma.c
    @NonNull
    public final String zza() {
        return this.f6273i;
    }

    @Override // ma.c
    @NonNull
    public final String zzb() {
        return this.f6274j;
    }

    @Override // ma.c
    @NonNull
    public final String zzc() {
        return this.f6275k;
    }
}
