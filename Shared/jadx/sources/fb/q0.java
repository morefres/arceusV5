package fb;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import k9.a;

/* loaded from: classes.dex */
public class q0 extends a.AbstractC0393a {
    public /* synthetic */ q0(byte[] bArr) {
    }

    @Override // k9.a.AbstractC0393a
    public final /* bridge */ /* synthetic */ a.f b(Context context, Looper looper, n9.d dVar, Object obj, l9.e eVar, l9.n nVar) {
        da.o oVar = (da.o) obj;
        if (oVar == null) {
            oVar = da.o.a().d();
        }
        da.o oVar2 = oVar;
        ga.c cVar = new ga.c(context, looper, dVar, oVar2, eVar, nVar, ga.j.a());
        if (oVar2.f14483o.a()) {
            AtomicReference atomicReference = ga.o.f18418g;
            cVar.l(ga.o.a((Application) context.getApplicationContext()));
        }
        return cVar;
    }
}
