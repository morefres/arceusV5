package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzcd extends zzbn {
    final /* synthetic */ zzce zza;

    public zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzc;
        zzab.zza(i10, i11, "index");
        zzce zzceVar = this.zza;
        int i12 = i10 + i10;
        objArr = zzceVar.zzb;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = zzceVar.zzb;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.zza.zzc;
        return i10;
    }
}
