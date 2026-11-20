package r3;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    public static final Interpolator f30082x = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f30083a;
    public int b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f30085d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f30086e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f30087f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f30088g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f30089h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f30090i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f30091j;

    /* renamed from: k, reason: collision with root package name */
    public int f30092k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f30093l;

    /* renamed from: m, reason: collision with root package name */
    public float f30094m;

    /* renamed from: n, reason: collision with root package name */
    public float f30095n;

    /* renamed from: o, reason: collision with root package name */
    public int f30096o;

    /* renamed from: p, reason: collision with root package name */
    public final int f30097p;

    /* renamed from: q, reason: collision with root package name */
    public int f30098q;

    /* renamed from: r, reason: collision with root package name */
    public OverScroller f30099r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0532c f30100s;

    /* renamed from: t, reason: collision with root package name */
    public View f30101t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30102u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f30103v;

    /* renamed from: c, reason: collision with root package name */
    public int f30084c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f30104w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: r3.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0532c {
        public abstract int a(@NonNull View view, int i10, int i11);

        public abstract int b(@NonNull View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(@NonNull View view) {
            return 0;
        }

        public int e(@NonNull View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(@NonNull View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(@NonNull View view, int i10, int i11, int i12, int i13);

        public abstract void l(@NonNull View view, float f10, float f11);

        public abstract boolean m(@NonNull View view, int i10);
    }

    public c(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC0532c abstractC0532c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0532c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f30103v = viewGroup;
        this.f30100s = abstractC0532c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f30097p = i10;
        this.f30096o = i10;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.f30094m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f30095n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f30099r = new OverScroller(context, f30082x);
    }

    public static c l(@NonNull ViewGroup viewGroup, float f10, @NonNull AbstractC0532c abstractC0532c) {
        c m10 = m(viewGroup, abstractC0532c);
        m10.b = (int) (m10.b * (1.0f / f10));
        return m10;
    }

    public static c m(@NonNull ViewGroup viewGroup, @NonNull AbstractC0532c abstractC0532c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0532c);
    }

    public final void A() {
        this.f30093l.computeCurrentVelocity(1000, this.f30094m);
        n(e(this.f30093l.getXVelocity(this.f30084c), this.f30095n, this.f30094m), e(this.f30093l.getYVelocity(this.f30084c), this.f30095n, this.f30094m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [r3.c$c] */
    public final void B(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = (c10 ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f30090i;
            iArr[i10] = iArr[i10] | r02;
            this.f30100s.f(r02, i10);
        }
    }

    public final void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f30085d;
        this.f30087f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f30086e;
        this.f30088g[i10] = f11;
        fArr2[i10] = f11;
        this.f30089h[i10] = t((int) f10, (int) f11);
        this.f30092k |= 1 << i10;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f30087f[pointerId] = x10;
                this.f30088g[pointerId] = y10;
            }
        }
    }

    public void E(int i10) {
        this.f30103v.removeCallbacks(this.f30104w);
        if (this.f30083a != i10) {
            this.f30083a = i10;
            this.f30100s.j(i10);
            if (this.f30083a == 0) {
                this.f30101t = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f30102u) {
            return s(i10, i11, (int) this.f30093l.getXVelocity(this.f30084c), (int) this.f30093l.getYVelocity(this.f30084c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G(@androidx.annotation.NonNull android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(@NonNull View view, int i10, int i11) {
        this.f30101t = view;
        this.f30084c = -1;
        boolean s8 = s(i10, i11, 0, 0);
        if (!s8 && this.f30083a == 0 && this.f30101t != null) {
            this.f30101t = null;
        }
        return s8;
    }

    public boolean I(View view, int i10) {
        if (view == this.f30101t && this.f30084c == i10) {
            return true;
        }
        if (view == null || !this.f30100s.m(view, i10)) {
            return false;
        }
        this.f30084c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f30084c = -1;
        g();
        VelocityTracker velocityTracker = this.f30093l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30093l = null;
        }
    }

    public void b(@NonNull View view, int i10) {
        if (view.getParent() == this.f30103v) {
            this.f30101t = view;
            this.f30084c = i10;
            this.f30100s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f30103v + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f30089h[i10] & i11) == i11 && (this.f30098q & i11) != 0 && (this.f30091j[i10] & i11) != i11 && (this.f30090i[i10] & i11) != i11) {
            int i12 = this.b;
            if (abs > i12 || abs2 > i12) {
                if (abs < abs2 * 0.5f && this.f30100s.g(i11)) {
                    int[] iArr = this.f30091j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f30090i[i10] & i11) == 0 && abs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f30100s.d(view) > 0;
        boolean z11 = this.f30100s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.b) : z11 && Math.abs(f11) > ((float) this.b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.b;
        return f12 > ((float) (i10 * i10));
    }

    public final float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void g() {
        float[] fArr = this.f30085d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f30086e, 0.0f);
        Arrays.fill(this.f30087f, 0.0f);
        Arrays.fill(this.f30088g, 0.0f);
        Arrays.fill(this.f30089h, 0);
        Arrays.fill(this.f30090i, 0);
        Arrays.fill(this.f30091j, 0);
        this.f30092k = 0;
    }

    public final void h(int i10) {
        if (this.f30085d == null || !w(i10)) {
            return;
        }
        this.f30085d[i10] = 0.0f;
        this.f30086e[i10] = 0.0f;
        this.f30087f[i10] = 0.0f;
        this.f30088g[i10] = 0.0f;
        this.f30089h[i10] = 0;
        this.f30090i[i10] = 0;
        this.f30091j[i10] = 0;
        this.f30092k = (~(1 << i10)) & this.f30092k;
    }

    public final int i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f30103v.getWidth();
        float f10 = width / 2;
        float o8 = f10 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(o8 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int f14 = f(i12, (int) this.f30095n, (int) this.f30094m);
        int f15 = f(i13, (int) this.f30095n, (int) this.f30094m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(f14);
        int abs4 = Math.abs(f15);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (f14 != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f16 = f10 / f11;
        if (f15 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((i(i10, f14, this.f30100s.d(view)) * f16) + (i(i11, f15, this.f30100s.e(view)) * (f12 / f13)));
    }

    public boolean k(boolean z10) {
        if (this.f30083a == 2) {
            boolean computeScrollOffset = this.f30099r.computeScrollOffset();
            int currX = this.f30099r.getCurrX();
            int currY = this.f30099r.getCurrY();
            int left = currX - this.f30101t.getLeft();
            int top = currY - this.f30101t.getTop();
            if (left != 0) {
                o0.W(this.f30101t, left);
            }
            if (top != 0) {
                o0.X(this.f30101t, top);
            }
            if (left != 0 || top != 0) {
                this.f30100s.k(this.f30101t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f30099r.getFinalX() && currY == this.f30099r.getFinalY()) {
                this.f30099r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f30103v.post(this.f30104w);
                } else {
                    E(0);
                }
            }
        }
        return this.f30083a == 2;
    }

    public final void n(float f10, float f11) {
        this.f30102u = true;
        this.f30100s.l(this.f30101t, f10, f11);
        this.f30102u = false;
        if (this.f30083a == 1) {
            E(0);
        }
    }

    public final float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void p(int i10, int i11, int i12, int i13) {
        int left = this.f30101t.getLeft();
        int top = this.f30101t.getTop();
        if (i12 != 0) {
            i10 = this.f30100s.a(this.f30101t, i10, i12);
            o0.W(this.f30101t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f30100s.b(this.f30101t, i11, i13);
            o0.X(this.f30101t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f30100s.k(this.f30101t, i14, i15, i14 - left, i15 - top);
    }

    public final void q(int i10) {
        float[] fArr = this.f30085d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f30086e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f30087f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f30088g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f30089h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f30090i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f30091j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f30085d = fArr2;
            this.f30086e = fArr3;
            this.f30087f = fArr4;
            this.f30088g = fArr5;
            this.f30089h = iArr;
            this.f30090i = iArr2;
            this.f30091j = iArr3;
        }
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f30103v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f30103v.getChildAt(this.f30100s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f30101t.getLeft();
        int top = this.f30101t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f30099r.abortAnimation();
            E(0);
            return false;
        }
        this.f30099r.startScroll(left, top, i14, i15, j(this.f30101t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    public final int t(int i10, int i11) {
        int i12 = i10 < this.f30103v.getLeft() + this.f30096o ? 1 : 0;
        if (i11 < this.f30103v.getTop() + this.f30096o) {
            i12 |= 4;
        }
        if (i10 > this.f30103v.getRight() - this.f30096o) {
            i12 |= 2;
        }
        return i11 > this.f30103v.getBottom() - this.f30096o ? i12 | 8 : i12;
    }

    public int u() {
        return this.b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f30101t, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f30092k) != 0;
    }

    public final boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(@NonNull MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f30093l == null) {
            this.f30093l = VelocityTracker.obtain();
        }
        this.f30093l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r8 = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(r8, pointerId);
            int i12 = this.f30089h[pointerId];
            int i13 = this.f30098q;
            if ((i12 & i13) != 0) {
                this.f30100s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f30083a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f30083a == 1) {
                if (x(this.f30084c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f30084c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f30087f;
                    int i14 = this.f30084c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f30088g[i14]);
                    p(this.f30101t.getLeft() + i15, this.f30101t.getTop() + i16, i15, i16);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f30085d[pointerId2];
                    float f11 = y12 - this.f30086e[pointerId2];
                    B(f10, f11, pointerId2);
                    if (this.f30083a != 1) {
                        View r10 = r((int) x12, (int) y12);
                        if (d(r10, f10, f11) && I(r10, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f30083a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            C(x13, y13, pointerId3);
            if (this.f30083a != 0) {
                if (v((int) x13, (int) y13)) {
                    I(this.f30101t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x13, (int) y13), pointerId3);
                int i17 = this.f30089h[pointerId3];
                int i18 = this.f30098q;
                if ((i17 & i18) != 0) {
                    this.f30100s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f30083a == 1 && pointerId4 == this.f30084c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f30084c) {
                    View r11 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f30101t;
                    if (r11 == view && I(view, pointerId5)) {
                        i10 = this.f30084c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                A();
            }
        }
        h(pointerId4);
    }
}
