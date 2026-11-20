package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFc1hSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFKeystoreWrapper = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f5291e = 1;
    private static char force;

    /* renamed from: i, reason: collision with root package name */
    private static char f5292i;
    private static char registerClient;
    private static char[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private static int f5293v;

    /* renamed from: w, reason: collision with root package name */
    private static char f5294w;
    private final Map<String, Object> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final Context f5295d;

    static {
        registerClient();
        TextUtils.indexOf("", "");
        TextUtils.lastIndexOf("", '0', 0);
        KeyEvent.getDeadChar(0, 0);
        KeyEvent.getModifierMetaStateMask();
        SystemClock.uptimeMillis();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getMaximumFlingVelocity();
        Process.myPid();
        ViewConfiguration.getZoomControlsTimeout();
        Color.red(0);
        View.getDefaultSize(0, 0);
        AudioTrack.getMaxVolume();
        int i10 = f5293v + 19;
        f5291e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 24 / 0;
        }
    }

    public AFc1hSDK(Map<String, Object> map, Context context) {
        this.AFLogger = map;
        this.f5295d = context;
        put(AFLogger(), AFKeystoreWrapper());
    }

    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i10 = 0; i10 < 3; i10++) {
            f5293v = (f5291e + 97) % 128;
            arrayList.add(Integer.valueOf(strArr[i10].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < intValue) {
            f5293v = (f5291e + 83) % 128;
            Integer num = null;
            int i12 = 0;
            while (i12 < 3) {
                int charAt = strArr[i12].charAt(i11);
                if (num != null) {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
                i12++;
                f5293v = (f5291e + 15) % 128;
            }
            sb2.append(Integer.toHexString(num.intValue()));
            i11++;
            f5293v = (f5291e + 71) % 128;
        }
        return sb2;
    }

    @NonNull
    private String AFLogger() {
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFLogger;
            Object[] objArr = new Object[1];
            a(")!#\u0003\u0001+\r\f\u0005#)\u000f", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 51), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFLogger;
            Object[] objArr2 = new Object[1];
            a("\u0018\u001b%\f㙣", 4 - ImageFormat.getBitsPerPixel(0), (byte) (Color.red(0) + 101), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                f5293v = (f5291e + 83) % 128;
                Object[] objArr3 = new Object[1];
                a("\u001f,$\u0018)\u0015 \u0017", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, (byte) (21 - ExpandableListView.getPackedPositionChild(0L)), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(obj);
            sb2.reverse();
            StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb2.toString());
            int length = AFKeystoreWrapper2.length();
            if (length > 4) {
                AFKeystoreWrapper2.delete(4, length);
            } else {
                while (length < 4) {
                    int i10 = f5293v + 73;
                    f5291e = i10 % 128;
                    if (i10 % 2 == 0) {
                        length += 45;
                        AFKeystoreWrapper2.append('\\');
                    } else {
                        length++;
                        AFKeystoreWrapper2.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            a("/\u0007㙈", 3 - Color.green(0), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 76), objArr4);
            AFKeystoreWrapper2.insert(0, ((String) objArr4[0]).intern());
            return AFKeystoreWrapper2.toString();
        } catch (Exception e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.SECURITY;
            Object[] objArr5 = new Object[1];
            a("\u0013\n\u0002\u000e\u0001\u0013\u0013\u001a0!$/\u0013\u0007!+\u0013\n\n\r!/\u0001*\n\u00100+\u0013\u001a", (ViewConfiguration.getPressedStateDuration() >> 16) + 30, (byte) (107 - TextUtils.indexOf("", "")), objArr5);
            aFLogger.e(logTag, ((String) objArr5[0]).intern(), e10, false, false);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a("!)*\u000f\b!-\u0013\r\n\u0013!#\u0005,\b\u0013-/\u0007\u001a\u0005$0\u0003\u001c\u0005\u0013\n\u0006\r\u0013\u0001*\u0017\n-0", 38 - KeyEvent.getDeadChar(0, 0), (byte) (114 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e10);
            aFLogger.v(logTag, sb3.toString());
            Object[] objArr7 = new Object[1];
            a("/\u0007\u001e\u0006㖺㖺㖺", 6 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (23 - TextUtils.indexOf("", "")), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static void a(String str, int i10, byte b, Object[] objArr) {
        int i11;
        char[] cArr = str;
        if (str != null) {
            $10 = ($11 + 57) % 128;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        char[] cArr3 = unregisterClient;
        if (cArr3 != null) {
            $10 = ($11 + 111) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr4[i12] = (char) (cArr3[i12] ^ (-3954572101486969845L));
            }
            $10 = ($11 + 53) % 128;
            cArr3 = cArr4;
        }
        char c10 = (char) ((-3954572101486969845L) ^ AFKeystoreWrapper);
        char[] cArr5 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr5[i11] = (char) (cArr2[i11] - b);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            aFk1sSDK.AFLogger = 0;
            while (true) {
                int i13 = aFk1sSDK.AFLogger;
                if (i13 >= i11) {
                    break;
                }
                int i14 = ($11 + 7) % 128;
                $10 = i14;
                char c11 = cArr2[i13];
                aFk1sSDK.f5495d = c11;
                char c12 = cArr2[i13 + 1];
                aFk1sSDK.AFKeystoreWrapper = c12;
                if (c11 == c12) {
                    cArr5[i13] = (char) (c11 - b);
                    cArr5[i13 + 1] = (char) (c12 - b);
                    $11 = (i14 + 87) % 128;
                } else {
                    int i15 = c11 / c10;
                    aFk1sSDK.unregisterClient = i15;
                    int i16 = c11 % c10;
                    aFk1sSDK.f5496e = i16;
                    int i17 = c12 / c10;
                    aFk1sSDK.registerClient = i17;
                    int i18 = c12 % c10;
                    aFk1sSDK.f5497w = i18;
                    if (i16 == i18) {
                        int i19 = ((i15 + c10) - 1) % c10;
                        aFk1sSDK.unregisterClient = i19;
                        int i20 = ((i17 + c10) - 1) % c10;
                        aFk1sSDK.registerClient = i20;
                        cArr5[i13] = cArr3[(i19 * c10) + i16];
                        cArr5[i13 + 1] = cArr3[(i20 * c10) + i18];
                    } else if (i15 == i17) {
                        int i21 = ((i16 + c10) - 1) % c10;
                        aFk1sSDK.f5496e = i21;
                        int i22 = ((i18 + c10) - 1) % c10;
                        aFk1sSDK.f5497w = i22;
                        cArr5[i13] = cArr3[(i15 * c10) + i21];
                        cArr5[i13 + 1] = cArr3[(i17 * c10) + i22];
                    } else {
                        cArr5[i13] = cArr3[(i15 * c10) + i18];
                        cArr5[i13 + 1] = cArr3[(i17 * c10) + i16];
                    }
                }
                aFk1sSDK.AFLogger = i13 + 2;
            }
        }
        for (int i23 = 0; i23 < i10; i23++) {
            cArr5[i23] = (char) (cArr5[i23] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    private static void b(String str, int i10, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i11 = $10 + 39;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1uSDK aFk1uSDK = new AFk1uSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1uSDK.AFKeystoreWrapper = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i12 = aFk1uSDK.AFKeystoreWrapper;
            if (i12 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i10);
                return;
            }
            cArr4[0] = cArr2[i12];
            cArr4[1] = cArr2[i12 + 1];
            int i13 = 58224;
            int i14 = 0;
            while (i14 < 16) {
                char c10 = cArr4[1];
                char c11 = cArr4[0];
                char c12 = (char) (c10 - (((c11 + i13) ^ ((c11 << 4) + ((char) (f5292i ^ (-8065364185533233497L))))) ^ ((c11 >>> 5) + ((char) (f5294w ^ (-8065364185533233497L))))));
                cArr4[1] = c12;
                cArr4[0] = (char) (c11 - (((c12 >>> 5) + ((char) (force ^ (-8065364185533233497L)))) ^ ((c12 + i13) ^ ((c12 << 4) + ((char) (registerClient ^ (-8065364185533233497L)))))));
                i13 -= 40503;
                i14++;
                $10 = ($11 + 93) % 128;
            }
            int i15 = aFk1uSDK.AFKeystoreWrapper;
            cArr3[i15] = cArr4[0];
            cArr3[i15 + 1] = cArr4[1];
            aFk1uSDK.AFKeystoreWrapper = i15 + 2;
        }
    }

    public static void registerClient() {
        unregisterClient = new char[]{51685, 51625, 51624, 51698, 51643, 51619, 51684, 51639, 51616, 51711, 51620, 51682, 51700, 51689, 51709, 51674, 51655, 51702, 51644, 51688, 51681, 51723, 51667, 51699, 51710, 51669, 51683, 51664, 51621, 51701, 51679, 51705, 51707, 51680, 51703, 51651, 51708, 51697, 51662, 51617, 51696, 51686, 51706, 51704, 51627, 51678, 51687, 51633, 51647};
        AFKeystoreWrapper = (char) 64524;
        registerClient = (char) 19924;
        force = (char) 63335;
        f5292i = (char) 43221;
        f5294w = (char) 41623;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a5 A[Catch: Exception -> 0x0174, TryCatch #0 {Exception -> 0x0174, blocks: (B:7:0x0132, B:9:0x0158, B:10:0x0180, B:13:0x0192, B:16:0x01ba, B:17:0x0284, B:20:0x028f, B:22:0x029c, B:24:0x02a5, B:26:0x02b1, B:28:0x02b7, B:31:0x02bd), top: B:6:0x0132 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String AFKeystoreWrapper() {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1hSDK.AFKeystoreWrapper():java.lang.String");
    }
}
