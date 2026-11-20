package ct;

import android.util.Log;
import androidx.fragment.app.c;
import bt.d;
import dt.h;
import e4.q;

/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static d a(c cVar) {
        c cVar2 = cVar;
        do {
            cVar2 = cVar2.J();
            if (cVar2 == 0) {
                q p8 = cVar.p();
                if (p8 instanceof d) {
                    return (d) p8;
                }
                if (p8.getApplication() instanceof d) {
                    return (d) p8.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", cVar.getClass().getCanonicalName()));
            }
        } while (!(cVar2 instanceof d));
        return (d) cVar2;
    }

    public static void b(c cVar) {
        h.c(cVar, "fragment");
        d a10 = a(cVar);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", cVar.getClass().getCanonicalName(), a10.getClass().getCanonicalName()));
        }
        c(cVar, a10);
    }

    public static void c(Object obj, d dVar) {
        bt.a<Object> c10 = dVar.c();
        h.d(c10, "%s.androidInjector() returned null", dVar.getClass());
        c10.a(obj);
    }
}
