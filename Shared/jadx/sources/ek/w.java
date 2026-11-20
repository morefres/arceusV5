package ek;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.util.List;

/* loaded from: classes2.dex */
public class w {
    public static String a(Context context) {
        return b(context) ? "foreground" : "background";
    }

    public static boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        boolean z10 = false;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100) {
                String[] strArr = runningAppProcessInfo.pkgList;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (strArr[i10].equals(context.getPackageName())) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
        }
        return z10;
    }

    public static void c(Context context) {
        q.h("ProcessUtils", "restartSelf, context = " + context);
        Intent o22 = ActivitySplash.o2(context, StartedForEnum.APP_RESTART);
        o22.setFlags(268468224);
        context.startActivity(o22);
        Runtime.getRuntime().exit(0);
    }
}
