package l9;

import com.google.android.gms.common.Feature;
import k9.a;
import l9.p;

/* loaded from: classes.dex */
public final class y0 extends o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p.a f23398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p.a aVar, k kVar, Feature[] featureArr, boolean z10, int i10) {
        super(kVar, featureArr, z10, i10);
        this.f23398e = aVar;
    }

    @Override // l9.o
    public final void d(a.b bVar, sb.k<Void> kVar) {
        q qVar;
        qVar = this.f23398e.f23358a;
        qVar.accept(bVar, kVar);
    }
}
