package kotlin.jvm.internal;

import gu.j;

/* loaded from: classes2.dex */
public abstract class n extends p implements gu.h {
    public n() {
    }

    @Override // gu.j
    public j.a c() {
        ((gu.h) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.d
    public gu.b computeReflected() {
        return d0.d(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
