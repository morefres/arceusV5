package rp;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.g;
import dt.i;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i<g> f30736a;

    public d(i<g> iVar) {
        this.f30736a = iVar;
    }

    public static d a(i<g> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.permissions.permissionRequest.e c(g gVar, PermissionRequestWorkflow.Props props) {
        return new com.withpersona.sdk2.inquiry.permissions.permissionRequest.e(gVar, props);
    }

    public com.withpersona.sdk2.inquiry.permissions.permissionRequest.e b(PermissionRequestWorkflow.Props props) {
        return c(this.f30736a.get(), props);
    }
}
