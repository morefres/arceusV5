package com.roblox.client.purchase;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.appcompat.app.a;
import cj.j;
import cj.l;
import cj.o;
import cj.p;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import dj.a0;
import dj.m;
import ek.q;
import ek.t;
import fj.ValidatePurchaseResponsePayload;
import java.util.HashMap;
import rg.q0;
import rg.y;
import rh.h;
import uh.s0;

/* loaded from: classes2.dex */
public class IAPPurchaseManager {

    /* renamed from: h, reason: collision with root package name */
    public static cj.a f9229h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f9230i = false;

    /* renamed from: j, reason: collision with root package name */
    public static ProgressDialog f9231j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Activity f9232k = null;

    /* renamed from: l, reason: collision with root package name */
    public static String f9233l = "buyRobuxPage";

    /* renamed from: m, reason: collision with root package name */
    public static String f9234m = "buyUpsell";

    /* renamed from: n, reason: collision with root package name */
    public static String f9235n = "buyDevSub";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9237c;

    /* renamed from: d, reason: collision with root package name */
    public cj.a f9238d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f9239e;

    /* renamed from: a, reason: collision with root package name */
    public long f9236a = 0;
    public String b = "";

    /* renamed from: f, reason: collision with root package name */
    public s0 f9240f = new f();

