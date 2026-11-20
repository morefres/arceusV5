package l1;

import android.util.Range;
import g0.r1;
import n0.a4;

/* loaded from: classes.dex */
public final class d implements x2.h<m1.a> {

    /* renamed from: a, reason: collision with root package name */
    public final String f23186a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.a f23187c;

    /* renamed from: d, reason: collision with root package name */
    public final i1.a f23188d;

    /* renamed from: e, reason: collision with root package name */
    public final a4 f23189e;

    public d(String str, int i10, a4 a4Var, f1.a aVar, i1.a aVar2) {
        this.f23186a = str;
        this.b = i10;
        this.f23189e = a4Var;
        this.f23187c = aVar;
        this.f23188d = aVar2;
    }

    @Override // x2.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1.a get() {
        Range<Integer> b = this.f23187c.b();
        r1.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return m1.a.d().h(this.f23186a).i(this.b).g(this.f23189e).e(this.f23188d.f()).d(this.f23188d.e()).f(this.f23188d.g()).c(b.h(156000, this.f23188d.f(), 2, this.f23188d.g(), 48000, b)).b();
    }
}
