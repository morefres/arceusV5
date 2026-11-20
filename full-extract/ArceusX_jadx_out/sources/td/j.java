package td;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes2.dex */
public final class j extends ee.u0 {
    public final /* synthetic */ byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f32108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f32109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.k f32110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f32111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f32112g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, sb.k kVar, byte[] bArr, Long l10, Parcelable parcelable, sb.k kVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(kVar);
        this.b = bArr;
        this.f32108c = l10;
        this.f32109d = parcelable;
        this.f32110e = kVar2;
        this.f32111f = integrityTokenRequest;
        this.f32112g = mVar;
    }

    @Override // ee.u0
    public final void a(Exception exc) {
        if (exc instanceof ee.g) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // ee.u0
    public final void b() {
        ee.t0 t0Var;
        try {
            ((ee.q0) this.f32112g.f32131f.e()).F1(m.a(this.f32112g, this.b, this.f32108c, this.f32109d), new l(this.f32112g, this.f32110e));
        } catch (RemoteException e10) {
            m mVar = this.f32112g;
            IntegrityTokenRequest integrityTokenRequest = this.f32111f;
            t0Var = mVar.f32127a;
            t0Var.b(e10, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f32110e.d(new a(-100, e10));
        }
    }
}
