package wd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import xd.i;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f34193a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f34193a = new HashMap();
        new i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        synchronized (h.class) {
            map = f34193a;
            map.put("java", 20002);
        }
        return map;
    }
}
