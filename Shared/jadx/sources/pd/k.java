package pd;

import android.os.Bundle;
import java.util.Objects;
import qd.b;

/* loaded from: classes2.dex */
public final class k extends b.a {

    /* renamed from: a, reason: collision with root package name */
    public final ib.d f28574a;
    public final sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f28575c;

    public k(l lVar, sb.k kVar) {
        Objects.requireNonNull(lVar);
        this.f28575c = lVar;
        this.f28574a = new ib.d("OnCheckAgeSignalsCallback");
        this.b = kVar;
    }

    @Override // qd.b
    public final void C0(Bundle bundle) {
        ib.o oVar = this.f28575c.b;
        sb.k kVar = this.b;
        oVar.u(kVar);
        int i10 = bundle.getInt("error.code");
        this.f28574a.a("onError(%d)", Integer.valueOf(i10));
        kVar.d(new a(i10));
    }

    @Override // qd.b
    public final void O(Bundle bundle) {
        ib.o oVar = this.f28575c.b;
        sb.k kVar = this.b;
        oVar.u(kVar);
        this.f28574a.c("onCompleteCheckAgeSignals", new Object[0]);
        kVar.e(e.g(bundle));
    }
}
