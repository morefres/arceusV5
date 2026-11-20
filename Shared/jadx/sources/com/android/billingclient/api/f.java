package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.n0;
import java.util.HashSet;
import java.util.List;
import v7.y1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f5197a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public n0 f5198a;

        public /* synthetic */ a(y1 y1Var) {
        }

        @NonNull
        public f a() {
            if (this.f5198a != null) {
                return new f(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        public a b(@NonNull List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.d())) {
                    hashSet.add(bVar.d());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f5198a = n0.i(list);
            return this;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f5199a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5200c;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public String f5201a;
            public String b;

            /* renamed from: c, reason: collision with root package name */
            public String f5202c;

            public /* synthetic */ a(y1 y1Var) {
            }

            @NonNull
            public b a() {
                String str = this.f5202c;
                if ("first_party".equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.b == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            public a b(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                this.f5202c = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, y1 y1Var) {
            this.b = aVar.b;
            this.f5200c = aVar.f5202c;
            this.f5199a = aVar.f5201a;
        }

        @NonNull
        public static a b() {
            return new a(null);
        }

        public String a() {
            return this.f5199a;
        }

        @NonNull
        public final String c() {
            return this.b;
        }

        @NonNull
        public final String d() {
            return this.f5200c;
        }
    }

    public /* synthetic */ f(a aVar, y1 y1Var) {
        this.f5197a = aVar.f5198a;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    public final n0 b() {
        return this.f5197a;
    }

    @NonNull
    public final String c() {
        return ((b) this.f5197a.get(0)).d();
    }
}
