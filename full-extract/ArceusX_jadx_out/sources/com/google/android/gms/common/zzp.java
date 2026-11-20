package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j9.d0;
import y9.a;
import y9.b;

/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new d0();

    /* renamed from: f, reason: collision with root package name */
    public final String f5884f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5885g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5886h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f5887i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5888j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5889k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5890l;

    public zzp(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f5884f = str;
        this.f5885g = z10;
        this.f5886h = z11;
        this.f5887i = (Context) b.t2(a.AbstractBinderC0675a.s2(iBinder));
        this.f5888j = z12;
        this.f5889k = z13;
        this.f5890l = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, y9.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f5884f;
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, str, false);
        o9.b.c(parcel, 2, this.f5885g);
        o9.b.c(parcel, 3, this.f5886h);
        o9.b.m(parcel, 4, b.u2(this.f5887i), false);
        o9.b.c(parcel, 5, this.f5888j);
        o9.b.c(parcel, 6, this.f5889k);
        o9.b.c(parcel, 8, this.f5890l);
        o9.b.b(parcel, a10);
    }
}
