package kotlin.jvm.internal;

import gu.j;

/* loaded from: classes2.dex */
public abstract class t extends x implements gu.j {
    public t() {
    }

    @Override // gu.j
    public j.a c() {
        ((gu.j) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.d
    public gu.b computeReflected() {
        return d0.g(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
