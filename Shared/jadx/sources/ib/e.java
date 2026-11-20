package ib;

/* loaded from: classes.dex */
public abstract class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final sb.k f20362a;

    public e() {
        this.f20362a = null;
    }

    public void a(Exception exc) {
        sb.k kVar = this.f20362a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    public abstract void b();

    public final sb.k c() {
        return this.f20362a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public e(sb.k kVar) {
        this.f20362a = kVar;
    }
}
