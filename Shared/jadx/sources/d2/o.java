package d2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    public static int f14313g;
    public int b;

    /* renamed from: d, reason: collision with root package name */
    public int f14316d;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<c2.e> f14314a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14315c = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<a> f14317e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f14318f = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<c2.e> f14319a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f14320c;

        /* renamed from: d, reason: collision with root package name */
        public int f14321d;

        /* renamed from: e, reason: collision with root package name */
        public int f14322e;

        /* renamed from: f, reason: collision with root package name */
        public int f14323f;

        /* renamed from: g, reason: collision with root package name */
        public int f14324g;

        public a(c2.e eVar, z1.d dVar, int i10) {
            this.f14319a = new WeakReference<>(eVar);
            this.b = dVar.y(eVar.O);
            this.f14320c = dVar.y(eVar.P);
            this.f14321d = dVar.y(eVar.Q);
            this.f14322e = dVar.y(eVar.R);
            this.f14323f = dVar.y(eVar.S);
            this.f14324g = i10;
        }
    }

    public o(int i10) {
        int i11 = f14313g;
        f14313g = i11 + 1;
        this.b = i11;
        this.f14316d = i10;
    }

    public boolean a(c2.e eVar) {
        if (this.f14314a.contains(eVar)) {
            return false;
        }
        this.f14314a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f14314a.size();
        if (this.f14318f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f14318f == oVar.b) {
                    g(this.f14316d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f14316d;
    }

    public final String e() {
        int i10 = this.f14316d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public int f(z1.d dVar, int i10) {
        if (this.f14314a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f14314a, i10);
    }

    public void g(int i10, o oVar) {
        ArrayList<c2.e> arrayList = this.f14314a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            c2.e eVar = arrayList.get(i11);
            i11++;
            c2.e eVar2 = eVar;
            oVar.a(eVar2);
            if (i10 == 0) {
                eVar2.I0 = oVar.c();
            } else {
                eVar2.J0 = oVar.c();
            }
        }
        this.f14318f = oVar.b;
    }

    public void h(boolean z10) {
        this.f14315c = z10;
    }

    public void i(int i10) {
        this.f14316d = i10;
    }

    public final int j(z1.d dVar, ArrayList<c2.e> arrayList, int i10) {
        int y10;
        int y11;
        c2.f fVar = (c2.f) arrayList.get(0).K();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            c2.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            c2.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f14317e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f14317e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            y10 = dVar.y(fVar.O);
            y11 = dVar.y(fVar.Q);
            dVar.E();
        } else {
            y10 = dVar.y(fVar.P);
            y11 = dVar.y(fVar.R);
            dVar.E();
        }
        return y11 - y10;
    }

    public String toString() {
        String str = e() + " [" + this.b + "] <";
        ArrayList<c2.e> arrayList = this.f14314a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            c2.e eVar = arrayList.get(i10);
            i10++;
            str = str + " " + eVar.t();
        }
        return str + " >";
    }
}
