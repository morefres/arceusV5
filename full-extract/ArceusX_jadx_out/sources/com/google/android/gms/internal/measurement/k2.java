package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6620f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(v3 v3Var, Bundle bundle) {
        super(v3Var, true);
        this.f6619e = bundle;
        Objects.requireNonNull(v3Var);
        this.f6620f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6620f.m())).setConditionalUserProperty(this.f6619e, this.f6600a);
    }
}
