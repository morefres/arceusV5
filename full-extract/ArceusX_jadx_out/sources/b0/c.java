package b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import g0.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Long, k0> f3623a;
    public static final Map<k0, List<Long>> b;

    static {
        HashMap hashMap = new HashMap();
        f3623a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        k0 k0Var = k0.f17922d;
        hashMap.put(1L, k0Var);
        hashMap2.put(k0Var, Collections.singletonList(1L));
        hashMap.put(2L, k0.f17924f);
        hashMap2.put((k0) hashMap.get(2L), Collections.singletonList(2L));
        k0 k0Var2 = k0.f17925g;
        hashMap.put(4L, k0Var2);
        hashMap2.put(k0Var2, Collections.singletonList(4L));
        k0 k0Var3 = k0.f17926h;
        hashMap.put(8L, k0Var3);
        hashMap2.put(k0Var3, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = asList.iterator();
        while (it.hasNext()) {
            f3623a.put(it.next(), k0.f17927i);
        }
        b.put(k0.f17927i, asList);
        List<Long> asList2 = Arrays.asList(Long.valueOf(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), 2048L, 256L, 512L);
        Iterator<Long> it2 = asList2.iterator();
        while (it2.hasNext()) {
            f3623a.put(it2.next(), k0.f17928j);
        }
        b.put(k0.f17928j, asList2);
    }

    public static Long a(k0 k0Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = b.get(k0Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static k0 b(long j10) {
        return f3623a.get(Long.valueOf(j10));
    }
}
