package xo;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> f35904a;

    public p0(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f35904a = iVar;
    }

    public static p0 a(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new p0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.v c(String str, String str2, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.v(str, str2, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.v b(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, inquirySessionConfig, this.f35904a.get());
    }
}
