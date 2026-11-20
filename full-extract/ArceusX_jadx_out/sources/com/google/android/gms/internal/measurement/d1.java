package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final t3 f6458a;
    public u4 b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6459c;

    /* renamed from: d, reason: collision with root package name */
    public final hh f6460d;

    public d1() {
        t3 t3Var = new t3();
        this.f6458a = t3Var;
        this.b = t3Var.b.c();
        this.f6459c = new c();
        this.f6460d = new hh();
        t3Var.f6851d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.c0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return d1.this.g();
            }
        });
        t3Var.f6851d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new y8(d1.this.f6459c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f6458a.f6851d.a(str, callable);
    }

    public final boolean b(b bVar) {
        try {
            c cVar = this.f6459c;
            cVar.b(bVar);
            this.f6458a.f6850c.e("runtime.counter", new j(Double.valueOf(0.0d)));
            this.f6460d.b(this.b.c(), cVar);
            if (c()) {
                return true;
            }
            return d();
        } catch (Throwable th2) {
            throw new d2(th2);
        }
    }

    public final boolean c() {
        c cVar = this.f6459c;
        return !cVar.c().equals(cVar.a());
    }

    public final boolean d() {
        return !this.f6459c.f().isEmpty();
    }

    public final c e() {
        return this.f6459c;
    }

    public final void f(y7 y7Var) {
        k kVar;
        try {
            t3 t3Var = this.f6458a;
            this.b = t3Var.b.c();
            if (t3Var.a(this.b, (c8[]) y7Var.F().toArray(new c8[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (v7 v7Var : y7Var.G().F()) {
                List G = v7Var.G();
                String F = v7Var.F();
                Iterator it = G.iterator();
                while (it.hasNext()) {
                    q a10 = t3Var.a(this.b, (c8) it.next());
                    if (!(a10 instanceof n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    u4 u4Var = this.b;
                    if (u4Var.d(F)) {
                        q h10 = u4Var.h(F);
                        if (!(h10 instanceof k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(F)));
                        }
                        kVar = (k) h10;
                    } else {
                        kVar = null;
                    }
                    if (kVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(F)));
                    }
                    kVar.h(this.b, Collections.singletonList(a10));
                }
            }
        } catch (Throwable th2) {
            throw new d2(th2);
        }
    }

    public final /* synthetic */ k g() {
        return new dh(this.f6460d);
    }
}
