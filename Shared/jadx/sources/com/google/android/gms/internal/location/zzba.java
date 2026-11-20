package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import hb.p;
import java.util.Collections;
import java.util.List;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class zzba extends AbstractSafeParcelable {

    /* renamed from: f, reason: collision with root package name */
    public final LocationRequest f6390f;

    /* renamed from: g, reason: collision with root package name */
    public final List<ClientIdentity> f6391g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6392h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6393i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6394j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6395k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6396l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6397m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6398n;

    /* renamed from: o, reason: collision with root package name */
    public String f6399o;

    /* renamed from: p, reason: collision with root package name */
    public long f6400p;

    /* renamed from: q, reason: collision with root package name */
    public static final List<ClientIdentity> f6389q = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new p();

    public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.f6390f = locationRequest;
        this.f6391g = list;
        this.f6392h = str;
        this.f6393i = z10;
        this.f6394j = z11;
        this.f6395k = z12;
        this.f6396l = str2;
        this.f6397m = z13;
        this.f6398n = z14;
        this.f6399o = str3;
        this.f6400p = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (k.b(this.f6390f, zzbaVar.f6390f) && k.b(this.f6391g, zzbaVar.f6391g) && k.b(this.f6392h, zzbaVar.f6392h) && this.f6393i == zzbaVar.f6393i && this.f6394j == zzbaVar.f6394j && this.f6395k == zzbaVar.f6395k && k.b(this.f6396l, zzbaVar.f6396l) && this.f6397m == zzbaVar.f6397m && this.f6398n == zzbaVar.f6398n && k.b(this.f6399o, zzbaVar.f6399o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6390f.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6390f);
        if (this.f6392h != null) {
            sb2.append(" tag=");
            sb2.append(this.f6392h);
        }
        if (this.f6396l != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f6396l);
        }
        if (this.f6399o != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f6399o);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f6393i);
        sb2.append(" clients=");
        sb2.append(this.f6391g);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f6394j);
        if (this.f6395k) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f6397m) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f6398n) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.t(parcel, 1, this.f6390f, i10, false);
        b.z(parcel, 5, this.f6391g, false);
        b.v(parcel, 6, this.f6392h, false);
        b.c(parcel, 7, this.f6393i);
        b.c(parcel, 8, this.f6394j);
        b.c(parcel, 9, this.f6395k);
        b.v(parcel, 10, this.f6396l, false);
        b.c(parcel, 11, this.f6397m);
        b.c(parcel, 12, this.f6398n);
        b.v(parcel, 13, this.f6399o, false);
        b.r(parcel, 14, this.f6400p);
        b.b(parcel, a10);
    }
}
