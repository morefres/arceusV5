package s7;

import u2.o;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f30916a = new String[5];
    public final long[] b = new long[5];

    /* renamed from: c, reason: collision with root package name */
    public int f30917c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f30918d = 0;

    public void a(String str) {
        int i10 = this.f30917c;
        if (i10 == 5) {
            this.f30918d++;
            return;
        }
        this.f30916a[i10] = str;
        this.b[i10] = System.nanoTime();
        o.a(str);
        this.f30917c++;
    }

    public float b(String str) {
        int i10 = this.f30918d;
        if (i10 > 0) {
            this.f30918d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f30917c - 1;
        this.f30917c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f30916a[i11])) {
            o.b();
            return (System.nanoTime() - this.b[this.f30917c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f30916a[this.f30917c] + ".");
    }
}
