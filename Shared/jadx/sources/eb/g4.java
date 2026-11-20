package eb;

/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public final byte f15789a;
    public final byte b;

    public g4(int i10) {
        this.f15789a = (byte) (i10 & 224);
        this.b = (byte) (i10 & 31);
    }

    public final byte a() {
        return this.b;
    }

    public final byte b() {
        return this.f15789a;
    }

    public final int c() {
        return (this.f15789a >> 5) & 7;
    }
}
