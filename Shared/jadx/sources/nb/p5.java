package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public final class p5 {
    public static final AtomicReference b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f26547c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f26548d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final o5 f26549a;

    public p5(o5 o5Var) {
        this.f26549a = o5Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        n9.m.l(strArr);
        n9.m.l(strArr2);
        n9.m.l(atomicReference);
        n9.m.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26549a.zza() ? str : g(str, r8.f26631c, r8.f26630a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26549a.zza() ? str : g(str, s8.b, s8.f26649a, f26547c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f26549a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, t8.b, t8.f26683a, f26548d);
        }
        return "experiment_id(" + str + ")";
    }

    public final String d(zzbg zzbgVar) {
        o5 o5Var = this.f26549a;
        if (!o5Var.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzbgVar.f7473h);
        sb2.append(",name=");
        sb2.append(a(zzbgVar.f7471f));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.f7472g;
        sb2.append(zzbeVar == null ? null : !o5Var.zza() ? zzbeVar.toString() : e(zzbeVar.y3()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f26549a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String e10 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e10 != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(e10);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
