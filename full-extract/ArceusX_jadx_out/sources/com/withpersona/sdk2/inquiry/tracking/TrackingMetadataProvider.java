package com.withpersona.sdk2.inquiry.tracking;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.h0;
import android.view.l;
import androidx.core.os.EnvironmentCompat;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata;
import gt.n;
import gt.o;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wn.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\rH\u0002J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sdk", "", "sdkVersion", "appVersion", "appNamespace", "deviceModel", "isSimulator", "", "featureFlags", "", "setFeatureFlags", "", "flags", "collect", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "getConnectionType", "getCellularTechnology", "getThermalState", "getSystemAvailableMemoryMb", "", "getBatteryLevel", "()Ljava/lang/Double;", "getIsLowPowerMode", "getAppMemoryUsageMb", "", "()Ljava/lang/Long;", "getIsCharging", "()Ljava/lang/Boolean;", "getIsBackgrounded", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingMetadataProvider {

    @NotNull
    private final String appNamespace;

    @Nullable
    private final String appVersion;

    @NotNull
    private final Context context;

    @NotNull
    private final String deviceModel;

    @Nullable
    private volatile Map<String, Boolean> featureFlags;
    private final boolean isSimulator;

    @NotNull
    private final String sdk;

    @NotNull
    private final String sdkVersion;

    public TrackingMetadataProvider(@NotNull Context context) {
        Object b;
        context.getClass();
        this.context = context;
        this.sdk = "persona-android";
        this.sdkVersion = "2.51.0";
        try {
            n.Companion companion = n.INSTANCE;
            b = n.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            b = n.b(o.a(th2));
        }
        this.appVersion = (String) (n.g(b) ? null : b);
        String packageName = this.context.getPackageName();
        packageName.getClass();
        this.appNamespace = packageName;
        this.deviceModel = Build.MANUFACTURER + " " + Build.MODEL;
        this.isSimulator = l.a();
    }

    private final Long getAppMemoryUsageMb() {
        Runtime runtime = Runtime.getRuntime();
        if (runtime == null) {
            return null;
        }
        return Long.valueOf((runtime.totalMemory() - runtime.freeMemory()) / 1048576);
    }

    private final Double getBatteryLevel() {
        int intProperty;
        Object systemService = this.context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        if (batteryManager != null && (intProperty = batteryManager.getIntProperty(4)) >= 0) {
            return Double.valueOf(intProperty / 100.0d);
        }
        return null;
    }

    private final String getCellularTechnology() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Object systemService = this.context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return null;
        }
        int dataNetworkType = telephonyManager.getDataNetworkType();
        if (dataNetworkType == 20) {
            return "5g";
        }
        switch (dataNetworkType) {
        }
        return null;
    }

    private final String getConnectionType() {
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return null;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return "offline";
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities == null ? EnvironmentCompat.MEDIA_UNKNOWN : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    private final boolean getIsBackgrounded() {
        return !h0.INSTANCE.a().a().getState().b(l.b.f2629d);
    }

    private final Boolean getIsCharging() {
        Object systemService = this.context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        if (batteryManager == null) {
            return null;
        }
        return Boolean.valueOf(batteryManager.isCharging());
    }

    private final boolean getIsLowPowerMode() {
        Object systemService = this.context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        return powerManager.isPowerSaveMode();
    }

    private final double getSystemAvailableMemoryMb() {
        Object systemService = this.context.getSystemService("activity");
        systemService.getClass();
        ((ActivityManager) systemService).getMemoryInfo(new ActivityManager.MemoryInfo());
        return r1.availMem / 1048576.0d;
    }

    private final String getThermalState() {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        Object systemService = this.context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return null;
        }
        switch (powerManager.getCurrentThermalStatus()) {
        }
        return null;
    }

    @NotNull
    public final TrackingMetadata collect() {
        Object b;
        Object b10;
        Object b11;
        Object b12;
        Object b13;
        Object b14;
        Object b15;
        Object b16;
        Object b17;
        Object b18;
        String str = this.sdk;
        String str2 = this.sdkVersion;
        String str3 = this.appVersion;
        String str4 = this.appNamespace;
        String str5 = this.deviceModel;
        Boolean valueOf = Boolean.valueOf(this.isSimulator);
        String str6 = Build.VERSION.RELEASE;
        try {
            n.Companion companion = n.INSTANCE;
            b = n.b(getConnectionType());
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            b = n.b(o.a(th2));
        }
        if (n.g(b)) {
            b = null;
        }
        String str7 = (String) b;
        try {
            b10 = n.b(getCellularTechnology());
        } catch (Throwable th3) {
            n.Companion companion3 = n.INSTANCE;
            b10 = n.b(o.a(th3));
        }
        if (n.g(b10)) {
            b10 = null;
        }
        String str8 = (String) b10;
        try {
            b11 = n.b(getThermalState());
        } catch (Throwable th4) {
            n.Companion companion4 = n.INSTANCE;
            b11 = n.b(o.a(th4));
        }
        if (n.g(b11)) {
            b11 = null;
        }
        String str9 = (String) b11;
        try {
            b12 = n.b(Double.valueOf(getSystemAvailableMemoryMb()));
        } catch (Throwable th5) {
            n.Companion companion5 = n.INSTANCE;
            b12 = n.b(o.a(th5));
        }
        if (n.g(b12)) {
            b12 = null;
        }
        Double d10 = (Double) b12;
        try {
            b13 = n.b(getBatteryLevel());
        } catch (Throwable th6) {
            n.Companion companion6 = n.INSTANCE;
            b13 = n.b(o.a(th6));
        }
        if (n.g(b13)) {
            b13 = null;
        }
        Double d11 = (Double) b13;
        try {
            b14 = n.b(Boolean.valueOf(getIsLowPowerMode()));
        } catch (Throwable th7) {
            n.Companion companion7 = n.INSTANCE;
            b14 = n.b(o.a(th7));
        }
        if (n.g(b14)) {
            b14 = null;
        }
        Boolean bool = (Boolean) b14;
        Long appMemoryUsageMb = getAppMemoryUsageMb();
        try {
            b15 = n.b(getIsCharging());
        } catch (Throwable th8) {
            n.Companion companion8 = n.INSTANCE;
            b15 = n.b(o.a(th8));
        }
        if (n.g(b15)) {
            b15 = null;
        }
        Boolean bool2 = (Boolean) b15;
        try {
            b16 = n.b(Boolean.valueOf(getIsBackgrounded()));
        } catch (Throwable th9) {
            n.Companion companion9 = n.INSTANCE;
            b16 = n.b(o.a(th9));
        }
        if (n.g(b16)) {
            b16 = null;
        }
        Boolean bool3 = (Boolean) b16;
        try {
            b17 = n.b(Locale.getDefault().toString());
        } catch (Throwable th10) {
            n.Companion companion10 = n.INSTANCE;
            b17 = n.b(o.a(th10));
        }
        if (n.g(b17)) {
            b17 = null;
        }
        String str10 = (String) b17;
        try {
            b18 = n.b(TimeZone.getDefault().getID());
        } catch (Throwable th11) {
            n.Companion companion11 = n.INSTANCE;
            b18 = n.b(o.a(th11));
        }
        return new TrackingMetadata(str, str2, str3, str4, str5, valueOf, str6, str7, str8, str9, d10, d11, bool, appMemoryUsageMb, bool2, bool3, str10, (String) (n.g(b18) ? null : b18), this.featureFlags);
    }

    public final void setFeatureFlags(@NotNull Map<String, Boolean> flags) {
        flags.getClass();
        this.featureFlags = flags;
    }
}
