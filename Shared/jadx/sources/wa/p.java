package wa;

import android.content.Context;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import k9.a;
import k9.e;
import l9.u;

/* loaded from: classes.dex */
public final class p extends k9.e<a.d.c> implements x8.b {

    /* renamed from: m, reason: collision with root package name */
    public static final a.g<d> f34181m;

    /* renamed from: n, reason: collision with root package name */
    public static final a.AbstractC0393a<d, a.d.c> f34182n;

    /* renamed from: o, reason: collision with root package name */
    public static final k9.a<a.d.c> f34183o;

    /* renamed from: k, reason: collision with root package name */
    public final Context f34184k;

    /* renamed from: l, reason: collision with root package name */
    public final j9.d f34185l;

    static {
        a.g<d> gVar = new a.g<>();
        f34181m = gVar;
        n nVar = new n();
        f34182n = nVar;
        f34183o = new k9.a<>("AppSet.API", nVar, gVar);
    }

    public p(Context context, j9.d dVar) {
        super(context, f34183o, a.d.Ko, e.a.f22460c);
        this.f34184k = context;
        this.f34185l = dVar;
    }

    @Override // x8.b
    public final Task<x8.c> j() {
        return this.f34185l.h(this.f34184k, 212800000) == 0 ? z(u.c().d(x8.f.f35491a).b(new l9.q() { // from class: wa.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).getService()).t2(new zza(null, null), new o(p.this, (sb.k) obj2));
            }
        }).c(false).e(27601).a()) : sb.m.e(new k9.b(new Status(17)));
    }
}
