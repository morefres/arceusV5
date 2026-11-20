package ae;

import android.os.Bundle;
import android.os.RemoteException;
import be.q1;
import be.r1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class t extends r1 {
    public final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.k f462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, sb.k kVar, List list, sb.k kVar2) {
        super(kVar);
        this.f463d = a0Var;
        this.b = list;
        this.f462c = kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, be.k0] */
    @Override // be.r1
    public final void c() {
        q1 q1Var;
        String str;
        Bundle j10;
        try {
            ?? e10 = this.f463d.b.e();
            str = this.f463d.f405a;
            ArrayList i10 = a0.i(this.b);
            j10 = a0.j();
            e10.n0(str, i10, j10, new w(this.f463d, this.f462c));
        } catch (RemoteException e11) {
            q1Var = a0.f403c;
            q1Var.c(e11, "deferredUninstall(%s)", this.b);
            this.f462c.d(new RuntimeException(e11));
        }
    }
}
