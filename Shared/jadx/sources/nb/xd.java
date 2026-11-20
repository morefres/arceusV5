package nb;

/* loaded from: classes.dex */
public abstract class xd extends td {

    /* renamed from: c, reason: collision with root package name */
    public boolean f26816c;

    public xd(me meVar) {
        super(meVar);
        this.b.e0();
    }

    public final boolean i() {
        return this.f26816c;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f26816c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.b.f0();
        this.f26816c = true;
    }

    public abstract boolean l();
}
