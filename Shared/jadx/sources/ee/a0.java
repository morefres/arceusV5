package ee;

/* loaded from: classes2.dex */
public final class a0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15975a;

    public a0(Object obj) {
        this.f15975a = obj;
    }

    public static z b(Object obj) {
        if (obj != null) {
            return new a0(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // ee.e0
    public final Object a() {
        return this.f15975a;
    }
}
