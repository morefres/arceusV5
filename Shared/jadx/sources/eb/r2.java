package eb;

/* loaded from: classes.dex */
public final class r2 extends t2 {

    /* renamed from: i, reason: collision with root package name */
    public final char[] f15888i;

    public r2(q2 q2Var) {
        super(q2Var, null);
        char[] cArr;
        this.f15888i = new char[512];
        cArr = q2Var.b;
        n0.c(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f15888i[i10] = q2Var.a(i10 >>> 4);
            this.f15888i[i10 | 256] = q2Var.a(i10 & 15);
        }
    }

    @Override // eb.t2, eb.u2
    public final void a(Appendable appendable, byte[] bArr, int i10, int i11) {
        n0.e(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.f15888i[i13]);
            appendable.append(this.f15888i[i13 | 256]);
        }
    }

    @Override // eb.t2
    public final u2 f(q2 q2Var, Character ch2) {
        return new r2(q2Var);
    }

    public r2(String str, String str2) {
        this(new q2("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
