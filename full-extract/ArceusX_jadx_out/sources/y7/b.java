package y7;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f36523a;

    public b(Integer num) {
        this.f36523a = num;
    }

    @Override // y7.f
    public Integer a() {
        return this.f36523a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.f36523a;
        Integer a10 = ((f) obj).a();
        return num == null ? a10 == null : num.equals(a10);
    }

    public int hashCode() {
        Integer num = this.f36523a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f36523a + "}";
    }
}
