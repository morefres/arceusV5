package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ka.g;
import o9.b;

/* loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new g();

    /* renamed from: f, reason: collision with root package name */
    public final String f6239f;

    /* renamed from: g, reason: collision with root package name */
    public final PersistableBundle f6240g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f6241h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f6242i;

    public zzi(String str, PersistableBundle persistableBundle, Boolean bool, Boolean bool2) {
        this.f6239f = str;
        this.f6240g = persistableBundle;
        this.f6241h = bool;
        this.f6242i = bool2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6239f;
        int a10 = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.t(parcel, 2, this.f6240g, i10, false);
        b.e(parcel, 3, this.f6241h, false);
        b.e(parcel, 4, this.f6242i, false);
        b.b(parcel, a10);
    }

    public final String zza() {
        return this.f6239f;
    }
}
