package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.d1;

/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new d1();

    /* renamed from: t, reason: collision with root package name */
    public static final Scope[] f5822t = new Scope[0];

    /* renamed from: u, reason: collision with root package name */
    public static final Feature[] f5823u = new Feature[0];

    /* renamed from: f, reason: collision with root package name */
    public final int f5824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5825g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5826h;

    /* renamed from: i, reason: collision with root package name */
    public String f5827i;

    /* renamed from: j, reason: collision with root package name */
    public IBinder f5828j;

    /* renamed from: k, reason: collision with root package name */
    public Scope[] f5829k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f5830l;

    /* renamed from: m, reason: collision with root package name */
    public Account f5831m;

    /* renamed from: n, reason: collision with root package name */
    public Feature[] f5832n;

    /* renamed from: o, reason: collision with root package name */
    public Feature[] f5833o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5834p;

    /* renamed from: q, reason: collision with root package name */
    public final int f5835q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5836r;

    /* renamed from: s, reason: collision with root package name */
    public final String f5837s;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f5822t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f5823u : featureArr;
        featureArr2 = featureArr2 == null ? f5823u : featureArr2;
        this.f5824f = i10;
        this.f5825g = i11;
        this.f5826h = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f5827i = "com.google.android.gms";
        } else {
            this.f5827i = str;
        }
        if (i10 < 2) {
            this.f5831m = iBinder != null ? a.t2(b.a.s2(iBinder)) : null;
        } else {
            this.f5828j = iBinder;
            this.f5831m = account;
        }
        this.f5829k = scopeArr;
        this.f5830l = bundle;
        this.f5832n = featureArr;
        this.f5833o = featureArr2;
        this.f5834p = z10;
        this.f5835q = i13;
        this.f5836r = z11;
        this.f5837s = str2;
    }

    public String v3() {
        return this.f5837s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        d1.a(this, parcel, i10);
    }
}
