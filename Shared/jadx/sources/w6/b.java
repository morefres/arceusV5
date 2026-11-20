package w6;

import ju.p;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", ve.a.f33391e, "(Lokhttp3/Call;Lmt/b;)Ljava/lang/Object;", "coil-network-okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    @Nullable
    public static final Object a(@NotNull Call call, @NotNull mt.b<? super Response> bVar) {
        p pVar = new p(nt.b.c(bVar), 1);
        pVar.F();
        c cVar = new c(call, pVar);
        call.enqueue(cVar);
        pVar.k(cVar);
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            h.c(bVar);
        }
        return z10;
    }
}
