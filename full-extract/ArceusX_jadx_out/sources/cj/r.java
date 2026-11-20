package cj;

import androidx.annotation.NonNull;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public ci.f f5001a;
    public ti.g b = ti.g.b();

    public class a implements ci.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f5002a;

        public a(c cVar) {
            this.f5002a = cVar;
        }

        @Override // ci.l
        public void a(ci.j jVar) {
        }

        @Override // ci.l
        public void b(ci.j jVar) {
            b bVar;
            String a10 = jVar.a();
            ek.q.h("rbx.purchaseflow", "Verify Purchase callback. response code " + jVar.b() + " responseBody = " + a10 + ".");
            int b = jVar.b();
            if (b == 200) {
                ek.q.h("rbx.purchaseflow", "Verification success");
                bVar = b.OK;
                r.this.b.L();
            } else if (b == 500) {
                ek.q.e("rbx.purchaseflow", "Server error");
                bVar = b.UNKNOWN;
                r.this.b.O();
            } else if (b == 400) {
                ek.q.e("rbx.purchaseflow", "Service was unable to validate receiptId.");
                bVar = b.ERROR;
                r.this.b.M();
            } else if (b != 401) {
                ek.q.e("rbx.purchaseflow", "Unknown");
                bVar = b.UNKNOWN;
                r.this.b.P();
            } else {
                ek.q.e("rbx.purchaseflow", "Unauthorized to make request.");
                bVar = b.BOGUS;
                r.this.b.N();
            }
            PurchaseVerificationResponse a11 = fj.a.a(a10);
            c cVar = this.f5002a;
            if (cVar != null) {
                cVar.a(bVar, a11);
            }
        }
    }

    public enum b {
        OK,
        ERROR,
        BOGUS,
        EMPTY_RESPONSE,
        UNKNOWN
    }

    public interface c {
        void a(b bVar, PurchaseVerificationResponse purchaseVerificationResponse);
    }

    public r(@NonNull ci.f fVar) {
        this.f5001a = fVar;
    }

    public void b(String str, ei.a aVar, c cVar) {
        this.f5001a.a(str, aVar, null, new a(cVar)).b();
        this.b.K();
    }
}
