package s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class s extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f30982a;
    public final /* synthetic */ sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r9.a f30983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f30984d;

    public s(u uVar, AtomicReference atomicReference, sb.k kVar, r9.a aVar) {
        this.f30984d = uVar;
        this.f30982a = atomicReference;
        this.b = kVar;
        this.f30983c = aVar;
    }

    @Override // s9.a, s9.g
    public final void s1(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f30982a.set(moduleInstallResponse);
        }
        l9.v.c(status, null, this.b);
        if (!status.A3() || (moduleInstallResponse != null && moduleInstallResponse.w3())) {
            this.f30984d.B(l9.l.c(this.f30983c, r9.a.class.getSimpleName()), 27306);
        }
    }
}
