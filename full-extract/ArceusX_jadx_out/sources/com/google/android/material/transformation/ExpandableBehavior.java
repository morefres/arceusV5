package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f8401a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8402a;
        public final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yc.a f8403c;

        public a(View view, int i10, yc.a aVar) {
            this.f8402a = view;
            this.b = i10;
            this.f8403c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f8402a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8401a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                yc.a aVar = this.f8403c;
                expandableBehavior.L((View) aVar, this.f8402a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f8401a = 0;
    }

    public final boolean J(boolean z10) {
        if (!z10) {
            return this.f8401a == 1;
        }
        int i10 = this.f8401a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yc.a K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> r8 = coordinatorLayout.r(view);
        int size = r8.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = r8.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (yc.a) view2;
            }
        }
        return null;
    }

    public abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        yc.a aVar = (yc.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f8401a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        yc.a K;
        if (o0.R(view) || (K = K(coordinatorLayout, view)) == null || !J(K.a())) {
            return false;
        }
        int i11 = K.a() ? 1 : 2;
        this.f8401a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, K));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8401a = 0;
    }
}
