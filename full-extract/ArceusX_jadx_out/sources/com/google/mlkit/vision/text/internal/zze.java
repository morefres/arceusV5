package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.text.Text;
import n9.m;
import y9.b;

/* loaded from: classes2.dex */
final class zze implements zzm {
    private final Context zza;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzp zzb = new com.google.android.gms.internal.mlkit_vision_text_common.zzp(null);
    private boolean zzc;
    private com.google.android.gms.internal.mlkit_vision_text_common.zzh zzd;

    public zze(Context context) {
        this.zza = context;
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final Text zza(InputImage inputImage) {
        Bitmap convertToUpRightBitmap;
        int i10;
        if (this.zzd == null) {
            zzb();
        }
        if (this.zzd == null) {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        if (inputImage.getFormat() == -1) {
            convertToUpRightBitmap = inputImage.getBitmapInternal();
            i10 = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
        } else {
            convertToUpRightBitmap = ImageConvertUtils.getInstance().convertToUpRightBitmap(inputImage);
            i10 = 0;
        }
        int i11 = i10;
        try {
            return zzk.zza(((com.google.android.gms.internal.mlkit_vision_text_common.zzh) m.l(this.zzd)).zze(b.u2(convertToUpRightBitmap), new com.google.android.gms.internal.mlkit_vision_text_common.zzd(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, i11)), inputImage.getCoordinatesMatrix());
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to run legacy text recognizer.", 13, e10);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzb() {
        if (this.zzd != null) {
            return;
        }
        try {
            com.google.android.gms.internal.mlkit_vision_text_common.zzh zzd = com.google.android.gms.internal.mlkit_vision_text_common.zzj.zza(DynamiteModule.e(this.zza, DynamiteModule.b, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).d("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(b.u2(this.zza), this.zzb);
            this.zzd = zzd;
            if (zzd != null || this.zzc) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            OptionalModuleUtils.requestDownload(this.zza, OptionalModuleUtils.OCR);
            this.zzc = true;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to create legacy text recognizer.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzc() {
        com.google.android.gms.internal.mlkit_vision_text_common.zzh zzhVar = this.zzd;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException e10) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e10);
            }
            this.zzd = null;
        }
    }
}
