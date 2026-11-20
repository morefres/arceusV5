package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import n9.t;

/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new t();

    /* renamed from: f, reason: collision with root package name */
    public final int f5852f;

    /* renamed from: g, reason: collision with root package name */
    public List f5853g;

    public TelemetryData(int i10, List list) {
        this.f5852f = i10;
        this.f5853g = list;
    }

    public final int v3() {
        return this.f5852f;
    }

    public final List w3() {
        return this.f5853g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, this.f5852f);
        o9.b.z(parcel, 2, this.f5853g, false);
        o9.b.b(parcel, a10);
    }

    public final void x3(@NonNull MethodInvocation methodInvocation) {
        if (this.f5853g == null) {
            this.f5853g = new ArrayList();
        }
        this.f5853g.add(methodInvocation);
    }
}
