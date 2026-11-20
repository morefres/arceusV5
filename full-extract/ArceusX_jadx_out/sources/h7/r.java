package h7;

import android.graphics.Path;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.ArrayList;
import java.util.List;
import n7.t;

/* loaded from: classes3.dex */
public class r implements m, a.b, k {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19137c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f19138d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.m f19139e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19140f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f19136a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b f19141g = new b();

    public r(h0 h0Var, o7.b bVar, n7.r rVar) {
        this.b = rVar.b();
        this.f19137c = rVar.d();
        this.f19138d = h0Var;
        i7.m a10 = rVar.c().a();
        this.f19139e = a10;
        bVar.j(a10);
        a10.a(this);
    }

    private void f() {
        this.f19140f = false;
        this.f19138d.invalidateSelf();
    }

    @Override // i7.a.b
    public void a() {
        f();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f19141g.a(uVar);
                    uVar.c(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                s sVar = (s) cVar;
                sVar.g(this);
                arrayList.add(sVar);
            }
        }
        this.f19139e.s(arrayList);
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.P) {
            this.f19139e.o(cVar);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.b;
    }

    @Override // h7.m
    public Path getPath() {
        if (this.f19140f && !this.f19139e.k()) {
            return this.f19136a;
        }
        this.f19136a.reset();
        if (this.f19137c) {
            this.f19140f = true;
            return this.f19136a;
        }
        Path h10 = this.f19139e.h();
        if (h10 == null) {
            return this.f19136a;
        }
        this.f19136a.set(h10);
        this.f19136a.setFillType(Path.FillType.EVEN_ODD);
        this.f19141g.b(this.f19136a);
        this.f19140f = true;
        return this.f19136a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }
}
