package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class e1 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f8480a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f8481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8482d;

    public e1(s0 s0Var, String str, Object[] objArr) {
        this.f8480a = s0Var;
        this.b = str;
        this.f8481c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f8482d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f8482d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean a() {
        return (this.f8482d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public s0 b() {
        return this.f8480a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public b1 c() {
        int i10 = this.f8482d;
        return (i10 & 1) != 0 ? b1.PROTO2 : (i10 & 4) == 4 ? b1.EDITIONS : b1.PROTO3;
    }

    public Object[] d() {
        return this.f8481c;
    }

    public String e() {
        return this.b;
    }
}
