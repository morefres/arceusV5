package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import nb.e0;

/* loaded from: classes.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new e0();

    /* renamed from: f, reason: collision with root package name */
    public final String f7471f;

    /* renamed from: g, reason: collision with root package name */
    public final zzbe f7472g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7473h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7474i;

    public zzbg(zzbg zzbgVar, long j10) {
        m.l(zzbgVar);
        this.f7471f = zzbgVar.f7471f;
        this.f7472g = zzbgVar.f7472g;
        this.f7473h = zzbgVar.f7473h;
        this.f7474i = j10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7472g);
        String str = this.f7473h;
        int length = String.valueOf(str).length();
        String str2 = this.f7471f;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.a(this, parcel, i10);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j10) {
        this.f7471f = str;
        this.f7472g = zzbeVar;
        this.f7473h = str2;
        this.f7474i = j10;
    }
}
