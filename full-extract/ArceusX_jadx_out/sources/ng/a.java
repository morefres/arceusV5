package ng;

import com.google.mlkit.common.MlKitException;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f27080h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f27081i = new a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f27082j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f27083k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f27084l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f27085m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f27086n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f27087o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f27088a;
    public final int[] b;

    /* renamed from: c, reason: collision with root package name */
    public final b f27089c;

    /* renamed from: d, reason: collision with root package name */
    public final b f27090d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27091e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27092f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27093g;

    static {
        a aVar = new a(67, 64, 1);
        f27082j = aVar;
        f27083k = new a(19, 16, 1);
        f27084l = new a(285, 256, 0);
        a aVar2 = new a(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 256, 1);
        f27085m = aVar2;
        f27086n = aVar2;
        f27087o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f27092f = i10;
        this.f27091e = i11;
        this.f27093g = i12;
        this.f27088a = new int[i11];
        this.b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f27088a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.b[this.f27088a[i15]] = i15;
        }
        this.f27089c = new b(this, new int[]{0});
        this.f27090d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f27089c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public int c(int i10) {
        return this.f27088a[i10];
    }

    public int d() {
        return this.f27093g;
    }

    public b e() {
        return this.f27089c;
    }

    public int f(int i10) {
        if (i10 != 0) {
            return this.f27088a[(this.f27091e - this.b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f27088a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f27091e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f27092f) + ',' + this.f27091e + ')';
    }
}
