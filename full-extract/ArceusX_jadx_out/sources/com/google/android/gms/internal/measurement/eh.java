package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class eh extends k {

    /* renamed from: c, reason: collision with root package name */
    public final x7 f6481c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6482d;

    public eh(x7 x7Var) {
        super("require");
        this.f6482d = new HashMap();
        this.f6481c = x7Var;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        q qVar;
        v5.a("require", 1, list);
        String zzc = u4Var.a((q) list.get(0)).zzc();
        Map map = this.f6482d;
        if (map.containsKey(zzc)) {
            return (q) map.get(zzc);
        }
        Map map2 = this.f6481c.f6946a;
        if (map2.containsKey(zzc)) {
            try {
                qVar = (q) ((Callable) map2.get(zzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzc)));
            }
        } else {
            qVar = q.f6791yo;
        }
        if (qVar instanceof k) {
            this.f6482d.put(zzc, (k) qVar);
        }
        return qVar;
    }
}
