package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f7 extends x1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7094a;
    public final AtomicReferenceFieldUpdater b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7095c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7096d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7097e;

    public f7(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f7094a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.f7095c = atomicReferenceFieldUpdater3;
        this.f7096d = atomicReferenceFieldUpdater4;
        this.f7097e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void a(q9 q9Var, q9 q9Var2) {
        this.b.lazySet(q9Var, q9Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void b(q9 q9Var, Thread thread) {
        this.f7094a.lazySet(q9Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean c(s9 s9Var, k5 k5Var, k5 k5Var2) {
        return l6.a(this.f7096d, s9Var, k5Var, k5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean d(s9 s9Var, Object obj, Object obj2) {
        return l6.a(this.f7097e, s9Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean e(s9 s9Var, q9 q9Var, q9 q9Var2) {
        return l6.a(this.f7095c, s9Var, q9Var, q9Var2);
    }
}
