package va;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {
    public static final Map b = new w1.a();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f33372a;

    public static synchronized void a() {
        synchronized (l.class) {
            Map map = b;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((l) it.next()).f33372a;
                throw null;
            }
            map.clear();
        }
    }
}
