package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3 f6448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(v3 v3Var, Bundle bundle, r1 r1Var) {
        super(v3Var, true);
        this.f6446e = bundle;
        this.f6447f = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6448g = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6448g.m())).performAction(this.f6446e, this.f6447f, this.f6600a);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6447f.l(null);
    }
}
