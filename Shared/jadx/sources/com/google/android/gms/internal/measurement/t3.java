package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final y f6849a;
    public final u4 b;

    /* renamed from: c, reason: collision with root package name */
    public final u4 f6850c;

    /* renamed from: d, reason: collision with root package name */
    public final x7 f6851d;

    public t3() {
        y yVar = new y();
        this.f6849a = yVar;
        u4 u4Var = new u4(null, yVar);
        this.f6850c = u4Var;
        this.b = u4Var.c();
        x7 x7Var = new x7();
        this.f6851d = x7Var;
        u4Var.e("require", new eh(x7Var));
        x7Var.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.x2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new gh();
            }
        });
        u4Var.e("runtime.counter", new j(Double.valueOf(0.0d)));
    }

    public final q a(u4 u4Var, c8... c8VarArr) {
        q qVar = q.f6791yo;
        for (c8 c8Var : c8VarArr) {
            qVar = w6.b(c8Var);
            v5.l(this.f6850c);
            if ((qVar instanceof r) || (qVar instanceof p)) {
                qVar = this.f6849a.b(u4Var, qVar);
            }
        }
        return qVar;
    }
}
