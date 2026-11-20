package nb;

import java.util.EnumMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f26441a;

    public m() {
        this.f26441a = new EnumMap(p8.class);
    }

    public static m d(String str) {
        EnumMap enumMap = new EnumMap(p8.class);
        if (str.length() >= p8.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                p8[] values = p8.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) values[i10], (p8) l.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new m(enumMap);
            }
        }
        return new m();
    }

    public final l a(p8 p8Var) {
        l lVar = (l) this.f26441a.get(p8Var);
        return lVar == null ? l.UNSET : lVar;
    }

    public final void b(p8 p8Var, int i10) {
        l lVar = l.UNSET;
        if (i10 != -30) {
            if (i10 != -20) {
                if (i10 == -10) {
                    lVar = l.MANIFEST;
                } else if (i10 != 0) {
                    if (i10 == 30) {
                        lVar = l.INITIALIZATION;
                    }
                }
            }
            lVar = l.API;
        } else {
            lVar = l.TCF;
        }
        this.f26441a.put((EnumMap) p8Var, (p8) lVar);
    }

    public final void c(p8 p8Var, l lVar) {
        this.f26441a.put((EnumMap) p8Var, (p8) lVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (p8 p8Var : p8.values()) {
            l lVar = (l) this.f26441a.get(p8Var);
            if (lVar == null) {
                lVar = l.UNSET;
            }
            sb2.append(lVar.b());
        }
        return sb2.toString();
    }

    public m(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(p8.class);
        this.f26441a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
