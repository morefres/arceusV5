package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.s;

/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new s();

    /* renamed from: f, reason: collision with root package name */
    public final int f5812f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5813g;

    public ClientIdentity(int i10, String str) {
        this.f5812f = i10;
        this.f5813g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f5812f == this.f5812f && k.b(clientIdentity.f5813g, this.f5813g);
    }

    public final int hashCode() {
        return this.f5812f;
    }

    @NonNull
    public final String toString() {
        return this.f5812f + ":" + this.f5813g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5812f;
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.v(parcel, 2, this.f5813g, false);
        o9.b.b(parcel, a10);
    }
}
