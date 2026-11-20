package n9;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import k9.i;
import n9.l;

/* loaded from: classes.dex */
public final class g0 implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k9.i f25971a;
    public final /* synthetic */ sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l.a f25972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f25973d;

    public g0(k9.i iVar, sb.k kVar, l.a aVar, i0 i0Var) {
        this.f25971a = iVar;
        this.b = kVar;
        this.f25972c = aVar;
        this.f25973d = i0Var;
    }

    @Override // k9.i.a
    public final void a(Status status) {
        if (!status.A3()) {
            this.b.b(a.a(status));
        } else {
            this.b.c(this.f25972c.a(this.f25971a.d(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
