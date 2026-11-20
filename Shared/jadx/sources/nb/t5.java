package nb;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26676a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w5 f26680f;

    public t5(w5 w5Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f26676a = i10;
        this.b = str;
        this.f26677c = obj;
        this.f26678d = obj2;
        this.f26679e = obj3;
        Objects.requireNonNull(w5Var);
        this.f26680f = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5 w5Var = this.f26680f;
        k6 x10 = w5Var.f26328a.x();
        if (!x10.k()) {
            Log.println(6, w5Var.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (w5Var.D() == 0) {
            g7 g7Var = w5Var.f26328a;
            if (g7Var.w().B()) {
                g7Var.c();
                w5Var.E('C');
            } else {
                g7Var.c();
                w5Var.E('c');
            }
        }
        if (w5Var.F() < 0) {
            w5Var.f26328a.w().A();
            w5Var.G(133005L);
        }
        int i10 = this.f26676a;
        char D = w5Var.D();
        long F = w5Var.F();
        String str = this.b;
        Object obj = this.f26677c;
        Object obj2 = this.f26678d;
        Object obj3 = this.f26679e;
        char charAt = "01VDIWEA?".charAt(i10);
        String A = w5.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(charAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(D).length() + String.valueOf(F).length() + 1 + A.length());
        sb2.append("2");
        sb2.append(charAt);
        sb2.append(D);
        sb2.append(F);
        sb2.append(":");
        sb2.append(A);
        String sb3 = sb2.toString();
        if (sb3.length() > 1024) {
            sb3 = str.substring(0, 1024);
        }
        i6 i6Var = x10.f26373e;
        if (i6Var != null) {
            i6Var.a(sb3, 1L);
        }
    }
}
