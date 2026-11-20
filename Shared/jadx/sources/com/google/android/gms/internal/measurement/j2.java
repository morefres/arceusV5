package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
public final class j2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6598h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v3 f6599i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(v3 v3Var, String str, String str2, Object obj, boolean z10) {
        super(v3Var, true);
        this.f6595e = str;
        this.f6596f = str2;
        this.f6597g = obj;
        this.f6598h = z10;
        Objects.requireNonNull(v3Var);
        this.f6599i = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6599i.m())).setUserProperty(this.f6595e, this.f6596f, y9.b.u2(this.f6597g), this.f6598h, this.f6600a);
    }
}
