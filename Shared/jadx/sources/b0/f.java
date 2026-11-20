package b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import b0.e;
import g0.k0;
import g0.r1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class f implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f3625a;

    public f(Object obj) {
        this.f3625a = (DynamicRangeProfiles) obj;
    }

    public static Set<k0> e(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            k0 f10 = f(it.next().longValue());
            if (f10 != null) {
                hashSet.add(f10);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static k0 f(long j10) {
        k0 b = c.b(j10);
        if (b == null) {
            r1.l("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
        }
        return b;
    }

    @Override // b0.e.a
    public DynamicRangeProfiles a() {
        return this.f3625a;
    }

    public final Long b(k0 k0Var) {
        return c.a(k0Var, this.f3625a);
    }

    @Override // b0.e.a
    public Set<k0> c() {
        return e(this.f3625a.getSupportedProfiles());
    }

    @Override // b0.e.a
    public Set<k0> d(k0 k0Var) {
        Long b = b(k0Var);
        x2.g.b(b != null, "DynamicRange is not supported: " + k0Var);
        return e(this.f3625a.getProfileCaptureRequestConstraints(b.longValue()));
    }
}
