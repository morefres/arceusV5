package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3 f6463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(v3 v3Var, String str, r1 r1Var) {
        super(v3Var, true);
        this.f6461e = str;
        this.f6462f = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6463g = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6463g.m())).getMaxUserProperties(this.f6461e, this.f6462f);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6462f.l(null);
    }
}
