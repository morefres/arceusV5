package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.e0;

/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new e0();

    /* renamed from: f, reason: collision with root package name */
    public final int f5838f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5839g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5840h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5841i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5842j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5843k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5844l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5845m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5846n;

    @Deprecated
    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5838f;
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.n(parcel, 2, this.f5839g);
        o9.b.n(parcel, 3, this.f5840h);
        o9.b.r(parcel, 4, this.f5841i);
        o9.b.r(parcel, 5, this.f5842j);
        o9.b.v(parcel, 6, this.f5843k, false);
        o9.b.v(parcel, 7, this.f5844l, false);
        o9.b.n(parcel, 8, this.f5845m);
        o9.b.n(parcel, 9, this.f5846n);
        o9.b.b(parcel, a10);
    }

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f5838f = i10;
        this.f5839g = i11;
        this.f5840h = i12;
        this.f5841i = j10;
        this.f5842j = j11;
        this.f5843k = str;
        this.f5844l = str2;
        this.f5845m = i13;
        this.f5846n = i14;
    }
}
