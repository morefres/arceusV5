package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import nb.se;
import nb.te;

/* loaded from: classes.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new se();

    /* renamed from: f, reason: collision with root package name */
    public final int f7487f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7488g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7489h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f7490i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7491j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7492k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f7493l;

    public zzpl(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f7487f = i10;
        this.f7488g = str;
        this.f7489h = j10;
        this.f7490i = l10;
        this.f7493l = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f7491j = str2;
        this.f7492k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        se.a(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.f7490i;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f7493l;
        if (d10 != null) {
            return d10;
        }
        String str = this.f7491j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(te teVar) {
        this(teVar.f26699c, teVar.f26700d, teVar.f26701e, teVar.b);
    }

    public zzpl(String str, long j10, Object obj, String str2) {
        m.f(str);
        this.f7487f = 2;
        this.f7488g = str;
        this.f7489h = j10;
        this.f7492k = str2;
        if (obj == null) {
            this.f7490i = null;
            this.f7493l = null;
            this.f7491j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f7490i = (Long) obj;
            this.f7493l = null;
            this.f7491j = null;
        } else if (obj instanceof String) {
            this.f7490i = null;
            this.f7493l = null;
            this.f7491j = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f7490i = null;
                this.f7493l = (Double) obj;
                this.f7491j = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
