package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import o9.b;
import r9.i;

/* loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new i();

    /* renamed from: f, reason: collision with root package name */
    public final int f5872f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5873g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f5874h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f5875i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5876j;

    /* renamed from: k, reason: collision with root package name */
    public final a f5877k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f5878a;
        public final long b;

        public a(long j10, long j11) {
            m.o(j11);
            this.f5878a = j10;
            this.b = j11;
        }
    }

    public ModuleInstallStatusUpdate(int i10, int i11, Long l10, Long l11, int i12) {
        this.f5872f = i10;
        this.f5873g = i11;
        this.f5874h = l10;
        this.f5875i = l11;
        this.f5876j = i12;
        this.f5877k = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int v3() {
        return this.f5876j;
    }

    public int w3() {
        return this.f5873g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, x3());
        b.n(parcel, 2, w3());
        b.s(parcel, 3, this.f5874h, false);
        b.s(parcel, 4, this.f5875i, false);
        b.n(parcel, 5, v3());
        b.b(parcel, a10);
    }

    public int x3() {
        return this.f5872f;
    }
}
