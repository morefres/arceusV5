package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import r9.f;

/* loaded from: classes.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new f();

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f5869f;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f5869f = pendingIntent;
    }

    public PendingIntent v3() {
        return this.f5869f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.t(parcel, 1, v3(), i10, false);
        b.b(parcel, a10);
    }
}
