package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7014g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r1 f7015h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v3 f7016i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(v3 v3Var, String str, String str2, boolean z10, r1 r1Var) {
        super(v3Var, true);
        this.f7012e = str;
        this.f7013f = str2;
        this.f7014g = z10;
        this.f7015h = r1Var;
        Objects.requireNonNull(v3Var);
        this.f7016i = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f7016i.m())).getUserProperties(this.f7012e, this.f7013f, this.f7014g, this.f7015h);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f7015h.l(null);
    }
}
