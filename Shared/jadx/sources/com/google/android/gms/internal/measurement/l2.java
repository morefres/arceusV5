package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f6646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v3 f6647h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(v3 v3Var, String str, String str2, Bundle bundle) {
        super(v3Var, true);
        this.f6644e = str;
        this.f6645f = str2;
        this.f6646g = bundle;
        Objects.requireNonNull(v3Var);
        this.f6647h = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6647h.m())).clearConditionalUserProperty(this.f6644e, this.f6645f, this.f6646g);
    }
}
