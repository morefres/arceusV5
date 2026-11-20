package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import ka.f;
import o9.b;

/* loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new f();

    /* renamed from: f, reason: collision with root package name */
    public final List f6235f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6236g;

    /* renamed from: h, reason: collision with root package name */
    public final List f6237h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6238i;

    public zzg(List list, List list2, List list3, List list4) {
        this.f6235f = list;
        this.f6236g = list2;
        this.f6237h = list3;
        this.f6238i = list4;
    }

    public final List v3() {
        return this.f6237h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f6235f;
        int a10 = b.a(parcel);
        b.x(parcel, 1, list, false);
        b.z(parcel, 2, this.f6236g, false);
        b.x(parcel, 3, this.f6237h, false);
        b.x(parcel, 4, this.f6238i, false);
        b.b(parcel, a10);
    }

    public final List zza() {
        return this.f6235f;
    }

    public final List zzb() {
        return this.f6236g;
    }

    public final List zzd() {
        return this.f6238i;
    }
}
