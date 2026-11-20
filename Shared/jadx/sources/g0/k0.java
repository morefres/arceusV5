package g0;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f17921c = new k0(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f17922d = new k0(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f17923e = new k0(2, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final k0 f17924f = new k0(3, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final k0 f17925g = new k0(4, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final k0 f17926h = new k0(5, 10);

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f17927i = new k0(6, 10);

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f17928j = new k0(6, 8);

    /* renamed from: a, reason: collision with root package name */
    public final int f17929a;
    public final int b;

    public k0(int i10, int i11) {
        this.f17929a = i10;
        this.b = i11;
    }

    public static String c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f17929a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f17929a == k0Var.b() && this.b == k0Var.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f17929a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f17929a) + ", bitDepth=" + this.b + "}";
    }
}
