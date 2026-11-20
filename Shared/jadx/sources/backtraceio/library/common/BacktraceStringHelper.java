package backtraceio.library.common;

/* loaded from: classes.dex */
public class BacktraceStringHelper {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isObjectNotNullOrNotEmptyString(Object obj) {
        return obj instanceof String ? !obj.toString().trim().isEmpty() : obj != null;
    }
}
