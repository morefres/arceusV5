package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes.dex */
public final class zzon {
    private static zzom zza;

    public static synchronized zzoc zza(zznt zzntVar) {
        zzoc zzocVar;
        synchronized (zzon.class) {
            try {
                if (zza == null) {
                    zza = new zzom(null);
                }
                zzocVar = (zzoc) zza.get(zzntVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzocVar;
    }

    public static synchronized zzoc zzb(String str) {
        zzoc zza2;
        synchronized (zzon.class) {
            zza2 = zza(zznt.zzd(str).zzd());
        }
        return zza2;
    }
}
