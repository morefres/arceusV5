package ev;

/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final i f16277a = new i();
    public final c b;

    public a(c cVar) {
        this.b = cVar;
    }

    public void a(n nVar, Object obj) {
        this.f16277a.a(h.a(nVar, obj));
        this.b.e().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        h b = this.f16277a.b();
        if (b == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.g(b);
    }
}
