package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Map;
import o5.q;

/* loaded from: classes.dex */
public class b extends q {
    public static final String[] R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<i, PointF> S = new a(PointF.class, "topLeft");
    public static final Property<i, PointF> T = new C0481b(PointF.class, "bottomRight");
    public static final Property<View, PointF> U = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> V = new d(PointF.class, "topLeft");
    public static final Property<View, PointF> W = new e(PointF.class, "position");
    public static final m X = new m();
    public boolean Q = false;

    public class a extends Property<i, PointF> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: o5.b$b, reason: collision with other inner class name */
    public class C0481b extends Property<i, PointF> {
        public C0481b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    public class c extends Property<View, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            i0.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            i0.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            i0.d(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f27585a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f27585a = iVar;
            this.mViewBounds = iVar;
        }
    }

    public static class g extends AnimatorListenerAdapter implements q.h {

        /* renamed from: a, reason: collision with root package name */
        public final View f27586a;
        public final Rect b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27587c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f27588d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f27589e;

        /* renamed from: f, reason: collision with root package name */
        public final int f27590f;

        /* renamed from: g, reason: collision with root package name */
        public final int f27591g;

        /* renamed from: h, reason: collision with root package name */
        public final int f27592h;

        /* renamed from: i, reason: collision with root package name */
        public final int f27593i;

        /* renamed from: j, reason: collision with root package name */
        public final int f27594j;

        /* renamed from: k, reason: collision with root package name */
        public final int f27595k;

        /* renamed from: l, reason: collision with root package name */
        public final int f27596l;

        /* renamed from: m, reason: collision with root package name */
        public final int f27597m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f27598n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f27586a = view;
            this.b = rect;
            this.f27587c = z10;
            this.f27588d = rect2;
            this.f27589e = z11;
            this.f27590f = i10;
            this.f27591g = i11;
            this.f27592h = i12;
            this.f27593i = i13;
            this.f27594j = i14;
            this.f27595k = i15;
            this.f27596l = i16;
            this.f27597m = i17;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
            this.f27598n = true;
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            Rect rect = (Rect) this.f27586a.getTag(l.b);
            this.f27586a.setTag(l.b, null);
            this.f27586a.setClipBounds(rect);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            this.f27586a.setTag(l.b, this.f27586a.getClipBounds());
            this.f27586a.setClipBounds(this.f27589e ? null : this.f27588d);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f27598n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f27587c) {
                    rect = this.b;
                }
            } else if (!this.f27589e) {
                rect = this.f27588d;
            }
            this.f27586a.setClipBounds(rect);
            if (z10) {
                i0.d(this.f27586a, this.f27590f, this.f27591g, this.f27592h, this.f27593i);
            } else {
                i0.d(this.f27586a, this.f27594j, this.f27595k, this.f27596l, this.f27597m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int max = Math.max(this.f27592h - this.f27590f, this.f27596l - this.f27594j);
            int max2 = Math.max(this.f27593i - this.f27591g, this.f27597m - this.f27595k);
            int i10 = z10 ? this.f27594j : this.f27590f;
            int i11 = z10 ? this.f27595k : this.f27591g;
            i0.d(this.f27586a, i10, i11, max + i10, max2 + i11);
            this.f27586a.setClipBounds(z10 ? this.f27588d : this.b);
        }
    }

    public static class h extends x {

        /* renamed from: a, reason: collision with root package name */
        public boolean f27599a = false;
        public final ViewGroup b;

        public h(@NonNull ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // o5.x, o5.q.h
        public void a(@NonNull q qVar) {
            h0.b(this.b, false);
            this.f27599a = true;
        }

        @Override // o5.x, o5.q.h
        public void b(@NonNull q qVar) {
            h0.b(this.b, true);
        }

        @Override // o5.x, o5.q.h
        public void d(@NonNull q qVar) {
            h0.b(this.b, false);
        }

        @Override // o5.x, o5.q.h
        public void k(@NonNull q qVar) {
            if (!this.f27599a) {
                h0.b(this.b, false);
            }
            qVar.m0(this);
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f27600a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f27601c;

        /* renamed from: d, reason: collision with root package name */
        public int f27602d;

        /* renamed from: e, reason: collision with root package name */
        public final View f27603e;

        /* renamed from: f, reason: collision with root package name */
        public int f27604f;

        /* renamed from: g, reason: collision with root package name */
        public int f27605g;

        public i(View view) {
            this.f27603e = view;
        }

        public void a(PointF pointF) {
            this.f27601c = Math.round(pointF.x);
            this.f27602d = Math.round(pointF.y);
            int i10 = this.f27605g + 1;
            this.f27605g = i10;
            if (this.f27604f == i10) {
                b();
            }
        }

        public final void b() {
            i0.d(this.f27603e, this.f27600a, this.b, this.f27601c, this.f27602d);
            this.f27604f = 0;
            this.f27605g = 0;
        }

        public void c(PointF pointF) {
            this.f27600a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i10 = this.f27604f + 1;
            this.f27604f = i10;
            if (i10 == this.f27605g) {
                b();
            }
        }
    }

    public final void B0(d0 d0Var) {
        View view = d0Var.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        d0Var.f27618a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        d0Var.f27618a.put("android:changeBounds:parent", d0Var.b.getParent());
        if (this.Q) {
            d0Var.f27618a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // o5.q
    @NonNull
    public String[] V() {
        return R;
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        Rect rect;
        B0(d0Var);
        if (!this.Q || (rect = (Rect) d0Var.b.getTag(l.b)) == null) {
            return;
        }
        d0Var.f27618a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator a10;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c10;
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Map<String, Object> map = d0Var.f27618a;
        Map<String, Object> map2 = d0Var2.f27618a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = d0Var2.b;
        Rect rect2 = (Rect) d0Var.f27618a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) d0Var2.f27618a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) d0Var.f27618a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) d0Var2.f27618a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.Q) {
            i0.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                a10 = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                a10 = j.a(view, W, J().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i28 = rect5 == null ? 1 : i14;
            Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                view.setClipBounds(rect);
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", X, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimator.addListener(gVar);
                c(gVar);
            }
            c10 = c0.c(a10, objectAnimator);
        } else {
            i0.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                c10 = (i15 == i16 && i17 == i18) ? j.a(view, U, J().a(i19, i21, i20, i22)) : j.a(view, V, J().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                c10 = j.a(view, W, J().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator a11 = j.a(iVar, S, J().a(i15, i17, i16, i18));
                ObjectAnimator a12 = j.a(iVar, T, J().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a11, a12);
                animatorSet.addListener(new f(iVar));
                c10 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            h0.b(viewGroup4, true);
            N().c(new h(viewGroup4));
        }
        return c10;
    }
}
