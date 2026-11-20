package lf;

import android.os.IBinder;
import android.os.Parcel;
import com.google.firebase.appindexing.internal.zza;
import com.google.firebase.appindexing.internal.zzg;
import va.x;

/* loaded from: classes2.dex */
public final class b extends va.a implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    @Override // lf.d
    public final zza o0(l9.g gVar, zzg zzgVar) {
        Parcel r22 = r2();
        x.d(r22, gVar);
        x.c(r22, zzgVar);
        Parcel s22 = s2(8, r22);
        zza zzaVar = (zza) x.a(s22, zza.CREATOR);
        s22.recycle();
        return zzaVar;
    }
}
