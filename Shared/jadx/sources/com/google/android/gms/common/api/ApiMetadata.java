package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.t;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = t.a();

    /* renamed from: i, reason: collision with root package name */
    public static final ApiMetadata f5747i = w3().a();

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public static final ApiMetadata f5748j;

    /* renamed from: f, reason: collision with root package name */
    public final ComplianceOptions f5749f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5750g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5751h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public ComplianceOptions f5752a;
        public boolean b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5753c;

        @NonNull
        public ApiMetadata a() {
            ApiMetadata apiMetadata = new ApiMetadata(this.f5752a, this.b);
            apiMetadata.x3(this.f5753c);
            return apiMetadata;
        }

        @NonNull
        public a b(ComplianceOptions complianceOptions) {
            this.f5752a = complianceOptions;
            return this;
        }

        public final /* synthetic */ a c(boolean z10) {
            this.f5753c = z10;
            return this;
        }
    }

    static {
        a w32 = w3();
        w32.c(true);
        f5748j = w32.a();
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z10) {
        this.f5749f = complianceOptions;
        this.f5750g = z10;
    }

    @NonNull
    public static final ApiMetadata a(@NonNull ComplianceOptions complianceOptions) {
        a w32 = w3();
        w32.b(complianceOptions);
        return w32.a();
    }

    @NonNull
    public static final ApiMetadata v3() {
        return f5747i;
    }

    @NonNull
    public static a w3() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return k.b(this.f5749f, apiMetadata.f5749f) && this.f5751h == apiMetadata.f5751h && this.f5750g == apiMetadata.f5750g;
    }

    public final int hashCode() {
        return k.c(this.f5749f, Boolean.valueOf(this.f5751h), Boolean.valueOf(this.f5750g));
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.f5749f);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 31);
        sb2.append("ApiMetadata(complianceOptions=");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (this.f5751h) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int a10 = b.a(parcel);
        b.t(parcel, 1, this.f5749f, i10, false);
        b.c(parcel, 2, this.f5750g);
        b.b(parcel, a10);
    }

    public final /* synthetic */ void x3(boolean z10) {
        this.f5751h = z10;
    }
}
