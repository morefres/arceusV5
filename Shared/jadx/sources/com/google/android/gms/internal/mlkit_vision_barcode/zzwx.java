package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import b8.t;
import mf.x;
import y7.c;
import y7.d;
import y7.g;
import y7.h;
import y7.i;
import yf.b;

/* loaded from: classes.dex */
public final class zzwx implements zzwf {
    private b zza;
    private final b zzb;
    private final zzwh zzc;

    public zzwx(Context context, zzwh zzwhVar) {
        this.zzc = zzwhVar;
        z7.a aVar = z7.a.f37947g;
        t.f(context);
        final i g10 = t.c().g(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // yf.b
                public final Object get() {
                    return i.this.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // y7.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // yf.b
            public final Object get() {
                return i.this.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // y7.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static d zzb(zzwh zzwhVar, zzwe zzweVar) {
        int zza = zzwhVar.zza();
        return zzweVar.zza() != 0 ? d.e(zzweVar.zze(zza, false)) : d.g(zzweVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zzweVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((h) bVar.get()).a(zzb(this.zzc, zzweVar));
        }
    }
}
