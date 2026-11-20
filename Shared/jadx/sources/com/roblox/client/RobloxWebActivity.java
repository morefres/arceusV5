package com.roblox.client;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.f;
import android.view.s;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.h;
import com.roblox.client.c;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.engine.jni.NativeGLInterface;
import ek.q;
import ev.j;
import oh.g;
import org.greenrobot.eventbus.ThreadMode;
import rg.a1;
import rg.g0;
import rg.l0;
import rg.m0;
import rg.n0;
import rg.q0;
import rg.y;
import ti.e;
import ug.c0;

/* loaded from: classes2.dex */
public class RobloxWebActivity extends com.roblox.client.a implements e.InterfaceC0582e {
    public int S;
    public int T;
    public Toolbar U;
    public b V = new b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RobloxWebActivity.this.finish();
            RobloxWebActivity robloxWebActivity = RobloxWebActivity.this;
            robloxWebActivity.overridePendingTransition(robloxWebActivity.S, robloxWebActivity.T);
        }
    }

    public static class b implements f {
        @Override // android.view.f
        public void onCreate(@NonNull s sVar) {
            q.b("RobloxActivity", "onFragmentCreated");
            mk.a aVar = new mk.a(false);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24587a, aVar.b, aVar.f24588c);
        }

        @Override // android.view.f
        public void onDestroy(@NonNull s sVar) {
            q.b("RobloxActivity", "onFragmentDestroyed");
            mk.a aVar = new mk.a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24587a, aVar.b, aVar.f24588c);
        }
    }

    @Override // ti.e.InterfaceC0582e
    public void R(int i10, Bundle bundle) {
        if (i10 == 2) {
            q.h("RobloxActivity", "(RobloxWebActivity) handleNotification() Logout event...");
            Toast.makeText(this, q0.f30464h, 0).show();
            if (uj.c.a()) {
                ti.b.p();
            }
            X1(ti.b.g(bundle));
            return;
        }
        if (i10 != 101) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "LAUNCH_GAME");
        intent.putExtra("game_init_params", bundle.getBundle("game_init_params"));
        setResult(-1, intent);
        finish();
    }

    @Override // com.roblox.client.a, bk.e.b
    public void a0(ml.a aVar) {
        ((RobloxToolbar) this.U).a0(aVar);
        super.a0(aVar);
    }

    public final void i2(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    public final void j2(String str) {
        androidx.fragment.app.c n02 = l1().n0(c.class.getName());
        if (n02 instanceof c) {
            ((c) n02).q3(str);
        }
    }

    public void k2(long j10, long j11) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "CHAT_TAG");
        if (j10 != -1) {
            intent.putExtra("CONVERSATION_ID_EXTRA", j10);
        }
        if (j11 != -1) {
            intent.putExtra("USER_ID_EXTRA", j11);
        }
        if (j11 != -1 || j10 != -1) {
            setResult(-1, intent);
        }
        finish();
    }

    public final void l2() {
        androidx.fragment.app.c n02 = l1().n0(c.class.getName());
        if (n02 instanceof c) {
            ((c) n02).e();
        }
    }

    public c0.b m2() {
        return c0.b.f32710c;
    }

    @Override // e.p, android.app.Activity
    public void onBackPressed() {
        c cVar = (c) l1().n0(c.class.getName());
        if (cVar == null || !cVar.e3()) {
            super.onBackPressed();
            overridePendingTransition(this.S, this.T);
        }
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onCloseOverlayEvent(oh.d dVar) {
        finish();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        boolean z10;
        boolean z11;
        String str2;
        androidx.fragment.app.c cVar;
        super.onCreate(bundle);
        setContentView(n0.f30411f);
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("URL_EXTRA");
            str2 = intent.getStringExtra("TITLE_EXTRA");
            z10 = intent.getBooleanExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", false);
            z11 = intent.getBooleanExtra("USE_GENERIC_WEB_FRAG_EXTRA", false);
        } else {
            str = null;
            z10 = false;
            z11 = false;
            str2 = null;
        }
        if (str == null) {
            finish();
            return;
        }
        c0.w(m2(), str);
        this.U = (Toolbar) findViewById(m0.f30378m0);
        Bundle bundle2 = new Bundle();
        if (z11) {
            cVar = y.h().b();
            bundle2.putString("TITLE_STRING", str2);
            bundle2.putBoolean("HAS_PARENT", true);
            bundle2.putBoolean("HIDE_ACCESSORY_BUTTONS", intent.getBooleanExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false));
            bundle2.putString("SEARCH_PARAMS", intent.getStringExtra("SEARCH_PARAMS"));
            this.U.setVisibility(8);
            this.S = 0;
            this.T = 0;
        } else {
            cVar = new c();
            Toolbar toolbar = this.U;
            if (str2 == null) {
                str2 = getString(q0.f30512x);
            }
            toolbar.setTitle(str2);
            Toolbar toolbar2 = this.U;
            if (toolbar2 instanceof RobloxToolbar) {
                ((RobloxToolbar) toolbar2).setIconDelegate(new RobloxToolbar.c());
            } else {
                toolbar2.setNavigationIcon(l0.f30333h);
            }
            this.U.setNavigationOnClickListener(new a());
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.S = 0;
                this.T = 0;
            } else {
                this.S = R.anim.fade_in;
                this.T = g0.f30295a;
            }
        }
        if (z10) {
            cVar.a().a(this.V);
        }
        h r8 = l1().r();
        bundle2.putString("DEFAULT_URL", str);
        bundle2.putBoolean("USING_LOGIN_WEB_URL", intent.getBooleanExtra("USING_LOGIN_WEB_URL", false));
        cVar.O1(bundle2);
        r8.b(m0.f30390s0, cVar, c.class.getName());
        r8.g();
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(oh.f fVar) {
        q.b("RobloxActivity", "RWF.onNavigateToConversationEvent() " + fVar.f27855a + " " + fVar.b);
        k2(fVar.f27855a, fVar.b);
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        if ("ABUSE_REPORT_TAG".equals(gVar.f27856a)) {
            rg.q.d(this, gVar.b, false);
        } else if ("FRIEND_FINDER_TAG".equals(gVar.f27856a) || "UNIVERSAL_FRIENDS_TAG".equals(gVar.f27856a)) {
            rg.q.g(this, a1.R(), getString(q0.C), "{\"searchType\":\"Players\"}");
        } else {
            i2(gVar.f27856a, gVar.b);
        }
    }

    @j
    public void onNavigateToLuaEvent(c.h hVar) {
        finish();
    }

    @j
    public void onPushNotificationRegistrationFailedEvent(oh.h hVar) {
        if (hVar.a().equals("PushNotificationRegistrationFailed")) {
            Toast.makeText(this, getString(q0.f30451c1), 0).show();
            l2();
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        e.c().b(this);
        ev.c.d().n(this);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        e.c().g(this);
        ev.c.d().p(this);
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @ev.j(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onWebSearchEvent(oh.k r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RWA.onWebSearchEvent() "
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RobloxActivity"
            ek.q.h(r1, r0)
            int r0 = r3.f27863a
            r1 = 1
            if (r0 == r1) goto L40
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L40
            r1 = 5
            if (r0 == r1) goto L2b
            r3 = 0
            goto L46
        L2b:
            java.lang.String r3 = r3.b
            java.lang.String r3 = rg.a1.I0(r3)
            goto L46
        L32:
            java.lang.String r3 = r3.b
            java.lang.String r3 = rg.a1.G0(r3)
            goto L46
        L39:
            java.lang.String r3 = r3.b
            java.lang.String r3 = rg.a1.H0(r3)
            goto L46
        L40:
            java.lang.String r3 = r3.b
            java.lang.String r3 = rg.a1.J0(r3)
        L46:
            if (r3 == 0) goto L4e
            rg.e2.h(r2)
            r2.j2(r3)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.RobloxWebActivity.onWebSearchEvent(oh.k):void");
    }
}
