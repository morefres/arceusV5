package be;

/* loaded from: classes2.dex */
public abstract class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final sb.k f3999a;

    public r1() {
        this.f3999a = null;
    }

    public final sb.k a() {
        return this.f3999a;
    }

    public final void b(Exception exc) {
        sb.k kVar = this.f3999a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Exception e10) {
            b(e10);
        }
    }

    public r1(sb.k kVar) {
        this.f3999a = kVar;
    }
}
