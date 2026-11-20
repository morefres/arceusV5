package ln;

/* loaded from: classes3.dex */
public class d extends rn.f {

    /* renamed from: a, reason: collision with root package name */
    public final rn.d[] f23557a;
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f23558c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23559d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f23560e = 0;

    public d(rn.d... dVarArr) {
        this.f23557a = dVarArr;
    }

    @Override // rn.f
    public rn.f a(int i10) {
        this.f23558c = i10;
        return this;
    }

    @Override // rn.f
    public rn.f b(int i10) {
        this.b = i10;
        return this;
    }

    @Override // rn.f
    public rn.f e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f23560e = i10;
        return this;
    }

    public rn.d[] f() {
        return this.f23557a;
    }

    public int g() {
        return this.f23558c;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.f23560e;
    }

    public boolean j() {
        return this.f23559d;
    }
}
