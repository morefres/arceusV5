package d2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<p> f14269k;

    /* renamed from: l, reason: collision with root package name */
    public int f14270l;

    public c(c2.e eVar, int i10) {
        super(eVar);
        this.f14269k = new ArrayList<>();
        this.f14329f = i10;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f6, code lost:
    
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
    
        if (r3.f14287j != false) goto L56;
     */
    @Override // d2.p, d2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(d2.d r27) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.c.a(d2.d):void");
    }

    @Override // d2.p
    public void d() {
        ArrayList<p> arrayList = this.f14269k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            pVar.d();
        }
        int size2 = this.f14269k.size();
        if (size2 < 1) {
            return;
        }
        c2.e eVar = this.f14269k.get(0).b;
        c2.e eVar2 = this.f14269k.get(size2 - 1).b;
        if (this.f14329f == 0) {
            c2.d dVar = eVar.O;
            c2.d dVar2 = eVar2.Q;
            f i11 = i(dVar, 0);
            int f10 = dVar.f();
            c2.e r8 = r();
            if (r8 != null) {
                f10 = r8.O.f();
            }
            if (i11 != null) {
                b(this.f14331h, i11, f10);
            }
            f i12 = i(dVar2, 0);
            int f11 = dVar2.f();
            c2.e s8 = s();
            if (s8 != null) {
                f11 = s8.Q.f();
            }
            if (i12 != null) {
                b(this.f14332i, i12, -f11);
            }
        } else {
            c2.d dVar3 = eVar.P;
            c2.d dVar4 = eVar2.R;
            f i13 = i(dVar3, 1);
            int f12 = dVar3.f();
            c2.e r10 = r();
            if (r10 != null) {
                f12 = r10.P.f();
            }
            if (i13 != null) {
                b(this.f14331h, i13, f12);
            }
            f i14 = i(dVar4, 1);
            int f13 = dVar4.f();
            c2.e s10 = s();
            if (s10 != null) {
                f13 = s10.R.f();
            }
            if (i14 != null) {
                b(this.f14332i, i14, -f13);
            }
        }
        this.f14331h.f14279a = this;
        this.f14332i.f14279a = this;
    }

    @Override // d2.p
    public void e() {
        for (int i10 = 0; i10 < this.f14269k.size(); i10++) {
            this.f14269k.get(i10).e();
        }
    }

    @Override // d2.p
    public void f() {
        this.f14326c = null;
        ArrayList<p> arrayList = this.f14269k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            pVar.f();
        }
    }

    @Override // d2.p
    public long j() {
        int size = this.f14269k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f14331h.f14283f + this.f14269k.get(i10).j() + r4.f14332i.f14283f;
        }
        return j10;
    }

    @Override // d2.p
    public boolean m() {
        int size = this.f14269k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f14269k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        c2.e eVar;
        c2.e eVar2 = this.b;
        c2.e L = eVar2.L(this.f14329f);
        while (true) {
            c2.e eVar3 = L;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                L = eVar2.L(this.f14329f);
            }
        }
        this.b = eVar;
        this.f14269k.add(eVar.N(this.f14329f));
        c2.e J = eVar.J(this.f14329f);
        while (J != null) {
            this.f14269k.add(J.N(this.f14329f));
            J = J.J(this.f14329f);
        }
        ArrayList<p> arrayList = this.f14269k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            p pVar2 = pVar;
            int i11 = this.f14329f;
            if (i11 == 0) {
                pVar2.b.f4494c = this;
            } else if (i11 == 1) {
                pVar2.b.f4496d = this;
            }
        }
        if (this.f14329f == 0 && ((c2.f) this.b.K()).R1() && this.f14269k.size() > 1) {
            ArrayList<p> arrayList2 = this.f14269k;
            this.b = arrayList2.get(arrayList2.size() - 1).b;
        }
        this.f14270l = this.f14329f == 0 ? this.b.z() : this.b.S();
    }

    public final c2.e r() {
        for (int i10 = 0; i10 < this.f14269k.size(); i10++) {
            p pVar = this.f14269k.get(i10);
            if (pVar.b.V() != 8) {
                return pVar.b;
            }
        }
        return null;
    }

    public final c2.e s() {
        for (int size = this.f14269k.size() - 1; size >= 0; size--) {
            p pVar = this.f14269k.get(size);
            if (pVar.b.V() != 8) {
                return pVar.b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f14329f == 0 ? "horizontal : " : "vertical : ");
        ArrayList<p> arrayList = this.f14269k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
