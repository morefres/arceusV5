package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzeu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxn;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import od.a;
import sb.j;
import sb.m;

/* loaded from: classes2.dex */
public final class zzh extends MobileVisionBase implements BarcodeScanner {
    public static final /* synthetic */ int zzc = 0;
    private static final BarcodeScannerOptions zzd = new BarcodeScannerOptions.Builder().build();
    final zzxk zzb;
    private final boolean zze;
    private final BarcodeScannerOptions zzf;
    private int zzg;
    private boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(@NonNull BarcodeScannerOptions barcodeScannerOptions, @NonNull zzl zzlVar, @NonNull Executor executor, @NonNull zzwp zzwpVar, @NonNull MlKitContext mlKitContext) {
        super(zzlVar, executor);
        zzxk zzd2;
        ZoomSuggestionOptions zzb = barcodeScannerOptions.zzb();
        if (zzb == null) {
            zzd2 = null;
        } else {
            zzd2 = zzxk.zzd(mlKitContext.getApplicationContext(), mlKitContext.getApplicationContext().getPackageName());
            zzd2.zzo(new zze(zzb), zzeu.zza());
            if (zzb.zza() >= 1.0f) {
                zzd2.zzk(zzb.zza());
            }
            zzd2.zzm();
        }
        this.zzf = barcodeScannerOptions;
        boolean zzf = zzb.zzf();
        this.zze = zzf;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(zzb.zzc(barcodeScannerOptions));
        zzrr zzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zzf ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.zzb = zzd2;
    }

    private final Task zzf(@NonNull Task task, final int i10, final int i11) {
        return task.o(new j() { // from class: com.google.mlkit.vision.barcode.internal.zzf
            @Override // sb.j
            public final Task then(Object obj) {
                return zzh.this.zzd(i10, i11, (List) obj);
            }
        });
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final synchronized void close() {
        try {
            zzxk zzxkVar = this.zzb;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.zzh);
                this.zzb.zzj();
            }
            super.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner, k9.h
    public final Feature[] getOptionalFeatures() {
        return this.zze ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_BARCODE};
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    @NonNull
    public final Task<List<Barcode>> process(@NonNull a aVar) {
        super.processBase(aVar);
        throw null;
    }

    public final /* synthetic */ Task zzd(int i10, int i11, List list) {
        if (this.zzb == null) {
            return m.f(list);
        }
        this.zzg++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Barcode barcode = (Barcode) it.next();
            if (barcode.getFormat() == -1) {
                arrayList2.add(barcode);
            } else {
                arrayList.add(barcode);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Point[] cornerPoints = ((Barcode) arrayList2.get(i12)).getCornerPoints();
                if (cornerPoints != null) {
                    this.zzb.zzi(this.zzg, zzxn.zzg(Arrays.asList(cornerPoints), i10, i11, 0.0f));
                }
            }
        } else {
            this.zzh = true;
        }
        if (true != this.zzf.zzd()) {
            list = arrayList;
        }
        return m.f(list);
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    @NonNull
    public final Task<List<Barcode>> process(@NonNull InputImage inputImage) {
        return zzf(super.processBase(inputImage), inputImage.getWidth(), inputImage.getHeight());
    }
}
