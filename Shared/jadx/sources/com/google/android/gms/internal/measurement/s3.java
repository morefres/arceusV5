package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u3 f6833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(u3 u3Var, Activity activity) {
        super(u3Var.f6870a, true);
        this.f6832e = activity;
        Objects.requireNonNull(u3Var);
        this.f6833f = u3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6833f.f6870a.m())).onActivityDestroyedByScionActivityInfo(zzdf.a(this.f6832e), this.b);
    }
}
