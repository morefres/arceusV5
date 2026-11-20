package vi;

import android.os.Bundle;
import android.view.InterfaceC0703r;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import e4.q;
import ek.t;
import rg.a1;
import rg.k0;
import rg.l0;
import rg.m0;
import rg.o0;
import rg.r0;
import rg.t0;
import rg.x0;
import th.j;

/* loaded from: classes2.dex */
public class e extends vi.a {
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public bk.c f33435c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.f();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33437a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f33437a = iArr;
            try {
                iArr[ml.a.f24591d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33437a[ml.a.f24590c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33437a[ml.a.f24592e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(x0 x0Var, String str) {
        super(x0Var.p());
        this.b = str;
        this.f33435c = new bk.f();
    }

    public final int c(ml.a aVar) {
        return b.f33437a[aVar.ordinal()] != 1 ? r0.b : r0.f30524a;
    }

    public final int d(ml.a aVar) {
        return l0.f30350y;
    }

    public MenuItem e(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.b, menu);
        MenuItem findItem = menu.findItem(m0.b);
        View actionView = findItem.getActionView();
        actionView.setOnClickListener(new a());
        ((ImageView) actionView.findViewById(m0.H)).setImageResource(d(this.f33435c.getTheme()));
        return findItem;
    }

    public void f() {
        g(null);
    }

    public void g(InterfaceC0703r interfaceC0703r) {
        String F0;
        int b10;
        if (a()) {
            q qVar = this.f33424a;
            if (qVar == null || qVar.isFinishing() || this.f33424a.l1().U0()) {
                ti.g.b().q("robux_menuoption_attempt_after_state_save");
                return;
            }
            if (t.j() && rh.h.a().i()) {
                b10 = this.f33424a.getResources().getDimensionPixelSize(k0.f30324f);
                F0 = "";
            } else if (rh.h.a().F0()) {
                F0 = h.a();
                b10 = b();
            } else {
                F0 = a1.F0();
                b10 = b();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("showRobux", true);
            if (rh.h.a().F0()) {
                bundle.putBoolean("hideNativeHeader", true);
            }
            if (this.f33424a.findViewById(m0.f30371j) == null) {
                ti.g.b().q("robux_menuoption_no_container_for_purchase");
            }
            FragmentManager l12 = this.f33424a.l1();
            if (this.f33424a.findViewById(m0.f30371j) != null) {
                j jVar = new j();
                jVar.O1(bundle);
                jVar.T2(F0);
                if (interfaceC0703r != null) {
                    jVar.a().a(interfaceC0703r);
                }
                if (l12.U0()) {
                    ti.g.b().q("robux_menuoption_committed_after_state_save");
                    ek.q.e("RobuxMenuOption", "State has already been saved. Attempting to show premium fragment, allowing state loss.");
                }
                l12.r().f("robuxPurchase").b(m0.f30371j, jVar, "dialog").h();
            } else {
                bundle.putInt("dialogHeight", b10);
                th.g gVar = new th.g();
                gVar.O1(bundle);
                gVar.q3(F0);
                gVar.r2(1, c(this.f33435c.getTheme()));
                if (interfaceC0703r != null) {
                    gVar.a().a(interfaceC0703r);
                }
                if (l12.U0()) {
                    ti.g.b().q("robux_menuoption_not_shown_after_state_save");
                    ek.q.e("RobuxMenuOption", "State has already been saved. Do not show premium dialog fragment.");
                } else {
                    gVar.t2(l12, "dialog");
                }
            }
            t0.e("nativeMain", "robux", this.b);
        }
    }
}
