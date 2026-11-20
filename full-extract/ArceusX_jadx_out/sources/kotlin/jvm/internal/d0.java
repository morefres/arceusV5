package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes2.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f22965a;
    public static final gu.c[] b;

    static {
        e0 e0Var = null;
        try {
            e0Var = (e0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e0Var == null) {
            e0Var = new e0();
        }
        f22965a = e0Var;
        b = new gu.c[0];
    }

    public static gu.g a(j jVar) {
        return f22965a.a(jVar);
    }

    public static gu.c b(Class cls) {
        return f22965a.b(cls);
    }

    public static gu.f c(Class cls) {
        return f22965a.c(cls, "");
    }

    public static gu.h d(n nVar) {
        return f22965a.d(nVar);
    }

    public static gu.m e(Class cls) {
        return f22965a.j(b(cls), Collections.EMPTY_LIST, true);
    }

    public static gu.i f(r rVar) {
        return f22965a.e(rVar);
    }

    public static gu.j g(t tVar) {
        return f22965a.f(tVar);
    }

    public static gu.k h(v vVar) {
        return f22965a.g(vVar);
    }

    public static String i(i iVar) {
        return f22965a.h(iVar);
    }

    public static String j(m mVar) {
        return f22965a.i(mVar);
    }

    public static gu.m k(Class cls) {
        return f22965a.j(b(cls), Collections.EMPTY_LIST, false);
    }

    public static gu.m l(Class cls, KTypeProjection kTypeProjection) {
        return f22965a.j(b(cls), Collections.singletonList(kTypeProjection), false);
    }
}
