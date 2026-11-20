package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.a1;
import q.e1;
import q.g1;
import q.u0;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements o.c {

    /* renamed from: o0, reason: collision with root package name */
    public static final o f975o0;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public m K;
    public View.OnFocusChangeListener L;
    public View.OnClickListener M;
    public boolean N;
    public boolean O;
    public p3.a P;
    public boolean Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public CharSequence W;

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f976a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f977b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f978c0;

    /* renamed from: d0, reason: collision with root package name */
    public SearchableInfo f979d0;

    /* renamed from: e0, reason: collision with root package name */
    public Bundle f980e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Runnable f981f0;

    /* renamed from: g0, reason: collision with root package name */
    public Runnable f982g0;

    /* renamed from: h0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f983h0;

    /* renamed from: i0, reason: collision with root package name */
    public final View.OnClickListener f984i0;

    /* renamed from: j0, reason: collision with root package name */
    public View.OnKeyListener f985j0;

    /* renamed from: k0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f986k0;

    /* renamed from: l0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f987l0;

    /* renamed from: m0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f988m0;

    /* renamed from: n0, reason: collision with root package name */
    public TextWatcher f989n0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f990p;

    /* renamed from: q, reason: collision with root package name */
    public final View f991q;

    /* renamed from: r, reason: collision with root package name */
    public final View f992r;

    /* renamed from: s, reason: collision with root package name */
    public final View f993s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f994t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f995u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f996v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f997w;

    /* renamed from: x, reason: collision with root package name */
    public final View f998x;

    /* renamed from: y, reason: collision with root package name */
    public p f999y;

    /* renamed from: z, reason: collision with root package name */
    public Rect f1000z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f1001c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1001c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1001c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1001c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends q.d {

        /* renamed from: e, reason: collision with root package name */
        public int f1002e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f1003f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1004g;

        /* renamed from: h, reason: collision with root package name */
        public final Runnable f1005h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, i.a.f19813q);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f975o0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.f1004g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1004g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1002e <= 0 || super.enoughToFilter();
        }

        @Override // q.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1004g) {
                removeCallbacks(this.f1005h);
                post(this.f1005h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1003f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1003f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1003f.hasFocus() && getVisibility() == 0) {
                this.f1004g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1004g = false;
                removeCallbacks(this.f1005h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1004g = true;
                    return;
                }
                this.f1004g = false;
                removeCallbacks(this.f1005h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1003f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1002e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1005h = new a();
            this.f1002e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p3.a aVar = SearchView.this.P;
            if (aVar instanceof u0) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f994t) {
                searchView.T();
                return;
            }
            if (view == searchView.f996v) {
                searchView.P();
                return;
            }
            if (view == searchView.f995u) {
                searchView.U();
            } else if (view == searchView.f997w) {
                searchView.Y();
            } else if (view == searchView.f990p) {
                searchView.F();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f979d0 == null) {
                return false;
            }
            if (searchView.f990p.isPopupShowing() && SearchView.this.f990p.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f990p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f990p.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public Method f1017a;
        public Method b;

        /* renamed from: c, reason: collision with root package name */
        public Method f1018c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f1017a = null;
            this.b = null;
            this.f1018c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f1017a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1018c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1017a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1018c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f1019a;
        public final Rect b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f1020c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f1021d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1022e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1023f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1022e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.f1021d = new Rect();
            this.f1020c = new Rect();
            a(rect, rect2);
            this.f1019a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f1021d.set(rect);
            Rect rect3 = this.f1021d;
            int i10 = this.f1022e;
            rect3.inset(-i10, -i10);
            this.f1020c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1023f;
                    if (z11 && !this.f1021d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1023f;
                        this.f1023f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.b.contains(x10, y10)) {
                    this.f1023f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1020c.contains(x10, y10)) {
                Rect rect = this.f1020c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f1019a.getWidth() / 2, this.f1019a.getHeight() / 2);
            }
            return this.f1019a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f975o0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(i.d.f19836g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(i.d.f19837h);
    }

    private void setQuery(CharSequence charSequence) {
        this.f990p.setText(charSequence);
        this.f990p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f976a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f980e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f979d0.getSearchActivity());
        return intent;
    }

    public final Intent B(Cursor cursor, int i10, String str) {
        int i11;
        String n10;
        try {
            String n11 = u0.n(cursor, "suggest_intent_action");
            if (n11 == null) {
                n11 = this.f979d0.getSuggestIntentAction();
            }
            if (n11 == null) {
                n11 = "android.intent.action.SEARCH";
            }
            String str2 = n11;
            String n12 = u0.n(cursor, "suggest_intent_data");
            if (n12 == null) {
                n12 = this.f979d0.getSuggestIntentData();
            }
            if (n12 != null && (n10 = u0.n(cursor, "suggest_intent_data_id")) != null) {
                n12 = n12 + "/" + Uri.encode(n10);
            }
            return A(str2, n12 == null ? null : Uri.parse(n12), u0.n(cursor, "suggest_intent_extra_data"), u0.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f980e0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void E() {
        this.f990p.dismissDropDown();
    }

    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f990p);
            return;
        }
        o oVar = f975o0;
        oVar.b(this.f990p);
        oVar.a(this.f990p);
    }

    public final void G(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    public final CharSequence H(CharSequence charSequence) {
        if (!this.N || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f990p.getTextSize() * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean I() {
        SearchableInfo searchableInfo = this.f979d0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f979d0.getVoiceSearchLaunchWebSearch() ? this.H : this.f979d0.getVoiceSearchLaunchRecognizer() ? this.I : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean J() {
        return this.O;
    }

    public final boolean L() {
        return (this.Q || this.V) && !J();
    }

    public final void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    public void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    public final boolean O(int i10, int i11, String str) {
        Cursor c10 = this.P.c();
        if (c10 == null || !c10.moveToPosition(i10)) {
            return false;
        }
        M(B(c10, i11, str));
        return true;
    }

    public void P() {
        if (!TextUtils.isEmpty(this.f990p.getText())) {
            this.f990p.setText("");
            this.f990p.requestFocus();
            this.f990p.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            i0(true);
        }
    }

    public boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f990p.setImeVisibility(false);
        E();
        return true;
    }

    public boolean R(int i10) {
        a0(i10);
        return true;
    }

    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void T() {
        i0(false);
        this.f990p.requestFocus();
        this.f990p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void U() {
        Editable text = this.f990p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.K;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f979d0 != null) {
                N(0, null, text.toString());
            }
            this.f990p.setImeVisibility(false);
            E();
        }
    }

    public boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f979d0 != null && this.P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f990p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f990p.setSelection(i10 == 21 ? 0 : this.f990p.length());
                this.f990p.setListSelection(0);
                this.f990p.clearListSelection();
                this.f990p.b();
                return true;
            }
            if (i10 == 19) {
                this.f990p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void W(CharSequence charSequence) {
        Editable text = this.f990p.getText();
        this.f976a0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        h0(!isEmpty);
        j0(isEmpty);
        c0();
        g0();
        if (this.K != null && !TextUtils.equals(charSequence, this.W)) {
            this.K.a(charSequence.toString());
        }
        this.W = charSequence.toString();
    }

    public void X() {
        i0(J());
        Z();
        if (this.f990p.hasFocus()) {
            F();
        }
    }

    public void Y() {
        SearchableInfo searchableInfo = this.f979d0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Z() {
        post(this.f981f0);
    }

    public final void a0(int i10) {
        Editable text = this.f990p.getText();
        Cursor c10 = this.P.c();
        if (c10 == null) {
            return;
        }
        if (!c10.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence convertToString = this.P.convertToString(c10);
        if (convertToString != null) {
            setQuery(convertToString);
        } else {
            setQuery(text);
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f990p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f990p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f976a0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    public final void c0() {
        boolean isEmpty = TextUtils.isEmpty(this.f990p.getText());
        this.f996v.setVisibility(!isEmpty || (this.N && !this.f977b0) ? 0 : 8);
        Drawable drawable = this.f996v.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.T = true;
        super.clearFocus();
        this.f990p.clearFocus();
        this.f990p.setImeVisibility(false);
        this.T = false;
    }

    public void d0() {
        int[] iArr = this.f990p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f992r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f993s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f990p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    public final void f0() {
        this.f990p.setThreshold(this.f979d0.getSuggestThreshold());
        this.f990p.setImeOptions(this.f979d0.getImeOptions());
        int inputType = this.f979d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f979d0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f990p.setInputType(inputType);
        p3.a aVar = this.P;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f979d0.getSuggestAuthority() != null) {
            u0 u0Var = new u0(getContext(), this, this.f979d0, this.f983h0);
            this.P = u0Var;
            this.f990p.setAdapter(u0Var);
            ((u0) this.P).w(this.S ? 2 : 1);
        }
    }

    public final void g0() {
        this.f993s.setVisibility((L() && (this.f995u.getVisibility() == 0 || this.f997w.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f990p.getImeOptions();
    }

    public int getInputType() {
        return this.f990p.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f990p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f979d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f979d0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public p3.a getSuggestionsAdapter() {
        return this.P;
    }

    public final void h0(boolean z10) {
        this.f995u.setVisibility((this.Q && L() && hasFocus() && (z10 || !this.V)) ? 0 : 8);
    }

    public final void i0(boolean z10) {
        this.O = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f990p.getText());
        this.f994t.setVisibility(i11);
        h0(!isEmpty);
        this.f991q.setVisibility(z10 ? 8 : 0);
        if (this.D.getDrawable() != null && !this.N) {
            i10 = 0;
        }
        this.D.setVisibility(i10);
        c0();
        j0(isEmpty);
        g0();
    }

    public final void j0(boolean z10) {
        int i10 = 8;
        if (this.V && !J() && z10) {
            this.f995u.setVisibility(8);
            i10 = 0;
        }
        this.f997w.setVisibility(i10);
    }

    @Override // o.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f990p.setImeOptions(this.f978c0);
        this.f977b0 = false;
    }

    @Override // o.c
    public void onActionViewExpanded() {
        if (this.f977b0) {
            return;
        }
        this.f977b0 = true;
        int imeOptions = this.f990p.getImeOptions();
        this.f978c0 = imeOptions;
        this.f990p.setImeOptions(imeOptions | 33554432);
        this.f990p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f981f0);
        post(this.f982g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f990p, this.f1000z);
            Rect rect = this.A;
            Rect rect2 = this.f1000z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f999y;
            if (pVar != null) {
                pVar.a(this.A, this.f1000z);
                return;
            }
            p pVar2 = new p(this.A, this.f1000z, this.f990p);
            this.f999y = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.U;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.U) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        i0(savedState.f1001c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1001c = J();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f990p.requestFocus(i10, rect);
        if (requestFocus) {
            i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f980e0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f990p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f990p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.U = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.K = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.S = z10;
        p3.a aVar = this.P;
        if (aVar instanceof u0) {
            ((u0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f979d0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I = I();
        this.V = I;
        if (I) {
            this.f990p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.Q = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(p3.a aVar) {
        this.P = aVar;
        this.f990p.setAdapter(aVar);
    }

    public void z() {
        if (this.f998x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f992r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = g1.b(this);
            int dimensionPixelSize = this.N ? resources.getDimensionPixelSize(i.d.f19834e) + resources.getDimensionPixelSize(i.d.f19835f) : 0;
            this.f990p.getDropDownBackground().getPadding(rect);
            this.f990p.setDropDownHorizontalOffset(b10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f990p.setDropDownWidth((((this.f998x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.K);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1000z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f981f0 = new b();
        this.f982g0 = new c();
        this.f983h0 = new WeakHashMap<>();
        f fVar = new f();
        this.f984i0 = fVar;
        this.f985j0 = new g();
        h hVar = new h();
        this.f986k0 = hVar;
        i iVar = new i();
        this.f987l0 = iVar;
        j jVar = new j();
        this.f988m0 = jVar;
        this.f989n0 = new a();
        a1 v5 = a1.v(context, attributeSet, i.j.f19967h2, i10, 0);
        o0.k0(this, context, i.j.f19967h2, attributeSet, v5.r(), i10, 0);
        LayoutInflater.from(context).inflate(v5.n(i.j.f20017r2, i.g.f19909t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(i.f.I);
        this.f990p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f991q = findViewById(i.f.E);
        View findViewById = findViewById(i.f.H);
        this.f992r = findViewById;
        View findViewById2 = findViewById(i.f.O);
        this.f993s = findViewById2;
        ImageView imageView = (ImageView) findViewById(i.f.C);
        this.f994t = imageView;
        ImageView imageView2 = (ImageView) findViewById(i.f.F);
        this.f995u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(i.f.D);
        this.f996v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(i.f.J);
        this.f997w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(i.f.G);
        this.D = imageView5;
        o0.q0(findViewById, v5.g(i.j.f20022s2));
        o0.q0(findViewById2, v5.g(i.j.f20042w2));
        imageView.setImageDrawable(v5.g(i.j.f20037v2));
        imageView2.setImageDrawable(v5.g(i.j.f20007p2));
        imageView3.setImageDrawable(v5.g(i.j.f19992m2));
        imageView4.setImageDrawable(v5.g(i.j.f20052y2));
        imageView5.setImageDrawable(v5.g(i.j.f20037v2));
        this.E = v5.g(i.j.f20032u2);
        e1.a(imageView, getResources().getString(i.h.f19925p));
        this.F = v5.n(i.j.f20047x2, i.g.f19908s);
        this.G = v5.n(i.j.f19997n2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f989n0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f985j0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v5.a(i.j.f20012q2, true));
        int f10 = v5.f(i.j.f19977j2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.J = v5.p(i.j.f20002o2);
        this.R = v5.p(i.j.f20027t2);
        int k10 = v5.k(i.j.f19987l2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v5.k(i.j.f19982k2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v5.a(i.j.f19972i2, true));
        v5.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f998x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.N);
        e0();
    }
}
