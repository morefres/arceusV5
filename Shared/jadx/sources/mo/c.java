package mo;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import dt.e;
import dt.i;
import mo.GovernmentIdHintWorker;

/* loaded from: classes3.dex */
public final class c implements GovernmentIdHintWorker.b {

    /* renamed from: a, reason: collision with root package name */
    public final b f24665a;

    public c(b bVar) {
        this.f24665a = bVar;
    }

    public static i<GovernmentIdHintWorker.b> b(b bVar) {
        return e.a(new c(bVar));
    }

    @Override // mo.GovernmentIdHintWorker.b
    public GovernmentIdHintWorker a(IdConfig.b bVar) {
        return this.f24665a.b(bVar);
    }
}
