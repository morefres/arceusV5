package com.google.android.gms.internal.mlkit_vision_face;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class zzaz implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzbd zze;

    public /* synthetic */ zzaz(zzbd zzbdVar, zzav zzavVar) {
        int i10;
        this.zze = zzbdVar;
        i10 = zzbdVar.zzf;
        this.zzb = i10;
        this.zzc = zzbdVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i10;
        i10 = this.zze.zzf;
        if (i10 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zzc;
        this.zzd = i10;
        Object zza = zza(i10);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzab.zzd(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzbd zzbdVar = this.zze;
        zzbdVar.remove(zzbd.zzg(zzbdVar, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i10);
}
