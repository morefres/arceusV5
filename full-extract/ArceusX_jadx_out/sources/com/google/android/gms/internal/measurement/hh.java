package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class hh {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f6530a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int c(u4 u4Var, p pVar, q qVar) {
        q h10 = pVar.h(u4Var, Collections.singletonList(qVar));
        if (h10 instanceof j) {
            return v5.g(h10.zzd().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f6530a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), pVar);
    }

    public final void b(u4 u4Var, c cVar) {
        z9 z9Var = new z9(cVar);
        TreeMap treeMap = this.f6530a;
        for (Integer num : treeMap.keySet()) {
            b clone = cVar.c().clone();
            int c10 = c(u4Var, (p) treeMap.get(num), z9Var);
            if (c10 == 2 || c10 == -1) {
                cVar.d(clone);
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(u4Var, (p) treeMap2.get((Integer) it.next()), z9Var);
        }
    }
}
