package com.roblox.client;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ci.m;
import cj.o;
import cj.p;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.c;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import dj.a0;
import ek.e0;
import ek.q;
import ek.t;
import gi.a;
import im.f;
import mm.n;
import org.greenrobot.eventbus.ThreadMode;
import rg.a1;
import rg.e2;
import rg.f2;
import rg.j0;
import rg.m0;
import rg.n0;
import rg.q0;
import rg.t0;
import rg.x;
import rg.x0;
import rg.y;
import ti.b;
import ug.c0;

/* loaded from: classes2.dex */
public class c extends x0 implements SwipeRefreshLayout.j {
    public String O0;
    public ProgressDialog P0;
    public FrameLayout Q0;
    public boolean R0;
    public j S0;
    public i T0;
    public ValueCallback<Uri[]> U0;
    public vg.c Z0;

    /* renamed from: a1, reason: collision with root package name */
    public PermissionRequest f9010a1;
    public TextView H0 = null;
    public RBHybridWebView I0 = null;
    public SwipeRefreshLayout J0 = null;
    public String K0 = null;
    public int L0 = 0;
    public int M0 = 0;
    public String N0 = null;
    public boolean V0 = false;
    public boolean W0 = false;
    public boolean X0 = true;
    public String Y0 = null;

    /* renamed from: b1, reason: collision with root package name */
    public final g.c<String> f9011b1 = h(new h.h(), new g.a() { // from class: rg.c1
        @Override // g.a
        public final void a(Object obj) {
            com.roblox.client.c.this.n3((Boolean) obj);
        }
    });

    /* renamed from: c1, reason: collision with root package name */
    public final o f9012c1 = new C0139c();

    /* renamed from: d1, reason: collision with root package name */
    public final o f9013d1 = new d();

    /* renamed from: e1, reason: collision with root package name */
    public final o f9014e1 = new e();

    /* renamed from: f1, reason: collision with root package name */
    public final o f9015f1 = new f();

    public class a implements a.b {
        public a() {
        }

        @Override // gi.a.b
        public void a(String str) {
            if (c.this.T0 != null) {
                c.this.T0.a(str);
            }
        }
    }

    public class b extends WebChromeClient {

