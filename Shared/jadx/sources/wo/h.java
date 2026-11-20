package wo;

import android.content.Context;
import android.view.l0;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.a;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.i;
import ju.p0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f34482a;
    public final i<sq.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<a.InterfaceC0209a> f34483c;

    /* renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f34484d;

    /* renamed from: e, reason: collision with root package name */
    public final i<p0> f34485e;

    public h(i<Context> iVar, i<sq.a> iVar2, i<a.InterfaceC0209a> iVar3, i<TrackingEventsLogger> iVar4, i<p0> iVar5) {
        this.f34482a = iVar;
        this.b = iVar2;
        this.f34483c = iVar3;
        this.f34484d = iVar4;
        this.f34485e = iVar5;
    }

    public static h a(i<Context> iVar, i<sq.a> iVar2, i<a.InterfaceC0209a> iVar3, i<TrackingEventsLogger> iVar4, i<p0> iVar5) {
        return new h(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static com.withpersona.sdk2.inquiry.integration.fragment.b c(IntegrationWorkflow.Input input, l0 l0Var, Context context, sq.a aVar, a.InterfaceC0209a interfaceC0209a, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new com.withpersona.sdk2.inquiry.integration.fragment.b(input, l0Var, context, aVar, interfaceC0209a, trackingEventsLogger, p0Var);
    }

    public com.withpersona.sdk2.inquiry.integration.fragment.b b(IntegrationWorkflow.Input input, l0 l0Var) {
        return c(input, l0Var, this.f34482a.get(), this.b.get(), this.f34483c.get(), this.f34484d.get(), this.f34485e.get());
    }
}
