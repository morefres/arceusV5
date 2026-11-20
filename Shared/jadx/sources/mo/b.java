package mo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import dn.x;
import dt.i;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f24664a;
    public final i<x> b;

    public b(i<Context> iVar, i<x> iVar2) {
        this.f24664a = iVar;
        this.b = iVar2;
    }

    public static b a(i<Context> iVar, i<x> iVar2) {
        return new b(iVar, iVar2);
    }

    public static GovernmentIdHintWorker c(Context context, x xVar, IdConfig.b bVar) {
        return new GovernmentIdHintWorker(context, xVar, bVar);
    }

    public GovernmentIdHintWorker b(IdConfig.b bVar) {
        return c(this.f24664a.get(), this.b.get(), bVar);
    }
}
