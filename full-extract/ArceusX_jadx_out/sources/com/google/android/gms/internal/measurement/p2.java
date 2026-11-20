package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(v3 v3Var, String str) {
        super(v3Var, true);
        this.f6770e = str;
        Objects.requireNonNull(v3Var);
        this.f6771f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6771f.m())).beginAdUnitExposure(this.f6770e, this.b);
    }
}
