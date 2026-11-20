package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lb.x;
import o9.b;

/* loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new x();

    /* renamed from: f, reason: collision with root package name */
    public final List<LocationRequest> f7431f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7432g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7433h;

    /* renamed from: i, reason: collision with root package name */
    public zzbj f7434i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<LocationRequest> f7435a = new ArrayList<>();
        public boolean b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7436c = false;

        @NonNull
        public a a(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f7435a.add(locationRequest);
            }
            return this;
        }

        @NonNull
        public LocationSettingsRequest b() {
            return new LocationSettingsRequest(this.f7435a, this.b, this.f7436c, null);
        }

        @NonNull
        public a c(boolean z10) {
            this.b = z10;
            return this;
        }
    }

    public LocationSettingsRequest(List<LocationRequest> list, boolean z10, boolean z11, zzbj zzbjVar) {
        this.f7431f = list;
        this.f7432g = z10;
        this.f7433h = z11;
        this.f7434i = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.z(parcel, 1, Collections.unmodifiableList(this.f7431f), false);
        b.c(parcel, 2, this.f7432g);
        b.c(parcel, 3, this.f7433h);
        b.t(parcel, 5, this.f7434i, i10, false);
        b.b(parcel, a10);
    }
}
