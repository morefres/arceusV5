package rp;

import android.view.l0;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import dt.i;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i<PermissionRequestStateManager.c> f30735a;

    public c(i<PermissionRequestStateManager.c> iVar) {
        this.f30735a = iVar;
    }

    public static c a(i<PermissionRequestStateManager.c> iVar) {
        return new c(iVar);
    }

    public static com.withpersona.sdk2.inquiry.permissions.permissionRequest.c c(l0 l0Var, PermissionRequestStateManager.c cVar) {
        return new com.withpersona.sdk2.inquiry.permissions.permissionRequest.c(l0Var, cVar);
    }

    public com.withpersona.sdk2.inquiry.permissions.permissionRequest.c b(l0 l0Var) {
        return c(l0Var, this.f30735a.get());
    }
}
