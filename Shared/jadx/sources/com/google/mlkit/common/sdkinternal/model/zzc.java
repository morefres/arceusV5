package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsi;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import n9.g;
import sb.k;

/* loaded from: classes2.dex */
final class zzc extends BroadcastReceiver {
    final /* synthetic */ RemoteModelDownloadManager zza;
    private final long zzb;
    private final k zzc;

    public /* synthetic */ zzc(RemoteModelDownloadManager remoteModelDownloadManager, long j10, k kVar, zzb zzbVar) {
        this.zza = remoteModelDownloadManager;
        this.zzb = j10;
        this.zzc = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g gVar;
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        zzsh zzshVar;
        RemoteModel remoteModel;
        zzsh zzshVar2;
        RemoteModel remoteModel2;
        RemoteModel remoteModel3;
        zzsh zzshVar3;
        RemoteModel remoteModel4;
        MlKitException zzl;
        MlKitContext mlKitContext;
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.zzb) {
            return;
        }
        RemoteModelDownloadManager remoteModelDownloadManager = this.zza;
        Integer downloadingModelStatusCode = remoteModelDownloadManager.getDownloadingModelStatusCode();
        synchronized (remoteModelDownloadManager) {
            try {
                mlKitContext = this.zza.zze;
                mlKitContext.getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                gVar = RemoteModelDownloadManager.zza;
                gVar.i("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e10);
            }
            longSparseArray = this.zza.zzc;
            longSparseArray.remove(this.zzb);
            longSparseArray2 = this.zza.zzd;
            longSparseArray2.remove(this.zzb);
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                RemoteModelDownloadManager remoteModelDownloadManager2 = this.zza;
                zzshVar3 = remoteModelDownloadManager2.zzi;
                zzry zzg = zzsk.zzg();
                remoteModel4 = remoteModelDownloadManager2.zzg;
                Long valueOf = Long.valueOf(longExtra);
                zzshVar3.zze(zzg, remoteModel4, false, remoteModelDownloadManager2.getFailureReason(valueOf));
                k kVar = this.zzc;
                zzl = this.zza.zzl(valueOf);
                kVar.b(zzl);
                return;
            }
            if (downloadingModelStatusCode.intValue() == 8) {
                RemoteModelDownloadManager remoteModelDownloadManager3 = this.zza;
                zzshVar2 = remoteModelDownloadManager3.zzi;
                zzry zzg2 = zzsk.zzg();
                remoteModel2 = remoteModelDownloadManager3.zzg;
                zzsi zzh = zzsj.zzh();
                zzh.zzb(zzmu.NO_ERROR);
                zzh.zze(true);
                remoteModel3 = this.zza.zzg;
                zzh.zzd(remoteModel3.getModelType());
                zzh.zza(zzna.SUCCEEDED);
                zzshVar2.zzg(zzg2, remoteModel2, zzh.zzh());
                this.zzc.c(null);
                return;
            }
        }
        RemoteModelDownloadManager remoteModelDownloadManager4 = this.zza;
        zzshVar = remoteModelDownloadManager4.zzi;
        zzry zzg3 = zzsk.zzg();
        remoteModel = remoteModelDownloadManager4.zzg;
        zzshVar.zze(zzg3, remoteModel, false, 0);
        this.zzc.b(new MlKitException("Model downloading failed", 13));
    }
}
