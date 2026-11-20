package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i3 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f6532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f6535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6536i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6537j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f6538k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(v3 v3Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(v3Var, true);
        this.f6532e = l10;
        this.f6533f = str;
        this.f6534g = str2;
        this.f6535h = bundle;
        this.f6536i = z10;
        this.f6537j = z11;
        Objects.requireNonNull(v3Var);
        this.f6538k = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        Long l10 = this.f6532e;
        ((u1) n9.m.l(this.f6538k.m())).logEvent(this.f6533f, this.f6534g, this.f6535h, this.f6536i, this.f6537j, l10 == null ? this.f6600a : l10.longValue());
    }
}
