package h7;

import i7.a;
import java.util.ArrayList;
import java.util.List;
import n7.t;

/* loaded from: classes3.dex */
public class u implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f19147a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a.b> f19148c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final t.a f19149d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.a<?, Float> f19150e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.a<?, Float> f19151f;

    /* renamed from: g, reason: collision with root package name */
    public final i7.a<?, Float> f19152g;

    public u(o7.b bVar, n7.t tVar) {
        this.f19147a = tVar.c();
        this.b = tVar.g();
        this.f19149d = tVar.f();
        i7.d a10 = tVar.e().a();
        this.f19150e = a10;
        i7.d a11 = tVar.b().a();
        this.f19151f = a11;
        i7.d a12 = tVar.d().a();
        this.f19152g = a12;
        bVar.j(a10);
        bVar.j(a11);
        bVar.j(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // i7.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f19148c.size(); i10++) {
            this.f19148c.get(i10).a();
        }
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
    }

    public void c(a.b bVar) {
        this.f19148c.add(bVar);
    }

    public i7.a<?, Float> f() {
        return this.f19151f;
    }

    public i7.a<?, Float> h() {
        return this.f19152g;
    }

    public i7.a<?, Float> j() {
        return this.f19150e;
    }

    public t.a k() {
        return this.f19149d;
    }

    public boolean l() {
        return this.b;
    }
}
