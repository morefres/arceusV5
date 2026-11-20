package yj;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.system.OsConstants;
import android.util.Pair;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.engine.jni.model.ApplicationExitInfoCpp;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f36690a = {":isolate"};

    public static List<ApplicationExitInfoCpp> a(Context context) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT >= 30 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, rh.h.a().b());
            if (historicalProcessExitReasons.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo a10 = g6.l.a(it.next());
                if (!d(a10).booleanValue()) {
                    int reason = a10.getReason();
                    int status = a10.getStatus();
                    String applicationExitInfo = a10.toString();
                    String b = b(applicationExitInfo, "reason");
                    String b10 = b(applicationExitInfo, "subreason");
                    if (!b.equals("APPLICATION EXIT INFO FORMAT CHANGED") && !ActivityManager.isLowMemoryKillReportSupported() && reason == 2 && status == OsConstants.SIGKILL) {
                        b10 = "LOW_MEMORY";
                    }
                    arrayList.add(new ApplicationExitInfoCpp(a10.getPid(), status, a10.getTimestamp(), b, b10, a10.getDescription(), a10.getPss(), a10.getRss(), a10.getImportance()));
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static String b(String str, String str2) {
        String substring;
        int indexOf;
        if (!str2.equals("reason") && !str2.equals("subreason")) {
            return "INVALID USE OF FUNCTION";
        }
        int indexOf2 = str.indexOf(str2 + "=");
        if (indexOf2 == -1 || (indexOf = (substring = str.substring(indexOf2)).indexOf(") ")) == -1) {
            return "APPLICATION EXIT INFO FORMAT CHANGED";
        }
        String substring2 = substring.substring(0, indexOf);
        return substring2.indexOf(40) != -1 ? substring2.substring(substring2.indexOf(40) + 1) : "APPLICATION EXIT INFO FORMAT CHANGED";
    }

    public static void c(ApplicationExitInfo applicationExitInfo) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(RobloxTelemetryEventConfig.POINTS_BACKEND);
        arrayList.add(RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_universe_ID);
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_PLACE_ID);
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_PLACE_SESSION_ID);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new Pair("description", applicationExitInfo.getDescription()));
        arrayList3.add(new Pair("importance", String.valueOf(applicationExitInfo.getImportance())));
        arrayList3.add(new Pair("processName", applicationExitInfo.getProcessName()));
        String applicationExitInfo2 = applicationExitInfo.toString();
        String b = b(applicationExitInfo2, "reason");
        String b10 = b(applicationExitInfo2, "subreason");
        arrayList3.add(new Pair("reason", b));
        arrayList3.add(new Pair("subreason", b10));
        LoggingProtocol.j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(rh.h.a().N1()).setEventName("SkipInferredCrashEvent").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList2).setCustomStringFields(arrayList3).build()).build());
    }

    public static Boolean d(ApplicationExitInfo applicationExitInfo) {
        if (Build.VERSION.SDK_INT < 30) {
            return Boolean.FALSE;
        }
        for (String str : f36690a) {
            String processName = applicationExitInfo.getProcessName();
            if (processName.endsWith(str)) {
                ek.q.h("PreviousExitReasonHelper", "Skipping reporting inferred crash for process name " + processName);
                c(applicationExitInfo);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
