package ee;

/* loaded from: classes2.dex */
public final class y implements d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16012c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile d0 f16013a;
    public volatile Object b = f16012c;

    public y(d0 d0Var) {
        this.f16013a = d0Var;
    }

    public static d0 b(d0 d0Var) {
        return d0Var instanceof y ? d0Var : new y(d0Var);
    }

    @Override // ee.e0
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = f16012c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.f16013a.a();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.f16013a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
