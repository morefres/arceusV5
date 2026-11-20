package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import ia.c;
import m9.e;
import n9.k;
import o9.b;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class ScreenshotEntity extends zzg implements e, Parcelable {

    @NonNull
    public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    public final Uri f6194f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6195g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6196h;

    public ScreenshotEntity(@NonNull Uri uri, int i10, int i11) {
        this.f6194f = uri;
        this.f6195g = i10;
        this.f6196h = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
        return k.b(screenshotEntity.f6194f, this.f6194f) && k.b(Integer.valueOf(screenshotEntity.f6195g), Integer.valueOf(this.f6195g)) && k.b(Integer.valueOf(screenshotEntity.f6196h), Integer.valueOf(this.f6196h));
    }

    public final int hashCode() {
        return k.c(this.f6194f, Integer.valueOf(this.f6195g), Integer.valueOf(this.f6196h));
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("Uri", this.f6194f).a("Width", Integer.valueOf(this.f6195g)).a("Height", Integer.valueOf(this.f6196h)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        Uri uri = this.f6194f;
        int a10 = b.a(parcel);
        b.t(parcel, 1, uri, i10, false);
        b.n(parcel, 2, this.f6195g);
        b.n(parcel, 3, this.f6196h);
        b.b(parcel, a10);
    }
}
