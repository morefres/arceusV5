package vi;

import android.os.Bundle;
import android.view.InterfaceC0703r;
import rg.a1;
import rg.m0;
import rg.t0;
import rg.x0;
import th.j;

/* loaded from: classes2.dex */
public class b extends a {
    public String b;

    public b(x0 x0Var, String str) {
        super(x0Var.p());
        this.b = str;
    }

    public void c(InterfaceC0703r interfaceC0703r) {
        if (a()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("showPremium", true);
            if (this.f33424a.findViewById(m0.f30371j) == null) {
                ti.g.b().q("robux_buildsclub_no_container_for_purchase");
            }
            if (this.f33424a.findViewById(m0.f30371j) != null) {
                j jVar = new j();
                if (interfaceC0703r != null) {
                    jVar.a().a(interfaceC0703r);
                }
                jVar.O1(bundle);
                jVar.T2(a1.o());
                this.f33424a.l1().r().f("robuxPurchase").b(m0.f30371j, jVar, "dialog").g();
            } else {
                bundle.putInt("dialogHeight", b());
                th.g gVar = new th.g();
                if (interfaceC0703r != null) {
                    gVar.a().a(interfaceC0703r);
                }
                gVar.O1(bundle);
                gVar.q3(a1.o());
                gVar.r2(1, gVar.j2());
                gVar.t2(this.f33424a.l1(), "dialog");
            }
            t0.e("nativeMain", "buildersClub", this.b);
        }
    }
}
