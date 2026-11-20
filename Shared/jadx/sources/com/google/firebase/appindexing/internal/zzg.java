package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.appindex.zzk;
import lf.f;
import o9.b;

/* loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new f();

    /* renamed from: f, reason: collision with root package name */
    public final int f8732f;

    /* renamed from: g, reason: collision with root package name */
    public final Thing[] f8733g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f8734h;

    /* renamed from: i, reason: collision with root package name */
    public final String[] f8735i;

    /* renamed from: j, reason: collision with root package name */
    public final zzk f8736j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8737k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8738l;

    public zzg(int i10, Thing[] thingArr, String[] strArr, String[] strArr2, zzk zzkVar, String str, String str2) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7) {
            i10 = 0;
        }
        this.f8732f = i10;
        this.f8733g = thingArr;
        this.f8734h = strArr;
        this.f8735i = strArr2;
        this.f8736j = zzkVar;
        this.f8737k = str;
        this.f8738l = str2;
    }

    public static zzg v3() {
        return new zzg(4, null, null, null, null, null, null);
    }

    public static zzg w3(Thing... thingArr) {
        return new zzg(1, thingArr, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f8732f);
        b.y(parcel, 2, this.f8733g, i10, false);
        b.w(parcel, 3, this.f8734h, false);
        b.w(parcel, 5, this.f8735i, false);
        b.t(parcel, 6, this.f8736j, i10, false);
        b.v(parcel, 7, this.f8737k, false);
        b.v(parcel, 8, this.f8738l, false);
        b.b(parcel, a10);
    }
}
