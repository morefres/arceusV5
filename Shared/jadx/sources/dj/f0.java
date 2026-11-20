package dj;

import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import dj.f0;
import ju.a2;
import ju.e3;
import ju.g1;
import ju.g3;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ldj/f0;", "", "<init>", "()V", "Lv7/k;", "purchase", "", "orderId", "productId", "", "isInAppPurchase", "Ldj/f0$b;", "timeoutCallback", "", ve.a.f33391e, "(Lv7/k;Ljava/lang/String;Ljava/lang/String;ZLdj/f0$b;)V", j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f0 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ldj/f0$b;", "", "", "orderId", "purchaseToken", "", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a(@NotNull String orderId, @NotNull String purchaseToken);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1", f = "IAPPurchaseManagerV2.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f14858t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f14859u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f14860v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f14861w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ b f14862x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ v7.k f14863y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ProcessPaymentParams f14864z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1$1", f = "IAPPurchaseManagerV2.kt", l = {66}, m = "invokeSuspend", v = 1)
        public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f14865t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ ProcessPaymentParams f14866u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProcessPaymentParams processPaymentParams, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f14866u = processPaymentParams;
            }

            public static final Unit q(ProcessPaymentParams processPaymentParams) {
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchaseV2(processPaymentParams);
                return Unit.f22894a;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f14866u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f14865t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    final ProcessPaymentParams processPaymentParams = this.f14866u;
                    Function0 function0 = new Function0() { // from class: dj.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit q10;
                            q10 = f0.c.a.q(ProcessPaymentParams.this);
                            return q10;
                        }
                    };
                    this.f14865t = 1;
                    if (a2.c(null, function0, this, 1, null) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z10, b bVar, v7.k kVar, ProcessPaymentParams processPaymentParams, mt.b<? super c> bVar2) {
            super(2, bVar2);
            this.f14859u = str;
            this.f14860v = str2;
            this.f14861w = z10;
            this.f14862x = bVar;
            this.f14863y = kVar;
            this.f14864z = processPaymentParams;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f14859u, this.f14860v, this.f14861w, this.f14862x, this.f14863y, this.f14864z, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f14858t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    a aVar = new a(this.f14864z, null);
                    this.f14858t = 1;
                    if (g3.c(30000L, aVar, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
            } catch (e3 unused) {
                ek.q.k("rbx.purchaseflow", "nativeFinishPaymentsProtocolPurchaseV2 timed out. orderId=" + this.f14859u + ", productId=" + this.f14860v + ", isInAppPurchase=" + this.f14861w);
                b bVar = this.f14862x;
                if (bVar != null) {
                    String str = this.f14859u;
                    String g10 = this.f14863y.g();
                    Intrinsics.checkNotNullExpressionValue(g10, "getPurchaseToken(...)");
                    bVar.a(str, g10);
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public final void a(@NotNull v7.k purchase, @NotNull String orderId, @NotNull String productId, boolean isInAppPurchase, @Nullable b timeoutCallback) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Long i10 = dj.b.i(purchase);
        ju.k.d(q0.a(g1.b()), null, null, new c(orderId, productId, isInAppPurchase, timeoutCallback, purchase, ProcessPaymentParams.builder().setCheckoutSessionId(i10 != null ? String.valueOf(i10.longValue()) : null).setPaymentProviderType(ek.t.k() ? "VngGooglePlayStore" : BuildConfig.STORE_TYPE).setProductId(productId).setPackageName(purchase.d()).setOrderId(orderId).setToken(purchase.g()).setIsInApp(isInAppPurchase).build(), null), 3, null);
    }
}
