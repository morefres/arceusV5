package ae;

import android.os.RemoteException;
import be.j1;
import be.q1;
import be.r1;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class s extends r1 {
    public final /* synthetic */ Collection b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.k f460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, sb.k kVar, Collection collection, Collection collection2, j1 j1Var, sb.k kVar2) {
        super(kVar);
        this.f461f = a0Var;
        this.b = collection;
        this.f458c = collection2;
        this.f459d = j1Var;
        this.f460e = kVar2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.IInterface, be.k0] */
    @Override // be.r1
    public final void c() {
        q1 q1Var;
        String str;
        ArrayList i10 = a0.i(this.b);
        i10.addAll(a0.h(this.f458c));
        try {
            this.f459d.b(2);
            ?? e10 = this.f461f.b.e();
            str = this.f461f.f405a;
            e10.E0(str, i10, a0.b(this.f459d), new y(this.f461f, this.f460e));
        } catch (RemoteException e11) {
            q1Var = a0.f403c;
            q1Var.c(e11, "startInstall(%s,%s)", this.b, this.f458c);
            this.f460e.d(new RuntimeException(e11));
        }
    }
}
