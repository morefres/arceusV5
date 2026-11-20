package ti;

import android.content.Context;
import androidx.annotation.NonNull;
import backtraceio.library.models.BacktraceAttributeConsts;
import ci.r;
import cj.m;
import com.roblox.engine.jni.NativeGLInterface;
import ek.c0;
import ek.d0;
import ek.q;
import ek.t;
import rg.a1;
import rg.t0;
import rg.u;
import rg.y;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public static g f32260d;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final c0 f32261a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public m f32262c;

    public g(@NonNull c0 c0Var) {
        this.f32261a = c0Var;
    }

    public static void a(String str) {
        t0.h(str, "sessionCheck");
    }

    public static g b() {
        g gVar = f32260d;
        if (gVar != null) {
            return gVar;
        }
        synchronized (g.class) {
            try {
                if (f32260d == null) {
                    f32260d = new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32260d;
    }

    public static String c(boolean z10) {
        return a1.q0() ? z10 ? "Quest-ROBLOXPlayer-Session-Inferred-Crash" : "Quest-ROBLOXPlayer-Session-Inferred-Success" : z10 ? "Android-ROBLOXPlayer-Session-Inferred-Crash" : "Android-ROBLOXPlayer-Session-Inferred-Success";
    }

    public static String d(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length >= 2 ? split[1] : "Unknown";
        return (a1.q0() ? "Quest-AppStartup-Version-" : t.f() ? "Amazon-AppStartup-Version-" : t.i() ? "Galaxy-AppStartup-Version-" : "Android-AppStartup-Version-") + str2;
    }

    public static String e() {
        return a1.q0() ? "Quest-AppStartup-Version-Total" : t.f() ? "Amazon-AppStartup-Version-Total" : t.i() ? "Galaxy-AppStartup-Version-Total" : "Android-AppStartup-Version-Total";
    }

    public static void h(String str, int i10) {
        new r(a1.w() + a1.v(str, i10)).c();
    }

    public void A() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Request" : "Android-Payments-Api-V1-Precheck-Request");
    }

    public void B() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-200" : "Android-Payments-Api-V1-Precheck-Response-200");
    }

    public void C() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-400" : "Android-Payments-Api-V1-Precheck-Response-400");
    }

    public void D() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-401" : "Android-Payments-Api-V1-Precheck-Response-401");
    }

    public void E() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-403" : "Android-Payments-Api-V1-Precheck-Response-403");
    }

    public void F() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-404" : "Android-Payments-Api-V1-Precheck-Response-404");
    }

    public void G() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-429" : "Android-Payments-Api-V1-Precheck-Response-429");
    }

    public void H() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-500" : "Android-Payments-Api-V1-Precheck-Response-500");
    }

    public void I() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-503" : "Android-Payments-Api-V1-Precheck-Response-503");
    }

    public void J() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Unknown" : "Android-Payments-Api-V1-Precheck-Response-Unknown");
    }

    public void K() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Request" : "Android-Payments-Api-V1-Verify-Request");
    }

    public void L() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-200" : "Android-Payments-Api-V1-Verify-Response-200");
    }

    public void M() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-400" : "Android-Payments-Api-V1-Verify-Response-400");
    }

    public void N() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-401" : "Android-Payments-Api-V1-Verify-Response-401");
    }

    public void O() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-500" : "Android-Payments-Api-V1-Verify-Response-500");
    }

    public void P() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-Unknown" : "Android-Payments-Api-V1-Verify-Response-Unknown");
    }

    public void Q(boolean z10) {
        q(z10 ? "Android-Payments-PaymentsProtocolUseQueryPurchases-Subs" : "Android-Payments-PaymentsProtocolUseQueryPurchases-InApp");
    }

    public void R() {
        q("Android-Payments-Pending-Purchase");
    }

    public void S(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PrecheckBalanceError-InApp" : "Android-Payments-PrecheckBalanceError-InApp" : z11 ? "Amazon-Payments-PrecheckBalanceError-InGame" : "Android-Payments-PrecheckBalanceError-InGame");
    }

    public void T(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PrecheckError-InApp" : t.i() ? "MilkyWay-Payments-PrecheckError-InApp" : "Android-Payments-PrecheckError-InApp" : z11 ? "Amazon-Payments-PrecheckError-InGame" : t.i() ? "MilkyWay-Payments-PrecheckError-InGame" : "Android-Payments-PrecheckError-InGame");
    }

    public void U(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InApp" : "Android-Payments-PrecheckProductDetailsNotSupported-InApp" : z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InGame" : "Android-Payments-PrecheckProductDetailsNotSupported-InGame");
    }

    public void V(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PrecheckRetry-InApp" : t.i() ? "MilkyWay-Payments-PrecheckRetry-InApp" : "Android-Payments-PrecheckRetry-InApp" : z11 ? "Amazon-Payments-PrecheckRetry-InGame" : t.i() ? "MilkyWay-Payments-PrecheckRetry-InGame" : "Android-Payments-PrecheckRetry-InGame");
    }

    public void W(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PrecheckUnknownError-InApp" : t.i() ? "MilkyWay-Payments-PrecheckUnknownError-InApp" : "Android-Payments-PrecheckUnknownError-InApp" : z11 ? "Amazon-Payments-PrecheckUnknownError-InGame" : t.i() ? "MilkYWay-Payments-PrecheckUnknownError-InGame" : "Android-Payments-PrecheckUnknownError-InGame");
    }

    public void X(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PurchaseAlreadyAcknowledged-InApp" : t.i() ? "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InApp" : "Android-Payments-PurchaseAlreadyAcknowledged-InApp" : z11 ? "Amazon-Payments-PurchaseAlreadyAcknowledged-InGame" : t.i() ? "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InGame" : "Android-Payments-PurchaseAlreadyAcknowledged-InGame");
    }

    public void Y(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PurchaseCancelled-InApp" : t.i() ? "MilkyWay-Payments-PurchaseCancelled-InApp" : "Android-Payments-PurchaseCancelled-InApp" : z11 ? "Amazon-Payments-PurchaseCancelled-InGame" : t.i() ? "MilkyWay-Payments-PurchaseCancelled-InGame" : "Android-Payments-PurchaseCancelled-InGame");
    }

    public void Z(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PurchaseFailed-InApp" : t.i() ? "MilkyWay-Payments-PurchaseFailed-InApp" : "Android-Payments-PurchaseFailed-InApp" : z11 ? "Amazon-Payments-PurchaseFailed-InGame" : t.i() ? "MilkyWay-Payments-PurchaseFailed-InGame" : "Android-Payments-PurchaseFailed-InGame");
    }

    public void a0(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PurchaseFlooded-InApp" : t.i() ? "MilkyWay-Payments-PurchaseFlooded-InApp" : "Android-Payments-PurchaseFlooded-InApp" : z11 ? "Amazon-Payments-PurchaseFlooded-InGame" : t.i() ? "MilkyWay-Payments-PurchaseFlooded-InGame" : "Android-Payments-PurchaseFlooded-InGame");
    }

    public void b0(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-PurchaseSuccess-InApp" : t.i() ? "MilkyWay-Payments-PurchaseSuccess-InApp" : "Android-Payments-PurchaseSuccess-InApp" : z11 ? "Amazon-Payments-PurchaseSuccess-InGame" : t.i() ? "MilkyWay-Payments-PurchaseSuccess-InGame" : "Android-Payments-PurchaseSuccess-InGame");
    }

    public void c0() {
        q("Android-Payments-Unacknowledged-Purchase-Failure");
    }

    public void d0() {
        q("Android-Payments-Unknown-State-Purchase");
    }

    public void e0(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-VerificationEmptyError-InApp" : t.i() ? "MilkyWay-Payments-VerificationEmptyError-InApp" : "Android-Payments-VerificationEmptyError-InApp" : z11 ? "Amazon-Payments-VerificationEmptyError-InGame" : t.i() ? "MilkyWay-Payments-VerificationEmptyError-InGame" : "Android-Payments-VerificationEmptyError-InGame");
    }

    public void f() {
        if (t.f()) {
            q("Mobile-DownloadCount-Amazon");
        } else if (t.i()) {
            q("Mobile-DownloadCount-Galaxy");
        } else {
            q("Mobile-DownloadCount-Android");
        }
    }

    public void f0(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-VerificationError-InApp" : t.i() ? "MilkyWay-Payments-VerificationError-InApp" : "Android-Payments-VerificationError-InApp" : z11 ? "Amazon-Payments-VerificationError-InGame" : t.i() ? "MilkyWay-Payments-VerificationError-InGame" : "Android-Payments-VerificationError-InGame");
    }

    public void g() {
        q(e());
        q(d(a1.e1()));
    }

    public void g0(boolean z10, boolean z11) {
        q(z10 ? z11 ? "Amazon-Payments-VerificationUnknownError-InApp" : t.i() ? "MilkyWay-Payments-VerificationUnknownError-InApp" : "Android-Payments-VerificationUnknownError-InApp" : z11 ? "Amazon-Payments-VerificationUnknownError-InGame" : t.i() ? "MilkyWay-Payments-VerificationUnknownError-InGame" : "Android-Payments-VerificationUnknownError-InGame");
    }

    public void h0(m mVar) {
        this.f32262c = mVar;
    }

    public void i(boolean z10) {
        new ji.a("Android-RobloxPlayer-SessionReport-Inferred").d("Session", z10 ? BacktraceAttributeConsts.CrashAttributeType : "Success").g();
        q(c(z10));
    }

    public void i0() {
        long b = this.f32261a.b();
        long j10 = this.b;
        long j11 = b - j10;
        if (j10 == 0 || j11 >= 3600000) {
            g();
            this.b = b;
        }
    }

    public void j(Context context) {
        if (context != null) {
            y.h().d().c(context);
        }
    }

    public void k(Context context, long j10) {
        if (context != null) {
            y.h().d().e(context, j10);
        }
    }

    public void l(String str) {
        q.h("rbx.purchaseflow", str);
        m mVar = this.f32262c;
        if (mVar != null) {
            mVar.f4998d++;
            new ji.a("Android-PurchaseFlow").m(true).d("Username", this.f32262c.f4996a).e("InAppPurchase", this.f32262c.f4997c).d("ProductId", this.f32262c.b).d(BacktraceAttributeConsts.MessageAttributeType, this.f32262c.f4998d + "- " + str).f("Rooted", Boolean.valueOf(u.g().h())).g();
        }
    }

    public void m(String str, String str2, String str3, long j10) {
        y.h().d().f(str, str2, str3, j10, t.f());
    }

    public void n(boolean z10) {
        q(z10 ? "Android-Payments-AcknowledgeCompleteError-InApp" : "Android-Payments-AcknowledgeCompleteError-InGame");
    }

    public void o(boolean z10) {
        q(z10 ? "Android-Payments-AcknowledgeError-InApp" : "Android-Payments-AcknowledgeError-InGame");
    }

    public void p(boolean z10) {
        q(z10 ? t.i() ? "MilkyWay-Payments-ConsumeError-InApp" : "Android-Payments-ConsumeError-InApp" : t.i() ? "MilkyWay-Payments-ConsumeError-InGame" : "Android-Payments-ConsumeError-InGame");
    }

    public void q(String str) {
        h(str, 1);
    }

    public void r(String str, long j10) {
        new r(a1.y() + a1.x(str, j10)).c();
        s(str, j10);
    }

    public void s(String str, long j10) {
        NativeGLInterface.nativeReportToDiagByCountryCode("Mobile", str, j10);
    }

    public void t() {
        q("Android-Payments-Incorrect-User-Purchase");
    }

    public void u() {
        q("Android-Payments-Incorrect-User-Purchase-Userid-Invalid");
    }

    public void v() {
        q("Android-Payments-Incorrect-User-Purchase-Userid-Mismatch");
    }

    public void w() {
        q("Android-Payments-Incorrect-User-Purchase-Username-Mismatch");
    }

    public void x() {
        q("Android-Payments-Incorrect-User-Purchase-Username-Null");
    }

    public void y(boolean z10) {
        q(z10 ? "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InApp" : "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InGame");
    }

    public void z() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Payload-Parse-Error" : "Android-Payments-Api-V1-Precheck-Response-Payload-Parse-Error");
    }

    public g() {
        this(new d0());
    }
}
