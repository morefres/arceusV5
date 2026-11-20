package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hb.c;
import hb.d;
import hb.x;
import lb.k;
import lb.l;
import o9.b;

/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new x();

    /* renamed from: f, reason: collision with root package name */
    public final int f6412f;

    /* renamed from: g, reason: collision with root package name */
    public final zzj f6413g;

    /* renamed from: h, reason: collision with root package name */
    public final l f6414h;

    /* renamed from: i, reason: collision with root package name */
    public final d f6415i;

    public zzl(int i10, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.f6412f = i10;
        this.f6413g = zzjVar;
        d dVar = null;
        this.f6414h = iBinder == null ? null : k.s2(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new c(iBinder2);
        }
        this.f6415i = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f6412f);
        b.t(parcel, 2, this.f6413g, i10, false);
        l lVar = this.f6414h;
        b.m(parcel, 3, lVar == null ? null : lVar.asBinder(), false);
        d dVar = this.f6415i;
        b.m(parcel, 4, dVar != null ? dVar.asBinder() : null, false);
        b.b(parcel, a10);
    }
}
