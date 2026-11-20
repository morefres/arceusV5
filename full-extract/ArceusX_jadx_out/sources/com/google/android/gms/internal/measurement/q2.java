package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class q2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(v3 v3Var, String str) {
        super(v3Var, true);
        this.f6794e = str;
        Objects.requireNonNull(v3Var);
        this.f6795f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6795f.m())).endAdUnitExposure(this.f6794e, this.b);
    }
}
