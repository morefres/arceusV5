package ln;

import java.util.List;

/* loaded from: classes3.dex */
public class g implements sn.b {

    /* renamed from: a, reason: collision with root package name */
    public final List<on.b0> f23570a;
    public final char b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23571c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23572d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23573e;

    /* renamed from: f, reason: collision with root package name */
    public g f23574f;

    /* renamed from: g, reason: collision with root package name */
    public g f23575g;

    public g(List<on.b0> list, char c10, boolean z10, boolean z11, g gVar) {
        this.f23570a = list;
        this.b = c10;
        this.f23572d = z10;
        this.f23573e = z11;
        this.f23574f = gVar;
        this.f23571c = list.size();
    }

    @Override // sn.b
    public Iterable<on.b0> a(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            List<on.b0> list = this.f23570a;
            return list.subList(list.size() - i10, this.f23570a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // sn.b
    public on.b0 b() {
        return this.f23570a.get(0);
    }

    @Override // sn.b
    public boolean c() {
        return this.f23573e;
    }

    @Override // sn.b
    public on.b0 d() {
        return this.f23570a.get(r0.size() - 1);
    }

    @Override // sn.b
    public Iterable<on.b0> e(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            return this.f23570a.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // sn.b
    public int f() {
        return this.f23571c;
    }

    @Override // sn.b
    public boolean g() {
        return this.f23572d;
    }

    @Override // sn.b
    public int length() {
        return this.f23570a.size();
    }
}
