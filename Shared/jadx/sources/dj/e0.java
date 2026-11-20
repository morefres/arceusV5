package dj;

import com.android.billingclient.api.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\b\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 \"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"!\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0003\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"\"!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b)\u0010\u0003¨\u0006+"}, d2 = {"", "", "e", "()Ljava/util/List;", "f", "productId", "", "m", "(Ljava/lang/String;)Z", "l", "Lv7/k;", "purchase", "o", "(Lv7/k;)Z", "n", "Lcom/android/billingclient/api/e;", "Lcom/android/billingclient/api/e$e;", rl.d.f30696a, "(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e$e;", "Lcom/android/billingclient/api/e$c;", "c", "(Lcom/android/billingclient/api/e$e;)Lcom/android/billingclient/api/e$c;", "productDetails", "isSubscriptionPurchase", "i", "(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;", "g", "", "h", "(Lcom/android/billingclient/api/e;Z)J", "currentProductId", "p", "(Ljava/lang/String;Ljava/lang/String;)Z", ve.a.f33391e, "Ljava/util/List;", "IN_APP_PRODUCT_LIST", j6.b.f21518e, "Lgt/h;", "j", "serverInAppProductList", "SUBSCRIPTION_PRODUCT_LIST", "k", "serverSubscriptionProductList", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f14848a = kotlin.collections.p.n("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", "com.roblox.robloxmobile.premium4500robux", "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", "com.roblox.robloxmobile.premium265subscribed", "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed");

    @NotNull
    public static final gt.h b = gt.i.b(new Function0() { // from class: dj.c0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List q10;
            q10 = e0.q();
            return q10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<String> f14849c = kotlin.collections.p.n("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final gt.h f14850d = gt.i.b(new Function0() { // from class: dj.d0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List r8;
            r8 = e0.r();
            return r8;
        }
    });

    public static final e.c c(e.C0119e c0119e) {
        List<e.c> a10 = c0119e.c().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getPricingPhaseList(...)");
        Object d02 = CollectionsKt.d0(a10);
        Intrinsics.checkNotNullExpressionValue(d02, "first(...)");
        return (e.c) d02;
    }

    public static final e.C0119e d(com.android.billingclient.api.e eVar) {
        List<e.C0119e> f10 = eVar.f();
        Intrinsics.checkNotNull(f10);
        Object d02 = CollectionsKt.d0(f10);
        Intrinsics.checkNotNullExpressionValue(d02, "first(...)");
        return (e.C0119e) d02;
    }

    @NotNull
    public static final List<String> e() {
        return j();
    }

    @NotNull
    public static final List<String> f() {
        return k();
    }

    @NotNull
    public static final String g(@NotNull com.android.billingclient.api.e productDetails, boolean z10) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        if (z10) {
            String a10 = c(d(productDetails)).a();
            Intrinsics.checkNotNull(a10);
            return a10;
        }
        e.b b10 = productDetails.b();
        Intrinsics.checkNotNull(b10);
        String a11 = b10.a();
        Intrinsics.checkNotNull(a11);
        return a11;
    }

    public static final long h(@NotNull com.android.billingclient.api.e productDetails, boolean z10) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        if (z10) {
            return c(d(productDetails)).b();
        }
        e.b b10 = productDetails.b();
        Intrinsics.checkNotNull(b10);
        return b10.c();
    }

    @NotNull
    public static final String i(@NotNull com.android.billingclient.api.e productDetails, boolean z10) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        if (z10) {
            String c10 = c(d(productDetails)).c();
            Intrinsics.checkNotNull(c10);
            return c10;
        }
        e.b b10 = productDetails.b();
        Intrinsics.checkNotNull(b10);
        String d10 = b10.d();
        Intrinsics.checkNotNull(d10);
        return d10;
    }

    public static final List<String> j() {
        return (List) b.getValue();
    }

    public static final List<String> k() {
        return (List) f14850d.getValue();
    }

    public static final boolean l(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return StringsKt.split$default(productId, new String[]{"."}, false, 0, 6, null).contains("nonconsumable");
    }

    public static final boolean m(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return StringsKt.split$default(productId, new String[]{"."}, false, 0, 6, null).contains("playpoints");
    }

    public static final boolean n(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return f().contains(productId);
    }

    public static final boolean o(@NotNull v7.k purchase) {
        boolean z10;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        String j10 = b.j(purchase);
        if (!e().contains(j10)) {
            Intrinsics.checkNotNull(j10);
            if (!m(j10)) {
                z10 = false;
                Intrinsics.checkNotNull(j10);
                return (n(j10) && z10) ? false : true;
            }
        }
        z10 = true;
        Intrinsics.checkNotNull(j10);
        if (n(j10)) {
        }
    }

    public static final boolean p(@Nullable String str, @Nullable String str2) {
        if (str2 == null || str == null) {
            return false;
        }
        return Intrinsics.c(str2, str);
    }

    public static final List q() {
        String O3 = rh.h.a().O3();
        return (O3 == null || O3.length() == 0) ? f14848a : StringsKt.split$default(O3, new String[]{","}, false, 0, 6, null);
    }

    public static final List r() {
        String H0 = rh.h.a().H0();
        return (H0 == null || H0.length() == 0) ? f14849c : StringsKt.split$default(H0, new String[]{","}, false, 0, 6, null);
    }
}
