package ga;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18424a = false;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18425c = false;

    public /* synthetic */ p(byte[] bArr) {
    }

    public final p a(boolean z10) {
        this.f18424a = true;
        return this;
    }

    public final p b(boolean z10) {
        this.b = true;
        return this;
    }

    public final p c(boolean z10) {
        this.f18425c = true;
        return this;
    }

    public final q d() {
        return new q(this, null);
    }

    public final /* synthetic */ boolean e() {
        return this.f18424a;
    }

    public final /* synthetic */ boolean f() {
        return this.b;
    }

    public final /* synthetic */ boolean g() {
        return this.f18425c;
    }
}
