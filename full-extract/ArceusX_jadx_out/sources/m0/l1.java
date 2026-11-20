package m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import g0.f1;
import g0.r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f23978a = new v0.a().a();
    public final Map<Integer, Boolean> b = new HashMap();

    public interface a {
        void f(l1 l1Var);
    }

    public static /* synthetic */ void a(l1 l1Var, g0.h1 h1Var) {
        l1Var.j();
        if (!(l1Var.l() != null)) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        f1.g l10 = l1Var.l();
        Objects.requireNonNull(l10);
        l10.e(h1Var);
    }

    public static /* synthetic */ void b(l1 l1Var, f1.i iVar) {
        f1.g l10 = l1Var.l();
        Objects.requireNonNull(l10);
        Objects.requireNonNull(iVar);
        l10.d(iVar);
    }

    public static /* synthetic */ void c(l1 l1Var, androidx.camera.core.d dVar) {
        f1.f j10 = l1Var.j();
        Objects.requireNonNull(j10);
        Objects.requireNonNull(dVar);
        j10.c(dVar);
    }

    public static /* synthetic */ void d(l1 l1Var, Bitmap bitmap) {
        if (l1Var.l() != null) {
            l1Var.l().b(bitmap);
        } else {
            l1Var.j();
        }
    }

    public static /* synthetic */ void e(l1 l1Var, int i10) {
        if (l1Var.l() != null) {
            l1Var.l().a(i10);
        } else {
            l1Var.j();
        }
    }

    public static l1 v(Executor executor, f1.f fVar, f1.g gVar, f1.h hVar, f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<n0.u> list) {
        x2.g.b((gVar == null) == (hVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        x2.g.b(!(gVar == null), "One and only one on-disk or in-memory callback should be present.");
        j jVar = new j(executor, fVar, gVar, hVar, hVar2, rect, matrix, i10, i11, i12, z10, list);
        if (z10) {
            jVar.r();
        }
        return jVar;
    }

    public void A(final f1.i iVar) {
        g().execute(new Runnable() { // from class: m0.j1
            @Override // java.lang.Runnable
            public final void run() {
                l1.b(l1.this, iVar);
            }
        });
    }

    public boolean f() {
        p0.z.b();
        int i10 = this.f23978a;
        if (i10 <= 0) {
            return false;
        }
        this.f23978a = i10 - 1;
        return true;
    }

    public abstract Executor g();

    public abstract int h();

    public abstract Rect i();

    public abstract f1.f j();

    public abstract int k();

    public abstract f1.g l();

    public abstract f1.h m();

    public abstract int n();

    public abstract f1.h o();

    public abstract Matrix p();

    public abstract List<n0.u> q();

    public void r() {
        Map<Integer, Boolean> map = this.b;
        Boolean bool = Boolean.FALSE;
        map.put(32, bool);
        this.b.put(256, bool);
    }

    public boolean s() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean t();

    public void u(int i10, boolean z10) {
        if (this.b.containsKey(Integer.valueOf(i10))) {
            this.b.put(Integer.valueOf(i10), Boolean.valueOf(z10));
        } else {
            r1.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public void w(final int i10) {
        g().execute(new Runnable() { // from class: m0.k1
            @Override // java.lang.Runnable
            public final void run() {
                l1.e(l1.this, i10);
            }
        });
    }

    public void x(final g0.h1 h1Var) {
        g().execute(new Runnable() { // from class: m0.g1
            @Override // java.lang.Runnable
            public final void run() {
                l1.a(l1.this, h1Var);
            }
        });
    }

    public void y(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: m0.i1
            @Override // java.lang.Runnable
            public final void run() {
                l1.d(l1.this, bitmap);
            }
        });
    }

    public void z(final androidx.camera.core.d dVar) {
        g().execute(new Runnable() { // from class: m0.h1
            @Override // java.lang.Runnable
            public final void run() {
                l1.c(l1.this, dVar);
            }
        });
    }
}
