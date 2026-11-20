package on;

/* loaded from: classes3.dex */
public class h extends a {

    /* renamed from: g, reason: collision with root package name */
    public String f27981g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f27982h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f27983i;

    /* renamed from: j, reason: collision with root package name */
    public int f27984j;

    /* renamed from: k, reason: collision with root package name */
    public String f27985k;

    /* renamed from: l, reason: collision with root package name */
    public String f27986l;

    public static void p(Integer num, Integer num2) {
        if (num != null && num2 != null && num2.intValue() < num.intValue()) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
    }

    @Override // on.s
    public void a(d0 d0Var) {
        d0Var.B(this);
    }

    public int q() {
        return this.f27984j;
    }

    public String r() {
        return this.f27985k;
    }

    public String s() {
        return this.f27986l;
    }

    public Integer t() {
        return this.f27982h;
    }

    public void u(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        p(this.f27982h, num);
        this.f27983i = num;
    }

    public void v(String str) {
        this.f27981g = str;
    }

    public void w(int i10) {
        this.f27984j = i10;
    }

    public void x(String str) {
        this.f27985k = str;
    }

    public void y(String str) {
        this.f27986l = str;
    }

    public void z(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        p(num, this.f27983i);
        this.f27982h = num;
    }
}
