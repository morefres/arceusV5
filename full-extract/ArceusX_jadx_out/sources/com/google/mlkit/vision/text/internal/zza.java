package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zza {
    public static Rect zza(List list) {
        Iterator it = list.iterator();
        int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i11 = Math.min(i11, point.x);
            i10 = Math.max(i10, point.x);
            i12 = Math.min(i12, point.y);
            i13 = Math.max(i13, point.y);
        }
        return new Rect(i11, i12, i10, i13);
    }

    public static List zzb(com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar) {
        double sin = Math.sin(Math.toRadians(zzfVar.zze));
        double cos = Math.cos(Math.toRadians(zzfVar.zze));
        double d10 = zzfVar.zza;
        double d11 = zzfVar.zzc;
        Point point = new Point((int) (d10 + (d11 * cos)), (int) (zzfVar.zzb + (d11 * sin)));
        double d12 = point.x;
        int i10 = zzfVar.zzd;
        double d13 = i10 * sin;
        double d14 = r0[1].y + (i10 * cos);
        Point point2 = r0[0];
        int i11 = point2.x;
        Point point3 = r0[2];
        int i12 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (d12 - d13), (int) d14), new Point(i11 + (i12 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
