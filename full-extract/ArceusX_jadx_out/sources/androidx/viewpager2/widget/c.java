package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends RecyclerView.v {

    /* renamed from: a, reason: collision with root package name */
    public ViewPager2.i f3236a;

    @NonNull
    public final ViewPager2 b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f3237c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayoutManager f3238d;

    /* renamed from: e, reason: collision with root package name */
    public int f3239e;

    /* renamed from: f, reason: collision with root package name */
    public int f3240f;

    /* renamed from: g, reason: collision with root package name */
    public a f3241g;

    /* renamed from: h, reason: collision with root package name */
    public int f3242h;

    /* renamed from: i, reason: collision with root package name */
    public int f3243i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3244j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3245k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3246l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3247m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3248a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public int f3249c;

        public void a() {
            this.f3248a = -1;
            this.b = 0.0f;
            this.f3249c = 0;
        }
    }

    public c(@NonNull ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.f3208j;
        this.f3237c = recyclerView;
        this.f3238d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f3241g = new a();
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void a(@NonNull RecyclerView recyclerView, int i10) {
        if (!(this.f3239e == 1 && this.f3240f == 1) && i10 == 1) {
            p(false);
            return;
        }
        if (k() && i10 == 2) {
            if (this.f3245k) {
                e(2);
                this.f3244j = true;
                return;
            }
            return;
        }
        if (k() && i10 == 0) {
            q();
            if (this.f3245k) {
                a aVar = this.f3241g;
                if (aVar.f3249c == 0) {
                    int i11 = this.f3242h;
                    int i12 = aVar.f3248a;
                    if (i11 != i12) {
                        d(i12);
                    }
                }
            } else {
                int i13 = this.f3241g.f3248a;
                if (i13 != -1) {
                    c(i13, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f3239e == 2 && i10 == 0 && this.f3246l) {
            q();
            a aVar2 = this.f3241g;
            if (aVar2.f3249c == 0) {
                int i14 = this.f3243i;
                int i15 = aVar2.f3248a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    d(i15);
                }
                e(0);
                n();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r5 < 0) == r3.b.d()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f3245k = r4
            r3.q()
            boolean r0 = r3.f3244j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f3244j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.b
            boolean r6 = r6.d()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.c$a r5 = r3.f3241g
            int r6 = r5.f3249c
            if (r6 == 0) goto L29
            int r5 = r5.f3248a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.c$a r5 = r3.f3241g
            int r5 = r5.f3248a
        L2d:
            r3.f3243i = r5
            int r6 = r3.f3242h
            if (r6 == r5) goto L45
            r3.d(r5)
            goto L45
        L37:
            int r5 = r3.f3239e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.c$a r5 = r3.f3241g
            int r5 = r5.f3248a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.d(r5)
        L45:
            androidx.viewpager2.widget.c$a r5 = r3.f3241g
            int r6 = r5.f3248a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.b
            int r5 = r5.f3249c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.c$a r5 = r3.f3241g
            int r6 = r5.f3248a
            int r0 = r3.f3243i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f3249c
            if (r5 != 0) goto L6b
            int r5 = r3.f3240f
            if (r5 == r4) goto L6b
            r3.e(r2)
            r3.n()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f3236a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    public final void d(int i10) {
        ViewPager2.i iVar = this.f3236a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    public final void e(int i10) {
        if ((this.f3239e == 3 && this.f3240f == 0) || this.f3240f == i10) {
            return;
        }
        this.f3240f = i10;
        ViewPager2.i iVar = this.f3236a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    public final int f() {
        return this.f3238d.d2();
    }

    public double g() {
        q();
        a aVar = this.f3241g;
        return aVar.f3248a + aVar.b;
    }

    public int h() {
        return this.f3240f;
    }

    public boolean i() {
        return this.f3247m;
    }

    public boolean j() {
        return this.f3240f == 0;
    }

    public final boolean k() {
        int i10 = this.f3239e;
        return i10 == 1 || i10 == 4;
    }

    public void l() {
        this.f3246l = true;
    }

    public void m(int i10, boolean z10) {
        this.f3239e = z10 ? 2 : 3;
        this.f3247m = false;
        boolean z11 = this.f3243i != i10;
        this.f3243i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    public final void n() {
        this.f3239e = 0;
        this.f3240f = 0;
        this.f3241g.a();
        this.f3242h = -1;
        this.f3243i = -1;
        this.f3244j = false;
        this.f3245k = false;
        this.f3247m = false;
        this.f3246l = false;
    }

    public void o(ViewPager2.i iVar) {
        this.f3236a = iVar;
    }

    public final void p(boolean z10) {
        this.f3247m = z10;
        this.f3239e = z10 ? 4 : 1;
        int i10 = this.f3243i;
        if (i10 != -1) {
            this.f3242h = i10;
            this.f3243i = -1;
        } else if (this.f3242h == -1) {
            this.f3242h = f();
        }
        e(1);
    }

    public final void q() {
        int top;
        a aVar = this.f3241g;
        int d22 = this.f3238d.d2();
        aVar.f3248a = d22;
        if (d22 == -1) {
            aVar.a();
            return;
        }
        View H = this.f3238d.H(d22);
        if (H == null) {
            aVar.a();
            return;
        }
        int e02 = this.f3238d.e0(H);
        int n02 = this.f3238d.n0(H);
        int q02 = this.f3238d.q0(H);
        int M = this.f3238d.M(H);
        ViewGroup.LayoutParams layoutParams = H.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            e02 += marginLayoutParams.leftMargin;
            n02 += marginLayoutParams.rightMargin;
            q02 += marginLayoutParams.topMargin;
            M += marginLayoutParams.bottomMargin;
        }
        int height = H.getHeight() + q02 + M;
        int width = H.getWidth() + e02 + n02;
        if (this.f3238d.q2() == 0) {
            top = (H.getLeft() - e02) - this.f3237c.getPaddingLeft();
            if (this.b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (H.getTop() - q02) - this.f3237c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f3249c = i10;
        if (i10 >= 0) {
            aVar.b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new u5.a(this.f3238d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f3249c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
