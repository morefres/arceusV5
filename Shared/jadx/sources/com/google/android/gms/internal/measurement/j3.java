package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f6600a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6601c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v3 f6602d;

    public j3(v3 v3Var, boolean z10) {
        Objects.requireNonNull(v3Var);
        this.f6602d = v3Var;
        this.f6600a = v3Var.b.a();
        this.b = v3Var.b.b();
        this.f6601c = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6602d.l()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f6602d.j(e10, false, this.f6601c);
            b();
        }
    }
}