        public class a extends WebViewClient {
            public a() {
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                c.this.r3(str);
            }
        }

        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            if (!z11) {
                return super.onCreateWindow(webView, z10, z11, message);
            }
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new a());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            for (String str : permissionRequest.getResources()) {
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    int a10 = l2.b.a(c.this.p(), y.h().k().s(n.CAMERA));
                    if (rh.h.a().M5()) {
                        if (a10 == 0) {
                            q.h("rbx.web", "Camera permission already granted");
                            permissionRequest.grant(new String[]{str});
                        } else {
                            q.h("rbx.web", "Camera permission not granted, requesting via ActivityResultLauncher");
                            c.this.f9010a1 = permissionRequest;
                            c.this.f9011b1.b("android.permission.CAMERA");
                        }
                    } else if (a10 != 0) {
                        q.h("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        q.h("rbx.web", "Permission granted for camera");
                        permissionRequest.grant(new String[]{str});
                    }
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            c.this.x3(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            c.this.U0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            c.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    /* renamed from: com.roblox.client.c$c, reason: collision with other inner class name */
    public class C0139c implements o {
        public C0139c() {
        }

        @Override // cj.o
        public void b() {
            c.this.F3();
        }

        @Override // cj.o
        public void c(p pVar) {
            c.this.Y2(pVar);
        }

        @Override // cj.o
        public void d() {
            c.this.F3();
        }

        @Override // cj.o
        public void e() {
            c.this.g3();
        }
    }

    public class d implements o {
        public d() {
        }

        @Override // cj.o
        public void b() {
            c.this.F3();
        }

        @Override // cj.o
        public void c(p pVar) {
            c.this.Y2(pVar);
        }

        @Override // cj.o
        public void d() {
            c.this.F3();
        }

        @Override // cj.o
        public void e() {
            c.this.g3();
        }
    }

    public class e implements o {
        public e() {
        }

        @Override // cj.o
        public void b() {
        }

        @Override // cj.o
        public void c(p pVar) {
            q.h("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + pVar + ".");
            c.this.Y2(pVar);
        }

        @Override // cj.o
        public void d() {
        }

        @Override // cj.o
        public void e() {
        }
    }

    public class f implements o {
        public f() {
        }

        @Override // cj.o
        public void b() {
        }

        @Override // cj.o
        public void c(p pVar) {
            c.this.Y2(pVar);
        }

        @Override // cj.o
        public void d() {
            c.this.F3();
        }

        @Override // cj.o
        public void e() {
        }
    }

    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9023a;

        static {
            int[] iArr = new int[DomainAllowListChecker.a.values().length];
            f9023a = iArr;
            try {
                iArr[DomainAllowListChecker.a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9023a[DomainAllowListChecker.a.f9784c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9023a[DomainAllowListChecker.a.f9785d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9023a[DomainAllowListChecker.a.f9783a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class h {
        public h() {
        }
    }

    public interface i {
        void a(String str);
    }

    public interface j {
        default void a() {
        }

        default void b(String str) {
        }

        default void c(String str, String str2) {
            im.f.F().n(str2, "failed", "unhandled_by_host");
        }
    }

    public class k extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public String f9025a = null;

        public class a implements m {
            public a() {
            }

            @Override // ci.m
            public void a(ci.j jVar) {
            }
        }

        public k() {
        }

        public final boolean d(final WebView webView, final String str, boolean z10, boolean z11) {
            String str2;
            q.h("rbx.web", "-> " + str);
            if (str == null) {
                q.e("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                c0.v(c0.c.b);
                return false;
            }
            final e4.q p8 = c.this.p();
            if (p8 == null || p8.isFinishing()) {
                q.h("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
                c0.v(c0.c.f32723c);
                return true;
            }
            if (c.this.u2()) {
                c0.v(c0.c.f32724d);
                return true;
            }
            if (c.this.f3(str)) {
                c0.v(c0.c.f32725e);
                return true;
            }
            if (!DomainAllowListChecker.f9782a.enableDomainAllowListChecker() && c.this.s3(str)) {
                q.h("rbx.web", "Navigating social media Link...");
                c0.v(c0.c.f32726f);
                return true;
            }
            if (str.equalsIgnoreCase(a1.z0())) {
                if (c.this.S0 != null) {
                    c.this.S0.a();
                }
                c0.v(c0.c.f32727g);
                return true;
            }
            if (a1.m0(str) && !c.this.R0) {
                q.h("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                c cVar = c.this;
                cVar.z2(pi.a.c(cVar.w(), q0.f30485o, new Object[0]), 1);
                ti.b.f().i(p8, b.d.LOGOUT_BY_401_ERROR_IN_WEB);
                a1.V(str);
                ti.h.e().d(new a());
                c0.v(c0.c.f32728h);
                return true;
            }
            String str3 = null;
            c.this.I0.setOnTouchListener(null);
            c.this.E3(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                String a10 = f2.a(str, z10);
                if (a10 == null && rh.h.a().J0() && rh.h.a().d1() && f2.c(str, z11)) {
                    a10 = im.f.F().i(str, "android_webview");
                }
                final String str4 = a10;
                f.k kVar = new f.k() { // from class: rg.m1
                    @Override // im.f.k
                    public final void a(boolean z12) {
                        c.k.this.g(str, str4, p8, webView, z12);
                    }
                };
                if (!rh.h.a().J0() || str4 == null) {
                    im.f.F().r(str, kVar);
                } else {
                    im.f.F().o(str4, kVar);
                }
                return true;
            }
            c0.v(c0.c.f32729i);
            String k10 = dk.c.c().k();
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("id");
            if (t.i()) {
                q.h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app purchase. Username = " + k10);
                if (rh.h.a().D5()) {
                    gj.b.a(p8);
                    c.this.T(q0.B1);
                } else {
                    gj.a.a(p8);
                    c.this.T(q0.B1);
                }
            } else {
                if (rh.h.a().O()) {
                    String queryParameter2 = parse.getQueryParameter("ctx");
                    String queryParameter3 = parse.getQueryParameter(Payload.TYPE);
                    String c10 = e0.c(parse, "paymentSessionId");
                    if (queryParameter2 != null && queryParameter3 != null && queryParameter2.equals("subscription")) {
                        q.h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app subscription purchase.");
                        IAPPurchaseManager.nativePerformSubscriptionPurchase(queryParameter3, queryParameter, BuildConfig.STORE_TYPE, c10);
                        return true;
                    }
                }
                if (rh.h.a().H1()) {
                    q.h("rbx.purchaseflow", "PaymentsProtocol: tryStartInAppPurchase in RobloxWebDialogFragment.");
                    a0 R = a0.R(p8);
                    t0.d(c.this.c3(), "purchaseStart" + queryParameter);
                    R.e(queryParameter, parse, k10, p8, c.this.f9012c1, new Runnable() { // from class: rg.l1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.k.this.e();
                        }
                    });
                } else if (rh.h.a().n3()) {
                    IAPPurchaseManager.nativeSetMetricsPurchaseType(IAPPurchaseManager.f9233l);
                    if (!rh.h.a().i3() || (str2 = e0.c(parse, "paymentSessionId")) == null) {
                        str2 = "";
                    }
                    dj.m F0 = dj.m.F0(p8);
                    F0.i(null);
                    F0.k(true);
                    IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                    IAPPurchaseManager.nativeSetPaymentSessionId(str2);
                    IAPPurchaseManager.nativeSetProviderCurrencyCode(F0.c(queryParameter));
                    IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter);
                } else {
                    dj.m F02 = dj.m.F0(p8);
                    if (F02 == null) {
                        c.this.T(q0.B1);
                    } else {
                        t0.d(c.this.c3(), "purchaseStart" + queryParameter);
                        try {
                            str3 = parse.getQueryParameter("recurring");
                        } catch (NullPointerException unused) {
                            q.h("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                        } catch (UnsupportedOperationException unused2) {
                            q.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                        }
                        if (!F02.d(k10, queryParameter, p8, c.this.f9012c1, Boolean.valueOf(str3).booleanValue())) {
                            c.this.T(q0.f30511w1);
                        }
                    }
                }
            }
            return true;
        }

        public final /* synthetic */ void e() {
            c.this.T(q0.f30511w1);
        }

        public final /* synthetic */ void f(e4.q qVar, String str, WebView webView) {
            if (qVar.isFinishing() || qVar.isDestroyed()) {
                return;
            }
            c.this.H0.setText(str);
            webView.loadUrl(str);
        }

        public final /* synthetic */ void g(final String str, String str2, final e4.q qVar, final WebView webView, boolean z10) {
            if (!z10) {
                if (str2 != null) {
                    im.f.F().n(str2, "success", "handled_in_webview");
                }
                if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                    c.this.y3(str);
                    return;
                } else {
                    c0.v(c0.c.f32734n);
                    qVar.runOnUiThread(new Runnable() { // from class: rg.n1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.k.this.f(qVar, str, webView);
                        }
                    });
                    return;
                }
            }
            c0.v(c0.c.f32730j);
            if (rh.h.a().M1()) {
                if (!rh.h.a().d1()) {
                    c.this.S0.b(str);
                    return;
                }
                im.f F = im.f.F();
                F.z(str, "android_webview", false);
                if (str2 == null) {
                    str2 = F.i(str, "android_webview");
                }
                c.this.S0.c(str, str2);
                return;
            }
            if (!rh.h.a().d1()) {
                ev.c.d().j(c.this.new h());
                im.f.F().f(str, "android_webview", false);
                im.f.F().k(str);
                return;
            }
            im.f F2 = im.f.F();
            F2.z(str, "android_webview", false);
            if (str2 == null) {
                str2 = F2.i(str, "android_webview");
            }
            ev.c.d().j(c.this.new h());
            if (str2 == null || str2.isEmpty()) {
                F2.m(str);
            } else {
                F2.j(str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            uk.h.j().n(a1.g());
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            c.this.v3(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            c.this.J0.setRefreshing(false);
            q.h("rbx.web", "onPageFinished. url=" + str);
            c.this.w3(str);
            if (rh.h.a().S1()) {
                uk.h.j().n(a1.g());
            }
            if (rh.h.a().l2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                this.f9025a = null;
            }
            if (th.m.b().a(str)) {
                c.this.I0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q.h("rbx.web", "-> " + str);
            c.this.t3(str);
            c.this.J0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                q.k("rbx.web", "onReceivedMainFrameError: suppressing impression. error=" + webResourceError.getErrorCode() + ": " + ((Object) webResourceError.getDescription()));
                c.this.u3();
                if (e2.j(RobloxApplication.f())) {
                    return;
                }
                c0.v(c0.c.f32724d);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                return d(webView, webResourceRequest.getUrl().toString(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            String uri = webResourceRequest.getUrl().toString();
            if (!uri.equals(this.f9025a) || webResourceRequest.hasGesture()) {
                this.f9025a = uri;
                return d(webView, uri, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            q.h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + uri);
            return true;
        }
    }

    public static /* synthetic */ void J2(DomainAllowListChecker.a aVar) {
        int i10 = g.f9023a[aVar.ordinal()];
        if (i10 == 1) {
            c0.v(c0.c.f32731k);
            return;
        }
        if (i10 == 2) {
            c0.v(c0.c.f32732l);
        } else if (i10 == 3 || i10 == 4) {
            c0.v(c0.c.f32733m);
        }
    }

    @Override // androidx.fragment.app.c
    public void A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.U0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                q.h("rbx.web", "Result of file chooser invalid.");
                this.U0.onReceiveValue(null);
            }
        }
    }

    public void A3(boolean z10) {
        this.W0 = z10;
    }

    public void B3(i iVar) {
        this.T0 = iVar;
    }

    public void C3(j jVar) {
        this.S0 = jVar;
    }

    public void D3(boolean z10) {
        this.X0 = z10;
    }

    public final void E3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.I0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.I0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        sk.b.a().n(this);
        Bundle t8 = t();
        if (t8 != null) {
            String string = t8.getString("DEFAULT_URL", null);
            q.b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                if (string.contains("/giftcards?")) {
                    string = string.replace("/giftcards?", "/shopgiftcards?");
                }
                q.b("rbx.web", "onCreate: default-URL = " + string + ".");
                this.N0 = string;
                if (this.K0 == null) {
                    this.K0 = string;
                    if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                        this.Y0 = string;
                    }
                }
            }
            this.O0 = t8.getString("WEB_VIEW_TAG", null);
            this.V0 = t8.getBoolean("USE_APP_HYBRID");
        }
        this.Z0 = new vg.c(w());
    }

    public final void F3() {
        final e4.q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: rg.k1
                @Override // java.lang.Runnable
                public final void run() {
                    com.roblox.client.c.this.p3(p8);
                }
            });
        }
    }

    public final void G3(p pVar) {
        e4.q p8 = p();
        if (p8 == null) {
            return;
        }
        CharSequence c10 = pVar.c(p8);
        if (pVar.f()) {
            v2(c10);
        } else {
            V(c10.toString());
        }
    }

    public void H3(ll.a aVar) {
        Boolean bool = aVar.f23486c;
        if (bool != null) {
            D3(bool.booleanValue());
        }
        Boolean bool2 = aVar.f23488e;
        if (bool2 != null) {
            A3(bool2.booleanValue());
        }
    }

    public c0.b I3() {
        return c0.b.f32712e;
    }

    @Override // androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(n0.f30414i, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(m0.f30374k0);
        this.H0 = (TextView) inflate.findViewById(m0.f30398w0);
        k kVar = new k();
        this.I0 = a3();
        if (rh.h.a().m2()) {
            this.I0.setCommandListener(new x());
        }
        viewGroup2.addView(this.I0, new ViewGroup.LayoutParams(-1, -1));
        this.I0.setTag(this.O0);
        this.I0.setWebViewClient(kVar);
        this.I0.getSettings().setSupportMultipleWindows(true);
        this.I0.setWebChromeClient(new b());
        try {
            this.I0.getSettings().setJavaScriptEnabled(true);
            this.I0.getSettings().setDomStorageEnabled(true);
            this.I0.getSettings().setUserAgentString(a1.a1());
            this.I0.getSettings().setCacheMode(-1);
            this.I0.setHorizontalScrollBarEnabled(false);
            this.I0.setVerticalScrollBarEnabled(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (mh.b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.K0 != null) {
            if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                z3(this.K0, true);
            } else {
                c0.v(c0.c.f32734n);
                this.I0.loadUrl(this.K0);
            }
            this.K0 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(m0.f30374k0);
        this.J0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.J0;
        int i10 = j0.b;
        int i11 = j0.f30317o;
        swipeRefreshLayout2.setColorSchemeResources(i10, i10, i11, i11);
        this.Q0 = (FrameLayout) inflate.findViewById(m0.f30376l0);
        Bundle t8 = t();
        if (t8 != null) {
            this.L0 = t8.getInt("dialogHeight", 0);
            this.M0 = t8.getInt("dialogWidth", 0);
            this.J0.setEnabled(false);
            this.R0 = t8.getBoolean("USING_LOGIN_WEB_URL", false);
            this.X0 = t8.getBoolean("VISIBLE", true);
            this.W0 = t8.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        u2();
        this.I0.h();
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public void K0() {
        sk.b.a().p(this);
        if (rh.h.a().M5() && this.f9010a1 != null) {
            q.h("rbx.web", "onDestroy: Cleaning up pending permission request");
            this.f9010a1.deny();
            this.f9010a1 = null;
        }
        super.K0();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void M0() {
        super.M0();
        this.I0.i();
    }

    @Override // androidx.fragment.app.c
    public void P0(boolean z10) {
        super.P0(z10);
        if (z10 || !th.m.b().a(this.I0.getUrl())) {
            return;
        }
        this.I0.reload();
    }

    @Override // androidx.fragment.app.c
    public void V0() {
        super.V0();
        RBHybridWebView rBHybridWebView = this.I0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    public final void X2(final String str) {
        final e4.q p8 = p();
        if (p8 == null || p8.isFinishing() || p8.isDestroyed()) {
            return;
        }
        p8.runOnUiThread(new Runnable() { // from class: rg.e1
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.c.this.j3(p8, str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Y2(final p pVar) {
        if (rh.h.a().r1() && (pVar instanceof cj.j)) {
            cj.j jVar = (cj.j) pVar;
            String b10 = jVar.b();
            if (!b10.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(pVar.d(), jVar.a().toString(), b10);
            }
        }
        final e4.q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: rg.f1
                @Override // java.lang.Runnable
                public final void run() {
                    com.roblox.client.c.this.k3(p8, pVar);
                }
            });
        }
    }

    public final ProgressDialog Z2(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    @Override // rg.x0, bk.e.b
    public void a0(ml.a aVar) {
        super.a0(aVar);
        this.I0.setBackgroundColor(this.Z0.a(dk.c.c().g()));
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        Window window;
        super.a1();
        if (h2() != null && this.L0 != 0 && (window = h2().getWindow()) != null) {
            int i10 = this.M0;
            if (i10 == 0) {
                window.setLayout(-2, this.L0);
            } else {
                window.setLayout(i10, this.L0);
            }
        }
        RBHybridWebView rBHybridWebView = this.I0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    public RBHybridWebView a3() {
        RBHybridWebView aVar = this.V0 ? new gi.a(w(), new a()) : new RBHybridWebView(w());
        if (rh.h.a().S1()) {
            uk.e.A(a1.O());
        }
        return aVar;
    }

    public final void b3(final String str, boolean z10) {
        final e4.q p8 = p();
        if (p8 == null || p8.isFinishing() || p8.isDestroyed()) {
            return;
        }
        p8.runOnUiThread(new Runnable() { // from class: rg.d1
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.c.this.l3(p8, str);
            }
        });
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
    }

    public String c3() {
        return "undefinedWebContext";
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        super.d1();
    }

    public String d3() {
        RBHybridWebView rBHybridWebView = this.I0;
        return rBHybridWebView == null ? this.K0 : rBHybridWebView.getUrl();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void e() {
        if (p() != null) {
            if (((com.roblox.client.a) p()).N1()) {
                this.J0.setRefreshing(false);
            } else {
                this.I0.reload();
            }
        }
    }

    public boolean e3() {
        RBHybridWebView rBHybridWebView = this.I0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
            return false;
        }
        E3(this.I0.getUrl(), false);
        this.I0.goBack();
        return true;
    }

    public final boolean f3(String str) {
        Intent intent = str.startsWith("mailto:") ? new Intent("android.intent.action.SENDTO", Uri.parse(str)) : str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        if (intent == null) {
            return false;
        }
        if (t.a(w(), intent)) {
            X1(intent);
            return true;
        }
        y2(q0.U, 1);
        return true;
    }

    public final void g3() {
        final e4.q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: rg.g1
                @Override // java.lang.Runnable
                public final void run() {
                    com.roblox.client.c.this.m3(p8);
                }
            });
        }
    }

    public boolean h3() {
        return this.W0;
    }

    public final /* synthetic */ void i3(e4.q qVar, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.I0.getUrl())) {
            qVar.onBackPressed();
        }
    }

    public final /* synthetic */ void j3(final e4.q qVar, final String str) {
        new a.C0009a(qVar).d(false).p(q0.f30489p0).g(q0.f30486o0).i(q0.f30494r, null).m(q0.f30497s, new DialogInterface.OnClickListener() { // from class: rg.i1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                new im.a("rbx.web").e(e4.q.this, str, r1);
            }
        }).k(new DialogInterface.OnDismissListener() { // from class: rg.j1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                com.roblox.client.c.this.i3(qVar, dialogInterface);
            }
        }).r();
    }

    public final /* synthetic */ void k3(e4.q qVar, p pVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        g3();
        G3(pVar);
    }

    public final /* synthetic */ void l3(e4.q qVar, String str) {
        if (qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        this.H0.setText(str);
        this.I0.loadUrl(str);
    }

    public final /* synthetic */ void m3(e4.q qVar) {
        ProgressDialog progressDialog;
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed() || (progressDialog = this.P0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.P0.dismiss();
    }

    public final /* synthetic */ void n3(Boolean bool) {
        q.h("rbx.web", "Camera permission result: " + bool);
        if (this.f9010a1 == null) {
            q.k("rbx.web", "Camera permission callback received but no pending request");
            return;
        }
        if (bool.booleanValue()) {
            q.h("rbx.web", "Camera permission granted by user, granting to webview");
            this.f9010a1.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        } else {
            q.h("rbx.web", "Camera permission denied by user, denying to webview");
            this.f9010a1.deny();
        }
        this.f9010a1 = null;
    }

    public final /* synthetic */ void o3(boolean z10, String str, DomainAllowListChecker.a aVar) {
        int i10 = g.f9023a[aVar.ordinal()];
        if (i10 == 1) {
            if (z10) {
                c0.v(c0.c.f32731k);
            }
            b3(str, false);
        } else if (i10 == 2) {
            if (z10) {
                c0.v(c0.c.f32732l);
            }
            b3(str, true);
        } else if (i10 == 3 || i10 == 4) {
            if (z10) {
                c0.v(c0.c.f32733m);
            }
            X2(str);
        }
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(sk.a aVar) {
        if (this.I0 != null) {
            throw null;
        }
    }

    public final /* synthetic */ void p3(e4.q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.P0 == null) {
            this.P0 = Z2(qVar, null, e0(q0.P));
        }
        this.P0.show();
    }

    public void q3(String str) {
        c0.w(I3(), str);
        if (this.I0 == null) {
            this.K0 = str;
        } else if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
            z3(str, true);
        } else {
            c0.v(c0.c.f32734n);
            this.I0.loadUrl(str);
        }
        if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
            this.Y0 = str;
        }
    }

    public final void r3(String str) {
        if (str == null) {
            return;
        }
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9782a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.Y0)) {
            c0.v(c0.c.f32731k);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.Y0, new DomainAllowListChecker.Callback() { // from class: rg.h1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    com.roblox.client.c.J2(aVar);
                }
            });
        }
    }

    public final boolean s3(String str) {
        xj.b bVar = new xj.b("rbx.web");
        if (!bVar.b(str)) {
            return false;
        }
        bVar.a(p(), str, str);
        return true;
    }

    public void t3(String str) {
    }

    public void u3() {
    }

    public void v3(String str) {
    }

    public void w3(String str) {
    }

    public void x3(WebView webView, int i10) {
    }

    public void y3(String str) {
        z3(str, false);
    }

    public final void z3(final String str, final boolean z10) {
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9782a;
        if (!domainAllowListChecker.isKnownTrustedDomain(str, this.Y0)) {
            domainAllowListChecker.checkDomainAllowList(str, this.Y0, new DomainAllowListChecker.Callback() { // from class: rg.b1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    com.roblox.client.c.this.o3(z10, str, aVar);
                }
            });
            return;
        }
        if (z10) {
            c0.v(c0.c.f32731k);
        }
        b3(str, false);
    }
}
