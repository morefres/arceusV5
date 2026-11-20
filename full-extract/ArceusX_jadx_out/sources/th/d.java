package th;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.components.RobloxToolbar;
import ek.q;
import java.net.URI;
import oi.h;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import rg.m0;
import rg.n0;
import rg.q0;
import ug.c0;

/* loaded from: classes2.dex */
public class d extends com.roblox.client.c {
    public vi.f A1;
    public vi.i B1;
    public ProgressDialog C1;

    /* renamed from: j1, reason: collision with root package name */
    public String f32190j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f32191k1;

    /* renamed from: n1, reason: collision with root package name */
    public JSONObject f32194n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f32195o1;

    /* renamed from: p1, reason: collision with root package name */
    public RobloxToolbar f32196p1;

    /* renamed from: q1, reason: collision with root package name */
    public ImageView f32197q1;

    /* renamed from: r1, reason: collision with root package name */
    public RobloxToolbar.c f32198r1;

    /* renamed from: s1, reason: collision with root package name */
    public vi.d f32199s1;

    /* renamed from: t1, reason: collision with root package name */
    public Menu f32200t1;

    /* renamed from: g1, reason: collision with root package name */
    public String f32187g1 = null;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f32188h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    public int f32189i1 = -1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f32192l1 = false;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f32193m1 = false;

    /* renamed from: u1, reason: collision with root package name */
    public boolean f32201u1 = false;

    /* renamed from: v1, reason: collision with root package name */
    public boolean f32202v1 = false;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f32203w1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f32204x1 = true;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f32205y1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public View f32206z1 = null;

    public class a implements h.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f32207a;

        public a(Activity activity) {
            this.f32207a = activity;
        }

