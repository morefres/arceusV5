package r3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;
import java.util.ArrayList;
import java.util.List;
import r3.b;
import w1.k;
import y2.p;
import y2.q;
import y2.r;

/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f30066n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, EditorInfoCompat.IME_FLAG_FORCE_ASCII);

    /* renamed from: o, reason: collision with root package name */
    public static final b.a<p> f30067o = new C0530a();

    /* renamed from: p, reason: collision with root package name */
    public static final b.InterfaceC0531b<k<p>, p> f30068p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f30073h;

    /* renamed from: i, reason: collision with root package name */
    public final View f30074i;

    /* renamed from: j, reason: collision with root package name */
    public c f30075j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f30069d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f30070e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f30071f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f30072g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f30076k = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* renamed from: l, reason: collision with root package name */
    public int f30077l = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* renamed from: m, reason: collision with root package name */
    public int f30078m = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* renamed from: r3.a$a, reason: collision with other inner class name */
    public class C0530a implements b.a<p> {
        @Override // r3.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, Rect rect) {
            pVar.j(rect);
        }
    }

    public class b implements b.InterfaceC0531b<k<p>, p> {
        @Override // r3.b.InterfaceC0531b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p a(k<p> kVar, int i10) {
            return kVar.k(i10);
        }

        @Override // r3.b.InterfaceC0531b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(k<p> kVar) {
            return kVar.j();
        }
    }

    public class c extends q {
        public c() {
        }

        @Override // y2.q
        public p b(int i10) {
            return p.a0(a.this.H(i10));
        }

        @Override // y2.q
        public p d(int i10) {
            int i11 = i10 == 2 ? a.this.f30076k : a.this.f30077l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // y2.q
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f30074i = view;
        this.f30073h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (o0.x(view) == 0) {
            o0.w0(view, 1);
        }
    }

    public static Rect D(@NonNull View view, int i10, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f30077l;
    }

    public abstract int B(float f10, float f11);

    public abstract void C(List<Integer> list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f30074i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f30074i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i10, Rect rect) {
        p pVar;
        k<p> y10 = y();
        int i11 = this.f30077l;
        int i12 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        p e10 = i11 == Integer.MIN_VALUE ? null : y10.e(i11);
        if (i10 == 1 || i10 == 2) {
            pVar = (p) r3.b.d(y10, f30068p, f30067o, e10, i10, o0.z(this.f30074i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f30077l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f30074i, i10, rect2);
            }
            pVar = (p) r3.b.c(y10, f30068p, f30067o, e10, rect2, i10);
        }
        if (pVar != null) {
            i12 = y10.h(y10.f(pVar));
        }
        return T(i12);
    }

    @NonNull
    public p H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f30077l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    public abstract boolean J(int i10, int i11, Bundle bundle);

    public void K(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i10, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public abstract void M(@NonNull p pVar);

    public abstract void N(int i10, @NonNull p pVar);

    public abstract void O(int i10, boolean z10);

    public boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    public final boolean R(int i10, Bundle bundle) {
        return o0.b0(this.f30074i, i10, bundle);
    }

    public final boolean S(int i10) {
        int i11;
        if (!this.f30073h.isEnabled() || !this.f30073h.isTouchExplorationEnabled() || (i11 = this.f30076k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f30076k = i10;
        this.f30074i.invalidate();
        U(i10, 32768);
        return true;
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f30074i.isFocused() && !this.f30074i.requestFocus()) || (i11 = this.f30077l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f30077l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f30073h.isEnabled() || (parent = this.f30074i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f30074i, q(i10, i11));
    }

    public final void V(int i10) {
        int i11 = this.f30078m;
        if (i11 == i10) {
            return;
        }
        this.f30078m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    @Override // androidx.core.view.a
    public q b(View view) {
        if (this.f30075j == null) {
            this.f30075j = new c();
        }
        return this.f30075j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, p pVar) {
        super.g(view, pVar);
        M(pVar);
    }

    public final boolean n(int i10) {
        if (this.f30076k != i10) {
            return false;
        }
        this.f30076k = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f30074i.invalidate();
        U(i10, 65536);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f30077l != i10) {
            return false;
        }
        this.f30077l = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean p() {
        int i10 = this.f30077l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    public final AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    public final AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        p H = H(i10);
        obtain.getText().add(H.B());
        obtain.setContentDescription(H.s());
        obtain.setScrollable(H.T());
        obtain.setPassword(H.S());
        obtain.setEnabled(H.L());
        obtain.setChecked(H.I());
        L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.p());
        r.c(obtain, this.f30074i, i10);
        obtain.setPackageName(this.f30074i.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f30074i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @NonNull
    public final p t(int i10) {
        p Y = p.Y();
        Y.r0(true);
        Y.t0(true);
        Y.l0("android.view.View");
        Rect rect = f30066n;
        Y.g0(rect);
        Y.h0(rect);
        Y.C0(this.f30074i);
        N(i10, Y);
        if (Y.B() == null && Y.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Y.j(this.f30070e);
        if (this.f30070e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int h10 = Y.h();
        if ((h10 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((h10 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        Y.A0(this.f30074i.getContext().getPackageName());
        Y.I0(this.f30074i, i10);
        if (this.f30076k == i10) {
            Y.e0(true);
            Y.a(128);
        } else {
            Y.e0(false);
            Y.a(64);
        }
        boolean z10 = this.f30077l == i10;
        if (z10) {
            Y.a(2);
        } else if (Y.N()) {
            Y.a(1);
        }
        Y.u0(z10);
        this.f30074i.getLocationOnScreen(this.f30072g);
        Y.k(this.f30069d);
        if (this.f30069d.equals(rect)) {
            Y.j(this.f30069d);
            if (Y.b != -1) {
                p Y2 = p.Y();
                for (int i11 = Y.b; i11 != -1; i11 = Y2.b) {
                    Y2.D0(this.f30074i, -1);
                    Y2.g0(f30066n);
                    N(i11, Y2);
                    Y2.j(this.f30070e);
                    Rect rect2 = this.f30069d;
                    Rect rect3 = this.f30070e;
                    rect2.offset(rect3.left, rect3.top);
                }
                Y2.c0();
            }
            this.f30069d.offset(this.f30072g[0] - this.f30074i.getScrollX(), this.f30072g[1] - this.f30074i.getScrollY());
        }
        if (this.f30074i.getLocalVisibleRect(this.f30071f)) {
            this.f30071f.offset(this.f30072g[0] - this.f30074i.getScrollX(), this.f30072g[1] - this.f30074i.getScrollY());
            if (this.f30069d.intersect(this.f30071f)) {
                Y.h0(this.f30069d);
                if (E(this.f30069d)) {
                    Y.M0(true);
                }
            }
        }
        return Y;
    }

    @NonNull
    public final p u() {
        p Z = p.Z(this.f30074i);
        o0.Z(this.f30074i, Z);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (Z.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Z.c(this.f30074i, ((Integer) arrayList.get(i10)).intValue());
        }
        return Z;
    }

    public final boolean v(@NonNull MotionEvent motionEvent) {
        if (this.f30073h.isEnabled() && this.f30073h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f30078m == Integer.MIN_VALUE) {
                    return false;
                }
                V(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                return true;
            }
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean w(@NonNull KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case MotionEventCompat.AXIS_WHEEL /* 21 */:
                        case MotionEventCompat.AXIS_GAS /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                int F = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && G(F, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.f30076k;
    }

    public final k<p> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        k<p> kVar = new k<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            kVar.i(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return kVar;
    }

    public final void z(int i10, Rect rect) {
        H(i10).j(rect);
    }
}
