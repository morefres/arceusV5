package b3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import b3.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3737c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f3738a;
    public c b;

    public class a implements b.a.InterfaceC0069a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f3739a;
        public final /* synthetic */ View b;

        public a(FrameLayout.LayoutParams layoutParams, View view) {
            this.f3739a = layoutParams;
            this.b = view;
        }

        @Override // b3.b.a.InterfaceC0069a
        public void a(int i10) {
            FrameLayout.LayoutParams layoutParams = this.f3739a;
            layoutParams.height = i10;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void b(boolean z10) {
            this.b.setVisibility(z10 ? 0 : 4);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void c(Insets insets) {
            FrameLayout.LayoutParams layoutParams = this.f3739a;
            layoutParams.leftMargin = insets.left;
            layoutParams.topMargin = insets.top;
            layoutParams.rightMargin = insets.right;
            layoutParams.bottomMargin = insets.bottom;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void d(float f10) {
            this.b.setAlpha(f10);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void e(int i10) {
            FrameLayout.LayoutParams layoutParams = this.f3739a;
            layoutParams.width = i10;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void f(float f10) {
            this.b.setTranslationX(f10);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void g(float f10) {
            this.b.setTranslationY(f10);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void h(Drawable drawable) {
            this.b.setBackground(drawable);
        }
    }

    public d(Context context, List<b> list) {
        super(context);
        this.f3738a = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(j2.e.R);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(j2.e.R, gVar);
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r7, int r8, b3.b r9) {
        /*
            r6 = this;
            b3.b$a r0 = r9.c()
            int r1 = r9.e()
            r2 = 1
            r3 = 4
            r4 = -1
            if (r1 == r2) goto L48
            r2 = 2
            if (r1 == r2) goto L41
            if (r1 == r3) goto L38
            r2 = 8
            if (r1 != r2) goto L1d
            int r9 = r0.m()
            r1 = 80
            goto L4e
        L1d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unexpected side: "
            r8.append(r0)
            int r9 = r9.e()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            int r9 = r0.q()
            r1 = 5
        L3d:
            r5 = r4
            r4 = r9
            r9 = r5
            goto L4e
        L41:
            int r9 = r0.m()
            r1 = 48
            goto L4e
        L48:
            int r9 = r0.q()
            r1 = 3
            goto L3d
        L4e:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r4, r9, r1)
            androidx.core.graphics.Insets r9 = r0.n()
            int r1 = r9.left
            r2.leftMargin = r1
            int r1 = r9.top
            r2.topMargin = r1
            int r1 = r9.right
            r2.rightMargin = r1
            int r9 = r9.bottom
            r2.bottomMargin = r9
            android.view.View r9 = new android.view.View
            r9.<init>(r7)
            java.lang.Object r7 = b3.d.f3737c
            r9.setTag(r7)
            float r7 = r0.o()
            r9.setTranslationX(r7)
            float r7 = r0.p()
            r9.setTranslationY(r7)
            float r7 = r0.k()
            r9.setAlpha(r7)
            boolean r7 = r0.r()
            if (r7 == 0) goto L8d
            r3 = 0
        L8d:
            r9.setVisibility(r3)
            android.graphics.drawable.Drawable r7 = r0.l()
            r9.setBackground(r7)
            b3.d$a r7 = new b3.d$a
            r7.<init>(r2, r9)
            r0.t(r7)
            r6.addView(r9, r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.d.a(android.content.Context, int, b3.b):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f3737c) {
            c cVar = this.b;
            int childCount = getChildCount() - (cVar != null ? cVar.i() : 0);
            if (i10 > childCount || i10 < 0) {
                i10 = childCount;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f3738a.isEmpty()) {
            return;
        }
        this.b = new c(getOrInstallSystemBarStateMonitor(), this.f3738a);
        int childCount = getChildCount();
        int i10 = this.b.i();
        for (int i11 = 0; i11 < i10; i11++) {
            a(getContext(), i11 + childCount, this.b.h(i11));
        }
    }

    public final void c() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(j2.e.R);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.k()) {
                return;
            }
            gVar.h();
            viewGroup.setTag(j2.e.R, null);
        }
    }

    public final void d() {
        if (this.b != null) {
            removeViews(getChildCount() - this.b.i(), this.b.i());
            int i10 = this.b.i();
            for (int i11 = 0; i11 < i10; i11++) {
                this.b.h(i11).c().t(null);
            }
            this.b.g();
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            d();
        }
        b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c();
    }

    public void setProtections(List<b> list) {
        this.f3738a.clear();
        this.f3738a.addAll(list);
        if (isAttachedToWindow()) {
            d();
            b();
            requestApplyInsets();
        }
    }
}
