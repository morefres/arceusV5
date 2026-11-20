package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.e4;
import eb.m3;
import n9.k;

/* loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new ca.h();

    /* renamed from: j, reason: collision with root package name */
    public static final e4 f6081j = e4.h(1);

    /* renamed from: k, reason: collision with root package name */
    public static final e4 f6082k = e4.h(2);

    /* renamed from: l, reason: collision with root package name */
    public static final e4 f6083l = e4.h(3);

    /* renamed from: m, reason: collision with root package name */
    public static final e4 f6084m = e4.h(4);

    /* renamed from: f, reason: collision with root package name */
    public final m3 f6085f;

    /* renamed from: g, reason: collision with root package name */
    public final m3 f6086g;

    /* renamed from: h, reason: collision with root package name */
    public final m3 f6087h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6088i;

    public zzai(m3 m3Var, m3 m3Var2, m3 m3Var3, int i10) {
        this.f6085f = m3Var;
        this.f6086g = m3Var2;
        this.f6087h = m3Var3;
        this.f6088i = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return k.b(this.f6085f, zzaiVar.f6085f) && k.b(this.f6086g, zzaiVar.f6086g) && k.b(this.f6087h, zzaiVar.f6087h) && this.f6088i == zzaiVar.f6088i;
    }

    public final int hashCode() {
        return k.c(this.f6085f, this.f6086g, this.f6087h, Integer.valueOf(this.f6088i));
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + u9.c.b(v3()) + ", saltEnc=" + u9.c.b(x3()) + ", saltAuth=" + u9.c.b(w3()) + ", getPinUvAuthProtocol=" + this.f6088i + "}";
    }

    public final byte[] v3() {
        m3 m3Var = this.f6085f;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    public final byte[] w3() {
        m3 m3Var = this.f6087h;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.g(parcel, 1, v3(), false);
        o9.b.g(parcel, 2, x3(), false);
        o9.b.g(parcel, 3, w3(), false);
        o9.b.n(parcel, 4, this.f6088i);
        o9.b.b(parcel, a10);
    }

    public final byte[] x3() {
        m3 m3Var = this.f6086g;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }
}
