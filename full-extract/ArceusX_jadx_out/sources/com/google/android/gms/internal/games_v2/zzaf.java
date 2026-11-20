package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import fb.d;
import fb.e;
import o9.b;

/* loaded from: classes.dex */
public final class zzaf extends zzg {
    public static final Parcelable.Creator<zzaf> CREATOR = new e();

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f6383f;

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f6384g;

    public zzaf(Bundle bundle, IBinder iBinder) {
        this.f6383f = bundle;
        this.f6384g = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f6383f;
        int a10 = b.a(parcel);
        b.f(parcel, 1, bundle, false);
        b.m(parcel, 2, this.f6384g, false);
        b.b(parcel, a10);
    }

    public zzaf(d dVar) {
        this.f6383f = dVar.a();
        this.f6384g = dVar.f17079a;
    }
}
