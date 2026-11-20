package m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import g0.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n0.m1;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24011a;
    public l1 b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.h f24012c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.h f24013d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f24014e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24015f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24016g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f24017h;

    /* renamed from: i, reason: collision with root package name */
    public final a1 f24018i;

    /* renamed from: j, reason: collision with root package name */
    public final String f24019j;

    /* renamed from: l, reason: collision with root package name */
    public final ne.x<Void> f24021l;

    /* renamed from: m, reason: collision with root package name */
    public int f24022m = -1;

    /* renamed from: k, reason: collision with root package name */
    public final List<Integer> f24020k = new ArrayList();

    public v0(n0.k1 k1Var, l1 l1Var, a1 a1Var, ne.x<Void> xVar, int i10) {
        this.f24011a = i10;
        this.b = l1Var;
        this.f24012c = l1Var.m();
        this.f24013d = l1Var.o();
        this.f24016g = l1Var.k();
        this.f24015f = l1Var.n();
        this.f24014e = l1Var.i();
        this.f24017h = l1Var.p();
        this.f24018i = a1Var;
        this.f24019j = String.valueOf(k1Var.hashCode());
        List<m1> a10 = k1Var.a();
        Objects.requireNonNull(a10);
        Iterator<m1> it = a10.iterator();
        while (it.hasNext()) {
            this.f24020k.add(Integer.valueOf(it.next().getId()));
        }
        this.f24021l = xVar;
    }

    public ne.x<Void> a() {
        return this.f24021l;
    }

    public Rect b() {
        return this.f24014e;
    }

    public int c() {
        return this.f24016g;
    }

    public f1.h d() {
        return this.f24012c;
    }

    public int e() {
        return this.f24011a;
    }

    public int f() {
        return this.f24015f;
    }

    public f1.h g() {
        return this.f24013d;
    }

    public Matrix h() {
        return this.f24017h;
    }

    public List<Integer> i() {
        return this.f24020k;
    }

    public String j() {
        return this.f24019j;
    }

    public l1 k() {
        return this.b;
    }

    public boolean l() {
        return this.f24018i.h();
    }

    public boolean m() {
        return d() == null && g() == null;
    }

    public void n(g0.h1 h1Var) {
        this.f24018i.f(h1Var);
    }

    public void o(int i10) {
        if (this.f24022m != i10) {
            this.f24022m = i10;
            this.f24018i.a(i10);
        }
    }

    public void p() {
        this.f24018i.c();
    }

    public void q(androidx.camera.core.d dVar) {
        this.f24018i.g(dVar);
    }

    public void r(f1.i iVar) {
        this.f24018i.d(iVar);
    }

    public void s() {
        if (this.f24022m != -1) {
            o(100);
        }
        this.f24018i.i();
    }

    public void t(Bitmap bitmap) {
        this.f24018i.b(bitmap);
    }

    public void u(g0.h1 h1Var) {
        this.f24018i.e(h1Var);
    }
}
