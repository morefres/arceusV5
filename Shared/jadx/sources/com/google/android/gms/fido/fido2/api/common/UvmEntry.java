package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;

/* loaded from: classes.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new v();

    /* renamed from: f, reason: collision with root package name */
    public final int f6075f;

    /* renamed from: g, reason: collision with root package name */
    public final short f6076g;

    /* renamed from: h, reason: collision with root package name */
    public final short f6077h;

    public UvmEntry(int i10, short s8, short s10) {
        this.f6075f = i10;
        this.f6076g = s8;
        this.f6077h = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f6075f == uvmEntry.f6075f && this.f6076g == uvmEntry.f6076g && this.f6077h == uvmEntry.f6077h;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f6075f), Short.valueOf(this.f6076g), Short.valueOf(this.f6077h));
    }

    public short v3() {
        return this.f6076g;
    }

    public short w3() {
        return this.f6077h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, x3());
        o9.b.u(parcel, 2, v3());
        o9.b.u(parcel, 3, w3());
        o9.b.b(parcel, a10);
    }

    public int x3() {
        return this.f6075f;
    }
}
