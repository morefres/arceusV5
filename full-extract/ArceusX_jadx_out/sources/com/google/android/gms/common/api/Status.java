package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.d;
import k9.n;
import k9.x;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements n, ReflectedParcelable {

    /* renamed from: f, reason: collision with root package name */
    public final int f5773f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5774g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f5775h;

    /* renamed from: i, reason: collision with root package name */
    public final ConnectionResult f5776i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public static final Status f5765j = new Status(-1);

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public static final Status f5766k = new Status(0);

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public static final Status f5767l = new Status(14);

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public static final Status f5768m = new Status(8);

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public static final Status f5769n = new Status(15);

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public static final Status f5770o = new Status(16);

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public static final Status f5771p = new Status(17);

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public static final Status f5772q = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new x();

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f5773f = i10;
        this.f5774g = str;
        this.f5775h = pendingIntent;
        this.f5776i = connectionResult;
    }

    public boolean A3() {
        return this.f5773f <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5773f == status.f5773f && k.b(this.f5774g, status.f5774g) && k.b(this.f5775h, status.f5775h) && k.b(this.f5776i, status.f5776i);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f5773f), this.f5774g, this.f5775h, this.f5776i);
    }

    @Override // k9.n
    @NonNull
    public Status m() {
        return this;
    }

    @NonNull
    public String toString() {
        k.a d10 = k.d(this);
        d10.a("statusCode", zza());
        d10.a("resolution", this.f5775h);
        return d10.toString();
    }

    public ConnectionResult v3() {
        return this.f5776i;
    }

    public PendingIntent w3() {
        return this.f5775h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, x3());
        b.v(parcel, 2, y3(), false);
        b.t(parcel, 3, this.f5775h, i10, false);
        b.t(parcel, 4, v3(), i10, false);
        b.b(parcel, a10);
    }

    public int x3() {
        return this.f5773f;
    }

    public String y3() {
        return this.f5774g;
    }

    public boolean z3() {
        return this.f5775h != null;
    }

    @NonNull
    public final String zza() {
        String str = this.f5774g;
        return str != null ? str : d.a(this.f5773f);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i10) {
        this(i10, str, connectionResult.y3(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
