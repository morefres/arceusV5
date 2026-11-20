package nb;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final n8 f26850a;

    public z2(n8 n8Var) {
        this.f26850a = n8Var;
    }

    public static z2 c(String str) {
        return new z2((TextUtils.isEmpty(str) || str.length() > 1) ? n8.UNINITIALIZED : q8.j(str.charAt(0)));
    }

    public final n8 a() {
        return this.f26850a;
    }

    public final String b() {
        return String.valueOf(q8.m(this.f26850a));
    }
}
