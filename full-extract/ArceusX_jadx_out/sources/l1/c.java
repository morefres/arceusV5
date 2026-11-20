package l1;

import g0.r1;
import n0.a2;
import n0.a4;

/* loaded from: classes.dex */
public final class c implements x2.h<m1.a> {

    /* renamed from: a, reason: collision with root package name */
    public final String f23181a;
    public final a4 b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23182c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.a f23183d;

    /* renamed from: e, reason: collision with root package name */
    public final i1.a f23184e;

    /* renamed from: f, reason: collision with root package name */
    public final a2.a f23185f;

    public c(String str, int i10, a4 a4Var, f1.a aVar, i1.a aVar2, a2.a aVar3) {
        this.f23181a = str;
        this.f23182c = i10;
        this.b = a4Var;
        this.f23183d = aVar;
        this.f23184e = aVar2;
        this.f23185f = aVar3;
    }

    @Override // x2.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1.a get() {
        r1.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return m1.a.d().h(this.f23181a).i(this.f23182c).g(this.b).e(this.f23184e.f()).d(this.f23184e.e()).f(this.f23184e.g()).c(b.h(this.f23185f.b(), this.f23184e.f(), this.f23185f.c(), this.f23184e.g(), this.f23185f.g(), this.f23183d.b())).b();
    }
}
