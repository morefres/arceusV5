package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public g f1967a;
    public o b;

    /* renamed from: c, reason: collision with root package name */
    public volatile r0 f1968c;

    /* renamed from: d, reason: collision with root package name */
    public volatile g f1969d;

    public void a(r0 r0Var) {
        if (this.f1968c != null) {
            return;
        }
        synchronized (this) {
            if (this.f1968c != null) {
                return;
            }
            try {
                if (this.f1967a != null) {
                    this.f1968c = r0Var.h().a(this.f1967a, this.b);
                    this.f1969d = this.f1967a;
                } else {
                    this.f1968c = r0Var;
                    this.f1969d = g.b;
                }
            } catch (a0 unused) {
                this.f1968c = r0Var;
                this.f1969d = g.b;
            }
        }
    }

    public int b() {
        if (this.f1969d != null) {
            return this.f1969d.size();
        }
        g gVar = this.f1967a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f1968c != null) {
            return this.f1968c.c();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f1968c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f1968c;
        this.f1967a = null;
        this.f1969d = null;
        this.f1968c = r0Var;
        return r0Var2;
    }

    public g e() {
        if (this.f1969d != null) {
            return this.f1969d;
        }
        g gVar = this.f1967a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f1969d != null) {
                    return this.f1969d;
                }
                if (this.f1968c == null) {
                    this.f1969d = g.b;
                } else {
                    this.f1969d = this.f1968c.b();
                }
                return this.f1969d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
