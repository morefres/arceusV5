package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class e1 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f1972a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1973c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1974d;

    public e1(r0 r0Var, String str, Object[] objArr) {
        this.f1972a = r0Var;
        this.b = str;
        this.f1973c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f1974d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f1974d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public boolean a() {
        return (this.f1974d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public r0 b() {
        return this.f1972a;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public b1 c() {
        int i10 = this.f1974d;
        return (i10 & 1) != 0 ? b1.PROTO2 : (i10 & 4) == 4 ? b1.EDITIONS : b1.PROTO3;
    }

    public Object[] d() {
        return this.f1973c;
    }

    public String e() {
        return this.b;
    }
}
