package z;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 implements n0.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37037a;
    public final h0.a b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.h1 f37038c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.g1 f37039d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.p0 f37040e;

    /* renamed from: f, reason: collision with root package name */
    public final q3 f37041f;

    /* renamed from: g, reason: collision with root package name */
    public final long f37042g;

    /* renamed from: i, reason: collision with root package name */
    public final s0.m f37044i;

    /* renamed from: j, reason: collision with root package name */
    public final g0.g0 f37045j;

    /* renamed from: k, reason: collision with root package name */
    public final q2 f37046k;

    /* renamed from: l, reason: collision with root package name */
    public final g0.v f37047l;

    /* renamed from: h, reason: collision with root package name */
    public final Map<String, z0> f37043h = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final Object f37048m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public List<String> f37049n = new ArrayList();

    public a0(Context context, n0.h1 h1Var, g0.v vVar, long j10, g0.g0 g0Var, s0.m mVar) {
        this.f37037a = context;
        this.f37038c = h1Var;
        a0.p0 b = a0.p0.b(context, h1Var.c());
        this.f37040e = b;
        this.f37041f = q3.c(context);
        e0.a aVar = new e0.a(b);
        this.b = aVar;
        n0.g1 g1Var = new n0.g1(aVar, 1);
        this.f37039d = g1Var;
        aVar.c(g1Var);
        this.f37042g = j10;
        this.f37044i = mVar;
        this.f37045j = g0Var;
        this.f37047l = vVar;
        try {
            List<String> asList = Arrays.asList(b.d());
            this.f37046k = new q2(asList, b, h1Var.b());
            e(asList);
        } catch (a0.f e10) {
            throw new g0.p1(a3.a(e10));
        }
    }

    @Override // n0.n0
    public n0.p0 b(String str) {
        synchronized (this.f37048m) {
            if (!this.f37049n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        return new u0(this.f37037a, this.f37040e, str, h(str), this.b, this.f37039d, this.f37038c.b(), this.f37038c.c(), this.f37041f, this.f37042g, this.f37045j);
    }

    @Override // n0.n0
    public n0.a3<List<g0.s>> c() {
        return this.f37046k;
    }

    @Override // n0.n0
    public Set<String> d() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f37048m) {
            linkedHashSet = new LinkedHashSet(this.f37049n);
        }
        return linkedHashSet;
    }

    @Override // n0.r0
    public void e(List<String> list) {
        try {
            List<String> g10 = g(y2.b(this, this.f37047l, new ArrayList(list)));
            synchronized (this.f37048m) {
                try {
                    if (this.f37049n.equals(g10)) {
                        return;
                    }
                    g0.r1.a("Camera2CameraFactory", "Updated available camera list: " + this.f37049n + " -> " + g10);
                    this.f37049n = g10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (g0.p1 e10) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e10);
            throw e10;
        }
    }

    @Override // n0.n0
    public h0.a f() {
        return this.b;
    }

    public final List<String> g(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (x2.a(this.f37040e, str)) {
                arrayList.add(str);
            } else {
                g0.r1.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public z0 h(String str) {
        try {
            z0 z0Var = this.f37043h.get(str);
            if (z0Var != null) {
                return z0Var;
            }
            z0 z0Var2 = new z0(str, this.f37040e, this.f37044i);
            this.f37043h.put(str, z0Var2);
            return z0Var2;
        } catch (a0.f e10) {
            throw a3.a(e10);
        }
    }

    @Override // n0.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a0.p0 a() {
        return this.f37040e;
    }

    @Override // n0.n0
    public void shutdown() {
        this.b.shutdown();
        this.f37046k.h();
    }
}
