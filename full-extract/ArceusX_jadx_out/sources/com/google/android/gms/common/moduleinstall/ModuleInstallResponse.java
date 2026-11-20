package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import r9.h;

/* loaded from: classes.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new h();

    /* renamed from: f, reason: collision with root package name */
    public final int f5870f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5871g;

    public ModuleInstallResponse(int i10) {
        this(i10, false);
    }

    public int v3() {
        return this.f5870f;
    }

    public final boolean w3() {
        return this.f5871g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, v3());
        b.c(parcel, 2, this.f5871g);
        b.b(parcel, a10);
    }

    public ModuleInstallResponse(int i10, boolean z10) {
        this.f5870f = i10;
        this.f5871g = z10;
    }
}
