package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final w1.j<RecyclerView.f0, a> f3108a = new w1.j<>();
    public final w1.g<RecyclerView.f0> b = new w1.g<>();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static x2.d<a> f3109d = new x2.e(20);

        /* renamed from: a, reason: collision with root package name */
        public int f3110a;
        public RecyclerView.n.c b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.n.c f3111c;

        public static void a() {
            while (f3109d.b() != null) {
            }
        }

        public static a b() {
            a b = f3109d.b();
            return b == null ? new a() : b;
        }

        public static void c(a aVar) {
            aVar.f3110a = 0;
            aVar.b = null;
            aVar.f3111c = null;
            f3109d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.f0 f0Var, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void b(RecyclerView.f0 f0Var);

        void c(RecyclerView.f0 f0Var, @NonNull RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void d(RecyclerView.f0 f0Var, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2);
    }

    public void a(RecyclerView.f0 f0Var, RecyclerView.n.c cVar) {
        a aVar = this.f3108a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3108a.put(f0Var, aVar);
        }
        aVar.f3110a |= 2;
        aVar.b = cVar;
    }

    public void b(RecyclerView.f0 f0Var) {
        a aVar = this.f3108a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3108a.put(f0Var, aVar);
        }
        aVar.f3110a |= 1;
    }

    public void c(long j10, RecyclerView.f0 f0Var) {
        this.b.i(j10, f0Var);
    }

    public void d(RecyclerView.f0 f0Var, RecyclerView.n.c cVar) {
        a aVar = this.f3108a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3108a.put(f0Var, aVar);
        }
        aVar.f3111c = cVar;
        aVar.f3110a |= 8;
    }

    public void e(RecyclerView.f0 f0Var, RecyclerView.n.c cVar) {
        a aVar = this.f3108a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3108a.put(f0Var, aVar);
        }
        aVar.b = cVar;
        aVar.f3110a |= 4;
    }

    public void f() {
        this.f3108a.clear();
        this.b.a();
    }

    public RecyclerView.f0 g(long j10) {
        return this.b.e(j10);
    }

    public boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.f3108a.get(f0Var);
        return (aVar == null || (aVar.f3110a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.f3108a.get(f0Var);
        return (aVar == null || (aVar.f3110a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    public final RecyclerView.n.c l(RecyclerView.f0 f0Var, int i10) {
        a k10;
        RecyclerView.n.c cVar;
        int d10 = this.f3108a.d(f0Var);
        if (d10 >= 0 && (k10 = this.f3108a.k(d10)) != null) {
            int i11 = k10.f3110a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                k10.f3110a = i12;
                if (i10 == 4) {
                    cVar = k10.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = k10.f3111c;
                }
                if ((i12 & 12) == 0) {
                    this.f3108a.i(d10);
                    a.c(k10);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.n.c m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    public RecyclerView.n.c n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.f3108a.getSize() - 1; size >= 0; size--) {
            RecyclerView.f0 f10 = this.f3108a.f(size);
            a i10 = this.f3108a.i(size);
            int i11 = i10.f3110a;
            if ((i11 & 3) == 3) {
                bVar.b(f10);
            } else if ((i11 & 1) != 0) {
                RecyclerView.n.c cVar = i10.b;
                if (cVar == null) {
                    bVar.b(f10);
                } else {
                    bVar.c(f10, cVar, i10.f3111c);
                }
            } else if ((i11 & 14) == 14) {
                bVar.a(f10, i10.b, i10.f3111c);
            } else if ((i11 & 12) == 12) {
                bVar.d(f10, i10.b, i10.f3111c);
            } else if ((i11 & 4) != 0) {
                bVar.c(f10, i10.b, null);
            } else if ((i11 & 8) != 0) {
                bVar.a(f10, i10.b, i10.f3111c);
            }
            a.c(i10);
        }
    }

    public void p(RecyclerView.f0 f0Var) {
        a aVar = this.f3108a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3110a &= -2;
    }

    public void q(RecyclerView.f0 f0Var) {
        int n10 = this.b.n() - 1;
        while (true) {
            if (n10 < 0) {
                break;
            }
            if (f0Var == this.b.o(n10)) {
                this.b.k(n10);
                break;
            }
            n10--;
        }
        a remove = this.f3108a.remove(f0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
