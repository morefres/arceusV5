package on;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public s f28001a = null;
    public s b = null;

    /* renamed from: c, reason: collision with root package name */
    public s f28002c = null;

    /* renamed from: d, reason: collision with root package name */
    public s f28003d = null;

    /* renamed from: e, reason: collision with root package name */
    public s f28004e = null;

    /* renamed from: f, reason: collision with root package name */
    public List<y> f28005f = null;

    public abstract void a(d0 d0Var);

    public void b(y yVar) {
        if (this.f28005f == null) {
            this.f28005f = new ArrayList();
        }
        this.f28005f.add(yVar);
    }

    public void c(s sVar) {
        sVar.n();
        sVar.k(this);
        s sVar2 = this.f28002c;
        if (sVar2 != null) {
            sVar2.f28004e = sVar;
            sVar.f28003d = sVar2;
        } else {
            this.b = sVar;
        }
        this.f28002c = sVar;
    }

    public s d() {
        return this.b;
    }

    public s e() {
        return this.f28002c;
    }

    public s f() {
        return this.f28004e;
    }

    public s g() {
        return this.f28001a;
    }

    public List<y> h() {
        List<y> list = this.f28005f;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public void i(s sVar) {
        sVar.n();
        s sVar2 = this.f28004e;
        sVar.f28004e = sVar2;
        if (sVar2 != null) {
            sVar2.f28003d = sVar;
        }
        sVar.f28003d = this;
        this.f28004e = sVar;
        s sVar3 = this.f28001a;
        sVar.f28001a = sVar3;
        if (sVar.f28004e == null) {
            sVar3.f28002c = sVar;
        }
    }

    public void j(s sVar) {
        sVar.n();
        s sVar2 = this.f28003d;
        sVar.f28003d = sVar2;
        if (sVar2 != null) {
            sVar2.f28004e = sVar;
        }
        sVar.f28004e = this;
        this.f28003d = sVar;
        s sVar3 = this.f28001a;
        sVar.f28001a = sVar3;
        if (sVar.f28003d == null) {
            sVar3.b = sVar;
        }
    }

    public void k(s sVar) {
        this.f28001a = sVar;
    }

    public void l(List<y> list) {
        if (list.isEmpty()) {
            this.f28005f = null;
        } else {
            this.f28005f = new ArrayList(list);
        }
    }

    public String m() {
        return "";
    }

    public void n() {
        s sVar = this.f28003d;
        if (sVar != null) {
            sVar.f28004e = this.f28004e;
        } else {
            s sVar2 = this.f28001a;
            if (sVar2 != null) {
                sVar2.b = this.f28004e;
            }
        }
        s sVar3 = this.f28004e;
        if (sVar3 != null) {
            sVar3.f28003d = sVar;
        } else {
            s sVar4 = this.f28001a;
            if (sVar4 != null) {
                sVar4.f28002c = sVar;
            }
        }
        this.f28001a = null;
        this.f28004e = null;
        this.f28003d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + m() + "}";
    }
}
