package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5154a;
    public final JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5155c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5156d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5157e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5158f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5159g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5160h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5161i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5162j;

    /* renamed from: k, reason: collision with root package name */
    public final List f5163k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f5164a;
        public final int b;

        public a(JSONObject jSONObject) {
            this.f5164a = jSONObject.getInt("commitmentPaymentsCount");
            this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f5165a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5166c;

        /* renamed from: d, reason: collision with root package name */
        public final String f5167d;

        /* renamed from: e, reason: collision with root package name */
        public final String f5168e;

        /* renamed from: f, reason: collision with root package name */
        public final String f5169f;

        /* renamed from: g, reason: collision with root package name */
        public final List f5170g;

        /* renamed from: h, reason: collision with root package name */
        public final Long f5171h;

        /* renamed from: i, reason: collision with root package name */
        public final a f5172i;

        /* renamed from: j, reason: collision with root package name */
        public final C0118e f5173j;

        /* renamed from: k, reason: collision with root package name */
        public final C0117b f5174k;

        /* renamed from: l, reason: collision with root package name */
        public final String f5175l;

        /* renamed from: m, reason: collision with root package name */
        public final c f5176m;

        /* renamed from: n, reason: collision with root package name */
        public final d f5177n;

        /* renamed from: o, reason: collision with root package name */
        public final i f5178o;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f5179a;
            public final C0116a b;

            /* renamed from: com.android.billingclient.api.e$b$a$a, reason: collision with other inner class name */
            public static final class C0116a {

                /* renamed from: a, reason: collision with root package name */
                public final String f5180a;
                public final long b;

                /* renamed from: c, reason: collision with root package name */
                public final String f5181c;

                public C0116a(JSONObject jSONObject) {
                    this.f5180a = jSONObject.optString("formattedDiscountAmount");
                    this.b = jSONObject.optLong("discountAmountMicros");
                    this.f5181c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            public a(JSONObject jSONObject) {
                this.f5179a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject optJSONObject = jSONObject.optJSONObject("discountAmount");
                this.b = optJSONObject != null ? new C0116a(optJSONObject) : null;
            }
        }

        /* renamed from: com.android.billingclient.api.e$b$b, reason: collision with other inner class name */
        public static final class C0117b {

            /* renamed from: a, reason: collision with root package name */
            public final int f5182a;
            public final int b;

            public C0117b(JSONObject jSONObject) {
                this.f5182a = jSONObject.getInt("maximumQuantity");
                this.b = jSONObject.getInt("remainingQuantity");
            }
        }

        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public final long f5183a;
            public final long b;

            public c(JSONObject jSONObject) {
                this.f5183a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }
        }

        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            public final String f5184a;
            public final String b;

            public d(JSONObject jSONObject) {
                this.f5184a = jSONObject.getString("rentalPeriod");
                String optString = jSONObject.optString("rentalExpirationPeriod");
                this.b = true == optString.isEmpty() ? null : optString;
            }
        }

        /* renamed from: com.android.billingclient.api.e$b$e, reason: collision with other inner class name */
        public static final class C0118e {

            /* renamed from: a, reason: collision with root package name */
            public final Long f5185a;
            public final Long b;

            public C0118e(JSONObject jSONObject) {
                this.f5185a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        public b(JSONObject jSONObject) {
            this.f5165a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5166c = jSONObject.optString("priceCurrencyCode");
            String optString = jSONObject.optString("offerIdToken");
            this.f5167d = true == optString.isEmpty() ? null : optString;
            String optString2 = jSONObject.optString("offerId");
            this.f5168e = true == optString2.isEmpty() ? null : optString2;
            String optString3 = jSONObject.optString("purchaseOptionId");
            this.f5169f = true == optString3.isEmpty() ? null : optString3;
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            this.f5170g = new ArrayList();
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.f5170g.add(optJSONArray.getString(i10));
                }
            }
            this.f5171h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f5172i = optJSONObject == null ? null : new a(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f5173j = optJSONObject2 == null ? null : new C0118e(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f5174k = optJSONObject3 == null ? null : new C0117b(optJSONObject3);
            this.f5175l = jSONObject.optString("serializedDocid");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f5176m = optJSONObject4 == null ? null : new c(optJSONObject4);
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f5177n = optJSONObject5 == null ? null : new d(optJSONObject5);
            JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f5178o = optJSONObject6 != null ? new i(optJSONObject6) : null;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (optJSONArray2 == null) {
                return;
            }
            new d(optJSONArray2);
        }

        @NonNull
        public String a() {
            return this.f5165a;
        }

        public String b() {
            return this.f5167d;
        }

        public long c() {
            return this.b;
        }

        @NonNull
        public String d() {
            return this.f5166c;
        }

        public final i e() {
            return this.f5178o;
        }

        public final String f() {
            return this.f5175l;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f5186a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5187c;

        /* renamed from: d, reason: collision with root package name */
        public final String f5188d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5189e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5190f;

        public c(JSONObject jSONObject) {
            this.f5188d = jSONObject.optString("billingPeriod");
            this.f5187c = jSONObject.optString("priceCurrencyCode");
            this.f5186a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5190f = jSONObject.optInt("recurrenceMode");
            this.f5189e = jSONObject.optInt("billingCycleCount");
        }

        @NonNull
        public String a() {
            return this.f5186a;
        }

        public long b() {
            return this.b;
        }

        @NonNull
        public String c() {
            return this.f5187c;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final List f5191a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        arrayList.add(new c(optJSONObject));
                    }
                }
            }
            this.f5191a = arrayList;
        }

        @NonNull
        public List<c> a() {
            return this.f5191a;
        }
    }

    /* renamed from: com.android.billingclient.api.e$e, reason: collision with other inner class name */
    public static final class C0119e {

        /* renamed from: a, reason: collision with root package name */
        public final String f5192a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5193c;

        /* renamed from: d, reason: collision with root package name */
        public final d f5194d;

        /* renamed from: e, reason: collision with root package name */
        public final List f5195e;

        /* renamed from: f, reason: collision with root package name */
        public final a f5196f;

        public C0119e(JSONObject jSONObject) {
            this.f5192a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.b = true == optString.isEmpty() ? null : optString;
            this.f5193c = jSONObject.getString("offerIdToken");
            this.f5194d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f5196f = optJSONObject != null ? new a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (optJSONObject2 != null) {
                optJSONObject2.getString("productId");
                optJSONObject2.optString(Title.type);
                optJSONObject2.optString("name");
                optJSONObject2.optString("description");
                optJSONObject2.optString("basePlanId");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
                if (optJSONObject3 != null) {
                    new c(optJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f5195e = arrayList;
        }

        public String a() {
            return this.b;
        }

        @NonNull
        public String b() {
            return this.f5193c;
        }

        @NonNull
        public d c() {
            return this.f5194d;
        }
    }

    public e(String str) {
        this.f5154a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f5155c = optString;
        String optString2 = jSONObject.optString(Payload.TYPE);
        this.f5156d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f5157e = jSONObject.optString(Title.type);
        this.f5158f = jSONObject.optString("name");
        this.f5159g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f5160h = jSONObject.optString("skuDetailsToken");
        this.f5161i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(new C0119e(optJSONArray.getJSONObject(i10)));
            }
            this.f5162j = arrayList;
        } else {
            this.f5162j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                arrayList2.add(new b(optJSONArray2.getJSONObject(i11)));
            }
            this.f5163k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f5163k = null;
        } else {
            arrayList2.add(new b(optJSONObject));
            this.f5163k = arrayList2;
        }
    }

    @NonNull
    public String a() {
        return this.f5159g;
    }

    public b b() {
        List list = this.f5163k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List<b> c() {
        return this.f5163k;
    }

    @NonNull
    public String d() {
        return this.f5155c;
    }

    @NonNull
    public String e() {
        return this.f5156d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return TextUtils.equals(this.f5154a, ((e) obj).f5154a);
        }
        return false;
    }

    public List<C0119e> f() {
        return this.f5162j;
    }

    @NonNull
    public final String g() {
        return this.b.optString("packageName");
    }

    public final String h() {
        return this.f5160h;
    }

    public int hashCode() {
        return this.f5154a.hashCode();
    }

    public final String i(String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f5163k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.f()) && Objects.equals(bVar.b(), str)) {
                    return bVar.f();
                }
            }
        }
        return this.f5161i;
    }

    @NonNull
    public String toString() {
        List list = this.f5162j;
        return "ProductDetails{jsonString='" + this.f5154a + "', parsedJson=" + this.b.toString() + ", productId='" + this.f5155c + "', productType='" + this.f5156d + "', title='" + this.f5157e + "', productDetailsToken='" + this.f5160h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
