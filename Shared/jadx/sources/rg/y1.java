package rg;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import gl.AndroidColorToken;
import org.greenrobot.eventbus.ThreadMode;
import rg.y1;
import ug.c0;

/* loaded from: classes2.dex */
public class y1 extends androidx.fragment.app.c implements SwipeRefreshLayout.j {

    /* renamed from: m0, reason: collision with root package name */
    public String f30624m0;

    /* renamed from: n0, reason: collision with root package name */
    public ProgressDialog f30625n0;

    /* renamed from: o0, reason: collision with root package name */
    public FrameLayout f30626o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f30627p0;

    /* renamed from: q0, reason: collision with root package name */
    public ValueCallback<Uri[]> f30628q0;

    /* renamed from: t0, reason: collision with root package name */
    public ImageView f30631t0;

    /* renamed from: f0, reason: collision with root package name */
    public TextView f30617f0 = null;

    /* renamed from: g0, reason: collision with root package name */
    public RBHybridWebView f30618g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    public SwipeRefreshLayout f30619h0 = null;

    /* renamed from: i0, reason: collision with root package name */
    public String f30620i0 = null;

    /* renamed from: j0, reason: collision with root package name */
    public int f30621j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public int f30622k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public String f30623l0 = null;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f30629r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f30630s0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f30632u0 = false;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f30633v0 = true;

    /* renamed from: w0, reason: collision with root package name */
    public gl.c f30634w0 = gl.b.tokens;

    /* renamed from: x0, reason: collision with root package name */
    public String f30635x0 = null;

    /* renamed from: y0, reason: collision with root package name */
    public final cj.o f30636y0 = new b();

