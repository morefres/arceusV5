package kp;

import androidx.activity.result.IntentSenderRequest;

/* loaded from: classes3.dex */
public final class f0 implements dt.d<g.c<IntentSenderRequest>> {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f23122a;

    public f0(c0 c0Var) {
        this.f23122a = c0Var;
    }

    public static f0 a(c0 c0Var) {
        return new f0(c0Var);
    }

    public static g.c<IntentSenderRequest> c(c0 c0Var) {
        return (g.c) dt.h.e(c0Var.a());
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<IntentSenderRequest> get() {
        return c(this.f23122a);
    }
}
