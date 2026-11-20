package we;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import we.j0;
import we.s;
import we.t;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final s.a f34297a = new b(null);

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34298a;

        static {
            int[] iArr = new int[af.g0.values().length];
            f34298a = iArr;
            try {
                iArr[af.g0.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34298a[af.g0.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34298a[af.g0.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b implements s.a {
        public b() {
        }

        @Override // we.s.a
        public void a(int i10, long j10) {
        }

        @Override // we.s.a
        public void b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static <P> t a(j0<P> j0Var) {
        t.b a10 = t.a();
        a10.d(j0Var.c());
        Iterator<List<j0.c<P>>> it = j0Var.b().iterator();
        while (it.hasNext()) {
            for (j0.c<P> cVar : it.next()) {
                a10.a(c(cVar.g()), cVar.c(), b(cVar.d()), cVar.f().name());
            }
        }
        if (j0Var.d() != null) {
            a10.e(j0Var.d().c());
        }
        try {
            return a10.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    public static pe.n c(af.g0 g0Var) {
        int i10 = a.f34298a[g0Var.ordinal()];
        if (i10 == 1) {
            return pe.n.b;
        }
        if (i10 == 2) {
            return pe.n.f28596c;
        }
        if (i10 == 3) {
            return pe.n.f28597d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
