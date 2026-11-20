package android.view;

import android.view.d;
import android.view.l;

@Deprecated
/* loaded from: classes.dex */
public class i0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2594a;
    public final d.a b;

    public i0(Object obj) {
        this.f2594a = obj;
        this.b = d.f2575c.c(obj.getClass());
    }

    @Override // android.view.p
    public void f(s sVar, l.a aVar) {
        this.b.a(sVar, aVar, this.f2594a);
    }
}
