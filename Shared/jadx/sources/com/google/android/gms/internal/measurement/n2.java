package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzdf f6724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v3 f6727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(v3 v3Var, zzdf zzdfVar, String str, String str2) {
        super(v3Var, true);
        this.f6724e = zzdfVar;
        this.f6725f = str;
        this.f6726g = str2;
        Objects.requireNonNull(v3Var);
        this.f6727h = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6727h.m())).setCurrentScreenByScionActivityInfo(this.f6724e, this.f6725f, this.f6726g, this.f6600a);
    }
}
