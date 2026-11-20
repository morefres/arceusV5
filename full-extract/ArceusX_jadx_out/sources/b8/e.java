package b8;

import android.content.Context;
import b8.u;
import i8.w;
import i8.x;
import j8.m0;
import j8.n0;
import j8.u0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e extends u {

    /* renamed from: a, reason: collision with root package name */
    public ft.a<Executor> f3888a;
    public ft.a<Context> b;

    /* renamed from: c, reason: collision with root package name */
    public ft.a f3889c;

    /* renamed from: d, reason: collision with root package name */
    public ft.a f3890d;

    /* renamed from: e, reason: collision with root package name */
    public ft.a f3891e;

    /* renamed from: f, reason: collision with root package name */
    public ft.a<String> f3892f;

    /* renamed from: g, reason: collision with root package name */
    public ft.a<m0> f3893g;

    /* renamed from: h, reason: collision with root package name */
    public ft.a<i8.f> f3894h;

    /* renamed from: i, reason: collision with root package name */
    public ft.a<x> f3895i;

    /* renamed from: j, reason: collision with root package name */
    public ft.a<h8.c> f3896j;

    /* renamed from: k, reason: collision with root package name */
    public ft.a<i8.r> f3897k;

    /* renamed from: l, reason: collision with root package name */
    public ft.a<i8.v> f3898l;

    /* renamed from: m, reason: collision with root package name */
    public ft.a<t> f3899m;

    public static final class b implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public Context f3900a;

        public b() {
        }

        @Override // b8.u.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b setApplicationContext(Context context) {
            this.f3900a = (Context) d8.d.b(context);
            return this;
        }

        @Override // b8.u.a
        public u build() {
            d8.d.a(this.f3900a, Context.class);
            return new e(this.f3900a);
        }
    }

    public static u.a c() {
        return new b();
    }

    @Override // b8.u
    public j8.d a() {
        return this.f3893g.get();
    }

    @Override // b8.u
    public t b() {
        return this.f3899m.get();
    }

    public final void d(Context context) {
        this.f3888a = d8.a.a(k.a());
        d8.b a10 = d8.c.a(context);
        this.b = a10;
        c8.j a11 = c8.j.a(a10, l8.c.a(), l8.d.a());
        this.f3889c = a11;
        this.f3890d = d8.a.a(c8.l.a(this.b, a11));
        this.f3891e = u0.a(this.b, j8.g.a(), j8.i.a());
        this.f3892f = d8.a.a(j8.h.a(this.b));
        this.f3893g = d8.a.a(n0.a(l8.c.a(), l8.d.a(), j8.j.a(), this.f3891e, this.f3892f));
        h8.g b10 = h8.g.b(l8.c.a());
        this.f3894h = b10;
        h8.i a12 = h8.i.a(this.b, this.f3893g, b10, l8.d.a());
        this.f3895i = a12;
        ft.a<Executor> aVar = this.f3888a;
        ft.a aVar2 = this.f3890d;
        ft.a<m0> aVar3 = this.f3893g;
        this.f3896j = h8.d.a(aVar, aVar2, a12, aVar3, aVar3);
        ft.a<Context> aVar4 = this.b;
        ft.a aVar5 = this.f3890d;
        ft.a<m0> aVar6 = this.f3893g;
        this.f3897k = i8.s.a(aVar4, aVar5, aVar6, this.f3895i, this.f3888a, aVar6, l8.c.a(), l8.d.a(), this.f3893g);
        ft.a<Executor> aVar7 = this.f3888a;
        ft.a<m0> aVar8 = this.f3893g;
        this.f3898l = w.a(aVar7, aVar8, this.f3895i, aVar8);
        this.f3899m = d8.a.a(v.a(l8.c.a(), l8.d.a(), this.f3896j, this.f3897k, this.f3898l));
    }

    public e(Context context) {
        d(context);
    }
}
