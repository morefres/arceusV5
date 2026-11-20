package qr;

import android.view.l0;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import dt.i;
import pr.g1;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i<g1.e> f30012a;

    public d(i<g1.e> iVar) {
        this.f30012a = iVar;
    }

    public static d a(i<g1.e> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.ui.uiStep.b c(l0 l0Var, UiWorkflow.Input input, g1.e eVar) {
        return new com.withpersona.sdk2.inquiry.ui.uiStep.b(l0Var, input, eVar);
    }

    public com.withpersona.sdk2.inquiry.ui.uiStep.b b(l0 l0Var, UiWorkflow.Input input) {
        return c(l0Var, input, this.f30012a.get());
    }
}
