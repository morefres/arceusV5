package xo;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<ep.w> f35802a;
    public final dt.i<wn.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<up.c> f35803c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<bp.i> f35804d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<ir.a> f35805e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f35806f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> f35807g;

    public c0(dt.i<ep.w> iVar, dt.i<wn.a> iVar2, dt.i<up.c> iVar3, dt.i<bp.i> iVar4, dt.i<ir.a> iVar5, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar6, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        this.f35802a = iVar;
        this.b = iVar2;
        this.f35803c = iVar3;
        this.f35804d = iVar4;
        this.f35805e = iVar5;
        this.f35806f = iVar6;
        this.f35807g = iVar7;
    }

    public static c0 a(dt.i<ep.w> iVar, dt.i<wn.a> iVar2, dt.i<up.c> iVar3, dt.i<bp.i> iVar4, dt.i<ir.a> iVar5, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar6, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        return new c0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static com.withpersona.sdk2.inquiry.internal.k c(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10, ep.w wVar, wn.a aVar, up.c cVar, bp.i iVar, ir.a aVar2, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar3, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.k(str, str2, str3, a0Var, inquirySessionConfig, z10, wVar, aVar, cVar, iVar, aVar2, aVar3, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.k b(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return c(str, str2, str3, a0Var, inquirySessionConfig, z10, this.f35802a.get(), this.b.get(), this.f35803c.get(), this.f35804d.get(), this.f35805e.get(), this.f35806f.get(), this.f35807g.get());
    }
}
