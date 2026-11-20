package eo;

import android.content.Context;
import android.view.l0;
import java.util.Set;

/* loaded from: classes3.dex */
public final class f implements dt.d<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Set<d>> f16101a;
    public final dt.i<Context> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<l0> f16102c;

    public f(dt.i<Set<d>> iVar, dt.i<Context> iVar2, dt.i<l0> iVar3) {
        this.f16101a = iVar;
        this.b = iVar2;
        this.f16102c = iVar3;
    }

    public static f a(dt.i<Set<d>> iVar, dt.i<Context> iVar2, dt.i<l0> iVar3) {
        return new f(iVar, iVar2, iVar3);
    }

    public static e c(Set<d> set, Context context, l0 l0Var) {
        return new e(set, context, l0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f16101a.get(), this.b.get(), this.f16102c.get());
    }
}
