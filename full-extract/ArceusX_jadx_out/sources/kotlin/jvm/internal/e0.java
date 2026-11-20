package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes2.dex */
public class e0 {
    public gu.g a(j jVar) {
        return jVar;
    }

    public gu.c b(Class cls) {
        return new f(cls);
    }

    public gu.f c(Class cls, String str) {
        return new q(cls, str);
    }

    public gu.h d(n nVar) {
        return nVar;
    }

    public gu.i e(r rVar) {
        return rVar;
    }

    public gu.j f(t tVar) {
        return tVar;
    }

    public gu.k g(v vVar) {
        return vVar;
    }

    public String h(i iVar) {
        String obj = iVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String i(m mVar) {
        return h(mVar);
    }

    public gu.m j(gu.e eVar, List<KTypeProjection> list, boolean z10) {
        return new j0(eVar, list, z10);
    }
}
