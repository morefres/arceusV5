package rg;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.roblox.engine.jni.model.DeviceParams;

/* loaded from: classes2.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f30289a;

    public static /* synthetic */ void a(View view, int i10) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, i10);
    }

    public static void b(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT <= rh.h.a().z5() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            Parcel obtain = Parcel.obtain();
            memoryInfo.writeToParcel(obtain, 0);
            if (obtain.dataSize() < 32) {
                return;
            }
            obtain.setDataPosition(obtain.dataSize() - 32);
            long readLong = obtain.readLong();
            obtain.readLong();
            obtain.readLong();
            long readLong2 = obtain.readLong();
            deviceParams.lowMemoryKillerBackgroundAppThreshold = readLong;
            deviceParams.lowMemoryKillerForegroundAppThreshold = readLong2;
        }
    }

    public static void c(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return;
        }
        int memoryClass = activityManager.getMemoryClass();
        int largeMemoryClass = activityManager.getLargeMemoryClass();
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        deviceParams.memoryClass = memoryClass;
        deviceParams.largeMemoryClass = largeMemoryClass;
        deviceParams.isLowRamDevice = isLowRamDevice;
    }

    public static androidx.appcompat.app.a d(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextAppearance(context, R.style.TextAppearance.DeviceDefault.Large);
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        androidx.appcompat.app.a a10 = new a.C0009a(context).a();
        a10.x(textView, 150, 100, 150, 100);
        a10.setCanceledOnTouchOutside(true);
        try {
            a10.show();
        } catch (WindowManager.BadTokenException unused) {
        }
        return a10;
    }

    public static float e(Context context, int i10) {
        return i10 * f(context).density;
    }

    public static DisplayMetrics f(Context context) {
        DisplayMetrics displayMetrics = f30289a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        f30289a = displayMetrics2;
        return displayMetrics2;
    }

    public static String g(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return "WiFi";
        }
        if (type != 0) {
            return "Other";
        }
        switch (activeNetworkInfo.getSubtype()) {
        }
        return "";
    }

    public static void h(Activity activity) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        }
    }

    public static void i(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean j(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static void k(final View view, final int i10) {
        if (view != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: rg.d2
                @Override // java.lang.Runnable
                public final void run() {
                    e2.a(view, i10);
                }
            });
        }
    }
}
