package uh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.BatteryStatus;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: g, reason: collision with root package name */
    public static final long f32877g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f32878a;
    public final BatteryManager b;

    /* renamed from: c, reason: collision with root package name */
    public BroadcastReceiver f32879c;

    /* renamed from: d, reason: collision with root package name */
    public long f32880d = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f32881e = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: uh.h
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return i.b(runnable);
        }
    });

    /* renamed from: f, reason: collision with root package name */
    public ScheduledFuture<?> f32882f;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (System.currentTimeMillis() - i.this.f32880d > i.f32877g) {
                i.this.f32880d = System.currentTimeMillis();
                i.this.n(intent);
            }
        }
    }

    static {
        f32877g = rh.h.a().I2() ? 15000L : 30000L;
    }

    public i(@NonNull Context context) {
        this.f32878a = context;
        this.b = (BatteryManager) context.getSystemService("batterymanager");
    }

    public static /* synthetic */ Thread b(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("BatteryStatusObserver-" + System.currentTimeMillis());
        thread.setDaemon(true);
        return thread;
    }

    public static Boolean g(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return null;
        }
        return Boolean.valueOf(intent.getBooleanExtra(str, false));
    }

    public static Integer i(Intent intent, String str) {
        int intExtra;
        if (intent == null || !intent.hasExtra(str) || (intExtra = intent.getIntExtra(str, EditorInfoCompat.IME_FLAG_FORCE_ASCII)) == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    public static BatteryStatus.b l(Integer num) {
        if (num == null) {
            return BatteryStatus.b.UNKNOWN;
        }
        for (BatteryStatus.b bVar : BatteryStatus.b.values()) {
            if (bVar.androidValue == num.intValue()) {
                return bVar;
            }
        }
        return BatteryStatus.b.UNKNOWN;
    }

    public final Integer h(int i10) {
        BatteryManager batteryManager = this.b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Integer.valueOf((int) longProperty);
        }
        return null;
    }

    public final Long j(int i10) {
        BatteryManager batteryManager = this.b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Long.valueOf(longProperty);
        }
        return null;
    }

    public final String k(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "BATTERY_STATUS_UNKNOWN" : "BATTERY_STATUS_FULL" : "BATTERY_STATUS_NOT_CHARGING" : "BATTERY_STATUS_DISCHARGING" : "BATTERY_STATUS_CHARGING";
    }

    public final void m() {
        Integer num;
        Intent registerReceiver = this.f32878a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return;
        }
        BatteryStatus batteryStatus = new BatteryStatus();
        batteryStatus.chargeCounter = h(1);
        Integer h10 = h(2);
        batteryStatus.currentNow = h10;
        if (h10 != null && Math.abs(h10.intValue()) < 42000) {
            batteryStatus.currentNow = Integer.valueOf(batteryStatus.currentNow.intValue() * 1000);
        }
        Integer h11 = h(3);
        batteryStatus.currentAverage = h11;
        if (h11 != null && Math.abs(h11.intValue()) < 42000) {
            batteryStatus.currentAverage = Integer.valueOf(batteryStatus.currentAverage.intValue() * 1000);
        }
        batteryStatus.energyCounter = j(5);
        BatteryStatus.c b = BatteryStatus.c.b(i(registerReceiver, NotificationCompat.CATEGORY_STATUS));
        batteryStatus.status = Integer.valueOf(b.robloxValue);
        BatteryStatus.b l10 = l(i(registerReceiver, "plugged"));
        batteryStatus.plugged = Integer.valueOf(l10.robloxValue);
        if (l10 == BatteryStatus.b.NOT_PLUGGED) {
            Integer num2 = batteryStatus.currentNow;
            if (num2 != null && num2.intValue() > 0) {
                batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
                Integer num3 = batteryStatus.currentAverage;
                if (num3 != null) {
                    batteryStatus.currentAverage = Integer.valueOf(-num3.intValue());
                }
            }
        } else if (l10 != BatteryStatus.b.UNKNOWN && (num = batteryStatus.currentNow) != null && num.intValue() < 0) {
            batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
            Integer num4 = batteryStatus.currentAverage;
            if (num4 != null) {
                batteryStatus.currentAverage = Integer.valueOf(-num4.intValue());
            }
        }
        Integer i10 = i(registerReceiver, "level");
        Integer i11 = i(registerReceiver, "scale");
        if (i10 != null && i11 != null) {
            batteryStatus.batteryPercentage = Integer.valueOf((i10.intValue() * 100) / i11.intValue());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            batteryStatus.batteryLow = g(registerReceiver, "battery_low");
        }
        batteryStatus.voltage = i(registerReceiver, "voltage");
        if (i(registerReceiver, "temperature") != null) {
            batteryStatus.temperature = Float.valueOf(r4.intValue() / 10.0f);
        }
        batteryStatus.technology = registerReceiver.getStringExtra("technology");
        batteryStatus.health = Integer.valueOf(BatteryStatus.a.b(i(registerReceiver, "health")));
        batteryStatus.present = g(registerReceiver, "present");
        if (batteryStatus.currentNow != null && batteryStatus.voltage != null) {
            batteryStatus.power = Integer.valueOf((int) ((r0.intValue() / 1000.0f) * (batteryStatus.voltage.intValue() / 1000.0f)));
        }
        if (rh.h.a().z1()) {
            batteryStatus.batterySaverMode = Boolean.valueOf(((PowerManager) this.f32878a.getSystemService("power")).isPowerSaveMode());
        }
        ek.q.h("rbx.perfdata", "perfdata battery " + l10.name() + " " + b.name() + " " + batteryStatus.currentNow + "uAmps " + batteryStatus.power + "mW");
        NativeGLInterface.reportBatteryStatus(batteryStatus);
    }

    public final void n(Intent intent) {
        int intExtra = (int) ((intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f);
        int intExtra2 = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        ek.q.h("BatteryStatusObserver", "batteryStatus: " + k(intExtra2) + " batteryLevel: " + intExtra);
        NativeGLInterface.reportBatteryStateChanged(intExtra, intExtra2);
    }

    public void o() {
        q();
        ek.q.h("BatteryStatusObserver", "startObserving");
        if (rh.h.a().I2()) {
            this.f32882f = this.f32881e.scheduleWithFixedDelay(new Runnable() { // from class: uh.g
                @Override // java.lang.Runnable
                public final void run() {
                    i.this.m();
                }
            }, 0L, f32877g, TimeUnit.MILLISECONDS);
        } else {
            p();
        }
    }

    public void p() {
        q();
        ek.q.h("BatteryStatusObserver", "startObserving");
        this.f32879c = new a();
        Intent registerReceiver = this.f32878a.registerReceiver(this.f32879c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            n(registerReceiver);
        }
    }

    public void q() {
        if (this.f32879c != null) {
            ek.q.h("BatteryStatusObserver", "stopObserving");
            this.f32878a.unregisterReceiver(this.f32879c);
            this.f32879c = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f32882f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f32882f = null;
        }
    }
}
