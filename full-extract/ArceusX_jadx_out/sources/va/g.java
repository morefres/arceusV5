package va;

import android.content.ContentResolver;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {
    public static final Map b = new w1.a();

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f33361c = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f33362a;

    public static synchronized void a() {
        synchronized (g.class) {
            Map map = b;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                ContentResolver contentResolver = ((g) it.next()).f33362a;
                throw null;
            }
            map.clear();
        }
    }
}
