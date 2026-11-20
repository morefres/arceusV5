package pe;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<t> f28616a = new CopyOnWriteArrayList<>();

    public static t a(String str) {
        Iterator<t> it = f28616a.iterator();
        while (it.hasNext()) {
            t next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
