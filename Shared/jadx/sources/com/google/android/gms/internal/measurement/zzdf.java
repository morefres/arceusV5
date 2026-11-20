package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new i2();

    /* renamed from: f, reason: collision with root package name */
    public final int f7025f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7026g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f7027h;

    public zzdf(int i10, String str, Intent intent) {
        this.f7025f = i10;
        this.f7026g = str;
        this.f7027h = intent;
    }

    public static zzdf a(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.f7025f == zzdfVar.f7025f && Objects.equals(this.f7026g, zzdfVar.f7026g) && Objects.equals(this.f7027h, zzdfVar.f7027h);
    }

    public final int hashCode() {
        return this.f7025f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7025f;
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.v(parcel, 2, this.f7026g, false);
        o9.b.t(parcel, 3, this.f7027h, i10, false);
        o9.b.b(parcel, a10);
    }
}
