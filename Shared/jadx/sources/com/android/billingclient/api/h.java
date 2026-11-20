package com.android.billingclient.api;

import com.android.billingclient.api.d;

/* loaded from: classes.dex */
public final class h {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;

    /* renamed from: a, reason: collision with root package name */
    public static final d f5203a;
    public static final d b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f5204c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f5205d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f5206e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f5207f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f5208g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f5209h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f5210i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f5211j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f5212k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f5213l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f5214m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f5215n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f5216o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f5217p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f5218q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f5219r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f5220s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f5221t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f5222u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f5223v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f5224w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f5225x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f5226y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f5227z;

    static {
        d.a d10 = d.d();
        d10.d(3);
        d10.b("Google Play In-app Billing API version is less than 3");
        d10.a();
        d.a d11 = d.d();
        d11.d(3);
        d11.b("Google Play In-app Billing API version is less than 9");
        f5203a = d11.a();
        d.a d12 = d.d();
        d12.d(3);
        d12.b("Billing service unavailable on device.");
        b = d12.a();
        d.a d13 = d.d();
        d13.d(2);
        d13.b("Billing service unavailable on device.");
        f5204c = d13.a();
        d.a d14 = d.d();
        d14.d(5);
        d14.b("Client is already in the process of connecting to billing service.");
        f5205d = d14.a();
        d.a d15 = d.d();
        d15.d(5);
        d15.b("The list of SKUs can't be empty.");
        d15.a();
        d.a d16 = d.d();
        d16.d(5);
        d16.b("SKU type can't be empty.");
        d16.a();
        d.a d17 = d.d();
        d17.d(5);
        d17.b("Product type can't be empty.");
        f5206e = d17.a();
        d.a d18 = d.d();
        d18.d(-2);
        d18.b("Client does not support extra params.");
        f5207f = d18.a();
        d.a d19 = d.d();
        d19.d(5);
        d19.b("Invalid purchase token.");
        f5208g = d19.a();
        d.a d20 = d.d();
        d20.d(6);
        d20.b("An internal error occurred.");
        f5209h = d20.a();
        d.a d21 = d.d();
        d21.d(5);
        d21.b("SKU can't be null.");
        d21.a();
        d.a d22 = d.d();
        d22.d(0);
        f5210i = d22.a();
        d.a d23 = d.d();
        d23.d(-1);
        d23.b("Service connection is disconnected.");
        f5211j = d23.a();
        d.a d24 = d.d();
        d24.d(2);
        d24.b("Timeout communicating with service.");
        f5212k = d24.a();
        d.a d25 = d.d();
        d25.d(-2);
        d25.b("Client does not support subscriptions.");
        f5213l = d25.a();
        d.a d26 = d.d();
        d26.d(-2);
        d26.b("Client does not support subscriptions update.");
        f5214m = d26.a();
        d.a d27 = d.d();
        d27.d(-2);
        d27.b("Client does not support get purchase history.");
        d27.a();
        d.a d28 = d.d();
        d28.d(-2);
        d28.b("Client does not support price change confirmation.");
        f5215n = d28.a();
        d.a d29 = d.d();
        d29.d(-2);
        d29.b("Play Store version installed does not support cross selling products.");
        f5216o = d29.a();
        d.a d30 = d.d();
        d30.d(-2);
        d30.b("Client does not support multi-item purchases.");
        f5217p = d30.a();
        d.a d31 = d.d();
        d31.d(-2);
        d31.b("Client does not support offer_id_token.");
        f5218q = d31.a();
        d.a d32 = d.d();
        d32.d(-2);
        d32.b("Play Store version installed does not support gift code purchase.");
        f5219r = d32.a();
        d.a d33 = d.d();
        d33.d(-2);
        d33.b("Client does not support ProductDetails.");
        f5220s = d33.a();
        d.a d34 = d.d();
        d34.d(-2);
        d34.b("Client does not support launching subscription management action flow.");
        d34.a();
        d.a d35 = d.d();
        d35.d(-2);
        d35.b("Client does not support in-app messages.");
        f5221t = d35.a();
        d.a d36 = d.d();
        d36.d(-2);
        d36.b("Client does not support user choice billing.");
        d36.a();
        d.a d37 = d.d();
        d37.d(-2);
        d37.b("Play Store version installed does not support external offer.");
        f5222u = d37.a();
        d.a d38 = d.d();
        d38.d(-2);
        d38.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f5223v = d38.a();
        d.a d39 = d.d();
        d39.d(-2);
        d39.b("Play Store version installed does not support querying AutoPay plan purchase.");
        f5224w = d39.a();
        d.a d40 = d.d();
        d40.d(-2);
        d40.b("Play Store version installed does not support including suspended subscriptions.");
        f5225x = d40.a();
        d.a d41 = d.d();
        d41.d(5);
        d41.b("Unknown feature");
        f5226y = d41.a();
        d.a d42 = d.d();
        d42.d(-2);
        d42.b("Play Store version installed does not support get billing config.");
        f5227z = d42.a();
        d.a d43 = d.d();
        d43.d(-2);
        d43.b("Query product details with serialized docid is not supported.");
        A = d43.a();
        d.a d44 = d.d();
        d44.d(-2);
        d44.b("Play Store version installed does not support launching external offer flow.");
        d44.a();
        d.a d45 = d.d();
        d45.d(4);
        d45.b("Item is unavailable for purchase.");
        B = d45.a();
        d.a d46 = d.d();
        d46.d(-2);
        d46.b("Query product details with developer specified account is not supported.");
        C = d46.a();
        d.a d47 = d.d();
        d47.d(-2);
        d47.b("Play Store version installed does not support alternative billing only.");
        D = d47.a();
        d.a d48 = d.d();
        d48.d(5);
        d48.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        E = d48.a();
        d.a d49 = d.d();
        d49.d(6);
        d49.b("An error occurred while retrieving billing override.");
        F = d49.a();
        d.a d50 = d.d();
        d50.d(-2);
        d50.b("Play Store version installed does not support the provided billing program.");
        G = d50.a();
        d.a d51 = d.d();
        d51.d(-2);
        d51.b("Play Store version installed does not support launching external links.");
        H = d51.a();
        d.a d52 = d.d();
        d52.d(5);
        d52.b("A DeveloperProvidedBillingListener must be provided when initializing the BillingClient in order to use multiple payment options for this billing program.");
        I = d52.a();
        d.a d53 = d.d();
        d53.d(5);
        d53.b("A listener must be provided calling this method.");
        d53.a();
        d.a d54 = d.d();
        d54.d(-2);
        d54.b("Play Store version installed does not support show billing program information dialog.");
        d54.a();
        d.a d55 = d.d();
        d55.d(-2);
        d55.b("Play Store version installed does not support get billing choice info.");
        d55.a();
    }

    public static d a(int i10, String str) {
        d.a d10 = d.d();
        d10.d(i10);
        d10.b(str);
        return d10.a();
    }
}
