package ed;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f15951a;
    public final InterfaceC0297a b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15952c;

    /* renamed from: ed.a$a, reason: collision with other inner class name */
    public interface InterfaceC0297a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0297a interfaceC0297a, Typeface typeface) {
        this.f15951a = typeface;
        this.b = interfaceC0297a;
    }

    @Override // ed.f
    public void a(int i10) {
        d(this.f15951a);
    }

    @Override // ed.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f15952c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f15952c) {
            return;
        }
        this.b.a(typeface);
    }
}
