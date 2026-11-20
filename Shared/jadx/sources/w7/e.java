package w7;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f33807c = new e(null, null);

    /* renamed from: d, reason: collision with root package name */
    public static final e f33808d = new e(a.none, null);

    /* renamed from: e, reason: collision with root package name */
    public static final e f33809e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f33810f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f33811g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f33812h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f33813i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f33814j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f33815k;

    /* renamed from: a, reason: collision with root package name */
    public a f33816a;
    public b b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f33809e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f33810f = new e(aVar2, bVar);
        f33811g = new e(a.xMaxYMax, bVar);
        f33812h = new e(a.xMidYMin, bVar);
        f33813i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f33814j = new e(aVar, bVar2);
        f33815k = new e(aVar2, bVar2);
    }

    public e(a aVar, b bVar) {
        this.f33816a = aVar;
        this.b = bVar;
    }

    public a a() {
        return this.f33816a;
    }

    public b b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f33816a == eVar.f33816a && this.b == eVar.b;
    }

    public String toString() {
        return this.f33816a + " " + this.b;
    }
}
