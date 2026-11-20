package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.view.l0;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b;
import dt.i;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i<b.c> f11123a;

    public e(i<b.c> iVar) {
        this.f11123a = iVar;
    }

    public static e a(i<b.c> iVar) {
        return new e(iVar);
    }

    public static d c(l0 l0Var, GovernmentIdWorkflow.Input input, b.c cVar) {
        return new d(l0Var, input, cVar);
    }

    public d b(l0 l0Var, GovernmentIdWorkflow.Input input) {
        return c(l0Var, input, this.f11123a.get());
    }
}
