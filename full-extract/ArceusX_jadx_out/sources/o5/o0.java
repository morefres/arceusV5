package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import o5.q;

/* loaded from: classes.dex */
public abstract class o0 extends q {
    public static final String[] R = {"android:visibility:visibility", "android:visibility:parent"};
    public int Q = 3;

    public static class a extends AnimatorListenerAdapter implements q.h {

        /* renamed from: a, reason: collision with root package name */
        public final View f27669a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f27670c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27671d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27672e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f27673f = false;

        public a(View view, int i10, boolean z10) {
            this.f27669a = view;
            this.b = i10;
            this.f27670c = (ViewGroup) view.getParent();
            this.f27671d = z10;
            e(true);
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            e(true);
            if (this.f27673f) {
                return;
            }
            i0.f(this.f27669a, 0);
        }

        public final void c() {
            if (!this.f27673f) {
                i0.f(this.f27669a, this.b);
                ViewGroup viewGroup = this.f27670c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            e(false);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            e(false);
            if (this.f27673f) {
                return;
            }
            i0.f(this.f27669a, this.b);
        }

        public final void e(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f27671d || this.f27672e == z10 || (viewGroup = this.f27670c) == null) {
                return;
            }
            this.f27672e = z10;
            h0.b(viewGroup, z10);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            qVar.m0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27673f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                i0.f(this.f27669a, 0);
                ViewGroup viewGroup = this.f27670c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter implements q.h {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f27674a;
        public final View b;

        /* renamed from: c, reason: collision with root package name */
        public final View f27675c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27676d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f27674a = viewGroup;
            this.b = view;
            this.f27675c = view2;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
            if (this.f27676d) {
                c();
            }
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
        }

        public final void c() {
            this.f27675c.setTag(l.f27655a, null);
            this.f27674a.getOverlay().remove(this.b);
            this.f27676d = false;
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            qVar.m0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f27674a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.b.getParent() == null) {
                this.f27674a.getOverlay().add(this.b);
            } else {
                o0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                this.f27675c.setTag(l.f27655a, this.b);
                this.f27674a.getOverlay().add(this.b);
                this.f27676d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            c();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f27678a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public int f27679c;

        /* renamed from: d, reason: collision with root package name */
        public int f27680d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f27681e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f27682f;
    }

    private void B0(d0 d0Var) {
        d0Var.f27618a.put("android:visibility:visibility", Integer.valueOf(d0Var.b.getVisibility()));
        d0Var.f27618a.put("android:visibility:parent", d0Var.b.getParent());
        int[] iArr = new int[2];
        d0Var.b.getLocationOnScreen(iArr);
        d0Var.f27618a.put("android:visibility:screenLocation", iArr);
    }

    public final c C0(d0 d0Var, d0 d0Var2) {
        c cVar = new c();
        cVar.f27678a = false;
        cVar.b = false;
        if (d0Var == null || !d0Var.f27618a.containsKey("android:visibility:visibility")) {
            cVar.f27679c = -1;
            cVar.f27681e = null;
        } else {
            cVar.f27679c = ((Integer) d0Var.f27618a.get("android:visibility:visibility")).intValue();
            cVar.f27681e = (ViewGroup) d0Var.f27618a.get("android:visibility:parent");
        }
        if (d0Var2 == null || !d0Var2.f27618a.containsKey("android:visibility:visibility")) {
            cVar.f27680d = -1;
            cVar.f27682f = null;
        } else {
            cVar.f27680d = ((Integer) d0Var2.f27618a.get("android:visibility:visibility")).intValue();
            cVar.f27682f = (ViewGroup) d0Var2.f27618a.get("android:visibility:parent");
        }
        if (d0Var != null && d0Var2 != null) {
            int i10 = cVar.f27679c;
            int i11 = cVar.f27680d;
            if (i10 != i11 || cVar.f27681e != cVar.f27682f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.b = false;
                        cVar.f27678a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.b = true;
                        cVar.f27678a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f27682f == null) {
                        cVar.b = false;
                        cVar.f27678a = true;
                        return cVar;
                    }
                    if (cVar.f27681e == null) {
                        cVar.b = true;
                        cVar.f27678a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (d0Var == null && cVar.f27680d == 0) {
                cVar.b = true;
                cVar.f27678a = true;
                return cVar;
            }
            if (d0Var2 == null && cVar.f27679c == 0) {
                cVar.b = false;
                cVar.f27678a = true;
            }
        }
        return cVar;
    }

    public abstract Animator D0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2);

    public Animator E0(@NonNull ViewGroup viewGroup, d0 d0Var, int i10, d0 d0Var2, int i11) {
        if ((this.Q & 1) != 1 || d0Var2 == null) {
            return null;
        }
        if (d0Var == null) {
            View view = (View) d0Var2.b.getParent();
            if (C0(E(view, false), W(view, false)).f27678a) {
                return null;
            }
        }
        return D0(viewGroup, d0Var2.b, d0Var, d0Var2);
    }

    public abstract Animator F0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r9.f27707w != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator G0(@androidx.annotation.NonNull android.view.ViewGroup r10, o5.d0 r11, int r12, o5.d0 r13, int r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.o0.G0(android.view.ViewGroup, o5.d0, int, o5.d0, int):android.animation.Animator");
    }

    public void H0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Q = i10;
    }

    @Override // o5.q
    public String[] V() {
        return R;
    }

    @Override // o5.q
    public boolean Z(d0 d0Var, d0 d0Var2) {
        if (d0Var == null && d0Var2 == null) {
            return false;
        }
        if (d0Var != null && d0Var2 != null && d0Var2.f27618a.containsKey("android:visibility:visibility") != d0Var.f27618a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c C0 = C0(d0Var, d0Var2);
        return C0.f27678a && (C0.f27679c == 0 || C0.f27680d == 0);
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        B0(d0Var);
    }

    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        c C0 = C0(d0Var, d0Var2);
        if (!C0.f27678a) {
            return null;
        }
        if (C0.f27681e == null && C0.f27682f == null) {
            return null;
        }
        return C0.b ? E0(viewGroup, d0Var, C0.f27679c, d0Var2, C0.f27680d) : G0(viewGroup, d0Var, C0.f27679c, d0Var2, C0.f27680d);
    }
}
