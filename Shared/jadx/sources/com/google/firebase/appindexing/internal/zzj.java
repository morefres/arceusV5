package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lf.e;
import n9.k;
import o9.b;
import va.u;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new e();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8739f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8740g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8741h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f8742i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f8743j;

    public zzj(boolean z10, int i10, String str, Bundle bundle, Bundle bundle2) {
        this.f8739f = z10;
        this.f8740g = i10;
        this.f8741h = str;
        this.f8742i = bundle == null ? new Bundle() : bundle;
        this.f8743j = bundle2;
        ClassLoader classLoader = zzj.class.getClassLoader();
        u.a(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        boolean z32;
        boolean z33;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (k.b(Boolean.valueOf(this.f8739f), Boolean.valueOf(zzjVar.f8739f)) && k.b(Integer.valueOf(this.f8740g), Integer.valueOf(zzjVar.f8740g)) && k.b(this.f8741h, zzjVar.f8741h)) {
            z32 = Thing.z3(this.f8742i, zzjVar.f8742i);
            if (z32) {
                z33 = Thing.z3(this.f8743j, zzjVar.f8743j);
                if (z33) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int x32;
        int x33;
        Boolean valueOf = Boolean.valueOf(this.f8739f);
        Integer valueOf2 = Integer.valueOf(this.f8740g);
        String str = this.f8741h;
        x32 = Thing.x3(this.f8742i);
        Integer valueOf3 = Integer.valueOf(x32);
        x33 = Thing.x3(this.f8743j);
        return k.c(valueOf, valueOf2, str, valueOf3, Integer.valueOf(x33));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("worksOffline: ");
        sb2.append(this.f8739f);
        sb2.append(", score: ");
        sb2.append(this.f8740g);
        if (!this.f8741h.isEmpty()) {
            sb2.append(", accountEmail: ");
            sb2.append(this.f8741h);
        }
        Bundle bundle = this.f8742i;
        if (bundle != null && !bundle.isEmpty()) {
            sb2.append(", Properties { ");
            Thing.y3(this.f8742i, sb2);
            sb2.append("}");
        }
        if (!this.f8743j.isEmpty()) {
            sb2.append(", embeddingProperties { ");
            Thing.y3(this.f8743j, sb2);
            sb2.append("}");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.c(parcel, 1, this.f8739f);
        b.n(parcel, 2, this.f8740g);
        b.v(parcel, 3, this.f8741h, false);
        b.f(parcel, 4, this.f8742i, false);
        b.f(parcel, 5, this.f8743j, false);
        b.b(parcel, a10);
    }
}
