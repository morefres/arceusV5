package td;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManager;

/* loaded from: classes2.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final ee.d0 f32123a;
    public final ee.d0 b;

    /* renamed from: c, reason: collision with root package name */
    public final ee.d0 f32124c;

    /* renamed from: d, reason: collision with root package name */
    public final ee.d0 f32125d;

    /* renamed from: e, reason: collision with root package name */
    public final ee.d0 f32126e;

    public /* synthetic */ l1(Context context, k1 k1Var) {
        h hVar;
        f1 f1Var;
        f1 f1Var2;
        ee.z b = ee.a0.b(context);
        this.f32123a = b;
        hVar = g.f32097a;
        ee.d0 b10 = ee.y.b(hVar);
        this.b = b10;
        f1Var = e1.f32094a;
        u uVar = new u(b, f1Var);
        this.f32124c = uVar;
        f1Var2 = e1.f32094a;
        ee.d0 b11 = ee.y.b(new o(b, b10, uVar, f1Var2));
        this.f32125d = b11;
        this.f32126e = ee.y.b(new f(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f32126e.a();
    }
}
