package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.migration.internal.MigrationDataProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1oSDK implements AFh1sSDK {

    @Nullable
    private Long AFKeystoreWrapper;

    @Nullable
    private JSONObject AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFi1aSDK f5434d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5435e;
    private boolean force;

    @Nullable
    private Long registerClient;

    @NotNull
    private final AFc1iSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5436v;

    public AFh1oSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull AFi1aSDK aFi1aSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFi1aSDK, "");
        this.unregisterClient = aFc1iSDK;
        this.f5434d = aFi1aSDK;
    }

    private final JSONObject AFKeystoreWrapper() {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (waitForAttributionData != null) {
            this.registerClient = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        }
        return waitForAttributionData;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void AFLogger() {
        this.f5435e = false;
        this.force = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void D_(@NotNull Intent intent, @NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1qSDK};
            Map map = AFa1bSDK.getInstance;
            Object obj = map.get(1527976489);
            if (obj == null) {
                obj = ((Class) AFa1bSDK.AFLogger((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41415), Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0') + 38)).getDeclaredConstructor(Uri.class, AFa1qSDK.class);
                map.put(1527976489, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            Object obj2 = map.get(260993585);
            if (obj2 == null) {
                obj2 = ((Class) AFa1bSDK.AFLogger((char) (41416 - (ViewConfiguration.getWindowTouchSlop() >> 8)), KeyEvent.keyCodeFromString(""), View.MeasureSpec.getSize(0) + 37)).getMethod("AFLogger", null);
                map.put(260993585, obj2);
            }
            Object invoke = ((Method) obj2).invoke(newInstance, null);
            Object obj3 = map.get(1508099722);
            if (obj3 == null) {
                obj3 = ((Class) AFa1bSDK.AFLogger((char) View.getDefaultSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 50 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("AFLogger", null);
                map.put(1508099722, obj3);
            }
            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
            this.f5435e = !booleanValue;
            this.force = booleanValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            unregisterClient("attr", aFh1pSDK, attributionData);
            this.f5436v = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final boolean registerClient() {
        return this.f5435e;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void unregisterClient(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        JSONObject jSONObject = this.AFLogger;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            unregisterClient("attr", aFh1pSDK, jSONObject);
        } else {
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper();
            if (AFKeystoreWrapper != null) {
                unregisterClient("attr", aFh1pSDK, AFKeystoreWrapper);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void registerClient(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (waitForDeepLinkingData != null) {
            this.AFKeystoreWrapper = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            unregisterClient("dl", aFh1pSDK, waitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void d() {
        if (this.f5435e || this.force || MigrationDataProvider.waitForDeepLinkingData(0L) == null) {
            return;
        }
        this.f5435e = true;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void unregisterClient(@NotNull AFf1uSDK aFf1uSDK, @NotNull Function0<Unit> function0) {
        JSONObject AFKeystoreWrapper;
        Intrinsics.checkNotNullParameter(aFf1uSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 1 && aFf1uSDK.unregisterClient == AFd1bSDK.registerClient) {
            Iterator<Referrer> it = this.f5434d.unregisterClient.iterator();
            while (it.hasNext()) {
                if (it.next().getState() == Referrer.State.STARTED) {
                    return;
                }
            }
            if (this.f5436v || (AFKeystoreWrapper = AFKeystoreWrapper()) == null) {
                return;
            }
            this.AFLogger = AFKeystoreWrapper;
            function0.invoke();
        }
    }

    private final void unregisterClient(String str, AFh1pSDK aFh1pSDK, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("branch", hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("external", hashMap2);
        aFh1pSDK.AFKeystoreWrapper(hashMap3);
        Map<String, Object> map = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFe1zSDK AFKeystoreWrapper = aFh1pSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        unregisterClient(map, AFKeystoreWrapper);
    }

    private final void unregisterClient(Map<String, Object> map, AFe1zSDK aFe1zSDK) {
        Long l10;
        if (aFe1zSDK == AFd1bSDK.afErrorLog) {
            l10 = this.AFKeystoreWrapper;
        } else {
            l10 = aFe1zSDK == AFd1bSDK.f5310w ? this.registerClient : null;
        }
        if (l10 != null) {
            AFj1iSDK.AFLogger(map).put("migration", kotlin.collections.j0.g(gt.s.a("delay", Long.valueOf(l10.longValue()))));
        }
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final boolean unregisterClient() {
        return this.f5436v;
    }
}
