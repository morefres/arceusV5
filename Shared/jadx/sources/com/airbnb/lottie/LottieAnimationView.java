package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import f7.h0;
import f7.i;
import f7.i0;
import f7.l0;
import f7.n0;
import f7.o0;
import f7.p0;
import f7.s0;
import f7.u0;
import f7.v0;
import f7.w0;
import f7.x0;
import f7.y0;
import f7.z0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import q.q;
import s7.m;
import t7.e;

/* loaded from: classes3.dex */
public class LottieAnimationView extends q {

    /* renamed from: q, reason: collision with root package name */
    public static final String f5058q = "LottieAnimationView";

    /* renamed from: r, reason: collision with root package name */
    public static final l0<Throwable> f5059r = new l0() { // from class: f7.g
        @Override // f7.l0
        public final void onResult(Object obj) {
            LottieAnimationView.d((Throwable) obj);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public final l0<i> f5060d;

    /* renamed from: e, reason: collision with root package name */
    public final l0<Throwable> f5061e;

    /* renamed from: f, reason: collision with root package name */
    public l0<Throwable> f5062f;

    /* renamed from: g, reason: collision with root package name */
    public int f5063g;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f5064h;

    /* renamed from: i, reason: collision with root package name */
    public String f5065i;

    /* renamed from: j, reason: collision with root package name */
    public int f5066j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5067k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5068l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5069m;

    /* renamed from: n, reason: collision with root package name */
    public final Set<b> f5070n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<n0> f5071o;

    /* renamed from: p, reason: collision with root package name */
    public s0<i> f5072p;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f5073a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public float f5074c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5075d;

        /* renamed from: e, reason: collision with root package name */
        public String f5076e;

        /* renamed from: f, reason: collision with root package name */
        public int f5077f;

        /* renamed from: g, reason: collision with root package name */
        public int f5078g;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f5073a);
            parcel.writeFloat(this.f5074c);
            parcel.writeInt(this.f5075d ? 1 : 0);
            parcel.writeString(this.f5076e);
            parcel.writeInt(this.f5077f);
            parcel.writeInt(this.f5078g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5073a = parcel.readString();
            this.f5074c = parcel.readFloat();
            this.f5075d = parcel.readInt() == 1;
            this.f5076e = parcel.readString();
            this.f5077f = parcel.readInt();
            this.f5078g = parcel.readInt();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends t7.c<T> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f5079d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f5080e;

        public a(LottieAnimationView lottieAnimationView, e eVar) {
            this.f5079d = eVar;
            this.f5080e = lottieAnimationView;
        }

        @Override // t7.c
        public T a(t7.b<T> bVar) {
            return (T) this.f5079d.a(bVar);
        }
    }

    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static class c implements l0<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f5087a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f5087a = new WeakReference<>(lottieAnimationView);
        }

