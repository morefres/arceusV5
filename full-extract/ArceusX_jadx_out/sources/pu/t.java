package pu;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import ju.n2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpu/t;", "", "<init>", "()V", "Lju/n2;", ve.a.f33391e, "()Lju/n2;", j6.b.f21518e, "Lju/n2;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f29213a;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final n2 dispatcher;

    static {
        t tVar = new t();
        f29213a = tVar;
        f0.f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = tVar.a();
    }

    public final n2 a() {
        Object next;
        n2 e10;
        try {
            List z10 = hu.p.z(hu.m.e(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator it = z10.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c10 = ((s) next).c();
                    do {
                        Object next2 = it.next();
                        int c11 = ((s) next2).c();
                        if (c10 < c11) {
                            next = next2;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            if (sVar != null && (e10 = u.e(sVar, z10)) != null) {
                return e10;
            }
            return u.b(null, null, 3, null);
        } catch (Throwable th2) {
            return u.b(th2, null, 2, null);
        }
    }
}
