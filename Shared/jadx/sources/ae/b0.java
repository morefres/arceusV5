package ae;

import android.content.Context;

/* loaded from: classes2.dex */
public final class b0 implements be.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final be.y0 f410a;

    public b0(be.y0 y0Var) {
        this.f410a = y0Var;
    }

    @Override // be.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        Context a10 = ((k) this.f410a).a();
        return new a0(a10, a10.getPackageName());
    }
}
