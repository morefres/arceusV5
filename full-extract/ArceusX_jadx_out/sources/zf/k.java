package zf;

/* loaded from: classes2.dex */
public class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final p f38038a;
    public final sb.k<m> b;

    public k(p pVar, sb.k<m> kVar) {
        this.f38038a = pVar;
        this.b = kVar;
    }

    @Override // zf.o
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // zf.o
    public boolean b(bg.d dVar) {
        if (!dVar.k() || this.f38038a.f(dVar)) {
            return false;
        }
        this.b.c(m.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
