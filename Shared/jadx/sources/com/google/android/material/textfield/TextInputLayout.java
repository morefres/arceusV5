package com.google.android.material.textfield;

import ad.r;
import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.n;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import cd.h;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import hd.k;
import ic.i;
import ic.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kd.q;
import kd.t;
import kd.x;
import o5.y;
import q.b0;
import q.k0;
import y2.p;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int C0 = j.f20557j;
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public hd.g F;
    public hd.g G;
    public StateListDrawable H;
    public boolean I;
    public hd.g J;
    public hd.g K;

    @NonNull
    public k L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final Rect W;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f8273a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f8274a0;

    @NonNull
    public final x b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f8275b0;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.textfield.a f8276c;

    /* renamed from: c0, reason: collision with root package name */
    public Drawable f8277c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f8278d;

    /* renamed from: d0, reason: collision with root package name */
    public int f8279d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f8280e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet<f> f8281e0;

    /* renamed from: f, reason: collision with root package name */
    public int f8282f;

    /* renamed from: f0, reason: collision with root package name */
    public Drawable f8283f0;

    /* renamed from: g, reason: collision with root package name */
    public int f8284g;

    /* renamed from: g0, reason: collision with root package name */
    public int f8285g0;

    /* renamed from: h, reason: collision with root package name */
    public int f8286h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f8287h0;

    /* renamed from: i, reason: collision with root package name */
    public int f8288i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f8289i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f8290j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f8291j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8292k;

    /* renamed from: k0, reason: collision with root package name */
    public int f8293k0;

    /* renamed from: l, reason: collision with root package name */
    public int f8294l;

    /* renamed from: l0, reason: collision with root package name */
    public int f8295l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8296m;

    /* renamed from: m0, reason: collision with root package name */
    public int f8297m0;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public e f8298n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f8299n0;

    /* renamed from: o, reason: collision with root package name */
    public TextView f8300o;

    /* renamed from: o0, reason: collision with root package name */
    public int f8301o0;

    /* renamed from: p, reason: collision with root package name */
    public int f8302p;

    /* renamed from: p0, reason: collision with root package name */
    public int f8303p0;

    /* renamed from: q, reason: collision with root package name */
    public int f8304q;

    /* renamed from: q0, reason: collision with root package name */
    public int f8305q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f8306r;

    /* renamed from: r0, reason: collision with root package name */
    public int f8307r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8308s;

    /* renamed from: s0, reason: collision with root package name */
    public int f8309s0;

    /* renamed from: t, reason: collision with root package name */
    public TextView f8310t;

    /* renamed from: t0, reason: collision with root package name */
    public int f8311t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f8312u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f8313u0;

    /* renamed from: v, reason: collision with root package name */
    public int f8314v;

    /* renamed from: v0, reason: collision with root package name */
    public final ad.a f8315v0;

    /* renamed from: w, reason: collision with root package name */
    public o5.e f8316w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f8317w0;

    /* renamed from: x, reason: collision with root package name */
    public o5.e f8318x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f8319x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f8320y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f8321y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f8322z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f8323z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f8324c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8325d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8324c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f8324c, parcel, i10);
            parcel.writeInt(this.f8325d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8324c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8325d = parcel.readInt() == 1;
        }
    }

    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public int f8326a;
        public final /* synthetic */ EditText b;

        public a(EditText editText) {
            this.b = editText;
            this.f8326a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout.this.u0(!r0.A0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f8292k) {
                textInputLayout.k0(editable);
            }
            if (TextInputLayout.this.f8308s) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.b.getLineCount();
            int i10 = this.f8326a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int A = o0.A(this.b);
                    int i11 = TextInputLayout.this.f8311t0;
                    if (A != i11) {
                        this.b.setMinimumHeight(i11);
                    }
                }
                this.f8326a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f8276c.h();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f8315v0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f8330d;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f8330d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(@NonNull View view, @NonNull p pVar) {
            super.g(view, pVar);
            EditText editText = this.f8330d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8330d.getHint();
            CharSequence error = this.f8330d.getError();
            CharSequence placeholderText = this.f8330d.getPlaceholderText();
            int counterMaxLength = this.f8330d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8330d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean P = this.f8330d.P();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : "";
            this.f8330d.b.A(pVar);
            if (!isEmpty) {
                pVar.K0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                pVar.K0(charSequence);
                if (!P && placeholderText != null) {
                    pVar.K0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                pVar.K0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                pVar.x0(charSequence);
                pVar.H0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            pVar.z0(counterMaxLength);
            if (z10) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                pVar.s0(error);
            }
            View t8 = this.f8330d.f8290j.t();
            if (t8 != null) {
                pVar.y0(t8);
            }
            this.f8330d.f8276c.m().o(view, pVar);
        }

        @Override // androidx.core.view.a
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f8330d.f8276c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface g {
        void a(@NonNull TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20398g0);
    }

    public static Drawable H(hd.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{uc.a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    public static Drawable K(Context context, hd.g gVar, int i10, int[][] iArr) {
        int c10 = uc.a.c(context, ic.b.f20408o, "TextInputLayout");
        hd.g gVar2 = new hd.g(gVar.E());
        int j10 = uc.a.j(i10, c10, 0.1f);
        gVar2.a0(new ColorStateList(iArr, new int[]{j10, 0}));
        gVar2.setTint(c10);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j10, c10});
        hd.g gVar3 = new hd.g(gVar.E());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    public static void X(@NonNull ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                X((ViewGroup) childAt, z10);
            }
        }
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f8278d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.F;
        }
        int d10 = uc.a.d(this.f8278d, ic.b.f20399h);
        int i10 = this.O;
        if (i10 == 2) {
            return K(getContext(), this.F, d10, D0);
        }
        if (i10 == 1) {
            return H(this.F, this.U, d10, D0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], G(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = G(true);
        }
        return this.G;
    }

    public static void l0(@NonNull Context context, @NonNull TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? i.f20528c : i.b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f8278d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f8278d = editText;
        int i10 = this.f8282f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f8286h);
        }
        int i11 = this.f8284g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f8288i);
        }
        this.I = false;
        U();
        setTextInputAccessibilityDelegate(new d(this));
        this.f8315v0.i0(this.f8278d.getTypeface());
        this.f8315v0.a0(this.f8278d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f8315v0.X(this.f8278d.getLetterSpacing());
        int gravity = this.f8278d.getGravity();
        this.f8315v0.S((gravity & (-113)) | 48);
        this.f8315v0.Z(gravity);
        this.f8311t0 = o0.A(editText);
        this.f8278d.addTextChangedListener(new a(editText));
        if (this.f8289i0 == null) {
            this.f8289i0 = this.f8278d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f8278d.getHint();
                this.f8280e = hint;
                setHint(hint);
                this.f8278d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i12 >= 29) {
            n0();
        }
        if (this.f8300o != null) {
            k0(this.f8278d.getText());
        }
        p0();
        this.f8290j.f();
        this.b.bringToFront();
        this.f8276c.bringToFront();
        C();
        this.f8276c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.f8315v0.g0(charSequence);
        if (this.f8313u0) {
            return;
        }
        V();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f8308s == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            Z();
            this.f8310t = null;
        }
        this.f8308s = z10;
    }

    public final o5.e A() {
        o5.e eVar = new o5.e();
        eVar.t0(h.f(getContext(), ic.b.K, 87));
        eVar.v0(h.g(getContext(), ic.b.Q, jc.a.f21659a));
        return eVar;
    }

    public void A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.O == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f8278d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f8278d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.T = this.f8309s0;
        } else if (d0()) {
            if (this.f8299n0 != null) {
                z0(z11, z10);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.f8296m || (textView = this.f8300o) == null) {
            if (z11) {
                this.T = this.f8297m0;
            } else if (z10) {
                this.T = this.f8295l0;
            } else {
                this.T = this.f8293k0;
            }
        } else if (this.f8299n0 != null) {
            z0(z11, z10);
        } else {
            this.T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f8276c.I();
        Y();
        if (this.O == 2) {
            int i10 = this.Q;
            if (z11 && isEnabled()) {
                this.Q = this.S;
            } else {
                this.Q = this.R;
            }
            if (this.Q != i10) {
                W();
            }
        }
        if (this.O == 1) {
            if (!isEnabled()) {
                this.U = this.f8303p0;
            } else if (z10 && !z11) {
                this.U = this.f8307r0;
            } else if (z11) {
                this.U = this.f8305q0;
            } else {
                this.U = this.f8301o0;
            }
        }
        m();
    }

    public final boolean B() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof kd.h);
    }

    public final void C() {
        Iterator<f> it = this.f8281e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void D(Canvas canvas) {
        hd.g gVar;
        if (this.K == null || (gVar = this.J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f8278d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float x10 = this.f8315v0.x();
            int centerX = bounds2.centerX();
            bounds.left = jc.a.c(centerX, bounds2.left, x10);
            bounds.right = jc.a.c(centerX, bounds2.right, x10);
            this.K.draw(canvas);
        }
    }

    public final void E(@NonNull Canvas canvas) {
        if (this.C) {
            this.f8315v0.l(canvas);
        }
    }

    public final void F(boolean z10) {
        ValueAnimator valueAnimator = this.f8321y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8321y0.cancel();
        }
        if (z10 && this.f8319x0) {
            l(0.0f);
        } else {
            this.f8315v0.c0(0.0f);
        }
        if (B() && ((kd.h) this.F).q0()) {
            y();
        }
        this.f8313u0 = true;
        L();
        this.b.l(true);
        this.f8276c.H(true);
    }

    public final hd.g G(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ic.d.f20441g0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f8278d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ic.d.f20457r);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ic.d.f20430a0);
        k m10 = k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f8278d;
        hd.g m11 = hd.g.m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        m11.setShapeAppearanceModel(m10);
        m11.c0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m11;
    }

    public final int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f8278d.getCompoundPaddingLeft() : this.f8276c.y() : this.b.c());
    }

    public final int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f8278d.getCompoundPaddingRight() : this.b.c() : this.f8276c.y());
    }

    public final void L() {
        TextView textView = this.f8310t;
        if (textView == null || !this.f8308s) {
            return;
        }
        textView.setText((CharSequence) null);
        y.a(this.f8273a, this.f8318x);
        this.f8310t.setVisibility(4);
    }

    public boolean M() {
        return this.f8276c.F();
    }

    public boolean N() {
        return this.f8290j.A();
    }

    public boolean O() {
        return this.f8290j.B();
    }

    public final boolean P() {
        return this.f8313u0;
    }

    public final boolean Q() {
        if (d0()) {
            return true;
        }
        return this.f8300o != null && this.f8296m;
    }

    public boolean R() {
        return this.E;
    }

    public final boolean S() {
        return this.O == 1 && this.f8278d.getMinLines() <= 1;
    }

    public boolean T() {
        return this.b.k();
    }

    public final void U() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.O != 0) {
            t0();
        }
        b0();
    }

    public final void V() {
        if (B()) {
            RectF rectF = this.f8274a0;
            this.f8315v0.o(rectF, this.f8278d.getWidth(), this.f8278d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
            ((kd.h) this.F).t0(rectF);
        }
    }

    public final void W() {
        if (!B() || this.f8313u0) {
            return;
        }
        y();
        V();
    }

    public void Y() {
        this.b.m();
    }

    public final void Z() {
        TextView textView = this.f8310t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void a0(float f10, float f11, float f12, float f13) {
        boolean h10 = r.h(this);
        this.M = h10;
        float f14 = h10 ? f11 : f10;
        if (!h10) {
            f10 = f11;
        }
        float f15 = h10 ? f13 : f12;
        if (!h10) {
            f12 = f13;
        }
        hd.g gVar = this.F;
        if (gVar != null && gVar.J() == f14 && this.F.K() == f10 && this.F.s() == f15 && this.F.t() == f12) {
            return;
        }
        this.L = this.L.v().A(f14).E(f10).s(f15).w(f12).m();
        m();
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f8273a.addView(view, layoutParams2);
        this.f8273a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    public final void b0() {
        EditText editText = this.f8278d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.O;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public void c0(@NonNull TextView textView, int i10) {
        try {
            d3.i.s(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        d3.i.s(textView, j.b);
        textView.setTextColor(l2.b.c(getContext(), ic.c.f20420a));
    }

    public boolean d0() {
        return this.f8290j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(MotionEventCompat.AXIS_SCROLL)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f8278d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f8280e != null) {
            boolean z10 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f8278d.setHint(this.f8280e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f8278d.setHint(hint);
                this.E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f8273a.getChildCount());
        for (int i11 = 0; i11 < this.f8273a.getChildCount(); i11++) {
            View childAt = this.f8273a.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f8278d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f8323z0) {
            return;
        }
        this.f8323z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ad.a aVar = this.f8315v0;
        boolean f02 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f8278d != null) {
            u0(o0.R(this) && isEnabled());
        }
        p0();
        A0();
        if (f02) {
            invalidate();
        }
        this.f8323z0 = false;
    }

    public final boolean e0() {
        return (this.f8276c.G() || ((this.f8276c.A() && M()) || this.f8276c.w() != null)) && this.f8276c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0;
    }

    public final void g0() {
        if (this.f8310t == null || !this.f8308s || TextUtils.isEmpty(this.f8306r)) {
            return;
        }
        this.f8310t.setText(this.f8306r);
        y.a(this.f8273a, this.f8316w);
        this.f8310t.setVisibility(0);
        this.f8310t.bringToFront();
        announceForAccessibility(this.f8306r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f8278d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @NonNull
    public hd.g getBoxBackground() {
        int i10 = this.O;
        if (i10 == 1 || i10 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return r.h(this) ? this.L.j().a(this.f8274a0) : this.L.l().a(this.f8274a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return r.h(this) ? this.L.l().a(this.f8274a0) : this.L.j().a(this.f8274a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return r.h(this) ? this.L.r().a(this.f8274a0) : this.L.t().a(this.f8274a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return r.h(this) ? this.L.t().a(this.f8274a0) : this.L.r().a(this.f8274a0);
    }

    public int getBoxStrokeColor() {
        return this.f8297m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8299n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.f8294l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f8292k && this.f8296m && (textView = this.f8300o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8322z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8320y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8289i0;
    }

    public EditText getEditText() {
        return this.f8278d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8276c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f8276c.n();
    }

    public int getEndIconMinSize() {
        return this.f8276c.o();
    }

    public int getEndIconMode() {
        return this.f8276c.p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f8276c.q();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f8276c.r();
    }

    public CharSequence getError() {
        if (this.f8290j.A()) {
            return this.f8290j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f8290j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f8290j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f8290j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8276c.s();
    }

    public CharSequence getHelperText() {
        if (this.f8290j.B()) {
            return this.f8290j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8290j.u();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f8315v0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f8315v0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f8291j0;
    }

    @NonNull
    public e getLengthCounter() {
        return this.f8298n;
    }

    public int getMaxEms() {
        return this.f8284g;
    }

    public int getMaxWidth() {
        return this.f8288i;
    }

    public int getMinEms() {
        return this.f8282f;
    }

    public int getMinWidth() {
        return this.f8286h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8276c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8276c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8308s) {
            return this.f8306r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8314v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8312u;
    }

    public CharSequence getPrefixText() {
        return this.b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.b.d();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.b.f();
    }

    public int getStartIconMinSize() {
        return this.b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h();
    }

    public CharSequence getSuffixText() {
        return this.f8276c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8276c.x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f8276c.z();
    }

    public Typeface getTypeface() {
        return this.f8275b0;
    }

    public final void h0() {
        if (this.O == 1) {
            if (ed.c.h(getContext())) {
                this.P = getResources().getDimensionPixelSize(ic.d.G);
            } else if (ed.c.g(getContext())) {
                this.P = getResources().getDimensionPixelSize(ic.d.F);
            }
        }
    }

    public void i(@NonNull f fVar) {
        this.f8281e0.add(fVar);
        if (this.f8278d != null) {
            fVar.a(this);
        }
    }

    public final void i0(@NonNull Rect rect) {
        hd.g gVar = this.J;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.R, rect.right, i10);
        }
        hd.g gVar2 = this.K;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.S, rect.right, i11);
        }
    }

    public final void j() {
        TextView textView = this.f8310t;
        if (textView != null) {
            this.f8273a.addView(textView);
            this.f8310t.setVisibility(0);
        }
    }

    public final void j0() {
        if (this.f8300o != null) {
            EditText editText = this.f8278d;
            k0(editText == null ? null : editText.getText());
        }
    }

    public final void k() {
        if (this.f8278d == null || this.O != 1) {
            return;
        }
        if (ed.c.h(getContext())) {
            EditText editText = this.f8278d;
            o0.B0(editText, o0.E(editText), getResources().getDimensionPixelSize(ic.d.E), o0.D(this.f8278d), getResources().getDimensionPixelSize(ic.d.D));
        } else if (ed.c.g(getContext())) {
            EditText editText2 = this.f8278d;
            o0.B0(editText2, o0.E(editText2), getResources().getDimensionPixelSize(ic.d.C), o0.D(this.f8278d), getResources().getDimensionPixelSize(ic.d.B));
        }
    }

    public void k0(Editable editable) {
        int a10 = this.f8298n.a(editable);
        boolean z10 = this.f8296m;
        int i10 = this.f8294l;
        if (i10 == -1) {
            this.f8300o.setText(String.valueOf(a10));
            this.f8300o.setContentDescription(null);
            this.f8296m = false;
        } else {
            this.f8296m = a10 > i10;
            l0(getContext(), this.f8300o, a10, this.f8294l, this.f8296m);
            if (z10 != this.f8296m) {
                m0();
            }
            this.f8300o.setText(w2.a.c().j(getContext().getString(i.f20529d, Integer.valueOf(a10), Integer.valueOf(this.f8294l))));
        }
        if (this.f8278d == null || z10 == this.f8296m) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    public void l(float f10) {
        if (this.f8315v0.x() == f10) {
            return;
        }
        if (this.f8321y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8321y0 = valueAnimator;
            valueAnimator.setInterpolator(h.g(getContext(), ic.b.P, jc.a.b));
            this.f8321y0.setDuration(h.f(getContext(), ic.b.I, 167));
            this.f8321y0.addUpdateListener(new c());
        }
        this.f8321y0.setFloatValues(this.f8315v0.x(), f10);
        this.f8321y0.start();
    }

    public final void m() {
        hd.g gVar = this.F;
        if (gVar == null) {
            return;
        }
        k E = gVar.E();
        k kVar = this.L;
        if (E != kVar) {
            this.F.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.F.g0(this.Q, this.T);
        }
        int q10 = q();
        this.U = q10;
        this.F.a0(ColorStateList.valueOf(q10));
        n();
        r0();
    }

    public final void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f8300o;
        if (textView != null) {
            c0(textView, this.f8296m ? this.f8302p : this.f8304q);
            if (!this.f8296m && (colorStateList2 = this.f8320y) != null) {
                this.f8300o.setTextColor(colorStateList2);
            }
            if (!this.f8296m || (colorStateList = this.f8322z) == null) {
                return;
            }
            this.f8300o.setTextColor(colorStateList);
        }
    }

    public final void n() {
        if (this.J == null || this.K == null) {
            return;
        }
        if (x()) {
            this.J.a0(this.f8278d.isFocused() ? ColorStateList.valueOf(this.f8293k0) : ColorStateList.valueOf(this.T));
            this.K.a0(ColorStateList.valueOf(this.T));
        }
        invalidate();
    }

    public final void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A;
        if (colorStateList2 == null) {
            colorStateList2 = uc.a.g(getContext(), ic.b.f20397g);
        }
        EditText editText = this.f8278d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = q2.a.r(this.f8278d.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.B) != null) {
            colorStateList2 = colorStateList;
        }
        q2.a.o(mutate, colorStateList2);
    }

    public final void o(@NonNull RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.N;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    public boolean o0() {
        boolean z10;
        if (this.f8278d == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.f8278d.getPaddingLeft();
            if (this.f8277c0 == null || this.f8279d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f8277c0 = colorDrawable;
                this.f8279d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] d10 = d3.i.d(this.f8278d);
            Drawable drawable = d10[0];
            Drawable drawable2 = this.f8277c0;
            if (drawable != drawable2) {
                d3.i.m(this.f8278d, drawable2, d10[1], d10[2], d10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f8277c0 != null) {
                Drawable[] d11 = d3.i.d(this.f8278d);
                d3.i.m(this.f8278d, null, d11[1], d11[2], d11[3]);
                this.f8277c0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f8276c.z().getMeasuredWidth() - this.f8278d.getPaddingRight();
            CheckableImageButton k10 = this.f8276c.k();
            if (k10 != null) {
                measuredWidth2 = measuredWidth2 + k10.getMeasuredWidth() + n.b((ViewGroup.MarginLayoutParams) k10.getLayoutParams());
            }
            Drawable[] d12 = d3.i.d(this.f8278d);
            Drawable drawable3 = this.f8283f0;
            if (drawable3 != null && this.f8285g0 != measuredWidth2) {
                this.f8285g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                d3.i.m(this.f8278d, d12[0], d12[1], this.f8283f0, d12[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f8283f0 = colorDrawable2;
                this.f8285g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = d12[2];
            Drawable drawable5 = this.f8283f0;
            if (drawable4 != drawable5) {
                this.f8287h0 = drawable4;
                d3.i.m(this.f8278d, d12[0], d12[1], drawable5, d12[3]);
                return true;
            }
        } else if (this.f8283f0 != null) {
            Drawable[] d13 = d3.i.d(this.f8278d);
            if (d13[2] == this.f8283f0) {
                d3.i.m(this.f8278d, d13[0], d13[1], this.f8287h0, d13[3]);
            } else {
                z11 = z10;
            }
            this.f8283f0 = null;
            return z11;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8315v0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8276c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.B0 = false;
        boolean s02 = s0();
        boolean o02 = o0();
        if (s02 || o02) {
            this.f8278d.post(new Runnable() { // from class: kd.y
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.f8278d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f8278d;
        if (editText != null) {
            Rect rect = this.V;
            ad.c.a(this, editText, rect);
            i0(rect);
            if (this.C) {
                this.f8315v0.a0(this.f8278d.getTextSize());
                int gravity = this.f8278d.getGravity();
                this.f8315v0.S((gravity & (-113)) | 48);
                this.f8315v0.Z(gravity);
                this.f8315v0.O(r(rect));
                this.f8315v0.W(u(rect));
                this.f8315v0.J();
                if (!B() || this.f8313u0) {
                    return;
                }
                V();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.B0) {
            this.f8276c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        w0();
        this.f8276c.x0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f8324c);
        if (savedState.f8325d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.M) {
            float a10 = this.L.r().a(this.f8274a0);
            float a11 = this.L.t().a(this.f8274a0);
            k m10 = k.a().z(this.L.s()).D(this.L.q()).r(this.L.k()).v(this.L.i()).A(a11).E(a10).s(this.L.l().a(this.f8274a0)).w(this.L.j().a(this.f8274a0)).m();
            this.M = z10;
            setShapeAppearanceModel(m10);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (d0()) {
            savedState.f8324c = getError();
        }
        savedState.f8325d = this.f8276c.E();
        return savedState;
    }

    public final void p() {
        int i10 = this.O;
        if (i10 == 0) {
            this.F = null;
            this.J = null;
            this.K = null;
            return;
        }
        if (i10 == 1) {
            this.F = new hd.g(this.L);
            this.J = new hd.g();
            this.K = new hd.g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof kd.h)) {
                this.F = new hd.g(this.L);
            } else {
                this.F = kd.h.o0(this.L);
            }
            this.J = null;
            this.K = null;
        }
    }

    public void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f8278d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (k0.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(q.k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f8296m && (textView = this.f8300o) != null) {
            background.setColorFilter(q.k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            q2.a.c(background);
            this.f8278d.refreshDrawableState();
        }
    }

    public final int q() {
        return this.O == 1 ? uc.a.i(uc.a.e(this, ic.b.f20408o, 0), this.U) : this.U;
    }

    public final void q0() {
        o0.q0(this.f8278d, getEditTextBoxBackground());
    }

    @NonNull
    public final Rect r(@NonNull Rect rect) {
        if (this.f8278d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        boolean h10 = r.h(this);
        rect2.bottom = rect.bottom;
        int i10 = this.O;
        if (i10 == 1) {
            rect2.left = I(rect.left, h10);
            rect2.top = rect.top + this.P;
            rect2.right = J(rect.right, h10);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, h10);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, h10);
            return rect2;
        }
        rect2.left = rect.left + this.f8278d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f8278d.getPaddingRight();
        return rect2;
    }

    public void r0() {
        EditText editText = this.f8278d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            q0();
            this.I = true;
        }
    }

    public final int s(@NonNull Rect rect, @NonNull Rect rect2, float f10) {
        return S() ? (int) (rect2.top + f10) : rect.bottom - this.f8278d.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int max;
        if (this.f8278d == null || this.f8278d.getMeasuredHeight() >= (max = Math.max(this.f8276c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.f8278d.setMinimumHeight(max);
        return true;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.f8301o0 = i10;
            this.f8305q0 = i10;
            this.f8307r0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(l2.b.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8301o0 = defaultColor;
        this.U = defaultColor;
        this.f8303p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8305q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f8307r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.O) {
            return;
        }
        this.O = i10;
        if (this.f8278d != null) {
            U();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.P = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.L = this.L.v().y(i10, this.L.r()).C(i10, this.L.t()).q(i10, this.L.j()).u(i10, this.L.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f8297m0 != i10) {
            this.f8297m0 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8293k0 = colorStateList.getDefaultColor();
            this.f8309s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8295l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f8297m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f8297m0 != colorStateList.getDefaultColor()) {
            this.f8297m0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8299n0 != colorStateList) {
            this.f8299n0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.R = i10;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.S = i10;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f8292k != z10) {
            if (z10) {
                b0 b0Var = new b0(getContext());
                this.f8300o = b0Var;
                b0Var.setId(ic.f.P);
                Typeface typeface = this.f8275b0;
                if (typeface != null) {
                    this.f8300o.setTypeface(typeface);
                }
                this.f8300o.setMaxLines(1);
                this.f8290j.e(this.f8300o, 2);
                n.d((ViewGroup.MarginLayoutParams) this.f8300o.getLayoutParams(), getResources().getDimensionPixelOffset(ic.d.f20451l0));
                m0();
                j0();
            } else {
                this.f8290j.C(this.f8300o, 2);
                this.f8300o = null;
            }
            this.f8292k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f8294l != i10) {
            if (i10 > 0) {
                this.f8294l = i10;
            } else {
                this.f8294l = -1;
            }
            if (this.f8292k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f8302p != i10) {
            this.f8302p = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8322z != colorStateList) {
            this.f8322z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f8304q != i10) {
            this.f8304q = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8320y != colorStateList) {
            this.f8320y = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8289i0 = colorStateList;
        this.f8291j0 = colorStateList;
        if (this.f8278d != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        X(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f8276c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f8276c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f8276c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f8276c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f8276c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f8276c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8276c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8276c.W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f8276c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f8276c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f8276c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f8276c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8290j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8290j.w();
        } else {
            this.f8290j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f8290j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8290j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f8290j.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f8276c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8276c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8276c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8276c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f8276c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f8290j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8290j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f8317w0 != z10) {
            this.f8317w0 = z10;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f8290j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8290j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f8290j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f8290j.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f8319x0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.C) {
            this.C = z10;
            if (z10) {
                CharSequence hint = this.f8278d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f8278d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f8278d.getHint())) {
                    this.f8278d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f8278d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f8315v0.P(i10);
        this.f8291j0 = this.f8315v0.p();
        if (this.f8278d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8291j0 != colorStateList) {
            if (this.f8289i0 == null) {
                this.f8315v0.R(colorStateList);
            }
            this.f8291j0 = colorStateList;
            if (this.f8278d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull e eVar) {
        this.f8298n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f8284g = i10;
        EditText editText = this.f8278d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f8288i = i10;
        EditText editText = this.f8278d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f8282f = i10;
        EditText editText = this.f8278d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f8286h = i10;
        EditText editText = this.f8278d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f8276c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f8276c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f8276c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8276c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8276c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f8310t == null) {
            b0 b0Var = new b0(getContext());
            this.f8310t = b0Var;
            b0Var.setId(ic.f.S);
            o0.w0(this.f8310t, 2);
            o5.e A = A();
            this.f8316w = A;
            A.y0(67L);
            this.f8318x = A();
            setPlaceholderTextAppearance(this.f8314v);
            setPlaceholderTextColor(this.f8312u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f8308s) {
                setPlaceholderTextEnabled(true);
            }
            this.f8306r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f8314v = i10;
        TextView textView = this.f8310t;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8312u != colorStateList) {
            this.f8312u = colorStateList;
            TextView textView = this.f8310t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.b.o(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.b.p(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull k kVar) {
        hd.g gVar = this.F;
        if (gVar == null || gVar.E() == kVar) {
            return;
        }
        this.L = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.b.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b.v(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f8276c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f8276c.q0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f8276c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f8278d;
        if (editText != null) {
            o0.m0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8275b0) {
            this.f8275b0 = typeface;
            this.f8315v0.i0(typeface);
            this.f8290j.N(typeface);
            TextView textView = this.f8300o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(@NonNull Rect rect, float f10) {
        return S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f8278d.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8273a.getLayoutParams();
            int v5 = v();
            if (v5 != layoutParams.topMargin) {
                layoutParams.topMargin = v5;
                this.f8273a.requestLayout();
            }
        }
    }

    @NonNull
    public final Rect u(@NonNull Rect rect) {
        if (this.f8278d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        float w5 = this.f8315v0.w();
        rect2.left = rect.left + this.f8278d.getCompoundPaddingLeft();
        rect2.top = t(rect, w5);
        rect2.right = rect.right - this.f8278d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, w5);
        return rect2;
    }

    public void u0(boolean z10) {
        v0(z10, false);
    }

    public final int v() {
        float q10;
        if (!this.C) {
            return 0;
        }
        int i10 = this.O;
        if (i10 == 0) {
            q10 = this.f8315v0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            q10 = this.f8315v0.q() / 2.0f;
        }
        return (int) q10;
    }

    public final void v0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f8278d;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f8278d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f8289i0;
        if (colorStateList2 != null) {
            this.f8315v0.M(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f8289i0;
            this.f8315v0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f8309s0) : this.f8309s0));
        } else if (d0()) {
            this.f8315v0.M(this.f8290j.r());
        } else if (this.f8296m && (textView = this.f8300o) != null) {
            this.f8315v0.M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f8291j0) != null) {
            this.f8315v0.R(colorStateList);
        }
        if (z13 || !this.f8317w0 || (isEnabled() && z12)) {
            if (z11 || this.f8313u0) {
                z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f8313u0) {
            F(z10);
        }
    }

    public final boolean w() {
        return this.O == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.f8310t == null || (editText = this.f8278d) == null) {
            return;
        }
        this.f8310t.setGravity(editText.getGravity());
        this.f8310t.setPadding(this.f8278d.getCompoundPaddingLeft(), this.f8278d.getCompoundPaddingTop(), this.f8278d.getCompoundPaddingRight(), this.f8278d.getCompoundPaddingBottom());
    }

    public final boolean x() {
        return this.Q > -1 && this.T != 0;
    }

    public final void x0() {
        EditText editText = this.f8278d;
        y0(editText == null ? null : editText.getText());
    }

    public final void y() {
        if (B()) {
            ((kd.h) this.F).r0();
        }
    }

    public final void y0(Editable editable) {
        if (this.f8298n.a(editable) != 0 || this.f8313u0) {
            L();
        } else {
            g0();
        }
    }

    public final void z(boolean z10) {
        ValueAnimator valueAnimator = this.f8321y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8321y0.cancel();
        }
        if (z10 && this.f8319x0) {
            l(1.0f);
        } else {
            this.f8315v0.c0(1.0f);
        }
        this.f8313u0 = false;
        if (B()) {
            V();
        }
        x0();
        this.b.l(false);
        this.f8276c.H(false);
    }

    public final void z0(boolean z10, boolean z11) {
        int defaultColor = this.f8299n0.getDefaultColor();
        int colorForState = this.f8299n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f8299n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.T = colorForState2;
        } else if (z11) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f8276c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8276c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8276c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8276c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8276c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
