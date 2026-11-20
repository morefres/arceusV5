package be;

/* loaded from: classes2.dex */
public final class v0 implements y0, u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4004c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile y0 f4005a;
    public volatile Object b = f4004c;

    public v0(y0 y0Var) {
        this.f4005a = y0Var;
    }

    public static u0 a(y0 y0Var) {
        return y0Var instanceof u0 ? (u0) y0Var : new v0(y0Var);
    }

    public static y0 b(y0 y0Var) {
        y0Var.getClass();
        return y0Var instanceof v0 ? y0Var : new v0(y0Var);
    }

    @Override // be.y0
    public final Object zza() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = f4004c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.f4005a.zza();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.f4005a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
