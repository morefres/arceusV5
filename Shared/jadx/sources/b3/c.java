package b3;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import b3.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c implements g.c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f3732a = new ArrayList<>();
    public final g b;

    /* renamed from: c, reason: collision with root package name */
    public Insets f3733c;

    /* renamed from: d, reason: collision with root package name */
    public Insets f3734d;

    /* renamed from: e, reason: collision with root package name */
    public int f3735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3736f;

    public c(g gVar, List<b> list) {
        Insets insets = Insets.NONE;
        this.f3733c = insets;
        this.f3734d = insets;
        f(list, false);
        f(list, true);
        gVar.g(this);
        this.b = gVar;
    }

    @Override // b3.g.c
    public void a(int i10, Insets insets, RectF rectF) {
        Insets insets2 = this.f3734d;
        for (int size = this.f3732a.size() - 1; size >= 0; size--) {
            b bVar = this.f3732a.get(size);
            int e10 = bVar.e();
            if ((e10 & i10) != 0) {
                bVar.l(true);
                if (e10 == 1) {
                    int i11 = insets2.left;
                    if (i11 > 0) {
                        bVar.k(insets.left / i11);
                    }
                    bVar.j(rectF.left);
                } else if (e10 == 2) {
                    int i12 = insets2.top;
                    if (i12 > 0) {
                        bVar.k(insets.top / i12);
                    }
                    bVar.j(rectF.top);
                } else if (e10 == 4) {
                    int i13 = insets2.right;
                    if (i13 > 0) {
                        bVar.k(insets.right / i13);
                    }
                    bVar.j(rectF.right);
                } else if (e10 == 8) {
                    int i14 = insets2.bottom;
                    if (i14 > 0) {
                        bVar.k(insets.bottom / i14);
                    }
                    bVar.j(rectF.bottom);
                }
            }
        }
    }

    @Override // b3.g.c
    public void b(Insets insets, Insets insets2) {
        this.f3733c = insets;
        this.f3734d = insets2;
        j();
    }

    @Override // b3.g.c
    public void c() {
        this.f3735e++;
    }

    @Override // b3.g.c
    public void d() {
        int i10 = this.f3735e;
        boolean z10 = i10 > 0;
        int i11 = i10 - 1;
        this.f3735e = i11;
        if (z10 && i11 == 0) {
            j();
        }
    }

    @Override // b3.g.c
    public void e(int i10) {
        for (int size = this.f3732a.size() - 1; size >= 0; size--) {
            this.f3732a.get(size).a(i10);
        }
    }

    public final void f(List<b> list, boolean z10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = list.get(i10);
            if (bVar.g() == z10) {
                Object d10 = bVar.d();
                if (d10 != null) {
                    throw new IllegalStateException(bVar + " is already controlled by " + d10);
                }
                bVar.h(this);
                this.f3732a.add(bVar);
            }
        }
    }

    public void g() {
        if (this.f3736f) {
            return;
        }
        this.f3736f = true;
        this.b.l(this);
        for (int size = this.f3732a.size() - 1; size >= 0; size--) {
            this.f3732a.get(size).h(null);
        }
        this.f3732a.clear();
    }

    public b h(int i10) {
        return this.f3732a.get(i10);
    }

    public int i() {
        return this.f3732a.size();
    }

    public final void j() {
        Insets insets = Insets.NONE;
        for (int size = this.f3732a.size() - 1; size >= 0; size--) {
            insets = Insets.max(insets, this.f3732a.get(size).b(this.f3733c, this.f3734d, insets));
        }
    }
}
