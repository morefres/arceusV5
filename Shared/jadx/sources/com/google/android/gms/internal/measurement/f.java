package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f implements Iterable, q, m {

    /* renamed from: a, reason: collision with root package name */
    public final SortedMap f6483a;
    public final Map b;

    public f() {
        this.f6483a = new TreeMap();
        this.b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        f fVar = new f();
        for (Map.Entry entry : this.f6483a.entrySet()) {
            if (entry.getValue() instanceof m) {
                fVar.f6483a.put((Integer) entry.getKey(), (q) entry.getValue());
            } else {
                fVar.f6483a.put((Integer) entry.getKey(), ((q) entry.getValue()).a());
            }
        }
        return fVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q c(String str) {
        q qVar;
        return "length".equals(str) ? new j(Double.valueOf(k())) : (!g(str) || (qVar = (q) this.b.get(str)) == null) ? q.f6791yo : qVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void d(String str, q qVar) {
        if (qVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, u4 u4Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? d0.a(str, this, u4Var, list) : m.b(this, new u(str), u4Var, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (k() != fVar.k()) {
            return false;
        }
        SortedMap sortedMap = this.f6483a;
        if (sortedMap.isEmpty()) {
            return fVar.f6483a.isEmpty();
        }
        for (int intValue = ((Integer) sortedMap.firstKey()).intValue(); intValue <= ((Integer) sortedMap.lastKey()).intValue(); intValue++) {
            if (!m(intValue).equals(fVar.m(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean g(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final List h() {
        ArrayList arrayList = new ArrayList(k());
        for (int i10 = 0; i10 < k(); i10++) {
            arrayList.add(m(i10));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f6483a.hashCode() * 31;
    }

    public final Iterator i() {
        return this.f6483a.keySet().iterator();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    public final int k() {
        SortedMap sortedMap = this.f6483a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int l() {
        return this.f6483a.size();
    }

    public final q m(int i10) {
        q qVar;
        if (i10 < k()) {
            return (!t(i10) || (qVar = (q) this.f6483a.get(Integer.valueOf(i10))) == null) ? q.f6791yo : qVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void p(int i10, q qVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (qVar == null) {
            this.f6483a.remove(Integer.valueOf(i10));
        } else {
            this.f6483a.put(Integer.valueOf(i10), qVar);
        }
    }

    public final boolean t(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f6483a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final String toString() {
        return z(",");
    }

    public final void u() {
        this.f6483a.clear();
    }

    public final void v(int i10, q qVar) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= k()) {
            p(i10, qVar);
            return;
        }
        SortedMap sortedMap = this.f6483a;
        for (int intValue = ((Integer) sortedMap.lastKey()).intValue(); intValue >= i10; intValue--) {
            Integer valueOf = Integer.valueOf(intValue);
            q qVar2 = (q) sortedMap.get(valueOf);
            if (qVar2 != null) {
                p(intValue + 1, qVar2);
                sortedMap.remove(valueOf);
            }
        }
        p(i10, qVar);
    }

    public final void y(int i10) {
        SortedMap sortedMap = this.f6483a;
        int intValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > intValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == intValue) {
            int i11 = i10 - 1;
            Integer valueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(valueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(valueOf, q.f6791yo);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i10);
            q qVar = (q) sortedMap.get(valueOf2);
            if (qVar != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), qVar);
                sortedMap.remove(valueOf2);
            }
        }
    }

    public final String z(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f6483a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= k()) {
                    break;
                }
                q m10 = m(i10);
                sb2.append(str2);
                if (!(m10 instanceof v) && !(m10 instanceof o)) {
                    sb2.append(m10.zzc());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return z(",");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        SortedMap sortedMap = this.f6483a;
        return sortedMap.size() == 1 ? m(0).zzd() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return new d(this, this.f6483a.keySet().iterator(), this.b.keySet().iterator());
    }

    public f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                p(i10, (q) list.get(i10));
            }
        }
    }
}
