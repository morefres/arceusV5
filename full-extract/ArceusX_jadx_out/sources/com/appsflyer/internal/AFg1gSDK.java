package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.AFg1cSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1gSDK {
    private final LinkedHashMap<String, Object> unregisterClient;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f5410d = new Object() { // from class: com.appsflyer.internal.AFg1gSDK.4
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double AFLogger = Double.valueOf(-0.0d);

    public AFg1gSDK() {
        this.unregisterClient = new LinkedHashMap<>();
    }

    public static String AFKeystoreWrapper(Number number) {
        if (number == null) {
            throw new AFg1hSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Map map = AFa1bSDK.getInstance;
            Object obj = map.get(-1950536006);
            if (obj == null) {
                obj = ((Class) AFa1bSDK.AFLogger((char) (37687 - View.getDefaultSize(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 282, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35)).getDeclaredMethod(rl.d.f30696a, Double.TYPE);
                map.put(-1950536006, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).getClass();
            if (number.equals(AFLogger)) {
                return "-0";
            }
            long longValue = number.longValue();
            return doubleValue == ((double) longValue) ? Long.toString(longValue) : number.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object registerClient(Object obj) {
        if (obj == null) {
            return f5410d;
        }
        if (((Class) AFa1bSDK.AFLogger((char) Color.green(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 318, 37 - View.resolveSizeAndState(0, 0, 0))).isInstance(obj) || (obj instanceof AFg1gSDK)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Map map = AFa1bSDK.getInstance;
                Object obj2 = map.get(-699350596);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1bSDK.AFLogger((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.getCapsMode("", 0, 0) + 318, 37 - View.combineMeasuredStates(0, 0))).getDeclaredConstructor(String.class);
                    map.put(-699350596, obj2);
                }
                obj = ((Constructor) obj2).newInstance(objArr);
                return obj;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        if (obj instanceof JSONObject) {
            return new AFg1gSDK(obj.toString());
        }
        if (obj.equals(f5410d)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Map map2 = AFa1bSDK.getInstance;
                Object obj3 = map2.get(-1688574219);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1bSDK.AFLogger((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 318 - Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 37)).getDeclaredConstructor(Collection.class);
                    map2.put(-1688574219, obj3);
                }
                return ((Constructor) obj3).newInstance(objArr2);
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        }
        if (obj.getClass().isArray()) {
            try {
                Object[] objArr3 = {obj};
                Map map3 = AFa1bSDK.getInstance;
                Object obj4 = map3.get(1891103082);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1bSDK.AFLogger((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) + 318, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36)).getDeclaredConstructor(Object.class);
                    map3.put(1891103082, obj4);
                }
                return ((Constructor) obj4).newInstance(objArr3);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th4;
            }
        }
        if (obj instanceof Map) {
            return new AFg1gSDK((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
        return null;
    }

    public final String toString() {
        try {
            AFg1cSDK aFg1cSDK = new AFg1cSDK();
            registerClient(aFg1cSDK);
            return aFg1cSDK.toString();
        } catch (AFg1hSDK unused) {
            return null;
        }
    }

    public AFg1gSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.unregisterClient.put(str, registerClient(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    private AFg1gSDK(Object obj) {
        try {
            Map map = AFa1bSDK.getInstance;
            Object obj2 = map.get(-1188160950);
            if (obj2 == null) {
                obj2 = ((Class) AFa1bSDK.AFLogger((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 354, View.MeasureSpec.getSize(0) + 37)).getDeclaredMethod("AFLogger", null);
                map.put(-1188160950, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (!(invoke instanceof AFg1gSDK)) {
                Object[] objArr = {invoke, "AFJsonObject"};
                Object obj3 = map.get(998982983);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1bSDK.AFLogger((char) (37687 - Color.alpha(0)), 282 - (ViewConfiguration.getPressedStateDuration() >> 16), 36 - View.resolveSize(0, 0))).getDeclaredMethod("AFLogger", Object.class, String.class);
                    map.put(998982983, obj3);
                }
                throw ((Throwable) ((Method) obj3).invoke(null, objArr));
            }
            this.unregisterClient = ((AFg1gSDK) invoke).unregisterClient;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public final AFg1gSDK AFKeystoreWrapper(String str, Object obj) {
        if (obj == null) {
            this.unregisterClient.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1bSDK.getInstance;
                Object obj2 = map.get(-1950536006);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1bSDK.AFLogger((char) (37687 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 282, 36 - (Process.myPid() >> 22))).getMethod(rl.d.f30696a, Double.TYPE);
                    map.put(-1950536006, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).getClass();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.unregisterClient;
        if (str == null) {
            throw new AFg1hSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AFg1gSDK(java.lang.String r6) {
        /*
            r5 = this;
            r0 = -385531939(0xffffffffe9053fdd, float:-1.0068045E25)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L45
            java.util.Map r1 = com.appsflyer.internal.AFa1bSDK.getInstance     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L14
            goto L3b
        L14:
            r2 = 0
            int r3 = android.graphics.Color.green(r2)     // Catch: java.lang.Throwable -> L45
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L45
            int r2 = android.graphics.Color.alpha(r2)     // Catch: java.lang.Throwable -> L45
            int r2 = 355 - r2
            int r4 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch: java.lang.Throwable -> L45
            int r4 = r4 >> 16
            int r4 = r4 + 37
            java.lang.Object r2 = com.appsflyer.internal.AFa1bSDK.AFLogger(r3, r2, r4)     // Catch: java.lang.Throwable -> L45
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L45
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L45
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L45
        L3b:
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2     // Catch: java.lang.Throwable -> L45
            java.lang.Object r6 = r2.newInstance(r6)     // Catch: java.lang.Throwable -> L45
            r5.<init>(r6)
            return
        L45:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L4d
            throw r0
        L4d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1gSDK.<init>(java.lang.String):void");
    }

    public final void registerClient(AFg1cSDK aFg1cSDK) {
        aFg1cSDK.AFKeystoreWrapper(AFg1cSDK.AFa1ySDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.unregisterClient.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                aFg1cSDK.unregisterClient();
                aFg1cSDK.AFLogger(key);
                aFg1cSDK.d(entry.getValue());
            } else {
                throw new AFg1hSDK("Names must be non-null");
            }
        }
        aFg1cSDK.unregisterClient(AFg1cSDK.AFa1ySDK.EMPTY_OBJECT, AFg1cSDK.AFa1ySDK.NONEMPTY_OBJECT, "}");
    }
}
