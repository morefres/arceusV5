package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final int f5746a;

    public GooglePlayServicesManifestException(int i10, @NonNull String str) {
        super(str);
        this.f5746a = i10;
    }
}
