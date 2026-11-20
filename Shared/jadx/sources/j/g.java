package j;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.l;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a1;
import androidx.core.view.l;
import androidx.core.view.o0;
import androidx.core.view.y;
import androidx.core.view.y0;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import n2.h;
import o.b;
import o.f;
import org.xmlpull.v1.XmlPullParser;
import q.e0;
import q.f1;
import q.g1;

/* loaded from: classes.dex */
public class g extends j.e implements e.a, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    public static final w1.j<String, Integer> f21310j0 = new w1.j<>();

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f21311k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f21312l0 = {R.attr.windowBackground};

    /* renamed from: m0, reason: collision with root package name */
    public static final boolean f21313m0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public q[] M;
    public q N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public n X;
    public n Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f21314a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Runnable f21315b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f21316c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f21317d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f21318e0;

    /* renamed from: f0, reason: collision with root package name */
    public j.n f21319f0;

    /* renamed from: g0, reason: collision with root package name */
    public j.p f21320g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f21321h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f21322i0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f21323j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f21324k;

    /* renamed from: l, reason: collision with root package name */
    public Window f21325l;

    /* renamed from: m, reason: collision with root package name */
    public l f21326m;

    /* renamed from: n, reason: collision with root package name */
    public final j.c f21327n;

    /* renamed from: o, reason: collision with root package name */
    public j.a f21328o;

    /* renamed from: p, reason: collision with root package name */
    public MenuInflater f21329p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f21330q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f21331r;

    /* renamed from: s, reason: collision with root package name */
    public f f21332s;

    /* renamed from: t, reason: collision with root package name */
    public r f21333t;

    /* renamed from: u, reason: collision with root package name */
    public o.b f21334u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f21335v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f21336w;

    /* renamed from: x, reason: collision with root package name */
    public Runnable f21337x;

    /* renamed from: y, reason: collision with root package name */
    public y0 f21338y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21339z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.f21314a0 & 1) != 0) {
                gVar.f0(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f21314a0 & 4096) != 0) {
                gVar2.f0(108);
            }
            g gVar3 = g.this;
            gVar3.Z = false;
            gVar3.f21314a0 = 0;
        }
    }

    public class b implements y {
        public b() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int c12 = g.this.c1(windowInsetsCompat, null);
            if (systemWindowInsetTop != c12) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), c12, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return o0.Y(view, windowInsetsCompat);
        }
    }

    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.d0();
        }
    }

    public class d implements Runnable {

        public class a extends a1 {
            public a() {
            }

            @Override // androidx.core.view.z0
            public void b(View view) {
                g.this.f21335v.setAlpha(1.0f);
                g.this.f21338y.g(null);
                g.this.f21338y = null;
            }

            @Override // androidx.core.view.a1, androidx.core.view.z0
            public void c(View view) {
                g.this.f21335v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f21336w.showAtLocation(gVar.f21335v, 55, 0, 0);
            g.this.g0();
            if (!g.this.R0()) {
                g.this.f21335v.setAlpha(1.0f);
                g.this.f21335v.setVisibility(0);
            } else {
                g.this.f21335v.setAlpha(0.0f);
                g gVar2 = g.this;
                gVar2.f21338y = o0.e(gVar2.f21335v).b(1.0f);
                g.this.f21338y.g(new a());
            }
        }
    }

    public class e extends a1 {
        public e() {
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            g.this.f21335v.setAlpha(1.0f);
            g.this.f21338y.g(null);
            g.this.f21338y = null;
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void c(View view) {
            g.this.f21335v.setVisibility(0);
            if (g.this.f21335v.getParent() instanceof View) {
                o0.j0((View) g.this.f21335v.getParent());
            }
        }
    }

    public final class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z10) {
            g.this.W(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback s02 = g.this.s0();
            if (s02 == null) {
                return true;
            }
            s02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: j.g$g, reason: collision with other inner class name */
    public class C0373g implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public b.a f21347a;

        /* renamed from: j.g$g$a */
        public class a extends a1 {
            public a() {
            }

            @Override // androidx.core.view.z0
            public void b(View view) {
                g.this.f21335v.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f21336w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f21335v.getParent() instanceof View) {
                    o0.j0((View) g.this.f21335v.getParent());
                }
                g.this.f21335v.k();
                g.this.f21338y.g(null);
                g gVar2 = g.this;
                gVar2.f21338y = null;
                o0.j0(gVar2.B);
            }
        }

        public C0373g(b.a aVar) {
            this.f21347a = aVar;
        }

        @Override // o.b.a
        public boolean a(o.b bVar, Menu menu) {
            return this.f21347a.a(bVar, menu);
        }

        @Override // o.b.a
        public void b(o.b bVar) {
            this.f21347a.b(bVar);
            g gVar = g.this;
            if (gVar.f21336w != null) {
                gVar.f21325l.getDecorView().removeCallbacks(g.this.f21337x);
            }
            g gVar2 = g.this;
            if (gVar2.f21335v != null) {
                gVar2.g0();
                g gVar3 = g.this;
                gVar3.f21338y = o0.e(gVar3.f21335v).b(0.0f);
                g.this.f21338y.g(new a());
            }
            g gVar4 = g.this;
            j.c cVar = gVar4.f21327n;
            if (cVar != null) {
                cVar.L(gVar4.f21334u);
            }
            g gVar5 = g.this;
            gVar5.f21334u = null;
            o0.j0(gVar5.B);
            g.this.a1();
        }

        @Override // o.b.a
        public boolean c(o.b bVar, MenuItem menuItem) {
            return this.f21347a.c(bVar, menuItem);
        }

        @Override // o.b.a
        public boolean d(o.b bVar, Menu menu) {
            o0.j0(g.this.B);
            return this.f21347a.d(bVar, menu);
        }
    }

    public static class h {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class i {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static u2.j b(Configuration configuration) {
            return u2.j.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(u2.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.g()));
        }

        public static void d(Configuration configuration, u2.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.g()));
        }
    }

    public static class j {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    public static class k {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: j.j
                public final void onBackInvoked() {
                    g.this.A0();
                }
            };
            j.i.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            j.i.a(obj).unregisterOnBackInvokedCallback(j.h.a(obj2));
        }
    }

    public class l extends o.i {
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21349c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f21350d;

        public l(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f21349c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f21349c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.b = true;
                callback.onContentChanged();
            } finally {
                this.b = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f21350d = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f21350d = false;
            }
        }

        @Override // o.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f21349c ? a().dispatchKeyEvent(keyEvent) : g.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // o.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.D0(keyEvent.getKeyCode(), keyEvent);
        }

        public final ActionMode e(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f21324k, callback);
            o.b U0 = g.this.U0(aVar);
            if (U0 != null) {
                return aVar.e(U0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.b) {
                a().onContentChanged();
            }
        }

        @Override // o.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // o.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // o.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g.this.G0(i10);
            return true;
        }

        @Override // o.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f21350d) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                g.this.H0(i10);
            }
        }

        @Override // o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.b0(false);
            }
            return onPreparePanel;
        }

        @Override // o.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            q q02 = g.this.q0(0, true);
            if (q02 == null || (eVar = q02.f21367j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (g.this.y0() && i10 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    public class m extends n {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f21352c;

        public m(@NonNull Context context) {
            super();
            this.f21352c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // j.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // j.g.n
        public int c() {
            return h.a(this.f21352c) ? 2 : 1;
        }

        @Override // j.g.n
        public void d() {
            g.this.Q();
        }
    }

    public abstract class n {

        /* renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f21354a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.d();
            }
        }

        public n() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f21354a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f21324k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f21354a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.f21354a == null) {
                this.f21354a = new a();
            }
            g.this.f21324k.registerReceiver(this.f21354a, b);
        }
    }

    public class o extends n {

        /* renamed from: c, reason: collision with root package name */
        public final s f21356c;

        public o(@NonNull s sVar) {
            super();
            this.f21356c = sVar;
        }

        @Override // j.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // j.g.n
        public int c() {
            return this.f21356c.d() ? 2 : 1;
        }

        @Override // j.g.n
        public void d() {
            g.this.Q();
        }
    }

    public class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        public final boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.Y(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(k.a.b(getContext(), i10));
        }
    }

    public static final class q {

        /* renamed from: a, reason: collision with root package name */
        public int f21359a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f21360c;

        /* renamed from: d, reason: collision with root package name */
        public int f21361d;

        /* renamed from: e, reason: collision with root package name */
        public int f21362e;

        /* renamed from: f, reason: collision with root package name */
        public int f21363f;

        /* renamed from: g, reason: collision with root package name */
        public ViewGroup f21364g;

        /* renamed from: h, reason: collision with root package name */
        public View f21365h;

        /* renamed from: i, reason: collision with root package name */
        public View f21366i;

        /* renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f21367j;

        /* renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f21368k;

        /* renamed from: l, reason: collision with root package name */
        public Context f21369l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f21370m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f21371n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f21372o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f21373p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f21374q = false;

        /* renamed from: r, reason: collision with root package name */
        public boolean f21375r;

        /* renamed from: s, reason: collision with root package name */
        public Bundle f21376s;

        public q(int i10) {
            this.f21359a = i10;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.f21367j == null) {
                return null;
            }
            if (this.f21368k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f21369l, i.g.f19901l);
                this.f21368k = cVar;
                cVar.d(aVar);
                this.f21367j.b(this.f21368k);
            }
            return this.f21368k.j(this.f21364g);
        }

        public boolean b() {
            if (this.f21365h == null) {
                return false;
            }
            return this.f21366i != null || this.f21368k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f21367j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f21368k);
            }
            this.f21367j = eVar;
            if (eVar == null || (cVar = this.f21368k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(i.a.f19798a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(i.a.H, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(i.i.f19928a, true);
            }
            o.d dVar = new o.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f21369l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(i.j.A0);
            this.b = obtainStyledAttributes.getResourceId(i.j.D0, 0);
            this.f21363f = obtainStyledAttributes.getResourceId(i.j.C0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final class r implements i.a {
        public r() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            g gVar = g.this;
            if (z11) {
                eVar = D;
            }
            q j02 = gVar.j0(eVar);
            if (j02 != null) {
                if (!z11) {
                    g.this.Z(j02, z10);
                } else {
                    g.this.V(j02.f21359a, j02, D);
                    g.this.Z(j02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback s02;
            if (eVar != eVar.D()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.G || (s02 = gVar.s0()) == null || g.this.R) {
                return true;
            }
            s02.onMenuOpened(108, eVar);
            return true;
        }
    }

    public g(Activity activity, j.c cVar) {
        this(activity, null, cVar, activity);
    }

    @NonNull
    public static Configuration k0(@NonNull Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            i.a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            j.a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    @Override // j.e
    public void A(Bundle bundle) {
    }

    public boolean A0() {
        boolean z10 = this.O;
        this.O = false;
        q q02 = q0(0, false);
        if (q02 != null && q02.f21372o) {
            if (!z10) {
                Z(q02, true);
            }
            return true;
        }
        o.b bVar = this.f21334u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        j.a r8 = r();
        return r8 != null && r8.g();
    }

    @Override // j.e
    public void B() {
        P(true, false);
    }

    public boolean B0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            C0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // j.e
    public void C() {
        j.a r8 = r();
        if (r8 != null) {
            r8.s(false);
        }
    }

    public final boolean C0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q q02 = q0(i10, true);
        if (q02.f21372o) {
            return false;
        }
        return M0(q02, keyEvent);
    }

    public boolean D0(int i10, KeyEvent keyEvent) {
        j.a r8 = r();
        if (r8 != null && r8.o(i10, keyEvent)) {
            return true;
        }
        q qVar = this.N;
        if (qVar != null && L0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.N;
            if (qVar2 != null) {
                qVar2.f21371n = true;
            }
            return true;
        }
        if (this.N == null) {
            q q02 = q0(0, true);
            M0(q02, keyEvent);
            boolean L0 = L0(q02, keyEvent.getKeyCode(), keyEvent, 1);
            q02.f21370m = false;
            if (L0) {
                return true;
            }
        }
        return false;
    }

    public boolean E0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                F0(0, keyEvent);
                return true;
            }
        } else if (A0()) {
            return true;
        }
        return false;
    }

    @Override // j.e
    public boolean F(int i10) {
        int O0 = O0(i10);
        if (this.K && O0 == 108) {
            return false;
        }
        if (this.G && O0 == 1) {
            this.G = false;
        }
        if (O0 == 1) {
            W0();
            this.K = true;
            return true;
        }
        if (O0 == 2) {
            W0();
            this.E = true;
            return true;
        }
        if (O0 == 5) {
            W0();
            this.F = true;
            return true;
        }
        if (O0 == 10) {
            W0();
            this.I = true;
            return true;
        }
        if (O0 == 108) {
            W0();
            this.G = true;
            return true;
        }
        if (O0 != 109) {
            return this.f21325l.requestFeature(O0);
        }
        W0();
        this.H = true;
        return true;
    }

    public final boolean F0(int i10, KeyEvent keyEvent) {
        boolean z10;
        e0 e0Var;
        if (this.f21334u != null) {
            return false;
        }
        boolean z11 = true;
        q q02 = q0(i10, true);
        if (i10 != 0 || (e0Var = this.f21331r) == null || !e0Var.a() || ViewConfiguration.get(this.f21324k).hasPermanentMenuKey()) {
            boolean z12 = q02.f21372o;
            if (z12 || q02.f21371n) {
                Z(q02, true);
                z11 = z12;
            } else {
                if (q02.f21370m) {
                    if (q02.f21375r) {
                        q02.f21370m = false;
                        z10 = M0(q02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        J0(q02, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f21331r.e()) {
            z11 = this.f21331r.b();
        } else {
            if (!this.R && M0(q02, keyEvent)) {
                z11 = this.f21331r.c();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f21324k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return z11;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return z11;
    }

    @Override // j.e
    public void G(int i10) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f21324k).inflate(i10, viewGroup);
        this.f21326m.c(this.f21325l.getCallback());
    }

    public void G0(int i10) {
        j.a r8;
        if (i10 != 108 || (r8 = r()) == null) {
            return;
        }
        r8.h(true);
    }

    @Override // j.e
    public void H(View view) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f21326m.c(this.f21325l.getCallback());
    }

    public void H0(int i10) {
        if (i10 == 108) {
            j.a r8 = r();
            if (r8 != null) {
                r8.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            q q02 = q0(i10, true);
            if (q02.f21372o) {
                Z(q02, false);
            }
        }
    }

    @Override // j.e
    public void I(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f21326m.c(this.f21325l.getCallback());
    }

    public void I0(ViewGroup viewGroup) {
    }

    @Override // j.e
    public void J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.J(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f21321h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f21322i0) != null) {
            k.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f21322i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f21323j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f21321h0 = k.a((Activity) this.f21323j);
                a1();
            }
        }
        this.f21321h0 = onBackInvokedDispatcher;
        a1();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(j.g.q r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.J0(j.g$q, android.view.KeyEvent):void");
    }

    @Override // j.e
    public void K(int i10) {
        this.U = i10;
    }

    public final j.a K0() {
        return this.f21328o;
    }

    @Override // j.e
    public final void L(CharSequence charSequence) {
        this.f21330q = charSequence;
        e0 e0Var = this.f21331r;
        if (e0Var != null) {
            e0Var.setWindowTitle(charSequence);
            return;
        }
        if (K0() != null) {
            K0().t(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean L0(q qVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f21370m || M0(qVar, keyEvent)) && (eVar = qVar.f21367j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f21331r == null) {
            Z(qVar, true);
        }
        return z10;
    }

    public final boolean M0(q qVar, KeyEvent keyEvent) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        if (this.R) {
            return false;
        }
        if (qVar.f21370m) {
            return true;
        }
        q qVar2 = this.N;
        if (qVar2 != null && qVar2 != qVar) {
            Z(qVar2, false);
        }
        Window.Callback s02 = s0();
        if (s02 != null) {
            qVar.f21366i = s02.onCreatePanelView(qVar.f21359a);
        }
        int i10 = qVar.f21359a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (e0Var3 = this.f21331r) != null) {
            e0Var3.f();
        }
        if (qVar.f21366i == null) {
            if (z10) {
                K0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f21367j;
            if (eVar == null || qVar.f21375r) {
                if (eVar == null && (!w0(qVar) || qVar.f21367j == null)) {
                    return false;
                }
                if (z10 && this.f21331r != null) {
                    if (this.f21332s == null) {
                        this.f21332s = new f();
                    }
                    this.f21331r.d(qVar.f21367j, this.f21332s);
                }
                qVar.f21367j.e0();
                if (!s02.onCreatePanelMenu(qVar.f21359a, qVar.f21367j)) {
                    qVar.c(null);
                    if (z10 && (e0Var = this.f21331r) != null) {
                        e0Var.d(null, this.f21332s);
                    }
                    return false;
                }
                qVar.f21375r = false;
            }
            qVar.f21367j.e0();
            Bundle bundle = qVar.f21376s;
            if (bundle != null) {
                qVar.f21367j.Q(bundle);
                qVar.f21376s = null;
            }
            if (!s02.onPreparePanel(0, qVar.f21366i, qVar.f21367j)) {
                if (z10 && (e0Var2 = this.f21331r) != null) {
                    e0Var2.d(null, this.f21332s);
                }
                qVar.f21367j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f21373p = z11;
            qVar.f21367j.setQwertyMode(z11);
            qVar.f21367j.d0();
        }
        qVar.f21370m = true;
        qVar.f21371n = false;
        this.N = qVar;
        return true;
    }

    public final void N0(boolean z10) {
        e0 e0Var = this.f21331r;
        if (e0Var == null || !e0Var.a() || (ViewConfiguration.get(this.f21324k).hasPermanentMenuKey() && !this.f21331r.g())) {
            q q02 = q0(0, true);
            q02.f21374q = true;
            Z(q02, false);
            J0(q02, null);
            return;
        }
        Window.Callback s02 = s0();
        if (this.f21331r.e() && z10) {
            this.f21331r.b();
            if (this.R) {
                return;
            }
            s02.onPanelClosed(108, q0(0, true).f21367j);
            return;
        }
        if (s02 == null || this.R) {
            return;
        }
        if (this.Z && (this.f21314a0 & 1) != 0) {
            this.f21325l.getDecorView().removeCallbacks(this.f21315b0);
            this.f21315b0.run();
        }
        q q03 = q0(0, true);
        androidx.appcompat.view.menu.e eVar = q03.f21367j;
        if (eVar == null || q03.f21375r || !s02.onPreparePanel(0, q03.f21366i, eVar)) {
            return;
        }
        s02.onMenuOpened(108, q03.f21367j);
        this.f21331r.c();
    }

    public final boolean O(boolean z10) {
        return P(z10, true);
    }

    public final int O0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    public final boolean P(boolean z10, boolean z11) {
        if (this.R) {
            return false;
        }
        int U = U();
        int z02 = z0(this.f21324k, U);
        u2.j T = Build.VERSION.SDK_INT < 33 ? T(this.f21324k) : null;
        if (!z11 && T != null) {
            T = p0(this.f21324k.getResources().getConfiguration());
        }
        boolean Z0 = Z0(z02, T, z10);
        if (U == 0) {
            o0(this.f21324k).e();
        } else {
            n nVar = this.X;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (U == 3) {
            n0(this.f21324k).e();
            return Z0;
        }
        n nVar2 = this.Y;
        if (nVar2 != null) {
            nVar2.a();
        }
        return Z0;
    }

    public void P0(Configuration configuration, @NonNull u2.j jVar) {
        i.d(configuration, jVar);
    }

    public boolean Q() {
        return O(true);
    }

    public void Q0(u2.j jVar) {
        i.c(jVar);
    }

    public final void R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f21325l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f21324k.obtainStyledAttributes(i.j.A0);
        obtainStyledAttributes.getValue(i.j.M0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(i.j.N0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(i.j.K0)) {
            obtainStyledAttributes.getValue(i.j.K0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(i.j.L0)) {
            obtainStyledAttributes.getValue(i.j.L0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(i.j.I0)) {
            obtainStyledAttributes.getValue(i.j.I0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(i.j.J0)) {
            obtainStyledAttributes.getValue(i.j.J0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean R0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
    }

    public final void S(@NonNull Window window) {
        if (this.f21325l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f21326m = lVar;
        window.setCallback(lVar);
        q.a1 u8 = q.a1.u(this.f21324k, null, f21312l0);
        Drawable h10 = u8.h(0);
        if (h10 != null) {
            window.setBackgroundDrawable(h10);
        }
        u8.x();
        this.f21325l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f21321h0 != null) {
            return;
        }
        J(null);
    }

    public final boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f21325l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public u2.j T(@NonNull Context context) {
        u2.j q10;
        if (Build.VERSION.SDK_INT >= 33 || (q10 = j.e.q()) == null) {
            return null;
        }
        u2.j p02 = p0(context.getApplicationContext().getResources().getConfiguration());
        u2.j b10 = j.q.b(q10, p02);
        return b10.e() ? p02 : b10;
    }

    public boolean T0() {
        if (this.f21321h0 == null) {
            return false;
        }
        q q02 = q0(0, false);
        return (q02 != null && q02.f21372o) || this.f21334u != null;
    }

    public final int U() {
        int i10 = this.T;
        return i10 != -100 ? i10 : j.e.m();
    }

    public o.b U0(@NonNull b.a aVar) {
        j.c cVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        o.b bVar = this.f21334u;
        if (bVar != null) {
            bVar.c();
        }
        C0373g c0373g = new C0373g(aVar);
        j.a r8 = r();
        if (r8 != null) {
            o.b u8 = r8.u(c0373g);
            this.f21334u = u8;
            if (u8 != null && (cVar = this.f21327n) != null) {
                cVar.w(u8);
            }
        }
        if (this.f21334u == null) {
            this.f21334u = V0(c0373g);
        }
        a1();
        return this.f21334u;
    }

    public void V(int i10, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.M;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                menu = qVar.f21367j;
            }
        }
        if ((qVar == null || qVar.f21372o) && !this.R) {
            this.f21326m.d(this.f21325l.getCallback(), i10, menu);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.b V0(@androidx.annotation.NonNull o.b.a r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.V0(o.b$a):o.b");
    }

    public void W(@NonNull androidx.appcompat.view.menu.e eVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.f21331r.l();
        Window.Callback s02 = s0();
        if (s02 != null && !this.R) {
            s02.onPanelClosed(108, eVar);
        }
        this.L = false;
    }

    public final void W0() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void X() {
        n nVar = this.X;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.Y;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    public final j.b X0() {
        for (Context context = this.f21324k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof j.b) {
                return (j.b) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public void Y(int i10) {
        Z(q0(i10, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(Configuration configuration) {
        Activity activity = (Activity) this.f21323j;
        if (activity instanceof android.view.s) {
            if (((android.view.s) activity).a().getState().b(l.b.f2628c)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Q || this.R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    public void Z(q qVar, boolean z10) {
        ViewGroup viewGroup;
        e0 e0Var;
        if (z10 && qVar.f21359a == 0 && (e0Var = this.f21331r) != null && e0Var.e()) {
            W(qVar.f21367j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f21324k.getSystemService("window");
        if (windowManager != null && qVar.f21372o && (viewGroup = qVar.f21364g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                V(qVar.f21359a, qVar, null);
            }
        }
        qVar.f21370m = false;
        qVar.f21371n = false;
        qVar.f21372o = false;
        qVar.f21365h = null;
        qVar.f21374q = true;
        if (this.N == qVar) {
            this.N = null;
        }
        if (qVar.f21359a == 0) {
            a1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z0(int r11, u2.j r12, boolean r13) {
        /*
            r10 = this;
            android.content.Context r1 = r10.f21324k
            r4 = 0
            r5 = 0
            r0 = r10
            r2 = r11
            r3 = r12
            android.content.res.Configuration r11 = r0.a0(r1, r2, r3, r4, r5)
            android.content.Context r12 = r0.f21324k
            int r12 = r10.m0(r12)
            android.content.res.Configuration r1 = r0.S
            if (r1 != 0) goto L1f
            android.content.Context r1 = r0.f21324k
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
        L1f:
            int r4 = r1.uiMode
            r4 = r4 & 48
            int r5 = r11.uiMode
            r5 = r5 & 48
            u2.j r1 = r10.p0(r1)
            r6 = 0
            if (r3 != 0) goto L30
            r7 = r6
            goto L34
        L30:
            u2.j r7 = r10.p0(r11)
        L34:
            r8 = 0
            if (r4 == r5) goto L3a
            r4 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r4 = r8
        L3b:
            if (r7 == 0) goto L45
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L45
            r4 = r4 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r1 = ~r12
            r1 = r1 & r4
            r9 = 1
            if (r1 == 0) goto L8c
            if (r13 == 0) goto L8c
            boolean r13 = r0.P
            if (r13 == 0) goto L8c
            boolean r13 = j.g.f21313m0
            if (r13 != 0) goto L58
            boolean r13 = r0.Q
            if (r13 == 0) goto L8c
        L58:
            java.lang.Object r13 = r0.f21323j
            boolean r1 = r13 instanceof android.app.Activity
            if (r1 == 0) goto L8c
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r13 = r13.isChild()
            if (r13 != 0) goto L8c
            int r13 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r13 < r1) goto L83
            r13 = r4 & 8192(0x2000, float:1.148E-41)
            if (r13 == 0) goto L83
            java.lang.Object r13 = r0.f21323j
            android.app.Activity r13 = (android.app.Activity) r13
            android.view.Window r13 = r13.getWindow()
            android.view.View r13 = r13.getDecorView()
            int r11 = r11.getLayoutDirection()
            r13.setLayoutDirection(r11)
        L83:
            java.lang.Object r11 = r0.f21323j
            android.app.Activity r11 = (android.app.Activity) r11
            k2.b.t(r11)
            r11 = r9
            goto L8d
        L8c:
            r11 = r8
        L8d:
            if (r11 != 0) goto L9a
            if (r4 == 0) goto L9a
            r11 = r4 & r12
            if (r11 != r4) goto L96
            r8 = r9
        L96:
            r10.b1(r5, r7, r8, r6)
            goto L9b
        L9a:
            r9 = r11
        L9b:
            if (r9 == 0) goto Lb7
            java.lang.Object r11 = r0.f21323j
            boolean r12 = r11 instanceof j.b
            if (r12 == 0) goto Lb7
            r12 = r4 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto Lac
            j.b r11 = (j.b) r11
            r11.x1(r2)
        Lac:
            r11 = r4 & 4
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r0.f21323j
            j.b r11 = (j.b) r11
            r11.w1(r3)
        Lb7:
            if (r7 == 0) goto Lca
            android.content.Context r11 = r0.f21324k
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            u2.j r11 = r10.p0(r11)
            r10.Q0(r11)
        Lca:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.Z0(int, u2.j, boolean):boolean");
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        q j02;
        Window.Callback s02 = s0();
        if (s02 == null || this.R || (j02 = j0(eVar.D())) == null) {
            return false;
        }
        return s02.onMenuItemSelected(j02.f21359a, menuItem);
    }

    @NonNull
    public final Configuration a0(@NonNull Context context, int i10, u2.j jVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (jVar != null) {
            P0(configuration2, jVar);
        }
        return configuration2;
    }

    public void a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean T0 = T0();
            if (T0 && this.f21322i0 == null) {
                this.f21322i0 = k.b(this.f21321h0, this);
            } else {
                if (T0 || (onBackInvokedCallback = this.f21322i0) == null) {
                    return;
                }
                k.c(this.f21321h0, onBackInvokedCallback);
                this.f21322i0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        N0(true);
    }

    public final ViewGroup b0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f21324k.obtainStyledAttributes(i.j.A0);
        if (!obtainStyledAttributes.hasValue(i.j.F0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(i.j.O0, false)) {
            F(1);
        } else if (obtainStyledAttributes.getBoolean(i.j.F0, false)) {
            F(108);
        }
        if (obtainStyledAttributes.getBoolean(i.j.G0, false)) {
            F(109);
        }
        if (obtainStyledAttributes.getBoolean(i.j.H0, false)) {
            F(10);
        }
        this.J = obtainStyledAttributes.getBoolean(i.j.B0, false);
        obtainStyledAttributes.recycle();
        i0();
        this.f21325l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f21324k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) from.inflate(i.g.f19906q, (ViewGroup) null) : (ViewGroup) from.inflate(i.g.f19905p, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) from.inflate(i.g.f19897h, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.f21324k.getTheme().resolveAttribute(i.a.f19802f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o.d(this.f21324k, typedValue.resourceId) : this.f21324k).inflate(i.g.f19907r, (ViewGroup) null);
            e0 e0Var = (e0) viewGroup.findViewById(i.f.f19881q);
            this.f21331r = e0Var;
            e0Var.setWindowCallback(s0());
            if (this.H) {
                this.f21331r.h(109);
            }
            if (this.E) {
                this.f21331r.h(2);
            }
            if (this.F) {
                this.f21331r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        o0.A0(viewGroup, new b());
        if (this.f21331r == null) {
            this.C = (TextView) viewGroup.findViewById(i.f.R);
        }
        g1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(i.f.b);
        ViewGroup viewGroup2 = (ViewGroup) this.f21325l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f21325l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final void b1(int i10, u2.j jVar, boolean z10, Configuration configuration) {
        Resources resources = this.f21324k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (jVar != null) {
            P0(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.U;
        if (i11 != 0) {
            this.f21324k.setTheme(i11);
            this.f21324k.getTheme().applyStyle(this.U, true);
        }
        if (z10 && (this.f21323j instanceof Activity)) {
            Y0(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c0(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z10;
        if (this.f21319f0 == null) {
            TypedArray obtainStyledAttributes = this.f21324k.obtainStyledAttributes(i.j.A0);
            String string = obtainStyledAttributes.getString(i.j.E0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f21319f0 = new j.n();
            } else {
                try {
                    this.f21319f0 = (j.n) this.f21324k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f21319f0 = new j.n();
                }
            }
        }
        boolean z11 = f21311k0;
        boolean z12 = false;
        if (z11) {
            if (this.f21320g0 == null) {
                this.f21320g0 = new j.p();
            }
            if (this.f21320g0.a(attributeSet)) {
                z10 = true;
                return this.f21319f0.r(view, str, context, attributeSet, z10, z11, true, f1.c());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z12 = S0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z12 = true;
            }
        }
        z10 = z12;
        return this.f21319f0.r(view, str, context, attributeSet, z10, z11, true, f1.c());
    }

    public final int c1(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        boolean z10;
        boolean z11;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f21335v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21335v.getLayoutParams();
            if (this.f21335v.isShown()) {
                if (this.f21317d0 == null) {
                    this.f21317d0 = new Rect();
                    this.f21318e0 = new Rect();
                }
                Rect rect2 = this.f21317d0;
                Rect rect3 = this.f21318e0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                g1.a(this.B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                WindowInsetsCompat F = o0.F(this.B);
                int systemWindowInsetLeft = F == null ? 0 : F.getSystemWindowInsetLeft();
                int systemWindowInsetRight = F == null ? 0 : F.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f21324k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    d1(this.D);
                }
                if (!this.I && r5) {
                    systemWindowInsetTop = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f21335v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return systemWindowInsetTop;
    }

    public void d0() {
        androidx.appcompat.view.menu.e eVar;
        e0 e0Var = this.f21331r;
        if (e0Var != null) {
            e0Var.l();
        }
        if (this.f21336w != null) {
            this.f21325l.getDecorView().removeCallbacks(this.f21337x);
            if (this.f21336w.isShowing()) {
                try {
                    this.f21336w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f21336w = null;
        }
        g0();
        q q02 = q0(0, false);
        if (q02 == null || (eVar = q02.f21367j) == null) {
            return;
        }
        eVar.close();
    }

    public final void d1(View view) {
        view.setBackgroundColor((o0.K(view) & 8192) != 0 ? l2.b.c(this.f21324k, i.c.b) : l2.b.c(this.f21324k, i.c.f19824a));
    }

    @Override // j.e
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f21326m.c(this.f21325l.getCallback());
    }

    public boolean e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f21323j;
        if (((obj instanceof l.a) || (obj instanceof j.l)) && (decorView = this.f21325l.getDecorView()) != null && androidx.core.view.l.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f21326m.b(this.f21325l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? B0(keyCode, keyEvent) : E0(keyCode, keyEvent);
    }

    public void f0(int i10) {
        q q02;
        q q03 = q0(i10, true);
        if (q03.f21367j != null) {
            Bundle bundle = new Bundle();
            q03.f21367j.R(bundle);
            if (bundle.size() > 0) {
                q03.f21376s = bundle;
            }
            q03.f21367j.e0();
            q03.f21367j.clear();
        }
        q03.f21375r = true;
        q03.f21374q = true;
        if ((i10 != 108 && i10 != 0) || this.f21331r == null || (q02 = q0(0, false)) == null) {
            return;
        }
        q02.f21370m = false;
        M0(q02, null);
    }

    @Override // j.e
    @NonNull
    public Context g(@NonNull Context context) {
        Context context2;
        this.P = true;
        int z02 = z0(context, U());
        if (j.e.u(context)) {
            j.e.N(context);
        }
        u2.j T = T(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(a0(context2, z02, T, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof o.d) {
            try {
                ((o.d) context2).a(a0(context2, z02, T, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f21313m0) {
            return super.g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration a02 = a0(context2, z02, T, !configuration2.equals(configuration3) ? k0(configuration2, configuration3) : null, true);
        o.d dVar = new o.d(context2, i.i.b);
        dVar.a(a02);
        try {
            if (context2.getTheme() != null) {
                h.g.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    public void g0() {
        y0 y0Var = this.f21338y;
        if (y0Var != null) {
            y0Var.c();
        }
    }

    public final void h0() {
        if (this.A) {
            return;
        }
        this.B = b0();
        CharSequence r02 = r0();
        if (!TextUtils.isEmpty(r02)) {
            e0 e0Var = this.f21331r;
            if (e0Var != null) {
                e0Var.setWindowTitle(r02);
            } else if (K0() != null) {
                K0().t(r02);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(r02);
                }
            }
        }
        R();
        I0(this.B);
        this.A = true;
        q q02 = q0(0, false);
        if (this.R) {
            return;
        }
        if (q02 == null || q02.f21367j == null) {
            x0(108);
        }
    }

    public final void i0() {
        if (this.f21325l == null) {
            Object obj = this.f21323j;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.f21325l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // j.e
    public <T extends View> T j(int i10) {
        h0();
        return (T) this.f21325l.findViewById(i10);
    }

    public q j0(Menu menu) {
        q[] qVarArr = this.M;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            q qVar = qVarArr[i10];
            if (qVar != null && qVar.f21367j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // j.e
    public Context l() {
        return this.f21324k;
    }

    public final Context l0() {
        j.a r8 = r();
        Context j10 = r8 != null ? r8.j() : null;
        return j10 == null ? this.f21324k : j10;
    }

    public final int m0(Context context) {
        if (!this.W && (this.f21323j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f21323j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    @Override // j.e
    public int n() {
        return this.T;
    }

    public final n n0(@NonNull Context context) {
        if (this.Y == null) {
            this.Y = new m(context);
        }
        return this.Y;
    }

    public final n o0(@NonNull Context context) {
        if (this.X == null) {
            this.X = new o(s.a(context));
        }
        return this.X;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return c0(view, str, context, attributeSet);
    }

    @Override // j.e
    public MenuInflater p() {
        if (this.f21329p == null) {
            t0();
            j.a aVar = this.f21328o;
            this.f21329p = new o.g(aVar != null ? aVar.j() : this.f21324k);
        }
        return this.f21329p;
    }

    public u2.j p0(Configuration configuration) {
        return i.b(configuration);
    }

    public q q0(int i10, boolean z10) {
        q[] qVarArr = this.M;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.M = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i10];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i10);
        qVarArr[i10] = qVar2;
        return qVar2;
    }

    @Override // j.e
    public j.a r() {
        t0();
        return this.f21328o;
    }

    public final CharSequence r0() {
        Object obj = this.f21323j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f21330q;
    }

    @Override // j.e
    public void s() {
        LayoutInflater from = LayoutInflater.from(this.f21324k);
        if (from.getFactory() == null) {
            androidx.core.view.m.a(from, this);
        } else {
            if (from.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final Window.Callback s0() {
        return this.f21325l.getCallback();
    }

    @Override // j.e
    public void t() {
        if (K0() == null || r().l()) {
            return;
        }
        x0(0);
    }

    public final void t0() {
        h0();
        if (this.G && this.f21328o == null) {
            Object obj = this.f21323j;
            if (obj instanceof Activity) {
                this.f21328o = new t((Activity) this.f21323j, this.H);
            } else if (obj instanceof Dialog) {
                this.f21328o = new t((Dialog) this.f21323j);
            }
            j.a aVar = this.f21328o;
            if (aVar != null) {
                aVar.r(this.f21316c0);
            }
        }
    }

    public final boolean u0(q qVar) {
        View view = qVar.f21366i;
        if (view != null) {
            qVar.f21365h = view;
            return true;
        }
        if (qVar.f21367j == null) {
            return false;
        }
        if (this.f21333t == null) {
            this.f21333t = new r();
        }
        View view2 = (View) qVar.a(this.f21333t);
        qVar.f21365h = view2;
        return view2 != null;
    }

    @Override // j.e
    public void v(Configuration configuration) {
        j.a r8;
        if (this.G && this.A && (r8 = r()) != null) {
            r8.m(configuration);
        }
        q.k.b().g(this.f21324k);
        this.S = new Configuration(this.f21324k.getResources().getConfiguration());
        P(false, false);
    }

    public final boolean v0(q qVar) {
        qVar.d(l0());
        qVar.f21364g = new p(qVar.f21369l);
        qVar.f21360c = 81;
        return true;
    }

    @Override // j.e
    public void w(Bundle bundle) {
        String str;
        this.P = true;
        O(false);
        i0();
        Object obj = this.f21323j;
        if (obj instanceof Activity) {
            try {
                str = k2.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                j.a K0 = K0();
                if (K0 == null) {
                    this.f21316c0 = true;
                } else {
                    K0.r(true);
                }
            }
            j.e.d(this);
        }
        this.S = new Configuration(this.f21324k.getResources().getConfiguration());
        this.Q = true;
    }

    public final boolean w0(q qVar) {
        Resources.Theme theme;
        Context context = this.f21324k;
        int i10 = qVar.f21359a;
        if ((i10 == 0 || i10 == 108) && this.f21331r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(i.a.f19802f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(i.a.f19803g, typedValue, true);
            } else {
                theme2.resolveAttribute(i.a.f19803g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                o.d dVar = new o.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        qVar.c(eVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // j.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f21323j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            j.e.D(r3)
        L9:
            boolean r0 = r3.Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f21325l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f21315b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f21323j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            w1.j<java.lang.String, java.lang.Integer> r0 = j.g.f21310j0
            java.lang.Object r1 = r3.f21323j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            w1.j<java.lang.String, java.lang.Integer> r0 = j.g.f21310j0
            java.lang.Object r1 = r3.f21323j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            j.a r0 = r3.f21328o
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.x():void");
    }

    public final void x0(int i10) {
        this.f21314a0 = (1 << i10) | this.f21314a0;
        if (this.Z) {
            return;
        }
        o0.e0(this.f21325l.getDecorView(), this.f21315b0);
        this.Z = true;
    }

    @Override // j.e
    public void y(Bundle bundle) {
        h0();
    }

    public boolean y0() {
        return this.f21339z;
    }

    @Override // j.e
    public void z() {
        j.a r8 = r();
        if (r8 != null) {
            r8.s(true);
        }
    }

    public int z0(@NonNull Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return o0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return n0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    public g(Dialog dialog, j.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public g(Context context, Window window, j.c cVar, Object obj) {
        w1.j<String, Integer> jVar;
        Integer num;
        j.b X0;
        this.f21338y = null;
        this.f21339z = true;
        this.T = -100;
        this.f21315b0 = new a();
        this.f21324k = context;
        this.f21327n = cVar;
        this.f21323j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (X0 = X0()) != null) {
            this.T = X0.s1().n();
        }
        if (this.T == -100 && (num = (jVar = f21310j0).get(obj.getClass().getName())) != null) {
            this.T = num.intValue();
            jVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            S(window);
        }
        q.k.h();
    }
}
