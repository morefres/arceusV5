package dk;

import android.view.a0;
import android.view.d0;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: k, reason: collision with root package name */
    public static final ml.a f14953k = ml.a.f24590c;

    /* renamed from: a, reason: collision with root package name */
    public long f14954a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public String f14955c;

    /* renamed from: d, reason: collision with root package name */
    public String f14956d;

    /* renamed from: e, reason: collision with root package name */
    public String f14957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14958f;

    /* renamed from: g, reason: collision with root package name */
    public int f14959g;

    /* renamed from: h, reason: collision with root package name */
    public int f14960h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14961i;

    /* renamed from: j, reason: collision with root package name */
    public d0<ml.a> f14962j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14963a = new c();
    }

    public static c c() {
        return a.f14963a;
    }

    public void a() {
        this.b = 0;
        this.f14959g = 0;
        this.f14957e = "";
        this.f14955c = null;
        this.f14958f = true;
        v(-1L);
        u(f14953k);
    }

    public String b() {
        String str = this.f14957e;
        return (str == null || str.equals("null")) ? "" : this.f14957e;
    }

    public int d() {
        return this.f14960h;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.f14959g;
    }

    public ml.a g() {
        ml.a f10 = this.f14962j.f();
        return f10 != null ? f10 : f14953k;
    }

    public a0<ml.a> h() {
        return this.f14962j;
    }

    public String i() {
        return g().getValue();
    }

    public long j() {
        return this.f14954a;
    }

    public String k() {
        String str = this.f14956d;
        return (str == null || str.equals("null")) ? "" : this.f14956d;
    }

    public boolean l() {
        return this.f14961i;
    }

    public void m() {
        if (this.f14962j.f() == null) {
            u(f14953k);
        }
    }

    public boolean n() {
        return this.f14958f;
    }

    public void o(String str) {
        this.f14957e = str;
    }

    public void p(boolean z10) {
        this.f14961i = z10;
    }

    public void q(boolean z10) {
        this.f14958f = z10;
    }

    public void r(int i10) {
        this.f14960h = i10;
    }

    public void s(int i10) {
        this.b = i10;
    }

    public void t(int i10) {
        this.f14959g = i10;
    }

    public void u(ml.a aVar) {
        this.f14962j.o(aVar);
    }

    public void v(long j10) {
        this.f14954a = j10;
        e.f14964a.c(j10);
    }

    public void w(String str) {
        this.f14956d = str;
    }

    public c() {
        this.f14954a = -1L;
        this.f14958f = true;
        this.f14962j = new d0<>();
    }
}
