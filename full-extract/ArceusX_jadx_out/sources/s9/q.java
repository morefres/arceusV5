package s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

/* loaded from: classes.dex */
public final class q extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f30980a;

    public q(u uVar, sb.k kVar) {
        this.f30980a = kVar;
    }

    @Override // s9.a, s9.g
    public final void v1(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        l9.v.c(status, moduleAvailabilityResponse, this.f30980a);
    }
}
