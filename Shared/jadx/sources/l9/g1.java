package l9;

import com.google.android.gms.common.Feature;
import k9.a;
import l9.u;

/* loaded from: classes.dex */
public final class g1 extends u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u.a f23320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u.a aVar, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f23320d = aVar;
    }

    @Override // l9.u
    public final void d(a.b bVar, sb.k kVar) {
        q qVar;
        qVar = this.f23320d.f23382a;
        qVar.accept(bVar, kVar);
    }
}
