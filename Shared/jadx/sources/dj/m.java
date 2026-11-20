package dj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import cj.r;
import com.android.billingclient.api.c;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.purchase.a;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams;
import dj.e;
import fj.ValidatePurchaseResponsePayload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import rg.a1;
import uh.s0;

/* loaded from: classes2.dex */
public class m implements cj.k {
    public static m E;
    public static List<String> G;
    public static List<String> I;
    public String A;
    public List<String> B;
    public a.f C;
    public v7.m D;

    /* renamed from: a, reason: collision with root package name */
    public h0 f14883a;
    public o b;

    /* renamed from: c, reason: collision with root package name */
    public o f14884c;

    /* renamed from: d, reason: collision with root package name */
    public o f14885d;

    /* renamed from: e, reason: collision with root package name */
    public Hashtable<String, com.android.billingclient.api.e> f14886e;

    /* renamed from: f, reason: collision with root package name */
    public Hashtable<String, com.android.billingclient.api.e> f14887f;

    /* renamed from: g, reason: collision with root package name */
    public Hashtable<String, v7.k> f14888g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14889h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f14890i;

    /* renamed from: j, reason: collision with root package name */
    public Activity f14891j;

    /* renamed from: k, reason: collision with root package name */
    public String f14892k;

    /* renamed from: l, reason: collision with root package name */
    public String f14893l;

    /* renamed from: m, reason: collision with root package name */
    public String f14894m;

    /* renamed from: n, reason: collision with root package name */
    public String f14895n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14896o;

    /* renamed from: p, reason: collision with root package name */
    public long f14897p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14898q;

    /* renamed from: r, reason: collision with root package name */
    public String f14899r;

    /* renamed from: s, reason: collision with root package name */
    public ti.g f14900s;

    /* renamed from: t, reason: collision with root package name */
    public ci.f f14901t;

    /* renamed from: u, reason: collision with root package name */
    public cj.o f14902u;

    /* renamed from: v, reason: collision with root package name */
    public final Hashtable<String, String> f14903v;

    /* renamed from: w, reason: collision with root package name */
    public String f14904w;

    /* renamed from: x, reason: collision with root package name */
    public String f14905x;

    /* renamed from: y, reason: collision with root package name */
    public String f14906y;

    /* renamed from: z, reason: collision with root package name */
    public String f14907z;
    public static List<String> F = new ArrayList(Arrays.asList("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", "com.roblox.robloxmobile.premium4500robux", "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", "com.roblox.robloxmobile.premium265subscribed", "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed"));
    public static List<String> H = new ArrayList(Arrays.asList("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200"));

    public class a implements v7.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14908a;

