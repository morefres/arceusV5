package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5820g = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f5821f = false;

    public static boolean a(@NonNull String str) {
        synchronized (f5820g) {
        }
        return true;
    }

    public static Integer v3() {
        synchronized (f5820g) {
        }
        return null;
    }

    public boolean w3() {
        return this.f5821f;
    }
}
