package com.google.android.gms.internal.play_billing;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7406a;

    static {
        char[] cArr = new char[80];
        f7406a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(x5 x5Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(x5Var, sb2, 0);
        return sb2.toString();
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        String replace;
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
        c(i10, sb2);
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
        if (!(obj instanceof String)) {
            if (obj instanceof s3) {
                sb2.append(": \"");
                sb2.append(r6.a(((s3) obj).m()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof t4) {
                sb2.append(" {");
                d((t4) obj, sb2, i10 + 2);
                sb2.append("\n");
                c(i10, sb2);
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
            c(i10, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String str2 = (String) obj;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < str2.length(); i13++) {
            char charAt2 = str2.charAt(i13);
            if (charAt2 < ' ' || charAt2 > '~') {
                replace = r6.a(str2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (charAt2 == '\"') {
                z12 = true;
            } else if (charAt2 == '\'') {
                z11 = true;
            } else if (charAt2 == '\\') {
                z10 = true;
            }
        }
        if (z10) {
            str2 = str2.replace("\\", "\\\\");
        }
        replace = z11 ? str2.replace("'", "\\'") : str2;
        if (z12) {
            replace = replace.replace("\"", "\\\"");
        }
        sb2.append(replace);
        sb2.append('\"');
    }

    public static void c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f7406a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018d, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cd, code lost:
    
        if (r13 != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.google.android.gms.internal.play_billing.x5 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.z5.d(com.google.android.gms.internal.play_billing.x5, java.lang.StringBuilder, int):void");
    }
}
