package nb;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class q8 {

    /* renamed from: c, reason: collision with root package name */
    public static final q8 f26588c = new q8(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f26589a;
    public final int b;

    public q8(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(p8.class);
        this.f26589a = enumMap;
        enumMap.put((EnumMap) p8.AD_STORAGE, (p8) h(null));
        enumMap.put((EnumMap) p8.ANALYTICS_STORAGE, (p8) h(null));
        this.b = i10;
    }

    public static q8 a(n8 n8Var, n8 n8Var2, int i10) {
        EnumMap enumMap = new EnumMap(p8.class);
        enumMap.put((EnumMap) p8.AD_STORAGE, (p8) n8Var);
        enumMap.put((EnumMap) p8.ANALYTICS_STORAGE, (p8) n8Var2);
        return new q8(enumMap, -10);
    }

    public static String d(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static q8 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new q8(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(p8.class);
        for (p8 p8Var : o8.STORAGE.b()) {
            enumMap.put((EnumMap) p8Var, (p8) g(bundle.getString(p8Var.f26558a)));
        }
        return new q8(enumMap, i10);
    }

    public static q8 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(p8.class);
        p8[] a10 = o8.STORAGE.a();
        for (int i11 = 0; i11 < a10.length; i11++) {
            String str2 = str == null ? "" : str;
            p8 p8Var = a10[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) p8Var, (p8) j(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) p8Var, (p8) n8.UNINITIALIZED);
            }
        }
        return new q8(enumMap, i10);
    }

    public static n8 g(String str) {
        return str == null ? n8.UNINITIALIZED : str.equals("granted") ? n8.GRANTED : str.equals("denied") ? n8.DENIED : n8.UNINITIALIZED;
    }

    public static n8 h(Boolean bool) {
        return bool == null ? n8.UNINITIALIZED : bool.booleanValue() ? n8.GRANTED : n8.DENIED;
    }

    public static String i(n8 n8Var) {
        int ordinal = n8Var.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public static n8 j(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? n8.UNINITIALIZED : n8.GRANTED : n8.DENIED : n8.POLICY;
    }

    public static char m(n8 n8Var) {
        if (n8Var == null) {
            return '-';
        }
        int ordinal = n8Var.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        Iterator it = this.f26589a.values().iterator();
        while (it.hasNext()) {
            if (((n8) it.next()) != n8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        for (p8 p8Var : o8.STORAGE.b()) {
            if (this.f26589a.get(p8Var) != q8Var.f26589a.get(p8Var)) {
                return false;
            }
        }
        return this.b == q8Var.b;
    }

    public final int hashCode() {
        Iterator it = this.f26589a.values().iterator();
        int i10 = this.b * 17;
        while (it.hasNext()) {
            i10 = (i10 * 31) + ((n8) it.next()).hashCode();
        }
        return i10;
    }

    public final String k() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (p8 p8Var : o8.STORAGE.a()) {
            n8 n8Var = (n8) this.f26589a.get(p8Var);
            char c10 = '-';
            if (n8Var != null && (ordinal = n8Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (p8 p8Var : o8.STORAGE.a()) {
            sb2.append(m((n8) this.f26589a.get(p8Var)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f26589a.entrySet()) {
            String i10 = i((n8) entry.getValue());
            if (i10 != null) {
                bundle.putString(((p8) entry.getKey()).f26558a, i10);
            }
        }
        return bundle;
    }

    public final boolean o(p8 p8Var) {
        return ((n8) this.f26589a.get(p8Var)) != n8.DENIED;
    }

    public final n8 p() {
        n8 n8Var = (n8) this.f26589a.get(p8.AD_STORAGE);
        return n8Var == null ? n8.UNINITIALIZED : n8Var;
    }

    public final n8 q() {
        n8 n8Var = (n8) this.f26589a.get(p8.ANALYTICS_STORAGE);
        return n8Var == null ? n8.UNINITIALIZED : n8Var;
    }

    public final boolean r(q8 q8Var) {
        EnumMap enumMap = this.f26589a;
        for (p8 p8Var : (p8[]) enumMap.keySet().toArray(new p8[0])) {
            n8 n8Var = (n8) enumMap.get(p8Var);
            n8 n8Var2 = (n8) q8Var.f26589a.get(p8Var);
            n8 n8Var3 = n8.DENIED;
            if (n8Var == n8Var3 && n8Var2 != n8Var3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nb.q8 s(nb.q8 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<nb.p8> r1 = nb.p8.class
            r0.<init>(r1)
            nb.o8 r1 = nb.o8.STORAGE
            nb.p8[] r1 = r1.b()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f26589a
            java.lang.Object r5 = r5.get(r4)
            nb.n8 r5 = (nb.n8) r5
            java.util.EnumMap r6 = r9.f26589a
            java.lang.Object r6 = r6.get(r4)
            nb.n8 r6 = (nb.n8) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            nb.n8 r7 = nb.n8.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            nb.n8 r7 = nb.n8.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            nb.n8 r7 = nb.n8.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            nb.n8 r5 = nb.n8.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            nb.q8 r9 = new nb.q8
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.q8.s(nb.q8):nb.q8");
    }

    public final q8 t(q8 q8Var) {
        EnumMap enumMap = new EnumMap(p8.class);
        for (p8 p8Var : o8.STORAGE.b()) {
            n8 n8Var = (n8) this.f26589a.get(p8Var);
            if (n8Var == n8.UNINITIALIZED) {
                n8Var = (n8) q8Var.f26589a.get(p8Var);
            }
            if (n8Var != null) {
                enumMap.put((EnumMap) p8Var, (p8) n8Var);
            }
        }
        return new q8(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.b));
        for (p8 p8Var : o8.STORAGE.b()) {
            sb2.append(",");
            sb2.append(p8Var.f26558a);
            sb2.append("=");
            n8 n8Var = (n8) this.f26589a.get(p8Var);
            if (n8Var == null) {
                n8Var = n8.UNINITIALIZED;
            }
            sb2.append(n8Var);
        }
        return sb2.toString();
    }

    public q8(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(p8.class);
        this.f26589a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i10;
    }
}
