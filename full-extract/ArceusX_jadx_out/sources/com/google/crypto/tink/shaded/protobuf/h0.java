package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.List;

/* loaded from: classes2.dex */
public final class h0 implements g0 {
    public static <E> a0.i<E> d(Object obj, long j10) {
        return (a0.i) q1.C(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public void a(Object obj, long j10) {
        d(obj, j10).j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public <E> void b(Object obj, Object obj2, long j10) {
        a0.i d10 = d(obj, j10);
        a0.i d11 = d(obj2, j10);
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
        q1.R(obj, j10, d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public <L> List<L> c(Object obj, long j10) {
        a0.i d10 = d(obj, j10);
        if (d10.n()) {
            return d10;
        }
        int size = d10.size();
        a0.i o8 = d10.o(size == 0 ? 10 : size * 2);
        q1.R(obj, j10, o8);
        return o8;
    }
}
