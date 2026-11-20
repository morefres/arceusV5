package com.roblox.engine.jni.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediaCodecInfoUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Integer, List<String>> f9735a = d(MediaCodecInfo.CodecProfileLevel.class, "Profile");
    public static final Map<Integer, List<String>> b = d(MediaCodecInfo.CodecProfileLevel.class, "Level");

    /* renamed from: c, reason: collision with root package name */
    public static final Map<Integer, List<String>> f9736c = d(MediaCodecInfo.CodecProfileLevel.class, "AACObject");

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, String> f9737d;

    static {
        HashMap hashMap = new HashMap();
        f9737d = hashMap;
        hashMap.put("heic", "HEVC");
        hashMap.put("hevc", "HEVC");
        hashMap.put("avc", "AVC");
        hashMap.put("3gpp", "H263");
        hashMap.put("mpeg2", "MPEG2");
        hashMap.put("mp4v-es", "MPEG4");
        hashMap.put("vp8", "VP8");
        hashMap.put("vp9", "VP9");
        hashMap.put("av01", "AV1");
        hashMap.put("vorbis", "Vorbis");
        hashMap.put("opus", "Opus");
    }

    public static <T> Field[] a(Class<T> cls) {
        Field[] fields = cls.getFields();
        Field[] declaredFields = cls.getDeclaredFields();
        Field[] fieldArr = new Field[fields.length + declaredFields.length];
        System.arraycopy(fields, 0, fieldArr, 0, fields.length);
        System.arraycopy(declaredFields, 0, fieldArr, fields.length, declaredFields.length);
        return fieldArr;
    }

    public static MediaCodecInfo.CodecCapabilities b(MediaCodecInfo mediaCodecInfo, String str) {
        try {
            return mediaCodecInfo.getCapabilitiesForType(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str) {
        if (str.contains("aac") || str.contains("mp4a")) {
            return "AAC";
        }
        for (Map.Entry<String, String> entry : f9737d.entrySet()) {
            if (str.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static Map<Integer, List<String>> d(Class<?> cls, String str) {
        Field[] a10 = a(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Field field : a10) {
            if (field.getName().contains(str)) {
                try {
                    int i11 = field.getInt(null);
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(Integer.valueOf(i11))) {
                        linkedHashMap.put(Integer.valueOf(i11), new ArrayList());
                    }
                    ((List) linkedHashMap.get(Integer.valueOf(i11))).add(name);
                } catch (IllegalAccessException unused) {
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            linkedHashMap2.put(num, (List) linkedHashMap.get(num));
        }
        return linkedHashMap2;
    }

    public static <K, V> V e(Map<K, V> map, K k10, V v5) {
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : v5;
    }

    public static Pair<String, String> f(String str, MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        String str2;
        String str3;
        String c10 = c(str);
        boolean equals = "AAC".equals(c10);
        Iterator it = (equals ? (List) e(f9736c, Integer.valueOf(codecProfileLevel.profile), Collections.EMPTY_LIST) : (List) e(f9735a, Integer.valueOf(codecProfileLevel.profile), Collections.EMPTY_LIST)).iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                str3 = "";
                break;
            }
            str3 = (String) it.next();
            if (c10 == null || str3.contains(c10)) {
                break;
            }
        }
        if (str3.isEmpty()) {
            str3 = String.valueOf(codecProfileLevel.profile);
        }
        for (String str4 : equals ? Collections.singletonList(String.valueOf(codecProfileLevel.level)) : (List) e(b, Integer.valueOf(codecProfileLevel.level), Collections.EMPTY_LIST)) {
            if (c10 == null || str4.contains(c10)) {
                str2 = str4;
                break;
            }
        }
        if (str2.isEmpty()) {
            str2 = String.valueOf(codecProfileLevel.level);
        }
        return new Pair<>(str3, str2);
    }

    public static String g(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            String c10 = c(str);
            if (c10 != null) {
                return c10;
            }
        }
        return null;
    }

    @Keep
    public static VideoCodecCapability[] getVideoCodecs() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!h(mediaCodecInfo) && j(mediaCodecInfo) && g(mediaCodecInfo) != null) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    VideoCodecCapability l10 = l(mediaCodecInfo, str);
                    if (l10 != null) {
                        arrayList.add(l10);
                    }
                }
            }
        }
        return (VideoCodecCapability[]) arrayList.toArray(new VideoCodecCapability[0]);
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isAlias();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        continue;
     */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean hevcHardwareEncodingSupported(int r10, int r11, int r12) {
        /*
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r1 = 0
            r0.<init>(r1)
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
            int r2 = r0.length
            r3 = r1
        Lc:
            if (r3 >= r2) goto L49
            r4 = r0[r3]
            boolean r5 = r4.isEncoder()
            if (r5 != 0) goto L17
            goto L46
        L17:
            java.lang.String[] r5 = r4.getSupportedTypes()
            int r6 = r5.length
            r7 = r1
        L1d:
            if (r7 >= r6) goto L46
            r8 = r5[r7]
            java.lang.String r9 = "video/hevc"
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L43
            boolean r5 = i(r4)
            if (r5 == 0) goto L30
            goto L46
        L30:
            android.media.MediaCodecInfo$CodecCapabilities r4 = r4.getCapabilitiesForType(r9)
            android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()
            if (r4 == 0) goto L46
            double r5 = (double) r12
            boolean r4 = r4.areSizeAndRateSupported(r10, r11, r5)
            if (r4 == 0) goto L46
            r10 = 1
            return r10
        L43:
            int r7 = r7 + 1
            goto L1d
        L46:
            int r3 = r3 + 1
            goto Lc
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.engine.jni.video.MediaCodecInfoUtils.hevcHardwareEncodingSupported(int, int, int):boolean");
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29 && (!mediaCodecInfo.isHardwareAccelerated() || mediaCodecInfo.isSoftwareOnly())) {
            return true;
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.contains(".sw.dec") || lowerCase.contains(".sw.enc") || lowerCase.contains("ffmpeg");
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities() != null) {
                return true;
            }
        }
        return false;
    }

    public static int k(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static VideoCodecCapability l(MediaCodecInfo mediaCodecInfo, String str) {
        int i10;
        int i11;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        MediaCodecInfo.CodecCapabilities b10 = b(mediaCodecInfo, str);
        Integer num6 = null;
        if (b10 == null) {
            return null;
        }
        List<Pair> arrayList = b10.profileLevels == null ? Collections.EMPTY_LIST : new ArrayList();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : b10.profileLevels) {
            arrayList.add(f(str, codecProfileLevel));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Pair pair : arrayList) {
            arrayList2.add((String) pair.first);
            arrayList3.add((String) pair.second);
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = b10.getVideoCapabilities();
        if (videoCapabilities == null || videoCapabilities.getBitrateRange() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = videoCapabilities.getBitrateRange().getLower().intValue();
            i11 = videoCapabilities.getBitrateRange().getUpper().intValue();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedHeights() == null) {
            num = null;
            num2 = null;
        } else {
            num = videoCapabilities.getSupportedHeights().getLower();
            num2 = videoCapabilities.getSupportedHeights().getUpper();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedWidths() == null) {
            num3 = null;
            num4 = null;
        } else {
            num3 = videoCapabilities.getSupportedWidths().getLower();
            num4 = videoCapabilities.getSupportedWidths().getUpper();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedFrameRates() == null) {
            num5 = null;
        } else {
            num6 = videoCapabilities.getSupportedFrameRates().getLower();
            num5 = videoCapabilities.getSupportedFrameRates().getUpper();
        }
        VideoCodecCapability videoCodecCapability = new VideoCodecCapability();
        videoCodecCapability.isEncoder = mediaCodecInfo.isEncoder();
        videoCodecCapability.isHardware = !i(mediaCodecInfo);
        videoCodecCapability.codec = c(str);
        videoCodecCapability.name = mediaCodecInfo.getName();
        videoCodecCapability.profiles = (String[]) arrayList2.toArray(new String[0]);
        videoCodecCapability.levels = (String[]) arrayList3.toArray(new String[0]);
        videoCodecCapability.maxInstances = b10.getMaxSupportedInstances();
        videoCodecCapability.minWidth = k(num3);
        videoCodecCapability.maxWidth = k(num4);
        videoCodecCapability.minHeight = k(num);
        videoCodecCapability.maxHeight = k(num2);
        videoCodecCapability.minFps = k(num6);
        videoCodecCapability.maxFps = k(num5);
        videoCodecCapability.minBitrate = i10;
        videoCodecCapability.maxBitrate = i11;
        return videoCodecCapability;
    }
}
