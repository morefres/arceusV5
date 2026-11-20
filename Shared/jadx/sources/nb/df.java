package nb;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class df {

    /* renamed from: a, reason: collision with root package name */
    public String f26168a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.f7 f26169c;

    /* renamed from: d, reason: collision with root package name */
    public BitSet f26170d;

    /* renamed from: e, reason: collision with root package name */
    public BitSet f26171e;

    /* renamed from: f, reason: collision with root package name */
    public Map f26172f;

    /* renamed from: g, reason: collision with root package name */
    public Map f26173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f26174h;

    public /* synthetic */ df(e eVar, String str, com.google.android.gms.internal.measurement.f7 f7Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f26174h = eVar;
        this.f26168a = str;
        this.f26170d = bitSet;
        this.f26171e = bitSet2;
        this.f26172f = map;
        this.f26173g = new w1.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f26173g.put(num, arrayList);
        }
        this.b = false;
        this.f26169c = f7Var;
    }

    public final void a(@NonNull c cVar) {
        int a10 = cVar.a();
        if (cVar.f26081c != null) {
            this.f26171e.set(a10, true);
        }
        Boolean bool = cVar.f26082d;
        if (bool != null) {
            this.f26170d.set(a10, bool.booleanValue());
        }
        if (cVar.f26083e != null) {
            Map map = this.f26172f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = (Long) map.get(valueOf);
            long longValue = cVar.f26083e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f26172f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (cVar.f26084f != null) {
            Map map2 = this.f26173g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f26173g.put(valueOf2, list);
            }
            if (cVar.b()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.ye.a();
            g7 g7Var = this.f26174h.f26328a;
            k w5 = g7Var.w();
            String str = this.f26168a;
            y4 y4Var = z4.G0;
            if (w5.H(str, y4Var) && cVar.c()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.ye.a();
            if (!g7Var.w().H(this.f26168a, y4Var)) {
                list.add(Long.valueOf(cVar.f26084f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(cVar.f26084f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    @NonNull
    public final com.google.android.gms.internal.measurement.c6 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.b6 O = com.google.android.gms.internal.measurement.c6.O();
        O.x(i10);
        O.C(this.b);
        com.google.android.gms.internal.measurement.f7 f7Var = this.f26169c;
        if (f7Var != null) {
            O.A(f7Var);
        }
        com.google.android.gms.internal.measurement.e7 P = com.google.android.gms.internal.measurement.f7.P();
        P.A(re.Q(this.f26170d));
        P.x(re.Q(this.f26171e));
        Map map = this.f26172f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f26172f.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.f26172f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.l6 K = com.google.android.gms.internal.measurement.m6.K();
                    K.x(intValue);
                    K.z(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.m6) K.t());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            P.D(arrayList);
        }
        Map map2 = this.f26173g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f26173g.keySet()) {
                com.google.android.gms.internal.measurement.g7 L = com.google.android.gms.internal.measurement.h7.L();
                L.x(num2.intValue());
                List list2 = (List) this.f26173g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    L.z(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.h7) L.t());
            }
            list = arrayList3;
        }
        P.G(list);
        O.z(P);
        return (com.google.android.gms.internal.measurement.c6) O.t();
    }

    public final /* synthetic */ BitSet c() {
        return this.f26170d;
    }

    public /* synthetic */ df(e eVar, String str, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f26174h = eVar;
        this.f26168a = str;
        this.b = true;
        this.f26170d = new BitSet();
        this.f26171e = new BitSet();
        this.f26172f = new w1.a();
        this.f26173g = new w1.a();
    }
}
