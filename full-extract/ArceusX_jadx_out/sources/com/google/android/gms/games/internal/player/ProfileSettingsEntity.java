package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.zzg;
import da.v;
import ja.d;
import n9.k;
import o9.b;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public class ProfileSettingsEntity extends zzg implements v {

    @NonNull
    public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new d();

    /* renamed from: f, reason: collision with root package name */
    public final Status f6203f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6204g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6205h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6206i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6207j;

    /* renamed from: k, reason: collision with root package name */
    public final StockProfileImageEntity f6208k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6209l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6210m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6211n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6212o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6213p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6214q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6215r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f6216s;

    /* renamed from: t, reason: collision with root package name */
    public final zzh f6217t;

    /* renamed from: u, reason: collision with root package name */
    public final Boolean f6218u;

    public ProfileSettingsEntity(Status status, String str, boolean z10, boolean z11, boolean z12, StockProfileImageEntity stockProfileImageEntity, boolean z13, boolean z14, int i10, boolean z15, boolean z16, int i11, int i12, boolean z17, zzh zzhVar, Boolean bool) {
        this.f6203f = status;
        this.f6204g = str;
        this.f6205h = z10;
        this.f6206i = z11;
        this.f6207j = z12;
        this.f6208k = stockProfileImageEntity;
        this.f6209l = z13;
        this.f6210m = z14;
        this.f6211n = i10;
        this.f6212o = z15;
        this.f6213p = z16;
        this.f6214q = i11;
        this.f6215r = i12;
        this.f6216s = z17;
        this.f6217t = zzhVar;
        this.f6218u = bool;
    }

    @Override // da.v
    public final boolean c() {
        return this.f6210m;
    }

    @Override // da.v
    public final boolean d() {
        return this.f6213p;
    }

    @Override // da.v
    public final int e() {
        return this.f6211n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        return k.b(this.f6204g, vVar.zzc()) && k.b(Boolean.valueOf(this.f6205h), Boolean.valueOf(vVar.zze())) && k.b(Boolean.valueOf(this.f6206i), Boolean.valueOf(vVar.zza())) && k.b(Boolean.valueOf(this.f6207j), Boolean.valueOf(vVar.zzb())) && k.b(this.f6203f, vVar.m()) && k.b(this.f6208k, vVar.zzd()) && k.b(Boolean.valueOf(this.f6209l), Boolean.valueOf(vVar.zzf())) && k.b(Boolean.valueOf(this.f6210m), Boolean.valueOf(vVar.c())) && this.f6211n == vVar.e() && this.f6212o == vVar.zzh() && this.f6213p == vVar.d() && this.f6214q == vVar.g() && this.f6215r == vVar.f() && this.f6216s == vVar.u() && k.b(this.f6218u, vVar.zzo()) && k.b(this.f6217t, vVar.zzn());
    }

    @Override // da.v
    public final int f() {
        return this.f6215r;
    }

    @Override // da.v
    public final int g() {
        return this.f6214q;
    }

    public final int hashCode() {
        return k.c(this.f6204g, Boolean.valueOf(this.f6205h), Boolean.valueOf(this.f6206i), Boolean.valueOf(this.f6207j), this.f6203f, this.f6208k, Boolean.valueOf(this.f6209l), Boolean.valueOf(this.f6210m), Integer.valueOf(this.f6211n), Boolean.valueOf(this.f6212o), Boolean.valueOf(this.f6213p), Integer.valueOf(this.f6214q), Integer.valueOf(this.f6215r), Boolean.valueOf(this.f6216s), this.f6217t, this.f6218u);
    }

    @Override // k9.n
    @NonNull
    public final Status m() {
        return this.f6203f;
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("GamerTag", this.f6204g).a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f6205h)).a("IsProfileVisible", Boolean.valueOf(this.f6206i)).a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f6207j)).a("Status", this.f6203f).a("StockProfileImage", this.f6208k).a("IsProfileDiscoverable", Boolean.valueOf(this.f6209l)).a("AutoSignIn", Boolean.valueOf(this.f6210m)).a("httpErrorCode", Integer.valueOf(this.f6211n)).a("IsSettingsChangesProhibited", Boolean.valueOf(this.f6212o)).a("AllowFriendInvites", Boolean.valueOf(this.f6213p)).a("ProfileVisibility", Integer.valueOf(this.f6214q)).a("global_friends_list_visibility", Integer.valueOf(this.f6215r)).a("always_auto_sign_in", Boolean.valueOf(this.f6216s)).a("profileless_recall_summary", this.f6217t).a("games_streaks_enabled", this.f6218u).toString();
    }

    @Override // da.v
    public final boolean u() {
        return this.f6216s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.t(parcel, 1, this.f6203f, i10, false);
        b.v(parcel, 2, this.f6204g, false);
        b.c(parcel, 3, this.f6205h);
        b.c(parcel, 4, this.f6206i);
        b.c(parcel, 5, this.f6207j);
        b.t(parcel, 6, this.f6208k, i10, false);
        b.c(parcel, 7, this.f6209l);
        b.c(parcel, 8, this.f6210m);
        b.n(parcel, 9, this.f6211n);
        b.c(parcel, 10, this.f6212o);
        b.c(parcel, 11, this.f6213p);
        b.n(parcel, 12, this.f6214q);
        b.n(parcel, 13, this.f6215r);
        b.c(parcel, 14, this.f6216s);
        b.t(parcel, 15, this.f6217t, i10, false);
        b.e(parcel, 16, this.f6218u, false);
        b.b(parcel, a10);
    }

    @Override // da.v
    public final boolean zza() {
        return this.f6206i;
    }

    @Override // da.v
    public final boolean zzb() {
        return this.f6207j;
    }

    @Override // da.v
    @NonNull
    public final String zzc() {
        return this.f6204g;
    }

    @Override // da.v
    @NonNull
    public final StockProfileImage zzd() {
        return this.f6208k;
    }

    @Override // da.v
    public final boolean zze() {
        return this.f6205h;
    }

    @Override // da.v
    public final boolean zzf() {
        return this.f6209l;
    }

    @Override // da.v
    public final boolean zzh() {
        return this.f6212o;
    }

    @Override // da.v
    public final zzh zzn() {
        return this.f6217t;
    }

    @Override // da.v
    public final Boolean zzo() {
        return this.f6218u;
    }
}
