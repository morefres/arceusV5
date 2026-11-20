package z1;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable<i> {

    /* renamed from: r, reason: collision with root package name */
    public static int f37710r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f37711a;
    public String b;

    /* renamed from: f, reason: collision with root package name */
    public float f37715f;

    /* renamed from: j, reason: collision with root package name */
    public a f37719j;

    /* renamed from: c, reason: collision with root package name */
    public int f37712c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f37713d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f37714e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37716g = false;

    /* renamed from: h, reason: collision with root package name */
    public float[] f37717h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public float[] f37718i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public b[] f37720k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    public int f37721l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f37722m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f37723n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f37724o = -1;

    /* renamed from: p, reason: collision with root package name */
    public float f37725p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public HashSet<b> f37726q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f37719j = aVar;
    }

    public static void c() {
        f37710r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f37721l;
            if (i10 >= i11) {
                b[] bVarArr = this.f37720k;
                if (i11 >= bVarArr.length) {
                    this.f37720k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f37720k;
                int i12 = this.f37721l;
                bVarArr2[i12] = bVar;
                this.f37721l = i12 + 1;
                return;
            }
            if (this.f37720k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f37712c - iVar.f37712c;
    }

    public final void d(b bVar) {
        int i10 = this.f37721l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f37720k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f37720k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f37721l--;
                return;
            }
            i11++;
        }
    }

    public void e() {
        this.b = null;
        this.f37719j = a.UNKNOWN;
        this.f37714e = 0;
        this.f37712c = -1;
        this.f37713d = -1;
        this.f37715f = 0.0f;
        this.f37716g = false;
        this.f37723n = false;
        this.f37724o = -1;
        this.f37725p = 0.0f;
        int i10 = this.f37721l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37720k[i11] = null;
        }
        this.f37721l = 0;
        this.f37722m = 0;
        this.f37711a = false;
        Arrays.fill(this.f37718i, 0.0f);
    }

    public void h(d dVar, float f10) {
        this.f37715f = f10;
        this.f37716g = true;
        this.f37723n = false;
        this.f37724o = -1;
        this.f37725p = 0.0f;
        int i10 = this.f37721l;
        this.f37713d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37720k[i11].A(dVar, this, false);
        }
        this.f37721l = 0;
    }

    public void j(a aVar, String str) {
        this.f37719j = aVar;
    }

    public final void l(d dVar, b bVar) {
        int i10 = this.f37721l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37720k[i11].B(dVar, bVar, false);
        }
        this.f37721l = 0;
    }

    public String toString() {
        if (this.b != null) {
            return "" + this.b;
        }
        return "" + this.f37712c;
    }
}
