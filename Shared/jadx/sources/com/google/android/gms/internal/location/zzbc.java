package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hb.c;
import hb.d;
import hb.q;
import lb.n;
import lb.o;
import lb.r;
import o9.b;

/* loaded from: classes.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new q();

    /* renamed from: f, reason: collision with root package name */
    public final int f6401f;

    /* renamed from: g, reason: collision with root package name */
    public final zzba f6402g;

    /* renamed from: h, reason: collision with root package name */
    public final r f6403h;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f6404i;

    /* renamed from: j, reason: collision with root package name */
    public final o f6405j;

    /* renamed from: k, reason: collision with root package name */
    public final d f6406k;

    public zzbc(int i10, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f6401f = i10;
        this.f6402g = zzbaVar;
        d dVar = null;
        this.f6403h = iBinder == null ? null : lb.q.s2(iBinder);
        this.f6404i = pendingIntent;
        this.f6405j = iBinder2 == null ? null : n.s2(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new c(iBinder3);
        }
        this.f6406k = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, lb.r] */
    public static zzbc a(r rVar, d dVar) {
        if (dVar == null) {
            dVar = null;
        }
        return new zzbc(2, null, rVar, null, null, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, lb.o] */
    public static zzbc v3(o oVar, d dVar) {
        if (dVar == null) {
            dVar = null;
        }
        return new zzbc(2, null, null, null, oVar, dVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f6401f);
        b.t(parcel, 2, this.f6402g, i10, false);
        r rVar = this.f6403h;
        b.m(parcel, 3, rVar == null ? null : rVar.asBinder(), false);
        b.t(parcel, 4, this.f6404i, i10, false);
        o oVar = this.f6405j;
        b.m(parcel, 5, oVar == null ? null : oVar.asBinder(), false);
        d dVar = this.f6406k;
        b.m(parcel, 6, dVar != null ? dVar.asBinder() : null, false);
        b.b(parcel, a10);
    }
}
