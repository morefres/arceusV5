package com.google.android.gms.internal.appindex;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import v8.a;
import va.f0;
import va.u;

/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable implements a {
    public static final Parcelable.Creator<zzk> CREATOR = new f0();

    /* renamed from: f, reason: collision with root package name */
    public final String f6377f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6378g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6379h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6380i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6381j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f6382k;

    public zzk(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.f6377f = str;
        this.f6378g = str2;
        this.f6379h = str3;
        this.f6380i = str4;
        this.f6381j = str5;
        if (bundle != null) {
            this.f6382k = bundle;
        } else {
            this.f6382k = Bundle.EMPTY;
        }
        ClassLoader classLoader = zzk.class.getClassLoader();
        u.a(classLoader);
        this.f6382k.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActionImpl { { actionType: '");
        sb2.append(this.f6377f);
        sb2.append("' } { objectName: '");
        sb2.append(this.f6378g);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f6379h);
        sb2.append("' } ");
        if (this.f6380i != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(this.f6380i);
            sb2.append("' } ");
        }
        if (this.f6381j != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(this.f6381j);
            sb2.append("' } ");
        }
        if (!this.f6382k.isEmpty()) {
            sb2.append("{ ");
            sb2.append(this.f6382k);
            sb2.append(" } ");
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.v(parcel, 1, this.f6377f, false);
        b.v(parcel, 2, this.f6378g, false);
        b.v(parcel, 3, this.f6379h, false);
        b.v(parcel, 4, this.f6380i, false);
        b.v(parcel, 6, this.f6381j, false);
        b.f(parcel, 7, this.f6382k, false);
        b.b(parcel, a10);
    }
}
