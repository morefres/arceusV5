package v1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
public class a implements c {
    @Override // v1.c
    public float a(b bVar) {
        return p(bVar).d();
    }

    @Override // v1.c
    public float b(b bVar) {
        return a(bVar) * 2.0f;
    }

    @Override // v1.c
    public void c(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }

    @Override // v1.c
    public float d(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // v1.c
    public void e(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.b(new d(colorStateList, f10));
        View f13 = bVar.f();
        f13.setClipToOutline(true);
        f13.setElevation(f11);
        f(bVar, f12);
    }

    @Override // v1.c
    public void f(b bVar, float f10) {
        p(bVar).g(f10, bVar.c(), bVar.e());
        l(bVar);
    }

    @Override // v1.c
    public ColorStateList g(b bVar) {
        return p(bVar).b();
    }

    @Override // v1.c
    public float h(b bVar) {
        return a(bVar) * 2.0f;
    }

    @Override // v1.c
    public float i(b bVar) {
        return p(bVar).c();
    }

    @Override // v1.c
    public void j(b bVar) {
        f(bVar, i(bVar));
    }

    @Override // v1.c
    public void k(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    @Override // v1.c
    public void l(b bVar) {
        if (!bVar.c()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float i10 = i(bVar);
        float a10 = a(bVar);
        int ceil = (int) Math.ceil(e.a(i10, a10, bVar.e()));
        int ceil2 = (int) Math.ceil(e.b(i10, a10, bVar.e()));
        bVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // v1.c
    public void m(b bVar) {
        f(bVar, i(bVar));
    }

    @Override // v1.c
    public void n(b bVar, float f10) {
        p(bVar).h(f10);
    }

    @Override // v1.c
    public void o() {
    }

    public final d p(b bVar) {
        return (d) bVar.d();
    }
}
