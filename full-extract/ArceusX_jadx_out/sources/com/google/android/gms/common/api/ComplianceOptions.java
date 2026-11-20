package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.v;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public static final ComplianceOptions f5754j;

    /* renamed from: f, reason: collision with root package name */
    public final int f5755f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5756g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5757h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5758i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5759a = -1;
        public int b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f5760c = 0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5761d = true;

        @NonNull
        public ComplianceOptions a() {
            return new ComplianceOptions(this.f5759a, this.b, this.f5760c, this.f5761d);
        }

        @NonNull
        public a b(int i10) {
            this.f5759a = i10;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.b = i10;
            return this;
        }

        @NonNull
        public a d(boolean z10) {
            this.f5761d = z10;
            return this;
        }

        @NonNull
        public a e(int i10) {
            this.f5760c = i10;
            return this;
        }
    }

    static {
        a v32 = v3();
        v32.b(-1);
        v32.c(-1);
        v32.e(0);
        v32.d(true);
        f5754j = v32.a();
        CREATOR = new v();
    }

    public ComplianceOptions(int i10, int i11, int i12, boolean z10) {
        this.f5755f = i10;
        this.f5756g = i11;
        this.f5757h = i12;
        this.f5758i = z10;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    @NonNull
    public static final a w3(@NonNull Context context) {
        return v3();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f5755f == complianceOptions.f5755f && this.f5756g == complianceOptions.f5756g && this.f5757h == complianceOptions.f5757h && this.f5758i == complianceOptions.f5758i;
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f5755f), Integer.valueOf(this.f5756g), Integer.valueOf(this.f5757h), Boolean.valueOf(this.f5758i));
    }

    @NonNull
    public final String toString() {
        int i10 = this.f5755f;
        int length = String.valueOf(i10).length();
        int i11 = this.f5756g;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f5757h;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f5758i;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i10);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i11);
        sb2.append(", processingReason=");
        sb2.append(i12);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5755f;
        int a10 = b.a(parcel);
        b.n(parcel, 1, i11);
        b.n(parcel, 2, this.f5756g);
        b.n(parcel, 3, this.f5757h);
        b.c(parcel, 4, this.f5758i);
        b.b(parcel, a10);
    }
}
