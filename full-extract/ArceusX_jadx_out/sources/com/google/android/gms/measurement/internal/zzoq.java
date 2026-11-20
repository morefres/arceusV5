package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import nb.wd;
import o9.b;

/* loaded from: classes.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new wd();

    /* renamed from: f, reason: collision with root package name */
    public final List f7486f;

    public zzoq(List list) {
        this.f7486f = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7486f;
        int a10 = b.a(parcel);
        b.z(parcel, 1, list, false);
        b.b(parcel, a10);
    }
}
