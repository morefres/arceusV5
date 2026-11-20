package pd;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import ib.p;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j extends ib.e {
    public final /* synthetic */ sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f28572c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f28573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, sb.k kVar, sb.k kVar2, d dVar) {
        super(kVar);
        this.b = kVar2;
        this.f28572c = dVar;
        Objects.requireNonNull(lVar);
        this.f28573d = lVar;
    }

    @Override // ib.e
    public final void a(Exception exc) {
        if (exc instanceof p) {
            super.a(new a(-5));
        } else {
            super.a(exc);
        }
    }

    @Override // ib.e
    public final void b() {
        ib.d dVar;
        Context context;
        try {
            l lVar = this.f28573d;
            qd.a aVar = (qd.a) lVar.b.e();
            context = lVar.f28577a;
            String packageName = context.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 3);
            aVar.y1(packageName, bundle, new k(lVar, this.b));
        } catch (RemoteException e10) {
            d dVar2 = this.f28572c;
            dVar = l.f28576c;
            dVar.b(e10, "checkAgeSignals(%s)", dVar2);
            this.b.d(new a(-100));
        }
    }
}
