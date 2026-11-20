package c2;

import androidx.core.view.inputmethod.EditorInfoCompat;
import d2.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z1.i;

/* loaded from: classes.dex */
public class d {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4475c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4476d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4477e;

    /* renamed from: f, reason: collision with root package name */
    public d f4478f;

    /* renamed from: i, reason: collision with root package name */
    public z1.i f4481i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet<d> f4474a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f4479g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f4480h = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f4476d = eVar;
        this.f4477e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, EditorInfoCompat.IME_FLAG_FORCE_ASCII, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z10 && !p(dVar)) {
            return false;
        }
        this.f4478f = dVar;
        if (dVar.f4474a == null) {
            dVar.f4474a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f4478f.f4474a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4479g = i10;
        this.f4480h = i11;
        return true;
    }

    public void c(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f4474a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                d2.i.a(it.next().f4476d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f4474a;
    }

    public int e() {
        if (this.f4475c) {
            return this.b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f4476d.V() == 8) {
            return 0;
        }
        return (this.f4480h == Integer.MIN_VALUE || (dVar = this.f4478f) == null || dVar.f4476d.V() != 8) ? this.f4479g : this.f4480h;
    }

    public final d g() {
        switch (this.f4477e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f4476d.Q;
            case TOP:
                return this.f4476d.R;
            case RIGHT:
                return this.f4476d.O;
            case BOTTOM:
                return this.f4476d.P;
            default:
                throw new AssertionError(this.f4477e.name());
        }
    }

    public e h() {
        return this.f4476d;
    }

    public z1.i i() {
        return this.f4481i;
    }

    public d j() {
        return this.f4478f;
    }

    public a k() {
        return this.f4477e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f4474a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f4474a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f4475c;
    }

    public boolean o() {
        return this.f4478f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a k10 = dVar.k();
        a aVar = this.f4477e;
        if (k10 == aVar) {
            return aVar != a.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = k10 == a.LEFT || k10 == a.RIGHT;
                return dVar.h() instanceof h ? z10 || k10 == a.CENTER_X : z10;
            case TOP:
            case BOTTOM:
                boolean z11 = k10 == a.TOP || k10 == a.BOTTOM;
                return dVar.h() instanceof h ? z11 || k10 == a.CENTER_Y : z11;
            case BASELINE:
                return (k10 == a.LEFT || k10 == a.RIGHT) ? false : true;
            case CENTER:
                return (k10 == a.BASELINE || k10 == a.CENTER_X || k10 == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f4477e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f4478f;
        if (dVar != null && (hashSet = dVar.f4474a) != null) {
            hashSet.remove(this);
            if (this.f4478f.f4474a.size() == 0) {
                this.f4478f.f4474a = null;
            }
        }
        this.f4474a = null;
        this.f4478f = null;
        this.f4479g = 0;
        this.f4480h = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f4475c = false;
        this.b = 0;
    }

    public void r() {
        this.f4475c = false;
        this.b = 0;
    }

    public void s(z1.c cVar) {
        z1.i iVar = this.f4481i;
        if (iVar == null) {
            this.f4481i = new z1.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void t(int i10) {
        this.b = i10;
        this.f4475c = true;
    }

    public String toString() {
        return this.f4476d.t() + ":" + this.f4477e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f4480h = i10;
        }
    }
}
