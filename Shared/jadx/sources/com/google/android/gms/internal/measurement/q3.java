package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u3 f6797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(u3 u3Var, Activity activity) {
        super(u3Var.f6870a, true);
        this.f6796e = activity;
        Objects.requireNonNull(u3Var);
        this.f6797f = u3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6797f.f6870a.m())).onActivityStoppedByScionActivityInfo(zzdf.a(this.f6796e), this.b);
    }
}
