package ep;

import com.withpersona.sdk2.inquiry.network.upload.UploadService;

/* loaded from: classes3.dex */
public final class t implements dt.d<UploadService> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16162a;
    public final dt.i<iv.y> b;

    public t(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16162a = fVar;
        this.b = iVar;
    }

    public static t a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new t(fVar, iVar);
    }

    public static UploadService c(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (UploadService) dt.h.e(fVar.o(yVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public UploadService get() {
        return c(this.f16162a, this.b.get());
    }
}
