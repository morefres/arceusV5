package ie;

/* loaded from: classes2.dex */
public final class r0<E> extends w<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f20887h;

    /* renamed from: i, reason: collision with root package name */
    public static final r0<Object> f20888i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f20889c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f20890d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f20891e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f20892f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f20893g;

    static {
        Object[] objArr = new Object[0];
        f20887h = objArr;
        f20888i = new r0<>(objArr, 0, objArr, 0, 0);
    }

    public r0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f20889c = objArr;
        this.f20890d = i10;
        this.f20891e = objArr2;
        this.f20892f = i11;
        this.f20893g = i12;
    }

    @Override // ie.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f20889c, 0, objArr, i10, this.f20893g);
        return i10 + this.f20893g;
    }

    @Override // ie.r
    public Object[] c() {
        return this.f20889c;
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f20891e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = p.c(obj);
        while (true) {
            int i10 = c10 & this.f20892f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    @Override // ie.r
    public int d() {
        return this.f20893g;
    }

    @Override // ie.r
    public int e() {
        return 0;
    }

    @Override // ie.r
    public boolean f() {
        return false;
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public y0<E> iterator() {
        return a().iterator();
    }

    @Override // ie.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f20890d;
    }

    @Override // ie.w
    public t<E> m() {
        return t.i(this.f20889c, this.f20893g);
    }

    @Override // ie.w
    public boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f20893g;
    }
}
