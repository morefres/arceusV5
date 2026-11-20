package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class p extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f3095d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3096e;

    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        public final p f3097d;

        /* renamed from: e, reason: collision with root package name */
        public Map<View, androidx.core.view.a> f3098e = new WeakHashMap();

        public a(@NonNull p pVar) {
            this.f3097d = pVar;
        }

        @Override // androidx.core.view.a
        public boolean a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3098e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public y2.q b(@NonNull View view) {
            androidx.core.view.a aVar = this.f3098e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3098e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) y2.p pVar) {
            if (this.f3097d.o() || this.f3097d.f3095d.getLayoutManager() == null) {
                super.g(view, pVar);
                return;
            }
            this.f3097d.f3095d.getLayoutManager().T0(view, pVar);
            androidx.core.view.a aVar = this.f3098e.get(view);
            if (aVar != null) {
                aVar.g(view, pVar);
            } else {
                super.g(view, pVar);
            }
        }

        @Override // androidx.core.view.a
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3098e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3098e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f3097d.o() || this.f3097d.f3095d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = this.f3098e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f3097d.f3095d.getLayoutManager().n1(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(@NonNull View view, int i10) {
            androidx.core.view.a aVar = this.f3098e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3098e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public androidx.core.view.a n(View view) {
            return this.f3098e.remove(view);
        }

        public void o(View view) {
            androidx.core.view.a l10 = o0.l(view);
            if (l10 == null || l10 == this) {
                return;
            }
            this.f3098e.put(view, l10);
        }
    }

    public p(@NonNull RecyclerView recyclerView) {
        this.f3095d = recyclerView;
        androidx.core.view.a n10 = n();
        if (n10 == null || !(n10 instanceof a)) {
            this.f3096e = new a(this);
        } else {
            this.f3096e = (a) n10;
        }
    }

    @Override // androidx.core.view.a
    public void f(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().P0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) y2.p pVar) {
        super.g(view, pVar);
        if (o() || this.f3095d.getLayoutManager() == null) {
            return;
        }
        this.f3095d.getLayoutManager().S0(pVar);
    }

    @Override // androidx.core.view.a
    public boolean j(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3095d.getLayoutManager() == null) {
            return false;
        }
        return this.f3095d.getLayoutManager().l1(i10, bundle);
    }

    @NonNull
    public androidx.core.view.a n() {
        return this.f3096e;
    }

    public boolean o() {
        return this.f3095d.v0();
    }
}
