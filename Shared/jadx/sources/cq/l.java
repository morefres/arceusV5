package cq;

import android.view.l0;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import dq.k2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<k2.d> f14154a;

    public l(dt.i<k2.d> iVar) {
        this.f14154a = iVar;
    }

    public static l a(dt.i<k2.d> iVar) {
        return new l(iVar);
    }

    public static com.withpersona.sdk2.inquiry.selfie.selfieStep.b c(l0 l0Var, SelfieWorkflow.Input input, k2.d dVar) {
        return new com.withpersona.sdk2.inquiry.selfie.selfieStep.b(l0Var, input, dVar);
    }

    public com.withpersona.sdk2.inquiry.selfie.selfieStep.b b(l0 l0Var, SelfieWorkflow.Input input) {
        return c(l0Var, input, this.f14154a.get());
    }
}
