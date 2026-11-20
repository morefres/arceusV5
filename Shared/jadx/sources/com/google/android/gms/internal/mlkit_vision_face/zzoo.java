package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes.dex */
public final class zzoo {
    private static zzoo zza;

    private zzoo() {
    }

    public static synchronized zzoo zza() {
        zzoo zzooVar;
        synchronized (zzoo.class) {
            try {
                if (zza == null) {
                    zza = new zzoo();
                }
                zzooVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzooVar;
    }
}