    /* renamed from: z0, reason: collision with root package name */
    public final cj.o f30637z0 = new c();
    public final cj.o A0 = new d();
    public final cj.o B0 = new e();

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            if (!z11) {
                return super.onCreateWindow(webView, z10, z11, message);
            }
            ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            for (String str : permissionRequest.getResources()) {
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (l2.b.a(y1.this.p(), y.h().k().s(mm.n.CAMERA)) != 0) {
                        ek.q.h("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        ek.q.h("rbx.web", "Permission granted for camera");
                        permissionRequest.grant(new String[]{str});
                    }
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            y1.this.Y2(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            y1.this.f30628q0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            y1.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    public class b implements cj.o {
        public b() {
        }

        @Override // cj.o
        public void b() {
            y1.this.d3();
        }

        @Override // cj.o
        public void c(cj.p pVar) {
            y1.this.x2(pVar);
        }

        @Override // cj.o
        public void d() {
            y1.this.d3();
        }

        @Override // cj.o
        public void e() {
            y1.this.I2();
        }
    }

    public class c implements cj.o {
        public c() {
        }

        @Override // cj.o
        public void b() {
            y1.this.d3();
        }

        @Override // cj.o
        public void c(cj.p pVar) {
            y1.this.x2(pVar);
        }

        @Override // cj.o
        public void d() {
            y1.this.d3();
        }

        @Override // cj.o
        public void e() {
            y1.this.I2();
        }
    }

    public class d implements cj.o {
        public d() {
        }

        @Override // cj.o
        public void b() {
        }

        @Override // cj.o
        public void c(cj.p pVar) {
            ek.q.h("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + pVar + ".");
            y1.this.x2(pVar);
        }

        @Override // cj.o
        public void d() {
        }

        @Override // cj.o
        public void e() {
        }
    }

    public class e implements cj.o {
        public e() {
        }

        @Override // cj.o
        public void b() {
        }

        @Override // cj.o
        public void c(cj.p pVar) {
            y1.this.x2(pVar);
        }

        @Override // cj.o
        public void d() {
            y1.this.d3();
        }

        @Override // cj.o
        public void e() {
        }
    }

    public static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30643a;

        static {
            int[] iArr = new int[DomainAllowListChecker.a.values().length];
            f30643a = iArr;
            try {
                iArr[DomainAllowListChecker.a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30643a[DomainAllowListChecker.a.f9784c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30643a[DomainAllowListChecker.a.f9785d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30643a[DomainAllowListChecker.a.f9783a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class g {
        public g() {
        }
    }

    public interface h {
    }

    public class i extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public String f30645a = null;

        public class a implements ci.m {
            public a() {
            }

            @Override // ci.m
            public void a(ci.j jVar) {
            }
        }

        public i() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:88|(2:89|90)|91|92|93|94|95|(2:97|98)) */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x025e, code lost:
        
            ek.q.h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
        
            ek.q.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url");
         */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(final android.webkit.WebView r15, final java.lang.String r16, boolean r17, boolean r18) {
            /*
                Method dump skipped, instructions count: 726
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rg.y1.i.d(android.webkit.WebView, java.lang.String, boolean, boolean):boolean");
        }

        public final /* synthetic */ void e() {
            try {
                y1.this.D2().T(q0.f30511w1);
            } catch (u0 unused) {
                y1.U2();
            }
        }

        public final /* synthetic */ void f(e4.q qVar, String str, WebView webView) {
            if (qVar.isFinishing() || qVar.isDestroyed()) {
                return;
            }
            y1.this.f30617f0.setText(str);
            webView.loadUrl(str);
        }

        public final /* synthetic */ void g(final String str, String str2, final e4.q qVar, final WebView webView, boolean z10) {
            if (!z10) {
                if (str2 != null) {
                    im.f.F().n(str2, "success", "handled_in_webview");
                }
                if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                    y1.this.a3(str);
                    return;
                } else {
                    qVar.runOnUiThread(new Runnable() { // from class: rg.b2
                        @Override // java.lang.Runnable
                        public final void run() {
                            y1.i.this.f(qVar, str, webView);
                        }
                    });
                    return;
                }
            }
            if (!rh.h.a().d1()) {
                ev.c.d().j(y1.this.new g());
                im.f.F().f(str, "android_webview", false);
                im.f.F().k(str);
                return;
            }
            im.f F = im.f.F();
            F.z(str, "android_webview", false);
            if (str2 == null) {
                str2 = F.i(str, "android_webview");
            }
            ev.c.d().j(y1.this.new g());
            if (str2 == null || str2.isEmpty()) {
                F.m(str);
            } else {
                F.j(str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            uk.h.j().n(a1.g());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            y1.this.f30619h0.setRefreshing(false);
            ek.q.h("rbx.web", "onPageFinished. url=" + str);
            y1.this.X2(str);
            if (rh.h.a().S1()) {
                uk.h.j().n(a1.g());
            }
            if (rh.h.a().l2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                this.f30645a = null;
            }
            if (th.m.b().a(str)) {
                y1.this.f30618g0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ek.q.h("rbx.web", "-> " + str);
            y1.this.W2(str);
            y1.this.f30619h0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                return d(webView, webResourceRequest.getUrl().toString(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            String uri = webResourceRequest.getUrl().toString();
            if (!uri.equals(this.f30645a) || webResourceRequest.hasGesture()) {
                this.f30645a = uri;
                return d(webView, uri, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            ek.q.h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + uri);
            return true;
        }
    }

    private void C2(final String str, boolean z10) {
        final e4.q p8 = p();
        if (p8 == null || p8.isFinishing() || p8.isDestroyed()) {
            return;
        }
        p8.runOnUiThread(new Runnable() { // from class: rg.t1
            @Override // java.lang.Runnable
            public final void run() {
                y1.this.N2(p8, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H2(String str) {
        Intent intent = str.startsWith("mailto:") ? new Intent("android.intent.action.SENDTO", Uri.parse(str)) : str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        if (intent == null) {
            return false;
        }
        if (ek.t.a(w(), intent)) {
            X1(intent);
            return true;
        }
        try {
            D2().K1(q0.U, 1);
        } catch (u0 unused) {
            U2();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        final e4.q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: rg.r1
                @Override // java.lang.Runnable
                public final void run() {
                    y1.this.O2(p8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K2(e4.q qVar, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.f30618g0.getUrl())) {
            qVar.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L2(final e4.q qVar, final String str) {
        new a.C0009a(qVar).d(false).p(q0.f30489p0).g(q0.f30486o0).i(q0.f30494r, null).m(q0.f30497s, new DialogInterface.OnClickListener() { // from class: rg.v1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                new im.a("rbx.web").e(e4.q.this, str, r1);
            }
        }).k(new DialogInterface.OnDismissListener() { // from class: rg.w1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                y1.this.K2(qVar, dialogInterface);
            }
        }).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(e4.q qVar, cj.p pVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        I2();
        e3(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N2(e4.q qVar, String str) {
        if (qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        this.f30617f0.setText(str);
        this.f30618g0.loadUrl(str);
    }

    public static void U2() {
        ek.q.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V2(String str) {
        xj.b bVar = new xj.b("rbx.web");
        if (!bVar.b(str)) {
            return false;
        }
        bVar.a(p(), str, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(final String str) {
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9782a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.f30635x0)) {
            C2(str, false);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.f30635x0, new DomainAllowListChecker.Callback() { // from class: rg.s1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    y1.this.P2(str, aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.f30618g0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.f30618g0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        final e4.q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: rg.x1
                @Override // java.lang.Runnable
                public final void run() {
                    y1.this.S2(p8);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e3(cj.p pVar) {
        boolean z10;
        e4.q p8 = p();
        if (p8 == null) {
            return;
        }
        if (rh.h.a().l5()) {
            z10 = rh.h.a().N0().contains(((cj.j) pVar).a());
        } else {
            z10 = false;
        }
        ek.q.b("rbx.web", "isBonusItemEnabled = " + z10);
        CharSequence c10 = pVar.c(p8);
        if (pVar.f()) {
            y2(c10);
            return;
        }
        try {
            if (!z10) {
                D2().V(c10.toString());
                return;
            }
            D2().F1(e0(q0.f30520z1), e0(q0.A1));
        } catch (u0 unused) {
            U2();
        }
    }

    public static /* bridge */ /* synthetic */ h o2(y1 y1Var) {
        y1Var.getClass();
        return null;
    }

    private void w2(final String str) {
        final e4.q p8 = p();
        if (p8 == null || p8.isFinishing() || p8.isDestroyed()) {
            return;
        }
        p8.runOnUiThread(new Runnable() { // from class: rg.u1
            @Override // java.lang.Runnable
            public final void run() {
                y1.this.L2(p8, str);
            }
        });
    }

    private synchronized void y2(CharSequence charSequence) {
        e4.q p8 = p();
        if (p8 == null) {
            return;
        }
        androidx.appcompat.app.a a10 = new a.C0009a(p8).a();
        TextView textView = new TextView(p8);
        String string = p8.getString(q0.W);
        int indexOf = charSequence.toString().indexOf(string);
        fk.b.b(textView, charSequence.toString(), new fk.c(p8, null, string, indexOf, indexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        a10.x(textView, 150, 100, 150, 100);
        a10.setCanceledOnTouchOutside(true);
        try {
            a10.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private ProgressDialog z2(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    @Override // androidx.fragment.app.c
    public void A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.f30628q0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                ek.q.h("rbx.web", "Result of file chooser invalid.");
                this.f30628q0.onReceiveValue(null);
            }
        }
    }

    public RBHybridWebView A2() {
        RBHybridWebView aVar = this.f30629r0 ? new gi.a(w()) : new RBHybridWebView(w());
        if (rh.h.a().S1()) {
            uk.e.A(a1.O());
        }
        return aVar;
    }

    public void B2() {
        if (p() != null) {
            p().l1().a1();
        }
    }

    @NonNull
    public com.roblox.client.a D2() {
        e4.q p8 = p();
        if (p8 instanceof com.roblox.client.a) {
            return (com.roblox.client.a) p8;
        }
        throw new u0();
    }

    public boolean E2(String str, boolean z10) {
        Bundle t8 = t();
        return t8 != null ? t8.getBoolean(str, z10) : z10;
    }

    @Override // androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        sk.b.a().n(this);
        Bundle t8 = t();
        if (t8 != null) {
            String string = t8.getString("DEFAULT_URL", null);
            ek.q.b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                this.f30623l0 = string;
                if (this.f30620i0 == null) {
                    this.f30620i0 = string;
                    if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                        this.f30635x0 = string;
                    }
                }
            }
            this.f30624m0 = t8.getString("WEB_VIEW_TAG", null);
            this.f30629r0 = t8.getBoolean("USE_APP_HYBRID");
        }
    }

    public String F2() {
        return "undefinedWebContext";
    }

    public boolean G2() {
        RBHybridWebView rBHybridWebView = this.f30618g0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
            return false;
        }
        c3(this.f30618g0.getUrl(), false);
        this.f30618g0.goBack();
        return true;
    }

    @Override // androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z10 = rh.h.a().F0() && E2("hideNativeHeader", false);
        this.f30630s0 = z10;
        View inflate = layoutInflater.inflate(z10 ? n0.f30419n : n0.f30418m, viewGroup, false);
        if (rh.h.a().D3() && !this.f30630s0) {
            ki.g.b(inflate);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(m0.f30374k0);
        this.f30617f0 = (TextView) inflate.findViewById(m0.f30398w0);
        i iVar = new i();
        this.f30618g0 = A2();
        if (rh.h.a().m2()) {
            this.f30618g0.setCommandListener(new x());
        }
        viewGroup2.addView(this.f30618g0, new ViewGroup.LayoutParams(-1, -1));
        this.f30618g0.setTag(this.f30624m0);
        this.f30618g0.setWebViewClient(iVar);
        this.f30618g0.getSettings().setSupportMultipleWindows(true);
        this.f30618g0.setWebChromeClient(new a());
        this.f30618g0.getSettings().setJavaScriptEnabled(true);
        this.f30618g0.getSettings().setDomStorageEnabled(true);
        this.f30618g0.getSettings().setUserAgentString(a1.a1());
        this.f30618g0.getSettings().setCacheMode(-1);
        this.f30618g0.setHorizontalScrollBarEnabled(false);
        this.f30618g0.setVerticalScrollBarEnabled(false);
        if (mh.b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.f30620i0 != null) {
            if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
                a3(this.f30620i0);
            } else {
                this.f30618g0.loadUrl(this.f30620i0);
            }
            this.f30620i0 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(m0.f30374k0);
        this.f30619h0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f30619h0;
        int i10 = j0.b;
        int i11 = j0.f30317o;
        swipeRefreshLayout2.setColorSchemeResources(i10, i10, i11, i11);
        this.f30626o0 = (FrameLayout) inflate.findViewById(m0.f30376l0);
        Bundle t8 = t();
        if (t8 != null) {
            this.f30621j0 = t8.getInt("dialogHeight", 0);
            this.f30622k0 = t8.getInt("dialogWidth", 0);
            if (!t8.getBoolean("enablePullToRefresh", true)) {
                this.f30619h0.setEnabled(false);
            }
            this.f30627p0 = t8.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f30633v0 = t8.getBoolean("VISIBLE", true);
            this.f30632u0 = t8.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        try {
            D2().N1();
        } catch (u0 unused) {
            U2();
        }
        this.f30618g0.h();
        if (this.f30630s0) {
            b3(inflate);
        }
        return inflate;
    }

    public boolean J2() {
        return this.f30632u0;
    }

    @Override // androidx.fragment.app.c
    public void K0() {
        sk.b.a().p(this);
        super.K0();
    }

    @Override // androidx.fragment.app.c
    public void M0() {
        super.M0();
        this.f30618g0.i();
    }

    public final /* synthetic */ void O2(e4.q qVar) {
        ProgressDialog progressDialog;
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed() || (progressDialog = this.f30625n0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f30625n0.dismiss();
    }

    @Override // androidx.fragment.app.c
    public void P0(boolean z10) {
        super.P0(z10);
        if (z10 || !th.m.b().a(this.f30618g0.getUrl())) {
            return;
        }
        this.f30618g0.reload();
    }

    public final /* synthetic */ void P2(String str, DomainAllowListChecker.a aVar) {
        int i10 = f.f30643a[aVar.ordinal()];
        if (i10 == 1) {
            C2(str, false);
            return;
        }
        if (i10 == 2) {
            C2(str, true);
        } else if (i10 == 3 || i10 == 4) {
            w2(str);
        }
    }

    public final /* synthetic */ void Q2(View view) {
        B2();
    }

    public final /* synthetic */ WindowInsetsCompat R2(int i10, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30631t0.getLayoutParams();
        layoutParams.topMargin = i10 + insets.top;
        this.f30631t0.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    public final /* synthetic */ void S2(e4.q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.f30625n0 == null) {
            this.f30625n0 = z2(qVar, null, e0(q0.P));
        }
        this.f30625n0.show();
    }

    public void T2(String str) {
        ug.c0.w(g3(), str);
        if (this.f30618g0 == null) {
            this.f30620i0 = str;
        } else if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
            a3(str);
        } else {
            this.f30618g0.loadUrl(str);
        }
        if (DomainAllowListChecker.f9782a.enableDomainAllowListChecker()) {
            this.f30635x0 = str;
        }
    }

    @Override // androidx.fragment.app.c
    public void V0() {
        super.V0();
        RBHybridWebView rBHybridWebView = this.f30618g0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    public void W2(String str) {
    }

    public void X2(String str) {
    }

    public void Y2(WebView webView, int i10) {
    }

    public final int Z2(ml.a aVar) {
        boolean z10 = aVar == ml.a.f24591d;
        AndroidColorToken b10 = this.f30634w0.b("Surface.Surface_0");
        return androidx.core.graphics.c.l(b10 != null ? z10 ? b10.getDark() : b10.getLight() : z10 ? l2.b.c(w(), j0.f30309g) : l2.b.c(w(), j0.f30317o), 235);
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        super.a1();
        RBHybridWebView rBHybridWebView = this.f30618g0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    public void b3(View view) {
        ImageView imageView = (ImageView) view.findViewById(m0.D);
        this.f30631t0 = imageView;
        if (!this.f30630s0 || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f30631t0.setImageResource(new RobloxToolbar.c().a(dk.c.c().g()));
        this.f30631t0.setOnClickListener(new View.OnClickListener() { // from class: rg.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                y1.this.Q2(view2);
            }
        });
        f3(dk.c.c().g());
        final int i10 = (int) (S().getDisplayMetrics().density * 10.0f);
        androidx.core.view.o0.A0(view, new androidx.core.view.y() { // from class: rg.q1
            @Override // androidx.core.view.y
            public final WindowInsetsCompat J(View view2, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat R2;
                R2 = y1.this.R2(i10, view2, windowInsetsCompat);
                return R2;
            }
        });
    }

    @Override // androidx.fragment.app.c
    public void c1() {
        super.c1();
    }

    @Override // androidx.fragment.app.c
    public void d1() {
        super.d1();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void e() {
        if (p() != null) {
            if (((com.roblox.client.a) p()).N1()) {
                this.f30619h0.setRefreshing(false);
            } else {
                this.f30618g0.reload();
            }
        }
    }

    public void f3(ml.a aVar) {
        if (this.f30631t0 == null) {
            return;
        }
        int Z2 = Z2(aVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Z2);
        this.f30631t0.setBackground(gradientDrawable);
    }

    public c0.b g3() {
        return c0.b.f32711d;
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(sk.a aVar) {
        if (this.f30618g0 != null) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x2(final cj.p pVar) {
        if (rh.h.a().r1() && (pVar instanceof cj.j)) {
            cj.j jVar = (cj.j) pVar;
            String b10 = jVar.b();
            if (!b10.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(pVar.d(), jVar.a().toString(), b10);
            }
        }
        final e4.q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: rg.o1
                @Override // java.lang.Runnable
                public final void run() {
                    y1.this.M2(p8, pVar);
                }
            });
        }
    }
}
