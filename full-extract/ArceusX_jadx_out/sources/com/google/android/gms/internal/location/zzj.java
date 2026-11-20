package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzs;
import hb.w;
import java.util.Collections;
import java.util.List;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {

    /* renamed from: f, reason: collision with root package name */
    public final zzs f6409f;

    /* renamed from: g, reason: collision with root package name */
    public final List<ClientIdentity> f6410g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6411h;

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final List<ClientIdentity> f6407i = Collections.EMPTY_LIST;

    /* renamed from: j, reason: collision with root package name */
    public static final zzs f6408j = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new w();

    public zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.f6409f = zzsVar;
        this.f6410g = list;
        this.f6411h = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return k.b(this.f6409f, zzjVar.f6409f) && k.b(this.f6410g, zzjVar.f6410g) && k.b(this.f6411h, zzjVar.f6411h);
    }

    public final int hashCode() {
        return this.f6409f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6409f);
        String valueOf2 = String.valueOf(this.f6410g);
        String str = this.f6411h;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(valueOf);
        sb2.append(", clients=");
        sb2.append(valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.t(parcel, 1, this.f6409f, i10, false);
        b.z(parcel, 2, this.f6410g, false);
        b.v(parcel, 3, this.f6411h, false);
        b.b(parcel, a10);
    }
}
