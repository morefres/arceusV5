package sp;

import android.content.Context;
import android.view.l0;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.a;
import com.withpersona.sdk2.inquiry.permissions.d;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ju.p0;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f31627a;
    public final dt.i<d.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<a.InterfaceC0230a> f31628c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f31629d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<p0> f31630e;

    public l(dt.i<Context> iVar, dt.i<d.a> iVar2, dt.i<a.InterfaceC0230a> iVar3, dt.i<TrackingEventsLogger> iVar4, dt.i<p0> iVar5) {
        this.f31627a = iVar;
        this.b = iVar2;
        this.f31628c = iVar3;
        this.f31629d = iVar4;
        this.f31630e = iVar5;
    }

    public static l a(dt.i<Context> iVar, dt.i<d.a> iVar2, dt.i<a.InterfaceC0230a> iVar3, dt.i<TrackingEventsLogger> iVar4, dt.i<p0> iVar5) {
        return new l(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static PermissionRequestStateManager c(PermissionRequestWorkflow.Props props, l0 l0Var, Context context, d.a aVar, a.InterfaceC0230a interfaceC0230a, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new PermissionRequestStateManager(props, l0Var, context, aVar, interfaceC0230a, trackingEventsLogger, p0Var);
    }

    public PermissionRequestStateManager b(PermissionRequestWorkflow.Props props, l0 l0Var) {
        return c(props, l0Var, this.f31627a.get(), this.b.get(), this.f31628c.get(), this.f31629d.get(), this.f31630e.get());
    }
}
