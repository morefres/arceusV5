package com.roblox.client.purchase;

import androidx.annotation.NonNull;
import ci.j;
import ci.l;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import ek.q;
import ek.r;
import ek.t;
import fj.ValidatePurchaseResponsePayload;
import java.util.HashMap;
import ti.g;
import ti.h;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public ci.f f9254a;
    public g b = g.b();

    /* renamed from: com.roblox.client.purchase.a$a, reason: collision with other inner class name */
    public class C0149a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f9255a;
        public final /* synthetic */ String b;

        public C0149a(f fVar, String str) {
            this.f9255a = fVar;
            this.b = str;
        }

        @Override // ci.l
        public void a(j jVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
        @Override // ci.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(ci.j r9) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.purchase.a.C0149a.b(ci.j):void");
        }
    }

    public class b implements h.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9257a;
        public final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9258c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9259d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f9260e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f9261f;

        public b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
            this.f9257a = str;
            this.b = str2;
            this.f9258c = str3;
            this.f9259d = str4;
            this.f9260e = z10;
            this.f9261f = fVar;
        }

        @Override // ti.h.d
        public void a(boolean z10, int i10) {
            if (z10) {
                a.this.b(this.f9257a, this.b, this.f9258c, this.f9259d, this.f9260e, this.f9261f);
                return;
            }
            f fVar = this.f9261f;
            if (fVar != null) {
                fVar.a(e.ERROR_CHECKING_BALANCE, this.b, null);
            }
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9263a;

        static {
            int[] iArr = new int[d.values().length];
            f9263a = iArr;
            try {
                iArr[d.ValidationFailure_ExceedPurchaseLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9263a[d.ValidationFailure_UserUnder13ExceedPurchaseLimit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        ValidationFailure_AgeValidation,
        ValidationFailure_DesktopPurchase,
        ValidationFailure_FraudCheck,
        ValidationFailure_ExceedPurchaseLimit,
        ValidationFailure_ParentalControl,
        ValidationFailure_MobileAppPurchase,
        ValidationFailure_UserUnder13ExceedPurchaseLimit,
        ValidationFailure_ProviderEligibility,
        ValidationFailure_ProductEligibility,
        ValidationFailure_SmartReroute,
        ValidationFailure_Unknown
    }

    public enum e {
        OK,
        ERROR,
        RETRY,
        LIMIT,
        LIMIT_UNDER_13,
        ERROR_CHECKING_BALANCE,
        UNKNOWN_ERROR
    }

    public interface f {
        void a(e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload);
    }

    public a(@NonNull ci.f fVar) {
        this.f9254a = fVar;
    }

    public void b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        ValidatePurchaseResponsePayload validatePurchaseResponsePayload = null;
        if (!rh.h.a().H1() || !t.g()) {
            this.f9254a.a(str, str4 != null ? new ei.b(str2, str3, str4) : new ei.b(str2, str3), null, new C0149a(fVar, str2)).b();
            this.b.A();
            return;
        }
        PreparePaymentParams.Builder isInApp = PreparePaymentParams.builder().setProductId(str2).setCurrencyCode(str3).setPaymentSessionId(str4).setPaymentMethod(t.k() ? "VngGooglePlayStore" : BuildConfig.STORE_TYPE).setIsInApp(z10);
        this.b.A();
        HashMap<String, String> nativeBeginPaymentsProtocolPurchaseV2 = IAPPurchaseManager.nativeBeginPaymentsProtocolPurchaseV2(isInApp.build());
        q.h("rbx.purchaseflow", "parsing response payload: " + nativeBeginPaymentsProtocolPurchaseV2);
        Integer a10 = r.a(nativeBeginPaymentsProtocolPurchaseV2, "response_code");
        Long b10 = r.b(nativeBeginPaymentsProtocolPurchaseV2, "user_id");
        String str5 = nativeBeginPaymentsProtocolPurchaseV2.get("checkout_session_id");
        if (a10 == null || b10 == null) {
            q.k("rbx.purchaseflow", "parsing response payload failed: " + nativeBeginPaymentsProtocolPurchaseV2);
            this.b.z();
        } else {
            validatePurchaseResponsePayload = new ValidatePurchaseResponsePayload(b10, str5, null);
        }
        e f10 = f(a10, validatePurchaseResponsePayload);
        if (fVar != null) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: OnValidationCheckFinished start.");
            fVar.a(f10, str2, validatePurchaseResponsePayload);
        }
    }

    public void c(String str, String str2, String str3, String str4, f fVar) {
        b(str, str2, str3, str4, false, fVar);
    }

    public void d(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        q.h("rbx.purchaseflow", "Get balance.");
        h.e().m(new b(str, str2, str3, str4, z10, fVar), this.f9254a);
    }

    public void e(String str, String str2, String str3, String str4, f fVar) {
        d(str, str2, str3, str4, false, fVar);
    }

    public final e f(Integer num, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        if (num == null) {
            q.e("rbx.purchaseflow", "Validation unknown error: responseCode is null");
            this.b.J();
            return e.UNKNOWN_ERROR;
        }
        int intValue = num.intValue();
        if (intValue == 200) {
            q.h("rbx.purchaseflow", "Validation returns 200");
            this.b.B();
            if (validatePurchaseResponsePayload == null) {
                q.k("rbx.purchaseflow", "validatePurchaseResponsePayload is null in getPurchaseValidationResult.");
                this.b.H();
                return e.ERROR;
            }
            if (validatePurchaseResponsePayload.getFailureReason() == null) {
                return e.OK;
            }
            q.e("rbx.purchaseflow", "Validation returns " + validatePurchaseResponsePayload.getFailureReason());
            int i10 = c.f9263a[validatePurchaseResponsePayload.getFailureReason().ordinal()];
            if (i10 == 1) {
                this.b.E();
                return e.LIMIT;
            }
            if (i10 != 2) {
                this.b.E();
                return e.ERROR;
            }
            this.b.E();
            return e.LIMIT_UNDER_13;
        }
        if (intValue == 429) {
            q.e("rbx.purchaseflow", "Service has been rate limited to user.");
            this.b.G();
            return e.LIMIT;
        }
        if (intValue == 500) {
            q.e("rbx.purchaseflow", "Server Error");
            this.b.H();
            return e.UNKNOWN_ERROR;
        }
        if (intValue == 503) {
            q.e("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
            this.b.I();
            return e.RETRY;
        }
        if (intValue == 400) {
            q.e("rbx.purchaseflow", "Service has thrown an unknown exception.");
            this.b.C();
            return e.UNKNOWN_ERROR;
        }
        if (intValue == 401) {
            q.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            this.b.D();
            return e.ERROR;
        }
        if (intValue == 403) {
            q.e("rbx.purchaseflow", "Forbidden to make request.");
            this.b.E();
            return e.ERROR;
        }
        if (intValue != 404) {
            q.e("rbx.purchaseflow", "Validation unknown error");
            this.b.J();
            return e.UNKNOWN_ERROR;
        }
        q.e("rbx.purchaseflow", "The response is not found");
        this.b.F();
        return e.ERROR;
    }
}
