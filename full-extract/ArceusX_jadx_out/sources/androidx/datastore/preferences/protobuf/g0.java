package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 implements f0 {
    public static <E> z.f<E> d(Object obj, long j10) {
        return (z.f) q1.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, long j10) {
        d(obj, j10).j();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public <E> void b(Object obj, Object obj2, long j10) {
        z.f d10 = d(obj, j10);
        z.f d11 = d(obj2, j10);
        int size = d10.size();
        int size2 = d11.size();
        if (size > 0 && size2 > 0) {
            if (!d10.n()) {
                d10 = d10.o(size2 + size);
            }
            d10.addAll(d11);
        }
        if (size > 0) {
            d11 = d10;
        }
        q1.O(obj, j10, d11);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public <L> List<L> c(Object obj, long j10) {
        z.f d10 = d(obj, j10);
        if (d10.n()) {
            return d10;
        }
        int size = d10.size();
        z.f o8 = d10.o(size == 0 ? 10 : size * 2);
        q1.O(obj, j10, o8);
        return o8;
    }
}
