package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3 f6419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(v3 v3Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(v3Var, false);
        this.f6417e = str;
        this.f6418f = obj;
        Objects.requireNonNull(v3Var);
        this.f6419g = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6419g.m())).logHealthData(5, this.f6417e, y9.b.u2(this.f6418f), y9.b.u2(null), y9.b.u2(null));
    }
}
