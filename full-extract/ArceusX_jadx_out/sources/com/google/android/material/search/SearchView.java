package com.google.android.material.search;

import ad.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import cd.c;
import cd.f;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import e.BackEventCompat;
import hd.h;
import ic.d;
import ic.e;
import ic.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, cd.b {

    /* renamed from: x, reason: collision with root package name */
    public static final int f8134x = j.f20560m;

    /* renamed from: a, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f8135a;
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public final View f8136c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f8137d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialToolbar f8138e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8139f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f8140g;

    /* renamed from: h, reason: collision with root package name */
    public final TouchObserverFrameLayout f8141h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8142i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final c f8143j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8144k;

    /* renamed from: l, reason: collision with root package name */
    public final xc.a f8145l;

    /* renamed from: m, reason: collision with root package name */
    public final Set<a> f8146m;

    /* renamed from: n, reason: collision with root package name */
    public SearchBar f8147n;

    /* renamed from: o, reason: collision with root package name */
    public int f8148o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8149p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8150q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8151r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8152s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8153t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8154u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public b f8155v;

    /* renamed from: w, reason: collision with root package name */
    public Map<View, Integer> f8156w;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.g() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public String f8157c;

        /* renamed from: d, reason: collision with root package name */
        public int f8158d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f8157c);
            parcel.writeInt(this.f8158d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8157c = parcel.readString();
            this.f8158d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface a {
        void a(@NonNull SearchView searchView, @NonNull b bVar, @NonNull b bVar2);
    }

    public enum b {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private Window getActivityWindow() {
        Activity a10 = ad.b.a(getContext());
        if (a10 == null) {
            return null;
        }
        return a10.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f8147n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(d.f20460u);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f8136c.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        xc.a aVar = this.f8145l;
        if (aVar == null || this.b == null) {
            return;
        }
        this.b.setBackgroundColor(aVar.c(this.f8152s, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            e(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f8137d, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f8136c.getLayoutParams().height != i10) {
            this.f8136c.getLayoutParams().height = i10;
            this.f8136c.requestLayout();
        }
    }

    @Override // cd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        if (!f() && this.f8147n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f8142i) {
            this.f8141h.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // cd.b
    public void b() {
        if (!f() && this.f8147n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // cd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        if (!f() && this.f8147n != null) {
            throw null;
        }
    }

    @Override // cd.b
    public void d() {
        if (!f()) {
            throw null;
        }
    }

    public void e(@NonNull View view) {
        this.f8137d.addView(view);
        this.f8137d.setVisibility(0);
    }

    public final boolean f() {
        return this.f8155v.equals(b.HIDDEN) || this.f8155v.equals(b.HIDING);
    }

    public boolean g() {
        return this.f8147n != null;
    }

    public f getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public b getCurrentTransitionState() {
        return this.f8155v;
    }

    public int getDefaultNavigationIconResource() {
        return e.b;
    }

    @NonNull
    public EditText getEditText() {
        return this.f8140g;
    }

    public CharSequence getHint() {
        return this.f8140g.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f8139f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f8139f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f8148o;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f8140g.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f8138e;
    }

    public final void h(@NonNull b bVar, boolean z10) {
        if (this.f8155v.equals(bVar)) {
            return;
        }
        if (z10) {
            if (bVar == b.SHOWN) {
                setModalForAccessibility(true);
            } else if (bVar == b.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        b bVar2 = this.f8155v;
        this.f8155v = bVar;
        Iterator it = new LinkedHashSet(this.f8146m).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this, bVar2, bVar);
        }
        j(bVar);
    }

    @SuppressLint({"InlinedApi"})
    public final void i(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f8135a.getId()) != null) {
                    i((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.f8156w.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    o0.w0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f8156w;
                    if (map != null && map.containsKey(childAt)) {
                        o0.w0(childAt, this.f8156w.get(childAt).intValue());
                    }
                }
            }
        }
    }

    public final void j(@NonNull b bVar) {
        if (this.f8147n == null || !this.f8144k) {
            return;
        }
        if (bVar.equals(b.SHOWN)) {
            this.f8143j.b();
        } else if (bVar.equals(b.HIDDEN)) {
            this.f8143j.d();
        }
    }

    public final void k() {
        ImageButton d10 = p.d(this.f8138e);
        if (d10 == null) {
            return;
        }
        int i10 = this.f8135a.getVisibility() == 0 ? 1 : 0;
        Drawable q10 = q2.a.q(d10.getDrawable());
        if (q10 instanceof l.b) {
            ((l.b) q10).a(i10);
        }
        if (q10 instanceof ad.e) {
            ((ad.e) q10).a(i10);
        }
    }

    public void l() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f8148o = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setText(savedState.f8157c);
        setVisible(savedState.f8158d == 0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f8157c = text == null ? null : text.toString();
        savedState.f8158d = this.f8135a.getVisibility();
        return savedState;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f8149p = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f8151r = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f8140g.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f8150q = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f8156w = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z10);
        if (z10) {
            return;
        }
        this.f8156w = null;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f8138e.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f8139f.setText(charSequence);
        this.f8139f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f8154u = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f8140g.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f8138e.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(@NonNull b bVar) {
        h(bVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f8153t = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f8135a.getVisibility() == 0;
        this.f8135a.setVisibility(z10 ? 0 : 8);
        k();
        h(z10 ? b.SHOWN : b.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f8147n = searchBar;
        throw null;
    }

    public void setHint(int i10) {
        this.f8140g.setHint(i10);
    }

    public void setText(int i10) {
        this.f8140g.setText(i10);
    }
}
