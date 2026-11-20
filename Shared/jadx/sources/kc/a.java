package kc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;

/* loaded from: classes2.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d, reason: collision with root package name */
    public Runnable f22483d;

    /* renamed from: e, reason: collision with root package name */
    public OverScroller f22484e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22485f;

    /* renamed from: g, reason: collision with root package name */
    public int f22486g;

    /* renamed from: h, reason: collision with root package name */
    public int f22487h;

    /* renamed from: i, reason: collision with root package name */
    public int f22488i;

    /* renamed from: j, reason: collision with root package name */
    public VelocityTracker f22489j;

    /* renamed from: kc.a$a, reason: collision with other inner class name */
    public class RunnableC0396a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f22490a;
        public final V b;

        public RunnableC0396a(CoordinatorLayout coordinatorLayout, V v5) {
            this.f22490a = coordinatorLayout;
            this.b = v5;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.b == null || (overScroller = a.this.f22484e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.R(this.f22490a, this.b);
                return;
            }
            a aVar = a.this;
            aVar.T(this.f22490a, this.b, aVar.f22484e.getCurrY());
            o0.e0(this.b, this);
        }
    }

    public a() {
        this.f22486g = -1;
        this.f22488i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r10, @androidx.annotation.NonNull V r11, @androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r8
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f22486g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f22487h = r1
            goto L4b
        L2d:
            int r1 = r9.f22486g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f22487h
            int r3 = r3 - r1
            r9.f22487h = r1
            int r4 = r9.O(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.S(r1, r2, r3, r4, r5)
        L4b:
            r1 = r7
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f22489j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f22489j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f22489j
            int r3 = r9.f22486g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.P(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.N(r1, r2, r3, r4, r5)
            r1 = r8
            goto L72
        L71:
            r1 = r7
        L72:
            r9.f22485f = r7
            r9.f22486g = r6
            android.view.VelocityTracker r2 = r9.f22489j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f22489j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f22489j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f22485f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.a.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean L(V v5) {
        return false;
    }

    public final void M() {
        if (this.f22489j == null) {
            this.f22489j = VelocityTracker.obtain();
        }
    }

    public final boolean N(CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, float f10) {
        Runnable runnable = this.f22483d;
        if (runnable != null) {
            v5.removeCallbacks(runnable);
            this.f22483d = null;
        }
        if (this.f22484e == null) {
            this.f22484e = new OverScroller(v5.getContext());
        }
        this.f22484e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f22484e.computeScrollOffset()) {
            R(coordinatorLayout, v5);
            return false;
        }
        RunnableC0396a runnableC0396a = new RunnableC0396a(coordinatorLayout, v5);
        this.f22483d = runnableC0396a;
        o0.e0(v5, runnableC0396a);
        return true;
    }

    public int O(@NonNull V v5) {
        return -v5.getHeight();
    }

    public int P(@NonNull V v5) {
        return v5.getHeight();
    }

    public int Q() {
        return I();
    }

    public void R(CoordinatorLayout coordinatorLayout, V v5) {
    }

    public final int S(CoordinatorLayout coordinatorLayout, V v5, int i10, int i11, int i12) {
        return U(coordinatorLayout, v5, Q() - i10, i11, i12);
    }

    public int T(CoordinatorLayout coordinatorLayout, V v5, int i10) {
        return U(coordinatorLayout, v5, i10, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
    }

    public int U(CoordinatorLayout coordinatorLayout, V v5, int i10, int i11, int i12) {
        int c10;
        int I = I();
        if (i11 == 0 || I < i11 || I > i12 || I == (c10 = s2.a.c(i10, i11, i12))) {
            return 0;
        }
        K(c10);
        return I - c10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f22488i < 0) {
            this.f22488i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f22485f) {
            int i10 = this.f22486g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f22487h) > this.f22488i) {
                this.f22487h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f22486g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(v5) && coordinatorLayout.B(v5, x10, y11);
            this.f22485f = z10;
            if (z10) {
                this.f22487h = y11;
                this.f22486g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f22484e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f22484e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f22489j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22486g = -1;
        this.f22488i = -1;
    }
}
