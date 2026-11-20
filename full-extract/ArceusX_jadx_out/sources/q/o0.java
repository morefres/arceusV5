package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class o0 implements p.f {
    public static Method G;
    public static Method H;
    public Runnable A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public PopupWindow F;

    /* renamed from: a, reason: collision with root package name */
    public Context f29370a;
    public ListAdapter b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f29371c;

    /* renamed from: d, reason: collision with root package name */
    public int f29372d;

    /* renamed from: e, reason: collision with root package name */
    public int f29373e;

    /* renamed from: f, reason: collision with root package name */
    public int f29374f;

    /* renamed from: g, reason: collision with root package name */
    public int f29375g;

    /* renamed from: h, reason: collision with root package name */
    public int f29376h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29377i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29378j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29379k;

    /* renamed from: l, reason: collision with root package name */
    public int f29380l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29381m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29382n;

    /* renamed from: o, reason: collision with root package name */
    public int f29383o;

    /* renamed from: p, reason: collision with root package name */
    public View f29384p;

    /* renamed from: q, reason: collision with root package name */
    public int f29385q;

    /* renamed from: r, reason: collision with root package name */
    public DataSetObserver f29386r;

    /* renamed from: s, reason: collision with root package name */
    public View f29387s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f29388t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f29389u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f29390v;

    /* renamed from: w, reason: collision with root package name */
    public final i f29391w;

    /* renamed from: x, reason: collision with root package name */
    public final h f29392x;

    /* renamed from: y, reason: collision with root package name */
    public final g f29393y;

    /* renamed from: z, reason: collision with root package name */
    public final e f29394z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View s8 = o0.this.s();
            if (s8 == null || s8.getWindowToken() == null) {
                return;
            }
            o0.this.show();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            l0 l0Var;
            if (i10 == -1 || (l0Var = o0.this.f29371c) == null) {
                return;
            }
            l0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.q();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (o0.this.a()) {
                o0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            o0.this.dismiss();
        }
    }

    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || o0.this.z() || o0.this.F.getContentView() == null) {
                return;
            }
            o0 o0Var = o0.this;
            o0Var.B.removeCallbacks(o0Var.f29391w);
            o0.this.f29391w.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = o0.this.F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < o0.this.F.getWidth() && y10 >= 0 && y10 < o0.this.F.getHeight()) {
                o0 o0Var = o0.this;
                o0Var.B.postDelayed(o0Var.f29391w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            o0 o0Var2 = o0.this;
            o0Var2.B.removeCallbacks(o0Var2.f29391w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0 l0Var = o0.this.f29371c;
            if (l0Var == null || !l0Var.isAttachedToWindow() || o0.this.f29371c.getCount() <= o0.this.f29371c.getChildCount()) {
                return;
            }
            int childCount = o0.this.f29371c.getChildCount();
            o0 o0Var = o0.this;
            if (childCount <= o0Var.f29383o) {
                o0Var.F.setInputMethodMode(2);
                o0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public o0(@NonNull Context context) {
        this(context, null, i.a.G);
    }

    public boolean A() {
        return this.E;
    }

    public final void B() {
        View view = this.f29384p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f29384p);
            }
        }
    }

    public void C(View view) {
        this.f29387s = view;
    }

    public void D(int i10) {
        this.F.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f29373e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f29380l = i10;
    }

    public void G(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.E = z10;
        this.F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f29389u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f29390v = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f29379k = true;
        this.f29378j = z10;
    }

    public final void N(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z10);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void O(int i10) {
        this.f29385q = i10;
    }

    public void P(int i10) {
        l0 l0Var = this.f29371c;
        if (!a() || l0Var == null) {
            return;
        }
        l0Var.setListSelectionHidden(false);
        l0Var.setSelection(i10);
        if (l0Var.getChoiceMode() != 0) {
            l0Var.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f29373e = i10;
    }

    @Override // p.f
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f29374f;
    }

    @Override // p.f
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f29371c = null;
        this.B.removeCallbacks(this.f29391w);
    }

    public void e(int i10) {
        this.f29374f = i10;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    public void i(int i10) {
        this.f29375g = i10;
        this.f29377i = true;
    }

    public int l() {
        if (this.f29377i) {
            return this.f29375g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f29386r;
        if (dataSetObserver == null) {
            this.f29386r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f29386r);
        }
        l0 l0Var = this.f29371c;
        if (l0Var != null) {
            l0Var.setAdapter(this.b);
        }
    }

    @Override // p.f
    public ListView o() {
        return this.f29371c;
    }

    public final int p() {
        int i10;
        int i11;
        int makeMeasureSpec;
        int i12;
        if (this.f29371c == null) {
            Context context = this.f29370a;
            this.A = new a();
            l0 r8 = r(context, !this.E);
            this.f29371c = r8;
            Drawable drawable = this.f29388t;
            if (drawable != null) {
                r8.setSelector(drawable);
            }
            this.f29371c.setAdapter(this.b);
            this.f29371c.setOnItemClickListener(this.f29389u);
            this.f29371c.setFocusable(true);
            this.f29371c.setFocusableInTouchMode(true);
            this.f29371c.setOnItemSelectedListener(new b());
            this.f29371c.setOnScrollListener(this.f29393y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f29390v;
            if (onItemSelectedListener != null) {
                this.f29371c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f29371c;
            View view2 = this.f29384p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f29385q;
                if (i13 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i13 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f29385q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i14 = this.f29373e;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i10 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i10 = 0;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.f29384p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i10 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i10 = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f29377i) {
                this.f29375g = -i15;
            }
        } else {
            this.C.setEmpty();
            i11 = 0;
        }
        int t8 = t(s(), this.f29375g, this.F.getInputMethodMode() == 2);
        if (this.f29381m || this.f29372d == -1) {
            return t8 + i11;
        }
        int i16 = this.f29373e;
        if (i16 == -2) {
            int i17 = this.f29370a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        } else if (i16 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else {
            int i18 = this.f29370a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), 1073741824);
        }
        int d10 = this.f29371c.d(makeMeasureSpec, 0, -1, t8 - i10, -1);
        if (d10 > 0) {
            i10 += i11 + this.f29371c.getPaddingTop() + this.f29371c.getPaddingBottom();
        }
        return d10 + i10;
    }

    public void q() {
        l0 l0Var = this.f29371c;
        if (l0Var != null) {
            l0Var.setListSelectionHidden(true);
            l0Var.requestLayout();
        }
    }

    @NonNull
    public l0 r(Context context, boolean z10) {
        return new l0(context, z10);
    }

    public View s() {
        return this.f29387s;
    }

    @Override // p.f
    public void show() {
        int p8 = p();
        boolean z10 = z();
        d3.h.b(this.F, this.f29376h);
        if (this.F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int i10 = this.f29373e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = s().getWidth();
                }
                int i11 = this.f29372d;
                if (i11 == -1) {
                    if (!z10) {
                        p8 = -1;
                    }
                    if (z10) {
                        this.F.setWidth(this.f29373e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f29373e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    p8 = i11;
                }
                this.F.setOutsideTouchable((this.f29382n || this.f29381m) ? false : true);
                this.F.update(s(), this.f29374f, this.f29375g, i10 < 0 ? -1 : i10, p8 < 0 ? -1 : p8);
                return;
            }
            return;
        }
        int i12 = this.f29373e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = s().getWidth();
        }
        int i13 = this.f29372d;
        if (i13 == -1) {
            p8 = -1;
        } else if (i13 != -2) {
            p8 = i13;
        }
        this.F.setWidth(i12);
        this.F.setHeight(p8);
        N(true);
        this.F.setOutsideTouchable((this.f29382n || this.f29381m) ? false : true);
        this.F.setTouchInterceptor(this.f29392x);
        if (this.f29379k) {
            d3.h.a(this.F, this.f29378j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        d3.h.c(this.F, s(), this.f29374f, this.f29375g, this.f29380l);
        this.f29371c.setSelection(-1);
        if (!this.E || this.f29371c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f29394z);
    }

    public final int t(View view, int i10, boolean z10) {
        return c.a(this.F, view, i10, z10);
    }

    public Object u() {
        if (a()) {
            return this.f29371c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f29371c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f29371c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f29371c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f29373e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f29372d = -2;
        this.f29373e = -2;
        this.f29376h = PointerIconCompat.TYPE_HAND;
        this.f29380l = 0;
        this.f29381m = false;
        this.f29382n = false;
        this.f29383o = Integer.MAX_VALUE;
        this.f29385q = 0;
        this.f29391w = new i();
        this.f29392x = new h();
        this.f29393y = new g();
        this.f29394z = new e();
        this.C = new Rect();
        this.f29370a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f19996n1, i10, i11);
        this.f29374f = obtainStyledAttributes.getDimensionPixelOffset(i.j.f20001o1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i.j.f20006p1, 0);
        this.f29375g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f29377i = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i10, i11);
        this.F = sVar;
        sVar.setInputMethodMode(1);
    }
}