    /* renamed from: g, reason: collision with root package name */
    public s0 f9241g = new f();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30511w1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30511w1);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30514x1);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30511w1);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9246a;
        public final /* synthetic */ CharSequence b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f9247c;

        public e(p pVar, CharSequence charSequence, Activity activity) {
            this.f9246a = pVar;
            this.b = charSequence;
            this.f9247c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9246a.f()) {
                IAPPurchaseManager.t(this.b, this.f9247c);
                return;
            }
            if (IAPPurchaseManager.f9230i) {
                IAPPurchaseManager.f9229h.V(this.b.toString());
                return;
            }
            if (!h.a().h1()) {
                IAPPurchaseManager.f9229h.q0().V(this.b.toString());
                return;
            }
            com.roblox.client.b q02 = IAPPurchaseManager.f9229h.q0();
            if (q02 instanceof com.roblox.client.a) {
                ((com.roblox.client.a) q02).V(this.b.toString());
            } else {
                q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished stored_mActivityInterface.getRobloxActivity() is null.");
                ti.g.b().q("Payments-Protocol-Purchase-Finished-Null-Activity");
            }
        }
    }

    public class f implements s0 {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f9249a;
            public final /* synthetic */ CharSequence b;

            public a(p pVar, CharSequence charSequence) {
                this.f9249a = pVar;
                this.b = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f9249a.f()) {
                    IAPPurchaseManager.this.s(this.b);
                } else {
                    IAPPurchaseManager.this.q(this.b.toString());
                }
            }
        }

        public f() {
        }

        @Override // uh.s0
        public void a(boolean z10, long j10, String str, String str2) {
            IAPPurchaseManager.this.x(z10, j10, str, str2);
        }

        @Override // cj.o
        public void b() {
        }

        @Override // cj.o
        public void c(p pVar) {
            Activity f02 = IAPPurchaseManager.this.f9237c ? IAPPurchaseManager.this.f9238d.f0() : IAPPurchaseManager.this.f9238d.q0();
            if (f02 == null) {
                return;
            }
            IAPPurchaseManager.this.E(new a(pVar, pVar.d() ? IAPPurchaseManager.this.v(q0.f30517y1) : pVar.c(f02)));
        }

        @Override // cj.o
        public void d() {
        }

        @Override // cj.o
        public void e() {
        }
    }

    public class g implements o {

        /* renamed from: a, reason: collision with root package name */
        public final long f9251a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final String f9252c;

        public g(long j10, String str, String str2) {
            this.f9251a = j10;
            this.b = str;
            this.f9252c = str2;
        }

        @Override // cj.o
        public void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cj.o
        public void c(final p pVar) {
            String str;
            if (!(pVar instanceof j) || (str = ((j) pVar).b()) == null) {
                str = "";
            }
            String str2 = str;
            if (IAPPurchaseManager.f9233l.equals(this.f9252c)) {
                final Activity f02 = IAPPurchaseManager.this.f9237c ? IAPPurchaseManager.this.f9238d.f0() : IAPPurchaseManager.this.f9238d.q0();
                if (f02 != null) {
                    IAPPurchaseManager.this.E(new Runnable() { // from class: cj.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            IAPPurchaseManager.g.this.g(f02, pVar);
                        }
                    });
                }
            } else {
                IAPPurchaseManager.this.f9240f.c(pVar);
            }
            IAPPurchaseManager.this.x(pVar.d(), this.f9251a, this.b, str2);
        }

        @Override // cj.o
        public void d() {
        }

        @Override // cj.o
        public void e() {
        }

        public final /* synthetic */ void g(Activity activity, p pVar) {
            l.c(activity, pVar, this.b);
        }
    }

    public IAPPurchaseManager(cj.a aVar, boolean z10) {
        this.f9238d = aVar;
        this.f9237c = z10;
        f9229h = aVar;
        f9230i = z10;
        this.f9239e = new Handler(Looper.getMainLooper());
    }

    public static void M(Context context, boolean z10) {
        if (!t.g()) {
            if (t.i()) {
                String k10 = dk.c.c().k();
                long j10 = dk.c.c().j();
                q.h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + k10 + ", userId = " + j10);
                if (TextUtils.isEmpty(k10)) {
                    return;
                }
                if (h.a().D5()) {
                    gj.b.a(context);
                    throw null;
                }
                if (j10 > 0) {
                    gj.a.a(context);
                    throw null;
                }
                gj.a.a(context);
                throw null;
            }
            return;
        }
        String k11 = dk.c.c().k();
        long j11 = dk.c.c().j();
        if (TextUtils.isEmpty(k11)) {
            return;
        }
        q.h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + k11 + ", userId = " + j11);
        if (h.a().H1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: tryGrantPendingPurchases");
            if (j11 > 0) {
                a0.R(context).K(j11, z10);
                return;
            } else {
                a0.R(context).L(z10);
                return;
            }
        }
        if (h.a().n3() && h.a().q()) {
            m.F0(context).m1(j11, k11, z10);
        } else if (j11 > 0) {
            m.F0(context).A0(j11, k11, z10);
        } else {
            m.F0(context).B0(k11, z10);
        }
    }

    public static /* synthetic */ void d(boolean z10) {
        Activity activity = f9232k;
        if (activity == null || activity.isFinishing() || f9232k.isDestroyed()) {
            return;
        }
        if (f9231j == null) {
            Activity activity2 = f9232k;
            f9231j = u(activity2, null, activity2.getString(q0.P));
        }
        if (z10) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay show.");
            f9231j.show();
        } else {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay hide.");
            f9231j.dismiss();
        }
    }

    @Keep
    public static String getPlatformPaymentMethod() {
        return t.g() ? BuildConfig.STORE_TYPE : (t.i() && h.a().D5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static String getPlatformPaymentProviderType() {
        return t.g() ? BuildConfig.STORE_TYPE : (t.i() && h.a().D5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static boolean invokeStore(String str, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: invokeStore attempt.");
        if (t.g()) {
            Activity f02 = f9230i ? f9229h.f0() : f9229h.q0();
            m.F0(f02).a(str, dk.c.c().j(), dk.c.c().k(), str2, f02);
            return false;
        }
        if (!t.i()) {
            return false;
        }
        gj.b.a(f9230i ? f9229h.f0() : f9229h.q0());
        dk.c.c().j();
        dk.c.c().k();
        throw null;
    }

    @Keep
    public static void invokeStoreV2(String str, long j10, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocolV2: invokeStoreV2 attempt:" + str + ", " + j10 + ", " + str2);
        if (t.g()) {
            Activity f02 = f9230i ? f9229h.f0() : f9229h.q0();
            a0.R(f02).Q(f02, new ValidatePurchaseResponsePayload(Long.valueOf(j10), str2, null), null, null);
        }
    }

    public static native void nativeBeginPaymentsProtocolPurchase(String str);

    public static native HashMap<String, String> nativeBeginPaymentsProtocolPurchaseV2(PreparePaymentParams preparePaymentParams);

    public static native void nativeFinishPaymentsProtocolPurchase(String str, int i10, String str2);

    public static native void nativeFinishPaymentsProtocolPurchaseV2(ProcessPaymentParams processPaymentParams);

    public static native void nativeInvokeStore(String str, long j10, String str2);

    public static native void nativePerformSubscriptionPurchase(String str, String str2, String str3, String str4);

    public static native void nativeSetMetricsPurchaseType(String str);

    public static native void nativeSetPaymentSessionId(String str);

    public static native void nativeSetPaymentsProtocolIsInApp(boolean z10);

    public static native void nativeSetProviderCurrencyCode(String str);

    public static native void nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(String str, String str2);

    public static native void nativeSetUserId(long j10);

    @Keep
    public static boolean paymentsProtocolConcludeTransaction(String str, long j10, long j11) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolConcludeTransaction attempt.");
        if (t.g()) {
            m.F0(f9230i ? f9229h.f0() : f9229h.q0()).g(str, j10, dk.c.c().j());
            return true;
        }
        if (!t.i()) {
            return false;
        }
        gj.b.a(f9230i ? f9229h.f0() : f9229h.q0());
        dk.c.c().j();
        throw null;
    }

    @Keep
    public static void paymentsProtocolHandlePreparePaymentErrorCode(int i10) {
        if (h.a().J2()) {
            if (t.g()) {
                m.F0(f9230i ? f9229h.f0() : f9229h.q0()).m(i10);
            } else if (t.i()) {
                gj.b.a(f9230i ? f9229h.f0() : f9229h.q0());
                throw null;
            }
        }
    }

    @Keep
    public static void paymentsProtocolProcessPaymentCallback(long[] jArr, int i10, String str, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocolV2: paymentsProtocolProcessPaymentCallback attempt.");
        if (t.g()) {
            a0.R(f9230i ? f9229h.f0() : f9229h.q0()).q0(jArr, i10, str, str2);
        }
    }

    @Keep
    public static void paymentsProtocolPurchaseFinished(p pVar) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished attempt.");
        Activity f02 = f9230i ? f9229h.f0() : f9229h.q0();
        if (f02 == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new e(pVar, pVar.c(f02), f02));
    }

    @Keep
    public static void paymentsProtocolSetProgressBarDisplay(final boolean z10) {
        if (h.a().j5()) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay attempt.");
            if (z10 || f9232k != null) {
                if (f9232k == null) {
                    q.h("rbx.purchaseflow", "PaymentsProtocol: initializing mPaymentsProtocolActivity");
                    f9232k = f9229h.q0();
                }
                Activity activity = f9232k;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: cj.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            IAPPurchaseManager.d(z10);
                        }
                    });
                }
            }
        }
    }

    @Keep
    public static boolean setCheckoutSessionId(String str) {
        if (t.g()) {
            return m.F0(f9230i ? f9229h.f0() : f9229h.q0()).l(str);
        }
        if (!t.i() || !h.a().D5()) {
            return false;
        }
        gj.b.a(f9230i ? f9229h.f0() : f9229h.q0());
        throw null;
    }

    public static void t(CharSequence charSequence, Activity activity) {
        androidx.appcompat.app.a a10 = new a.C0009a(activity).a();
        TextView textView = new TextView(activity);
        String string = activity.getString(q0.W);
        int indexOf = charSequence.toString().indexOf(string);
        fk.b.b(textView, charSequence.toString(), new fk.c(activity, null, string, indexOf, indexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        a10.x(textView, 150, 100, 150, 100);
        a10.setCanceledOnTouchOutside(true);
        try {
            a10.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public static ProgressDialog u(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    public final /* synthetic */ void A() {
        r(q0.B1);
    }

    public final /* synthetic */ void B() {
        r(q0.f30511w1);
    }

    public final /* synthetic */ void C() {
        r(q0.B1);
    }

    public final /* synthetic */ void D() {
        r(q0.f30511w1);
    }

    public void E(Runnable runnable) {
        this.f9239e.post(runnable);
    }

    public void F(long j10, String str) {
        J(j10, str, "");
    }

    public void G(long j10, String str, String str2) {
        K(j10, str, str2, "");
    }

    public void H(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        String paymentSessionId = nativePurchaseContext.paymentSessionId();
        if (paymentSessionId == null) {
            paymentSessionId = "";
        }
        L(j10, str, paymentSessionId, nativePurchaseContext.purchaseType(), nativePurchaseContext.isInApp());
    }

    public void I(long j10, String str, String str2) {
        q.h("rbx.purchaseflow", "promptNativePurchaseWithPayload: userId = " + j10 + ", roblox-native-productId = " + str);
        this.f9236a = j10;
        if (t.j()) {
            q.e("rbx.purchaseflow", "Luobu purchasing not enabled");
            w(false, j10, str);
            return;
        }
        Activity f02 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
        if (t.i()) {
            if (!h.a().D5()) {
                gj.a.a(f02);
                throw null;
            }
            E(new c());
            w(false, j10, str);
            return;
        }
        if (h.a().H1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchaseWithPayload.");
            if (a0.R(f02).h(j10, str, str2, f02, true, this.f9240f)) {
                return;
            }
            E(new Runnable() { // from class: cj.g
                @Override // java.lang.Runnable
                public final void run() {
                    IAPPurchaseManager.this.y();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().n3()) {
            if (m.F0(f02).h(j10, str, str2, f02, true, this.f9240f)) {
                return;
            }
            E(new d());
            w(false, j10, str);
            return;
        }
        q.h("rbx.purchaseflow", "PaymentsProtocol: promptNativePurchaseWithPayload.");
        nativeSetMetricsPurchaseType(f9235n);
        m F0 = m.F0(f02);
        F0.k(false);
        if (h.a().U()) {
            F0.j(this.f9240f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        nativeSetPaymentSessionId("");
        nativeSetUserId(j10);
        F0.f(str, j10, dk.c.c().k(), f02, str2);
    }

    public void J(long j10, String str, String str2) {
        L(j10, str, str2, f9234m, false);
    }

    public void K(long j10, String str, String str2, String str3) {
        q.h("rbx.purchaseflow", "promptNativePurchase: player = " + j10 + ", productId = " + str);
        this.f9236a = j10;
        this.b = str;
        if (t.j()) {
            Activity f02 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
            if (f02 == null || f02.isFinishing()) {
                return;
            }
            y.h().j(f02).b(f02, str, j10, this.f9240f);
            return;
        }
        if (t.i()) {
            Activity f03 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
            if (!h.a().D5()) {
                gj.a.a(f03);
                throw null;
            }
            nativeSetMetricsPurchaseType(f9234m);
            gj.b.a(f03);
            throw null;
        }
        Activity f04 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
        if (h.a().H1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(f04).n(str2, str, f04, j10, this.f9240f)) {
                return;
            }
            E(new Runnable() { // from class: cj.h
                @Override // java.lang.Runnable
                public final void run() {
                    IAPPurchaseManager.this.z();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().n3()) {
            if (m.F0(f04).n(str2, str, f04, j10, this.f9240f)) {
                return;
            }
            E(new a());
            w(false, j10, str);
            return;
        }
        nativeSetMetricsPurchaseType(f9234m);
        m F0 = m.F0(f04);
        F0.i(null);
        F0.k(false);
        if (h.a().U()) {
            F0.j(this.f9240f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        if (h.a().L1()) {
            nativeSetPaymentSessionId(str3);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(F0.c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public final void L(long j10, String str, String str2, String str3, boolean z10) {
        q.h("rbx.purchaseflow", "promptNativePurchase: userId = " + j10 + ", productId = " + str);
        this.f9236a = j10;
        this.b = str;
        if (t.j()) {
            Activity f02 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
            if (f02 == null || f02.isFinishing()) {
                return;
            }
            if (h.a().y4() && z10) {
                y.h().j(f02).a(f02, str, new g(j10, str, str3));
                return;
            } else {
                y.h().j(f02).b(f02, str, j10, this.f9240f);
                return;
            }
        }
        if (t.i()) {
            Activity f03 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
            if (h.a().D5()) {
                nativeSetMetricsPurchaseType(f9234m);
                gj.b.a(f03);
                throw null;
            }
            gj.a.a(f03);
            if (!h.a().y4() || !z10) {
                Long.toString(j10);
                throw null;
            }
            E(new Runnable() { // from class: cj.c
                @Override // java.lang.Runnable
                public final void run() {
                    IAPPurchaseManager.this.A();
                }
            });
            w(false, j10, str);
            return;
        }
        Activity f04 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
        if (h.a().H1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(f04).n(Long.toString(j10), str, f04, j10, this.f9240f)) {
                return;
            }
            E(new Runnable() { // from class: cj.d
                @Override // java.lang.Runnable
                public final void run() {
                    IAPPurchaseManager.this.B();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().n3()) {
            m F0 = m.F0(f04);
            if (!h.a().y4() || !z10) {
                if (F0.n(Long.toString(j10), str, f04, j10, this.f9240f)) {
                    return;
                }
                E(new b());
                w(false, j10, str);
                return;
            }
            if (F0 == null) {
                E(new Runnable() { // from class: cj.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        IAPPurchaseManager.this.C();
                    }
                });
                w(false, j10, str);
                return;
            } else {
                if (F0.b(dk.c.c().k(), str, f04, new g(j10, str, str3), false, str2)) {
                    return;
                }
                E(new Runnable() { // from class: cj.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        IAPPurchaseManager.this.D();
                    }
                });
                w(false, j10, str);
                return;
            }
        }
        if (h.a().y4()) {
            nativeSetMetricsPurchaseType(str3);
        } else {
            nativeSetMetricsPurchaseType(f9234m);
        }
        m F02 = m.F0(f04);
        F02.i(null);
        if (h.a().y4()) {
            F02.k(z10);
        } else {
            F02.k(false);
        }
        if (h.a().U()) {
            F02.j(this.f9240f);
        }
        if (h.a().y4()) {
            nativeSetPaymentsProtocolIsInApp(z10);
        } else {
            nativeSetPaymentsProtocolIsInApp(false);
        }
        if (h.a().L1()) {
            nativeSetPaymentSessionId(str2);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(F02.c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public final void q(String str) {
        if (this.f9237c) {
            this.f9238d.V(str);
        } else {
            this.f9238d.q0().V(str);
        }
    }

    public final void r(int i10) {
        if (this.f9237c) {
            this.f9238d.T(i10);
        } else {
            this.f9238d.q0().T(i10);
        }
    }

    public void s(CharSequence charSequence) {
        Activity f02 = this.f9237c ? this.f9238d.f0() : this.f9238d.q0();
        if (f02 == null) {
            return;
        }
        t(charSequence, f02);
    }

    public String v(int i10) {
        return this.f9237c ? this.f9238d.f0().getString(i10) : this.f9238d.q0().getString(i10);
    }

    public final void w(boolean z10, long j10, String str) {
        x(z10, j10, str, "");
    }

    public final void x(boolean z10, long j10, String str, String str2) {
        q.h("rbx.purchaseflow", "In-App purchase finished: success = " + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId=" + str2);
        if (this.f9236a == 0) {
            q.h("rbx.purchaseflow", "AppShellFragment.inAppPurchaseFinished: userId == 0.");
            return;
        }
        q.h("rbx.purchaseflow", "Native call. Success=" + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId" + str2);
        if (h.a().r1()) {
            if (str2 == null) {
                str2 = "";
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j10, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j10, str);
        }
        this.b = "";
        this.f9236a = 0L;
    }

    public final /* synthetic */ void y() {
        r(q0.f30511w1);
    }

    public final /* synthetic */ void z() {
        r(q0.f30511w1);
    }
}
