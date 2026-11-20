package on;

/* loaded from: classes3.dex */
public class v extends q {

    /* renamed from: h, reason: collision with root package name */
    public String f28008h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f28009i;

    @Override // on.s
    public void a(d0 d0Var) {
        d0Var.C(this);
    }

    public String r() {
        return this.f28008h;
    }

    public Integer s() {
        return this.f28009i;
    }

    @Deprecated
    public int t() {
        Integer num = this.f28009i;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void u(String str) {
        this.f28008h = str;
    }

    public void v(Integer num) {
        this.f28009i = num;
    }

    @Deprecated
    public void w(int i10) {
        this.f28009i = i10 != 0 ? Integer.valueOf(i10) : null;
    }
}
