package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.f0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import n9.k;
import n9.m;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new f0();

    /* renamed from: f, reason: collision with root package name */
    public final long f6096f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f6097g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f6098h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final m3 f6099i;

    public zzq(long j10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3) {
        byte[] bArr4 = (byte[]) m.l(bArr);
        m3 m3Var = m3.b;
        m3 m10 = m3.m(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) m.l(bArr2);
        m3 m11 = m3.m(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) m.l(bArr3);
        m3 m12 = m3.m(bArr6, 0, bArr6.length);
        this.f6096f = j10;
        this.f6097g = (m3) m.l(m10);
        this.f6098h = (m3) m.l(m11);
        this.f6099i = (m3) m.l(m12);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f6096f == zzqVar.f6096f && k.b(this.f6097g, zzqVar.f6097g) && k.b(this.f6098h, zzqVar.f6098h) && k.b(this.f6099i, zzqVar.f6099i);
    }

    public final int hashCode() {
        return k.c(Long.valueOf(this.f6096f), this.f6097g, this.f6098h, this.f6099i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f6096f;
        int a10 = o9.b.a(parcel);
        o9.b.r(parcel, 1, j10);
        o9.b.g(parcel, 2, this.f6097g.p(), false);
        o9.b.g(parcel, 3, this.f6098h.p(), false);
        o9.b.g(parcel, 4, this.f6099i.p(), false);
        o9.b.b(parcel, a10);
    }
}
