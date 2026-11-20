package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u3 f6807g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(u3 u3Var, Activity activity, r1 r1Var) {
        super(u3Var.f6870a, true);
        this.f6805e = activity;
        this.f6806f = r1Var;
        Objects.requireNonNull(u3Var);
        this.f6807g = u3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6807g.f6870a.m())).onActivitySaveInstanceStateByScionActivityInfo(zzdf.a(this.f6805e), this.f6806f, this.b);
    }
}
