package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import nb.h;
import o9.b;

/* loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new h();

    /* renamed from: f, reason: collision with root package name */
    public String f7458f;

    /* renamed from: g, reason: collision with root package name */
    public String f7459g;

    /* renamed from: h, reason: collision with root package name */
    public zzpl f7460h;

    /* renamed from: i, reason: collision with root package name */
    public long f7461i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7462j;

    /* renamed from: k, reason: collision with root package name */
    public String f7463k;

    /* renamed from: l, reason: collision with root package name */
    public final zzbg f7464l;

    /* renamed from: m, reason: collision with root package name */
    public long f7465m;

    /* renamed from: n, reason: collision with root package name */
    public zzbg f7466n;

    /* renamed from: o, reason: collision with root package name */
    public final long f7467o;

    /* renamed from: p, reason: collision with root package name */
    public final zzbg f7468p;

    public zzah(zzah zzahVar) {
        m.l(zzahVar);
        this.f7458f = zzahVar.f7458f;
        this.f7459g = zzahVar.f7459g;
        this.f7460h = zzahVar.f7460h;
        this.f7461i = zzahVar.f7461i;
        this.f7462j = zzahVar.f7462j;
        this.f7463k = zzahVar.f7463k;
        this.f7464l = zzahVar.f7464l;
        this.f7465m = zzahVar.f7465m;
        this.f7466n = zzahVar.f7466n;
        this.f7467o = zzahVar.f7467o;
        this.f7468p = zzahVar.f7468p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.v(parcel, 2, this.f7458f, false);
        b.v(parcel, 3, this.f7459g, false);
        b.t(parcel, 4, this.f7460h, i10, false);
        b.r(parcel, 5, this.f7461i);
        b.c(parcel, 6, this.f7462j);
        b.v(parcel, 7, this.f7463k, false);
        b.t(parcel, 8, this.f7464l, i10, false);
        b.r(parcel, 9, this.f7465m);
        b.t(parcel, 10, this.f7466n, i10, false);
        b.r(parcel, 11, this.f7467o);
        b.t(parcel, 12, this.f7468p, i10, false);
        b.b(parcel, a10);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j10, boolean z10, String str3, zzbg zzbgVar, long j11, zzbg zzbgVar2, long j12, zzbg zzbgVar3) {
        this.f7458f = str;
        this.f7459g = str2;
        this.f7460h = zzplVar;
        this.f7461i = j10;
        this.f7462j = z10;
        this.f7463k = str3;
        this.f7464l = zzbgVar;
        this.f7465m = j11;
        this.f7466n = zzbgVar2;
        this.f7467o = j12;
        this.f7468p = zzbgVar3;
    }
}
