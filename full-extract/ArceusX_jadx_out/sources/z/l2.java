package z;

import android.content.Context;
import android.media.CamcorderProfile;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n0.SurfaceConfig;
import n0.SurfaceStreamSpecQueryResult;

/* loaded from: classes.dex */
public final class l2 implements n0.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37293a;
    public final Map<String, g5> b;

    /* renamed from: c, reason: collision with root package name */
    public final g f37294c;

    /* renamed from: d, reason: collision with root package name */
    public final a0.p0 f37295d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f37296e;

    public class a implements g {
        @Override // z.g
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // z.g
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public l2(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    @Override // n0.m0
    public SurfaceConfig b(int i10, String str, int i11, Size size, n0.u3 u3Var) {
        g5 g5Var = this.b.get(str);
        x2.g.b(g5Var != null, "No such camera id in supported combination list: " + str);
        return g5Var.a0(i10, i11, size, u3Var);
    }

    @Override // n0.l2
    public void f(List<String> list) {
        HashSet<String> hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.f37293a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                hashMap.put(str, i(str));
            }
            synchronized (this.f37293a) {
                try {
                    HashMap hashMap2 = new HashMap();
                    for (String str2 : list) {
                        if (this.b.containsKey(str2)) {
                            hashMap2.put(str2, this.b.get(str2));
                        } else {
                            hashMap2.put(str2, (g5) hashMap.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(hashMap2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (g0.x | RuntimeException e10) {
            throw new n0.i1("Failed to create SupportedSurfaceCombination", e10);
        }
    }

    @Override // n0.m0
    public SurfaceStreamSpecQueryResult g(int i10, String str, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, boolean z10, boolean z11, boolean z12, boolean z13) {
        x2.g.b(!map.isEmpty(), "No new use cases to be bound.");
        g5 g5Var = this.b.get(str);
        x2.g.b(g5Var != null, "No such camera id in supported combination list: " + str);
        return g5Var.K(i10, list, map, z10, z11, z12, z13);
    }

    public final g5 i(String str) {
        j0.a aVar = j0.a.b;
        if (Build.VERSION.SDK_INT >= 35) {
            aVar = new y.m(this.f37296e, str, this.f37295d);
        }
        return new g5(this.f37296e, str, this.f37295d, this.f37294c, aVar);
    }

    public l2(Context context, g gVar, Object obj, Set<String> set) {
        this.f37293a = new Object();
        this.b = new HashMap();
        x2.g.g(gVar);
        this.f37294c = gVar;
        this.f37296e = context;
        if (obj instanceof a0.p0) {
            this.f37295d = (a0.p0) obj;
        } else {
            this.f37295d = a0.p0.a(context);
        }
        try {
            f(new ArrayList(set));
        } catch (n0.i1 e10) {
            if (!(e10.getCause() instanceof g0.x)) {
                throw new g0.x(3, e10);
            }
            throw ((g0.x) e10.getCause());
        }
    }
}
