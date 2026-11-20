package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.internal.zzg;
import n9.m;
import o9.b;
import pa.c;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class SnapshotMetadataChangeEntity extends zzg {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    public final String f6280f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f6281g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f6282h;

    /* renamed from: i, reason: collision with root package name */
    public BitmapTeleporter f6283i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f6284j;

    public SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6280f;
        int a10 = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.s(parcel, 2, this.f6281g, false);
        b.t(parcel, 4, this.f6282h, i10, false);
        b.t(parcel, 5, this.f6283i, i10, false);
        b.s(parcel, 6, this.f6284j, false);
        b.b(parcel, a10);
    }

    public SnapshotMetadataChangeEntity(String str, Long l10, BitmapTeleporter bitmapTeleporter, Uri uri, Long l11) {
        this.f6280f = str;
        this.f6281g = l10;
        this.f6283i = bitmapTeleporter;
        this.f6282h = uri;
        this.f6284j = l11;
        boolean z10 = true;
        if (bitmapTeleporter != null && uri != null) {
            z10 = false;
        }
        m.q(z10, "Cannot set both a URI and an image");
    }
}
