package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends k implements m {

    /* renamed from: c, reason: collision with root package name */
    public final List f6766c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6767d;

    /* renamed from: e, reason: collision with root package name */
    public u4 f6768e;

    public p(p pVar) {
        super(pVar.f6617a);
        ArrayList arrayList = new ArrayList(pVar.f6766c.size());
        this.f6766c = arrayList;
        arrayList.addAll(pVar.f6766c);
        ArrayList arrayList2 = new ArrayList(pVar.f6767d.size());
        this.f6767d = arrayList2;
        arrayList2.addAll(pVar.f6767d);
        this.f6768e = pVar.f6768e;
    }

    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.q
    public final q a() {
        return new p(this);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        u4 c10 = this.f6768e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f6766c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                c10.f((String) list2.get(i10), u4Var.a((q) list.get(i10)));
            } else {
                c10.f((String) list2.get(i10), q.f6791yo);
            }
            i10++;
        }
        for (q qVar : this.f6767d) {
            q a10 = c10.a(qVar);
            if (a10 instanceof r) {
                a10 = c10.a(qVar);
            }
            if (a10 instanceof h) {
                return ((h) a10).b();
            }
        }
        return q.f6791yo;
    }

    public p(String str, List list, List list2, u4 u4Var) {
        super(str);
        this.f6766c = new ArrayList();
        this.f6768e = u4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6766c.add(((q) it.next()).zzc());
            }
        }
        this.f6767d = new ArrayList(list2);
    }
}
