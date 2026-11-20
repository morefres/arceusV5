package fi;

/* loaded from: classes2.dex */
public abstract class a<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f17256a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f17257c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17258d;

    public a(int i10, int i11, float f10) {
        this.f17256a = i10;
        this.f17257c = i11;
        this.f17258d = f10;
    }

    @Override // fi.d
    public boolean a() {
        return this.b < this.f17257c;
    }

    @Override // fi.d
    public int b() {
        return this.f17256a;
    }

    @Override // fi.d
    public void retry() {
        this.b++;
        this.f17256a = (int) (this.f17256a * this.f17258d);
    }
}
