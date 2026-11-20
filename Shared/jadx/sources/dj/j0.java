package dj;

import com.android.billingclient.api.e;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006\u001a!\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0019\u0010\u0017\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv7/k;", "", "e", "(Lv7/k;)Ljava/lang/String;", "Lcom/android/billingclient/api/e;", "c", "(Lcom/android/billingclient/api/e;)Ljava/lang/String;", "", "f", "(Lcom/android/billingclient/api/e;)F", "", "priceAmountMicros", "g", "(J)F", j6.b.f21518e, rl.d.f30696a, "", "offerIds", "h", "(Lcom/android/billingclient/api/e;Ljava/util/Collection;)Ljava/lang/String;", ve.a.f33391e, "", "isSubscription", "i", "(Lcom/android/billingclient/api/e;Z)Z", "j", "(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j0 {
    @Nullable
    public static final String a(@NotNull com.android.billingclient.api.e eVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        List<e.C0119e> f10 = eVar.f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((e.C0119e) obj).a() == null) {
                    break;
                }
            }
            e.C0119e c0119e = (e.C0119e) obj;
            if (c0119e != null) {
                return c0119e.b();
            }
        }
        return null;
    }

    @NotNull
    public static final String b(@NotNull com.android.billingclient.api.e eVar) {
        String d10;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        e.b b = eVar.b();
        return (b == null || (d10 = b.d()) == null) ? "" : d10;
    }

    @NotNull
    public static final String c(@NotNull com.android.billingclient.api.e eVar) {
        String a10;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        e.b b = eVar.b();
        return (b == null || (a10 = b.a()) == null) ? "" : a10;
    }

    @NotNull
    public static final String d(@NotNull com.android.billingclient.api.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        List<e.C0119e> f10 = eVar.f();
        Intrinsics.checkNotNull(f10);
        String b = ((e.C0119e) CollectionsKt.d0(f10)).b();
        Intrinsics.checkNotNullExpressionValue(b, "getOfferToken(...)");
        return b;
    }

    @NotNull
    public static final String e(@NotNull v7.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String b = kVar.b();
        if (b != null) {
            return b;
        }
        String g10 = kVar.g();
        Intrinsics.checkNotNullExpressionValue(g10, "getPurchaseToken(...)");
        return g10;
    }

    public static final float f(@NotNull com.android.billingclient.api.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        e.b b = eVar.b();
        if (b != null) {
            return g(b.c());
        }
        return 0.0f;
    }

    public static final float g(long j10) {
        BigDecimal valueOf = BigDecimal.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf.movePointLeft(6).floatValue();
    }

    @Nullable
    public static final String h(@NotNull com.android.billingclient.api.e eVar, @NotNull Collection<String> offerIds) {
        List<e.C0119e> f10;
        Object obj;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(offerIds, "offerIds");
        if (offerIds.isEmpty() || (f10 = eVar.f()) == null) {
            return null;
        }
        Set Q0 = CollectionsKt.Q0(offerIds);
        Iterator<T> it = f10.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            e.C0119e c0119e = (e.C0119e) obj;
            if (c0119e.a() != null && CollectionsKt.W(Q0, c0119e.a())) {
                break;
            }
        }
        e.C0119e c0119e2 = (e.C0119e) obj;
        if (c0119e2 != null) {
            return c0119e2.b();
        }
        return null;
    }

    public static final boolean i(@NotNull com.android.billingclient.api.e eVar, boolean z10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return z10 ? eVar.f() != null : eVar.b() != null;
    }

    @NotNull
    public static final String j(@Nullable com.android.billingclient.api.e eVar, boolean z10) {
        String str;
        if (eVar == null) {
            return "null";
        }
        if (z10) {
            List<e.C0119e> f10 = eVar.f();
            str = "subscriptionOfferDetails?.size: " + (f10 != null ? Integer.valueOf(f10.size()) : null);
        } else {
            str = "oneTimePurchaseOfferDetails: " + eVar.b();
        }
        return "ProductDetails{ productId: " + eVar.d() + ", isSubscription: " + z10 + ", " + str + " }";
    }
}
