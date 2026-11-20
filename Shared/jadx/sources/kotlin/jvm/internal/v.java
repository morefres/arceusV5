package kotlin.jvm.internal;

import gu.k;

/* loaded from: classes2.dex */
public abstract class v extends x implements gu.k {
    public v() {
    }

    @Override // gu.k
    public k.a c() {
        ((gu.k) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.d
    public gu.b computeReflected() {
        return d0.h(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return m(obj, obj2);
    }

    public v(Class cls, String str, String str2, int i10) {
        super(d.NO_RECEIVER, cls, str, str2, i10);
    }
}
