package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public Context f704a;
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public e f705c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f706d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f707e;

    /* renamed from: f, reason: collision with root package name */
    public i.a f708f;

    /* renamed from: g, reason: collision with root package name */
    public int f709g;

    /* renamed from: h, reason: collision with root package name */
    public int f710h;

    /* renamed from: i, reason: collision with root package name */
    public j f711i;

    /* renamed from: j, reason: collision with root package name */
    public int f712j;

    public a(Context context, int i10, int i11) {
        this.f704a = context;
        this.f706d = LayoutInflater.from(context);
        this.f709g = i10;
        this.f710h = i11;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        i.a aVar = this.f708f;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f708f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        i.a aVar = this.f708f;
        l lVar2 = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            lVar2 = this.f705c;
        }
        return aVar.c(lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f711i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f705c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f705c.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = E.get(i12);
                if (r(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View o8 = o(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        o8.setPressed(false);
                        o8.jumpDrawablesToCurrentState();
                    }
                    if (o8 != childAt) {
                        j(o8, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!m(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        this.b = context;
        this.f707e = LayoutInflater.from(context);
        this.f705c = eVar;
    }

    public void j(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f711i).addView(view, i10);
    }

    public abstract void k(g gVar, j.a aVar);

    public j.a l(ViewGroup viewGroup) {
        return (j.a) this.f706d.inflate(this.f710h, viewGroup, false);
    }

    public boolean m(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public i.a n() {
        return this.f708f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View o(g gVar, View view, ViewGroup viewGroup) {
        j.a l10 = view instanceof j.a ? (j.a) view : l(viewGroup);
        k(gVar, l10);
        return (View) l10;
    }

    public j p(ViewGroup viewGroup) {
        if (this.f711i == null) {
            j jVar = (j) this.f706d.inflate(this.f709g, viewGroup, false);
            this.f711i = jVar;
            jVar.a(this.f705c);
            f(true);
        }
        return this.f711i;
    }

    public void q(int i10) {
        this.f712j = i10;
    }

    public abstract boolean r(int i10, g gVar);
}
