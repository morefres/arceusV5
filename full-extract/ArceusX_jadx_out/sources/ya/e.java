package ya;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.tasks.Task;
import k9.a;
import k9.e;

/* loaded from: classes.dex */
public final class e extends k9.e implements z8.a {

    /* renamed from: l, reason: collision with root package name */
    public static final a.g f36549l;

    /* renamed from: m, reason: collision with root package name */
    public static final a.AbstractC0393a f36550m;

    /* renamed from: n, reason: collision with root package name */
    public static final k9.a f36551n;

    /* renamed from: k, reason: collision with root package name */
    public final String f36552k;

    static {
        a.g gVar = new a.g();
        f36549l = gVar;
        c cVar = new c();
        f36550m = cVar;
        f36551n = new k9.a("Auth.Api.Identity.CredentialSaving.API", cVar, gVar);
    }

    public e(@NonNull Context context, @NonNull z8.e eVar) {
        super(context, (k9.a<z8.e>) f36551n, eVar, e.a.f22460c);
        this.f36552k = r.a();
    }

    @Override // z8.a
    public final Task<SavePasswordResult> m(@NonNull SavePasswordRequest savePasswordRequest) {
        n9.m.l(savePasswordRequest);
        SavePasswordRequest.a x32 = SavePasswordRequest.x3(savePasswordRequest);
        x32.c(this.f36552k);
        final SavePasswordRequest a10 = x32.a();
        return z(l9.u.c().d(q.f36569e).b(new l9.q() { // from class: ya.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((a0) ((x) obj).getService()).t2(new d(e.this, (sb.k) obj2), (SavePasswordRequest) n9.m.l(a10));
            }
        }).c(false).e(1536).a());
    }
}
