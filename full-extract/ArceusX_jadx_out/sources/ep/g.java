package ep;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;

/* loaded from: classes3.dex */
public final class g implements dt.d<FallbackModeService> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16149a;
    public final dt.i<iv.y> b;

    public g(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16149a = fVar;
        this.b = iVar;
    }

    public static g a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new g(fVar, iVar);
    }

    public static FallbackModeService b(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (FallbackModeService) dt.h.e(fVar.b(yVar));
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackModeService get() {
        return b(this.f16149a, this.b.get());
    }
}
