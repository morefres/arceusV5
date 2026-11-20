package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7371a;
    public x9 b;

    /* renamed from: c, reason: collision with root package name */
    public z9 f7372c = z9.j();

    /* renamed from: d, reason: collision with root package name */
    public boolean f7373d;

    public final void a() {
        this.f7371a = null;
        this.b = null;
        this.f7372c.e(null);
    }

    public final boolean b(Object obj) {
        this.f7373d = true;
        x9 x9Var = this.b;
        boolean z10 = x9Var != null && x9Var.c(obj);
        if (z10) {
            this.f7371a = null;
            this.b = null;
            this.f7372c = null;
        }
        return z10;
    }

    public final void finalize() {
        z9 z9Var;
        x9 x9Var = this.b;
        if (x9Var != null && !x9Var.isDone()) {
            x9Var.d(new u9("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f7371a))));
        }
        if (this.f7373d || (z9Var = this.f7372c) == null) {
            return;
        }
        z9Var.e(null);
    }
}
