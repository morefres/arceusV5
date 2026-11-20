package z;

/* loaded from: classes.dex */
public class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37435a = new Object();
    public final a0.c0 b;

    /* renamed from: c, reason: collision with root package name */
    public int f37436c;

    public t3(a0.c0 c0Var, int i10) {
        this.b = c0Var;
        this.f37436c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f37435a) {
            i10 = this.f37436c;
        }
        return i10;
    }

    public void b(int i10) {
        synchronized (this.f37435a) {
            this.f37436c = i10;
        }
    }
}
