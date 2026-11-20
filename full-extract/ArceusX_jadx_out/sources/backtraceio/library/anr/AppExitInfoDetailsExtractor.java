package backtraceio.library.anr;

import backtraceio.library.logger.BacktraceLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppExitInfoDetailsExtractor {
    private static final String LOG_TAG = "AppExitInfoDetailsExtractor";

    public static HashMap<String, Object> getANRAttributes(ExitInfo exitInfo) {
        if (exitInfo == null) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("description", exitInfo.getDescription());
        hashMap.put("timestamp", getANRTimestamp(exitInfo));
        hashMap.put("reason-code", Integer.valueOf(exitInfo.getReason()));
        hashMap.put("reason", reasonCodeToDescription(exitInfo.getReason()));
        hashMap.put("PID", Integer.valueOf(exitInfo.getPid()));
        hashMap.put("Importance", Integer.valueOf(exitInfo.getImportance()));
        hashMap.put("PSS", Long.valueOf(exitInfo.getPss()));
        hashMap.put("RSS", Long.valueOf(exitInfo.getRss()));
        return hashMap;
    }

    public static String getANRMessage(ExitInfo exitInfo) {
        return "Application Not Responding | Description: " + exitInfo.getDescription() + " | Timestamp: " + getANRTimestamp(exitInfo);
    }

    private static String getANRTimestamp(ExitInfo exitInfo) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(exitInfo.getTimestamp()));
    }

    public static String getStackTraceInfo(ExitInfo exitInfo) {
        InputStream streamOrNull = getStreamOrNull(exitInfo);
        if (streamOrNull == null) {
            BacktraceLogger.w(LOG_TAG, "Unexpected null trace stream");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamOrNull));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return sb2.toString();
                    }
                    sb2.append(readLine);
                    sb2.append("\n");
                } finally {
                }
            }
        } catch (Exception e10) {
            BacktraceLogger.e(LOG_TAG, "Unexpected exception on getting stacktrace from exitInfo", e10);
            return "";
        }
    }

    private static InputStream getStreamOrNull(ExitInfo exitInfo) {
        try {
            return exitInfo.getTraceInputStream();
        } catch (IOException unused) {
            return null;
        }
    }

    private static String reasonCodeToDescription(int i10) {
        return i10 == 6 ? "anr" : "unsupported code";
    }
}
