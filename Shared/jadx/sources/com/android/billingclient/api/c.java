package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.billingclient.api.e;
import com.google.android.gms.internal.play_billing.n0;
import com.google.android.gms.internal.play_billing.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v7.g1;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5133a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f5134c;

    /* renamed from: d, reason: collision with root package name */
    public C0115c f5135d;

    /* renamed from: e, reason: collision with root package name */
    public n0 f5136e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f5137f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5138g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f5139a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public List f5140c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5141d;

        /* renamed from: e, reason: collision with root package name */
        public C0115c.a f5142e;

        public /* synthetic */ a(g1 g1Var) {
            C0115c.a a10 = C0115c.a();
            C0115c.a.b(a10);
            this.f5142e = a10;
        }

        @NonNull
        public c a() {
            List list = this.f5140c;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            List list2 = this.f5140c;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
            }
            c cVar = new c(null);
            cVar.f5133a = !((b) this.f5140c.get(0)).c().g().isEmpty();
            cVar.b = this.f5139a;
            cVar.f5134c = this.b;
            cVar.f5135d = this.f5142e.a();
            cVar.f5137f = new ArrayList();
            cVar.f5138g = this.f5141d;
            List list3 = this.f5140c;
            cVar.f5136e = list3 != null ? n0.i(list3) : n0.k();
            cVar.getClass();
            return cVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f5139a = str;
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public a d(@NonNull List<b> list) {
            this.f5140c = new ArrayList(list);
            return this;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final e f5143a;
        public final String b;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public e f5144a;
            public String b;

            public /* synthetic */ a(g1 g1Var) {
            }

            public static /* bridge */ /* synthetic */ C0114b d(a aVar) {
                aVar.getClass();
                return null;
            }

            @NonNull
            public b a() {
                x.c(this.f5144a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            @NonNull
            public a b(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.b = str;
                return this;
            }

            @NonNull
            public a c(@NonNull e eVar) {
                this.f5144a = eVar;
                if (eVar.b() != null) {
                    eVar.b().getClass();
                    e.b b = eVar.b();
                    if (b.b() != null) {
                        this.b = b.b();
                    }
                }
                return this;
            }
        }

        /* renamed from: com.android.billingclient.api.c$b$b, reason: collision with other inner class name */
        public static class C0114b {
        }

        public /* synthetic */ b(a aVar, g1 g1Var) {
            this.f5143a = aVar.f5144a;
            this.b = aVar.b;
            a.d(aVar);
        }

        @NonNull
        public static a b() {
            return new a(null);
        }

        public C0114b a() {
            return null;
        }

        @NonNull
        public final e c() {
            return this.f5143a;
        }

        public final String d() {
            return this.b;
        }
    }

    /* renamed from: com.android.billingclient.api.c$c, reason: collision with other inner class name */
    public static class C0115c {

        /* renamed from: a, reason: collision with root package name */
        public String f5145a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public int f5146c = 0;

        /* renamed from: com.android.billingclient.api.c$c$a */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public String f5147a;
            public String b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f5148c;

            /* renamed from: d, reason: collision with root package name */
            public int f5149d = 0;

            public /* synthetic */ a(g1 g1Var) {
            }

            public static /* synthetic */ a b(a aVar) {
                aVar.f5148c = true;
                return aVar;
            }

            @NonNull
            public C0115c a() {
                boolean z10 = true;
                g1 g1Var = null;
                if (TextUtils.isEmpty(this.f5147a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.b);
                if (z10 && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f5148c && !z10 && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0115c c0115c = new C0115c(g1Var);
                c0115c.f5145a = this.f5147a;
                c0115c.f5146c = this.f5149d;
                c0115c.b = this.b;
                return c0115c;
            }
        }

        public /* synthetic */ C0115c(g1 g1Var) {
        }

        @NonNull
        public static a a() {
            return new a(null);
        }

        public final int b() {
            return this.f5146c;
        }

        public final String c() {
            return this.f5145a;
        }

        public final String d() {
            return this.b;
        }
    }

    public /* synthetic */ c(g1 g1Var) {
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    public v7.g a() {
        return null;
    }

    public int c() {
        return 0;
    }

    public final int d() {
        return this.f5135d.b();
    }

    public long e() {
        return 0L;
    }

    public final d f() {
        e.b bVar;
        if (this.f5136e.isEmpty()) {
            return h.f5210i;
        }
        b bVar2 = (b) this.f5136e.get(0);
        for (int i10 = 1; i10 < this.f5136e.size(); i10++) {
            b bVar3 = (b) this.f5136e.get(i10);
            if (!bVar3.c().e().equals(bVar2.c().e()) && !bVar3.c().e().equals("play_pass_subs")) {
                return h.a(5, "All products should have same ProductType.");
            }
        }
        String g10 = bVar2.c().g();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        n0 n0Var = this.f5136e;
        int size = n0Var.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar4 = (b) n0Var.get(i11);
            bVar4.a();
            if (bVar4.c().f() != null && bVar4.d() == null) {
                return h.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", bVar4.c().d()));
            }
            if (hashMap.containsKey(bVar4.c().d())) {
                return h.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar4.c().d()));
            }
            hashMap.put(bVar4.c().d(), bVar4);
            if (!bVar2.c().e().equals("play_pass_subs") && !bVar4.c().e().equals("play_pass_subs") && !g10.equals(bVar4.c().g())) {
                return h.a(5, "All products must have the same package name.");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashMap.containsKey(str)) {
                ((b) hashMap.get(str)).a();
                return h.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List<e.b> c10 = bVar2.c().c();
        String d10 = bVar2.d();
        if (d10 != null && c10 != null) {
            Iterator<e.b> it2 = c10.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it2.next();
                if (d10.equals(bVar.b())) {
                    break;
                }
            }
            if (bVar != null && bVar.e() != null) {
                return h.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return h.f5210i;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.f5134c;
    }

    @Deprecated
    public String i() {
        return null;
    }

    @Deprecated
    public final String j() {
        return this.f5135d.c();
    }

    public final String k() {
        return this.f5135d.d();
    }

    @NonNull
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5137f);
        return arrayList;
    }

    @NonNull
    public final List m() {
        return this.f5136e;
    }

    public final boolean v() {
        return this.f5138g;
    }

    public final boolean w() {
        if (this.b != null || this.f5134c != null || this.f5135d.d() != null || this.f5135d.b() != 0 || this.f5133a || this.f5138g) {
            return true;
        }
        n0 n0Var = this.f5136e;
        if (n0Var != null) {
            int size = n0Var.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) n0Var.get(i10)).a();
            }
        }
        return false;
    }
}
