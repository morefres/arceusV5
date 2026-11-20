package backtraceio.library.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import backtraceio.library.enums.BatteryState;
import backtraceio.library.enums.BluetoothStatus;
import backtraceio.library.enums.GpsStatus;
import backtraceio.library.enums.LocationStatus;
import backtraceio.library.enums.NfcStatus;
import backtraceio.library.enums.WifiStatus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes.dex */
public class DeviceAttributesHelper {
    private static String uuid;
    private final Context context;

    public DeviceAttributesHelper(Context context) {
        this.context = context;
    }

    private String generateDeviceId() {
        if (!BacktraceStringHelper.isNullOrEmpty(uuid)) {
            return uuid;
        }
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        String uuid2 = TextUtils.isEmpty(string) ? UUID.randomUUID().toString() : UUID.nameUUIDFromBytes(string.getBytes()).toString();
        uuid = uuid2;
        return uuid2;
    }

    private String getAppUsedStorageSize() {
        long j10;
        try {
            Runtime runtime = Runtime.getRuntime();
            j10 = runtime.totalMemory() - runtime.freeMemory();
        } catch (Exception e10) {
            e10.printStackTrace();
            j10 = -1;
        }
        return Long.toString(j10);
    }

    private float getBatteryLevel() {
        if (this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return -1.0f;
        }
        return r0.getIntExtra("level", -1) / r0.getIntExtra("scale", -1);
    }

    private BatteryState getBatteryState() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return BatteryState.UNKNOWN;
        }
        int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra != 2 ? intExtra != 4 ? intExtra != 5 ? BatteryState.UNKNOWN : BatteryState.FULL : BatteryState.UNPLUGGED : BatteryState.CHARGING;
    }

    private float getCpuTemperature() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/sys/class/thermal/thermal_zone0/temp"));
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return 0.0f;
            }
            bufferedReader.close();
            return Float.parseFloat(readLine) / 1000.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    private GpsStatus getGpsStatus() {
        return ((LocationManager) this.context.getSystemService("location")).isProviderEnabled("gps") ? GpsStatus.ENABLED : GpsStatus.DISABLED;
    }

    private LocationStatus getLocationServiceStatus() {
        return Settings.Secure.getInt(this.context.getContentResolver(), "location_mode", 0) != 0 ? LocationStatus.ENABLED : LocationStatus.DISABLED;
    }

    private ActivityManager.MemoryInfo getMemoryInformation() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    private NfcStatus getNfcStatus() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.context);
        return defaultAdapter == null ? NfcStatus.NOT_AVAILABLE : !defaultAdapter.isEnabled() ? NfcStatus.DISABLED : NfcStatus.ENABLED;
    }

    private WifiStatus getWifiStatus() {
        return !PermissionHelper.isPermissionForAccessWifiStateGranted(this.context) ? WifiStatus.NOT_PERMITTED : ((WifiManager) this.context.getApplicationContext().getSystemService("wifi")).isWifiEnabled() ? WifiStatus.ENABLED : WifiStatus.DISABLED;
    }

    private boolean isAirplaneModeOn() {
        return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    @SuppressLint({"MissingPermission"})
    private BluetoothStatus isBluetoothEnabled() {
        BluetoothAdapter adapter;
        if (!PermissionHelper.isPermissionForBluetoothGranted(this.context)) {
            return BluetoothStatus.NOT_PERMITTED;
        }
        BluetoothManager bluetoothManager = (BluetoothManager) this.context.getSystemService("bluetooth");
        return (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null || !adapter.isEnabled()) ? BluetoothStatus.DISABLED : BluetoothStatus.ENABLED;
    }

    private boolean isPowerSavingMode() {
        return ((PowerManager) this.context.getSystemService("power")).isPowerSaveMode();
    }

    public HashMap<String, String> getDeviceAttributes(Boolean bool) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("guid", generateDeviceId());
        hashMap.put("uname.sysname", "Android");
        hashMap.put("uname.machine", System.getProperty("os.arch"));
        if (!bool.booleanValue()) {
            return hashMap;
        }
        hashMap.put("device.airplane_mode", String.valueOf(isAirplaneModeOn()));
        hashMap.put("device.location", getLocationServiceStatus().toString());
        hashMap.put("device.nfc.status", getNfcStatus().toString());
        hashMap.put("device.gps.enabled", getGpsStatus().toString());
        hashMap.put("device.bluetooth_status", isBluetoothEnabled().toString());
        hashMap.put("device.cpu.temperature", String.valueOf(getCpuTemperature()));
        hashMap.put("device.is_power_saving_mode", String.valueOf(isPowerSavingMode()));
        hashMap.put("device.wifi.status", getWifiStatus().toString());
        hashMap.put("app.storage_used", getAppUsedStorageSize());
        hashMap.put("battery.level", String.valueOf(getBatteryLevel()));
        hashMap.put("battery.state", getBatteryState().toString());
        hashMap.put("cpu.boottime", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        ActivityManager.MemoryInfo memoryInformation = getMemoryInformation();
        hashMap.put("system.memory.total", Long.toString(memoryInformation.totalMem));
        hashMap.put("system.memory.free", Long.toString(memoryInformation.availMem));
        hashMap.put("system.memory.active", Long.toString(memoryInformation.totalMem - memoryInformation.availMem));
        return hashMap;
    }
}
