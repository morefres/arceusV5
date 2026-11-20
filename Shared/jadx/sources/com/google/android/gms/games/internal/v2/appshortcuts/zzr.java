package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ka.o;
import o9.b;

/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new o();

    /* renamed from: f, reason: collision with root package name */
    public final long f6243f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6244g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6245h;

    /* renamed from: i, reason: collision with root package name */
    public final ComponentName f6246i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6247j;

    public zzr(long j10, String str, int i10, ComponentName componentName, String str2) {
        this.f6243f = j10;
        this.f6244g = str;
        this.f6245h = i10;
        this.f6246i = componentName;
        this.f6247j = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.r(parcel, 1, this.f6243f);
        b.v(parcel, 2, this.f6244g, false);
        b.n(parcel, 3, this.f6245h);
        b.t(parcel, 4, this.f6246i, i10, false);
        b.v(parcel, 5, this.f6247j, false);
        b.b(parcel, a10);
    }

    public final int zza() {
        return this.f6245h;
    }

    public final String zzb() {
        return this.f6247j;
    }
}
