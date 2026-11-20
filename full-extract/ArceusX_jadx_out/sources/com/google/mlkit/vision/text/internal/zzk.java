package com.google.mlkit.vision.text.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import com.google.mlkit.vision.text.Text;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzk {
    public static final /* synthetic */ int zzb = 0;
    static final zzv zza = zzv.zza("\n");
    private static final Comparator zzc = new Comparator() { // from class: com.google.mlkit.vision.text.internal.zzf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10 = zzk.zzb;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static Text zza(com.google.android.gms.internal.mlkit_vision_text_common.zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i11 = 0;
        while (i11 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i11);
            zzbh zzbhVar2 = new zzbh();
            for (int i12 = i10; i12 < sparseArray3.size(); i12++) {
                zzbhVar2.zza((com.google.android.gms.internal.mlkit_vision_text_common.zzl) sparseArray3.valueAt(i12));
            }
            zzbk zzb2 = zzbhVar2.zzb();
            List zza2 = zzbu.zza(zzb2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzh
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) obj;
                    int i13 = zzk.zzb;
                    List zzb3 = zza.zzb(zzlVar2.zzb);
                    String str = zzy.zzb(zzlVar2.zze) ? "" : zzlVar2.zze;
                    Rect zza3 = zza.zza(zzb3);
                    String str2 = zzy.zzb(zzlVar2.zzg) ? "und" : zzlVar2.zzg;
                    final Matrix matrix2 = matrix;
                    return new Text.Line(str, zza3, zzb3, str2, matrix2, zzbu.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: com.google.mlkit.vision.text.internal.zzj
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            com.google.android.gms.internal.mlkit_vision_text_common.zzr zzrVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzr) obj2;
                            int i14 = zzk.zzb;
                            List zzb4 = zza.zzb(zzrVar.zzb);
                            return new Text.Element(zzy.zzb(zzrVar.zzd) ? "" : zzrVar.zzd, zza.zza(zzb4), zzb4, zzy.zzb(zzrVar.zzf) ? "und" : zzrVar.zzf, matrix2, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) zzb2.get(i10)).zzb;
            zzcp listIterator = zzb2.listIterator(i10);
            int i13 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MIN_VALUE;
            while (listIterator.hasNext()) {
                com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar2 = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) listIterator.next()).zzb;
                int i17 = -zzfVar.zza;
                int i18 = -zzfVar.zzb;
                int i19 = i10;
                double sin = Math.sin(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i20 = i11;
                double cos = Math.cos(Math.toRadians(zzfVar.zze));
                Point[] pointArr = new Point[4];
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                pointArr[i19] = point;
                point.offset(i17, i18);
                Point point2 = pointArr[i19];
                zzcp zzcpVar = listIterator;
                double d10 = point2.x * cos;
                int i21 = point2.y;
                int i22 = (int) (d10 + (i21 * sin));
                point2.x = i22;
                int i23 = (int) (((-r2) * sin) + (i21 * cos));
                point2.y = i23;
                pointArr[1] = new Point(zzfVar2.zzc + i22, i23);
                pointArr[2] = new Point(zzfVar2.zzc + i22, zzfVar2.zzd + i23);
                pointArr[3] = new Point(i22, i23 + zzfVar2.zzd);
                for (int i24 = i19; i24 < 4; i24++) {
                    Point point3 = pointArr[i24];
                    i14 = Math.min(i14, point3.x);
                    i13 = Math.max(i13, point3.x);
                    i15 = Math.min(i15, point3.y);
                    i16 = Math.max(i16, point3.y);
                }
                listIterator = zzcpVar;
                i10 = i19;
                sparseArray = sparseArray4;
                i11 = i20;
            }
            SparseArray sparseArray5 = sparseArray;
            int i25 = i11;
            int i26 = i10;
            int i27 = zzfVar.zza;
            int i28 = zzfVar.zzb;
            double sin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double cos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(i14, i15), new Point(i13, i15), new Point(i13, i16), new Point(i14, i16)};
            int i29 = i26;
            while (i29 < 4) {
                Point point4 = pointArr2[i29];
                int i30 = point4.x;
                double d11 = sin2;
                int i31 = point4.y;
                point4.x = (int) ((i30 * cos2) - (i31 * d11));
                point4.y = (int) ((i30 * d11) + (i31 * cos2));
                point4.offset(i27, i28);
                i29++;
                sin2 = d11;
            }
            List asList = Arrays.asList(pointArr2);
            zzbhVar.zza(new Text.TextBlock(zza.zzb(zzbu.zza(zza2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzi
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((Text.Line) obj).getText();
                }
            })), zza.zza(asList), asList, zzb(zza2), matrix, zza2));
            i11 = i25 + 1;
            i10 = i26;
            sparseArray = sparseArray5;
        }
        zzbk zzb3 = zzbhVar.zzb();
        return new Text(zza.zzb(zzbu.zza(zzb3, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzg
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((Text.TextBlock) obj).getText();
            }
        })), zzb3);
    }

    private static String zzb(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String recognizedLanguage = ((Text.Line) it.next()).getRecognizedLanguage();
            hashMap.put(recognizedLanguage, Integer.valueOf((hashMap.containsKey(recognizedLanguage) ? ((Integer) hashMap.get(recognizedLanguage)).intValue() : 0) + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (entrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(entrySet, zzc)).getKey();
        return !zzy.zzb(str) ? str : "und";
    }
}
