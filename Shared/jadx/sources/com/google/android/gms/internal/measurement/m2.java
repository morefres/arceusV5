package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r1 f6665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v3 f6666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(v3 v3Var, String str, String str2, r1 r1Var) {
        super(v3Var, true);
        this.f6663e = str;
        this.f6664f = str2;
        this.f6665g = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6666h = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6666h.m())).getConditionalUserProperties(this.f6663e, this.f6664f, this.f6665g);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6665g.l(null);
    }
}
