package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(v3 v3Var, boolean z10) {
        super(v3Var, true);
        this.f6471e = z10;
        Objects.requireNonNull(v3Var);
        this.f6472f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6472f.m())).setDataCollectionEnabled(this.f6471e);
    }
}
