package u9;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f32656a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
