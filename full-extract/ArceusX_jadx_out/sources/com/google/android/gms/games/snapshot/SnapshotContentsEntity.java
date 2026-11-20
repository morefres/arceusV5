package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.zzg;
import o9.b;
import pa.a;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class SnapshotContentsEntity extends zzg implements SnapshotContents {

    /* renamed from: f, reason: collision with root package name */
    public Contents f6277f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f6276g = new Object();

    @NonNull
    public static final Parcelable.Creator<SnapshotContentsEntity> CREATOR = new a();

    public SnapshotContentsEntity(@NonNull Contents contents) {
        this.f6277f = contents;
    }

    public final boolean isClosed() {
        return this.f6277f == null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.t(parcel, 1, this.f6277f, i10, false);
        b.b(parcel, a10);
    }
}
