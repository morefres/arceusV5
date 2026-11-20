package fb;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f17121a = new AtomicReference();

    public static m a(Application application) {
        AtomicReference atomicReference = f17121a;
        m mVar = (m) atomicReference.get();
        if (mVar != null) {
            return mVar;
        }
        k1 a10 = p1.a();
        a10.a(9);
        a10.b(application.getPackageName());
        p1 c10 = a10.c();
        ga.o a11 = ga.o.a(application);
        p1.t.a(atomicReference, null, new b0(application, a11, com.google.android.gms.games.internal.v2.resolution.a.a(), new f0(application, a11, new n(application, c10))));
        return (m) n9.m.l((m) atomicReference.get());
    }
}
