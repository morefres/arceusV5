package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import n9.m;
import nb.xe;
import o9.b;

/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new xe();
    public final boolean A;
    public final long B;
    public final int C;
    public final String D;
    public final int E;
    public final long F;
    public final String G;
    public final String H;
    public final long I;
    public final int J;

    /* renamed from: f, reason: collision with root package name */
    public final String f7494f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7495g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7496h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7497i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7498j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7499k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7500l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7501m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7502n;

    /* renamed from: o, reason: collision with root package name */
    public final long f7503o;

    /* renamed from: p, reason: collision with root package name */
    public final String f7504p;

    /* renamed from: q, reason: collision with root package name */
    public final long f7505q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7506r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7507s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f7508t;

    /* renamed from: u, reason: collision with root package name */
    public final Boolean f7509u;

    /* renamed from: v, reason: collision with root package name */
    public final long f7510v;

    /* renamed from: w, reason: collision with root package name */
    public final List f7511w;

    /* renamed from: x, reason: collision with root package name */
    public final String f7512x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7513y;

    /* renamed from: z, reason: collision with root package name */
    public final String f7514z;

    public zzr(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        m.f(str);
        this.f7494f = str;
        this.f7495g = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f7496h = str3;
        this.f7503o = j10;
        this.f7497i = str4;
        this.f7498j = j11;
        this.f7499k = j12;
        this.f7500l = str5;
        this.f7501m = z10;
        this.f7502n = z11;
        this.f7504p = str6;
        this.f7505q = j13;
        this.f7506r = i10;
        this.f7507s = z12;
        this.f7508t = z13;
        this.f7509u = bool;
        this.f7510v = j14;
        this.f7511w = list;
        this.f7512x = str7;
        this.f7513y = str8;
        this.f7514z = str9;
        this.A = z14;
        this.B = j15;
        this.C = i11;
        this.D = str10;
        this.E = i12;
        this.F = j16;
        this.G = str11;
        this.H = str12;
        this.I = j17;
        this.J = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7494f;
        int a10 = b.a(parcel);
        b.v(parcel, 2, str, false);
        b.v(parcel, 3, this.f7495g, false);
        b.v(parcel, 4, this.f7496h, false);
        b.v(parcel, 5, this.f7497i, false);
        b.r(parcel, 6, this.f7498j);
        b.r(parcel, 7, this.f7499k);
        b.v(parcel, 8, this.f7500l, false);
        b.c(parcel, 9, this.f7501m);
        b.c(parcel, 10, this.f7502n);
        b.r(parcel, 11, this.f7503o);
        b.v(parcel, 12, this.f7504p, false);
        b.r(parcel, 14, this.f7505q);
        b.n(parcel, 15, this.f7506r);
        b.c(parcel, 16, this.f7507s);
        b.c(parcel, 18, this.f7508t);
        b.e(parcel, 21, this.f7509u, false);
        b.r(parcel, 22, this.f7510v);
        b.x(parcel, 23, this.f7511w, false);
        b.v(parcel, 25, this.f7512x, false);
        b.v(parcel, 26, this.f7513y, false);
        b.v(parcel, 27, this.f7514z, false);
        b.c(parcel, 28, this.A);
        b.r(parcel, 29, this.B);
        b.n(parcel, 30, this.C);
        b.v(parcel, 31, this.D, false);
        b.n(parcel, 32, this.E);
        b.r(parcel, 34, this.F);
        b.v(parcel, 35, this.G, false);
        b.v(parcel, 36, this.H, false);
        b.r(parcel, 37, this.I);
        b.n(parcel, 38, this.J);
        b.b(parcel, a10);
    }

    public zzr(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f7494f = str;
        this.f7495g = str2;
        this.f7496h = str3;
        this.f7503o = j12;
        this.f7497i = str4;
        this.f7498j = j10;
        this.f7499k = j11;
        this.f7500l = str5;
        this.f7501m = z10;
        this.f7502n = z11;
        this.f7504p = str6;
        this.f7505q = j13;
        this.f7506r = i10;
        this.f7507s = z12;
        this.f7508t = z13;
        this.f7509u = bool;
        this.f7510v = j14;
        this.f7511w = list;
        this.f7512x = str7;
        this.f7513y = str8;
        this.f7514z = str9;
        this.A = z14;
        this.B = j15;
        this.C = i11;
        this.D = str10;
        this.E = i12;
        this.F = j16;
        this.G = str11;
        this.H = str12;
        this.I = j17;
        this.J = i13;
    }
}
