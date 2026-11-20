package z1;

import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import java.util.Arrays;
import z1.b;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    public static float f37732n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    public final int f37733a = -1;
    public int b = 16;

    /* renamed from: c, reason: collision with root package name */
    public int f37734c = 16;

    /* renamed from: d, reason: collision with root package name */
    public int[] f37735d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int[] f37736e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f37737f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public float[] f37738g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public int[] f37739h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    public int[] f37740i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    public int f37741j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f37742k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final b f37743l;

    /* renamed from: m, reason: collision with root package name */
    public final c f37744m;

    public j(b bVar, c cVar) {
        this.f37743l = bVar;
        this.f37744m = cVar;
        clear();
    }

    @Override // z1.b.a
    public float a(i iVar) {
        int p8 = p(iVar);
        if (p8 != -1) {
            return this.f37738g[p8];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public i b(int i10) {
        int i11 = this.f37741j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f37742k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f37744m.f37675d[this.f37737f[i12]];
            }
            i12 = this.f37740i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // z1.b.a
    public void c(i iVar, float f10) {
        float f11 = f37732n;
        if (f10 > (-f11) && f10 < f11) {
            j(iVar, true);
            return;
        }
        if (this.f37741j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f37742k = 0;
            return;
        }
        int p8 = p(iVar);
        if (p8 != -1) {
            this.f37738g[p8] = f10;
            return;
        }
        if (this.f37741j + 1 >= this.b) {
            o();
        }
        int i10 = this.f37741j;
        int i11 = this.f37742k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f37737f[i11];
            int i15 = iVar.f37712c;
            if (i14 == i15) {
                this.f37738g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f37740i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // z1.b.a
    public void clear() {
        int i10 = this.f37741j;
        for (int i11 = 0; i11 < i10; i11++) {
            i b = b(i11);
            if (b != null) {
                b.d(this.f37743l);
            }
        }
        for (int i12 = 0; i12 < this.b; i12++) {
            this.f37737f[i12] = -1;
            this.f37736e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f37734c; i13++) {
            this.f37735d[i13] = -1;
        }
        this.f37741j = 0;
        this.f37742k = -1;
    }

    @Override // z1.b.a
    public void d() {
        int i10 = this.f37741j;
        int i11 = this.f37742k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f37738g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f37740i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // z1.b.a
    public float e(b bVar, boolean z10) {
        float a10 = a(bVar.f37668a);
        j(bVar.f37668a, z10);
        j jVar = (j) bVar.f37671e;
        int h10 = jVar.h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < h10) {
            int i12 = jVar.f37737f[i11];
            if (i12 != -1) {
                f(this.f37744m.f37675d[i12], jVar.f37738g[i11] * a10, z10);
                i10++;
            }
            i11++;
        }
        return a10;
    }

    @Override // z1.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f37732n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p8 = p(iVar);
            if (p8 == -1) {
                c(iVar, f10);
                return;
            }
            float[] fArr = this.f37738g;
            float f12 = fArr[p8] + f10;
            fArr[p8] = f12;
            float f13 = f37732n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[p8] = 0.0f;
            j(iVar, z10);
        }
    }

    @Override // z1.b.a
    public boolean g(i iVar) {
        return p(iVar) != -1;
    }

    @Override // z1.b.a
    public int h() {
        return this.f37741j;
    }

    @Override // z1.b.a
    public float i(int i10) {
        int i11 = this.f37741j;
        int i12 = this.f37742k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f37738g[i12];
            }
            i12 = this.f37740i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public float j(i iVar, boolean z10) {
        int p8 = p(iVar);
        if (p8 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f37738g[p8];
        if (this.f37742k == p8) {
            this.f37742k = this.f37740i[p8];
        }
        this.f37737f[p8] = -1;
        int[] iArr = this.f37739h;
        int i10 = iArr[p8];
        if (i10 != -1) {
            int[] iArr2 = this.f37740i;
            iArr2[i10] = iArr2[p8];
        }
        int i11 = this.f37740i[p8];
        if (i11 != -1) {
            iArr[i11] = iArr[p8];
        }
        this.f37741j--;
        iVar.f37722m--;
        if (z10) {
            iVar.d(this.f37743l);
        }
        return f10;
    }

    @Override // z1.b.a
    public void k(float f10) {
        int i10 = this.f37741j;
        int i11 = this.f37742k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f37738g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f37740i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f37712c % this.f37734c;
        int[] iArr2 = this.f37735d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f37736e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f37736e[i10] = -1;
    }

    public final void m(int i10, i iVar, float f10) {
        this.f37737f[i10] = iVar.f37712c;
        this.f37738g[i10] = f10;
        this.f37739h[i10] = -1;
        this.f37740i[i10] = -1;
        iVar.a(this.f37743l);
        iVar.f37722m++;
        this.f37741j++;
    }

    public final int n() {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.f37737f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void o() {
        int i10 = this.b * 2;
        this.f37737f = Arrays.copyOf(this.f37737f, i10);
        this.f37738g = Arrays.copyOf(this.f37738g, i10);
        this.f37739h = Arrays.copyOf(this.f37739h, i10);
        this.f37740i = Arrays.copyOf(this.f37740i, i10);
        this.f37736e = Arrays.copyOf(this.f37736e, i10);
        for (int i11 = this.b; i11 < i10; i11++) {
            this.f37737f[i11] = -1;
            this.f37736e[i11] = -1;
        }
        this.b = i10;
    }

    public int p(i iVar) {
        if (this.f37741j != 0 && iVar != null) {
            int i10 = iVar.f37712c;
            int i11 = this.f37735d[i10 % this.f37734c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f37737f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f37736e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f37737f[i11] != i10);
            if (i11 != -1 && this.f37737f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f37739h[n10] = i10;
            int[] iArr = this.f37740i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f37739h[n10] = -1;
            if (this.f37741j > 0) {
                this.f37740i[n10] = this.f37742k;
                this.f37742k = n10;
            } else {
                this.f37740i[n10] = -1;
            }
        }
        int i11 = this.f37740i[n10];
        if (i11 != -1) {
            this.f37739h[i11] = n10;
        }
        l(iVar, n10);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f37712c;
        int i12 = i11 % this.f37734c;
        int[] iArr2 = this.f37735d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f37737f[i13] == i11) {
            int[] iArr3 = this.f37736e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f37736e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f37737f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f37737f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f37741j;
        for (int i11 = 0; i11 < i10; i11++) {
            i b = b(i11);
            if (b != null) {
                String str2 = str + b + " = " + i(i11) + " ";
                int p8 = p(b);
                String str3 = str2 + "[p: ";
                String str4 = (this.f37739h[p8] != -1 ? str3 + this.f37744m.f37675d[this.f37737f[this.f37739h[p8]]] : str3 + PayloadNotificationChannel.SOUND_NONE) + ", n: ";
                str = (this.f37740i[p8] != -1 ? str4 + this.f37744m.f37675d[this.f37737f[this.f37740i[p8]]] : str4 + PayloadNotificationChannel.SOUND_NONE) + "]";
            }
        }
        return str + " }";
    }
}
