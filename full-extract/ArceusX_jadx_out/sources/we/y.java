package we;

import java.util.concurrent.atomic.AtomicReference;
import we.s;

/* loaded from: classes2.dex */
public final class y {
    public static final y b = new y();

    /* renamed from: c, reason: collision with root package name */
    public static final b f34302c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<s> f34303a = new AtomicReference<>();

    public static class b implements s {
        public b() {
        }

        @Override // we.s
        public s.a a(t tVar, String str, String str2) {
            return u.f34297a;
        }
    }

    public static y b() {
        return b;
    }

    public s a() {
        s sVar = this.f34303a.get();
        return sVar == null ? f34302c : sVar;
    }
}
