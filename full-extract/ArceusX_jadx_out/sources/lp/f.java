package lp;

import dt.i;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i<b> f23817a;

    public f(i<b> iVar) {
        this.f23817a = iVar;
    }

    public static f a(i<b> iVar) {
        return new f(iVar);
    }

    public static e c(b bVar, String str) {
        return new e(bVar, str);
    }

    public e b(String str) {
        return c(this.f23817a.get(), str);
    }
}
