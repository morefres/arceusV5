package dk;

import ci.g;
import ci.i;
import ci.j;
import ci.m;
import rg.a1;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f14951a;
    public boolean b = true;

    /* renamed from: dk.a$a, reason: collision with other inner class name */
    public class C0288a extends i {
        public C0288a() {
        }

        @Override // ci.l
        public void b(j jVar) {
            if (a.this.f14951a != null) {
                a.this.f14951a.a(jVar);
            }
        }
    }

    public static class b extends fi.b {
        @Override // fi.b, fi.d
        /* renamed from: d */
        public boolean c(j jVar) {
            return (jVar.b() == 200 || jVar.b() == 401) ? false : true;
        }

        public b() {
        }
    }

    public a(m mVar) {
        this.f14951a = mVar;
    }

    public void b() {
        this.b = false;
    }

    public void c() {
        ci.d b10 = g.a().b(a1.b1(), null, new C0288a());
        if (this.b) {
            b10.g(new b());
        }
        b10.b();
    }
}
