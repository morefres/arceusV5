package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.mlkit.vision.common.InputImage;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import n9.g;
import n9.m;

/* loaded from: classes2.dex */
public class BitmapInStreamingChecker {
    private static final g zza = new g("StreamingFormatChecker", "");
    private final LinkedList zzb = new LinkedList();
    private long zzc = -1;

    public void check(@NonNull InputImage inputImage) {
        if (inputImage.getFormat() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzb.add(Long.valueOf(elapsedRealtime));
        if (this.zzb.size() > 5) {
            this.zzb.removeFirst();
        }
        if (this.zzb.size() != 5 || elapsedRealtime - ((Long) m.l((Long) this.zzb.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.zzc;
        if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.zzc = elapsedRealtime;
            zza.h("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
