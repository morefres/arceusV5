package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.w;
import n9.m;
import o9.b;

/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new w();

    /* renamed from: f, reason: collision with root package name */
    public final int f5763f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5764g;

    public Scope(int i10, String str) {
        m.g(str, "scopeUri must not be null or empty");
        this.f5763f = i10;
        this.f5764g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f5764g.equals(((Scope) obj).f5764g);
        }
        return false;
    }

    public int hashCode() {
        return this.f5764g.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f5764g;
    }

    @NonNull
    public String v3() {
        return this.f5764g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5763f;
        int a10 = b.a(parcel);
        b.n(parcel, 1, i11);
        b.v(parcel, 2, v3(), false);
        b.b(parcel, a10);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
