package w7;

import w7.b;
import w7.g;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public b.r f33829a = null;
    public e b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f33830c = null;

    /* renamed from: d, reason: collision with root package name */
    public g.b f33831d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f33832e = null;

    /* renamed from: f, reason: collision with root package name */
    public g.b f33833f = null;

    public f a(String str) {
        this.f33829a = new b(b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        b.r rVar = this.f33829a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.f33830c != null;
    }

    public boolean e() {
        return this.f33832e != null;
    }

    public boolean f() {
        return this.f33831d != null;
    }

    public boolean g() {
        return this.f33833f != null;
    }

    public f h(float f10, float f11, float f12, float f13) {
        this.f33833f = new g.b(f10, f11, f12, f13);
        return this;
    }
}
