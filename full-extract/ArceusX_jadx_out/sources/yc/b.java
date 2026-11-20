package yc;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f36578a;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f36579c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f36578a = (View) aVar;
    }

    public final void a() {
        ViewParent parent = this.f36578a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f36578a);
        }
    }

    public int b() {
        return this.f36579c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(@NonNull Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.f36579c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            a();
        }
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.f36579c);
        return bundle;
    }

    public void f(int i10) {
        this.f36579c = i10;
    }
}