        @Override // oi.h.c
        public void a(boolean z10) {
            q.i("rbx.locale", "onAppLanguageChangeEvent(), Api call to get locale values");
            Activity activity = this.f32207a;
            if (activity == null || !activity.isFinishing()) {
                d.this.O3();
                if (z10) {
                    this.f32207a.recreate();
                    Activity activity2 = this.f32207a;
                    if (activity2 instanceof ActivityNativeMain) {
                        return;
                    }
                    activity2.finish();
                }
            }
        }
    }

    @Override // com.roblox.client.c
    public void D3(boolean z10) {
        super.D3(z10);
        View view = this.f32206z1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        Bundle t8 = t();
        if (t8 != null) {
            this.f32189i1 = t8.getInt("TITLE_ID", -1);
            this.f32190j1 = t8.getString("TITLE_STRING");
            this.f32187g1 = t8.getString("REPORTING_TAB_NAME");
            this.f32188h1 = t8.getBoolean("HAS_PARENT");
            this.f32192l1 = t8.getBoolean("HIDE_ACCESSORY_BUTTONS");
            this.f32191k1 = t8.getBoolean("SHOW_DOMAIN_AS_TITLE");
            this.f32195o1 = t8.getBoolean("CLOSE_FRAGMENT_ON_RESTORED");
            this.f32193m1 = t8.getBoolean("hideNativeHeader", false);
            boolean z10 = t8.getBoolean("BACK_NAVIGATION_DISABLED", true);
            this.f32204x1 = z10;
            if (z10) {
                this.f32201u1 = false;
                A3(true);
            }
            try {
                this.f32194n1 = new JSONObject(t8.getString("SEARCH_PARAMS", null));
            } catch (NullPointerException | JSONException unused) {
            }
        }
        if (bundle != null && this.f32195o1) {
            q.h("rbx.web", "onCreate: ... Closing this web fragment on restored.");
            e4.q p8 = p();
            if (p8 != null) {
                p8.l1().r().m(this).h();
            }
        }
        if (this.f32194n1 == null) {
            this.f32194n1 = new JSONObject();
        }
    }

    @Override // com.roblox.client.c
    public void H3(ll.a aVar) {
        super.H3(aVar);
        String str = aVar.b;
        if (str != null) {
            this.f32196p1.setTitle(str);
        }
    }

    @Override // com.roblox.client.c
    public c0.b I3() {
        return c0.b.f32719l;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(n0.E, viewGroup, false);
        this.f32198r1 = new RobloxToolbar.c();
        RobloxToolbar robloxToolbar = (RobloxToolbar) linearLayout.findViewById(m0.f30380n0);
        this.f32196p1 = robloxToolbar;
        if (this.f32193m1) {
            robloxToolbar.setVisibility(8);
        } else {
            robloxToolbar.h0(new View.OnClickListener() { // from class: th.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.this.Q3(view);
                }
            });
            this.f32196p1.setCloseButtonGravity(8388627);
        }
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(m0.f30367h);
        frameLayout.addView(super.J0(layoutInflater, frameLayout, bundle));
        if (this.f32193m1) {
            ImageView imageView = (ImageView) linearLayout.findViewById(m0.D);
            this.f32197q1 = imageView;
            imageView.setVisibility(0);
            this.f32197q1.setImageResource(this.f32198r1.a(dk.c.c().g()));
            this.f32197q1.setOnClickListener(new View.OnClickListener() { // from class: th.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.this.R3(view);
                }
            });
        }
        X3(this.f32196p1.getMenu(), H1().getMenuInflater());
        this.f32206z1 = linearLayout;
        if (!this.X0) {
            D3(false);
        }
        return linearLayout;
    }

    @Override // com.roblox.client.c, e4.k, androidx.fragment.app.c
    public void M0() {
        O3();
        super.M0();
    }

    public final ProgressDialog N3(Context context, String str) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle((CharSequence) null);
        progressDialog.setMessage(str);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    public final void O3() {
        ProgressDialog progressDialog = this.C1;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.C1.dismiss();
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public void P0(boolean z10) {
        if (!z10) {
            this.f32205y1 = false;
        }
        super.P0(z10);
        if (z10) {
            return;
        }
        Z3();
    }

    public void P3(Menu menu, MenuInflater menuInflater) {
        vi.d dVar = new vi.d(this);
        this.f32199s1 = dVar;
        dVar.d(menu, menuInflater);
    }

    public final /* synthetic */ void Q3(View view) {
        U3(c0.a.b);
    }

    public final /* synthetic */ void R3(View view) {
        U3(c0.a.b);
    }

    public final /* synthetic */ void S3(View view) {
        boolean e32 = !this.f32204x1 ? e3() : false;
        e4.q p8 = p();
        if (e32 || p8 == null) {
            return;
        }
        p8.onBackPressed();
    }

    public void T3(Activity activity, oi.h hVar, h.c cVar) {
        hVar.b(activity, true, cVar);
    }

    public void U3(c0.a aVar) {
        if (!this.f32205y1) {
            this.f32205y1 = true;
            c0.q(aVar);
        }
        e4.q p8 = p();
        if (p8 != null) {
            p8.onBackPressed();
        }
    }

    public void V3(String str) {
        if (this.f32203w1) {
            return;
        }
        this.f32203w1 = true;
        c0.r(str);
    }

    public final void W3(String str) {
        String str2 = "";
        try {
            URI uri = new URI(str);
            boolean equalsIgnoreCase = uri.getScheme().equalsIgnoreCase("https");
            String host = uri.getHost();
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(equalsIgnoreCase ? "🔒 " : "");
            sb2.append(host);
            str2 = sb2.toString();
        } catch (Exception e10) {
            q.f("rbx.web", "Failed to parse domain for title", e10);
        }
        this.f32196p1.setTitle(str2);
    }

    public void X3(Menu menu, MenuInflater menuInflater) {
        this.f32200t1 = menu;
        if (this.f32192l1) {
            if (this.f32194n1.length() > 0) {
                Y3(menu, menuInflater, 54);
            }
        } else {
            Y3(menu, menuInflater, 34);
            new vi.e(this, this.f32187g1).e(menu, menuInflater);
            P3(menu, menuInflater);
        }
    }

    public void Y3(Menu menu, MenuInflater menuInflater, int i10) {
        String optString = this.f32194n1.optString("searchType", null);
        if (optString != null) {
            this.B1 = new vi.g(this, optString);
        }
        if (this.B1 == null) {
            this.B1 = new vi.i(this);
        }
        vi.f fVar = new vi.f(this);
        this.A1 = fVar;
        fVar.n(menu);
        this.A1.p(this.f32196p1);
        this.A1.o(this.B1);
        this.A1.k(menu, menuInflater);
        dh.h.a(this.f32196p1, w(), m0.f30357c, i10);
    }

    public final void Z3() {
        vi.d dVar = this.f32199s1;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // com.roblox.client.c, rg.x0, bk.e.b
    public void a0(ml.a aVar) {
        ImageView imageView;
        this.f32196p1.a0(aVar);
        if (this.f32193m1 && (imageView = this.f32197q1) != null) {
            imageView.setImageResource(this.f32198r1.a(aVar));
        }
        e4.q p8 = p();
        if (p8 != null) {
            Menu menu = this.f32196p1.getMenu();
            menu.clear();
            X3(menu, p8.getMenuInflater());
        }
        super.a0(aVar);
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public void a1() {
        super.a1();
        Z3();
        this.f32205y1 = false;
    }

    public final void a4(String str) {
        vi.i iVar;
        if (this.A1 == null || (iVar = this.B1) == null) {
            return;
        }
        iVar.f(str);
        this.A1.r();
    }

    public final void b4(boolean z10) {
        if (this.f32204x1 || this.f32201u1 == z10) {
            return;
        }
        this.f32201u1 = z10;
        this.f32196p1.setNavigationOnClickListener(z10 ? new View.OnClickListener() { // from class: th.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.this.S3(view);
            }
        } : null);
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        ev.c.d().n(this);
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        if (v0() && !this.f32205y1) {
            c0.q(c0.a.f32706d);
        }
        ev.c.d().p(this);
        super.d1();
    }

    @Override // com.roblox.client.c
    public boolean e3() {
        if (this.f32205y1) {
            return false;
        }
        return super.e3();
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onAppLocaleChangeEvent(oh.a aVar) {
        e4.q p8 = p();
        if (p8 != null) {
            ProgressDialog N3 = N3(p8, e0(q0.K));
            this.C1 = N3;
            N3.show();
            T3(p8, new oi.h(), new a(p8));
        }
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onUnreadNotificationCountEvent(oh.i iVar) {
        new StringBuilder().append("GWF.onUnreadNotificationCountEvent() ");
        throw null;
    }

    @Override // com.roblox.client.c
    public void t3(String str) {
        this.f32202v1 = false;
        if (this.f32191k1) {
            W3(str);
        }
        a4(str);
    }

    @Override // com.roblox.client.c
    public void u3() {
        this.f32202v1 = true;
    }

    @Override // com.roblox.client.c
    public void v3(String str) {
        if (this.f32202v1 || !x0()) {
            return;
        }
        V3(str);
    }

    @Override // com.roblox.client.c
    public void x3(WebView webView, int i10) {
        super.x3(webView, i10);
        b4(webView.canGoBack());
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        if (this.f32191k1) {
            return;
        }
        String str = this.f32190j1;
        if (str != null) {
            this.f32196p1.setTitle(str);
            return;
        }
        int i10 = this.f32189i1;
        if (i10 == -1) {
            this.f32196p1.setTitle(q0.f30512x);
        } else {
            this.f32196p1.setTitle(i10);
        }
    }
}
