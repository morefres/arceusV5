package jg;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Excluder f21725a = Excluder.DEFAULT;
    public v b = v.f21748a;

    /* renamed from: c, reason: collision with root package name */
    public d f21726c = c.f21684a;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Type, h<?>> f21727d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final List<b0> f21728e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List<b0> f21729f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f21730g = false;

    /* renamed from: h, reason: collision with root package name */
    public String f21731h = f.B;

    /* renamed from: i, reason: collision with root package name */
    public int f21732i = 2;

    /* renamed from: j, reason: collision with root package name */
    public int f21733j = 2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21734k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21735l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21736m = true;

    /* renamed from: n, reason: collision with root package name */
    public e f21737n = f.A;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21738o = false;

    /* renamed from: p, reason: collision with root package name */
    public x f21739p = f.f21695z;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21740q = true;

    /* renamed from: r, reason: collision with root package name */
    public z f21741r = f.D;

    /* renamed from: s, reason: collision with root package name */
    public z f21742s = f.E;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque<w> f21743t = new ArrayDeque<>();

    public static void a(String str, int i10, int i11, List<b0> list) {
        b0 b0Var;
        b0 b0Var2;
        boolean z10 = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        b0 b0Var3 = null;
        if (str != null && !str.trim().isEmpty()) {
            b0Var = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z10) {
                b0Var3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                b0Var2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            }
            b0Var2 = null;
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            b0 createAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i10, i11);
            if (z10) {
                b0Var3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i10, i11);
                b0 createAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i10, i11);
                b0Var = createAdapterFactory;
                b0Var2 = createAdapterFactory2;
            } else {
                b0Var = createAdapterFactory;
                b0Var2 = null;
            }
        }
        list.add(b0Var);
        if (z10) {
            list.add(b0Var3);
            list.add(b0Var2);
        }
    }

    public static boolean c(Type type) {
        return type == Object.class;
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f21728e.size() + this.f21729f.size() + 3);
        arrayList.addAll(this.f21728e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f21729f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f21731h, this.f21732i, this.f21733j, arrayList);
        return new f(this.f21725a, this.f21726c, new HashMap(this.f21727d), this.f21730g, this.f21734k, this.f21738o, this.f21736m, this.f21737n, this.f21739p, this.f21735l, this.f21740q, this.b, this.f21731h, this.f21732i, this.f21733j, new ArrayList(this.f21728e), new ArrayList(this.f21729f), arrayList, this.f21741r, this.f21742s, new ArrayList(this.f21743t));
    }

    public g d(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z10 = obj instanceof t;
        if (!z10 && !(obj instanceof k) && !(obj instanceof h) && !(obj instanceof a0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (c(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof h) {
            this.f21727d.put(type, (h) obj);
        }
        if (z10 || (obj instanceof k)) {
            this.f21728e.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof a0) {
            this.f21728e.add(TypeAdapters.newFactory(TypeToken.get(type), (a0) obj));
        }
        return this;
    }

    public g e(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f21728e.add(b0Var);
        return this;
    }

    public g f() {
        this.f21730g = true;
        return this;
    }

    public g g(c cVar) {
        return h(cVar);
    }

    public g h(d dVar) {
        Objects.requireNonNull(dVar);
        this.f21726c = dVar;
        return this;
    }
}
