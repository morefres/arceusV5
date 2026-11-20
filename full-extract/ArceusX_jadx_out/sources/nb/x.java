package nb;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: f, reason: collision with root package name */
    public static final x f26781f = new x((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f26782a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f26783c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26784d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f26785e;

    public x(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(p8.class);
        this.f26785e = enumMap;
        enumMap.put((EnumMap) p8.AD_USER_DATA, (p8) q8.h(bool));
        this.f26782a = i10;
        this.b = l();
        this.f26783c = bool2;
        this.f26784d = str;
    }

    public static x a(n8 n8Var, int i10) {
        EnumMap enumMap = new EnumMap(p8.class);
        enumMap.put((EnumMap) p8.AD_USER_DATA, (p8) n8Var);
        return new x(enumMap, -10, (Boolean) null, (String) null);
    }

    public static x g(String str) {
        if (str == null || str.length() <= 0) {
            return f26781f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(p8.class);
        p8[] a10 = o8.DMA.a();
        int length = a10.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) a10[i11], (p8) q8.j(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new x(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static x h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new x((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(p8.class);
        for (p8 p8Var : o8.DMA.a()) {
            enumMap.put((EnumMap) p8Var, (p8) q8.g(bundle.getString(p8Var.f26558a)));
        }
        return new x(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        n8 g10;
        if (bundle == null || (g10 = q8.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int ordinal = g10.ordinal();
        if (ordinal == 2) {
            return Boolean.FALSE;
        }
        if (ordinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final int b() {
        return this.f26782a;
    }

    public final n8 c() {
        n8 n8Var = (n8) this.f26785e.get(p8.AD_USER_DATA);
        return n8Var == null ? n8.UNINITIALIZED : n8Var;
    }

    public final boolean d() {
        Iterator it = this.f26785e.values().iterator();
        while (it.hasNext()) {
            if (((n8) it.next()) != n8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.b.equalsIgnoreCase(xVar.b) && Objects.equals(this.f26783c, xVar.f26783c)) {
            return Objects.equals(this.f26784d, xVar.f26784d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f26785e.entrySet()) {
            String i10 = q8.i((n8) entry.getValue());
            if (i10 != null) {
                bundle.putString(((p8) entry.getKey()).f26558a, i10);
            }
        }
        Boolean bool = this.f26783c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f26784d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f26783c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f26784d;
        return this.b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f26783c;
    }

    public final String k() {
        return this.f26784d;
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26782a);
        for (p8 p8Var : o8.DMA.a()) {
            sb2.append(":");
            sb2.append(q8.m((n8) this.f26785e.get(p8Var)));
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(q8.d(this.f26782a));
        for (p8 p8Var : o8.DMA.a()) {
            sb2.append(",");
            sb2.append(p8Var.f26558a);
            sb2.append("=");
            n8 n8Var = (n8) this.f26785e.get(p8Var);
            if (n8Var == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = n8Var.ordinal();
                if (ordinal == 0) {
                    sb2.append("uninitialized");
                } else if (ordinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb2.append("denied");
                } else if (ordinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f26783c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f26784d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public x(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(p8.class);
        this.f26785e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f26782a = i10;
        this.b = l();
        this.f26783c = bool;
        this.f26784d = str;
    }
}
