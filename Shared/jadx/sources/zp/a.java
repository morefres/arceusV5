package zp;

import android.view.l0;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import dt.d;
import dt.i;
import ju.p0;

/* loaded from: classes3.dex */
public final class a implements d<DirectFileUploader> {

    /* renamed from: a, reason: collision with root package name */
    public final i<l0> f38151a;
    public final i<UploadService> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<p0> f38152c;

    public a(i<l0> iVar, i<UploadService> iVar2, i<p0> iVar3) {
        this.f38151a = iVar;
        this.b = iVar2;
        this.f38152c = iVar3;
    }

    public static a a(i<l0> iVar, i<UploadService> iVar2, i<p0> iVar3) {
        return new a(iVar, iVar2, iVar3);
    }

    public static DirectFileUploader c(l0 l0Var, UploadService uploadService, p0 p0Var) {
        return new DirectFileUploader(l0Var, uploadService, p0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DirectFileUploader get() {
        return c(this.f38151a.get(), this.b.get(), this.f38152c.get());
    }
}
