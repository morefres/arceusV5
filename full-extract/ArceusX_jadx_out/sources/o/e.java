package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import o.b;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: c, reason: collision with root package name */
    public Context f27460c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f27461d;

    /* renamed from: e, reason: collision with root package name */
    public b.a f27462e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference<View> f27463f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27464g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27465h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f27466i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f27460c = context;
        this.f27461d = actionBarContextView;
        this.f27462e = aVar;
        androidx.appcompat.view.menu.e T = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f27466i = T;
        T.S(this);
        this.f27465h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        return this.f27462e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        k();
        this.f27461d.l();
    }

    @Override // o.b
    public void c() {
        if (this.f27464g) {
            return;
        }
        this.f27464g = true;
        this.f27462e.b(this);
    }

    @Override // o.b
    public View d() {
        WeakReference<View> weakReference = this.f27463f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.b
    public Menu e() {
        return this.f27466i;
    }

    @Override // o.b
    public MenuInflater f() {
        return new g(this.f27461d.getContext());
    }

    @Override // o.b
    public CharSequence g() {
        return this.f27461d.getSubtitle();
    }

    @Override // o.b
    public CharSequence i() {
        return this.f27461d.getTitle();
    }

    @Override // o.b
    public void k() {
        this.f27462e.d(this, this.f27466i);
    }

    @Override // o.b
    public boolean l() {
        return this.f27461d.j();
    }

    @Override // o.b
    public void m(View view) {
        this.f27461d.setCustomView(view);
        this.f27463f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // o.b
    public void n(int i10) {
        o(this.f27460c.getString(i10));
    }

    @Override // o.b
    public void o(CharSequence charSequence) {
        this.f27461d.setSubtitle(charSequence);
    }

    @Override // o.b
    public void q(int i10) {
        r(this.f27460c.getString(i10));
    }

    @Override // o.b
    public void r(CharSequence charSequence) {
        this.f27461d.setTitle(charSequence);
    }

    @Override // o.b
    public void s(boolean z10) {
        super.s(z10);
        this.f27461d.setTitleOptional(z10);
    }
}
