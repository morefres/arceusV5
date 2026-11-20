package yj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.c;
import com.roblox.protocols.webview.WebViewProtocol;
import com.roblox.protocols.webview.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0002\u0018\u001aB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006\""}, d2 = {"Lyj/a0;", "Lvg/b$d;", "Lcom/roblox/protocols/webview/a$d;", "Lj/b;", "activity", "", "containerViewId", "Lim/f;", "linkingProtocol", "Lwi/a;", "nativeViewModel", "<init>", "(Lj/b;ILim/f;Lwi/a;)V", "", "i", "()Z", "Lll/a;", "params", "", rl.d.f30696a, "(Lll/a;)V", "f", "e", "()V", ve.a.f33391e, "Lj/b;", j6.b.f21518e, "I", "c", "Lim/f;", "Lwi/a;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "webViewProtocol", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a0 implements b.d, a.d {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j.b activity;

    /* renamed from: b, reason: from kotlin metadata */
    public final int containerViewId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final im.f linkingProtocol;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wi.a nativeViewModel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WebViewProtocol webViewProtocol;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lyj/a0$a;", "Lth/d;", "<init>", "()V", "Lki/c;", "w2", "()Lki/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "u2", "()Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends th.d {
        @Override // th.d, com.roblox.client.c, androidx.fragment.app.c
        @NotNull
        public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            ki.c cVar = this.G0;
            Bundle t8 = t();
            cVar.o(Intrinsics.c(t8 != null ? Boolean.valueOf(t8.getBoolean("KEY_APP_MODE")) : null, Boolean.TRUE) ? uh.u0.EXPERIENCE : uh.u0.APP);
            View x22 = x2(inflater, super.J0(inflater, container, savedInstanceState));
            Intrinsics.checkNotNullExpressionValue(x22, "createInsetView(...)");
            return x22;
        }

        @Override // rg.x0
        public boolean u2() {
            return false;
        }

        @Override // rg.x0
        @NotNull
        public ki.c w2() {
            return new ki.c();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lyj/a0$b;", "", "<init>", "()V", "Lll/a;", "params", "", "isInExperience", "Landroid/os/Bundle;", ve.a.f33391e, "(Lll/a;Z)Landroid/os/Bundle;", "", "TAG", "Ljava/lang/String;", "FRAGMENT_TAG", "APP_MODE", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: yj.a0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle a(@NotNull ll.a params, boolean isInExperience) {
            Intrinsics.checkNotNullParameter(params, "params");
            Bundle bundle = new Bundle();
            bundle.putString("DEFAULT_URL", params.f23485a);
            bundle.putBoolean("USE_APP_HYBRID", true);
            Boolean visible = params.f23486c;
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            bundle.putBoolean("VISIBLE", visible.booleanValue());
            Boolean backNavigationDisabled = params.f23488e;
            Intrinsics.checkNotNullExpressionValue(backNavigationDisabled, "backNavigationDisabled");
            bundle.putBoolean("BACK_NAVIGATION_DISABLED", backNavigationDisabled.booleanValue());
            bundle.putString("TITLE_STRING", params.b);
            bundle.putBoolean("HAS_PARENT", true);
            bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
            Boolean showDomainAsTitle = params.f23489f;
            Intrinsics.checkNotNullExpressionValue(showDomainAsTitle, "showDomainAsTitle");
            bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", showDomainAsTitle.booleanValue());
            bundle.putBoolean("CLOSE_FRAGMENT_ON_RESTORED", true);
            Boolean bool = params.f23490g;
            bundle.putBoolean("hideNativeHeader", bool != null ? bool.booleanValue() : false);
            bundle.putBoolean("KEY_APP_MODE", isInExperience);
            return bundle;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"yj/a0$c", "Lcom/roblox/client/c$j;", "", "url", "", j6.b.f21518e, "(Ljava/lang/String;)V", "deeplinkId", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements c.j {
        public c() {
        }

        @Override // com.roblox.client.c.j
        public void b(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            a0.this.e();
            if (!rh.h.a().d1()) {
                if (rh.h.a().x() && rh.h.a().g5()) {
                    a0.this.linkingProtocol.d(url, "android_webview");
                }
                a0.this.linkingProtocol.k(url);
                return;
            }
            a0.this.linkingProtocol.z(url, "android_webview", false);
            String i10 = a0.this.linkingProtocol.i(url, "android_webview");
            if (i10 == null || i10.length() == 0) {
                a0.this.linkingProtocol.m(url);
            } else {
                a0.this.linkingProtocol.j(i10);
            }
        }

        @Override // com.roblox.client.c.j
        public void c(String url, String deeplinkId) {
            Intrinsics.checkNotNullParameter(url, "url");
            a0.this.e();
            if (deeplinkId == null || deeplinkId.length() == 0) {
                a0.this.linkingProtocol.m(url);
            } else {
                a0.this.linkingProtocol.j(deeplinkId);
            }
        }
    }

    public a0(@NotNull j.b activity, int i10, @NotNull im.f linkingProtocol, @NotNull wi.a nativeViewModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(linkingProtocol, "linkingProtocol");
        Intrinsics.checkNotNullParameter(nativeViewModel, "nativeViewModel");
        this.activity = activity;
        this.containerViewId = i10;
        this.linkingProtocol = linkingProtocol;
        this.nativeViewModel = nativeViewModel;
        this.webViewProtocol = new WebViewProtocol(this);
    }

    public static final void g(a0 a0Var, String str) {
        a0Var.webViewProtocol.s(str);
    }

    public static final Unit h(com.roblox.client.c cVar, a0 a0Var, e.m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        ek.q.b("BrowserServiceAdapter", "handleOnBackPressed: ... (1) It is RobloxWebDialogFragment:");
        if (cVar.h3() || !cVar.e3()) {
            a0Var.webViewProtocol.t();
        }
        return Unit.f22894a;
    }

    private final boolean i() {
        FragmentManager l12 = this.activity.l1();
        Intrinsics.checkNotNullExpressionValue(l12, "getSupportFragmentManager(...)");
        if (l12.U0() || l12.u0() == 0) {
            return false;
        }
        l12.c1(null, 1);
        return true;
    }

    @Override // vg.b.d, com.roblox.protocols.webview.a.d
    public void d(@NotNull ll.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ek.q.b("BrowserServiceAdapter", "openWebView: params = " + params);
        boolean c10 = Intrinsics.c(params.f23487d, Boolean.TRUE);
        final com.roblox.client.c y0Var = c10 ? new rg.y0() : new a();
        y0Var.a().a(new vg.a());
        y0Var.O1(INSTANCE.a(params, this.nativeViewModel.a().getValue().booleanValue()));
        y0Var.B3(new c.i() { // from class: yj.y
            @Override // com.roblox.client.c.i
            public final void a(String str) {
                a0.g(a0.this, str);
            }
        });
        e.q0.b(this.activity.P(), y0Var, false, new Function1() { // from class: yj.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit h10;
                h10 = a0.h(com.roblox.client.c.this, this, (e.m0) obj);
                return h10;
            }
        }, 2, null);
        y0Var.C3(new c());
        FragmentManager l12 = this.activity.l1();
        Intrinsics.checkNotNullExpressionValue(l12, "getSupportFragmentManager(...)");
        androidx.fragment.app.h r8 = l12.r();
        if (!c10) {
            r8.q(rg.g0.b, rg.g0.f30295a);
        }
        r8.o(this.containerViewId, y0Var, "WebDialogFragment_BrowserService");
        r8.f(null);
        r8.h();
    }

    @Override // vg.b.d, com.roblox.protocols.webview.a.d
    public void e() {
        ek.q.h("BrowserServiceAdapter", "closeWebView:");
        if (i()) {
            this.webViewProtocol.t();
        }
    }

    @Override // vg.b.d, com.roblox.protocols.webview.a.d
    public void f(@NotNull ll.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        androidx.fragment.app.c n02 = this.activity.l1().n0("WebDialogFragment_BrowserService");
        com.roblox.client.c cVar = n02 instanceof com.roblox.client.c ? (com.roblox.client.c) n02 : null;
        if (cVar != null) {
            ek.q.h("BrowserServiceAdapter", "updateWebView: Found the fragment. Updating...");
            cVar.H3(params);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a0(j.b r1, int r2, im.f r3, wi.a r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto Ld
            im.f r3 = im.f.F()
            java.lang.String r6 = "sharedInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
        Ld:
            r5 = r5 & 8
            if (r5 == 0) goto L13
            wi.a r4 = wi.a.f34341a
        L13:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yj.a0.<init>(j.b, int, im.f, wi.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
