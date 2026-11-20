package he;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f19359a = Logger.getLogger(m.class.getName());
    public static final l b = b();

    public static final class b implements l {
        public b() {
        }
    }

    public static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    public static l b() {
        return new b();
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
