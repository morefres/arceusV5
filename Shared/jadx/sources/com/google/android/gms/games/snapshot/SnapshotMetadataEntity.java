package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzg;
import n9.k;
import o9.b;
import pa.d;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class SnapshotMetadataEntity extends zzg implements SnapshotMetadata {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new d();

    /* renamed from: f, reason: collision with root package name */
    public final GameEntity f6285f;

    /* renamed from: g, reason: collision with root package name */
    public final PlayerEntity f6286g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6287h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f6288i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6289j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6290k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6291l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6292m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6293n;

    /* renamed from: o, reason: collision with root package name */
    public final float f6294o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6295p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6296q;

    /* renamed from: r, reason: collision with root package name */
    public final long f6297r;

    /* renamed from: s, reason: collision with root package name */
    public final String f6298s;

    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j10, long j11, float f10, String str5, boolean z10, long j12, String str6) {
        this.f6285f = gameEntity;
        this.f6286g = playerEntity;
        this.f6287h = str;
        this.f6288i = uri;
        this.f6289j = str2;
        this.f6294o = f10;
        this.f6290k = str3;
        this.f6291l = str4;
        this.f6292m = j10;
        this.f6293n = j11;
        this.f6295p = str5;
        this.f6296q = z10;
        this.f6297r = j12;
        this.f6298s = str6;
    }

    public static int a(SnapshotMetadata snapshotMetadata) {
        return k.c(snapshotMetadata.u3(), snapshotMetadata.X0(), snapshotMetadata.q3(), snapshotMetadata.Q0(), Float.valueOf(snapshotMetadata.j3()), snapshotMetadata.zza(), snapshotMetadata.getDescription(), Long.valueOf(snapshotMetadata.e0()), Long.valueOf(snapshotMetadata.T1()), snapshotMetadata.B1(), Boolean.valueOf(snapshotMetadata.Q2()), Long.valueOf(snapshotMetadata.x0()), snapshotMetadata.C2());
    }

    public static boolean v3(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return k.b(snapshotMetadata2.u3(), snapshotMetadata.u3()) && k.b(snapshotMetadata2.X0(), snapshotMetadata.X0()) && k.b(snapshotMetadata2.q3(), snapshotMetadata.q3()) && k.b(snapshotMetadata2.Q0(), snapshotMetadata.Q0()) && k.b(Float.valueOf(snapshotMetadata2.j3()), Float.valueOf(snapshotMetadata.j3())) && k.b(snapshotMetadata2.zza(), snapshotMetadata.zza()) && k.b(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && k.b(Long.valueOf(snapshotMetadata2.e0()), Long.valueOf(snapshotMetadata.e0())) && k.b(Long.valueOf(snapshotMetadata2.T1()), Long.valueOf(snapshotMetadata.T1())) && k.b(snapshotMetadata2.B1(), snapshotMetadata.B1()) && k.b(Boolean.valueOf(snapshotMetadata2.Q2()), Boolean.valueOf(snapshotMetadata.Q2())) && k.b(Long.valueOf(snapshotMetadata2.x0()), Long.valueOf(snapshotMetadata.x0())) && k.b(snapshotMetadata2.C2(), snapshotMetadata.C2());
    }

    public static String w3(SnapshotMetadata snapshotMetadata) {
        return k.d(snapshotMetadata).a("Game", snapshotMetadata.u3()).a("Owner", snapshotMetadata.X0()).a("SnapshotId", snapshotMetadata.q3()).a("CoverImageUri", snapshotMetadata.Q0()).a("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.j3())).a("Description", snapshotMetadata.getDescription()).a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.e0())).a("PlayedTime", Long.valueOf(snapshotMetadata.T1())).a("UniqueName", snapshotMetadata.B1()).a("ChangePending", Boolean.valueOf(snapshotMetadata.Q2())).a("ProgressValue", Long.valueOf(snapshotMetadata.x0())).a("DeviceName", snapshotMetadata.C2()).toString();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String B1() {
        return this.f6295p;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String C2() {
        return this.f6298s;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Uri Q0() {
        return this.f6288i;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public boolean Q2() {
        return this.f6296q;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long T1() {
        return this.f6293n;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public Player X0() {
        return this.f6286g;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long e0() {
        return this.f6292m;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return this.f6289j;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String getDescription() {
        return this.f6291l;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public float j3() {
        return this.f6294o;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String q3() {
        return this.f6287h;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public Game u3() {
        return this.f6285f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.t(parcel, 1, u3(), i10, false);
        b.t(parcel, 2, X0(), i10, false);
        b.v(parcel, 3, q3(), false);
        b.t(parcel, 5, Q0(), i10, false);
        b.v(parcel, 6, getCoverImageUrl(), false);
        b.v(parcel, 7, this.f6290k, false);
        b.v(parcel, 8, getDescription(), false);
        b.r(parcel, 9, e0());
        b.r(parcel, 10, T1());
        b.k(parcel, 11, j3());
        b.v(parcel, 12, B1(), false);
        b.c(parcel, 13, Q2());
        b.r(parcel, 14, x0());
        b.v(parcel, 15, C2(), false);
        b.b(parcel, a10);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long x0() {
        return this.f6297r;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public final String zza() {
        return this.f6290k;
    }

    public SnapshotMetadataEntity(@NonNull SnapshotMetadata snapshotMetadata) {
        PlayerEntity playerEntity = new PlayerEntity(snapshotMetadata.X0());
        this.f6285f = new GameEntity(snapshotMetadata.u3());
        this.f6286g = playerEntity;
        this.f6287h = snapshotMetadata.q3();
        this.f6288i = snapshotMetadata.Q0();
        this.f6289j = snapshotMetadata.getCoverImageUrl();
        this.f6294o = snapshotMetadata.j3();
        this.f6290k = snapshotMetadata.zza();
        this.f6291l = snapshotMetadata.getDescription();
        this.f6292m = snapshotMetadata.e0();
        this.f6293n = snapshotMetadata.T1();
        this.f6295p = snapshotMetadata.B1();
        this.f6296q = snapshotMetadata.Q2();
        this.f6297r = snapshotMetadata.x0();
        this.f6298s = snapshotMetadata.C2();
    }
}