        @Override // f7.l0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f5087a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f5063g != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f5063g);
            }
            (lottieAnimationView.f5062f == null ? LottieAnimationView.f5059r : lottieAnimationView.f5062f).onResult(th2);
        }
    }

    public static class d implements l0<i> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f5088a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f5088a = new WeakReference<>(lottieAnimationView);
        }

        @Override // f7.l0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(i iVar) {
            LottieAnimationView lottieAnimationView = this.f5088a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(iVar);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5060d = new d(this);
        this.f5061e = new c(this);
        this.f5063g = 0;
        this.f5064h = new h0();
        this.f5067k = false;
        this.f5068l = false;
        this.f5069m = true;
        this.f5070n = new HashSet();
        this.f5071o = new HashSet();
        s(attributeSet, v0.f17031a);
    }

    public static /* synthetic */ p0 c(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f5069m ? f7.q.l(lottieAnimationView.getContext(), str) : f7.q.m(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th2) {
        if (!m.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        s7.e.d("Unable to load composition.", th2);
    }

    public static /* synthetic */ p0 e(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f5069m ? f7.q.x(lottieAnimationView.getContext(), i10) : f7.q.y(lottieAnimationView.getContext(), i10, null);
    }

    private void setCompositionTask(s0<i> s0Var) {
        p0<i> e10 = s0Var.e();
        h0 h0Var = this.f5064h;
        if (e10 != null && h0Var == getDrawable() && h0Var.J() == e10.b()) {
            return;
        }
        this.f5070n.add(b.SET_ANIMATION);
        o();
        n();
        this.f5072p = s0Var.d(this.f5060d).c(this.f5061e);
    }

    public final void A() {
        boolean t8 = t();
        setImageDrawable(null);
        setImageDrawable(this.f5064h);
        if (t8) {
            this.f5064h.o0();
        }
    }

    public final void B(float f10, boolean z10) {
        if (z10) {
            this.f5070n.add(b.SET_PROGRESS);
        }
        this.f5064h.O0(f10);
    }

    public f7.a getAsyncUpdates() {
        return this.f5064h.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f5064h.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f5064h.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f5064h.I();
    }

    public i getComposition() {
        Drawable drawable = getDrawable();
        h0 h0Var = this.f5064h;
        if (drawable == h0Var) {
            return h0Var.J();
        }
        return null;
    }

    public long getDuration() {
        i composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f5064h.M();
    }

    public String getImageAssetsFolder() {
        return this.f5064h.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f5064h.Q();
    }

    public float getMaxFrame() {
        return this.f5064h.S();
    }

    public float getMinFrame() {
        return this.f5064h.T();
    }

    public u0 getPerformanceTracker() {
        return this.f5064h.U();
    }

    public float getProgress() {
        return this.f5064h.V();
    }

    public x0 getRenderMode() {
        return this.f5064h.W();
    }

    public int getRepeatCount() {
        return this.f5064h.X();
    }

    public int getRepeatMode() {
        return this.f5064h.Y();
    }

    public float getSpeed() {
        return this.f5064h.Z();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f5064h.q(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof h0) && ((h0) drawable).W() == x0.SOFTWARE) {
            this.f5064h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        h0 h0Var = this.f5064h;
        if (drawable2 == h0Var) {
            super.invalidateDrawable(h0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(@NonNull n0 n0Var) {
        i composition = getComposition();
        if (composition != null) {
            n0Var.a(composition);
        }
        return this.f5071o.add(n0Var);
    }

    public <T> void k(l7.e eVar, T t8, t7.c<T> cVar) {
        this.f5064h.r(eVar, t8, cVar);
    }

    public <T> void l(l7.e eVar, T t8, e<T> eVar2) {
        this.f5064h.r(eVar, t8, new a(this, eVar2));
    }

    public void m() {
        this.f5068l = false;
        this.f5070n.add(b.PLAY_OPTION);
        this.f5064h.u();
    }

    public final void n() {
        s0<i> s0Var = this.f5072p;
        if (s0Var != null) {
            s0Var.k(this.f5060d);
            this.f5072p.j(this.f5061e);
        }
    }

    public final void o() {
        this.f5064h.v();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f5068l) {
            return;
        }
        this.f5064h.j0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5065i = savedState.f5073a;
        Set<b> set = this.f5070n;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f5065i)) {
            setAnimation(this.f5065i);
        }
        this.f5066j = savedState.b;
        if (!this.f5070n.contains(bVar) && (i10 = this.f5066j) != 0) {
            setAnimation(i10);
        }
        if (!this.f5070n.contains(b.SET_PROGRESS)) {
            B(savedState.f5074c, false);
        }
        if (!this.f5070n.contains(b.PLAY_OPTION) && savedState.f5075d) {
            v();
        }
        if (!this.f5070n.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f5076e);
        }
        if (!this.f5070n.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f5077f);
        }
        if (this.f5070n.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f5078g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5073a = this.f5065i;
        savedState.b = this.f5066j;
        savedState.f5074c = this.f5064h.V();
        savedState.f5075d = this.f5064h.e0();
        savedState.f5076e = this.f5064h.O();
        savedState.f5077f = this.f5064h.Y();
        savedState.f5078g = this.f5064h.X();
        return savedState;
    }

    public void p(boolean z10) {
        this.f5064h.A(i0.MergePathsApi19, z10);
    }

    public final s0<i> q(final String str) {
        return isInEditMode() ? new s0<>(new Callable() { // from class: f7.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.c(LottieAnimationView.this, str);
            }
        }, true) : this.f5069m ? f7.q.j(getContext(), str) : f7.q.k(getContext(), str, null);
    }

    public final s0<i> r(final int i10) {
        return isInEditMode() ? new s0<>(new Callable() { // from class: f7.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.e(LottieAnimationView.this, i10);
            }
        }, true) : this.f5069m ? f7.q.v(getContext(), i10) : f7.q.w(getContext(), i10, null);
    }

    public final void s(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w0.f17034a, i10, 0);
        this.f5069m = obtainStyledAttributes.getBoolean(w0.f17038f, true);
        boolean hasValue = obtainStyledAttributes.hasValue(w0.f17050r);
        boolean hasValue2 = obtainStyledAttributes.hasValue(w0.f17045m);
        boolean hasValue3 = obtainStyledAttributes.hasValue(w0.f17055w);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(w0.f17050r, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(w0.f17045m);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(w0.f17055w)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(w0.f17044l, 0));
        if (obtainStyledAttributes.getBoolean(w0.f17037e, false)) {
            this.f5068l = true;
        }
        if (obtainStyledAttributes.getBoolean(w0.f17048p, false)) {
            this.f5064h.Q0(-1);
        }
        if (obtainStyledAttributes.hasValue(w0.f17053u)) {
            setRepeatMode(obtainStyledAttributes.getInt(w0.f17053u, 1));
        }
        if (obtainStyledAttributes.hasValue(w0.f17052t)) {
            setRepeatCount(obtainStyledAttributes.getInt(w0.f17052t, -1));
        }
        if (obtainStyledAttributes.hasValue(w0.f17054v)) {
            setSpeed(obtainStyledAttributes.getFloat(w0.f17054v, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(w0.f17040h)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(w0.f17040h, true));
        }
        if (obtainStyledAttributes.hasValue(w0.f17039g)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(w0.f17039g, false));
        }
        if (obtainStyledAttributes.hasValue(w0.f17042j)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(w0.f17042j));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(w0.f17047o));
        B(obtainStyledAttributes.getFloat(w0.f17049q, 0.0f), obtainStyledAttributes.hasValue(w0.f17049q));
        p(obtainStyledAttributes.getBoolean(w0.f17043k, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(w0.b, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(w0.f17035c, true));
        if (obtainStyledAttributes.hasValue(w0.f17041i)) {
            k(new l7.e("**"), o0.K, new t7.c(new y0(k.a.a(getContext(), obtainStyledAttributes.getResourceId(w0.f17041i, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(w0.f17051s)) {
            int i11 = w0.f17051s;
            x0 x0Var = x0.AUTOMATIC;
            int i12 = obtainStyledAttributes.getInt(i11, x0Var.ordinal());
            if (i12 >= x0.values().length) {
                i12 = x0Var.ordinal();
            }
            setRenderMode(x0.values()[i12]);
        }
        if (obtainStyledAttributes.hasValue(w0.f17036d)) {
            int i13 = w0.f17036d;
            f7.a aVar = f7.a.AUTOMATIC;
            int i14 = obtainStyledAttributes.getInt(i13, aVar.ordinal());
            if (i14 >= x0.values().length) {
                i14 = aVar.ordinal();
            }
            setAsyncUpdates(f7.a.values()[i14]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(w0.f17046n, false));
        if (obtainStyledAttributes.hasValue(w0.f17056x)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(w0.f17056x, false));
        }
        obtainStyledAttributes.recycle();
    }

    public void setAnimation(int i10) {
        this.f5066j = i10;
        this.f5065i = null;
        setCompositionTask(r(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f5069m ? f7.q.z(getContext(), str) : f7.q.A(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f5064h.q0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f5064h.r0(z10);
    }

    public void setAsyncUpdates(f7.a aVar) {
        this.f5064h.s0(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f5069m = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f5064h.t0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f5064h.u0(z10);
    }

    public void setComposition(@NonNull i iVar) {
        if (f7.e.f16906a) {
            Log.v(f5058q, "Set Composition \n" + iVar);
        }
        this.f5064h.setCallback(this);
        this.f5067k = true;
        boolean v02 = this.f5064h.v0(iVar);
        if (this.f5068l) {
            this.f5064h.j0();
        }
        this.f5067k = false;
        if (getDrawable() != this.f5064h || v02) {
            if (!v02) {
                A();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<n0> it = this.f5071o.iterator();
            while (it.hasNext()) {
                it.next().a(iVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f5064h.w0(str);
    }

    public void setFailureListener(l0<Throwable> l0Var) {
        this.f5062f = l0Var;
    }

    public void setFallbackResource(int i10) {
        this.f5063g = i10;
    }

    public void setFontAssetDelegate(f7.b bVar) {
        this.f5064h.x0(bVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f5064h.y0(map);
    }

    public void setFrame(int i10) {
        this.f5064h.z0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f5064h.A0(z10);
    }

    public void setImageAssetDelegate(f7.c cVar) {
        this.f5064h.B0(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f5064h.C0(str);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f5066j = 0;
        this.f5065i = null;
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f5066j = 0;
        this.f5065i = null;
        n();
        super.setImageDrawable(drawable);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f5066j = 0;
        this.f5065i = null;
        n();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f5064h.D0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f5064h.E0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f5064h.G0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5064h.I0(str);
    }

    public void setMinFrame(int i10) {
        this.f5064h.J0(i10);
    }

    public void setMinProgress(float f10) {
        this.f5064h.L0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f5064h.M0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f5064h.N0(z10);
    }

    public void setProgress(float f10) {
        B(f10, true);
    }

    public void setRenderMode(x0 x0Var) {
        this.f5064h.P0(x0Var);
    }

    public void setRepeatCount(int i10) {
        this.f5070n.add(b.SET_REPEAT_COUNT);
        this.f5064h.Q0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f5070n.add(b.SET_REPEAT_MODE);
        this.f5064h.R0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f5064h.S0(z10);
    }

    public void setSpeed(float f10) {
        this.f5064h.T0(f10);
    }

    public void setTextDelegate(z0 z0Var) {
        this.f5064h.U0(z0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f5064h.V0(z10);
    }

    public boolean t() {
        return this.f5064h.d0();
    }

    public void u() {
        this.f5068l = false;
        this.f5064h.i0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        h0 h0Var;
        if (!this.f5067k && drawable == (h0Var = this.f5064h) && h0Var.d0()) {
            u();
        } else if (!this.f5067k && (drawable instanceof h0)) {
            h0 h0Var2 = (h0) drawable;
            if (h0Var2.d0()) {
                h0Var2.i0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f5070n.add(b.PLAY_OPTION);
        this.f5064h.j0();
    }

    public void w() {
        this.f5064h.k0();
    }

    public void x() {
        this.f5064h.l0();
    }

    public void y(InputStream inputStream, String str) {
        setCompositionTask(f7.q.o(inputStream, str));
    }

    public void z(String str, String str2) {
        y(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f5064h.F0(str);
    }

    public void setMinFrame(String str) {
        this.f5064h.K0(str);
    }

    public void setAnimation(String str) {
        this.f5065i = str;
        this.f5066j = 0;
        setCompositionTask(q(str));
    }
}
