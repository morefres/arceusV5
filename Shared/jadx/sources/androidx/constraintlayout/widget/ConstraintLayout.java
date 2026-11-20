package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import backtraceio.library.services.BacktraceMetrics;
import c2.d;
import c2.e;
import c2.f;
import c2.h;
import c2.k;
import c2.l;
import com.appsflyer.share.attribution.RequestError;
import d2.b;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: y, reason: collision with root package name */
    public static g2.e f1334y;

    /* renamed from: a, reason: collision with root package name */
    public SparseArray<View> f1335a;
    public ArrayList<androidx.constraintlayout.widget.b> b;

    /* renamed from: c, reason: collision with root package name */
    public f f1336c;

    /* renamed from: d, reason: collision with root package name */
    public int f1337d;

    /* renamed from: e, reason: collision with root package name */
    public int f1338e;

    /* renamed from: f, reason: collision with root package name */
    public int f1339f;

    /* renamed from: g, reason: collision with root package name */
    public int f1340g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1341h;

    /* renamed from: i, reason: collision with root package name */
    public int f1342i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f1343j;

    /* renamed from: k, reason: collision with root package name */
    public g2.a f1344k;

    /* renamed from: l, reason: collision with root package name */
    public int f1345l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap<String, Integer> f1346m;

    /* renamed from: n, reason: collision with root package name */
    public int f1347n;

    /* renamed from: o, reason: collision with root package name */
    public int f1348o;

    /* renamed from: p, reason: collision with root package name */
    public int f1349p;

    /* renamed from: q, reason: collision with root package name */
    public int f1350q;

    /* renamed from: r, reason: collision with root package name */
    public int f1351r;

    /* renamed from: s, reason: collision with root package name */
    public int f1352s;

    /* renamed from: t, reason: collision with root package name */
    public SparseArray<c2.e> f1353t;

    /* renamed from: u, reason: collision with root package name */
    public c f1354u;

    /* renamed from: v, reason: collision with root package name */
    public int f1355v;

    /* renamed from: w, reason: collision with root package name */
    public int f1356w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList<d> f1357x;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1358a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1358a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1358a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1358a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1358a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements b.InterfaceC0278b {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintLayout f1408a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f1409c;

        /* renamed from: d, reason: collision with root package name */
        public int f1410d;

        /* renamed from: e, reason: collision with root package name */
        public int f1411e;

        /* renamed from: f, reason: collision with root package name */
        public int f1412f;

        /* renamed from: g, reason: collision with root package name */
        public int f1413g;

        public c(ConstraintLayout constraintLayout) {
            this.f1408a = constraintLayout;
        }

        @Override // d2.b.InterfaceC0278b
        public final void a() {
            int childCount = this.f1408a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f1408a.getChildAt(i10);
                if (childAt instanceof e) {
                    ((e) childAt).a(this.f1408a);
                }
            }
            int size = this.f1408a.b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f1408a.b.get(i11)).p(this.f1408a);
                }
            }
        }

        @Override // d2.b.InterfaceC0278b
        @SuppressLint({"WrongCall"})
        public final void b(c2.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int max2;
            int i10;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.f14263e = 0;
                aVar.f14264f = 0;
                aVar.f14265g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            e.b bVar = aVar.f14260a;
            e.b bVar2 = aVar.b;
            int i11 = aVar.f14261c;
            int i12 = aVar.f14262d;
            int i13 = this.b + this.f1409c;
            int i14 = this.f1410d;
            View view = (View) eVar.s();
            int[] iArr = a.f1358a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1412f, i14, -2);
            } else if (i15 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1412f, i14 + eVar.B(), -1);
            } else if (i15 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1412f, i14, -2);
                boolean z10 = eVar.f4534w == 1;
                int i16 = aVar.f14268j;
                if (i16 == b.a.f14258l || i16 == b.a.f14259m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f14268j == b.a.f14259m || !z10 || ((z10 && z11) || (view instanceof e) || eVar.n0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1413g, i13, -2);
            } else if (i17 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1413g, i13 + eVar.U(), -1);
            } else if (i17 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1413g, i13, -2);
                boolean z12 = eVar.f4536x == 1;
                int i18 = aVar.f14268j;
                if (i18 == b.a.f14258l || i18 == b.a.f14259m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.f14268j == b.a.f14259m || !z12 || ((z12 && z13) || (view instanceof e) || eVar.o0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            f fVar = (f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.f1342i, 256) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), makeMeasureSpec, eVar.W()) && d(eVar.D(), makeMeasureSpec2, eVar.x())) {
                aVar.f14263e = eVar.W();
                aVar.f14264f = eVar.x();
                aVar.f14265g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z18 = z14 && eVar.f4497d0 > 0.0f;
            boolean z19 = z15 && eVar.f4497d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f14268j;
            if (i19 != b.a.f14258l && i19 != b.a.f14259m && z14 && eVar.f4534w == 0 && z15 && eVar.f4536x == 0) {
                i10 = -1;
                max2 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof g2.f) && (eVar instanceof l)) {
                    ((g2.f) view).t((l) eVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                eVar.W0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = eVar.f4540z;
                max = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = eVar.A;
                if (i21 > 0) {
                    max = Math.min(i21, max);
                }
                int i22 = eVar.C;
                max2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = eVar.D;
                if (i23 > 0) {
                    max2 = Math.min(i23, max2);
                }
                boolean z21 = z16;
                if (!k.b(ConstraintLayout.this.f1342i, 1)) {
                    if (z18 && z21) {
                        max = (int) ((max2 * eVar.f4497d0) + 0.5f);
                    } else if (z19 && z20) {
                        max2 = (int) ((max / eVar.f4497d0) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != max2) {
                    if (measuredWidth != max) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    }
                    if (measuredHeight != max2) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    eVar.W0(makeMeasureSpec, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    max2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z22 = baseline != i10;
            aVar.f14267i = (max == aVar.f14261c && max2 == aVar.f14262d) ? false : true;
            if (bVar5.f1371g0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && eVar.p() != baseline) {
                aVar.f14267i = true;
            }
            aVar.f14263e = max;
            aVar.f14264f = max2;
            aVar.f14266h = z22;
            aVar.f14265g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.b = i12;
            this.f1409c = i13;
            this.f1410d = i14;
            this.f1411e = i15;
            this.f1412f = i10;
            this.f1413g = i11;
        }

        public final boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }
    }

    public interface d {
        boolean a(int i10, int i11, int i12, View view, b bVar);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1335a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.f1336c = new f();
        this.f1337d = 0;
        this.f1338e = 0;
        this.f1339f = Integer.MAX_VALUE;
        this.f1340g = Integer.MAX_VALUE;
        this.f1341h = true;
        this.f1342i = InputDeviceCompat.SOURCE_KEYBOARD;
        this.f1343j = null;
        this.f1344k = null;
        this.f1345l = -1;
        this.f1346m = new HashMap<>();
        this.f1347n = -1;
        this.f1348o = -1;
        this.f1349p = -1;
        this.f1350q = -1;
        this.f1351r = 0;
        this.f1352s = 0;
        this.f1353t = new SparseArray<>();
        this.f1354u = new c(this);
        this.f1355v = 0;
        this.f1356w = 0;
        s(attributeSet, 0, 0);
    }

    public static /* synthetic */ z1.e b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static g2.e getSharedValues() {
        if (f1334y == null) {
            f1334y = new g2.e();
        }
        return f1334y;
    }

    private void s(AttributeSet attributeSet, int i10, int i11) {
        this.f1336c.C0(this);
        this.f1336c.X1(this.f1354u);
        this.f1335a.put(getId(), this);
        this.f1343j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g2.d.V0, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == g2.d.f18152f1) {
                    this.f1337d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1337d);
                } else if (index == g2.d.f18161g1) {
                    this.f1338e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1338e);
                } else if (index == g2.d.f18134d1) {
                    this.f1339f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1339f);
                } else if (index == g2.d.f18143e1) {
                    this.f1340g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1340g);
                } else if (index == g2.d.O2) {
                    this.f1342i = obtainStyledAttributes.getInt(index, this.f1342i);
                } else if (index == g2.d.J1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1344k = null;
                        }
                    }
                } else if (index == g2.d.f18224n1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f1343j = cVar;
                        cVar.t(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1343j = null;
                    }
                    this.f1345l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1336c.Y1(this.f1342i);
    }

    public void A(f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.f1354u;
        int i14 = cVar.f1411e;
        int i15 = cVar.f1410d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1337d);
            }
        } else if (i10 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1337d);
            }
            i11 = 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
            i11 = 0;
        } else {
            i11 = Math.min(this.f1339f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1338e);
            }
        } else if (i12 != 0) {
            if (i12 == 1073741824) {
                i13 = Math.min(this.f1340g - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1338e);
            }
            i13 = 0;
        }
        if (i11 != fVar.W() || i13 != fVar.x()) {
            fVar.P1();
        }
        fVar.n1(0);
        fVar.o1(0);
        fVar.Y0(this.f1339f - i15);
        fVar.X0(this.f1340g - i14);
        fVar.b1(0);
        fVar.a1(0);
        fVar.Q0(bVar);
        fVar.l1(i11);
        fVar.h1(bVar2);
        fVar.M0(i13);
        fVar.b1(this.f1337d - i15);
        fVar.a1(this.f1338e - i14);
    }

    public final void B(c2.e eVar, b bVar, SparseArray<c2.e> sparseArray, int i10, d.a aVar) {
        View view = this.f1335a.get(i10);
        c2.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1371g0 = true;
        d.a aVar2 = d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f1371g0 = true;
            bVar2.f1401v0.L0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.D, bVar.C, true);
        eVar.L0(true);
        eVar.o(d.a.TOP).q();
        eVar.o(d.a.BOTTOM).q();
    }

    public final boolean C() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            y();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.b.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(boolean r15, android.view.View r16, c2.e r17, androidx.constraintlayout.widget.ConstraintLayout.b r18, android.util.SparseArray<c2.e> r19) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(boolean, android.view.View, c2.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    public boolean f(int i10, int i11) {
        if (this.f1357x == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ArrayList<d> arrayList = this.f1357x;
        int size3 = arrayList.size();
        boolean z10 = false;
        int i12 = 0;
        while (i12 < size3) {
            int i13 = i12 + 1;
            d dVar = arrayList.get(i12);
            ArrayList<c2.e> s12 = this.f1336c.s1();
            int size4 = s12.size();
            for (int i14 = 0; i14 < size4; i14++) {
                View view = (View) s12.get(i14).s();
                z10 |= dVar.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
            i12 = i13;
        }
        return z10;
    }

    @Override // android.view.View
    public void forceLayout() {
        u();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f1340g;
    }

    public int getMaxWidth() {
        return this.f1339f;
    }

    public int getMinHeight() {
        return this.f1338e;
    }

    public int getMinWidth() {
        return this.f1337d;
    }

    public int getOptimizationLevel() {
        return this.f1336c.L1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1336c.f4518o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1336c.f4518o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1336c.f4518o = "parent";
            }
        }
        if (this.f1336c.t() == null) {
            f fVar = this.f1336c;
            fVar.D0(fVar.f4518o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1336c.t());
        }
        ArrayList<c2.e> s12 = this.f1336c.s1();
        int size = s12.size();
        int i10 = 0;
        while (i10 < size) {
            c2.e eVar = s12.get(i10);
            i10++;
            c2.e eVar2 = eVar;
            View view = (View) eVar2.s();
            if (view != null) {
                if (eVar2.f4518o == null && (id2 = view.getId()) != -1) {
                    eVar2.f4518o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar2.t() == null) {
                    eVar2.D0(eVar2.f4518o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar2.t());
                }
            }
        }
        this.f1336c.O(sb2);
        return sb2.toString();
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object l(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1346m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1346m.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            c2.e eVar = bVar.f1401v0;
            if ((childAt.getVisibility() != 8 || bVar.f1373h0 || bVar.f1375i0 || bVar.f1379k0 || isInEditMode) && !bVar.f1377j0) {
                int X = eVar.X();
                int Y = eVar.Y();
                int W = eVar.W() + X;
                int x10 = eVar.x() + Y;
                childAt.layout(X, Y, W, x10);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(X, Y, W, x10);
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.b.get(i15).o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean f10 = this.f1341h | f(i10, i11);
        this.f1341h = f10;
        if (!f10) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f1341h = true;
                    break;
                }
                i12++;
            }
        }
        this.f1355v = i10;
        this.f1356w = i11;
        this.f1336c.a2(t());
        if (this.f1341h) {
            this.f1341h = false;
            if (C()) {
                this.f1336c.c2();
            }
        }
        this.f1336c.J1(null);
        x(this.f1336c, this.f1342i, i10, i11);
        w(i10, i11, this.f1336c.W(), this.f1336c.x(), this.f1336c.S1(), this.f1336c.Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        c2.e r8 = r(view);
        if ((view instanceof Guideline) && !(r8 instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f1401v0 = hVar;
            bVar.f1373h0 = true;
            hVar.B1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).f1375i0 = true;
            if (!this.b.contains(bVar2)) {
                this.b.add(bVar2);
            }
        }
        this.f1335a.put(view.getId(), view);
        this.f1341h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1335a.remove(view.getId());
        this.f1336c.u1(r(view));
        this.b.remove(view);
        this.f1341h = true;
    }

    public final c2.e p(int i10) {
        if (i10 == 0) {
            return this.f1336c;
        }
        View view = this.f1335a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1336c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1401v0;
    }

    public View q(int i10) {
        return this.f1335a.get(i10);
    }

    public final c2.e r(View view) {
        if (view == this) {
            return this.f1336c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1401v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1401v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f1343j = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1335a.remove(getId());
        super.setId(i10);
        this.f1335a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1340g) {
            return;
        }
        this.f1340g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1339f) {
            return;
        }
        this.f1339f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1338e) {
            return;
        }
        this.f1338e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1337d) {
            return;
        }
        this.f1337d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(g2.b bVar) {
        g2.a aVar = this.f1344k;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1342i = i10;
        this.f1336c.Y1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void u() {
        this.f1341h = true;
        this.f1347n = -1;
        this.f1348o = -1;
        this.f1349p = -1;
        this.f1350q = -1;
        this.f1351r = 0;
        this.f1352s = 0;
    }

    public void v(int i10) {
        this.f1344k = new g2.a(getContext(), this, i10);
    }

    public void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f1354u;
        int i14 = cVar.f1411e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f1410d, i10, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0);
        int i15 = resolveSizeAndState & ViewCompat.MEASURED_SIZE_MASK;
        int i16 = resolveSizeAndState2 & ViewCompat.MEASURED_SIZE_MASK;
        int min = Math.min(this.f1339f, i15);
        int min2 = Math.min(this.f1340g, i16);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1347n = min;
        this.f1348o = min2;
    }

    public void x(f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1354u.c(i11, i12, max, max2, paddingWidth, i14);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (t()) {
            i13 = max4;
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            A(fVar, mode, i15, mode2, i16);
            fVar.T1(i10, mode, i15, mode2, i16, this.f1347n, this.f1348o, i13, max);
        }
        i13 = max3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        A(fVar, mode, i152, mode2, i162);
        fVar.T1(i10, mode, i152, mode2, i162, this.f1347n, this.f1348o, i13, max);
    }

    public final void y() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            c2.e r8 = r(getChildAt(i10));
            if (r8 != null) {
                r8.t0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    p(childAt.getId()).D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1345l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f1345l && (childAt2 instanceof androidx.constraintlayout.widget.d)) {
                    this.f1343j = ((androidx.constraintlayout.widget.d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f1343j;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f1336c.v1();
        int size = this.b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.b.get(i13).r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof e) {
                ((e) childAt3).b(this);
            }
        }
        this.f1353t.clear();
        this.f1353t.put(0, this.f1336c);
        this.f1353t.put(getId(), this.f1336c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f1353t.put(childAt4.getId(), r(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            c2.e r10 = r(childAt5);
            if (r10 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f1336c.a(r10);
                e(isInEditMode, childAt5, r10, bVar, this.f1353t);
            }
        }
    }

    public void z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1346m == null) {
                this.f1346m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1346m.put(str, (Integer) obj2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1335a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.f1336c = new f();
        this.f1337d = 0;
        this.f1338e = 0;
        this.f1339f = Integer.MAX_VALUE;
        this.f1340g = Integer.MAX_VALUE;
        this.f1341h = true;
        this.f1342i = InputDeviceCompat.SOURCE_KEYBOARD;
        this.f1343j = null;
        this.f1344k = null;
        this.f1345l = -1;
        this.f1346m = new HashMap<>();
        this.f1347n = -1;
        this.f1348o = -1;
        this.f1349p = -1;
        this.f1350q = -1;
        this.f1351r = 0;
        this.f1352s = 0;
        this.f1353t = new SparseArray<>();
        this.f1354u = new c(this);
        this.f1355v = 0;
        this.f1356w = 0;
        s(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public int f1359a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f1360a0;
        public int b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f1361b0;

        /* renamed from: c, reason: collision with root package name */
        public float f1362c;

        /* renamed from: c0, reason: collision with root package name */
        public String f1363c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1364d;

        /* renamed from: d0, reason: collision with root package name */
        public int f1365d0;

        /* renamed from: e, reason: collision with root package name */
        public int f1366e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f1367e0;

        /* renamed from: f, reason: collision with root package name */
        public int f1368f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f1369f0;

        /* renamed from: g, reason: collision with root package name */
        public int f1370g;

        /* renamed from: g0, reason: collision with root package name */
        public boolean f1371g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1372h;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f1373h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1374i;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f1375i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1376j;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f1377j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1378k;

        /* renamed from: k0, reason: collision with root package name */
        public boolean f1379k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1380l;

        /* renamed from: l0, reason: collision with root package name */
        public int f1381l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1382m;

        /* renamed from: m0, reason: collision with root package name */
        public int f1383m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1384n;

        /* renamed from: n0, reason: collision with root package name */
        public int f1385n0;

        /* renamed from: o, reason: collision with root package name */
        public int f1386o;

        /* renamed from: o0, reason: collision with root package name */
        public int f1387o0;

        /* renamed from: p, reason: collision with root package name */
        public int f1388p;

        /* renamed from: p0, reason: collision with root package name */
        public int f1389p0;

        /* renamed from: q, reason: collision with root package name */
        public int f1390q;

        /* renamed from: q0, reason: collision with root package name */
        public int f1391q0;

        /* renamed from: r, reason: collision with root package name */
        public float f1392r;

        /* renamed from: r0, reason: collision with root package name */
        public float f1393r0;

        /* renamed from: s, reason: collision with root package name */
        public int f1394s;

        /* renamed from: s0, reason: collision with root package name */
        public int f1395s0;

        /* renamed from: t, reason: collision with root package name */
        public int f1396t;

        /* renamed from: t0, reason: collision with root package name */
        public int f1397t0;

        /* renamed from: u, reason: collision with root package name */
        public int f1398u;

        /* renamed from: u0, reason: collision with root package name */
        public float f1399u0;

        /* renamed from: v, reason: collision with root package name */
        public int f1400v;

        /* renamed from: v0, reason: collision with root package name */
        public c2.e f1401v0;

        /* renamed from: w, reason: collision with root package name */
        public int f1402w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f1403w0;

        /* renamed from: x, reason: collision with root package name */
        public int f1404x;

        /* renamed from: y, reason: collision with root package name */
        public int f1405y;

        /* renamed from: z, reason: collision with root package name */
        public int f1406z;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1407a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1407a = sparseIntArray;
                sparseIntArray.append(g2.d.f18322z2, 64);
                sparseIntArray.append(g2.d.f18126c2, 65);
                sparseIntArray.append(g2.d.f18207l2, 8);
                sparseIntArray.append(g2.d.f18216m2, 9);
                sparseIntArray.append(g2.d.f18234o2, 10);
                sparseIntArray.append(g2.d.f18243p2, 11);
                sparseIntArray.append(g2.d.f18292v2, 12);
                sparseIntArray.append(g2.d.f18284u2, 13);
                sparseIntArray.append(g2.d.S1, 14);
                sparseIntArray.append(g2.d.R1, 15);
                sparseIntArray.append(g2.d.N1, 16);
                sparseIntArray.append(g2.d.P1, 52);
                sparseIntArray.append(g2.d.O1, 53);
                sparseIntArray.append(g2.d.T1, 2);
                sparseIntArray.append(g2.d.V1, 3);
                sparseIntArray.append(g2.d.U1, 4);
                sparseIntArray.append(g2.d.E2, 49);
                sparseIntArray.append(g2.d.F2, 50);
                sparseIntArray.append(g2.d.Z1, 5);
                sparseIntArray.append(g2.d.f18109a2, 6);
                sparseIntArray.append(g2.d.f18117b2, 7);
                sparseIntArray.append(g2.d.I1, 67);
                sparseIntArray.append(g2.d.W0, 1);
                sparseIntArray.append(g2.d.f18252q2, 17);
                sparseIntArray.append(g2.d.f18260r2, 18);
                sparseIntArray.append(g2.d.Y1, 19);
                sparseIntArray.append(g2.d.X1, 20);
                sparseIntArray.append(g2.d.J2, 21);
                sparseIntArray.append(g2.d.M2, 22);
                sparseIntArray.append(g2.d.K2, 23);
                sparseIntArray.append(g2.d.H2, 24);
                sparseIntArray.append(g2.d.L2, 25);
                sparseIntArray.append(g2.d.I2, 26);
                sparseIntArray.append(g2.d.G2, 55);
                sparseIntArray.append(g2.d.N2, 54);
                sparseIntArray.append(g2.d.f18171h2, 29);
                sparseIntArray.append(g2.d.f18299w2, 30);
                sparseIntArray.append(g2.d.W1, 44);
                sparseIntArray.append(g2.d.f18189j2, 45);
                sparseIntArray.append(g2.d.f18314y2, 46);
                sparseIntArray.append(g2.d.f18180i2, 47);
                sparseIntArray.append(g2.d.f18306x2, 48);
                sparseIntArray.append(g2.d.L1, 27);
                sparseIntArray.append(g2.d.K1, 28);
                sparseIntArray.append(g2.d.A2, 31);
                sparseIntArray.append(g2.d.f18135d2, 32);
                sparseIntArray.append(g2.d.C2, 33);
                sparseIntArray.append(g2.d.B2, 34);
                sparseIntArray.append(g2.d.D2, 35);
                sparseIntArray.append(g2.d.f18153f2, 36);
                sparseIntArray.append(g2.d.f18144e2, 37);
                sparseIntArray.append(g2.d.f18162g2, 38);
                sparseIntArray.append(g2.d.f18198k2, 39);
                sparseIntArray.append(g2.d.f18276t2, 40);
                sparseIntArray.append(g2.d.f18225n2, 41);
                sparseIntArray.append(g2.d.Q1, 42);
                sparseIntArray.append(g2.d.M1, 43);
                sparseIntArray.append(g2.d.f18268s2, 51);
                sparseIntArray.append(g2.d.P2, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1359a = -1;
            this.b = -1;
            this.f1362c = -1.0f;
            this.f1364d = true;
            this.f1366e = -1;
            this.f1368f = -1;
            this.f1370g = -1;
            this.f1372h = -1;
            this.f1374i = -1;
            this.f1376j = -1;
            this.f1378k = -1;
            this.f1380l = -1;
            this.f1382m = -1;
            this.f1384n = -1;
            this.f1386o = -1;
            this.f1388p = -1;
            this.f1390q = 0;
            this.f1392r = 0.0f;
            this.f1394s = -1;
            this.f1396t = -1;
            this.f1398u = -1;
            this.f1400v = -1;
            this.f1402w = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1404x = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1405y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1406z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.A = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.C = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1360a0 = false;
            this.f1361b0 = false;
            this.f1363c0 = null;
            this.f1365d0 = 0;
            this.f1367e0 = true;
            this.f1369f0 = true;
            this.f1371g0 = false;
            this.f1373h0 = false;
            this.f1375i0 = false;
            this.f1377j0 = false;
            this.f1379k0 = false;
            this.f1381l0 = -1;
            this.f1383m0 = -1;
            this.f1385n0 = -1;
            this.f1387o0 = -1;
            this.f1389p0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1391q0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1393r0 = 0.5f;
            this.f1401v0 = new c2.e();
            this.f1403w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f1359a = bVar.f1359a;
                this.b = bVar.b;
                this.f1362c = bVar.f1362c;
                this.f1364d = bVar.f1364d;
                this.f1366e = bVar.f1366e;
                this.f1368f = bVar.f1368f;
                this.f1370g = bVar.f1370g;
                this.f1372h = bVar.f1372h;
                this.f1374i = bVar.f1374i;
                this.f1376j = bVar.f1376j;
                this.f1378k = bVar.f1378k;
                this.f1380l = bVar.f1380l;
                this.f1382m = bVar.f1382m;
                this.f1384n = bVar.f1384n;
                this.f1386o = bVar.f1386o;
                this.f1388p = bVar.f1388p;
                this.f1390q = bVar.f1390q;
                this.f1392r = bVar.f1392r;
                this.f1394s = bVar.f1394s;
                this.f1396t = bVar.f1396t;
                this.f1398u = bVar.f1398u;
                this.f1400v = bVar.f1400v;
                this.f1402w = bVar.f1402w;
                this.f1404x = bVar.f1404x;
                this.f1405y = bVar.f1405y;
                this.f1406z = bVar.f1406z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f1360a0 = bVar.f1360a0;
                this.f1361b0 = bVar.f1361b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f1367e0 = bVar.f1367e0;
                this.f1369f0 = bVar.f1369f0;
                this.f1371g0 = bVar.f1371g0;
                this.f1373h0 = bVar.f1373h0;
                this.f1381l0 = bVar.f1381l0;
                this.f1383m0 = bVar.f1383m0;
                this.f1385n0 = bVar.f1385n0;
                this.f1387o0 = bVar.f1387o0;
                this.f1389p0 = bVar.f1389p0;
                this.f1391q0 = bVar.f1391q0;
                this.f1393r0 = bVar.f1393r0;
                this.f1363c0 = bVar.f1363c0;
                this.f1365d0 = bVar.f1365d0;
                this.f1401v0 = bVar.f1401v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public void a() {
            this.f1373h0 = false;
            this.f1367e0 = true;
            this.f1369f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f1360a0) {
                this.f1367e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f1361b0) {
                this.f1369f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1367e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1360a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1369f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1361b0 = true;
                }
            }
            if (this.f1362c == -1.0f && this.f1359a == -1 && this.b == -1) {
                return;
            }
            this.f1373h0 = true;
            this.f1367e0 = true;
            this.f1369f0 = true;
            if (!(this.f1401v0 instanceof h)) {
                this.f1401v0 = new h();
            }
            ((h) this.f1401v0).B1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1359a = -1;
            this.b = -1;
            this.f1362c = -1.0f;
            this.f1364d = true;
            this.f1366e = -1;
            this.f1368f = -1;
            this.f1370g = -1;
            this.f1372h = -1;
            this.f1374i = -1;
            this.f1376j = -1;
            this.f1378k = -1;
            this.f1380l = -1;
            this.f1382m = -1;
            this.f1384n = -1;
            this.f1386o = -1;
            this.f1388p = -1;
            this.f1390q = 0;
            this.f1392r = 0.0f;
            this.f1394s = -1;
            this.f1396t = -1;
            this.f1398u = -1;
            this.f1400v = -1;
            this.f1402w = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1404x = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1405y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1406z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.A = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.C = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1360a0 = false;
            this.f1361b0 = false;
            this.f1363c0 = null;
            this.f1365d0 = 0;
            this.f1367e0 = true;
            this.f1369f0 = true;
            this.f1371g0 = false;
            this.f1373h0 = false;
            this.f1375i0 = false;
            this.f1377j0 = false;
            this.f1379k0 = false;
            this.f1381l0 = -1;
            this.f1383m0 = -1;
            this.f1385n0 = -1;
            this.f1387o0 = -1;
            this.f1389p0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1391q0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1393r0 = 0.5f;
            this.f1401v0 = new c2.e();
            this.f1403w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f1407a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1388p);
                        this.f1388p = resourceId;
                        if (resourceId == -1) {
                            this.f1388p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1390q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1390q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1392r) % 360.0f;
                        this.f1392r = f10;
                        if (f10 < 0.0f) {
                            this.f1392r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1359a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1359a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.f1362c = obtainStyledAttributes.getFloat(index, this.f1362c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1366e);
                        this.f1366e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1366e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1368f);
                        this.f1368f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1368f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1370g);
                        this.f1370g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1370g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1372h);
                        this.f1372h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1372h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1374i);
                        this.f1374i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1374i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1376j);
                        this.f1376j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1376j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1378k);
                        this.f1378k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1378k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1380l);
                        this.f1380l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1380l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1382m);
                        this.f1382m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1382m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1394s);
                        this.f1394s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1394s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1396t);
                        this.f1396t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1396t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1398u);
                        this.f1398u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1398u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1400v);
                        this.f1400v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1400v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case MotionEventCompat.AXIS_WHEEL /* 21 */:
                        this.f1402w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1402w);
                        break;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        this.f1404x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1404x);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        this.f1405y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1405y);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        this.f1406z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1406z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case MotionEventCompat.AXIS_SCROLL /* 26 */:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                        this.f1360a0 = obtainStyledAttributes.getBoolean(index, this.f1360a0);
                        break;
                    case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                        this.f1361b0 = obtainStyledAttributes.getBoolean(index, this.f1361b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                                androidx.constraintlayout.widget.c.y(this, obtainStyledAttributes.getString(index));
                                break;
                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f1363c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1384n);
                                this.f1384n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1384n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1386o);
                                this.f1386o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1386o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.w(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.c.w(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1365d0 = obtainStyledAttributes.getInt(index, this.f1365d0);
                                        break;
                                    case 67:
                                        this.f1364d = obtainStyledAttributes.getBoolean(index, this.f1364d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f1359a = -1;
            this.b = -1;
            this.f1362c = -1.0f;
            this.f1364d = true;
            this.f1366e = -1;
            this.f1368f = -1;
            this.f1370g = -1;
            this.f1372h = -1;
            this.f1374i = -1;
            this.f1376j = -1;
            this.f1378k = -1;
            this.f1380l = -1;
            this.f1382m = -1;
            this.f1384n = -1;
            this.f1386o = -1;
            this.f1388p = -1;
            this.f1390q = 0;
            this.f1392r = 0.0f;
            this.f1394s = -1;
            this.f1396t = -1;
            this.f1398u = -1;
            this.f1400v = -1;
            this.f1402w = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1404x = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1405y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1406z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.A = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.C = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1360a0 = false;
            this.f1361b0 = false;
            this.f1363c0 = null;
            this.f1365d0 = 0;
            this.f1367e0 = true;
            this.f1369f0 = true;
            this.f1371g0 = false;
            this.f1373h0 = false;
            this.f1375i0 = false;
            this.f1377j0 = false;
            this.f1379k0 = false;
            this.f1381l0 = -1;
            this.f1383m0 = -1;
            this.f1385n0 = -1;
            this.f1387o0 = -1;
            this.f1389p0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1391q0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1393r0 = 0.5f;
            this.f1401v0 = new c2.e();
            this.f1403w0 = false;
        }
    }
}
