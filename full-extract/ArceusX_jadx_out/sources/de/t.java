package de;

import ae.v0;
import be.y0;
import java.io.File;

/* loaded from: classes2.dex */
public final class t implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f14607a;
    public final y0 b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f14608c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f14609d;

    public t(y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4) {
        this.f14607a = y0Var;
        this.b = y0Var2;
        this.f14608c = y0Var3;
        this.f14609d = y0Var4;
    }

    @Override // be.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        return new a(((ae.k) this.f14607a).a(), (File) this.b.zza(), (v0) this.f14608c.zza(), be.v0.a(this.f14609d));
    }
}
