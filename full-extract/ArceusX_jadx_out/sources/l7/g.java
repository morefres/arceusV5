package l7;

/* loaded from: classes3.dex */
public class g {
    public static final g b = new g();

    /* renamed from: a, reason: collision with root package name */
    public final w1.i<String, f7.i> f23271a = new w1.i<>(20);

    public static g b() {
        return b;
    }

    public f7.i a(String str) {
        if (str == null) {
            return null;
        }
        return this.f23271a.d(str);
    }

    public void c(String str, f7.i iVar) {
        if (str == null) {
            return;
        }
        this.f23271a.e(str, iVar);
    }
}
