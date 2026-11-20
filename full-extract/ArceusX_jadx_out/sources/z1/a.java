package z1;

import java.util.Arrays;
import z1.b;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    public static float f37657l = 0.001f;
    public final b b;

    /* renamed from: c, reason: collision with root package name */
    public final c f37659c;

    /* renamed from: a, reason: collision with root package name */
    public int f37658a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f37660d = 8;

    /* renamed from: e, reason: collision with root package name */
    public i f37661e = null;

    /* renamed from: f, reason: collision with root package name */
    public int[] f37662f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public int[] f37663g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    public float[] f37664h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    public int f37665i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f37666j = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37667k = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.f37659c = cVar;
    }

    @Override // z1.b.a
    public final float a(i iVar) {
        int i10 = this.f37665i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37658a; i11++) {
            if (this.f37662f[i10] == iVar.f37712c) {
                return this.f37664h[i10];
            }
            i10 = this.f37663g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public i b(int i10) {
        int i11 = this.f37665i;
        for (int i12 = 0; i11 != -1 && i12 < this.f37658a; i12++) {
            if (i12 == i10) {
                return this.f37659c.f37675d[this.f37662f[i11]];
            }
            i11 = this.f37663g[i11];
        }
        return null;
    }

    @Override // z1.b.a
    public final void c(i iVar, float f10) {
        if (f10 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i10 = this.f37665i;
        if (i10 == -1) {
            this.f37665i = 0;
            this.f37664h[0] = f10;
            this.f37662f[0] = iVar.f37712c;
            this.f37663g[0] = -1;
            iVar.f37722m++;
            iVar.a(this.b);
            this.f37658a++;
            if (this.f37667k) {
                return;
            }
            int i11 = this.f37666j + 1;
            this.f37666j = i11;
            int[] iArr = this.f37662f;
            if (i11 >= iArr.length) {
                this.f37667k = true;
                this.f37666j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f37658a; i13++) {
            int i14 = this.f37662f[i10];
            int i15 = iVar.f37712c;
            if (i14 == i15) {
                this.f37664h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f37663g[i10];
        }
        int i16 = this.f37666j;
        int i17 = i16 + 1;
        if (this.f37667k) {
            int[] iArr2 = this.f37662f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f37662f;
        if (i16 >= iArr3.length && this.f37658a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f37662f;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f37662f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f37660d * 2;
            this.f37660d = i19;
            this.f37667k = false;
            this.f37666j = i16 - 1;
            this.f37664h = Arrays.copyOf(this.f37664h, i19);
            this.f37662f = Arrays.copyOf(this.f37662f, this.f37660d);
            this.f37663g = Arrays.copyOf(this.f37663g, this.f37660d);
        }
        this.f37662f[i16] = iVar.f37712c;
        this.f37664h[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f37663g;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f37663g[i16] = this.f37665i;
            this.f37665i = i16;
        }
        iVar.f37722m++;
        iVar.a(this.b);
        int i20 = this.f37658a + 1;
        this.f37658a = i20;
        if (!this.f37667k) {
            this.f37666j++;
        }
        int[] iArr7 = this.f37662f;
        if (i20 >= iArr7.length) {
            this.f37667k = true;
        }
        if (this.f37666j >= iArr7.length) {
            this.f37667k = true;
            this.f37666j = iArr7.length - 1;
        }
    }

    @Override // z1.b.a
    public final void clear() {
        int i10 = this.f37665i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37658a; i11++) {
            i iVar = this.f37659c.f37675d[this.f37662f[i10]];
            if (iVar != null) {
                iVar.d(this.b);
            }
            i10 = this.f37663g[i10];
        }
        this.f37665i = -1;
        this.f37666j = -1;
        this.f37667k = false;
        this.f37658a = 0;
    }

    @Override // z1.b.a
    public void d() {
        int i10 = this.f37665i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37658a; i11++) {
            float[] fArr = this.f37664h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f37663g[i10];
        }
    }

    @Override // z1.b.a
    public float e(b bVar, boolean z10) {
        float a10 = a(bVar.f37668a);
        j(bVar.f37668a, z10);
        b.a aVar = bVar.f37671e;
        int h10 = aVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            i b = aVar.b(i10);
            f(b, aVar.a(b) * a10, z10);
        }
        return a10;
    }

    @Override // z1.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f37657l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f37665i;
            if (i10 == -1) {
                this.f37665i = 0;
                this.f37664h[0] = f10;
                this.f37662f[0] = iVar.f37712c;
                this.f37663g[0] = -1;
                iVar.f37722m++;
                iVar.a(this.b);
                this.f37658a++;
                if (this.f37667k) {
                    return;
                }
                int i11 = this.f37666j + 1;
                this.f37666j = i11;
                int[] iArr = this.f37662f;
                if (i11 >= iArr.length) {
                    this.f37667k = true;
                    this.f37666j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f37658a; i13++) {
                int i14 = this.f37662f[i10];
                int i15 = iVar.f37712c;
                if (i14 == i15) {
                    float[] fArr = this.f37664h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f37657l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f37665i) {
                            this.f37665i = this.f37663g[i10];
                        } else {
                            int[] iArr2 = this.f37663g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.d(this.b);
                        }
                        if (this.f37667k) {
                            this.f37666j = i10;
                        }
                        iVar.f37722m--;
                        this.f37658a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f37663g[i10];
            }
            int i16 = this.f37666j;
            int i17 = i16 + 1;
            if (this.f37667k) {
                int[] iArr3 = this.f37662f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f37662f;
            if (i16 >= iArr4.length && this.f37658a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f37662f;
                    if (i18 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    }
                    i18++;
                }
            }
            int[] iArr6 = this.f37662f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f37660d * 2;
                this.f37660d = i19;
                this.f37667k = false;
                this.f37666j = i16 - 1;
                this.f37664h = Arrays.copyOf(this.f37664h, i19);
                this.f37662f = Arrays.copyOf(this.f37662f, this.f37660d);
                this.f37663g = Arrays.copyOf(this.f37663g, this.f37660d);
            }
            this.f37662f[i16] = iVar.f37712c;
            this.f37664h[i16] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f37663g;
                iArr7[i16] = iArr7[i12];
                iArr7[i12] = i16;
            } else {
                this.f37663g[i16] = this.f37665i;
                this.f37665i = i16;
            }
            iVar.f37722m++;
            iVar.a(this.b);
            this.f37658a++;
            if (!this.f37667k) {
                this.f37666j++;
            }
            int i20 = this.f37666j;
            int[] iArr8 = this.f37662f;
            if (i20 >= iArr8.length) {
                this.f37667k = true;
                this.f37666j = iArr8.length - 1;
            }
        }
    }

    @Override // z1.b.a
    public boolean g(i iVar) {
        int i10 = this.f37665i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f37658a; i11++) {
            if (this.f37662f[i10] == iVar.f37712c) {
                return true;
            }
            i10 = this.f37663g[i10];
        }
        return false;
    }

    @Override // z1.b.a
    public int h() {
        return this.f37658a;
    }

    @Override // z1.b.a
    public float i(int i10) {
        int i11 = this.f37665i;
        for (int i12 = 0; i11 != -1 && i12 < this.f37658a; i12++) {
            if (i12 == i10) {
                return this.f37664h[i11];
            }
            i11 = this.f37663g[i11];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public final float j(i iVar, boolean z10) {
        if (this.f37661e == iVar) {
            this.f37661e = null;
        }
        int i10 = this.f37665i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f37658a) {
            if (this.f37662f[i10] == iVar.f37712c) {
                if (i10 == this.f37665i) {
                    this.f37665i = this.f37663g[i10];
                } else {
                    int[] iArr = this.f37663g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.b);
                }
                iVar.f37722m--;
                this.f37658a--;
                this.f37662f[i10] = -1;
                if (this.f37667k) {
                    this.f37666j = i10;
                }
                return this.f37664h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f37663g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public void k(float f10) {
        int i10 = this.f37665i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37658a; i11++) {
            float[] fArr = this.f37664h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f37663g[i10];
        }
    }

    public String toString() {
        int i10 = this.f37665i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f37658a; i11++) {
            str = ((str + " -> ") + this.f37664h[i10] + " : ") + this.f37659c.f37675d[this.f37662f[i10]];
            i10 = this.f37663g[i10];
        }
        return str;
    }
}
