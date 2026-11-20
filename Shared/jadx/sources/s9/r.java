package s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* loaded from: classes.dex */
public final class r extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f30981a;

    public r(u uVar, sb.k kVar) {
        this.f30981a = kVar;
    }

    @Override // s9.a, s9.g
    public final void s1(Status status, ModuleInstallResponse moduleInstallResponse) {
        l9.v.c(status, moduleInstallResponse, this.f30981a);
    }
}
