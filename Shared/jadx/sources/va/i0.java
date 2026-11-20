package va;

import com.google.android.gms.common.api.Status;
import l9.g;

/* loaded from: classes.dex */
public final class i0 extends g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f33366a;
    public final /* synthetic */ k0 b;

    public i0(k0 k0Var, sb.k kVar) {
        this.b = k0Var;
        this.f33366a = kVar;
    }

    @Override // l9.g
    public final void Z0(Status status) {
        sb.k kVar;
        sb.k kVar2;
        if (this.f33366a.e(null)) {
            if (status.A3()) {
                kVar2 = this.b.f33371d.b;
                kVar2.c(null);
            } else {
                kVar = this.b.f33371d.b;
                kVar.b(d.a(status, "Indexing error, please try again."));
            }
        }
    }
}
