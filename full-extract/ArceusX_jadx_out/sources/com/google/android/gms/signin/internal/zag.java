package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import k9.n;
import o9.b;
import qb.g;

/* loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements n {
    public static final Parcelable.Creator<zag> CREATOR = new g();

    /* renamed from: f, reason: collision with root package name */
    public final List f7518f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7519g;

    public zag(List list, String str) {
        this.f7518f = list;
        this.f7519g = str;
    }

    @Override // k9.n
    public final Status m() {
        return this.f7519g != null ? Status.f5766k : Status.f5770o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7518f;
        int a10 = b.a(parcel);
        b.x(parcel, 1, list, false);
        b.v(parcel, 2, this.f7519g, false);
        b.b(parcel, a10);
    }
}
