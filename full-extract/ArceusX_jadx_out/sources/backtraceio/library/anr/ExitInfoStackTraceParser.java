package backtraceio.library.anr;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ExitInfoStackTraceParser {
    private static final Pattern JAVA_FRAME_PATTERN = Pattern.compile("\\s*at (.*?)\\((.*?):(\\d+)\\)");
    private static final String MAIN_THREAD_NAME = "main";
    private static final int NATIVE_STACK_ELEMENTS_NUMBER = 6;

    private static Map<String, Object> getMainThreadInfo(List<Map<String, Object>> list) {
        for (Map<String, Object> map : list) {
            if (map.get("name").equals(MAIN_THREAD_NAME)) {
                return map;
            }
        }
        return null;
    }

    public static Map<String, Object> parseANRStackTrace(String str) {
        HashMap hashMap = new HashMap();
        if (str != null && !str.isEmpty()) {
            hashMap.put("timestamp", parseTimestamp(str));
            Matcher matcher = Pattern.compile("----- pid (\\d+) at").matcher(str);
            if (matcher.find()) {
                hashMap.put("pid", Integer.valueOf(Integer.parseInt(matcher.group(1))));
            }
            Matcher matcher2 = Pattern.compile("Cmd line: (.*)").matcher(str);
            if (matcher2.find()) {
                hashMap.put("command_line", matcher2.group(1));
            }
            Matcher matcher3 = Pattern.compile("Build fingerprint: '(.*?)'").matcher(str);
            if (matcher3.find()) {
                hashMap.put("build_fingerprint", matcher3.group(1));
            }
            Matcher matcher4 = Pattern.compile("ABI: '(.*?)'").matcher(str);
            if (matcher4.find()) {
                hashMap.put("abi", matcher4.group(1));
            }
            Matcher matcher5 = Pattern.compile("Build type: (.*)").matcher(str);
            if (matcher5.find()) {
                hashMap.put("build_type", matcher5.group(1));
            }
            Matcher matcher6 = Pattern.compile("Heap: (.*)").matcher(str);
            if (matcher6.find()) {
                hashMap.put("heap_info", matcher6.group(1));
            }
            List<Map<String, Object>> parseThreadDumps = parseThreadDumps(str);
            hashMap.put("threads", parseThreadDumps);
            hashMap.put("main_thread", getMainThreadInfo(parseThreadDumps));
        }
        return hashMap;
    }

    public static StackTraceElement parseFrame(String str) {
        StackTraceElement parseJavaFrame = parseJavaFrame(str);
        return parseJavaFrame != null ? parseJavaFrame : parseNativeFrame(str);
    }

    public static StackTraceElement parseJavaFrame(String str) {
        Matcher matcher = JAVA_FRAME_PATTERN.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        int parseInt = Integer.parseInt(matcher.group(3));
        int lastIndexOf = group.lastIndexOf(46);
        return new StackTraceElement(lastIndexOf == -1 ? group : group.substring(0, lastIndexOf), lastIndexOf == -1 ? "" : group.substring(lastIndexOf + 1), group2, parseInt);
    }

    public static StackTraceElement[] parseMainThreadStackTrace(Map<String, Object> map) {
        Map map2 = (Map) map.get("main_thread");
        if (map2 == null) {
            return new StackTraceElement[0];
        }
        List list = (List) map2.get("stack_trace");
        if (list == null) {
            return new StackTraceElement[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StackTraceElement parseFrame = parseFrame((String) it.next());
            if (parseFrame != null) {
                arrayList.add(parseFrame);
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static StackTraceElement parseNativeFrame(String str) {
        if (!str.startsWith("native")) {
            return null;
        }
        String[] split = str.split("\\s+", 6);
        if (split.length < 6) {
            return null;
        }
        String str2 = split[3];
        return new StackTraceElement(split[4], split[5], "address: " + str2, 0);
    }

    public static List<Map<String, Object>> parseThreadDumps(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("\\\"(.*?)\\\" (daemon )?prio=(\\d+) tid=(\\d+) (\\w+)(.*)\\n(?s)((.*?\\n))(?=(?:\\n\\n)|$)", 8).matcher(str);
        while (matcher.find()) {
            arrayList.add(parseThreadInformation(matcher.group()));
        }
        return arrayList;
    }

    private static Map<String, Object> parseThreadInformation(String str) {
        HashMap hashMap = new HashMap();
        Matcher matcher = Pattern.compile("\"([^\"]+)\"\\s*(daemon)?\\s*prio=(\\d+)\\s*tid=(\\d+)\\s*([^\\n]+)").matcher(str);
        if (matcher.find()) {
            hashMap.put("name", matcher.group(1));
            hashMap.put("isDaemon", Boolean.valueOf(matcher.group(2) != null));
            hashMap.put("prio", Integer.valueOf(Integer.parseInt(matcher.group(3))));
            hashMap.put("tid", Integer.valueOf(Integer.parseInt(matcher.group(4))));
            hashMap.put(NotificationCompat.CATEGORY_STATUS, matcher.group(5).trim());
        }
        hashMap.put("stack_trace", parseThreadStackTrace(str));
        return hashMap;
    }

    @NonNull
    private static List<String> parseThreadStackTrace(String str) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (String str2 : str.split("\n")) {
            String trim = str2.trim();
            if (z10 && (trim.isEmpty() || trim.startsWith("\""))) {
                break;
            }
            if (!trim.isEmpty() && !trim.startsWith("\"") && (trim.startsWith("at ") || trim.startsWith("native:"))) {
                arrayList.add(trim);
                z10 = true;
            }
        }
        return arrayList;
    }

    private static Object parseTimestamp(String str) {
        Matcher matcher = Pattern.compile("----- pid \\d+ at (.*?) -----").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
