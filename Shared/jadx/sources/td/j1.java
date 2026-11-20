package td;

import android.content.Context;

/* loaded from: classes2.dex */
public final class j1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public Context f32114a;

    public /* synthetic */ j1(i1 i1Var) {
    }

    public final j1 a(Context context) {
        context.getClass();
        this.f32114a = context;
        return this;
    }

    @Override // td.q1
    public final l1 b() {
        ee.c0.a(this.f32114a, Context.class);
        return new l1(this.f32114a, null);
    }
}
