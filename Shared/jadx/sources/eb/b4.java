package eb;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b4 extends e4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15772a;
    public final l1 b;

    public b4(l1 l1Var) {
        l1Var.getClass();
        this.b = l1Var;
        c2 d10 = l1Var.c().d();
        int i10 = 0;
        while (d10.hasNext()) {
            Map.Entry entry = (Map.Entry) d10.next();
            int a10 = ((e4) entry.getKey()).a();
            i10 = i10 < a10 ? a10 : i10;
            int a11 = ((e4) entry.getValue()).a();
            if (i10 < a11) {
                i10 = a11;
            }
        }
        int i11 = i10 + 1;
        this.f15772a = i11;
        if (i11 > 8) {
            throw new u3("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // eb.e4
    public final int a() {
        return this.f15772a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        int size;
        int size2;
        e4 e4Var = (e4) obj;
        if (e4.c((byte) -96) != e4Var.zza()) {
            size2 = e4Var.zza();
            size = e4.c((byte) -96);
        } else {
            b4 b4Var = (b4) e4Var;
            if (this.b.size() == b4Var.b.size()) {
                c2 d10 = this.b.c().d();
                c2 d11 = b4Var.b.c().d();
                do {
                    if (!d10.hasNext() && !d11.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) d10.next();
                    Map.Entry entry2 = (Map.Entry) d11.next();
                    int compareTo2 = ((e4) entry.getKey()).compareTo((e4) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((e4) entry.getValue()).compareTo((e4) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
            size = this.b.size();
            size2 = b4Var.b.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4.class == obj.getClass()) {
            return this.b.equals(((b4) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e4.c((byte) -96)), this.b});
    }

    public final l1 q() {
        return this.b;
    }

    public final String toString() {
        if (this.b.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c2 d10 = this.b.c().d();
        while (d10.hasNext()) {
            Map.Entry entry = (Map.Entry) d10.next();
            linkedHashMap.put(((e4) entry.getKey()).toString().replace("\n", "\n  "), ((e4) entry.getValue()).toString().replace("\n", "\n  "));
        }
        e0 a10 = e0.a(",\n  ");
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            d0.a(sb2, linkedHashMap.entrySet().iterator(), a10, " : ");
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c((byte) -96);
    }
}
