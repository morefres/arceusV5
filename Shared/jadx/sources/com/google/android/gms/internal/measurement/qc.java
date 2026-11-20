package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6800a;

    static {
        char[] cArr = new char[80];
        f6800a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(oc ocVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(ocVar, sb2, 0);
        return sb2.toString();
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        d(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            ha haVar = ha.b;
            sb2.append(jd.a(new ga(((String) obj).getBytes(qb.f6799a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ha) {
            sb2.append(": \"");
            sb2.append(jd.a((ha) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof gb) {
            sb2.append(" {");
            c((gb) obj, sb2, i10 + 2);
            sb2.append("\n");
            d(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        d(i10, sb2);
        sb2.append("}");
    }

    public static void c(oc ocVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = ocVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i10, substring.substring(0, substring.length() - 4), gb.w(method2, ocVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, substring.substring(0, substring.length() - 3), gb.w(method, ocVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object w5 = gb.w(method4, ocVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) gb.w(method5, ocVar, new Object[0])).booleanValue()) {
                        }
                        b(sb2, i10, substring, w5);
                    } else if (w5 instanceof Boolean) {
                        if (!((Boolean) w5).booleanValue()) {
                        }
                        b(sb2, i10, substring, w5);
                    } else if (w5 instanceof Integer) {
                        if (((Integer) w5).intValue() == 0) {
                        }
                        b(sb2, i10, substring, w5);
                    } else if (w5 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) w5).floatValue()) == 0) {
                        }
                        b(sb2, i10, substring, w5);
                    } else if (w5 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) w5).doubleValue()) == 0) {
                        }
                        b(sb2, i10, substring, w5);
                    } else {
                        if (w5 instanceof String) {
                            equals = w5.equals("");
                        } else if (w5 instanceof ha) {
                            equals = w5.equals(ha.b);
                        } else if (w5 instanceof oc) {
                            if (w5 == ((oc) w5).h()) {
                            }
                            b(sb2, i10, substring, w5);
                        } else {
                            if ((w5 instanceof Enum) && ((Enum) w5).ordinal() == 0) {
                            }
                            b(sb2, i10, substring, w5);
                        }
                        if (equals) {
                        }
                        b(sb2, i10, substring, w5);
                    }
                }
            }
            i11 = 3;
        }
        if (ocVar instanceof db) {
            Iterator c10 = ((db) ocVar).zzb.c();
            if (c10.hasNext()) {
                throw null;
            }
        }
        md mdVar = ((gb) ocVar).zzc;
        if (mdVar != null) {
            mdVar.j(sb2, i10);
        }
    }

    public static void d(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f6800a, 0, i11);
            i10 -= i11;
        }
    }
}