        public a(String str) {
            this.f14908a = str;
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            if (dVar.c() != 0) {
                ek.q.d("Failed QueryPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f14900s.l("QueryPurchases. ProductType: " + this.f14908a + ". ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public class b implements v7.l {
        public b() {
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            m.this.Q0(dVar, list);
        }
    }

    public class c implements v7.l {
        public c() {
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            if (dVar.c() != 0) {
                ek.q.e("rbx.purchaseflow", "Failed QueryInAppPurchases in grantPendingPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f14900s.l("QueryInAppPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public class d implements v7.l {
        public d() {
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            if (dVar.c() != 0) {
                ek.q.e("rbx.purchaseflow", "Failed QuerySubsPurchases in grantPendingPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f14900s.l("QuerySubsPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14912a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[r.b.values().length];
            b = iArr;
            try {
                iArr[r.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[r.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[r.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.e.values().length];
            f14912a = iArr2;
            try {
                iArr2[a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14912a[a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14912a[a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14912a[a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14912a[a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14912a[a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public class f implements v7.d {
        public f() {
        }

        @Override // v7.d
        public void a(com.android.billingclient.api.d dVar) {
            if (dVar.c() == 0) {
                ek.q.h("rbx.purchaseflow", "Google Billing Client is setup");
                m.this.b = o.READY;
            } else {
                ek.q.e("rbx.purchaseflow", "Google Billing Client is not setup");
                m.this.b = o.NONE;
            }
            if (rh.h.a().n3() && m.this.f14883a.e("fff").c() == 0) {
                if (m.this.f14883a.e("subscriptions").c() == 0) {
                    m.this.s1(null);
                }
                m.this.q1(null);
            }
        }

        @Override // v7.d
        public void b() {
            ek.q.h("rbx.purchaseflow", "Google Billing Client disconnected");
            m.this.b = o.NONE;
        }
    }

    public class g implements v7.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f14914a;

        public g(r rVar) {
            this.f14914a = rVar;
        }

        @Override // v7.j
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull v7.n nVar) {
            List<com.android.billingclient.api.e> a10 = nVar.a();
            if (dVar.c() == 0) {
                ek.q.b("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + a10.size());
                for (com.android.billingclient.api.e eVar : a10) {
                    if (eVar != m.this.f14886e.put(eVar.d(), eVar)) {
                        m.this.f14886e.remove(eVar.d());
                        m.this.f14886e.put(eVar.d(), eVar);
                    }
                }
                ek.q.b("rbx.purchaseflow", "queryInAppProduct Success. Count = " + m.this.f14886e.size());
                m.this.f14884c = o.READY;
            } else {
                ek.q.e("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + dVar);
                m.this.f14884c = o.NONE;
            }
            r rVar = this.f14914a;
            if (rVar != null) {
                rVar.a();
            }
        }
    }

    public class h implements v7.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f14915a;

        public h(r rVar) {
            this.f14915a = rVar;
        }

        @Override // v7.j
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull v7.n nVar) {
            List<com.android.billingclient.api.e> a10 = nVar.a();
            if (dVar.c() == 0) {
                ek.q.b("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + a10.size());
                for (com.android.billingclient.api.e eVar : a10) {
                    if (eVar != m.this.f14887f.put(eVar.d(), eVar)) {
                        m.this.f14887f.remove(eVar.d());
                        m.this.f14887f.put(eVar.d(), eVar);
                    }
                }
                ek.q.b("rbx.purchaseflow", "querySubsProduct Success. Count = " + m.this.f14887f.size());
                m.this.f14885d = o.READY;
            } else {
                ek.q.e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + dVar);
                m.this.f14885d = o.NONE;
            }
            r rVar = this.f14915a;
            if (rVar != null) {
                rVar.a();
            }
        }
    }

    public class i implements r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14916a;

        public i(String str) {
            this.f14916a = str;
        }

        @Override // dj.m.r
        public void a() {
            m mVar = m.this;
            com.android.billingclient.api.e J0 = mVar.J0(this.f14916a, mVar.f14896o);
            m mVar2 = m.this;
            if (mVar2.a1(this.f14916a, J0, mVar2.f14896o)) {
                m mVar3 = m.this;
                mVar3.f14894m = mVar3.M0(J0, mVar3.f14896o);
                m.this.f14900s.h0(new cj.m(m.this.f14895n, this.f14916a, false));
                m.this.D0();
            }
        }
    }

    public class j implements a.f {
        public j() {
        }

        @Override // com.roblox.client.purchase.a.f
        public void a(a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            m.this.f14900s.l("ValidationCheck: " + eVar + ".");
            switch (e.f14912a[eVar.ordinal()]) {
                case 1:
                    m.this.E0(validatePurchaseResponsePayload);
                    break;
                case 2:
                    m.this.F1();
                    m.this.l1(str, e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    m.this.I1();
                    m.this.l1(str, e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    m.this.G1();
                    m.this.l1(str, e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    m.this.G1();
                    m.this.l1(str, e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    m.this.E1();
                    m.this.l1(str, e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    m.this.J1();
                    m.this.l1(str, e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    public class k implements v7.m {
        public k() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
        @Override // v7.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.android.billingclient.api.d r9, java.util.List<v7.k> r10) {
            /*
                Method dump skipped, instructions count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dj.m.k.a(com.android.billingclient.api.d, java.util.List):void");
        }
    }

    public class l implements r.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v7.k f14919a;

        public l(v7.k kVar) {
            this.f14919a = kVar;
        }

        @Override // cj.r.c
        public void a(r.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
            m.this.f14900s.l("VerifyPurchase. Response=" + bVar + ".ReceiptId=" + this.f14919a.b());
            if (m.this.f14902u != null) {
                m.this.f14902u.e();
            }
            if (bVar != r.b.OK && !this.f14919a.i()) {
                m.this.O1();
            }
            int i10 = e.b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    m.this.R1();
                    m mVar = m.this;
                    mVar.l1(mVar.v0(this.f14919a), e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                    return;
                } else if (i10 != 3) {
                    m.this.S1();
                    m mVar2 = m.this;
                    mVar2.l1(mVar2.v0(this.f14919a), e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                    return;
                } else {
                    m.this.Q1();
                    m mVar3 = m.this;
                    mVar3.l1(mVar3.v0(this.f14919a), e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                    return;
                }
            }
            String v02 = m.this.v0(this.f14919a);
            if (m.this.Y0(this.f14919a)) {
                ek.q.h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
                if (m.this.V0(v02)) {
                    dk.c.c().t(dk.c.c().f() + cj.p.e(v02));
                }
                boolean Y0 = m.this.Y0(this.f14919a);
                com.android.billingclient.api.e J0 = m.this.J0(v02, Y0);
                if (m.this.b1(v02, J0, Y0, false)) {
                    m.this.f14900s.m(v02, m.K0(J0, Y0), m.this.M0(J0, Y0), m.L0(J0, Y0));
                } else {
                    ek.q.h("rbx.purchaseflow", "Unable to find skuDetails: " + v02);
                }
            }
            m.this.x0(this.f14919a, purchaseVerificationResponse);
        }
    }

    /* renamed from: dj.m$m, reason: collision with other inner class name */
    public class C0287m implements v7.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v7.k f14920a;
        public final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PurchaseVerificationResponse f14921c;

        public C0287m(v7.k kVar, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse) {
            this.f14920a = kVar;
            this.b = z10;
            this.f14921c = purchaseVerificationResponse;
        }

        @Override // v7.c
        public void a(com.android.billingclient.api.d dVar) {
            int c10 = dVar.c();
            boolean z10 = c10 == 0;
            m.this.f14900s.l("OnAcknowledgePurchaseResponse. Success: " + z10 + ". Message: " + dVar.toString() + ".");
            boolean z11 = dj.b.i(this.f14920a) != null;
            if (z11) {
                m.this.f14900s.q("Android-Purchase-Completed-With-Checkout-Session-Id");
            }
            if (z10) {
                if (this.b) {
                    m.this.f14900s.q("Play-Points-Ack-Purchase-Succeed");
                }
                m.this.z0(this.f14920a, e.b.SUCCESS, n0.b(this.f14921c));
                return;
            }
            if (this.b) {
                m.this.f14900s.q("Play-Points-Ack-Purchase-Fail");
            }
            ek.q.k("rbx.purchaseflow", "Failed to acknowledge Purchase");
            m.this.u1();
            if (z11) {
                m.this.P0(this.f14920a, c10);
            }
        }
    }

    public class n implements v7.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14923a;
        public final /* synthetic */ v7.k b;

        public n(String str, v7.k kVar) {
            this.f14923a = str;
            this.b = kVar;
        }

        @Override // v7.f
        public void a(com.android.billingclient.api.d dVar, String str) {
            boolean z10 = dVar.c() == 0;
            m.this.f14900s.l("OnConsumeResponse. Success: " + z10 + ". Message: " + dVar.toString() + ".");
            if (z10) {
                if (e0.m(this.f14923a)) {
                    m.this.f14900s.q("Play-Points-Consume-Purchase-Succeed");
                }
                m.this.k1(this.f14923a, e.b.SUCCESS);
                com.android.billingclient.api.e J0 = m.this.J0(this.f14923a, false);
                if (m.this.b1(this.f14923a, J0, false, false)) {
                    m.this.f14900s.m(this.f14923a, m.K0(J0, false), m.this.M0(J0, false), m.L0(J0, false));
                } else {
                    ek.q.h("rbx.purchaseflow", "Unable to find skuDetails: " + this.f14923a);
                }
                String e10 = j0.e(this.b);
                if (m.this.f14888g.containsKey(e10)) {
                    m.this.f14888g.remove(e10);
                }
            } else {
                if (e0.m(this.f14923a)) {
                    m.this.f14900s.q("Play-Points-Consume-Purchase-Fail");
                }
                m.this.v1();
                m mVar = m.this;
                mVar.l1(mVar.v0(this.b), e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
            }
            ek.q.h("rbx.purchaseflow", "End consume flow.");
        }
    }

    public enum o {
        NONE,
        CONNECTING,
        READY
    }

    public class p {

        /* renamed from: a, reason: collision with root package name */
        public String f14928a;
        public String b;

        public p(String str, String str2) {
            this.f14928a = str;
            this.b = str2;
        }

        @NonNull
        public String toString() {
            return "{ productType: " + this.b + ", providerProductId: " + this.f14928a + " }";
        }
    }

    public interface q {
        void a(List<com.android.billingclient.api.e> list);
    }

    public interface r {
        void a();
    }

    public m(h0 h0Var, ci.f fVar, ti.g gVar) {
        o oVar = o.NONE;
        this.b = oVar;
        this.f14884c = oVar;
        this.f14885d = oVar;
        this.f14886e = new Hashtable<>();
        this.f14887f = new Hashtable<>();
        this.f14888g = new Hashtable<>();
        this.f14889h = false;
        this.f14890i = null;
        this.f14892k = null;
        this.f14893l = null;
        this.f14894m = null;
        this.f14895n = "";
        this.f14897p = 0L;
        this.f14898q = true;
        this.f14899r = null;
        this.f14903v = new Hashtable<>();
        this.f14905x = null;
        this.f14906y = null;
        this.f14907z = null;
        this.A = null;
        this.B = null;
        this.C = new j();
        this.D = new k();
        this.f14883a = h0Var;
        this.f14901t = fVar;
        this.f14900s = gVar;
    }

    public static m F0(Context context) {
        if (E == null) {
            E = new m(new dj.b(), new ci.h(), ti.g.b());
            E.U1(com.android.billingclient.api.a.f(context).c(E.D).b(v7.i.c().b().c().a()).a());
            E.T1(new b0(context));
        }
        return E;
    }

    public static List<String> G0() {
        String O3 = rh.h.a().O3();
        if (O3.isEmpty()) {
            return F;
        }
        if (G == null) {
            G = Arrays.asList(O3.split(","));
        }
        return G;
    }

    public static String K0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<e.C0119e> f10 = eVar.f();
            Objects.requireNonNull(f10);
            return f10.get(0).c().a().get(0).a();
        }
        e.b b10 = eVar.b();
        Objects.requireNonNull(b10);
        return b10.a();
    }

    public static long L0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<e.C0119e> f10 = eVar.f();
            Objects.requireNonNull(f10);
            return f10.get(0).c().a().get(0).b();
        }
        e.b b10 = eVar.b();
        Objects.requireNonNull(b10);
        return b10.c();
    }

    public static List<String> N0() {
        String H0 = rh.h.a().H0();
        if (H0.isEmpty()) {
            return H;
        }
        if (I == null) {
            I = Arrays.asList(H0.split(","));
        }
        return I;
    }

    private boolean T0() {
        return this.f14888g.size() > 0;
    }

    public void A0(long j10, String str, boolean z10) {
        this.f14897p = j10;
        B0(str, z10);
    }

    public final void A1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.x();
    }

    public void B0(String str, boolean z10) {
        this.f14895n = str;
        ek.q.b("rbx.purchaseflow", "attemptGrantPendingPurchases isAppResume:" + z10);
        if (!X0()) {
            ek.q.b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (U0()) {
            ek.q.b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            O0();
            return;
        }
        if (!T0()) {
            if (this.f14889h) {
                return;
            }
            O0();
            this.f14889h = true;
            return;
        }
        ek.q.b("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f14888g.size());
        O0();
    }

    public final void B1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.q("Payments-Protocol-Query-Product-Details-Failed");
    }

    public final void C0(v7.k kVar) {
        String v02 = v0(kVar);
        if (rh.h.a().s0() || !e0.l(v02)) {
            ek.q.h("rbx.purchaseflow", "Consuming Purchase");
            this.f14883a.c(v7.e.b().b(kVar.g()).a(), new n(v02, kVar));
        } else if (e0.m(v02)) {
            this.f14900s.q("Play-Points-Not-Consume-Purchase");
        }
    }

    public final void C1(boolean z10) {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.Q(z10);
    }

    public final void D0() {
        cj.o oVar = this.f14902u;
        if (oVar != null) {
            oVar.d();
        }
        com.roblox.client.purchase.a aVar = new com.roblox.client.purchase.a(this.f14901t);
        String str = this.f14899r;
        String str2 = (str == null || str.isEmpty()) ? null : this.f14899r;
        if (this.f14898q) {
            aVar.e(a1.c1(), this.f14892k, this.f14894m, str2, this.C);
        } else {
            aVar.c(a1.c1(), this.f14892k, this.f14894m, str2, this.C);
        }
    }

    public final void D1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.R();
    }

    public final void E0(ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        String b10;
        cj.o oVar = this.f14902u;
        if (oVar != null) {
            oVar.e();
        }
        this.f14900s.l("PurchaseStarted.");
        com.android.billingclient.api.e J0 = J0(this.f14892k, this.f14896o);
        if (a1(this.f14892k, J0, this.f14896o)) {
            ArrayList arrayList = new ArrayList();
            if (this.f14896o) {
                if (rh.h.a().W3()) {
                    b10 = w0(J0);
                    if (b10 == null) {
                        l1(this.f14892k, e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + this.f14892k);
                        return;
                    }
                } else {
                    b10 = J0.f().get(0).b();
                }
                arrayList.add(c.b.b().c(J0).b(b10).a());
            } else {
                arrayList.add(c.b.b().c(J0).a());
            }
            c.a d10 = com.android.billingclient.api.c.b().b((validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getUserId() == null || validatePurchaseResponsePayload.getUserId().longValue() <= 0) ? this.f14895n : String.valueOf(validatePurchaseResponsePayload.getUserId())).d(arrayList);
            String str = this.f14904w;
            if (str != null) {
                d10.c(str);
                this.f14900s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
                ek.q.k("rbx.purchaseflow", "Both mCurrentChargeRequestId and mCurrentCheckoutSessionId is null.");
                this.f14900s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
            } else {
                d10.c(validatePurchaseResponsePayload.getCheckoutSessionId());
                this.f14900s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
            }
            com.android.billingclient.api.c a10 = d10.a();
            if (this.f14891j.getIntent() == null) {
                this.f14891j.setIntent(new Intent());
            }
            if (this.f14883a.h(this.f14891j, a10).c() != 0) {
                l1(this.f14892k, e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
            }
        }
    }

    public final void E1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.S(this.f14898q, false);
    }

    public final void F1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.T(this.f14898q, false);
    }

    public final void G1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.a0(this.f14898q, false);
    }

    public final String H0(List<v7.k> list) {
        Iterator<v7.k> it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + v0(it.next()) + "; ";
        }
        return str;
    }

    public final void H1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.U(this.f14898q, false);
    }

    public final String I0(v7.k kVar) {
        try {
            Long.parseLong(kVar.a().b());
            return kVar.a().b();
        } catch (Exception unused) {
            ek.q.k("rbx.purchaseflow", "PaymentsProtocol: purchase.getAccountIdentifiers().getObfuscatedProfileId() did not return an integer and is not a valid checkoutSessionId.");
            return "";
        }
    }

    public final void I1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.V(this.f14898q, false);
    }

    public final com.android.billingclient.api.e J0(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (z10 && this.f14887f.containsKey(str)) {
            return this.f14887f.get(str);
        }
        if (!z10 && this.f14886e.containsKey(str)) {
            return this.f14886e.get(str);
        }
        ek.q.e("rbx.purchaseflow", "Unable to get product details for productId: " + str);
        return null;
    }

    public final void J1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.W(this.f14898q, false);
    }

    public final void K1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.X(this.f14898q, false);
    }

    public final void L1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.Y(this.f14898q, false);
    }

    public final String M0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<e.C0119e> f10 = eVar.f();
            Objects.requireNonNull(f10);
            return f10.get(0).c().a().get(0).c();
        }
        e.b b10 = eVar.b();
        Objects.requireNonNull(b10);
        return b10.d();
    }

    public final void M1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.Z(this.f14898q, false);
    }

    public final void N1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.b0(this.f14898q, false);
    }

    public final void O0() {
        ek.q.h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (!rh.h.a().D()) {
            r1("inapp");
            r1("subs");
        } else if (W0()) {
            v7.o a10 = v7.o.b().b("inapp").a();
            v7.o a11 = v7.o.b().b("subs").a();
            C1(false);
            this.f14883a.g(a10, new c());
            C1(true);
            this.f14883a.g(a11, new d());
        }
    }

    public final void O1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.c0();
    }

    public final void P0(v7.k kVar, int i10) {
        ek.q.h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.f14900s.q("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        String e10 = j0.e(kVar);
        if (this.f14888g.containsKey(e10)) {
            this.f14888g.remove(e10);
        }
        String v02 = v0(kVar);
        if (!Y0(kVar)) {
            com.android.billingclient.api.e J0 = J0(v02, false);
            if (b1(v02, J0, false, false)) {
                this.f14900s.m(v02, K0(J0, false), M0(J0, false), L0(J0, false));
            } else {
                ek.q.h("rbx.purchaseflow", "Unable to find skuDetails: " + v02);
            }
        }
        k1(v02, e.b.SUCCESS);
    }

    public final void P1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.d0();
    }

    public final void Q0(com.android.billingclient.api.d dVar, List<v7.k> list) {
        int c10 = dVar.c();
        if (c10 != 0) {
            ek.q.a("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        for (v7.k kVar : list) {
            int f10 = kVar.f();
            if (f10 == 0) {
                P1();
            } else if (f10 == 1) {
                ek.q.b("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases for purchase " + kVar);
                IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(kVar.g(), kVar.d());
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(v0(kVar), c10, rh.h.a().d2() ? I0(kVar) : kVar.a().a());
            } else if (f10 == 2) {
                D1();
            }
        }
    }

    public final void Q1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.e0(this.f14898q, false);
    }

    public final void R0(List<v7.k> list, final boolean z10) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (v7.k kVar : list) {
            String v02 = v0(kVar);
            boolean Y0 = Y0(kVar);
            if (J0(v02, Y0) != null) {
                S0(kVar, z10);
            } else {
                if (Y0) {
                    arrayList2.add(new p(v02, "subs"));
                } else {
                    arrayList.add(new p(v02, "inapp"));
                }
                hashtable.put(v02, kVar);
            }
        }
        q qVar = new q() { // from class: dj.i
            @Override // dj.m.q
            public final void a(List list2) {
                m.this.c1(hashtable, z10, list2);
            }
        };
        if (!arrayList.isEmpty()) {
            p1(arrayList, qVar);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        p1(arrayList2, qVar);
    }

    public final void R1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.f0(this.f14898q, false);
    }

    public final void S0(v7.k kVar, boolean z10) {
        ek.q.h("rbx.purchaseflow", "Handle single purchase. Product id: " + v0(kVar) + ". Order id: " + kVar.b() + ". isAcknowledged: " + kVar.i());
        int f10 = kVar.f();
        if (f10 == 0) {
            P1();
        } else if (f10 == 2) {
            D1();
        }
        if (kVar.f() != 1) {
            return;
        }
        this.f14888g.put(j0.e(kVar), kVar);
        if (!e0.m(v0(kVar))) {
            v7.a a10 = kVar.a();
            String a11 = a10.a();
            String b10 = a10.b();
            String str = this.f14895n;
            if (str == null || !str.equals(a11)) {
                long j10 = this.f14897p;
                if ((j10 <= 0 || !Long.toString(j10).equals(a11)) && (b10 == null || b10.equals(""))) {
                    w1();
                    if (rh.h.a().I0()) {
                        String str2 = this.f14895n;
                        if (str2 == null) {
                            A1();
                        } else if (!str2.equals(a11)) {
                            z1();
                        }
                        long j11 = this.f14897p;
                        if (j11 <= 0) {
                            x1();
                            return;
                        } else {
                            if (Long.toString(j11).equals(a11)) {
                                return;
                            }
                            y1();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        W1(kVar, j0.e(kVar), z10);
    }

    public final void S1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.g0(this.f14898q, false);
    }

    public void T1(b0 b0Var) {
        this.f14890i = b0Var;
    }

    public boolean U0() {
        return this.f14892k != null;
    }

    public void U1(com.android.billingclient.api.a aVar) {
        o oVar = this.b;
        if (oVar == o.READY) {
            ek.q.h("rbx.purchaseflow", "Google Billing Client is already setup");
            return;
        }
        o oVar2 = o.CONNECTING;
        if (oVar == oVar2) {
            ek.q.h("rbx.purchaseflow", "Google Billing Client is already connecting");
            return;
        }
        this.f14883a.f(aVar);
        this.b = oVar2;
        ek.q.h("rbx.purchaseflow", "Connecting Google Billing's Client");
        this.f14883a.b(new f());
    }

    public final boolean V0(String str) {
        return N0().contains(str);
    }

    public final boolean V1(String str, String str2, Activity activity, long j10, cj.o oVar, boolean z10) {
        ek.q.h("rbx.purchaseflow", "startPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + "isInApp: " + this.f14898q);
        this.f14895n = str;
        if (!W0()) {
            return false;
        }
        this.f14902u = oVar;
        this.f14897p = j10;
        this.f14892k = str2;
        this.f14891j = activity;
        this.f14896o = V0(str2);
        i iVar = new i(str2);
        if (this.f14896o) {
            s1(iVar);
            return true;
        }
        q1(iVar);
        return true;
    }

    public boolean W0() {
        return !this.f14895n.isEmpty() && X0();
    }

    public final void W1(v7.k kVar, String str, boolean z10) {
        boolean m10 = e0.m(v0(kVar));
        b0 b0Var = this.f14890i;
        boolean z11 = b0Var != null && b0Var.c(str);
        if (!kVar.i() || (m10 && !z11)) {
            j1(kVar, z10);
        } else {
            z0(kVar, e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }

    public boolean X0() {
        h0 h0Var = this.f14883a;
        return h0Var != null && this.b == o.READY && h0Var.isReady();
    }

    public final boolean Y0(v7.k kVar) {
        String v02 = v0(kVar);
        return V0(v02) || !(G0().contains(v02) || e0.m(v02));
    }

    public final boolean Z0(String str) {
        String str2 = this.f14892k;
        if (str2 == null || str == null) {
            return false;
        }
        return str2.equals(str);
    }

    @Override // cj.k
    public boolean a(final String str, final long j10, final String str2, final String str3, final Activity activity) {
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase.");
        this.f14900s.l("PurchaseStarted.");
        final boolean V0 = V0(str);
        if (V0 && this.f14883a.e("subscriptions").c() != 0) {
            return false;
        }
        if (this.f14883a.e("fff").c() != 0) {
            H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f14897p = j10;
        this.f14895n = str2;
        this.f14892k = str;
        String str4 = V0 ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        arrayList.add(f.b.b().b(str).c(str4).a());
        this.f14883a.a(com.android.billingclient.api.f.a().b(arrayList).a(), new v7.j() { // from class: dj.f
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                m.this.g1(V0, j10, str2, str, activity, str3, dVar, nVar);
            }
        });
        return true;
    }

    public final boolean a1(String str, com.android.billingclient.api.e eVar, boolean z10) {
        return b1(str, eVar, z10, true);
    }

    @Override // cj.k
    public boolean b(String str, String str2, Activity activity, cj.o oVar, boolean z10, String str3) {
        this.f14898q = true;
        if (str3 != null) {
            this.f14899r = str3;
        }
        ek.q.h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + this.f14899r);
        return V1(str, str2, activity, 0L, oVar, z10);
    }

    public final boolean b1(String str, com.android.billingclient.api.e eVar, boolean z10, boolean z11) {
        if (eVar == null) {
            ek.q.h("rbx.purchaseflow", "Product details not found after query.");
            if (z11) {
                l1(str, e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            }
            return false;
        }
        if (z10 && eVar.f() == null) {
            if (z11) {
                l1(this.f14892k, e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
            }
            return false;
        }
        if (z10 || eVar.b() != null) {
            return true;
        }
        if (z11) {
            l1(this.f14892k, e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
        }
        return false;
    }

    @Override // cj.k
    public String c(String str) {
        boolean V0 = V0(str);
        this.f14896o = V0;
        com.android.billingclient.api.e J0 = J0(str, V0);
        return !a1(str, J0, this.f14896o) ? "" : M0(J0, this.f14896o);
    }

    public final /* synthetic */ void c1(Map map, boolean z10, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) it.next();
            if (eVar == null) {
                ek.q.e("rbx.purchaseflow", "Null product details in list");
            } else {
                String d10 = eVar.d();
                if (map.containsKey(d10)) {
                    S0((v7.k) map.get(d10), z10);
                } else {
                    ek.q.e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + d10);
                }
            }
        }
    }

    @Override // cj.k
    public boolean d(String str, String str2, Activity activity, cj.o oVar, boolean z10) {
        this.f14898q = true;
        return V1(str, str2, activity, 0L, oVar, z10);
    }

    public final /* synthetic */ void d1(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.f14900s.l("PaymentsProtocol: QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + H0(list));
        Q0(dVar, list);
    }

    public final /* synthetic */ void e1(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.f14900s.l("PaymentsProtocol: QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + H0(list));
        Q0(dVar, list);
    }

    @Override // cj.k
    public boolean f(final String str, final long j10, final String str2, final Activity activity, String str3) {
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string.");
        this.f14900s.l("PurchaseStarted.");
        final dj.c cVar = new dj.c(str3);
        if (cVar.c() && this.f14883a.e("subscriptions").c() != 0) {
            return false;
        }
        if (this.f14883a.e("fff").c() != 0) {
            H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f14897p = j10;
        this.f14895n = str2;
        this.f14892k = str;
        this.f14907z = cVar.f();
        this.A = cVar.g();
        this.f14905x = cVar.a();
        this.B = cVar.d();
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: " + this.f14907z + ", " + this.A);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(this.f14907z, this.A));
        p1(arrayList, new q() { // from class: dj.k
            @Override // dj.m.q
            public final void a(List list) {
                m.this.f1(cVar, j10, str2, str, activity, list);
            }
        });
        return true;
    }

    public final /* synthetic */ void f1(dj.c cVar, long j10, String str, String str2, Activity activity, List list) {
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: trying with dynamic query.");
        if (list == null || list.isEmpty()) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: dynamic query dynamicProductDetailsList is empty.");
            return;
        }
        this.f14896o = this.A.equals("subs");
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        if (!b1(this.f14907z, eVar, this.f14896o, false)) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: invalid dynamic productDetails.");
            return;
        }
        String M0 = M0(eVar, cVar.c());
        this.f14894m = M0;
        IAPPurchaseManager.nativeSetProviderCurrencyCode(M0);
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string opening billing.");
        n1(eVar, this.f14896o, j10, str, str2, activity, cVar.a(), "");
    }

    @Override // cj.k
    public boolean g(String str, long j10, long j11) {
        boolean z10;
        if (((int) j10) != 0) {
            M1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new dj.e(e.b.FAILED_PURCHASE_RESPONSE, this.f14892k));
            z10 = false;
        } else {
            N1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new dj.e(e.b.SUCCESS, this.f14892k));
            z10 = true;
        }
        if (rh.h.a().r1()) {
            String str2 = this.f14906y;
            if (str2 == null) {
                str2 = "";
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j11, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j11, str);
        }
        return true;
    }

    public final /* synthetic */ void g1(boolean z10, long j10, String str, String str2, Activity activity, String str3, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> a10 = nVar.a();
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: queryProductDetailsAsync.");
        if (dVar.c() != 0) {
            ek.q.e("rbx.purchaseflow", "PaymentsProtocol: Failed to get product details. BillingResult: " + dVar);
            if (rh.h.a().I0()) {
                B1();
                return;
            }
            return;
        }
        if (a10.isEmpty()) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: productDetailsList is empty.");
            return;
        }
        Iterator<com.android.billingclient.api.e> it = a10.iterator();
        com.android.billingclient.api.e eVar = null;
        while (it.hasNext()) {
            eVar = it.next();
            eVar.e().equals("subs");
        }
        n1(eVar, z10, j10, str, str2, activity, "", str3);
    }

    @Override // cj.k
    public boolean h(long j10, String str, String str2, Activity activity, final boolean z10, cj.o oVar) {
        final dj.c cVar = new dj.c(str2);
        if (!cVar.b()) {
            ek.q.e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (cVar.c() && this.f14883a.e("subscriptions").c() != 0) {
            ek.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        ek.q.h("rbx.purchaseflow", "Initiated purchase. Params: " + cVar);
        this.f14895n = Long.toString(j10);
        if (!W0()) {
            ek.q.e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + cVar);
            return false;
        }
        this.f14897p = j10;
        this.f14892k = cVar.f();
        this.f14904w = cVar.a();
        this.B = cVar.d();
        this.f14891j = activity;
        this.f14898q = !z10;
        this.f14902u = oVar;
        this.f14896o = cVar.c();
        if (cVar.c()) {
            this.f14903v.put(cVar.f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(cVar.f(), cVar.g()));
        p1(arrayList, new q() { // from class: dj.l
            @Override // dj.m.q
            public final void a(List list) {
                m.this.i1(cVar, z10, list);
            }
        });
        return true;
    }

    public final /* synthetic */ void h1(List list, q qVar, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> a10 = nVar.a();
        if (dVar.c() != 0) {
            ek.q.e("rbx.purchaseflow", "Failed queryProductDetails. Products: " + list + ", BillingResult: " + dVar);
        } else {
            if (a10.isEmpty()) {
                ek.q.h("rbx.purchaseflow", "Returned no ProductDetails for Products: " + list);
                return;
            }
            for (com.android.billingclient.api.e eVar : a10) {
                if (eVar.e().equals("subs")) {
                    this.f14887f.put(eVar.d(), eVar);
                } else {
                    this.f14886e.put(eVar.d(), eVar);
                }
            }
            ek.q.h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        qVar.a(a10);
    }

    @Override // cj.k
    public boolean i(String str) {
        this.f14905x = str;
        return !TextUtils.isEmpty(str);
    }

    public final /* synthetic */ void i1(dj.c cVar, boolean z10, List list) {
        if (list == null || list.isEmpty()) {
            l1(cVar.f(), e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        if (a1(cVar.f(), eVar, cVar.c())) {
            this.f14894m = M0(eVar, cVar.c());
            this.f14900s.h0(new cj.m(this.f14895n, cVar.f(), !z10));
            E0(null);
        }
    }

    @Override // cj.k
    public void j(s0 s0Var) {
        this.f14902u = s0Var;
    }

    public final void j1(v7.k kVar, boolean z10) {
        if (this.f14902u != null && Z0(v0(kVar))) {
            this.f14902u.b();
        }
        new cj.r(this.f14901t).b(a1.d1(), new dj.d(kVar, z10, this.f14898q), new l(kVar));
    }

    @Override // cj.k
    public void k(boolean z10) {
        this.f14898q = z10;
    }

    public final void k1(String str, e.b bVar) {
        e.b bVar2 = e.b.SUCCESS;
        if (bVar == bVar2) {
            N1();
        } else if (bVar == e.b.USER_CANCELLED) {
            L1();
        } else if (bVar == e.b.ALREADY_ACKNOWLEDGED) {
            K1();
        } else {
            M1();
        }
        if (this.f14902u != null && Z0(str)) {
            cj.o oVar = this.f14902u;
            if (oVar instanceof s0) {
                if (this.f14897p != 0) {
                    String str2 = this.f14906y;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    if (this.f14903v.containsKey(str)) {
                        ((s0) this.f14902u).a(bVar == bVar2, this.f14897p, this.f14903v.get(str), str3);
                        return;
                    }
                    ((s0) this.f14902u).a(bVar == bVar2, this.f14897p, this.f14892k, str3);
                } else {
                    ek.q.k("rbx.purchaseflow", "Ignore calling inGamePurchaseFinished: mUserId=" + this.f14897p + ". mProductId=" + this.f14892k + ".. checkoutSessionId=" + this.f14906y + ".");
                }
            } else if (oVar != null) {
                oVar.c(new dj.e(bVar, this.f14892k));
            }
        }
        if (Z0(str)) {
            t1();
        }
    }

    @Override // cj.k
    public boolean l(String str) {
        this.f14906y = str;
        return !TextUtils.isEmpty(str);
    }

    public final void l1(String str, e.b bVar, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.f14900s.l(str2);
        }
        k1(str, bVar);
    }

    @Override // cj.k
    public void m(int i10) {
        a.e eVar;
        if (i10 == 200) {
            ek.q.h("rbx.purchaseflow", "Validation successful");
            eVar = a.e.OK;
            this.f14900s.B();
        } else if (i10 == 429) {
            ek.q.e("rbx.purchaseflow", "Service has been rate limited to user.");
            eVar = a.e.LIMIT;
            this.f14900s.G();
        } else if (i10 == 500) {
            ek.q.e("rbx.purchaseflow", "Server Error");
            eVar = a.e.UNKNOWN_ERROR;
            this.f14900s.H();
        } else if (i10 == 400) {
            ek.q.e("rbx.purchaseflow", "Service has thrown an uknown exception.");
            eVar = a.e.ERROR;
            this.f14900s.C();
        } else if (i10 == 401) {
            ek.q.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            eVar = a.e.ERROR;
            this.f14900s.D();
        } else if (i10 == 403) {
            ek.q.e("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
            eVar = a.e.ERROR;
            this.f14900s.E();
        } else if (i10 != 404) {
            ek.q.e("rbx.purchaseflow", "Validation unknown error: " + i10);
            eVar = a.e.UNKNOWN_ERROR;
            this.f14900s.J();
        } else {
            ek.q.e("rbx.purchaseflow", "{validateModel} is invalid.");
            eVar = a.e.ERROR;
            this.f14900s.F();
        }
        int i11 = e.f14912a[eVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                F1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new dj.e(e.b.VALIDATION_ERROR, this.f14892k));
                return;
            }
            if (i11 == 3) {
                I1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new dj.e(e.b.VALIDATION_RETRY, this.f14892k));
            } else if (i11 == 4) {
                G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new dj.e(e.b.VALIDATION_LIMIT, this.f14892k));
            } else if (i11 != 5) {
                J1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new dj.e(e.b.UNKNOWN, this.f14892k));
            } else {
                G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new dj.e(e.b.VALIDATION_LIMIT_UNDER_13, this.f14892k));
            }
        }
    }

    public void m1(long j10, String str, boolean z10) {
        if (j10 > 0) {
            IAPPurchaseManager.nativeSetUserId(j10);
        }
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases attempt.");
        if (!X0()) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchasing is not setup.");
            return;
        }
        if (U0()) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchase is currently in progress.");
            return;
        }
        if (!z10 && this.f14889h) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because it should only be triggered if queried history is stale or during app resume.");
            return;
        }
        if (!rh.h.a().D()) {
            o1("inapp");
            o1("subs");
            this.f14889h = true;
            return;
        }
        v7.o a10 = v7.o.b().b("inapp").a();
        v7.o a11 = v7.o.b().b("subs").a();
        C1(false);
        this.f14883a.g(a10, new v7.l() { // from class: dj.g
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                m.this.d1(dVar, list);
            }
        });
        C1(true);
        this.f14883a.g(a11, new v7.l() { // from class: dj.h
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                m.this.e1(dVar, list);
            }
        });
        this.f14889h = true;
    }

    @Override // cj.k
    public boolean n(String str, String str2, Activity activity, long j10, cj.o oVar) {
        this.f14898q = false;
        return V1(str, str2, activity, j10, oVar, false);
    }

    public final void n1(com.android.billingclient.api.e eVar, boolean z10, long j10, String str, String str2, Activity activity, String str3, String str4) {
        String b10;
        ek.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolOpenBillingFlow");
        ArrayList arrayList = new ArrayList();
        if (z10) {
            if (rh.h.a().W3()) {
                b10 = w0(eVar);
                if (b10 == null) {
                    l1(str2, e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + str2);
                    return;
                }
            } else {
                b10 = eVar.f().get(0).b();
            }
            arrayList.add(c.b.b().c(eVar).b(b10).a());
        } else {
            arrayList.add(c.b.b().c(eVar).a());
        }
        if (j10 > 0) {
            str = Long.toString(j10);
        }
        c.a d10 = com.android.billingclient.api.c.b().b(str).d(arrayList);
        if (!rh.h.a().d2()) {
            String str5 = this.f14905x;
            if (str5 != null) {
                d10.c(str5);
                this.f14900s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else {
                String str6 = this.f14906y;
                if (str6 != null) {
                    d10.c(str6);
                    this.f14900s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
                } else {
                    ek.q.k("rbx.purchaseflow", "Both mStoredChargeRequestId and mCurrentCheckoutSessionId are null.");
                    this.f14900s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
                }
            }
        } else if (str3 != null && !str3.isEmpty()) {
            d10.c(str3);
            this.f14900s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (str4 == null || str4.isEmpty()) {
            ek.q.k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId are empty.");
            this.f14900s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            d10.c(str4);
            this.f14900s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        com.android.billingclient.api.c a10 = d10.a();
        this.f14893l = str2;
        if (this.f14883a.h(activity, a10).c() != 0) {
            ek.q.h("rbx.purchaseflow", "PaymentsProtocol: launchBillingFlow failed!");
        }
    }

    public final void o1(String str) {
        if (W0()) {
            this.f14883a.g(v7.o.b().b(str).a(), new b());
        }
    }

    public final void p1(final List<p> list, final q qVar) {
        if (this.f14883a.e("fff").c() != 0) {
            ek.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            qVar.a(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (p pVar : list) {
            arrayList.add(f.b.b().b(pVar.f14928a).c(pVar.b).a());
        }
        this.f14883a.a(com.android.billingclient.api.f.a().b(arrayList).a(), new v7.j() { // from class: dj.j
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                m.this.h1(list, qVar, dVar, nVar);
            }
        });
    }

    public final void q1(r rVar) {
        ek.q.b("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f14883a.e("fff").c() != 0) {
            ek.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        o oVar = this.f14884c;
        if (oVar == o.READY) {
            ek.q.b("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            ek.q.b("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> G0 = G0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = G0.iterator();
        while (it.hasNext()) {
            arrayList.add(f.b.b().b(it.next()).c("inapp").a());
        }
        com.android.billingclient.api.f a10 = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f14884c = o.CONNECTING;
        this.f14883a.a(a10, new g(rVar));
    }

    public final void r1(String str) {
        if (W0()) {
            this.f14883a.g(v7.o.b().b(str).a(), new a(str));
        }
    }

    public final void s1(r rVar) {
        ek.q.b("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f14883a.e("subscriptions").c() != 0) {
            ek.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f14883a.e("fff").c() != 0) {
            ek.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        ek.q.b("rbx.purchaseflow", "Attempt querySubsProduct");
        o oVar = this.f14885d;
        if (oVar == o.READY) {
            ek.q.b("rbx.purchaseflow", "querySubsProduct is setup already");
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            ek.q.b("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> N0 = N0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = N0.iterator();
        while (it.hasNext()) {
            arrayList.add(f.b.b().b(it.next()).c("subs").a());
        }
        com.android.billingclient.api.f a10 = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f14885d = o.CONNECTING;
        ek.q.b("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f14883a.a(a10, new h(rVar));
    }

    public final void t1() {
        this.f14891j = null;
        this.f14902u = null;
        this.f14892k = null;
        this.f14897p = 0L;
        this.f14904w = null;
        this.f14894m = null;
        this.f14898q = true;
        this.f14899r = null;
        this.f14905x = null;
        this.f14906y = null;
        this.f14907z = null;
        this.A = null;
    }

    public final void u1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.o(this.f14898q);
    }

    public String v0(v7.k kVar) {
        return dj.b.j(kVar);
    }

    public final void v1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.p(this.f14898q);
    }

    public final String w0(com.android.billingclient.api.e eVar) {
        List<String> list = this.B;
        if (list != null && !list.isEmpty()) {
            String h10 = j0.h(eVar, this.B);
            if (h10 != null) {
                return h10;
            }
            this.f14900s.q("Android-Subscription-Offer-Id-Not-Found");
            if (rh.h.a().B0()) {
                return null;
            }
        }
        String a10 = j0.a(eVar);
        if (a10 != null) {
            return a10;
        }
        this.f14900s.q("Android-Subscription-Offer-No-Base-Plan-Available");
        return null;
    }

    public final void w1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.t();
    }

    public final void x0(v7.k kVar, PurchaseVerificationResponse purchaseVerificationResponse) {
        boolean m10 = e0.m(v0(kVar));
        if (!kVar.i() || m10) {
            ek.q.h("rbx.purchaseflow", "Acknowledging Purchase");
            y0(kVar, new C0287m(kVar, m10, purchaseVerificationResponse));
        } else {
            ek.q.h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            z0(kVar, e.b.ALREADY_ACKNOWLEDGED, n0.b(purchaseVerificationResponse));
        }
    }

    public final void x1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.u();
    }

    public final void y0(v7.k kVar, v7.c cVar) {
        ek.q.h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f14883a.d(v7.b.b().b(kVar.g()).a(), cVar);
    }

    public final void y1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.v();
    }

    public final void z0(v7.k kVar, e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        ek.q.h("rbx.purchaseflow", "Acknowledged Purchase");
        if (Y0(kVar)) {
            this.f14888g.remove(j0.e(kVar));
            k1(v0(kVar), bVar);
            return;
        }
        String v02 = v0(kVar);
        String e10 = j0.e(kVar);
        boolean m10 = e0.m(v02);
        b0 b0Var = this.f14890i;
        boolean z10 = b0Var != null && b0Var.c(e10);
        if (m10) {
            if (z10) {
                this.f14900s.q("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.f14900s.q("Play-Points-Show-Confirmation-Screen");
                com.android.billingclient.api.e J0 = J0(v02, false);
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().setProductId(v02).setNativeProductId(v02).setRobuxAmount(0).setDescription(J0.a()).setDisplayPrice(j0.c(J0)).setPrice(j0.f(J0)).setCurrencyCode(j0.b(J0)).setRobloxPurchaseInfo(n0.a(robloxPurchaseInfo)).build());
                b0 b0Var2 = this.f14890i;
                if (b0Var2 != null) {
                    b0Var2.a(e10);
                }
            }
        }
        C0(kVar);
    }

    public final void z1() {
        if (mh.b.a()) {
            return;
        }
        this.f14900s.w();
    }
}
