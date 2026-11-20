package d2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f14303h;

    /* renamed from: c, reason: collision with root package name */
    public p f14305c;

    /* renamed from: d, reason: collision with root package name */
    public p f14306d;

    /* renamed from: f, reason: collision with root package name */
    public int f14308f;

    /* renamed from: g, reason: collision with root package name */
    public int f14309g;

    /* renamed from: a, reason: collision with root package name */
    public int f14304a = 0;
    public boolean b = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<p> f14307e = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f14305c = null;
        this.f14306d = null;
        int i11 = f14303h;
        this.f14308f = i11;
        f14303h = i11 + 1;
        this.f14305c = pVar;
        this.f14306d = pVar;
        this.f14309g = i10;
    }

    public void a(p pVar) {
        this.f14307e.add(pVar);
        this.f14306d = pVar;
    }

    public long b(c2.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f14305c;
        if (pVar instanceof c) {
            if (((c) pVar).f14329f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f4498e : fVar.f4500f).f14331h;
        f fVar3 = (i10 == 0 ? fVar.f4498e : fVar.f4500f).f14332i;
        boolean contains = pVar.f14331h.f14289l.contains(fVar2);
        boolean contains2 = this.f14305c.f14332i.f14289l.contains(fVar3);
        long j11 = this.f14305c.j();
        if (contains && contains2) {
            long d10 = d(this.f14305c.f14331h, 0L);
            long c10 = c(this.f14305c.f14332i, 0L);
            long j12 = d10 - j11;
            p pVar2 = this.f14305c;
            int i12 = pVar2.f14332i.f14283f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f14331h.f14283f;
            long j13 = ((-c10) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float q10 = pVar2.b.q(i10);
            float f10 = q10 > 0.0f ? (long) ((j13 / q10) + (j12 / (1.0f - q10))) : 0L;
            long j14 = ((long) ((f10 * q10) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - q10)) + 0.5f));
            j10 = r12.f14331h.f14283f + j14;
            i11 = this.f14305c.f14332i.f14283f;
        } else {
            if (contains) {
                return Math.max(d(this.f14305c.f14331h, r12.f14283f), this.f14305c.f14331h.f14283f + j11);
            }
            if (contains2) {
                return Math.max(-c(this.f14305c.f14332i, r12.f14283f), (-this.f14305c.f14332i.f14283f) + j11);
            }
            j10 = r12.f14331h.f14283f + this.f14305c.j();
            i11 = this.f14305c.f14332i.f14283f;
        }
        return j10 - i11;
    }

    public final long c(f fVar, long j10) {
        p pVar = fVar.f14281d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f14288k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f14288k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f14281d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f14283f + j10));
                }
            }
        }
        if (fVar != pVar.f14332i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f14331h, j12)), j12 - pVar.f14331h.f14283f);
    }

    public final long d(f fVar, long j10) {
        p pVar = fVar.f14281d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f14288k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f14288k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f14281d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f14283f + j10));
                }
            }
        }
        if (fVar != pVar.f14331h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f14332i, j12)), j12 - pVar.f14332i.f14283f);
    }
}
