package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j9.f0;
import j9.x;
import j9.y;
import n9.l1;
import o9.b;
import y9.a;

/* loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new f0();

    /* renamed from: f, reason: collision with root package name */
    public final String f5896f;

    /* renamed from: g, reason: collision with root package name */
    public final x f5897g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5898h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5899i;

    public zzt(String str, x xVar, boolean z10, boolean z11) {
        this.f5896f = str;
        this.f5897g = xVar;
        this.f5898h = z10;
        this.f5899i = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f5896f;
        int a10 = b.a(parcel);
        b.v(parcel, 1, str, false);
        x xVar = this.f5897g;
        if (xVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            xVar = null;
        }
        b.m(parcel, 2, xVar, false);
        b.c(parcel, 3, this.f5898h);
        b.c(parcel, 4, this.f5899i);
        b.b(parcel, a10);
    }

    public zzt(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f5896f = str;
        y yVar = null;
        if (iBinder != null) {
            try {
                a zzd = l1.s2(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) y9.b.t2(zzd);
                if (bArr != null) {
                    yVar = new y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f5897g = yVar;
        this.f5898h = z10;
        this.f5899i = z11;
    }
}
