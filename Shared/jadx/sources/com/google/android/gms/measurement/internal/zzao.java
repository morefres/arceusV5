package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nb.n;
import o9.b;

/* loaded from: classes.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new n();

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f7469f;

    public zzao(Bundle bundle) {
        this.f7469f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f7469f;
        int a10 = b.a(parcel);
        b.f(parcel, 1, bundle, false);
        b.b(parcel, a10);
    }
}
