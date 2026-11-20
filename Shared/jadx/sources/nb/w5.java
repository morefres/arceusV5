package nb;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class w5 extends k8 {

    /* renamed from: c, reason: collision with root package name */
    public char f26759c;

    /* renamed from: d, reason: collision with root package name */
    public long f26760d;

    /* renamed from: e, reason: collision with root package name */
    public String f26761e;

    /* renamed from: f, reason: collision with root package name */
    public final u5 f26762f;

    /* renamed from: g, reason: collision with root package name */
    public final u5 f26763g;

    /* renamed from: h, reason: collision with root package name */
    public final u5 f26764h;

    /* renamed from: i, reason: collision with root package name */
    public final u5 f26765i;

    /* renamed from: j, reason: collision with root package name */
    public final u5 f26766j;

    /* renamed from: k, reason: collision with root package name */
    public final u5 f26767k;

    /* renamed from: l, reason: collision with root package name */
    public final u5 f26768l;

    /* renamed from: m, reason: collision with root package name */
    public final u5 f26769m;

    /* renamed from: n, reason: collision with root package name */
    public final u5 f26770n;

    public w5(g7 g7Var) {
        super(g7Var);
        this.f26759c = (char) 0;
        this.f26760d = -1L;
        this.f26762f = new u5(this, 6, false, false);
        this.f26763g = new u5(this, 6, true, false);
        this.f26764h = new u5(this, 6, false, true);
        this.f26765i = new u5(this, 5, false, false);
        this.f26766j = new u5(this, 5, true, false);
        this.f26767k = new u5(this, 5, false, true);
        this.f26768l = new u5(this, 4, false, false);
        this.f26769m = new u5(this, 3, false, false);
        this.f26770n = new u5(this, 2, false, false);
    }

    public static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String B = B(z10, obj);
        String B2 = B(z10, obj2);
        String B3 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb2.append(str2);
            sb2.append(B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(B2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(B2);
        }
        if (!TextUtils.isEmpty(B3)) {
            sb2.append(str3);
            sb2.append(B3);
        }
        return sb2.toString();
    }

    public static String B(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof v5 ? ((v5) obj).a() : z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String C = C(g7.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb3.toString();
    }

    public static String C(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, lastIndexOf);
    }

    public static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new v5(str);
    }

    public final /* synthetic */ char D() {
        return this.f26759c;
    }

    public final /* synthetic */ void E(char c10) {
        this.f26759c = c10;
    }

    public final /* synthetic */ long F() {
        return this.f26760d;
    }

    public final /* synthetic */ void G(long j10) {
        this.f26760d = 133005L;
    }

    @Override // nb.k8
    public final boolean i() {
        return false;
    }

    public final u5 o() {
        return this.f26762f;
    }

    public final u5 p() {
        return this.f26763g;
    }

    public final u5 q() {
        return this.f26764h;
    }

    public final u5 r() {
        return this.f26765i;
    }

    public final u5 s() {
        return this.f26766j;
    }

    public final u5 t() {
        return this.f26767k;
    }

    public final u5 u() {
        return this.f26768l;
    }

    public final u5 v() {
        return this.f26769m;
    }

    public final u5 w() {
        return this.f26770n;
    }

    public final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        n9.m.l(str);
        c7 A = this.f26328a.A();
        if (A == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!A.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            A.t(new t5(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f26761e == null) {
                    this.f26761e = this.f26328a.w().u();
                }
                n9.m.l(this.f26761e);
                str = this.f26761e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
